package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import java.util.List;

import io.github.eat_ram.cntrafficsymbols.core.block.FluidloggedConfigurable;
import io.github.eat_ram.cntrafficsymbols.core.block.HorizontalDiagonalBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.CoordCorner;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4d;
import org.joml.Vector4dc;

import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;

public class ChiralFloorLineCrossBlock extends HorizontalDiagonalBlock
implements FluidloggedConfigurable {
    public static final BooleanProperty TRANSPOSED =
    BooleanProperty.of("transposed");

    public static @NotNull List<Vector4dc>
    createBoxes(int r, int wr, int c, int wc) {
        return List.of(
            new Vector4d(0., 1. - (2 * r + wr) / 16., 1., 1. - (2 * r) / 16.),
            new Vector4d(1. - (2 * c + wc) / 16., 0., 1. - (2 * c) / 16., 1.)
        );
    }

    private static void populateShapes(
        VoxelShape[] target, int offset,
        double r_s, double r_e, double c_s, double c_e
    ) {
        target[offset] = union(
            cuboid(0., 0., r_s, 1., 0.03125, r_e),
            cuboid(c_s, 0., 0., c_e, 0.03125, 1.)
        );
        target[offset + 1] = union(
            cuboid(1. - r_e, 0., 0., 1. - r_s, 0.03125, 1.),
            cuboid(0., 0., c_s, 1., 0.03125, c_e)
        );
        target[offset + 2] = union(
            cuboid(0., 0., 1. - r_e, 1., 0.03125, 1. - r_s),
            cuboid(1. - c_e, 0., 0., 1. - c_s, 0.03125, 1.)
        );
        target[offset + 3] = union(
            cuboid(r_s, 0., 0., r_e, 0.03125, 1.),
            cuboid(0., 0., 1. - c_e, 1., 0.03125, 1. - c_s)
        );
    }

    private final VoxelShape[] chiralShapes = new VoxelShape[8];

    public ChiralFloorLineCrossBlock(
        int r, int wr, int c, int wc, Settings settings
    ) {
        super(createBoxes(r, wr, c, wc), 0., 0.03125, 45f, settings);
        double r_s = 1. - (2 * r + wr) / 16.;
        double r_e = 1. - (2 * r) / 16.;
        double c_s = 1. - (2 * c + wc) / 16.;
        double c_e = 1. - (2 * c) / 16.;
        populateShapes(this.chiralShapes, 0, r_s, r_e, c_s, c_e);
        // Transposed: row and col swapped
        populateShapes(this.chiralShapes, 4, c_s, c_e, r_s, r_e);
        this.setDefaultState(this.getDefaultState().with(TRANSPOSED, false));
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState state, BlockView world, BlockPos pos, ShapeContext context
    ) {
        return this.chiralShapes[
            state.get(CoordCorner.CORNER).id + (state.get(TRANSPOSED) ? 4 : 0)
        ];
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
        boolean transposed = Math.abs(u) > Math.abs(v);
        if (ctx.getPlayer() != null && ctx.getPlayer().isSneaking()) {
            transposed = !transposed;
        }
        BlockState state =
        this.getDefaultState().with(CoordCorner.CORNER, corner)
        .with(TRANSPOSED, transposed);
        return this.configurePlacedFluid(state, ctx);
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return super.mirror(state, mirror).with(
            TRANSPOSED, (mirror == BlockMirror.NONE) == state.get(TRANSPOSED)
        );
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(TRANSPOSED);
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
