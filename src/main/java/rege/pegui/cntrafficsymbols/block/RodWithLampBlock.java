package rege.pegui.cntrafficsymbols.block;

import java.util.List;
import java.util.function.ToIntFunction;

import com.mojang.serialization.MapCodec;
import io.github.eat_ram.cntrafficsymbols.core.block.ManagedWaterloggable;
import io.github.eat_ram.cntrafficsymbols.core.struct.FacePosition9;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import rege.pegui.cntrafficsymbols.be.RodWithLampBlockEntity;

import static io.github.eat_ram.cntrafficsymbols.core.block
              .AbstractCylindricalRodBlock.*;
import static io.github.eat_ram.cntrafficsymbols.core.helper.RangeUtil
              .closedRangeTo;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.state.property.Properties.LIT;
import static net.minecraft.state.property.Properties.WATERLOGGED;

public class RodWithLampBlock extends BlockWithEntity
implements ManagedWaterloggable {
    public static final MapCodec<RodWithLampBlock> CODEC =
    createCodec(RodWithLampBlock::new);
    private static final VoxelShape[] SHAPES_BY_ID = {
        X_CENTER, X_UPPER, X_UPPERSOUTH, X_SOUTH, X_LOWERSOUTH, X_LOWER,
        X_LOWERNORTH, X_NORTH, X_UPPERNORTH, X_CENTER, X_UPPER, X_UPPERSOUTH,
        X_SOUTH, X_LOWERSOUTH, X_LOWER, X_LOWERNORTH, X_NORTH, X_UPPERNORTH,
        Y_CENTER, Y_NORTH, Y_NORTHEAST, Y_EAST, Y_SOUTHEAST, Y_SOUTH,
        Y_SOUTHWEST, Y_WEST, Y_NORTHWEST, Y_CENTER, Y_NORTH, Y_NORTHEAST,
        Y_EAST, Y_SOUTHEAST, Y_SOUTH, Y_SOUTHWEST, Y_WEST, Y_NORTHWEST,
        Z_CENTER, Z_UPPER, Z_UPPEREAST, Z_EAST, Z_LOWEREAST, Z_LOWER,
        Z_LOWERWEST, Z_WEST, Z_UPPERWEST, Z_CENTER, Z_UPPER, Z_UPPEREAST,
        Z_EAST, Z_LOWEREAST, Z_LOWER, Z_LOWERWEST, Z_WEST, Z_UPPERWEST
    };

    public static enum LightVisualColor implements StringIdentifiable {
        WHITE("white", 0),
        LIGHT_YELLOW("light_yellow", 1), YELLOW("yellow", 2),
        ORANGE("orange", 3);

        public final String str;
        public final int id;

        private LightVisualColor(String n, int i) {
            this.str = n;
            this.id = i;
        }

        @Override
        @Contract(pure = true)
        public String asString() {
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
    public static final ToIntFunction<BlockState> LUMINANCE =
    st -> st.get(LIT).booleanValue() ? 15 : 0;

    public RodWithLampBlock(Settings settings) {
        super(settings);
        BlockState st =
        this.getDefaultState().with(LIT, false)
            .with(FacePosition9.POSITION, FacePosition9.DOWN_CENTER)
            .with(COLOR, LightVisualColor.WHITE);
        if (this.getWaterloggedProperty()) {
            st = st.with(WATERLOGGED, false);
        }
        this.setDefaultState(st);
    }

    @Override
    @Contract(pure = true)
    public MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    @Contract("_, _ -> new")
    public BlockEntity createBlockEntity(BlockPos p, BlockState st) {
        return new RodWithLampBlockEntity(p, st);
    }

    @Override
    public void onPlaced(
        World world, BlockPos pos, BlockState state,
        @Nullable LivingEntity placer, ItemStack itemStack
    ) {
        if (world.isClient) {
            world.getBlockEntity(
                pos, RodWithLampBlockEntity.TYPE
            ).ifPresent(be -> {
                if (itemStack.hasCustomName()) {
                    try {
                        be.setDuration(Integer.valueOf(
                            itemStack.getName().getString()
                        ));
                    } catch (NumberFormatException ignored) {}
                }
            });
        } else if (itemStack.hasCustomName()) {
            world.getBlockEntity(
                pos, RodWithLampBlockEntity.TYPE
            ).ifPresent(be -> {
                try {
                    be.setDuration(Integer.valueOf(
                        itemStack.getName().getString()
                    ));
                } catch (NumberFormatException ignored) {}
            });
        }
    }

    @Override
    public ItemStack
    getPickStack(WorldView world, BlockPos pos, BlockState state) {
        BlockEntity be = world.getBlockEntity(pos);
        return (be instanceof RodWithLampBlockEntity) ?
               new ItemStack(this.asItem())
               .setCustomName(((RodWithLampBlockEntity)be).getCustomName()) :
               super.getPickStack(world, pos, state);
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, FacePosition9.POSITION, COLOR);
        if (this.getWaterloggedProperty()) {
            builder.add(WATERLOGGED);
        }
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
        switch (ctx.getSide().getId()) {
            case 5: {
                switch (closedRangeTo(.25, .75, ry)) {
                    case -1: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.WEST_LOWERNORTH;
                                break;
                            case 0:
                                rp = FacePosition9.WEST_LOWER;
                                break;
                            case 1:
                                rp = FacePosition9.WEST_LOWERSOUTH;
                                break;
                        }
                        break;
                    }
                    case 0: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.WEST_NORTH;
                                break;
                            case 0:
                                rp = FacePosition9.WEST_CENTER;
                                break;
                            case 1:
                                rp = FacePosition9.WEST_SOUTH;
                                break;
                        }
                        break;
                    }
                    case 1: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.WEST_UPPERNORTH;
                                break;
                            case 0:
                                rp = FacePosition9.WEST_UPPER;
                                break;
                            case 1:
                                rp = FacePosition9.WEST_UPPERSOUTH;
                                break;
                        }
                        break;
                    }
                }
                break;
            }
            case 4: {
                switch (closedRangeTo(.25, .75, ry)) {
                    case -1: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.EAST_LOWERNORTH;
                                break;
                            case 0:
                                rp = FacePosition9.EAST_LOWER;
                                break;
                            case 1:
                                rp = FacePosition9.EAST_LOWERSOUTH;
                                break;
                        }
                        break;
                    }
                    case 0: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.EAST_NORTH;
                                break;
                            case 0:
                                rp = FacePosition9.EAST_CENTER;
                                break;
                            case 1:
                                rp = FacePosition9.EAST_SOUTH;
                                break;
                        }
                        break;
                    }
                    case 1: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.EAST_UPPERNORTH;
                                break;
                            case 0:
                                rp = FacePosition9.EAST_UPPER;
                                break;
                            case 1:
                                rp = FacePosition9.EAST_UPPERSOUTH;
                                break;
                        }
                        break;
                    }
                }
                break;
            }
            case 1: {
                switch (closedRangeTo(.25, .75, rx)) {
                    case -1: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.DOWN_NORTHWEST;
                                break;
                            case 0:
                                rp = FacePosition9.DOWN_WEST;
                                break;
                            case 1:
                                rp = FacePosition9.DOWN_SOUTHWEST;
                                break;
                        }
                        break;
                    }
                    case 0: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.DOWN_NORTH;
                                break;
                            case 0:
                                rp = FacePosition9.DOWN_CENTER;
                                break;
                            case 1:
                                rp = FacePosition9.DOWN_SOUTH;
                                break;
                        }
                        break;
                    }
                    case 1: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.DOWN_NORTHEAST;
                                break;
                            case 0:
                                rp = FacePosition9.DOWN_EAST;
                                break;
                            case 1:
                                rp = FacePosition9.DOWN_SOUTHEAST;
                                break;
                        }
                        break;
                    }
                }
                break;
            }
            case 0: {
                switch (closedRangeTo(.25, .75, rx)) {
                    case -1: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.UP_NORTHWEST;
                                break;
                            case 0:
                                rp = FacePosition9.UP_WEST;
                                break;
                            case 1:
                                rp = FacePosition9.UP_SOUTHWEST;
                                break;
                        }
                        break;
                    }
                    case 0: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.UP_NORTH;
                                break;
                            case 0:
                                rp = FacePosition9.UP_CENTER;
                                break;
                            case 1:
                                rp = FacePosition9.UP_SOUTH;
                                break;
                        }
                        break;
                    }
                    case 1: {
                        switch (closedRangeTo(.25, .75, rz)) {
                            case -1:
                                rp = FacePosition9.UP_NORTHEAST;
                                break;
                            case 0:
                                rp = FacePosition9.UP_EAST;
                                break;
                            case 1:
                                rp = FacePosition9.UP_SOUTHEAST;
                                break;
                        }
                        break;
                    }
                }
                break;
            }
            case 3: {
                switch (closedRangeTo(.25, .75, rx)) {
                    case -1: {
                        switch (closedRangeTo(.25, .75, ry)) {
                            case -1:
                                rp = FacePosition9.NORTH_LOWERWEST;
                                break;
                            case 0:
                                rp = FacePosition9.NORTH_WEST;
                                break;
                            case 1:
                                rp = FacePosition9.NORTH_UPPERWEST;
                                break;
                        }
                        break;
                    }
                    case 0: {
                        switch (closedRangeTo(.25, .75, ry)) {
                            case -1:
                                rp = FacePosition9.NORTH_LOWER;
                                break;
                            case 0:
                                rp = FacePosition9.NORTH_CENTER;
                                break;
                            case 1:
                                rp = FacePosition9.NORTH_UPPER;
                                break;
                        }
                        break;
                    }
                    case 1: {
                        switch (closedRangeTo(.25, .75, ry)) {
                            case -1:
                                rp = FacePosition9.NORTH_LOWEREAST;
                                break;
                            case 0:
                                rp = FacePosition9.NORTH_EAST;
                                break;
                            case 1:
                                rp = FacePosition9.NORTH_UPPEREAST;
                                break;
                        }
                        break;
                    }
                }
                break;
            }
            case 2: {
                switch (closedRangeTo(.25, .75, rx)) {
                    case -1: {
                        switch (closedRangeTo(.25, .75, ry)) {
                            case -1:
                                rp = FacePosition9.SOUTH_LOWERWEST;
                                break;
                            case 0:
                                rp = FacePosition9.SOUTH_WEST;
                                break;
                            case 1:
                                rp = FacePosition9.SOUTH_UPPERWEST;
                                break;
                        }
                        break;
                    }
                    case 0: {
                        switch (closedRangeTo(.25, .75, ry)) {
                            case -1:
                                rp = FacePosition9.SOUTH_LOWER;
                                break;
                            case 0:
                                rp = FacePosition9.SOUTH_CENTER;
                                break;
                            case 1:
                                rp = FacePosition9.SOUTH_UPPER;
                                break;
                        }
                        break;
                    }
                    case 1: {
                        switch (closedRangeTo(.25, .75, ry)) {
                            case -1:
                                rp = FacePosition9.SOUTH_LOWEREAST;
                                break;
                            case 0:
                                rp = FacePosition9.SOUTH_EAST;
                                break;
                            case 1:
                                rp = FacePosition9.SOUTH_UPPEREAST;
                                break;
                        }
                        break;
                    }
                }
                break;
            }
        }
        if (this.getWaterloggedProperty()) {
            st = st.with(WATERLOGGED, ctx.getWorld().getFluidState(
                ctx.getBlockPos()
            ).getFluid() == WATER);
        }
        return st.with(FacePosition9.POSITION, rp);
    }

    @Override
    public ActionResult onUse(
        BlockState state, World world, BlockPos pos, PlayerEntity player,
        Hand hand, BlockHitResult hit
    ) {
        if (player.getStackInHand(hand).isEmpty()) {
            world.setBlockState(pos, state.cycle(COLOR), 3);
            return ActionResult.success(world.isClient);
        }
        return ActionResult.PASS;
    }

    @Override
    public BlockState getStateForNeighborUpdate(
        BlockState state, Direction direction, BlockState neighborState,
        WorldAccess world, BlockPos pos, BlockPos neighborPos
    ) {
        if (this.getWaterloggedProperty() &&
            state.get(WATERLOGGED).booleanValue()) {
            world.scheduleFluidTick(pos, WATER, WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(
            state, direction, neighborState, world, pos, neighborPos
        );
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return (this.getWaterloggedProperty() &&
                state.get(WATERLOGGED).booleanValue()) ?
               WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public <T extends BlockEntity> @Nullable BlockEntityTicker<T>
    getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return !world.isClient ? validateTicker(
            type, RodWithLampBlockEntity.TYPE,
            (wrld, pos, bs, blockEntity) -> blockEntity.tick(world, pos, bs)
        ) : null;
    }
}
