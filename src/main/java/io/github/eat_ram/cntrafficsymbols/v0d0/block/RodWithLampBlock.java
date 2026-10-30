package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import java.util.List;
import java.util.function.ToIntFunction;

import io.github.eat_ram.cntrafficsymbols.core.block.FluidloggedConfigurable;
import io.github.eat_ram.cntrafficsymbols.core.helper.FacePosition9Mirrorer;
import io.github.eat_ram.cntrafficsymbols.core.helper.FacePosition9Rotator;
import io.github.eat_ram.cntrafficsymbols.core.struct.FacePosition9;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be.RodWithLampBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.network
       .OpenEditTrafficSignPayload;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockMirror;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRotation;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static io.github.eat_ram.cntrafficsymbols.core.block
              .AbstractCylindricalRodBlock.*;
import static io.github.eat_ram.cntrafficsymbols.core.helper.RangeUtil
              .closedRangeTo;
import static net.minecraft.state.property.Properties.LIT;

public class RodWithLampBlock extends BlockWithEntity
implements FluidloggedConfigurable {
    private static final VoxelShape[] SHAPES_BY_ID = {
        WEST_CENTER, WEST_UPPER, WEST_UPPERSOUTH, WEST_SOUTH, WEST_LOWERSOUTH,
        WEST_LOWER, WEST_LOWERNORTH, WEST_NORTH, WEST_UPPERNORTH, EAST_CENTER,
        EAST_UPPER, EAST_UPPERSOUTH, EAST_SOUTH, EAST_LOWERSOUTH, EAST_LOWER,
        EAST_LOWERNORTH, EAST_NORTH, EAST_UPPERNORTH, DOWN_CENTER, DOWN_NORTH,
        DOWN_NORTHEAST, DOWN_EAST, DOWN_SOUTHEAST, DOWN_SOUTH, DOWN_SOUTHWEST,
        DOWN_WEST, DOWN_NORTHWEST, UP_CENTER, UP_NORTH, UP_NORTHEAST, UP_EAST,
        UP_SOUTHEAST, UP_SOUTH, UP_SOUTHWEST, UP_WEST, UP_NORTHWEST,
        NORTH_CENTER, NORTH_UPPER, NORTH_UPPEREAST, NORTH_EAST,
        NORTH_LOWEREAST, NORTH_LOWER, NORTH_LOWERWEST, NORTH_WEST,
        NORTH_UPPERWEST, SOUTH_CENTER, SOUTH_UPPER, SOUTH_UPPEREAST,
        SOUTH_EAST, SOUTH_LOWEREAST, SOUTH_LOWER, SOUTH_LOWERWEST, SOUTH_WEST,
        SOUTH_UPPERWEST
    };

    public static enum LightVisualColor implements StringIdentifiable {
        WHITE("white", 0),
        LIGHT_YELLOW("light_yellow", 1), YELLOW("yellow", 2),
        ORANGE("orange", 3);

        public final @NotNull String str;
        public final @Range(from = 0, to = 3) int id;

        LightVisualColor(@NotNull String n, @Range(from = 0, to = 3) int i) {
            this.str = n;
            this.id = i;
        }

        @Override
        @Contract(pure = true)
        public @NotNull String asString() {
            return this.str;
        }

        public static final List<LightVisualColor> VARS =
        List.of(WHITE, LIGHT_YELLOW, YELLOW, ORANGE);

        public static LightVisualColor byID(int id) {
            return VARS.get(id);
        }
    }

    public static final EnumProperty<LightVisualColor> COLOR =
    EnumProperty.of("color", LightVisualColor.class);
    public static final ToIntFunction<@NotNull BlockState> LUMINANCE =
    st -> st.get(LIT).booleanValue() ? 15 : 0;

    public RodWithLampBlock(Settings settings) {
        super(settings);
        BlockState st =
        this.getDefaultState().with(LIT, false)
        .with(FacePosition9.POSITION, FacePosition9.DOWN_CENTER)
        .with(COLOR, LightVisualColor.WHITE);
        this.setDefaultState(st);
    }

    @Override
    @Contract("_, _ -> new")
    public BlockEntity createBlockEntity(BlockPos p, BlockState st) {
        return new RodWithLampBlockEntity(p, st);
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, FacePosition9.POSITION, COLOR);
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        return SHAPES_BY_ID[state.get(FacePosition9.POSITION).id];
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState st = this.getDefaultState();
        double rx = ctx.getHitPos().x - ctx.getBlockPos().getX();
        double ry = ctx.getHitPos().y - ctx.getBlockPos().getY();
        double rz = ctx.getHitPos().z - ctx.getBlockPos().getZ();
        FacePosition9 rp = st.get(FacePosition9.POSITION);
        switch (ctx.getSide().getIndex()) {
            case 5:
                switch (closedRangeTo(.25, .75, ry) * 3 +
                        closedRangeTo(.25, .75, rz)) {
                    case -4: rp = FacePosition9.WEST_LOWERNORTH; break;
                    case -3: rp = FacePosition9.WEST_LOWER; break;
                    case -2: rp = FacePosition9.WEST_LOWERSOUTH; break;
                    case -1: rp = FacePosition9.WEST_NORTH; break;
                    case 0: rp = FacePosition9.WEST_CENTER; break;
                    case 1: rp = FacePosition9.WEST_SOUTH; break;
                    case 2: rp = FacePosition9.WEST_UPPERNORTH; break;
                    case 3: rp = FacePosition9.WEST_UPPER; break;
                    case 4: rp = FacePosition9.WEST_UPPERSOUTH; break;
                }
                break;
            case 4:
                switch (closedRangeTo(.25, .75, ry) * 3 +
                        closedRangeTo(.25, .75, rz)) {
                    case -4: rp = FacePosition9.EAST_LOWERNORTH; break;
                    case -3: rp = FacePosition9.EAST_LOWER; break;
                    case -2: rp = FacePosition9.EAST_LOWERSOUTH; break;
                    case -1: rp = FacePosition9.EAST_NORTH; break;
                    case 0: rp = FacePosition9.EAST_CENTER; break;
                    case 1: rp = FacePosition9.EAST_SOUTH; break;
                    case 2: rp = FacePosition9.EAST_UPPERNORTH; break;
                    case 3: rp = FacePosition9.EAST_UPPER; break;
                    case 4: rp = FacePosition9.EAST_UPPERSOUTH; break;
                }
                break;
            case 1:
                switch (closedRangeTo(.25, .75, rx) * 3 +
                        closedRangeTo(.25, .75, rz)) {
                    case -4: rp = FacePosition9.DOWN_NORTHWEST; break;
                    case -3: rp = FacePosition9.DOWN_WEST; break;
                    case -2: rp = FacePosition9.DOWN_SOUTHWEST; break;
                    case -1: rp = FacePosition9.DOWN_NORTH; break;
                    case 0: rp = FacePosition9.DOWN_CENTER; break;
                    case 1: rp = FacePosition9.DOWN_SOUTH; break;
                    case 2: rp = FacePosition9.DOWN_NORTHEAST; break;
                    case 3: rp = FacePosition9.DOWN_EAST; break;
                    case 4: rp = FacePosition9.DOWN_SOUTHEAST; break;
                }
                break;
            case 0:
                switch (closedRangeTo(.25, .75, rx) * 3 +
                        closedRangeTo(.25, .75, rz)) {
                    case -4: rp = FacePosition9.UP_NORTHWEST; break;
                    case -3: rp = FacePosition9.UP_WEST; break;
                    case -2: rp = FacePosition9.UP_SOUTHWEST; break;
                    case -1: rp = FacePosition9.UP_NORTH; break;
                    case 0: rp = FacePosition9.UP_CENTER; break;
                    case 1: rp = FacePosition9.UP_SOUTH; break;
                    case 2: rp = FacePosition9.UP_NORTHEAST; break;
                    case 3: rp = FacePosition9.UP_EAST; break;
                    case 4: rp = FacePosition9.UP_SOUTHEAST; break;
                }
                break;
            case 3:
                switch (closedRangeTo(.25, .75, rx) * 3 +
                        closedRangeTo(.25, .75, ry)) {
                    case -4: rp = FacePosition9.NORTH_LOWERWEST; break;
                    case -3: rp = FacePosition9.NORTH_WEST; break;
                    case -2: rp = FacePosition9.NORTH_UPPERWEST; break;
                    case -1: rp = FacePosition9.NORTH_LOWER; break;
                    case 0: rp = FacePosition9.NORTH_CENTER; break;
                    case 1: rp = FacePosition9.NORTH_UPPER; break;
                    case 2: rp = FacePosition9.NORTH_LOWEREAST; break;
                    case 3: rp = FacePosition9.NORTH_EAST; break;
                    case 4: rp = FacePosition9.NORTH_UPPEREAST; break;
                }
                break;
            case 2:
                switch (closedRangeTo(.25, .75, rx) * 3 +
                        closedRangeTo(.25, .75, ry)) {
                    case -4: rp = FacePosition9.SOUTH_LOWERWEST; break;
                    case -3: rp = FacePosition9.SOUTH_WEST; break;
                    case -2: rp = FacePosition9.SOUTH_UPPERWEST; break;
                    case -1: rp = FacePosition9.SOUTH_LOWER; break;
                    case 0: rp = FacePosition9.SOUTH_CENTER; break;
                    case 1: rp = FacePosition9.SOUTH_UPPER; break;
                    case 2: rp = FacePosition9.SOUTH_LOWEREAST; break;
                    case 3: rp = FacePosition9.SOUTH_EAST; break;
                    case 4: rp = FacePosition9.SOUTH_UPPEREAST; break;
                }
                break;
        }
        return this.configurePlacedFluid(
            st.with(FacePosition9.POSITION, rp), ctx
        );
    }

    @Override
    protected ActionResult onUse(
        BlockState state, World world, BlockPos pos, PlayerEntity player,
        BlockHitResult hit
    ) {
        if (!world.isClient() && player instanceof
            net.minecraft.server.network.ServerPlayerEntity spe) {
            ServerPlayNetworking.send(spe, new OpenEditTrafficSignPayload(
                pos, OpenEditTrafficSignPayload.TYPE_ROD_WITH_LAMP,
                hit.getSide()
            ));
        }
        return ActionResult.SUCCESS_SERVER;
    }

    @Override
    public BlockState getStateForNeighborUpdate(
        BlockState state, WorldView world, ScheduledTickView tickView,
        BlockPos pos, Direction direction, BlockPos neighborPos,
        BlockState neighborState, Random random
    ) {
        FluidState fs = state.getFluidState();
        if (!fs.isEmpty()) {
            Fluid fluid = fs.getFluid();
            tickView.scheduleFluidTick(pos, fluid, fluid.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(
            state, world, tickView, pos, direction, neighborPos, neighborState,
            random
        );
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public <T extends BlockEntity> @Nullable BlockEntityTicker<T>
    getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return !world.isClient() ? validateTicker(
            type, RodWithLampBlockEntity.TYPE,
            (wrld, pos, bs, be) -> be.tick(world, pos, bs)
        ) : null;
    }

    @Override
    public BlockState rotate(BlockState st, BlockRotation rot) {
        return rot == BlockRotation.NONE ? st : st.with(
            FacePosition9.POSITION, FacePosition9Rotator.rotate(
                st.get(FacePosition9.POSITION),
                rot == BlockRotation.CLOCKWISE_90 ? 1 :
                (rot == BlockRotation.CLOCKWISE_180 ? 2 : 3)
            )
        );
    }

    @Override
    public BlockState mirror(BlockState st, BlockMirror mirror) {
        return mirror == BlockMirror.NONE ? st : st.with(
            FacePosition9.POSITION,
            mirror == BlockMirror.FRONT_BACK ?
            FacePosition9Mirrorer.mirrorX(st.get(FacePosition9.POSITION)) :
            FacePosition9Mirrorer.mirrorZ(st.get(FacePosition9.POSITION))
        );
    }
}
