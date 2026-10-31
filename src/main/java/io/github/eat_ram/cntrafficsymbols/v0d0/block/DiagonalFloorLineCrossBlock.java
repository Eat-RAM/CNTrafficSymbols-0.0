package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import java.util.List;

import io.github.eat_ram.cntrafficsymbols.core.block.FluidloggedConfigurable;
import io.github.eat_ram.cntrafficsymbols.core.block.HorizontalDiagonalBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.CoordCorner;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4d;
import org.joml.Vector4dc;

public class DiagonalFloorLineCrossBlock extends HorizontalDiagonalBlock
implements FluidloggedConfigurable {
    public static @NotNull List<Vector4dc>
    createBoxes(int r, int wr, int c, int wc) {
        return List.of(
            new Vector4d(0., 1. - (2 * r + wr) / 16., 1., 1. - (2 * r) / 16.),
            new Vector4d(1. - (2 * c + wc) / 16., 0., 1. - (2 * c) / 16., 1.)
        );
    }

    public DiagonalFloorLineCrossBlock(
        @NotNull Iterable<? extends @NotNull Vector4dc> boxes, Settings settings
    ) {
        super(boxes, 0., 0.03125, 45f, settings);
    }

    public DiagonalFloorLineCrossBlock(
        int r, int wr, int c, int wc, Settings settings
    ) {
        this(createBoxes(r, wr, c, wc), settings);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        double u = ctx.getHitPos().x - ctx.getBlockPos().getX() - 0.5;
        double v = ctx.getHitPos().z - ctx.getBlockPos().getZ() - 0.5;
        CoordCorner corner;
        if (u >= 0) {
            corner = (v >= 0) ? CoordCorner.SOUTHEAST : CoordCorner.NORTHEAST;
        } else {
            corner = (v >= 0) ? CoordCorner.SOUTHWEST : CoordCorner.NORTHWEST;
        }
        return this.configurePlacedFluid(
            this.getDefaultState().with(CoordCorner.CORNER, corner), ctx
        );
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
