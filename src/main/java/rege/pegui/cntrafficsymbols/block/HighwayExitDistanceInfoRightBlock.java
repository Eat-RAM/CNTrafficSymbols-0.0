package rege.pegui.cntrafficsymbols.block;

import io.github.eat_ram.cntrafficsymbols.core.block.WideBoardBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing90;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import rege.pegui.cntrafficsymbols.Main;
import rege.pegui.cntrafficsymbols.be.HighwayExitDistanceInfoKmBlockEntity;

public class HighwayExitDistanceInfoRightBlock extends WideBoardBlock
implements BlockEntityProvider {
    public HighwayExitDistanceInfoRightBlock(
        WideBoardBlock cb, Settings settings
    ) {
        super(cb, settings);
    }

    @Override
    @Contract("_, _ -> new")
    public BlockEntity createBlockEntity(BlockPos p, BlockState st) {
        return new HighwayExitDistanceInfoKmBlockEntity(p, st);
    }

    @Override
    public void onPlaced(
        World world, BlockPos pos, BlockState state,
        @Nullable LivingEntity placer, ItemStack itemStack
    ) {
        if (world.isClient) {
            world.getBlockEntity(
                pos, HighwayExitDistanceInfoKmBlockEntity.TYPE
            ).ifPresent(be -> {
                 if (itemStack.hasCustomName()) {
                     try {
                         be.setKm(Float.parseFloat(
                             itemStack.getName().getString()
                         ));
                     } catch (NumberFormatException ignored) {}
                 }
             });
        } else if (itemStack.hasCustomName()) {
            world.getBlockEntity(
                pos, HighwayExitDistanceInfoKmBlockEntity.TYPE
            ).ifPresent(be -> {
                 try {
                     be.setKm(Float.parseFloat(
                         itemStack.getName().getString()
                     ));
                 } catch (NumberFormatException ignored) {}
             });
        }
    }

    @Override
    public ItemStack
    getPickStack(WorldView world, BlockPos pos, BlockState state) {
        BlockEntity be = world.getBlockEntity(pos);
        return (be instanceof HighwayExitDistanceInfoKmBlockEntity) ?
               new ItemStack(this.asItem(), state.get(
                   DoubleFaceFacing90.FACING
               ).isSingle() ? 1 : 2).setCustomName(
                   ((HighwayExitDistanceInfoKmBlockEntity)be).getCustomName()
               ) : super.getPickStack(world, pos, state);
    }

    @Override
    public boolean getWaterloggedProperty() {
        return Main.getWaterloggedProperty();
    }
}
