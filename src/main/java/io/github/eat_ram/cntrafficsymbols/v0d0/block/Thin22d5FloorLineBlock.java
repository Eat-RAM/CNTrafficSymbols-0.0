package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.block.FluidloggedConfigurable;
import io.github.eat_ram.cntrafficsymbols.core.struct.QuadrantsQuadrisector;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.empty;

public class Thin22d5FloorLineBlock extends Block
implements FluidloggedConfigurable {
    public static final double TAN_22D30M = Math.tan(Math.toRadians(22.5));
    private static final VoxelShape[] OUTLINE_SHAPES_O = new VoxelShape[24];
    private static final VoxelShape[] OUTLINE_SHAPES_A = new VoxelShape[24];

    static {
        for (int s = 0; s < 24; s++) {
            OUTLINE_SHAPES_O[s] =
            cuboid((s - 6) / 24., 0., 0., (s + 7) / 24., 0.03125, 1.);
            OUTLINE_SHAPES_A[s] =
            cuboid(0., 0., (s - 6) / 24., 1., 0.03125, (s + 7) / 24.);
        }
    }

    public Thin22d5FloorLineBlock(Settings settings) {
        super(settings);
        this.setDefaultState(
            this.getDefaultState().with(Thin45FloorLineBlock.SHIFT, 0)
            .with(QuadrantsQuadrisector.ROTATION, QuadrantsQuadrisector.Q13O)
        );
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        QuadrantsQuadrisector rot = state.get(QuadrantsQuadrisector.ROTATION);
        return (
            (rot == QuadrantsQuadrisector.Q13O ||
             rot == QuadrantsQuadrisector.Q24O) ? OUTLINE_SHAPES_O :
            OUTLINE_SHAPES_A
        )[state.get(Thin45FloorLineBlock.SHIFT)];
    }

    @Override
    public VoxelShape getCollisionShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        return empty();
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder
        .add(Thin45FloorLineBlock.SHIFT, QuadrantsQuadrisector.ROTATION);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        int angle = Math.floorMod((int)Math.floor(ctx.getPlayerYaw()), 180);
        QuadrantsQuadrisector rot;
        if (angle < 45) {
            rot = QuadrantsQuadrisector.Q24O;
        } else if (angle < 90) {
            rot = QuadrantsQuadrisector.Q24A;
        } else if (angle < 135) {
            rot = QuadrantsQuadrisector.Q13A;
        } else {
            rot = QuadrantsQuadrisector.Q13O;
        }

        Vec3d hpos = ctx.getHitPos();
        BlockPos bp = ctx.getBlockPos();
        double rel;
        switch (rot) {
            case Q13A:
                rel = hpos.z - bp.getZ() - (
                    (hpos.x - 0.5 - bp.getX()) * TAN_22D30M
                );
                break;
            case Q13O:
                rel = hpos.x - bp.getX() - (
                    (hpos.z - 0.5 - bp.getZ()) * TAN_22D30M
                );
                break;
            case Q24O:
                rel = hpos.x - bp.getX() + (
                    (hpos.z - 0.5 - bp.getZ()) * TAN_22D30M
                );
                break;
            default:
                rel = hpos.z - bp.getZ() + (
                    (hpos.x - 0.5 - bp.getX()) * TAN_22D30M
                );
        }
        int shift = Math.max(0, Math.min(23, (int)Math.floor(rel * 24.)));

        BlockState state =
        this.getDefaultState().with(Thin45FloorLineBlock.SHIFT, shift)
        .with(QuadrantsQuadrisector.ROTATION, rot);
        return this.configurePlacedFluid(state, ctx);
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

    @Override
    public boolean canBucketPlace(BlockState state, Fluid fluid) {
        return false;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        QuadrantsQuadrisector rot = state.get(QuadrantsQuadrisector.ROTATION);
        int s = state.get(Thin45FloorLineBlock.SHIFT);
        switch (rotation) {
            case CLOCKWISE_90:
                return (rot == QuadrantsQuadrisector.Q13A ||
                        rot == QuadrantsQuadrisector.Q24A) ?
                       state.with(QuadrantsQuadrisector.ROTATION, rot.turn())
                       .with(Thin45FloorLineBlock.SHIFT, 23 - s) :
                       state.with(QuadrantsQuadrisector.ROTATION, rot.turn());
            case CLOCKWISE_180:
                return state.with(Thin45FloorLineBlock.SHIFT, 23 - s);
            case COUNTERCLOCKWISE_90:
                return (rot == QuadrantsQuadrisector.Q13O ||
                        rot == QuadrantsQuadrisector.Q24O) ?
                       state.with(QuadrantsQuadrisector.ROTATION, rot.turn())
                       .with(Thin45FloorLineBlock.SHIFT, 23 - s) :
                       state.with(QuadrantsQuadrisector.ROTATION, rot.turn());
            default: return state;
        }
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        QuadrantsQuadrisector rot = state.get(QuadrantsQuadrisector.ROTATION);
        int s = state.get(Thin45FloorLineBlock.SHIFT);
        switch (mirror) {
            case LEFT_RIGHT:
                return (rot == QuadrantsQuadrisector.Q13O ||
                        rot == QuadrantsQuadrisector.Q24O) ?
                       state.with(QuadrantsQuadrisector.ROTATION, rot.flip())
                       .with(Thin45FloorLineBlock.SHIFT, 23 - s) :
                       state.with(QuadrantsQuadrisector.ROTATION, rot.flip());
            case FRONT_BACK:
                return (rot == QuadrantsQuadrisector.Q13A ||
                        rot == QuadrantsQuadrisector.Q24A) ?
                       state.with(QuadrantsQuadrisector.ROTATION, rot.flip())
                       .with(Thin45FloorLineBlock.SHIFT, 23 - s) :
                       state.with(QuadrantsQuadrisector.ROTATION, rot.flip());
            default: return state;
        }
    }
}
