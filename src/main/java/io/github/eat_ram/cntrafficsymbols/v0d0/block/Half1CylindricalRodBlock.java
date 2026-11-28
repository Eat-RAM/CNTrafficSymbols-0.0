package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.block
       .AbstractCylindricalRodBlock;
import io.github.eat_ram.cntrafficsymbols.core.block.FluidloggedConfigurable;
import io.github.eat_ram.cntrafficsymbols.core.helper.FacePosition9Mirrorer;
import io.github.eat_ram.cntrafficsymbols.core.helper.FacePosition9Rotator;
import io.github.eat_ram.cntrafficsymbols.core.struct.FacePosition9;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import static io.github.eat_ram.cntrafficsymbols.core.helper.RangeUtil
              .closedRangeTo;

public class Half1CylindricalRodBlock extends AbstractCylindricalRodBlock
implements FluidloggedConfigurable {
    private static final VoxelShape[] COLLISION_SHAPES_BY_ID = {
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
    private static final VoxelShape[] OUTLINE_SHAPES_BY_ID = {
        OUTLINE_WEST_CENTER, OUTLINE_WEST_UPPER, OUTLINE_WEST_UPPERSOUTH,
        OUTLINE_WEST_SOUTH, OUTLINE_WEST_LOWERSOUTH, OUTLINE_WEST_LOWER,
        OUTLINE_WEST_LOWERNORTH, OUTLINE_WEST_NORTH, OUTLINE_WEST_UPPERNORTH,
        OUTLINE_EAST_CENTER, OUTLINE_EAST_UPPER, OUTLINE_EAST_UPPERSOUTH,
        OUTLINE_EAST_SOUTH, OUTLINE_EAST_LOWERSOUTH, OUTLINE_EAST_LOWER,
        OUTLINE_EAST_LOWERNORTH, OUTLINE_EAST_NORTH, OUTLINE_EAST_UPPERNORTH,
        OUTLINE_DOWN_CENTER, OUTLINE_DOWN_NORTH, OUTLINE_DOWN_NORTHEAST,
        OUTLINE_DOWN_EAST, OUTLINE_DOWN_SOUTHEAST, OUTLINE_DOWN_SOUTH,
        OUTLINE_DOWN_SOUTHWEST, OUTLINE_DOWN_WEST, OUTLINE_DOWN_NORTHWEST,
        OUTLINE_UP_CENTER, OUTLINE_UP_NORTH, OUTLINE_UP_NORTHEAST,
        OUTLINE_UP_EAST, OUTLINE_UP_SOUTHEAST, OUTLINE_UP_SOUTH,
        OUTLINE_UP_SOUTHWEST, OUTLINE_UP_WEST, OUTLINE_UP_NORTHWEST,
        OUTLINE_NORTH_CENTER, OUTLINE_NORTH_UPPER, OUTLINE_NORTH_UPPEREAST,
        OUTLINE_NORTH_EAST, OUTLINE_NORTH_LOWEREAST, OUTLINE_NORTH_LOWER,
        OUTLINE_NORTH_LOWERWEST, OUTLINE_NORTH_WEST, OUTLINE_NORTH_UPPERWEST,
        OUTLINE_SOUTH_CENTER, OUTLINE_SOUTH_UPPER, OUTLINE_SOUTH_UPPEREAST,
        OUTLINE_SOUTH_EAST, OUTLINE_SOUTH_LOWEREAST, OUTLINE_SOUTH_LOWER,
        OUTLINE_SOUTH_LOWERWEST, OUTLINE_SOUTH_WEST, OUTLINE_SOUTH_UPPERWEST
    };

    public Half1CylindricalRodBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(
            FacePosition9.POSITION, FacePosition9.DOWN_CENTER
        ));
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FacePosition9.POSITION);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        return OUTLINE_SHAPES_BY_ID[state.get(FacePosition9.POSITION).id];
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getCollisionShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        return COLLISION_SHAPES_BY_ID[state.get(FacePosition9.POSITION).id];
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState st = this.getDefaultState();
        double rx = ctx.getHitPos().x - ctx.getBlockPos().getX();
        double ry = ctx.getHitPos().y - ctx.getBlockPos().getY();
        double rz = ctx.getHitPos().z - ctx.getBlockPos().getZ();
        FacePosition9 rp = st.get(FacePosition9.POSITION);
        switch (ctx.getSide().getId()) {
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
    @SuppressWarnings("deprecation")
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
    @SuppressWarnings("deprecation")
    public BlockState mirror(BlockState st, BlockMirror mirror) {
        return mirror == BlockMirror.NONE ? st : st.with(
            FacePosition9.POSITION,
            mirror == BlockMirror.FRONT_BACK ?
            FacePosition9Mirrorer.mirrorX(st.get(FacePosition9.POSITION)) :
            FacePosition9Mirrorer.mirrorZ(st.get(FacePosition9.POSITION))
        );
    }
}
