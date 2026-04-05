package rege.pegui.cntrafficsymbols.block;

import io.github.eat_ram.cntrafficsymbols.core.block
       .Attachment3DoubleFaceFacingBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.Attachment3;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import rege.pegui.cntrafficsymbols.Main;
import rege.pegui.cntrafficsymbols.be.HighwayHmSignBlockEntity;

import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.empty;

public class HighwayHmSignBlock extends Attachment3DoubleFaceFacingBlock
    implements net.minecraft.block.BlockEntityProvider {
    public static final VoxelShape SHAPE0 =
    cuboid(.375, .375, .375, .625, .625, .625);
    public static final VoxelShape SHAPE0N =
    cuboid(.375, .375, .9375, .625, .625, 1);
    public static final VoxelShape SHAPE0E =
    cuboid(0, .375, .375, .0625, .625, .625);
    public static final VoxelShape SHAPE0S =
    cuboid(.375, .375, 0, .625, .625, .0625);
    public static final VoxelShape SHAPE0W =
    cuboid(.9375, .375, .375, 1, .625, .625);
    public static final VoxelShape SHAPE1 =
    cuboid(.375, 0, .375, .625, .25, .625);
    public static final VoxelShape SHAPE1N =
    cuboid(.375, 0, .9375, .625, .25, 1);
    public static final VoxelShape SHAPE1E =
    cuboid(0, 0, .375, .0625, .25, .625);
    public static final VoxelShape SHAPE1S =
    cuboid(.375, 0, 0, .625, .25, .0625);
    public static final VoxelShape SHAPE1W =
    cuboid(.9375, 0, .375, 1, .25, .625);
    public static final VoxelShape SHAPE2 =
    cuboid(.375, .75, .375, .625, 1, .625);
    public static final VoxelShape SHAPE2N =
    cuboid(.375, .75, .9375, .625, 1, 1);
    public static final VoxelShape SHAPE2E =
    cuboid(0, .75, .375, .0625, 1, .625);
    public static final VoxelShape SHAPE2S =
    cuboid(.375, .75, 0, .625, 1, .0625);
    public static final VoxelShape SHAPE2W =
    cuboid(.9375, .75, .375, 1, 1, .625);

    public HighwayHmSignBlock(Settings settings) {
        super(settings);
    }

    @Override
    @Contract("_, _ -> new")
    public BlockEntity createBlockEntity(BlockPos p, BlockState st) {
        return new HighwayHmSignBlockEntity(p, st);
    }

    @Override
    public VoxelShape
    getOutlineShape(BlockState st, BlockView v, BlockPos p, ShapeContext c) {
        int f = st.get(DoubleFaceFacing.FACING).id;
        int i = st.get(Attachment3.ATTACHMENT).id;
        switch (f) {
            case 24:
                switch (i) {
                    case 1: return SHAPE1N;
                    case 2: return SHAPE2N;
                    default: return SHAPE0N;
                }
            case 25:
                switch (i) {
                    case 1: return SHAPE1E;
                    case 2: return SHAPE2E;
                    default: return SHAPE0E;
                }
            case 26:
                switch (i) {
                    case 1: return SHAPE1S;
                    case 2: return SHAPE2S;
                    default: return SHAPE0S;
                }
            case 27:
                switch (i) {
                    case 1: return SHAPE1W;
                    case 2: return SHAPE2W;
                    default: return SHAPE0W;
                }
        }
        switch (i) {
            case 1: return SHAPE1;
            case 2: return SHAPE2;
            default: return SHAPE0;
        }
    }

    @Override
    public VoxelShape getCollisionShape(
        BlockState state, BlockView world, BlockPos pos, ShapeContext context
    ) {
        return empty();
    }

    @Override
    public void onPlaced(
        World world, BlockPos pos, BlockState state,
        @Nullable LivingEntity placer, ItemStack itemStack
    ) {
        if (world.isClient) {
            world.getBlockEntity(pos, HighwayHmSignBlockEntity.TYPE).ifPresent(
                be -> be.setCustomName(itemStack.hasCustomName() ?
                                       itemStack.getName() : null)
            );
        } else if (itemStack.hasCustomName()) {
            world.getBlockEntity(pos, HighwayHmSignBlockEntity.TYPE).ifPresent(
                be -> be.setCustomName(itemStack.getName())
            );
        }
    }

    @Override
    public ItemStack
    getPickStack(WorldView world, BlockPos pos, BlockState state) {
        BlockEntity be = world.getBlockEntity(pos);
        return (be instanceof HighwayHmSignBlockEntity) ?
               new ItemStack(this.asItem(), state.get(
                   DoubleFaceFacing.FACING
               ).isSingle() ? 1 : 2).setCustomName(
                   ((HighwayHmSignBlockEntity)be).getCustomName()
               ) : super.getPickStack(world, pos, state);
    }

    @Override
    public boolean getWaterloggedProperty() {
        return Main.getWaterloggedProperty();
    }
}
