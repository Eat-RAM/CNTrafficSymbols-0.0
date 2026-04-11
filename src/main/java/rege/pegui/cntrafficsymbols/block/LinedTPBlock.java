package rege.pegui.cntrafficsymbols.block;

import io.github.eat_ram.cntrafficsymbols.core.block.ManagedWaterloggable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import rege.pegui.cntrafficsymbols.Main;

import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.state.property.Properties.BOTTOM;
import static net.minecraft.state.property.Properties.HORIZONTAL_AXIS;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.shape.VoxelShapes.cuboid;

public class LinedTPBlock extends Block implements ManagedWaterloggable {
    public static final VoxelShape DOWN_BASE = cuboid(0, 0, 0, 1, .0625, 1);
    public static final VoxelShape UP_BASE = cuboid(0, .5, 0, 1, .5625, 1);
    public static final VoxelShape DOWN_X4 = patternZ(
        DOWN_BASE, .0625, .0625, .0625, .875, .03125, .125, .25, 4
    );
    public static final VoxelShape UP_X4 = patternZ(
        UP_BASE, .0625, .5625, .0625, .875, .03125, .125, .25, 4
    );
    public static final VoxelShape DOWN_X5 = patternZ(
        DOWN_BASE, .0625, .0625, .0625, .875, .03125, .125, .1875, 5
    );
    public static final VoxelShape UP_X5 = patternZ(
        UP_BASE, .0625, .5625, .0625, .875, .03125, .125, .1875, 5
    );
    public static final VoxelShape DOWN_X6 = patternZ(
        DOWN_BASE, .046875, .0625, .046875, .90625, .03125, .125, .15625, 6
    );
    public static final VoxelShape UP_X6 = patternZ(
        UP_BASE, .046875, .5625, .046875, .90625, .03125, .125, .15625, 6
    );
    public static final VoxelShape DOWN_X7 = patternZ(
        DOWN_BASE, .09375, .0625, .09375, .8125, .03125, .0625, .125, 7
    );
    public static final VoxelShape UP_X7 = patternZ(
        UP_BASE, .09375, .5625, .09375, .8125, .03125, .0625, .125, 7
    );
    public static final VoxelShape DOWN_X8 = patternZ(
        DOWN_BASE, .03125, .0625, .09375, .9375, .03125, .0625, .125, 8
    );
    public static final VoxelShape UP_X8 = patternZ(
        UP_BASE, .03125, .5625, .09375, .9375, .03125, .0625, .125, 8
    );
    public static final VoxelShape DOWN_X9 = patternZ(
        DOWN_BASE, .09375, .0625, .09375, .8125, .03125, .0625, .09375, 9
    );
    public static final VoxelShape UP_X9 = patternZ(
        UP_BASE, .09375, .5625, .09375, .8125, .03125, .0625, .09375, 9
    );
    public static final VoxelShape DOWN_X10 = patternZ(
        DOWN_BASE, .046875, .0625, .046875, .90625, .03125, .0625, .09375, 10
    );
    public static final VoxelShape UP_X10 = patternZ(
        UP_BASE, .046875, .5625, .046875, .90625, .03125, .0625, .09375, 10
    );
    public static final VoxelShape DOWN_Z4 = patternX(
        DOWN_BASE, .0625, .0625, .0625, .125, .03125, .875, .25, 4
    );
    public static final VoxelShape UP_Z4 = patternX(
        UP_BASE, .0625, .5625, .0625, .125, .03125, .875, .25, 4
    );
    public static final VoxelShape DOWN_Z5 = patternX(
        DOWN_BASE, .0625, .0625, .0625, .125, .03125, .875, .1875, 5
    );
    public static final VoxelShape UP_Z5 = patternX(
        UP_BASE, .0625, .5625, .0625, .125, .03125, .875, .1875, 5
    );
    public static final VoxelShape DOWN_Z6 = patternX(
        DOWN_BASE, .046875, .0625, .046875, .125, .03125, .90625, .15625, 6
    );
    public static final VoxelShape UP_Z6 = patternX(
        UP_BASE, .046875, .5625, .046875, .125, .03125, .90625, .15625, 6
    );
    public static final VoxelShape DOWN_Z7 = patternX(
        DOWN_BASE, .09375, .0625, .09375, .0625, .03125, .8125, .125, 7
    );
    public static final VoxelShape UP_Z7 = patternX(
        UP_BASE, .09375, .5625, .09375, .0625, .03125, .8125, .125, 7
    );
    public static final VoxelShape DOWN_Z8 = patternX(
        DOWN_BASE, .03125, .0625, .09375, .0625, .03125, .9375, .125, 8
    );
    public static final VoxelShape UP_Z8 = patternX(
        UP_BASE, .03125, .5625, .09375, .0625, .03125, .9375, .125, 8
    );
    public static final VoxelShape DOWN_Z9 = patternX(
        DOWN_BASE, .09375, .0625, .09375, .0625, .03125, .8125, .09375, 9
    );
    public static final VoxelShape UP_Z9 = patternX(
        UP_BASE, .09375, .5625, .09375, .0625, .03125, .8125, .09375, 9
    );
    public static final VoxelShape DOWN_Z10 = patternX(
        DOWN_BASE, .046875, .0625, .046875, .0625, .03125, .90625, .09375, 10
    );
    public static final VoxelShape UP_Z10 = patternX(
        UP_BASE, .046875, .5625, .046875, .0625, .03125, .90625, .09375, 10
    );

    public static VoxelShape patternX(
        VoxelShape base, double startX, double startY, double startZ,
        double xLength, double yLength, double zLength, double sep, int times
    ) {
        return DottedTPBlock.pattern(
            base, startX, startY, startZ, xLength, yLength, zLength,
            sep, 0, 0, times, 1, 1
        );
    }

    public static VoxelShape patternZ(
        VoxelShape base, double startX, double startY, double startZ,
        double xLength, double yLength, double zLength, double sep, int times
    ) {
        return DottedTPBlock.pattern(
            base, startX, startY, startZ, xLength, yLength, zLength,
            0, 0, sep, 1, 1, times
        );
    }

    public final byte asize;

    public LinedTPBlock(byte asize, Settings s)
    throws IllegalArgumentException {
        super(s);
        if ((asize < (byte)4 || asize > (byte)10) &&
            this.getClass() == LinedTPBlock.class) {
            throw new IllegalArgumentException(
                "The asize " + asize +
                " is not acceptable. You can extend this class."
            );
        }
        this.asize = asize;
        BlockState st = this.getDefaultState().with(BOTTOM, true)
                        .with(HORIZONTAL_AXIS, Axis.X);
        if (this.getWaterloggedProperty()) {
            st = st.with(WATERLOGGED, false);
        }
        this.setDefaultState(st);
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        if (state.get(HORIZONTAL_AXIS) == Axis.X) {
            if (state.get(BOTTOM).booleanValue()) {
                switch (this.asize) {
                    case 4: return DOWN_X4;
                    case 5: return DOWN_X5;
                    case 6: return DOWN_X6;
                    case 7: return DOWN_X7;
                    case 8: return DOWN_X8;
                    case 9: return DOWN_X9;
                    case 10: return DOWN_X10;
                    default: return DOWN_BASE;
                }
            }
            switch (this.asize) {
                case 4: return UP_X4;
                case 5: return UP_X5;
                case 6: return UP_X6;
                case 7: return UP_X7;
                case 8: return UP_X8;
                case 9: return UP_X9;
                case 10: return UP_X10;
                default: return UP_BASE;
            }
        }
        if (state.get(BOTTOM).booleanValue()) {
            switch (this.asize) {
                case 4: return DOWN_Z4;
                case 5: return DOWN_Z5;
                case 6: return DOWN_Z6;
                case 7: return DOWN_Z7;
                case 8: return DOWN_Z8;
                case 9: return DOWN_Z9;
                case 10: return DOWN_Z10;
                default: return DOWN_BASE;
            }
        }
        switch (this.asize) {
            case 4: return UP_Z4;
            case 5: return UP_Z5;
            case 6: return UP_Z6;
            case 7: return UP_Z7;
            case 8: return UP_Z8;
            case 9: return UP_Z9;
            case 10: return UP_Z10;
            default: return UP_BASE;
        }
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(BOTTOM, HORIZONTAL_AXIS);
        if (this.getWaterloggedProperty()) {
            builder.add(WATERLOGGED);
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState st = this.getDefaultState().with(
            BOTTOM, ctx.getHitPos().y - ctx.getBlockPos().getY() < .5
        ).with(HORIZONTAL_AXIS, ctx.getHorizontalPlayerFacing().getAxis());
        if (this.getWaterloggedProperty()) {
            st = st.with(WATERLOGGED, ctx.getWorld().getFluidState(
                ctx.getBlockPos()
            ).getFluid() == WATER);
        }
        return st;
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
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        switch (rotation) {
            case CLOCKWISE_90:
            case COUNTERCLOCKWISE_90: return state.with(
                HORIZONTAL_AXIS,
                (state.get(HORIZONTAL_AXIS) == Axis.X) ? Axis.Z : Axis.X
            );
            default: return state;
        }
    }

    @Override
    public boolean getWaterloggedProperty() {
        return Main.getWaterloggedProperty();
    }
}
