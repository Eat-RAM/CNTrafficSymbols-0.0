package rege.pegui.cntrafficsymbols.block;

import io.github.eat_ram.cntrafficsymbols.core.block.ManagedWaterloggable;
import io.github.eat_ram.cntrafficsymbols.core.state.StateOptimizable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;
import rege.pegui.cntrafficsymbols.Main;

import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.state.property.Properties.HORIZONTAL_AXIS;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;
import static rege.pegui.cntrafficsymbols.Main
              .getHardcodedFloorLineEighthsLootEnabled;

public class FloorLineEighthBlock extends Block
implements ManagedWaterloggable, StateOptimizable {
    public static final IntProperty SLICES160 = IntProperty.of("slices160", 0, 40);
    public static final IntProperty SLICES16 = IntProperty.of("slices16", 0, 9);
    public static final IntProperty SLICES = IntProperty.of("slices", 0, 15);
    public static final VoxelShape L0X = cuboid(0, 0, 0, 1, .03125, .125);
    public static final VoxelShape L1X = cuboid(0, 0, .125, 1, .03125, .25);
    public static final VoxelShape L2X = cuboid(0, 0, .25, 1, .03125, .375);
    public static final VoxelShape L3X = cuboid(0, 0, .375, 1, .03125, .5);
    public static final VoxelShape L4X = cuboid(0, 0, .5, 1, .03125, .625);
    public static final VoxelShape L5X = cuboid(0, 0, .625, 1, .03125, .75);
    public static final VoxelShape L6X = cuboid(0, 0, .75, 1, .03125, .875);
    public static final VoxelShape L7X = cuboid(0, 0, .875, 1, .03125, 1);
    public static final VoxelShape L0Z = cuboid(0, 0, 0, .125, .03125, 1);
    public static final VoxelShape L1Z = cuboid(.125, 0, 0, .25, .03125, 1);
    public static final VoxelShape L2Z = cuboid(.25, 0, 0, .375, .03125, 1);
    public static final VoxelShape L3Z = cuboid(.375, 0, 0, .5, .03125, 1);
    public static final VoxelShape L4Z = cuboid(.5, 0, 0, .625, .03125, 1);
    public static final VoxelShape L5Z = cuboid(.625, 0, 0, .75, .03125, 1);
    public static final VoxelShape L6Z = cuboid(.75, 0, 0, .875, .03125, 1);
    public static final VoxelShape L7Z = cuboid(.875, 0, 0, 1, .03125, 1);
    private Item itm1;
    private Item itm2;

    public static int to3Pow(BlockState st) {
        return st.get(SLICES160).intValue() * 160 +
               (st.get(SLICES16).intValue() * 16) +
               st.get(SLICES).intValue() + 1;
    }

    public static BlockState from3Pow(BlockState st, int pow) {
        pow--;
        st = st.with(SLICES, pow % 16);
        pow /= 16;
        st = st.with(SLICES16, pow % 10);
        pow /= 10;
        return st.with(SLICES160, pow % 41);
    }

    public FloorLineEighthBlock(Item itm1, Item itm2, Settings settings) {
        super(settings);
        this.itm1 = itm1;
        this.itm2 = itm2;
        BlockState st = this.getDefaultState().with(SLICES160, 0)
                        .with(SLICES16, 0).with(SLICES, 0)
                        .with(HORIZONTAL_AXIS, Direction.Axis.X);
        if (this.getWaterloggedProperty()) {
            st = st.with(WATERLOGGED, false);
        }
        this.setDefaultState(st);
    }

    public FloorLineEighthBlock(Settings settings) {
        super(settings);
        BlockState st = this.getDefaultState().with(SLICES160, 0)
                        .with(SLICES16, 0).with(SLICES, 0)
                        .with(HORIZONTAL_AXIS, Direction.Axis.X);
        if (this.getWaterloggedProperty()) {
            st = st.with(WATERLOGGED, false);
        }
        this.setDefaultState(st);
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        VoxelShape res = net.minecraft.util.shape.VoxelShapes.empty();
        int r = to3Pow(state);
        if (state.get(HORIZONTAL_AXIS) == Direction.Axis.X) {
            if (r % 3 != 0) res = union(res, L0X);
            r /= 3;
            if (r % 3 != 0) res = union(res, L1X);
            r /= 3;
            if (r % 3 != 0) res = union(res, L2X);
            r /= 3;
            if (r % 3 != 0) res = union(res, L3X);
            r /= 3;
            if (r % 3 != 0) res = union(res, L4X);
            r /= 3;
            if (r % 3 != 0) res = union(res, L5X);
            r /= 3;
            if (r % 3 != 0) res = union(res, L6X);
            r /= 3;
            if (r % 3 != 0) res = union(res, L7X);
        } else {
            if (r % 3 != 0) res = union(res, L0Z);
            r /= 3;
            if (r % 3 != 0) res = union(res, L1Z);
            r /= 3;
            if (r % 3 != 0) res = union(res, L2Z);
            r /= 3;
            if (r % 3 != 0) res = union(res, L3Z);
            r /= 3;
            if (r % 3 != 0) res = union(res, L4Z);
            r /= 3;
            if (r % 3 != 0) res = union(res, L5Z);
            r /= 3;
            if (r % 3 != 0) res = union(res, L6Z);
            r /= 3;
            if (r % 3 != 0) res = union(res, L7Z);
        }
        return res;
    }

    @Override
    public void afterBreak(
        World world, PlayerEntity player, BlockPos pos, BlockState state,
        @Nullable BlockEntity blockEntity, ItemStack tool
    ) {
        super.afterBreak(world, player, pos, state, blockEntity, tool);
        if ((world instanceof ServerWorld) &&
            (Boolean.TRUE.equals(getHardcodedFloorLineEighthsLootEnabled()) ||
             (getHardcodedFloorLineEighthsLootEnabled() == null &&
              getDroppedStacks(state, (ServerWorld)world, pos, blockEntity,
                               player, tool).isEmpty()))) {
            byte i1 = 0;
            byte i2 = 0;
            int r = to3Pow(state);
            for (int i = 0; i < 8; i++) {
                switch (r % 3) {
                    case 1:
                        i1++;
                        break;
                    case 2:
                        i2++;
                        break;
                }
                r /= 3;
            }
            ItemScatterer.spawn(world, pos.getX(), pos.getY(), pos.getZ(),
                                new ItemStack(this.itm1, i1));
            ItemScatterer.spawn(world, pos.getX(), pos.getY(), pos.getZ(),
                                new ItemStack(this.itm2, i2));
        }
    }

    @Override
    public ItemStack
    getPickStack(WorldView world, BlockPos pos, BlockState state) {
        int pow = to3Pow(state);
        byte s1 = 0;
        byte s2 = 0;
        for (byte i = 0; i < (byte)8; i++) {
            switch (pow % 3) {
                case 1:
                    s1++;
                    break;
                case 2:
                    s2++;
                    break;
            }
            pow /= 3;
        }
        if (s1 == (byte)0) {
            assert s2 != (byte)0;
            return new ItemStack(this.itm2);
        }
        if (s2 == (byte)0) {
            return new ItemStack(this.itm1);
        }
        return new ItemStack((Math.random() < .5) ? this.itm1 : this.itm2);
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SLICES, SLICES16, SLICES160, HORIZONTAL_AXIS);
        if (this.getWaterloggedProperty()) {
            builder.add(WATERLOGGED);
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState st = ctx.getWorld().getBlockState(ctx.getBlockPos());
        byte repl = 1;
        if (ctx.getStack().isOf(this.itm2)) {
            repl++;
        } else if (!ctx.getStack().isOf(this.itm1)) {
            throw new IllegalStateException(
                "Unexpected item " + ctx.getStack().getItem()
            );
        }
        if (st.isOf(this)) {
            Direction d = ctx.getSide();
            BlockPos p = ctx.getBlockPos();
            net.minecraft.util.math.Vec3d v = ctx.getHitPos();
            int l = 0;
            if (d.getAxis().isVertical()) {
                l = (int)(((st.get(HORIZONTAL_AXIS) == Direction.Axis.X) ?
                            v.z - p.getZ() : (v.x - p.getX())) * 8);
            } else {
                double c;
                switch (d) {
                    case NORTH:
                        c = v.z - p.getZ();
                        l = ((int) c) - ((c % .125 == 0) ? 1 : 0);
                        break;
                    case SOUTH:
                        c = v.z - p.getZ();
                        l = (int) c;
                        break;
                    case WEST:
                        c = v.x - p.getX();
                        l = ((int) c) - ((c % .125 == 0) ? 1 : 0);
                        break;
                    case EAST:
                        c = v.x - p.getX();
                        l = (int) c;
                        break;
                    default: assert false;
                }
            }
            if (l < 0) {
                l = 0;
            } else if (l > 7) {
                l = 7;
            }
            int base = 1;
            for (int i = 0; i < l; i++) {
                base *= 3;
            }
            return from3Pow(st, base * repl + to3Pow(st));
        }
        if (ctx.getHorizontalPlayerFacing().getAxis() == Direction.Axis.X) {
            int l = (int)((ctx.getHitPos().z - ctx.getBlockPos().getZ()) * 8);
            if (l < 0) {
                l = 0;
            } else if (l > 7) {
                l = 7;
            }
            int base = 1;
            for (int i = 0; i < l; i++) base *= 3;
            BlockState sst = from3Pow(
                this.getDefaultState().with(HORIZONTAL_AXIS, Direction.Axis.X),
                base * repl
            );
            if (this.getWaterloggedProperty()) {
                sst = sst.with(WATERLOGGED, ctx.getWorld().getFluidState(
                    ctx.getBlockPos()
                ).getFluid() == WATER);
            }
            return sst;
        } else {
            int l = (int)((ctx.getHitPos().x - ctx.getBlockPos().getX()) * 8);
            if (l < 0) {
                l = 0;
            } else if (l > 7) {
                l = 7;
            }
            int base = 1;
            for (int i = 0; i < l; i++) {
                base *= 3;
            }
            BlockState sst = from3Pow(
                this.getDefaultState().with(HORIZONTAL_AXIS, Direction.Axis.Z),
                base * repl
            );
            if (this.getWaterloggedProperty()) {
                sst = sst.with(WATERLOGGED, ctx.getWorld().getFluidState(
                    ctx.getBlockPos()
                ).getFluid() == WATER);
            }
            return sst;
        }
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
    public boolean canReplace(BlockState state, ItemPlacementContext ctx) {
        if (!(ctx.getStack().isOf(this.itm1) ||
              ctx.getStack().isOf(this.itm2))) {
            return false;
        }
        Direction d = ctx.getSide();
        BlockPos p = ctx.getBlockPos();
        net.minecraft.util.math.Vec3d v = ctx.getHitPos();
        int l = 0;
        if (d.getAxis().isVertical()) {
            l = (int)(((state.get(HORIZONTAL_AXIS) == Direction.Axis.X) ?
                        v.z - p.getZ() : (v.x - p.getX())) * 8);
        } else if (d.getAxis() == state.get(HORIZONTAL_AXIS)) {
            return false;
        } else {
            double c;
            switch (d) {
                case NORTH:
                    c = v.z - p.getZ();
                    l = ((int)c) - ((c % .125 == 0) ? 1 : 0);
                    break;
                case SOUTH:
                    c = v.z - p.getZ();
                    l = (int)c;
                    break;
                case WEST:
                    c = v.x - p.getX();
                    l = ((int)c) - ((c % .125 == 0) ? 1 : 0);
                    break;
                case EAST:
                    c = v.x - p.getX();
                    l = (int)c;
                    break;
                default: assert false;
            }
        }
        if (l < 0) {
            l = 0;
        } else if (l > 7) {
            l = 7;
        }
        int s = to3Pow(state);
        for (int i = 0; i < l; i++) {
            s /= 3;
        }
        return s % 3 == 0;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        boolean shouldReverse;
        switch (rotation) {
            case CLOCKWISE_90: {
                shouldReverse = state.get(HORIZONTAL_AXIS) == Direction.Axis.X;
                state = state.with(HORIZONTAL_AXIS,
                                   shouldReverse ?
                                   Direction.Axis.Z : Direction.Axis.X);
                break;
            }
            case CLOCKWISE_180:
                shouldReverse = true;
                break;
            case COUNTERCLOCKWISE_90: {
                shouldReverse = state.get(HORIZONTAL_AXIS) == Direction.Axis.Z;
                state = state.with(HORIZONTAL_AXIS,
                                   shouldReverse ?
                                   Direction.Axis.X : Direction.Axis.Z);
                break;
            }
            default: return state;
        }
        if (shouldReverse) {
            int ns = 0;
            int r = to3Pow(state);
            for (int i = 0; i < 8; i++) {
                ns *= 3;
                ns += r % 3;
                r /= 3;
            }
            return from3Pow(state, ns);
        }
        return state;
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        switch (mirror) {
            case FRONT_BACK:
                if (state.get(HORIZONTAL_AXIS) == Direction.Axis.X) {
                    return state;
                }
                break;
            case LEFT_RIGHT:
                if (state.get(HORIZONTAL_AXIS) == Direction.Axis.Z) {
                    return state;
                }
                break;
            default: return state;
        }
        int ns = 0;
        int r = to3Pow(state);
        for (int i = 0; i < 8; i++) {
            ns *= 3;
            ns += r % 3;
            r /= 3;
        }
        return from3Pow(state, ns);
    }

    public @Nullable Item setItm1(@Nullable Item v) {
        Item r = this.itm1;
        if (r == null) {
            this.itm1 = v;
        }
        return v;
    }

    public @Nullable Item setItm2(@Nullable Item v) {
        Item r = this.itm2;
        if (r == null) {
            this.itm2 = v;
        }
        return v;
    }

    @Override
    public float calcBlockBreakingDelta(
        BlockState state, PlayerEntity player, BlockView view, BlockPos pos
    ) {
        int pow = to3Pow(state);
        byte s = 0;
        for (byte i = 0; i < (byte)8; i++) {
            if (pow % 3 != 0) {
                s++;
            }
            pow /= 3;
        }
        return (s > 1) ?
               super.calcBlockBreakingDelta(state, player, view, pos) /
               ((s + 1) * 0.5f) :
               super.calcBlockBreakingDelta(state, player, view, pos);
    }

    @Override
    public boolean getWaterloggedProperty() {
        return Main.getWaterloggedProperty();
    }
}
