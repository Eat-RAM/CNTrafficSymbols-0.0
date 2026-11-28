package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.block.BaseTrafficLightBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.HorizontalAttach4;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .TrafficLightBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.state.property.Properties.HORIZONTAL_FACING;

public abstract class HorizontalTrafficLightBlock
extends BaseTrafficLightBlock {
    @Contract("_ -> new")
    private static @NotNull VoxelShape @NotNull[] createShapes(double width) {
        double x1 = (16. - width) / 32.;
        double x2 = 1. - x1;
        VoxelShape[] shapes = new VoxelShape[16];
        for (Direction f : Direction.Type.HORIZONTAL) {
            int fIdx = f.getHorizontal() << 2;
            for (HorizontalAttach4 a : HorizontalAttach4.values()) {
                double y1;
                double y2;
                double z1;
                double z2;
                switch (a) {
                    case DOWN:
                        y1 = 0.;     y2 = 0.375;  z1 = 0.;  z2 = 0.25; break;
                    case UP:
                        y1 = 0.625;  y2 = 1.;     z1 = 0.;  z2 = 0.25; break;
                    case CEILING:
                        y1 = 0.625;  y2 = 1.;     z1 = 0.5; z2 = 0.75; break;
                    default:
                        y1 = 0.3125; y2 = 0.6875; z1 = 0.;  z2 = 0.25;
                }
                shapes[fIdx | a.id] = CountdownTimerBlock.createRotatedShape(
                    x1, y1, z1, x2, y2, z2, f
                );
            }
        }
        return shapes;
    }

    protected final @NotNull VoxelShape @NotNull[] shapesById;

    protected HorizontalTrafficLightBlock(
        int unitCount, Settings settings, double width
    ) {
        super(unitCount, settings);
        this.shapesById = createShapes(width);
        this.setDefaultState(
            this.getDefaultState().with(HORIZONTAL_FACING, Direction.SOUTH)
            .with(HorizontalAttach4.ATTACHMENT, HorizontalAttach4.MIDDLE)
        );
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TrafficLightBlockEntity(pos, state);
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, HorizontalAttach4.ATTACHMENT);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getOutlineShape(
        BlockState state, BlockView view, BlockPos pos, ShapeContext context
    ) {
        return this.shapesById[
            (state.get(HORIZONTAL_FACING).getHorizontal() << 2) |
            state.get(HorizontalAttach4.ATTACHMENT).id
        ];
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState st = this.getDefaultState();
        Direction side = ctx.getSide();
        Direction facing;
        HorizontalAttach4 attach;
        if (side == Direction.DOWN) {
            facing = ctx.getHorizontalPlayerFacing().getOpposite();
            attach = HorizontalAttach4.CEILING;
        } else if (side == Direction.UP) {
            facing = ctx.getHorizontalPlayerFacing().getOpposite();
            attach = HorizontalAttach4.DOWN;
        } else {
            facing = side;
            double ry = ctx.getHitPos().y - ctx.getBlockPos().getY();
            if (ry <= 0.33) {
                attach = HorizontalAttach4.DOWN;
            } else if (ry >= 0.67) {
                attach = HorizontalAttach4.UP;
            } else {
                attach = HorizontalAttach4.MIDDLE;
            }
        }
        return this.configurePlacedFluid(
            st.with(HORIZONTAL_FACING, facing)
            .with(HorizontalAttach4.ATTACHMENT, attach), ctx
        );
    }
}
