package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.block.FluidloggedConfigurable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;

public class CenterSymmetricFloorLineCrossBlock extends Block
implements FluidloggedConfigurable {
    public static final VoxelShape SHAPE = union(
        cuboid(0., 0., 0.375, 1., 0.03125, 0.625),
        cuboid(0.375, 0., 0., 0.625, 0.03125, 1.)
    );

    public CenterSymmetricFloorLineCrossBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        return SHAPE;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.configurePlacedFluid(this.getDefaultState(), ctx);
    }

    @Override
    public BlockState getStateForNeighborUpdate(
        BlockState state, Direction direction, BlockState neighborState,
        WorldAccess world, BlockPos pos, BlockPos neighborPos
    ) {
        FluidState fs = state.getFluidState();
        if (!fs.isEmpty()) {
            Fluid fluid = fs.getFluid();
            world.scheduleFluidTick(pos, fluid, fluid.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(
            state, direction, neighborState, world, pos, neighborPos
        );
    }
}
