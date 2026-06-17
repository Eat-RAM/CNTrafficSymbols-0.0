package rege.pegui.cntrafficsymbols.block;

import io.github.eat_ram.cntrafficsymbols.core.block.WideBoardBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing90;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import rege.pegui.cntrafficsymbols.Main;
import rege.pegui.cntrafficsymbols.be.HighwayExitDistanceInfoNameBlockEntity;

public class HighwayExitDistanceInfoMiddleBlock extends WideBoardBlock
implements BlockEntityProvider {
    public HighwayExitDistanceInfoMiddleBlock(
        WideBoardBlock cb, Settings settings
    ) {
        super(cb, settings);
    }

    @Override
    @Contract("_, _ -> new")
    public BlockEntity createBlockEntity(BlockPos p, BlockState st) {
        return new HighwayExitDistanceInfoNameBlockEntity(p, st);
    }

    @Override
    public void onPlaced(
        World world, BlockPos pos, BlockState state,
        @Nullable LivingEntity placer, ItemStack itemStack
    ) {
        if (world.isClient()) {
            world.getBlockEntity(
                pos, HighwayExitDistanceInfoNameBlockEntity.TYPE
            ).ifPresent(be -> be.setCustomName(itemStack.getCustomName()));
        } else if (itemStack.getCustomName() != null) {
            world.getBlockEntity(
                pos, HighwayExitDistanceInfoNameBlockEntity.TYPE
            ).ifPresent(be -> be.setCustomName(itemStack.getName()));
        }
    }

    @Override
    public ItemStack
    getPickStack(WorldView world, BlockPos pos, BlockState state, boolean includeData) {
        BlockEntity be = world.getBlockEntity(pos);
        if (!(be instanceof HighwayExitDistanceInfoNameBlockEntity)) {
            return super.getPickStack(world, pos, state, includeData);
        }
        ItemStack stack = new ItemStack(this.asItem(), state.get(
            DoubleFaceFacing90.FACING
        ).isSingle() ? 1 : 2);
        if (includeData) {
            stack.set(DataComponentTypes.CUSTOM_NAME, (
                (HighwayExitDistanceInfoNameBlockEntity)be).getCustomName()
            );
        }
        return stack;
    }

    @Override
    public boolean getWaterloggedProperty() {
        return Main.getWaterloggedProperty();
    }
}
