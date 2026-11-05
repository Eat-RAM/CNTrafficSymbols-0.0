package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.block
       .AbstractCylindricalRodBlock;
import io.github.eat_ram.cntrafficsymbols.core.block.FluidloggedConfigurable;
import io.github.eat_ram.cntrafficsymbols.core.helper.AxisPosition9Mirrorer;
import io.github.eat_ram.cntrafficsymbols.core.helper.AxisPosition9Rotator;
import io.github.eat_ram.cntrafficsymbols.core.struct.AxisPosition9;
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

public class Full1CylindricalRodBlock extends AbstractCylindricalRodBlock
implements FluidloggedConfigurable {
    private static final VoxelShape[] SHAPES_BY_ID = {
        X_CENTER, X_UPPER, X_UPPERSOUTH, X_SOUTH, X_LOWERSOUTH, X_LOWER,
        X_LOWERNORTH, X_NORTH, X_UPPERNORTH, Y_CENTER, Y_NORTH, Y_NORTHEAST,
        Y_EAST, Y_SOUTHEAST, Y_SOUTH, Y_SOUTHWEST, Y_WEST, Y_NORTHWEST,
        Z_CENTER, Z_UPPER, Z_UPPEREAST, Z_EAST, Z_LOWEREAST, Z_LOWER,
        Z_LOWERWEST, Z_WEST, Z_UPPERWEST
    };

    public Full1CylindricalRodBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(
            AxisPosition9.POSITION, AxisPosition9.Y_CENTER
        ));
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AxisPosition9.POSITION);
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        return SHAPES_BY_ID[state.get(AxisPosition9.POSITION).id];
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState st = this.getDefaultState();
        double rx = ctx.getHitPos().x - ctx.getBlockPos().getX();
        double ry = ctx.getHitPos().y - ctx.getBlockPos().getY();
        double rz = ctx.getHitPos().z - ctx.getBlockPos().getZ();
        AxisPosition9 rp = st.get(AxisPosition9.POSITION);
        switch (ctx.getSide().getId()) {
            case 4:
            case 5:
                switch (closedRangeTo(.25, .75, ry) * 3 +
                        closedRangeTo(.25, .75, rz)) {
                    case -4: rp = AxisPosition9.X_LOWERNORTH; break;
                    case -3: rp = AxisPosition9.X_LOWER; break;
                    case -2: rp = AxisPosition9.X_LOWERSOUTH; break;
                    case -1: rp = AxisPosition9.X_NORTH; break;
                    case 0: rp = AxisPosition9.X_CENTER; break;
                    case 1: rp = AxisPosition9.X_SOUTH; break;
                    case 2: rp = AxisPosition9.X_UPPERNORTH; break;
                    case 3: rp = AxisPosition9.X_UPPER; break;
                    case 4: rp = AxisPosition9.X_UPPERSOUTH; break;
                }
                break;
            case 0:
            case 1:
                switch (closedRangeTo(.25, .75, rx) * 3 +
                        closedRangeTo(.25, .75, rz)) {
                    case -4: rp = AxisPosition9.Y_NORTHWEST; break;
                    case -3: rp = AxisPosition9.Y_WEST; break;
                    case -2: rp = AxisPosition9.Y_SOUTHWEST; break;
                    case -1: rp = AxisPosition9.Y_NORTH; break;
                    case 0: rp = AxisPosition9.Y_CENTER; break;
                    case 1: rp = AxisPosition9.Y_SOUTH; break;
                    case 2: rp = AxisPosition9.Y_NORTHEAST; break;
                    case 3: rp = AxisPosition9.Y_EAST; break;
                    case 4: rp = AxisPosition9.Y_SOUTHEAST; break;
                }
                break;
            case 2:
            case 3:
                switch (closedRangeTo(.25, .75, rx) * 3 +
                        closedRangeTo(.25, .75, ry)) {
                    case -4: rp = AxisPosition9.Z_LOWERWEST; break;
                    case -3: rp = AxisPosition9.Z_WEST; break;
                    case -2: rp = AxisPosition9.Z_UPPERWEST; break;
                    case -1: rp = AxisPosition9.Z_LOWER; break;
                    case 0: rp = AxisPosition9.Z_CENTER; break;
                    case 1: rp = AxisPosition9.Z_UPPER; break;
                    case 2: rp = AxisPosition9.Z_LOWEREAST; break;
                    case 3: rp = AxisPosition9.Z_EAST; break;
                    case 4: rp = AxisPosition9.Z_UPPEREAST; break;
                }
                break;
        }
        return this.configurePlacedFluid(
            st.with(AxisPosition9.POSITION, rp), ctx
        );
    }

    @Override
    public BlockState rotate(BlockState st, BlockRotation rot) {
        return rot == BlockRotation.NONE ? st : st.with(
            AxisPosition9.POSITION, AxisPosition9Rotator.rotate(
                st.get(AxisPosition9.POSITION),
                rot == BlockRotation.CLOCKWISE_90 ? 1 :
                (rot == BlockRotation.CLOCKWISE_180 ? 2 : 3)
            )
        );
    }

    @Override
    public BlockState mirror(BlockState st, BlockMirror mirror) {
        return mirror == BlockMirror.NONE ? st : st.with(
            AxisPosition9.POSITION,
            mirror == BlockMirror.FRONT_BACK ?
            AxisPosition9Mirrorer.mirrorX(st.get(AxisPosition9.POSITION)) :
            AxisPosition9Mirrorer.mirrorZ(st.get(AxisPosition9.POSITION))
        );
    }
}
