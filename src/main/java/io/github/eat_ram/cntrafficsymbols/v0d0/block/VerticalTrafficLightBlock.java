package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.block.BaseTrafficLightBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.VerticalAttach3;
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

public abstract class VerticalTrafficLightBlock extends BaseTrafficLightBlock {
    @Contract("_ -> new")
    private static @NotNull VoxelShape @NotNull[] createShapes(double height) {
        double y1 = (16. - height) / 32.;
        double y2 = 1. - y1;
        double z1 = 0.;
        double z2 = .25;
        VoxelShape[] shapes = new VoxelShape[12];
        for (Direction f : Direction.Type.HORIZONTAL) {
            int fIdx = f.getHorizontal() * 3;
            for (VerticalAttach3 a : VerticalAttach3.values()) {
                double x1;
                double x2;
                switch (a) {
                    case LEFT:  x1 = 0.;     x2 = 0.375; break;
                    case RIGHT: x1 = 0.625;  x2 = 1.;    break;
                    default:    x1 = 0.3125; x2 = 0.6875;
                }
                shapes[fIdx + a.id] = CountdownTimerBlock.createRotatedShape(
                    x1, y1, z1, x2, y2, z2, f
                );
            }
        }
        return shapes;
    }

    protected final @NotNull VoxelShape @NotNull[] shapesById;

    protected VerticalTrafficLightBlock(
        int unitCount, Settings settings, double height
    ) {
        super(unitCount, settings);
        this.shapesById = createShapes(height);
        this.setDefaultState(
            this.getDefaultState().with(HORIZONTAL_FACING, Direction.SOUTH)
            .with(VerticalAttach3.ATTACHMENT, VerticalAttach3.MIDDLE)
        );
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TrafficLightBlockEntity(pos, state);
    }

    @Override
    protected void
    appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, VerticalAttach3.ATTACHMENT);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getOutlineShape(
        BlockState st, BlockView v, BlockPos p, ShapeContext c
    ) {
        return this.shapesById[
            st.get(HORIZONTAL_FACING).getHorizontal() * 3 +
            st.get(VerticalAttach3.ATTACHMENT).id
        ];
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState st = this.getDefaultState();
        Direction side = ctx.getSide();
        Direction facing;
        VerticalAttach3 attach;
        if (side.getAxis().isVertical()) {
            facing = ctx.getHorizontalPlayerFacing().getOpposite();
            attach = VerticalAttach3.MIDDLE;
        } else {
            facing = side;
            double hitCross = switch (side) {
                case SOUTH -> ctx.getHitPos().x - ctx.getBlockPos().getX();
                case NORTH ->
                    1. - (ctx.getHitPos().x - ctx.getBlockPos().getX());
                case EAST  ->
                    1. - (ctx.getHitPos().z - ctx.getBlockPos().getZ());
                case WEST  -> ctx.getHitPos().z - ctx.getBlockPos().getZ();
                default    -> .5;
            };
            if (hitCross <= 0.33) {
                attach = VerticalAttach3.LEFT;
            } else if (hitCross >= 0.67) {
                attach = VerticalAttach3.RIGHT;
            } else {
                attach = VerticalAttach3.MIDDLE;
            }
        }
        return this.configurePlacedFluid(
            st.with(HORIZONTAL_FACING, facing)
            .with(VerticalAttach3.ATTACHMENT, attach), ctx
        );
    }
}
