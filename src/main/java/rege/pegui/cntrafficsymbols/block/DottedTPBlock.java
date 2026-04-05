package rege.pegui.cntrafficsymbols.block;

import io.github.eat_ram.cntrafficsymbols.core.block.ManagedWaterloggable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import rege.pegui.cntrafficsymbols.Main;

import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.state.property.Properties.BOTTOM;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;

public class DottedTPBlock extends Block implements ManagedWaterloggable {
    public static final VoxelShape DOWN_BASE = cuboid(0, 0, 0, 1, .0625, 1);
    public static final VoxelShape UP_BASE = cuboid(0, .5, 0, 1, .5625, 1);
    public static final VoxelShape DOWN_4 = pattern(
        DOWN_BASE, .0625, .0625, .0625,
        .125, .03125, .125, .25, 0, .25, 4, 1, 4
    );
    public static final VoxelShape UP_4 = pattern(
        UP_BASE, .0625, .5625, .0625,
        .125, .03125, .125, .25, 0, .25, 4, 1, 4
    );
    public static final VoxelShape DOWN_5 = pattern(
        DOWN_BASE, .0625, .0625, .0625,
        .125, .03125, .125, .1875, 0, .1875, 5, 1, 5
    );
    public static final VoxelShape UP_5 = pattern(
        UP_BASE, .0625, .5625, .0625,
        .125, .03125, .125, .1875, 0, .1875, 5, 1, 5
    );
    public static final VoxelShape DOWN_6 = pattern(
        DOWN_BASE, .046875, .0625, .046875,
        .125, .03125, .125, .15625, 0, .15625, 6, 1, 6
    );
    public static final VoxelShape UP_6 = pattern(
        UP_BASE, .046875, .5625, .046875,
        .125, .03125, .125, .15625, 0, .15625, 6, 1, 6
    );
    public static final VoxelShape DOWN_7 = pattern(
        DOWN_BASE, .09375, .0625, .09375,
        .0625, .03125, .0625, .125, 0, .125, 7, 1, 7
    );
    public static final VoxelShape UP_7 = pattern(
        UP_BASE, .09375, .5625, .09375,
        .0625, .03125, .0625, .125, 0, .125, 7, 1, 7
    );
    public static final VoxelShape DOWN_8 = pattern(
        DOWN_BASE, .03125, .0625, .09375,
        .0625, .03125, .0625, .125, 0, .125, 8, 1, 8
    );
    public static final VoxelShape UP_8 = pattern(
        UP_BASE, .03125, .5625, .09375,
        .0625, .03125, .0625, .125, 0, .125, 8, 1, 8
    );
    public static final VoxelShape DOWN_9 = pattern(
        DOWN_BASE, .09375, .0625, .09375,
        .0625, .03125, .0625, .09375, 0, .09375, 9, 1, 9
    );
    public static final VoxelShape UP_9 = pattern(
        UP_BASE, .09375, .5625, .09375,
        .0625, .03125, .0625, .09375, 0, .09375, 9, 1, 9
    );
    public static final VoxelShape DOWN_10 = pattern(
        DOWN_BASE, .046875, .0625, .046875,
        .0625, .03125, .0625, .09375, 0, .09375, 10, 1, 10
    );
    public static final VoxelShape UP_10 = pattern(
        UP_BASE, .046875, .5625, .046875,
        .0625, .03125, .0625, .09375, 0, .09375, 10, 1, 10
    );

    public static VoxelShape pattern(
        VoxelShape base, double startX, double startY, double startZ,
        double xLength, double yLength, double zLength,
        double xSep, double ySep, double zSep,
        int xTimes, int yTimes, int zTimes
    ) {
        double cx = startX;
        for (int i = 0; i < xTimes; i++) {
            double cy = startY;
            for (int j = 0; j < yTimes; j++) {
                double cz = startZ;
                for (int k = 0; k < zTimes; k++) {
                    base = union(base, cuboid(
                        cx, cy, cz, cx + xLength, cy + yLength, cz + zLength
                    ));
                    cz += zSep;
                }
                cy += ySep;
            }
            cx += xSep;
        }
        return base;
    }

    public final byte asize;

    public DottedTPBlock(byte asize, Settings settings)
    throws IllegalArgumentException {
        super(settings);
        if ((asize < (byte)4 || asize > (byte)10) &&
            this.getClass() == DottedTPBlock.class) {
            throw new IllegalArgumentException(
                "The asize " + asize +
                " is not acceptable. You can extend this class."
            );
        }
        this.asize = asize;
        BlockState st = this.getDefaultState().with(BOTTOM, true);
        if (this.getWaterloggedProperty()) {
            st = st.with(WATERLOGGED, false);
        }
        this.setDefaultState(st);
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        if (state.get(BOTTOM).booleanValue()) {
            switch (this.asize) {
                case 4: return DOWN_4;
                case 5: return DOWN_5;
                case 6: return DOWN_6;
                case 7: return DOWN_7;
                case 8: return DOWN_8;
                case 9: return DOWN_9;
                case 10: return DOWN_10;
                default: return DOWN_BASE;
            }
        }
        switch (this.asize) {
            case 4: return UP_4;
            case 5: return UP_5;
            case 6: return UP_6;
            case 7: return UP_7;
            case 8: return UP_8;
            case 9: return UP_9;
            case 10: return UP_10;
            default: return UP_BASE;
        }
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(BOTTOM);
        if (this.getWaterloggedProperty()) {
            builder.add(WATERLOGGED);
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState st = this.getDefaultState().with(
            BOTTOM, ctx.getHitPos().y - ctx.getBlockPos().getY() < .5
        );
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
    public boolean getWaterloggedProperty() {
        return Main.getWaterloggedProperty();
    }
}
