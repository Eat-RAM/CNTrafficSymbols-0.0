package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import com.mojang.serialization.MapCodec;
import io.github.eat_ram.cntrafficsymbols.core.block.FluidloggedConfigurable;
import io.github.eat_ram.cntrafficsymbols.core.struct.TrafficAttach7;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .CountdownTimerBlockEntity;
import io.github.eat_ram.cntrafficsymbols.core.network
       .OpenTrafficLightConfigPayload;
import io.github.eat_ram.cntrafficsymbols.core.traffic.TrafficLightGroup;
import io.github.eat_ram.cntrafficsymbols.core.traffic
       .TrafficLightGroupManager;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static io.github.eat_ram.cntrafficsymbols.core.block
              .BaseTrafficLightBlock.TRAFFIC_LIGHT_CONNECTORS;
import static net.minecraft.state.property.Properties.HORIZONTAL_FACING;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;

public class CountdownTimerBlock extends HorizontalFacingBlock
implements FluidloggedConfigurable, BlockEntityProvider {
    public static final MapCodec<CountdownTimerBlock> CODEC =
    createCodec(CountdownTimerBlock::new);
    @Contract("-> new")
    private static @NotNull VoxelShape @NotNull[] createShapes() {
        VoxelShape[] shapes = new VoxelShape[28];
        for (Direction f : Direction.Type.HORIZONTAL) {
            int fIdx = f.getHorizontal() * 7;
            for (TrafficAttach7 a : TrafficAttach7.values()) {
                double x1;
                double x2;
                double y1;
                double y2;
                double z1;
                double z2;
                switch (a) {
                    case UP:
                        x1 = 0.15625; x2 = 0.84375;
                        y1 = 0.375;   y2 = 1.;
                        z1 = 0.;      z2 = 0.25;   break;
                    case DOWN:
                        x1 = 0.15625; x2 = 0.84375;
                        y1 = 0.;      y2 = 0.625;
                        z1 = 0.;      z2 = 0.25;   break;
                    case CEILING:
                        x1 = 0.15625; x2 = 0.84375;
                        y1 = 0.375;   y2 = 1.;
                        z1 = 0.5;     z2 = 0.75;   break;
                    case LEFT:
                        x1 = 0.;      x2 = 0.6875;
                        y1 = 0.1875;  y2 = 0.8125;
                        z1 = 0.;      z2 = 0.25;   break;
                    case RIGHT:
                        x1 = 0.3125;  x2 = 1.;
                        y1 = 0.1875;  y2 = 0.8125;
                        z1 = 0.;      z2 = 0.25;   break;
                    case CENTER:
                        x1 = 0.15625; x2 = 0.84375;
                        y1 = 0.1875;  y2 = 0.8125;
                        z1 = 0.375;   z2 = 0.625;  break;
                    default: // MIDDLE
                        x1 = 0.15625; x2 = 0.84375;
                        y1 = 0.1875;  y2 = 0.8125;
                        z1 = 0.;      z2 = 0.25;
                }
                double zMid = z1 + 0.125;
                shapes[fIdx + a.id] = union(
                    createRotatedShape(x1, y1, z1, x2, y2, zMid, f),
                    createRotatedShape(x1, y2 - 0.015625, zMid, x2, y2, z2, f),
                    createRotatedShape(
                        x1, y1, zMid, x1 + 0.015625, y2 - 0.015625, z2, f
                    ),
                    createRotatedShape(
                        x2 - 0.015625, y1, zMid, x2, y2 - 0.015625, z2, f
                    )
                );
            }
        }
        return shapes;
    }

    static @NotNull VoxelShape createRotatedShape(
        double x1, double y1, double z1, double x2, double y2, double z2,
        @NotNull Direction facing
    ) {
        return switch (facing) {
            case WEST  -> cuboid(1. - z2, y1, x1, 1. - z1, y2, x2);
            case NORTH -> cuboid(1. - x2, y1, 1. - z2, 1. - x1, y2, 1. - z1);
            case EAST  -> cuboid(z1, y1, 1. - x2, z2, y2, 1. - x1);
            default    -> cuboid(x1, y1, z1, x2, y2, z2); // SOUTH
        };
    }

    protected final @NotNull VoxelShape @NotNull[] shapesById;

    public CountdownTimerBlock(Settings settings) {
        super(settings);
        this.shapesById = createShapes();
        this.setDefaultState(
            this.getDefaultState().with(HORIZONTAL_FACING, Direction.SOUTH)
            .with(TrafficAttach7.ATTACHMENT, TrafficAttach7.MIDDLE)
        );
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CountdownTimerBlockEntity(pos, state);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onStateReplaced(
        BlockState state, World world, BlockPos pos, BlockState newState,
        boolean moved
    ) {
        super.onStateReplaced(state, world, pos, newState, moved);
        if (!state.isOf(newState.getBlock()) &&
            world instanceof ServerWorld sw) {
            TrafficLightGroupManager.removePosAndSync(sw, pos);
        }
    }

    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(
        BlockState state, World world, BlockPos pos, PlayerEntity player,
        Hand hand, BlockHitResult hit
    ) {
        if (player.getMainHandStack().isIn(TRAFFIC_LIGHT_CONNECTORS) ||
            player.getOffHandStack().isIn(TRAFFIC_LIGHT_CONNECTORS)) {
            return ActionResult.PASS;
        }
        if (!(world instanceof ServerWorld sw)) {
            return ActionResult.SUCCESS;
        }
        TrafficLightGroup group =
        TrafficLightGroupManager.get(sw).getGroupByPos(pos);
        if (group != null && player instanceof ServerPlayerEntity sp) {
            ServerPlayNetworking.send(
                sp, OpenTrafficLightConfigPayload.ID,
                new OpenTrafficLightConfigPayload(group, pos).toBuffer()
            );
        } else {
            player.sendMessage(Text.translatable(
                "msg.cntrafficsymbols_0d0.countdown.not_bound"
            ), true);
        }
        return ActionResult.SUCCESS;
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, TrafficAttach7.ATTACHMENT);
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        return this.shapesById[
            state.get(HORIZONTAL_FACING).getHorizontal() * 7 +
            state.get(TrafficAttach7.ATTACHMENT).id
        ];
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return rotation == BlockRotation.NONE ? state : state.with(
            HORIZONTAL_FACING, rotation.rotate(state.get(HORIZONTAL_FACING))
        );
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return mirror == BlockMirror.NONE ? state : state.with(
            HORIZONTAL_FACING, mirror.apply(state.get(HORIZONTAL_FACING))
        );
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState st = this.getDefaultState();
        Direction side = ctx.getSide();
        Direction facing;
        TrafficAttach7 attach;
        if (side == Direction.DOWN) {
            facing = ctx.getHorizontalPlayerFacing().getOpposite();
            attach = TrafficAttach7.CEILING;
        } else if (side == Direction.UP) {
            facing = ctx.getHorizontalPlayerFacing().getOpposite();
            attach = TrafficAttach7.DOWN;
        } else {
            facing = side;
            if (ctx.getPlayer() != null && ctx.getPlayer().isSneaking()) {
                attach = TrafficAttach7.CENTER;
            } else {
                Vec3d hp = ctx.getHitPos();
                BlockPos bp = ctx.getBlockPos();
                double ry = hp.y - bp.getY();
                double hitCross = switch (side) {
                    case SOUTH -> hp.x - bp.getX();
                    case NORTH -> 1. - (hp.x - bp.getX());
                    case EAST  -> 1. - (hp.z - bp.getZ());
                    case WEST  -> hp.z - bp.getZ();
                    default    -> 0.5;
                };
                if (ry >= 0.75) {
                    attach = TrafficAttach7.UP;
                } else if (ry <= 0.25) {
                    attach = TrafficAttach7.DOWN;
                } else if (hitCross <= 0.25) {
                    attach = TrafficAttach7.LEFT;
                } else if (hitCross >= 0.75) {
                    attach = TrafficAttach7.RIGHT;
                } else {
                    attach = TrafficAttach7.MIDDLE;
                }
            }
        }
        return this.configurePlacedFluid(
            st.with(HORIZONTAL_FACING, facing)
            .with(TrafficAttach7.ATTACHMENT, attach), ctx
        );
    }
}
