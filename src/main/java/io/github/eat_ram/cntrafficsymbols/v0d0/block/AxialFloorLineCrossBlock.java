package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.block.FluidloggedConfigurable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;

public class AxialFloorLineCrossBlock extends HorizontalFacingBlock
implements FluidloggedConfigurable {
    private final VoxelShape[] shapes;

    public AxialFloorLineCrossBlock(int r, int wr, Settings settings) {
        super(settings);
        double sz = 2. * r / 16.;
        double ez = (2. * r + wr) / 16.;
        this.shapes = new VoxelShape[]{
            // Direction.SOUTH.getHorizontal() == 0
            union(cuboid(0.375, 0., 0., 0.625, 0.03125, 1.),
                  cuboid(0., 0., 1. - ez, 1., 0.03125, 1. - sz)),
            // Direction.WEST.getHorizontal() == 1
            union(cuboid(0., 0., 0.375, 1., 0.03125, 0.625),
                  cuboid(sz, 0., 0., ez, 0.03125, 1.)),
            // Direction.NORTH.getHorizontal() == 2
            union(cuboid(0.375, 0., 0., 0.625, 0.03125, 1.),
                  cuboid(0., 0., sz, 1., 0.03125, ez)),
            // Direction.EAST.getHorizontal() == 3
            union(cuboid(0., 0., 0.375, 1., 0.03125, 0.625),
                  cuboid(1. - ez, 0., 0., 1. - sz, 0.03125, 1.))
        };
        this
        .setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        return this.shapes[state.get(FACING).getHorizontalQuarterTurns()];
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.configurePlacedFluid(this.getDefaultState().with(
            FACING, ctx.getHorizontalPlayerFacing()
        ), ctx);
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
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
}
