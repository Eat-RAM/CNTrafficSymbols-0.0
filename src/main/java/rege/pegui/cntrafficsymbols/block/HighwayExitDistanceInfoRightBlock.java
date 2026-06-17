package rege.pegui.cntrafficsymbols.block;

import io.github.eat_ram.cntrafficsymbols.core.block.WideBoardBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing90;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
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
        if (world.isClient()) {
            world.getBlockEntity(
                pos, HighwayExitDistanceInfoKmBlockEntity.TYPE
            ).ifPresent(be -> {
                Text cn = itemStack.getCustomName();
                 if (cn != null) {
                     try {
                         be.setKm(Float.parseFloat(cn.getString()));
                     } catch (NumberFormatException ignored) {}
                 }
             });
        } else if (itemStack.getCustomName() != null) {
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
    getPickStack(WorldView world, BlockPos pos, BlockState state, boolean includeData) {
        BlockEntity be = world.getBlockEntity(pos);
        if (!(be instanceof HighwayExitDistanceInfoKmBlockEntity)) {
            return super.getPickStack(world, pos, state, includeData);
        }
        ItemStack stack = new ItemStack(this.asItem(), state.get(
            DoubleFaceFacing90.FACING
        ).isSingle() ? 1 : 2);
        if (includeData) {
            stack.set(DataComponentTypes.CUSTOM_NAME, (
                (HighwayExitDistanceInfoKmBlockEntity)be).getCustomName()
            );
        }
        return stack;
    }

    @Override
    public boolean getWaterloggedProperty() {
        return Main.getWaterloggedProperty();
    }
}
