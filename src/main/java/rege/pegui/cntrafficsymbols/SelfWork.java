package rege.pegui.cntrafficsymbols;

import java.util.List;

import io.github.eat_ram.cntrafficsymbols.core.block.CircleStandingSymbolBlock;
import io.github.eat_ram.cntrafficsymbols.core.block.DoubleFaceFacingBlock;
import io.github.eat_ram.cntrafficsymbols.core.block
       .SquareQuarterDefaulted3Block;
import io.github.eat_ram.cntrafficsymbols.core.block.WideBoardBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import org.jetbrains.annotations.Contract;
import rege.pegui.cntrafficsymbols.block.DottedTPBlock;
import rege.pegui.cntrafficsymbols.block.FloorLineEighthBlock;
import rege.pegui.cntrafficsymbols.block.Full1CylindricalRodBlock;
import rege.pegui.cntrafficsymbols.block.Half1CylindricalRodBlock;
import rege.pegui.cntrafficsymbols.block.HighwayExitDistanceInfoLeftBlock;
import rege.pegui.cntrafficsymbols.block.HighwayExitDistanceInfoMiddleBlock;
import rege.pegui.cntrafficsymbols.block.HighwayExitDistanceInfoRightBlock;
import rege.pegui.cntrafficsymbols.block.HighwayHmSignBlock;
import rege.pegui.cntrafficsymbols.block.LinedTPBlock;
import rege.pegui.cntrafficsymbols.block.RodWithLampBlock;
/*import rege.rege.minecraftmod.number_id_revival.state.BlockProperties;
import rege.rege.minecraftmod.number_id_revival.state.numberid.BlockNumberIDRecognitionRegistry;
import
    rege.rege.minecraftmod.number_id_revival.state.numberid.BlockNumberIDRegistry;
import
    rege.rege.minecraftmod.number_id_revival.state.numberid.ItemNumberIDRegistry;

import static net.minecraft.block.Blocks.AIR;
import static net.minecraft.block.Blocks.WATER;*/
import static io.github.eat_ram.cntrafficsymbols.v0d0.bakcompa.DualIds.commitAndGet;
import static io.github.eat_ram.cntrafficsymbols.v0d0.bakcompa.DualIds.push;
import static io.github.eat_ram.cntrafficsymbols.v0d0.helper.RegisterHelper.*;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;
import static rege.pegui.cntrafficsymbols.Main
              .getHardcodedBarricades1LootEnabled;
import static rege.pegui.cntrafficsymbols.Main.getWaterloggedProperty;

public class SelfWork {
    public static final List<String> COLORS_MC16 = List.of(
        "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink",
        "gray", "light_gray", "cyan", "purple", "blue", "brown", "green",
        "red", "black"
    );

    public static class Blocks {
        public static final Block SPEEDLIMIT_HIGH_3 = registerBlock(
            commitDouble("speedlimit_high_3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_3 = registerBlock(
            commitDouble("speedlimit_low_3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_5 = registerBlock(
            commitDouble("speedlimit_high_5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_5 = registerBlock(
            commitDouble("speedlimit_low_5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_10 = registerBlock(
            commitDouble("speedlimit_high_10"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_10 = registerBlock(
            commitDouble("speedlimit_low_10"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_15 = registerBlock(
            commitDouble("speedlimit_high_15"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_15 = registerBlock(
            commitDouble("speedlimit_low_15"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_20 = registerBlock(
            commitDouble("speedlimit_high_20"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_20 = registerBlock(
            commitDouble("speedlimit_low_20"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_25 = registerBlock(
            commitDouble("speedlimit_high_25"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_25 = registerBlock(
            commitDouble("speedlimit_low_25"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_30 = registerBlock(
            commitDouble("speedlimit_high_30"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_30 = registerBlock(
            commitDouble("speedlimit_low_30"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_35 = registerBlock(
            commitDouble("speedlimit_high_35"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_35 = registerBlock(
            commitDouble("speedlimit_low_35"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_40 = registerBlock(
            commitDouble("speedlimit_high_40"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_40 = registerBlock(
            commitDouble("speedlimit_low_40"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_45 = registerBlock(
            commitDouble("speedlimit_high_45"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_45 = registerBlock(
            commitDouble("speedlimit_low_45"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_50 = registerBlock(
            commitDouble("speedlimit_high_50"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_50 = registerBlock(
            commitDouble("speedlimit_low_50"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_55 = registerBlock(
            commitDouble("speedlimit_high_55"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_55 = registerBlock(
            commitDouble("speedlimit_low_55"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_60 = registerBlock(
            commitDouble("speedlimit_high_60"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_60 = registerBlock(
            commitDouble("speedlimit_low_60"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_65 = registerBlock(
            commitDouble("speedlimit_high_65"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_65 = registerBlock(
            commitDouble("speedlimit_low_65"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_70 = registerBlock(
            commitDouble("speedlimit_high_70"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_70 = registerBlock(
            commitDouble("speedlimit_low_70"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_75 = registerBlock(
            commitDouble("speedlimit_high_75"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_75 = registerBlock(
            commitDouble("speedlimit_low_75"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_80 = registerBlock(
            commitDouble("speedlimit_high_80"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_80 = registerBlock(
            commitDouble("speedlimit_low_80"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_85 = registerBlock(
            commitDouble("speedlimit_high_85"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_85 = registerBlock(
            commitDouble("speedlimit_low_85"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_90 = registerBlock(
            commitDouble("speedlimit_high_90"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_90 = registerBlock(
            commitDouble("speedlimit_low_90"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_95 = registerBlock(
            commitDouble("speedlimit_high_95"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_95 = registerBlock(
            commitDouble("speedlimit_low_95"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_100 = registerBlock(
            commitDouble("speedlimit_high_100"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_100 = registerBlock(
            commitDouble("speedlimit_low_100"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_105 = registerBlock(
            commitDouble("speedlimit_high_105"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_105 = registerBlock(
            commitDouble("speedlimit_low_105"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_110 = registerBlock(
            commitDouble("speedlimit_high_110"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_110 = registerBlock(
            commitDouble("speedlimit_low_110"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_115 = registerBlock(
            commitDouble("speedlimit_high_115"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_115 = registerBlock(
            commitDouble("speedlimit_low_115"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_120 = registerBlock(
            commitDouble("speedlimit_high_120"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_120 = registerBlock(
            commitDouble("speedlimit_low_120"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_125 = registerBlock(
            commitDouble("speedlimit_high_125"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_125 = registerBlock(
            commitDouble("speedlimit_low_125"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_130 = registerBlock(
            commitDouble("speedlimit_high_130"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_130 = registerBlock(
            commitDouble("speedlimit_low_130"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_135 = registerBlock(
            commitDouble("speedlimit_high_135"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_135 = registerBlock(
            commitDouble("speedlimit_low_135"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_140 = registerBlock(
            commitDouble("speedlimit_high_140"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_140 = registerBlock(
            commitDouble("speedlimit_low_140"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_145 = registerBlock(
            commitDouble("speedlimit_high_145"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_145 = registerBlock(
            commitDouble("speedlimit_low_145"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_150 = registerBlock(
            commitDouble("speedlimit_high_150"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_150 = registerBlock(
            commitDouble("speedlimit_low_150"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_HIGH_SPECIAL = registerBlock(
            commitDouble("speedlimit_high_special"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block SPEEDLIMIT_LOW_SPECIAL = registerBlock(
            commitDouble("speedlimit_low_special"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_3 = registerBlock(
            commitDouble("lift_speedlimit_high_3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_5 = registerBlock(
            commitDouble("lift_speedlimit_high_5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_10 = registerBlock(
            commitDouble("lift_speedlimit_high_10"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_15 = registerBlock(
            commitDouble("lift_speedlimit_high_15"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_20 = registerBlock(
            commitDouble("lift_speedlimit_high_20"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_25 = registerBlock(
            commitDouble("lift_speedlimit_high_25"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_30 = registerBlock(
            commitDouble("lift_speedlimit_high_30"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_35 = registerBlock(
            commitDouble("lift_speedlimit_high_35"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_40 = registerBlock(
            commitDouble("lift_speedlimit_high_40"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_45 = registerBlock(
            commitDouble("lift_speedlimit_high_45"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_50 = registerBlock(
            commitDouble("lift_speedlimit_high_50"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_55 = registerBlock(
            commitDouble("lift_speedlimit_high_55"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_60 = registerBlock(
            commitDouble("lift_speedlimit_high_60"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_65 = registerBlock(
            commitDouble("lift_speedlimit_high_65"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_70 = registerBlock(
            commitDouble("lift_speedlimit_high_70"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_75 = registerBlock(
            commitDouble("lift_speedlimit_high_75"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_80 = registerBlock(
            commitDouble("lift_speedlimit_high_80"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_85 = registerBlock(
            commitDouble("lift_speedlimit_high_85"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_90 = registerBlock(
            commitDouble("lift_speedlimit_high_90"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_95 = registerBlock(
            commitDouble("lift_speedlimit_high_95"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_100 = registerBlock(
            commitDouble("lift_speedlimit_high_100"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_105 = registerBlock(
            commitDouble("lift_speedlimit_high_105"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_110 = registerBlock(
            commitDouble("lift_speedlimit_high_110"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_115 = registerBlock(
            commitDouble("lift_speedlimit_high_115"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_120 = registerBlock(
            commitDouble("lift_speedlimit_high_120"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_125 = registerBlock(
            commitDouble("lift_speedlimit_high_125"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_130 = registerBlock(
            commitDouble("lift_speedlimit_high_130"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_135 = registerBlock(
            commitDouble("lift_speedlimit_high_135"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_140 = registerBlock(
            commitDouble("lift_speedlimit_high_140"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_145 = registerBlock(
            commitDouble("lift_speedlimit_high_145"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_150 = registerBlock(
            commitDouble("lift_speedlimit_high_150"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block LIFT_SPEEDLIMIT_HIGH_SPECIAL = registerBlock(
            commitDouble("lift_speedlimit_high_special"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block CIRCLE_BACKBOARD = registerBlock(
            commitDouble("circle_backboard"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_SPECIAL = registerBlock(
            commitDouble("heightlimit_special"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_0D1 = registerBlock(
            commitDouble("heightlimit_0d1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_0D2 = registerBlock(
            commitDouble("heightlimit_0d2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_0D3 = registerBlock(
            commitDouble("heightlimit_0d3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_0D4 = registerBlock(
            commitDouble("heightlimit_0d4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_0D5 = registerBlock(
            commitDouble("heightlimit_0d5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_0D6 = registerBlock(
            commitDouble("heightlimit_0d6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_0D7 = registerBlock(
            commitDouble("heightlimit_0d7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_0D8 = registerBlock(
            commitDouble("heightlimit_0d8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_0D9 = registerBlock(
            commitDouble("heightlimit_0d9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_1 = registerBlock(
            commitDouble("heightlimit_1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_1D1 = registerBlock(
            commitDouble("heightlimit_1d1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_1D2 = registerBlock(
            commitDouble("heightlimit_1d2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_1D3 = registerBlock(
            commitDouble("heightlimit_1d3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_1D4 = registerBlock(
            commitDouble("heightlimit_1d4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_1D5 = registerBlock(
            commitDouble("heightlimit_1d5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_1D6 = registerBlock(
            commitDouble("heightlimit_1d6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_1D7 = registerBlock(
            commitDouble("heightlimit_1d7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_1D8 = registerBlock(
            commitDouble("heightlimit_1d8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_1D9 = registerBlock(
            commitDouble("heightlimit_1d9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_2 = registerBlock(
            commitDouble("heightlimit_2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_2D1 = registerBlock(
            commitDouble("heightlimit_2d1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_2D2 = registerBlock(
            commitDouble("heightlimit_2d2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_2D3 = registerBlock(
            commitDouble("heightlimit_2d3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_2D4 = registerBlock(
            commitDouble("heightlimit_2d4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_2D5 = registerBlock(
            commitDouble("heightlimit_2d5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_2D6 = registerBlock(
            commitDouble("heightlimit_2d6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_2D7 = registerBlock(
            commitDouble("heightlimit_2d7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_2D8 = registerBlock(
            commitDouble("heightlimit_2d8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_2D9 = registerBlock(
            commitDouble("heightlimit_2d9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_3 = registerBlock(
            commitDouble("heightlimit_3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_3D1 = registerBlock(
            commitDouble("heightlimit_3d1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_3D2 = registerBlock(
            commitDouble("heightlimit_3d2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_3D3 = registerBlock(
            commitDouble("heightlimit_3d3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_3D4 = registerBlock(
            commitDouble("heightlimit_3d4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_3D5 = registerBlock(
            commitDouble("heightlimit_3d5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_3D6 = registerBlock(
            commitDouble("heightlimit_3d6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_3D7 = registerBlock(
            commitDouble("heightlimit_3d7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_3D8 = registerBlock(
            commitDouble("heightlimit_3d8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_3D9 = registerBlock(
            commitDouble("heightlimit_3d9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_4 = registerBlock(
            commitDouble("heightlimit_4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_4D1 = registerBlock(
            commitDouble("heightlimit_4d1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_4D2 = registerBlock(
            commitDouble("heightlimit_4d2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_4D3 = registerBlock(
            commitDouble("heightlimit_4d3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_4D4 = registerBlock(
            commitDouble("heightlimit_4d4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_4D5 = registerBlock(
            commitDouble("heightlimit_4d5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_4D6 = registerBlock(
            commitDouble("heightlimit_4d6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_4D7 = registerBlock(
            commitDouble("heightlimit_4d7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_4D8 = registerBlock(
            commitDouble("heightlimit_4d8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_4D9 = registerBlock(
            commitDouble("heightlimit_4d9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_5 = registerBlock(
            commitDouble("heightlimit_5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_5D1 = registerBlock(
            commitDouble("heightlimit_5d1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_5D2 = registerBlock(
            commitDouble("heightlimit_5d2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_5D3 = registerBlock(
            commitDouble("heightlimit_5d3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_5D4 = registerBlock(
            commitDouble("heightlimit_5d4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_5D5 = registerBlock(
            commitDouble("heightlimit_5d5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_5D6 = registerBlock(
            commitDouble("heightlimit_5d6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_5D7 = registerBlock(
            commitDouble("heightlimit_5d7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_5D8 = registerBlock(
            commitDouble("heightlimit_5d8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_5D9 = registerBlock(
            commitDouble("heightlimit_5d9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_6 = registerBlock(
            commitDouble("heightlimit_6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_6D1 = registerBlock(
            commitDouble("heightlimit_6d1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_6D2 = registerBlock(
            commitDouble("heightlimit_6d2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_6D3 = registerBlock(
            commitDouble("heightlimit_6d3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_6D4 = registerBlock(
            commitDouble("heightlimit_6d4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_6D5 = registerBlock(
            commitDouble("heightlimit_6d5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_6D6 = registerBlock(
            commitDouble("heightlimit_6d6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_6D7 = registerBlock(
            commitDouble("heightlimit_6d7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_6D8 = registerBlock(
            commitDouble("heightlimit_6d8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_6D9 = registerBlock(
            commitDouble("heightlimit_6d9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_7 = registerBlock(
            commitDouble("heightlimit_7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_7D1 = registerBlock(
            commitDouble("heightlimit_7d1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_7D2 = registerBlock(
            commitDouble("heightlimit_7d2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_7D3 = registerBlock(
            commitDouble("heightlimit_7d3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_7D4 = registerBlock(
            commitDouble("heightlimit_7d4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_7D5 = registerBlock(
            commitDouble("heightlimit_7d5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_7D6 = registerBlock(
            commitDouble("heightlimit_7d6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_7D7 = registerBlock(
            commitDouble("heightlimit_7d7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_7D8 = registerBlock(
            commitDouble("heightlimit_7d8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_7D9 = registerBlock(
            commitDouble("heightlimit_7d9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_8 = registerBlock(
            commitDouble("heightlimit_8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_8D1 = registerBlock(
            commitDouble("heightlimit_8d1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_8D2 = registerBlock(
            commitDouble("heightlimit_8d2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_8D3 = registerBlock(
            commitDouble("heightlimit_8d3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_8D4 = registerBlock(
            commitDouble("heightlimit_8d4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_8D5 = registerBlock(
            commitDouble("heightlimit_8d5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_8D6 = registerBlock(
            commitDouble("heightlimit_8d6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_8D7 = registerBlock(
            commitDouble("heightlimit_8d7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_8D8 = registerBlock(
            commitDouble("heightlimit_8d8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_8D9 = registerBlock(
            commitDouble("heightlimit_8d9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_9 = registerBlock(
            commitDouble("heightlimit_9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_9D1 = registerBlock(
            commitDouble("heightlimit_9d1"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_9D2 = registerBlock(
            commitDouble("heightlimit_9d2"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_9D3 = registerBlock(
            commitDouble("heightlimit_9d3"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_9D4 = registerBlock(
            commitDouble("heightlimit_9d4"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_9D5 = registerBlock(
            commitDouble("heightlimit_9d5"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_9D6 = registerBlock(
            commitDouble("heightlimit_9d6"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_9D7 = registerBlock(
            commitDouble("heightlimit_9d7"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_9D8 = registerBlock(
            commitDouble("heightlimit_9d8"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_9D9 = registerBlock(
            commitDouble("heightlimit_9d9"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HEIGHTLIMIT_10 = registerBlock(
            commitDouble("heightlimit_10"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block PROHIBITION = registerBlock(
            commitDouble("prohibition"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block NO_U_TURN = registerBlock(
            commitDouble("no_u_turn"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block NO_LEFT_TURN = registerBlock(
            commitDouble("no_left_turn"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block NO_RIGHT_TURN = registerBlock(
            commitDouble("no_right_turn"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block NO_PARKING = registerBlock(
            commitDouble("no_parking"),
            CircleStandingSymbolBlock::new,
            Block.Settings.create().nonOpaque().strength(9f, 36f)
        );
        public static final Block HIGHWAY_1HM = registerBlock(
            commitDouble("highway_1hm"),
            HighwayHmSignBlock::new,
            Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
                st -> ((getWaterloggedProperty() &&
                        st.get(WATERLOGGED).booleanValue())
                      ? MapColor.CYAN : MapColor.GREEN))
        );
        public static final Block HIGHWAY_2HM = registerBlock(
            commitDouble("highway_2hm"),
            HighwayHmSignBlock::new,
            Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
                st -> ((getWaterloggedProperty() &&
                        st.get(WATERLOGGED).booleanValue())
                      ? MapColor.CYAN : MapColor.GREEN))
        );
        public static final Block HIGHWAY_3HM = registerBlock(
            commitDouble("highway_3hm"),
            HighwayHmSignBlock::new,
            Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
                st -> ((getWaterloggedProperty() &&
                        st.get(WATERLOGGED).booleanValue())
                      ? MapColor.CYAN : MapColor.GREEN))
        );
        public static final Block HIGHWAY_4HM = registerBlock(
            commitDouble("highway_4hm"),
            HighwayHmSignBlock::new,
            Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
                st -> ((getWaterloggedProperty() &&
                        st.get(WATERLOGGED).booleanValue())
                      ? MapColor.CYAN : MapColor.GREEN))
        );
        public static final Block HIGHWAY_5HM = registerBlock(
            commitDouble("highway_5hm"),
            HighwayHmSignBlock::new,
            Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
                st -> ((getWaterloggedProperty() &&
                        st.get(WATERLOGGED).booleanValue())
                      ? MapColor.CYAN : MapColor.GREEN))
        );
        public static final Block HIGHWAY_6HM = registerBlock(
            commitDouble("highway_6hm"),
            HighwayHmSignBlock::new,
            Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
                st -> ((getWaterloggedProperty() &&
                        st.get(WATERLOGGED).booleanValue())
                      ? MapColor.CYAN : MapColor.GREEN))
        );
        public static final Block HIGHWAY_7HM = registerBlock(
            commitDouble("highway_7hm"),
            HighwayHmSignBlock::new,
            Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
                st -> ((getWaterloggedProperty() &&
                        st.get(WATERLOGGED).booleanValue())
                      ? MapColor.CYAN : MapColor.GREEN))
        );
        public static final Block HIGHWAY_8HM = registerBlock(
            commitDouble("highway_8hm"),
            HighwayHmSignBlock::new,
            Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
                st -> ((getWaterloggedProperty() &&
                        st.get(WATERLOGGED).booleanValue())
                      ? MapColor.CYAN : MapColor.GREEN))
        );
        public static final Block HIGHWAY_9HM = registerBlock(
            commitDouble("highway_9hm"),
            HighwayHmSignBlock::new,
            Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
                st -> ((getWaterloggedProperty() &&
                        st.get(WATERLOGGED).booleanValue())
                      ? MapColor.CYAN : MapColor.GREEN))
        );
        public static final FloorLineEighthBlock FLOOR_LINE_EIGHTHS = registerBlock(
            commitAndGet(Registries.BLOCK, "floor_line_eighths"),
            FloorLineEighthBlock::new, Block.Settings.create().strength(4f, 4f)
        );
        public static final Block HIGHWAY_KM = registerBlock(
            commitDouble("highway_km"),
            rege.pegui.cntrafficsymbols.block.HighwayKmSignBlock::new,
            Block.Settings.create().nonOpaque().strength(7f, 28f).mapColor(
                st -> ((getWaterloggedProperty() &&
                        st.get(WATERLOGGED).booleanValue()) ? MapColor.CYAN
                      : MapColor.GREEN))
        );
        public static final WideBoardBlock DISTANCE_DETECTION_0M_LEFT = registerBlock(
            commitDouble("distance_detection_0m_left"),
            WideBoardBlock::new, Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock DISTANCE_DETECTION_0M_RIGHT = registerBlock(
            commitDouble("distance_detection_0m_right"),
            settings -> new WideBoardBlock(DISTANCE_DETECTION_0M_LEFT, settings),
            Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock DISTANCE_DETECTION_50M_LEFT = registerBlock(
            commitDouble("distance_detection_50m_left"),
            WideBoardBlock::new, Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock DISTANCE_DETECTION_50M_RIGHT = registerBlock(
            commitDouble("distance_detection_50m_right"),
            settings -> new WideBoardBlock(DISTANCE_DETECTION_50M_LEFT, settings),
            Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock DISTANCE_DETECTION_100M_LEFT = registerBlock(
            commitDouble("distance_detection_100m_left"),
            WideBoardBlock::new, Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock DISTANCE_DETECTION_100M_RIGHT = registerBlock(
            commitDouble("distance_detection_100m_right"),
            settings -> new WideBoardBlock(DISTANCE_DETECTION_100M_LEFT, settings),
            Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock DISTANCE_DETECTION_200M_LEFT = registerBlock(
            commitDouble("distance_detection_200m_left"),
            WideBoardBlock::new, Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock DISTANCE_DETECTION_200M_RIGHT = registerBlock(
            commitDouble("distance_detection_200m_right"),
            settings -> new WideBoardBlock(DISTANCE_DETECTION_200M_LEFT, settings),
            Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE = registerBlock(
            commitDouble("highway_exit_distance_info_left_single"),
            HighwayExitDistanceInfoLeftBlock::new,
            Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE = registerBlock(
            commitDouble("highway_exit_distance_info_middle_single"),
            settings -> new HighwayExitDistanceInfoMiddleBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE = registerBlock(
            commitDouble("highway_exit_distance_info_right_single"),
            settings -> new HighwayExitDistanceInfoRightBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP = registerBlock(
            commitDouble("highway_exit_distance_info_left_top"),
            HighwayExitDistanceInfoLeftBlock::new,
            Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP = registerBlock(
            commitDouble("highway_exit_distance_info_middle_top"),
            settings -> new HighwayExitDistanceInfoMiddleBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP = registerBlock(
            commitDouble("highway_exit_distance_info_right_top"),
            settings -> new HighwayExitDistanceInfoRightBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE = registerBlock(
            commitDouble("highway_exit_distance_info_left_middle"),
            HighwayExitDistanceInfoLeftBlock::new,
            Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE = registerBlock(
            commitDouble("highway_exit_distance_info_middle_middle"),
            settings -> new HighwayExitDistanceInfoMiddleBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE = registerBlock(
            commitDouble("highway_exit_distance_info_right_middle"),
            settings -> new HighwayExitDistanceInfoRightBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM = registerBlock(
            commitDouble("highway_exit_distance_info_left_bottom"),
            HighwayExitDistanceInfoLeftBlock::new,
            Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM = registerBlock(
            commitDouble("highway_exit_distance_info_middle_bottom"),
            settings -> new HighwayExitDistanceInfoMiddleBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM = registerBlock(
            commitDouble("highway_exit_distance_info_right_bottom"),
            settings -> new HighwayExitDistanceInfoRightBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final SquareQuarterDefaulted3Block BARRICADES_1 = registerBlock(
            commitAndGet(Registries.BLOCK, "barricades_1"),
            settings -> new SquareQuarterDefaulted3Block(settings) {
                public static final VoxelShape NW1 =
                    union(cuboid(0, 0, 0, .5, .0625, .5), cuboid(.0625, .0625, .0625, .4375, .75, .4375));
                public static final VoxelShape NW2 =
                    union(cuboid(0, 0, 0, .5, .0625, .5), cuboid(.0625, .0625, .0625, .4375, 1, .4375));
                public static final VoxelShape NE1 =
                    union(cuboid(.5, 0, 0, 1, .0625, .5), cuboid(.5625, .0625, .0625, .9375, .75, .4375));
                public static final VoxelShape NE2 =
                    union(cuboid(.5, 0, 0, 1, .0625, .5), cuboid(.5625, .0625, .0625, .9375, 1, .4375));
                public static final VoxelShape SW1 =
                    union(cuboid(0, 0, .5, .5, .0625, 1), cuboid(.0625, .0625, .5625, .4375, .75, .9375));
                public static final VoxelShape SW2 =
                    union(cuboid(0, 0, .5, .5, .0625, 1), cuboid(.0625, .0625, .5625, .4375, 1, .9375));
                public static final VoxelShape SE1 =
                    union(cuboid(.5, 0, .5, 1, .0625, 1), cuboid(.5625, .0625, .5625, .9375, .75, .9375));
                public static final VoxelShape SE2 =
                    union(cuboid(.5, 0, .5, 1, .0625, 1), cuboid(.5625, .0625, .5625, .9375, 1, .9375));
                public static final VoxelShape W =
                    union(cuboid(0, 0, 0, 1, .125, 1), cuboid(.125, .125, .125, .875, 1, .875));

                @Override
                public VoxelShape
                getOutlineShape(BlockState st, net.minecraft.world.BlockView v, BlockPos p,
                                net.minecraft.block.ShapeContext c) {
                    boolean w = false;
                    VoxelShape r = net.minecraft.util.shape.VoxelShapes.empty();
                    switch (st.get(NORTHWEST).intValue()) {
                        case 1:
                            w = true;
                            r = union(r, NW1);
                            break;
                        case 2:
                            w = true;
                            r = union(r, NW2);
                            break;
                    }
                    switch (st.get(NORTHEAST).intValue()) {
                        case 1:
                            w = true;
                            r = union(r, NE1);
                            break;
                        case 2:
                            w = true;
                            r = union(r, NE2);
                            break;
                    }
                    switch (st.get(SOUTHWEST).intValue()) {
                        case 1:
                            w = true;
                            r = union(r, SW1);
                            break;
                        case 2:
                            w = true;
                            r = union(r, SW2);
                            break;
                    }
                    switch (st.get(SOUTHEAST).intValue()) {
                        case 1:
                            w = true;
                            r = union(r, SE1);
                            break;
                        case 2:
                            w = true;
                            r = union(r, SE2);
                            break;
                    }
                    return w ? r : W;
                }

                @Override
                public boolean shouldHardcodedDrop(net.minecraft.world.World w, net
                    .minecraft.entity.player.PlayerEntity pl, BlockPos p, BlockState st, net
                                                       .minecraft.block.entity.BlockEntity ett, ItemStack tool) {
                    return Boolean.TRUE.equals(getHardcodedBarricades1LootEnabled()) ||
                           (getHardcodedBarricades1LootEnabled() == null && getDroppedStacks(st, (net
                               .minecraft.server.world.ServerWorld) w, p, ett, pl, tool).isEmpty());
                }
            }, Block.Settings.create().strength(9f, 10.5f).mapColor(st -> ((
                getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue()
            ) ? MapColor.PURPLE : MapColor.ORANGE))
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_UPPERLEFT = registerBlock(
            commitDouble("keep_space_variant1_upperleft"),
            WideBoardBlock::new, Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_UPPER = registerBlock(
            commitDouble("keep_space_variant1_upper"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT1_UPPERLEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_UPPERRIGHT = registerBlock(
            commitDouble("keep_space_variant1_upperright"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT1_UPPERLEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_LEFT = registerBlock(
            commitDouble("keep_space_variant1_left"),
            WideBoardBlock::new, Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_CENTER = registerBlock(
            commitDouble("keep_space_variant1_center"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT1_LEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_RIGHT = registerBlock(
            commitDouble("keep_space_variant1_right"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT1_LEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_LOWERLEFT = registerBlock(
            commitDouble("keep_space_variant1_lowerleft"),
            WideBoardBlock::new, Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_LOWER = registerBlock(
            commitDouble("keep_space_variant1_lower"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT1_LOWERLEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_LOWERRIGHT = registerBlock(
            commitDouble("keep_space_variant1_lowerright"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT1_LOWERLEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_UPPERLEFT = registerBlock(
            commitDouble("keep_space_variant2_upperleft"),
            WideBoardBlock::new, Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_UPPER = registerBlock(
            commitDouble("keep_space_variant2_upper"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT2_UPPERLEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_UPPERRIGHT = registerBlock(
            commitDouble("keep_space_variant2_upperright"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT2_UPPERLEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_LEFT = registerBlock(
            commitDouble("keep_space_variant2_left"),
            WideBoardBlock::new, Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_CENTER = registerBlock(
            commitDouble("keep_space_variant2_center"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT2_LEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_RIGHT = registerBlock(
            commitDouble("keep_space_variant2_right"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT2_LEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_LOWERLEFT = registerBlock(
            commitDouble("keep_space_variant2_lowerleft"),
            WideBoardBlock::new, Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_LOWER = registerBlock(
            commitDouble("keep_space_variant2_lower"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT2_LOWERLEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_LOWERRIGHT = registerBlock(
            commitDouble("keep_space_variant2_lowerright"),
            settings -> new WideBoardBlock(
                KEEP_SPACE_VARIANT2_LOWERLEFT, settings
            ), Block.Settings.create().strength(21f, 84f)
        );
        public static final Block WHITE_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("white_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block ORANGE_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("orange_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block MAGENTA_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("magenta_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block LIGHT_BLUE_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("light_blue_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block YELLOW_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("yellow_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block LIME_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("lime_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block PINK_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("pink_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block GRAY_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("gray_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block LIGHT_GRAY_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("light_gray_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block CYAN_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("cyan_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block PURPLE_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("purple_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block BLUE_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("blue_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block BROWN_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("brown_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block GREEN_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("green_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block RED_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("red_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block BLACK_HALF1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("black_half1_cylindrical_rod"),
            Half1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block WHITE_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("white_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block ORANGE_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("orange_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block MAGENTA_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("magenta_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block LIGHT_BLUE_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("light_blue_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block YELLOW_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("yellow_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block LIME_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("lime_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block PINK_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("pink_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block GRAY_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("gray_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block LIGHT_GRAY_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("light_gray_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block CYAN_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("cyan_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block PURPLE_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("purple_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block BLUE_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("blue_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block BROWN_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("brown_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block GREEN_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("green_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block RED_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("red_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block BLACK_FULL1_CYLINDRICAL_ROD = registerBlock(
            commitDouble("black_full1_cylindrical_rod"),
            Full1CylindricalRodBlock::new,
            Block.Settings.create().strength(5f, 20f)
        );
        public static final Block WHITE_ROD_WITH_LAMP = registerBlock(
            commitDouble("white_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block ORANGE_ROD_WITH_LAMP = registerBlock(
            commitDouble("orange_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block MAGENTA_ROD_WITH_LAMP = registerBlock(
            commitDouble("magenta_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block LIGHT_BLUE_ROD_WITH_LAMP = registerBlock(
            commitDouble("light_blue_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block YELLOW_ROD_WITH_LAMP = registerBlock(
            commitDouble("yellow_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block LIME_ROD_WITH_LAMP = registerBlock(
            commitDouble("lime_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block PINK_ROD_WITH_LAMP = registerBlock(
            commitDouble("pink_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block GRAY_ROD_WITH_LAMP = registerBlock(
            commitDouble("gray_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block LIGHT_GRAY_ROD_WITH_LAMP = registerBlock(
            commitDouble("light_gray_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block CYAN_ROD_WITH_LAMP = registerBlock(
            commitDouble("cyan_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block PURPLE_ROD_WITH_LAMP = registerBlock(
            commitDouble("purple_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block BLUE_ROD_WITH_LAMP = registerBlock(
            commitDouble("blue_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block BROWN_ROD_WITH_LAMP = registerBlock(
            commitDouble("brown_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block GREEN_ROD_WITH_LAMP = registerBlock(
            commitDouble("green_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block RED_ROD_WITH_LAMP = registerBlock(
            commitDouble("red_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block BLACK_ROD_WITH_LAMP = registerBlock(
            commitDouble("black_rod_with_lamp"),
            RodWithLampBlock::new, Block.Settings.create().strength(5f, 20f)
                                   .luminance(RodWithLampBlock.LUMINANCE)
        );
        public static final Block FULL_SQUARE_BACKBOARD = registerBlock(
            commitDouble("full_square_backboard"),
            settings -> new DoubleFaceFacingBlock(settings) {
                public static final VoxelShape SHAPE_DEFAULT =
                    cuboid(.3125, 0, .3125, .6875, 1, .6875);

                @Override
                public VoxelShape getOutlineShape(BlockState st, net.minecraft
                    .world.BlockView v, BlockPos p, net.minecraft.block.ShapeContext c) {
                    switch (st.get(DoubleFaceFacing.FACING).id) {
                        case 0: return WideBoardBlock.SHAPE0;
                        case 4: return WideBoardBlock.SHAPE1;
                        case 8: return WideBoardBlock.SHAPE2;
                        case 12: return WideBoardBlock.SHAPE3;
                        case 16: return WideBoardBlock.SHAPE4;
                        case 20: return WideBoardBlock.SHAPE5;
                        case 24: return WideBoardBlock.SHAPE6;
                        case 25: return WideBoardBlock.SHAPE7;
                        case 26: return WideBoardBlock.SHAPE8;
                        case 27: return WideBoardBlock.SHAPE9;
                        default: return SHAPE_DEFAULT;
                    }
                }
            }, Block.Settings.create().strength(21f, 84f)
        );
        public static final Block WHITE_DOTTED4_TP = registerBlock(
            commitDouble("white_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_DOTTED4_TP = registerBlock(
            commitDouble("orange_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_DOTTED4_TP = registerBlock(
            commitDouble("magenta_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_DOTTED4_TP = registerBlock(
            commitDouble("light_blue_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_DOTTED4_TP = registerBlock(
            commitDouble("yellow_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_DOTTED4_TP = registerBlock(
            commitDouble("lime_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_DOTTED4_TP = registerBlock(
            commitDouble("pink_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_DOTTED4_TP = registerBlock(
            commitDouble("gray_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_DOTTED4_TP = registerBlock(
            commitDouble("light_gray_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_DOTTED4_TP = registerBlock(
            commitDouble("cyan_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_DOTTED4_TP = registerBlock(
            commitDouble("purple_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_DOTTED4_TP = registerBlock(
            commitDouble("blue_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_DOTTED4_TP = registerBlock(
            commitDouble("brown_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_DOTTED4_TP = registerBlock(
            commitDouble("green_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_DOTTED4_TP = registerBlock(
            commitDouble("red_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_DOTTED4_TP = registerBlock(
            commitDouble("black_dotted4_tp"),
            settings -> new DottedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_DOTTED5_TP = registerBlock(
            commitDouble("white_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_DOTTED5_TP = registerBlock(
            commitDouble("orange_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_DOTTED5_TP = registerBlock(
            commitDouble("magenta_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_DOTTED5_TP = registerBlock(
            commitDouble("light_blue_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_DOTTED5_TP = registerBlock(
            commitDouble("yellow_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_DOTTED5_TP = registerBlock(
            commitDouble("lime_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_DOTTED5_TP = registerBlock(
            commitDouble("pink_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_DOTTED5_TP = registerBlock(
            commitDouble("gray_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_DOTTED5_TP = registerBlock(
            commitDouble("light_gray_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_DOTTED5_TP = registerBlock(
            commitDouble("cyan_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_DOTTED5_TP = registerBlock(
            commitDouble("purple_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_DOTTED5_TP = registerBlock(
            commitDouble("blue_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_DOTTED5_TP = registerBlock(
            commitDouble("brown_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_DOTTED5_TP = registerBlock(
            commitDouble("green_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_DOTTED5_TP = registerBlock(
            commitDouble("red_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_DOTTED5_TP = registerBlock(
            commitDouble("black_dotted5_tp"),
            settings -> new DottedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_DOTTED6_TP = registerBlock(
            commitDouble("white_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_DOTTED6_TP = registerBlock(
            commitDouble("orange_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_DOTTED6_TP = registerBlock(
            commitDouble("magenta_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_DOTTED6_TP = registerBlock(
            commitDouble("light_blue_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_DOTTED6_TP = registerBlock(
            commitDouble("yellow_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_DOTTED6_TP = registerBlock(
            commitDouble("lime_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_DOTTED6_TP = registerBlock(
            commitDouble("pink_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_DOTTED6_TP = registerBlock(
            commitDouble("gray_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_DOTTED6_TP = registerBlock(
            commitDouble("light_gray_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_DOTTED6_TP = registerBlock(
            commitDouble("cyan_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_DOTTED6_TP = registerBlock(
            commitDouble("purple_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_DOTTED6_TP = registerBlock(
            commitDouble("blue_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_DOTTED6_TP = registerBlock(
            commitDouble("brown_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_DOTTED6_TP = registerBlock(
            commitDouble("green_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_DOTTED6_TP = registerBlock(
            commitDouble("red_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_DOTTED6_TP = registerBlock(
            commitDouble("black_dotted6_tp"),
            settings -> new DottedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_DOTTED7_TP = registerBlock(
            commitDouble("white_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_DOTTED7_TP = registerBlock(
            commitDouble("orange_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_DOTTED7_TP = registerBlock(
            commitDouble("magenta_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_DOTTED7_TP = registerBlock(
            commitDouble("light_blue_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_DOTTED7_TP = registerBlock(
            commitDouble("yellow_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_DOTTED7_TP = registerBlock(
            commitDouble("lime_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_DOTTED7_TP = registerBlock(
            commitDouble("pink_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_DOTTED7_TP = registerBlock(
            commitDouble("gray_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_DOTTED7_TP = registerBlock(
            commitDouble("light_gray_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_DOTTED7_TP = registerBlock(
            commitDouble("cyan_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_DOTTED7_TP = registerBlock(
            commitDouble("purple_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_DOTTED7_TP = registerBlock(
            commitDouble("blue_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_DOTTED7_TP = registerBlock(
            commitDouble("brown_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_DOTTED7_TP = registerBlock(
            commitDouble("green_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_DOTTED7_TP = registerBlock(
            commitDouble("red_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_DOTTED7_TP = registerBlock(
            commitDouble("black_dotted7_tp"),
            settings -> new DottedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_DOTTED8_TP = registerBlock(
            commitDouble("white_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_DOTTED8_TP = registerBlock(
            commitDouble("orange_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_DOTTED8_TP = registerBlock(
            commitDouble("magenta_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_DOTTED8_TP = registerBlock(
            commitDouble("light_blue_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_DOTTED8_TP = registerBlock(
            commitDouble("yellow_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_DOTTED8_TP = registerBlock(
            commitDouble("lime_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_DOTTED8_TP = registerBlock(
            commitDouble("pink_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_DOTTED8_TP = registerBlock(
            commitDouble("gray_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_DOTTED8_TP = registerBlock(
            commitDouble("light_gray_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_DOTTED8_TP = registerBlock(
            commitDouble("cyan_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_DOTTED8_TP = registerBlock(
            commitDouble("purple_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_DOTTED8_TP = registerBlock(
            commitDouble("blue_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_DOTTED8_TP = registerBlock(
            commitDouble("brown_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_DOTTED8_TP = registerBlock(
            commitDouble("green_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_DOTTED8_TP = registerBlock(
            commitDouble("red_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_DOTTED8_TP = registerBlock(
            commitDouble("black_dotted8_tp"),
            settings -> new DottedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_DOTTED9_TP = registerBlock(
            commitDouble("white_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_DOTTED9_TP = registerBlock(
            commitDouble("orange_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_DOTTED9_TP = registerBlock(
            commitDouble("magenta_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_DOTTED9_TP = registerBlock(
            commitDouble("light_blue_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_DOTTED9_TP = registerBlock(
            commitDouble("yellow_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_DOTTED9_TP = registerBlock(
            commitDouble("lime_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_DOTTED9_TP = registerBlock(
            commitDouble("pink_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_DOTTED9_TP = registerBlock(
            commitDouble("gray_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_DOTTED9_TP = registerBlock(
            commitDouble("light_gray_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_DOTTED9_TP = registerBlock(
            commitDouble("cyan_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_DOTTED9_TP = registerBlock(
            commitDouble("purple_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_DOTTED9_TP = registerBlock(
            commitDouble("blue_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_DOTTED9_TP = registerBlock(
            commitDouble("brown_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_DOTTED9_TP = registerBlock(
            commitDouble("green_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_DOTTED9_TP = registerBlock(
            commitDouble("red_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_DOTTED9_TP = registerBlock(
            commitDouble("black_dotted9_tp"),
            settings -> new DottedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_DOTTED10_TP = registerBlock(
            commitDouble("white_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_DOTTED10_TP = registerBlock(
            commitDouble("orange_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_DOTTED10_TP = registerBlock(
            commitDouble("magenta_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_DOTTED10_TP = registerBlock(
            commitDouble("light_blue_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_DOTTED10_TP = registerBlock(
            commitDouble("yellow_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_DOTTED10_TP = registerBlock(
            commitDouble("lime_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_DOTTED10_TP = registerBlock(
            commitDouble("pink_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_DOTTED10_TP = registerBlock(
            commitDouble("gray_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_DOTTED10_TP = registerBlock(
            commitDouble("light_gray_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_DOTTED10_TP = registerBlock(
            commitDouble("cyan_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_DOTTED10_TP = registerBlock(
            commitDouble("purple_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_DOTTED10_TP = registerBlock(
            commitDouble("blue_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_DOTTED10_TP = registerBlock(
            commitDouble("brown_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_DOTTED10_TP = registerBlock(
            commitDouble("green_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_DOTTED10_TP = registerBlock(
            commitDouble("red_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_DOTTED10_TP = registerBlock(
            commitDouble("black_dotted10_tp"),
            settings -> new DottedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_LINED4_TP = registerBlock(
            commitDouble("white_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_LINED4_TP = registerBlock(
            commitDouble("orange_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_LINED4_TP = registerBlock(
            commitDouble("magenta_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_LINED4_TP = registerBlock(
            commitDouble("light_blue_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_LINED4_TP = registerBlock(
            commitDouble("yellow_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_LINED4_TP = registerBlock(
            commitDouble("lime_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_LINED4_TP = registerBlock(
            commitDouble("pink_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_LINED4_TP = registerBlock(
            commitDouble("gray_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_LINED4_TP = registerBlock(
            commitDouble("light_gray_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_LINED4_TP = registerBlock(
            commitDouble("cyan_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_LINED4_TP = registerBlock(
            commitDouble("purple_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_LINED4_TP = registerBlock(
            commitDouble("blue_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_LINED4_TP = registerBlock(
            commitDouble("brown_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_LINED4_TP = registerBlock(
            commitDouble("green_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_LINED4_TP = registerBlock(
            commitDouble("red_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_LINED4_TP = registerBlock(
            commitDouble("black_lined4_tp"),
            settings -> new LinedTPBlock((byte)4, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_LINED5_TP = registerBlock(
            commitDouble("white_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_LINED5_TP = registerBlock(
            commitDouble("orange_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_LINED5_TP = registerBlock(
            commitDouble("magenta_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_LINED5_TP = registerBlock(
            commitDouble("light_blue_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_LINED5_TP = registerBlock(
            commitDouble("yellow_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_LINED5_TP = registerBlock(
            commitDouble("lime_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_LINED5_TP = registerBlock(
            commitDouble("pink_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_LINED5_TP = registerBlock(
            commitDouble("gray_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_LINED5_TP = registerBlock(
            commitDouble("light_gray_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_LINED5_TP = registerBlock(
            commitDouble("cyan_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_LINED5_TP = registerBlock(
            commitDouble("purple_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_LINED5_TP = registerBlock(
            commitDouble("blue_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_LINED5_TP = registerBlock(
            commitDouble("brown_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_LINED5_TP = registerBlock(
            commitDouble("green_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_LINED5_TP = registerBlock(
            commitDouble("red_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_LINED5_TP = registerBlock(
            commitDouble("black_lined5_tp"),
            settings -> new LinedTPBlock((byte)5, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_LINED6_TP = registerBlock(
            commitDouble("white_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_LINED6_TP = registerBlock(
            commitDouble("orange_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_LINED6_TP = registerBlock(
            commitDouble("magenta_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_LINED6_TP = registerBlock(
            commitDouble("light_blue_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_LINED6_TP = registerBlock(
            commitDouble("yellow_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_LINED6_TP = registerBlock(
            commitDouble("lime_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_LINED6_TP = registerBlock(
            commitDouble("pink_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_LINED6_TP = registerBlock(
            commitDouble("gray_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_LINED6_TP = registerBlock(
            commitDouble("light_gray_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_LINED6_TP = registerBlock(
            commitDouble("cyan_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_LINED6_TP = registerBlock(
            commitDouble("purple_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_LINED6_TP = registerBlock(
            commitDouble("blue_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_LINED6_TP = registerBlock(
            commitDouble("brown_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_LINED6_TP = registerBlock(
            commitDouble("green_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_LINED6_TP = registerBlock(
            commitDouble("red_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_LINED6_TP = registerBlock(
            commitDouble("black_lined6_tp"),
            settings -> new LinedTPBlock((byte)6, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_LINED7_TP = registerBlock(
            commitDouble("white_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_LINED7_TP = registerBlock(
            commitDouble("orange_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_LINED7_TP = registerBlock(
            commitDouble("magenta_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_LINED7_TP = registerBlock(
            commitDouble("light_blue_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_LINED7_TP = registerBlock(
            commitDouble("yellow_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_LINED7_TP = registerBlock(
            commitDouble("lime_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_LINED7_TP = registerBlock(
            commitDouble("pink_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_LINED7_TP = registerBlock(
            commitDouble("gray_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_LINED7_TP = registerBlock(
            commitDouble("light_gray_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_LINED7_TP = registerBlock(
            commitDouble("cyan_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_LINED7_TP = registerBlock(
            commitDouble("purple_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_LINED7_TP = registerBlock(
            commitDouble("blue_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_LINED7_TP = registerBlock(
            commitDouble("brown_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_LINED7_TP = registerBlock(
            commitDouble("green_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_LINED7_TP = registerBlock(
            commitDouble("red_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_LINED7_TP = registerBlock(
            commitDouble("black_lined7_tp"),
            settings -> new LinedTPBlock((byte)7, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_LINED8_TP = registerBlock(
            commitDouble("white_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_LINED8_TP = registerBlock(
            commitDouble("orange_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_LINED8_TP = registerBlock(
            commitDouble("magenta_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_LINED8_TP = registerBlock(
            commitDouble("light_blue_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_LINED8_TP = registerBlock(
            commitDouble("yellow_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_LINED8_TP = registerBlock(
            commitDouble("lime_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_LINED8_TP = registerBlock(
            commitDouble("pink_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_LINED8_TP = registerBlock(
            commitDouble("gray_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_LINED8_TP = registerBlock(
            commitDouble("light_gray_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_LINED8_TP = registerBlock(
            commitDouble("cyan_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_LINED8_TP = registerBlock(
            commitDouble("purple_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_LINED8_TP = registerBlock(
            commitDouble("blue_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_LINED8_TP = registerBlock(
            commitDouble("brown_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_LINED8_TP = registerBlock(
            commitDouble("green_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_LINED8_TP = registerBlock(
            commitDouble("red_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_LINED8_TP = registerBlock(
            commitDouble("black_lined8_tp"),
            settings -> new LinedTPBlock((byte)8, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_LINED9_TP = registerBlock(
            commitDouble("white_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_LINED9_TP = registerBlock(
            commitDouble("orange_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_LINED9_TP = registerBlock(
            commitDouble("magenta_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_LINED9_TP = registerBlock(
            commitDouble("light_blue_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_LINED9_TP = registerBlock(
            commitDouble("yellow_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_LINED9_TP = registerBlock(
            commitDouble("lime_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_LINED9_TP = registerBlock(
            commitDouble("pink_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_LINED9_TP = registerBlock(
            commitDouble("gray_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_LINED9_TP = registerBlock(
            commitDouble("light_gray_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_LINED9_TP = registerBlock(
            commitDouble("cyan_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_LINED9_TP = registerBlock(
            commitDouble("purple_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_LINED9_TP = registerBlock(
            commitDouble("blue_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_LINED9_TP = registerBlock(
            commitDouble("brown_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_LINED9_TP = registerBlock(
            commitDouble("green_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_LINED9_TP = registerBlock(
            commitDouble("red_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_LINED9_TP = registerBlock(
            commitDouble("black_lined9_tp"),
            settings -> new LinedTPBlock((byte)9, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block WHITE_LINED10_TP = registerBlock(
            commitDouble("white_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block ORANGE_LINED10_TP = registerBlock(
            commitDouble("orange_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block MAGENTA_LINED10_TP = registerBlock(
            commitDouble("magenta_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_BLUE_LINED10_TP = registerBlock(
            commitDouble("light_blue_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block YELLOW_LINED10_TP = registerBlock(
            commitDouble("yellow_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIME_LINED10_TP = registerBlock(
            commitDouble("lime_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PINK_LINED10_TP = registerBlock(
            commitDouble("pink_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GRAY_LINED10_TP = registerBlock(
            commitDouble("gray_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block LIGHT_GRAY_LINED10_TP = registerBlock(
            commitDouble("light_gray_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block CYAN_LINED10_TP = registerBlock(
            commitDouble("cyan_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block PURPLE_LINED10_TP = registerBlock(
            commitDouble("purple_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLUE_LINED10_TP = registerBlock(
            commitDouble("blue_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BROWN_LINED10_TP = registerBlock(
            commitDouble("brown_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block GREEN_LINED10_TP = registerBlock(
            commitDouble("green_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block RED_LINED10_TP = registerBlock(
            commitDouble("red_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
        public static final Block BLACK_LINED10_TP = registerBlock(
            commitDouble("black_lined10_tp"),
            settings -> new LinedTPBlock((byte)10, settings),
            Block.Settings.create().strength(.9f).requiresTool()
        );
    }

    private static final Block[] SPEEDLIMIT_HIGH_BLOCKS;
    private static final Block[] SPEEDLIMIT_LOW_BLOCKS;
    private static final Block[] LIFT_SPEEDLIMIT_HIGH_BLOCKS;
    private static final Block[] HEIGHTLIMIT_BLOCKS;
    private static final Block[] PROHIBITION_BLOCKS;
    private static final Block[] HIGHWAY_HM_BLOCKS;
    private static final Block[] HALF1_CYLINDRICAL_ROD_BLOCKS;
    private static final Block[] FULL1_CYLINDRICAL_ROD_BLOCKS;
    private static final Block[] ROD_WITH_LAMP_BLOCKS;
    private static final Block[][] DOTTED_TP_BLOCKS;
    private static final Block[][] LINED_TP_BLOCKS;

    public static class Items {
        public static final Item SPEEDLIMIT_HIGH_3 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_3, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_3 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_3, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_5 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_5, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_5 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_5, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_10 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_10, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_10 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_10, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_15 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_15, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_15 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_15, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_20 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_20, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_20 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_20, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_25 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_25, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_25 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_25, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_30 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_30, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_30 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_30, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_35 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_35, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_35 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_35, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_40 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_40, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_40 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_40, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_45 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_45, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_45 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_45, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_50 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_50, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_50 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_50, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_55 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_55, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_55 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_55, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_60 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_60, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_60 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_60, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_65 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_65, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_65 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_65, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_70 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_70, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_70 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_70, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_75 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_75, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_75 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_75, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_80 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_80, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_80 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_80, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_85 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_85, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_85 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_85, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_90 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_90, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_90 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_90, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_95 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_95, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_95 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_95, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_100 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_100, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_100 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_100, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_105 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_105, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_105 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_105, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_110 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_110, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_110 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_110, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_115 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_115, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_115 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_115, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_120 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_120, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_120 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_120, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_125 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_125, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_125 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_125, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_130 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_130, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_130 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_130, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_135 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_135, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_135 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_135, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_140 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_140, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_140 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_140, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_145 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_145, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_145 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_145, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_150 =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_150, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_150 =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_150, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_SPECIAL =
            registerBlockItem(Blocks.SPEEDLIMIT_HIGH_SPECIAL,
                          new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_SPECIAL =
            registerBlockItem(Blocks.SPEEDLIMIT_LOW_SPECIAL,
                          new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_3 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_3, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_5 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_5, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_10 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_10, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_15 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_15, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_20 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_20, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_25 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_25, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_30 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_30, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_35 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_35, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_40 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_40, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_45 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_45, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_50 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_50, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_55 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_55, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_60 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_60, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_65 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_65, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_70 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_70, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_75 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_75, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_80 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_80, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_85 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_85, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_90 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_90, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_95 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_95, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_100 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_100, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_105 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_105, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_110 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_110, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_115 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_115, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_120 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_120, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_125 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_125, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_130 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_130, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_135 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_135, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_140 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_140, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_145 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_145, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_150 =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_150, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_SPECIAL =
            registerBlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL,
                          new Item.Settings().maxCount(64));
        public static final Item IRON_PLATE = registerItem(
            commitAndGet(Registries.ITEM, "iron_plate"), Item::new,
            new Item.Settings().maxCount(64)
        );
        public static final Item CIRCLE_BACKBOARD =
            registerBlockItem(Blocks.CIRCLE_BACKBOARD, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_SPECIAL =
            registerBlockItem(Blocks.HEIGHTLIMIT_SPECIAL, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_0D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_0D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_0D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_0D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_0D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_0D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_0D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_0D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_0D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_1D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_1D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_1D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_1D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_1D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_1D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_1D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_1D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_1D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_2D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_2D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_2D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_2D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_2D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_2D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_2D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_2D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_2D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_3D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_3D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_3D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_3D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_3D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_3D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_3D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_3D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_3D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_4D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_4D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_4D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_4D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_4D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_4D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_4D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_4D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_4D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_5D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_5D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_5D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_5D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_5D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_5D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_5D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_5D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_5D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_6D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_6D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_6D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_6D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_6D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_6D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_6D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_6D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_6D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_7D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_7D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_7D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_7D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_7D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_7D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_7D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_7D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_7D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_8D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_8D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_8D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_8D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_8D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_8D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_8D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_8D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_8D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D1 =
            registerBlockItem(Blocks.HEIGHTLIMIT_9D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D2 =
            registerBlockItem(Blocks.HEIGHTLIMIT_9D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D3 =
            registerBlockItem(Blocks.HEIGHTLIMIT_9D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D4 =
            registerBlockItem(Blocks.HEIGHTLIMIT_9D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D5 =
            registerBlockItem(Blocks.HEIGHTLIMIT_9D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D6 =
            registerBlockItem(Blocks.HEIGHTLIMIT_9D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D7 =
            registerBlockItem(Blocks.HEIGHTLIMIT_9D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D8 =
            registerBlockItem(Blocks.HEIGHTLIMIT_9D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D9 =
            registerBlockItem(Blocks.HEIGHTLIMIT_9D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_10 =
            registerBlockItem(Blocks.HEIGHTLIMIT_10, new Item.Settings().maxCount(64));
        public static final Item PROHIBITION =
            registerBlockItem(Blocks.PROHIBITION, new Item.Settings().maxCount(64));
        public static final Item NO_U_TURN =
            registerBlockItem(Blocks.NO_U_TURN, new Item.Settings().maxCount(64));
        public static final Item NO_LEFT_TURN =
            registerBlockItem(Blocks.NO_LEFT_TURN, new Item.Settings().maxCount(64));
        public static final Item NO_RIGHT_TURN =
            registerBlockItem(Blocks.NO_RIGHT_TURN, new Item.Settings().maxCount(64));
        public static final Item NO_PARKING =
            registerBlockItem(Blocks.NO_PARKING, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_1HM =
            registerBlockItem(Blocks.HIGHWAY_1HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_2HM =
            registerBlockItem(Blocks.HIGHWAY_2HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_3HM =
            registerBlockItem(Blocks.HIGHWAY_3HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_4HM =
            registerBlockItem(Blocks.HIGHWAY_4HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_5HM =
            registerBlockItem(Blocks.HIGHWAY_5HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_6HM =
            registerBlockItem(Blocks.HIGHWAY_6HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_7HM =
            registerBlockItem(Blocks.HIGHWAY_7HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_8HM =
            registerBlockItem(Blocks.HIGHWAY_8HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_9HM =
            registerBlockItem(Blocks.HIGHWAY_9HM, new Item.Settings().maxCount(64));
        public static final Item WHITE_FLOOR_LINE_EIGHTH = registerItem(
            commitAndGet(Registries.ITEM, "white_floor_line_eighth"),
            settings -> new BlockItem(Blocks.FLOOR_LINE_EIGHTHS, settings) {
                @Override
                @Contract(pure = true)
                public Block getBlock() {
                    return Blocks.FLOOR_LINE_EIGHTHS;
                }
            }, new Item.Settings().maxCount(64)
        );
        public static final Item YELLOW_FLOOR_LINE_EIGHTH = registerItem(
            commitAndGet(Registries.ITEM, "yellow_floor_line_eighth"),
            settings -> new BlockItem(Blocks.FLOOR_LINE_EIGHTHS, settings) {
                @Override
                @Contract(pure = true)
                public Block getBlock() {
                    return Blocks.FLOOR_LINE_EIGHTHS;
                }
            }, new Item.Settings().maxCount(64)
        );
        public static final Item HIGHWAY_KM =
            registerBlockItem(Blocks.HIGHWAY_KM, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_0M_LEFT = registerBlockItem(Blocks
                                                                                .DISTANCE_DETECTION_0M_LEFT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_0M_RIGHT = registerBlockItem(Blocks
                                                                                 .DISTANCE_DETECTION_0M_RIGHT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_50M_LEFT = registerBlockItem(Blocks
                                                                                 .DISTANCE_DETECTION_50M_LEFT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_50M_RIGHT = registerBlockItem(Blocks
                                                                                  .DISTANCE_DETECTION_50M_RIGHT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_100M_LEFT = registerBlockItem(Blocks
                                                                                  .DISTANCE_DETECTION_100M_LEFT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_100M_RIGHT = registerBlockItem(Blocks
                                                                                   .DISTANCE_DETECTION_100M_RIGHT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_200M_LEFT = registerBlockItem(Blocks
                                                                                  .DISTANCE_DETECTION_200M_LEFT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_200M_RIGHT = registerBlockItem(Blocks
                                                                                   .DISTANCE_DETECTION_200M_RIGHT, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM =
            registerBlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM,
                          new Item.Settings().maxCount(64));
        public static final Item BARRICADE_50CM_EDGE_75CM_HEIGHT = registerItem(
            commitAndGet(Registries.ITEM, "barricade_50cm_edge_75cm_height"),
            settings -> new BlockItem(Blocks.BARRICADES_1, settings) {
                @Override
                @Contract(pure = true)
                public Block getBlock() {
                    return Blocks.BARRICADES_1;
                }
            }, new Item.Settings().maxCount(64)
        );
        public static final Item BARRICADE_50CM_EDGE_1M_HEIGHT = registerItem(
            commitAndGet(Registries.ITEM, "barricade_50cm_edge_1m_height"),
            settings -> new BlockItem(Blocks.BARRICADES_1, settings) {
                @Override
                @Contract(pure = true)
                public Block getBlock() {
                    return Blocks.BARRICADES_1;
                }
            }, new Item.Settings().maxCount(64)
        );
        public static final Item BARRICADE_1M_EDGE_1M_HEIGHT = registerItem(
            commitAndGet(Registries.ITEM, "barricade_1m_edge_1m_height"),
            settings -> new BlockItem(Blocks.BARRICADES_1, settings) {
                @Override
                @Contract(pure = true)
                public Block getBlock() {
                    return Blocks.BARRICADES_1;
                }
            }, new Item.Settings().maxCount(64)
        );
        public static final Item KEEP_SPACE_VARIANT1_UPPERLEFT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT1_UPPERLEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_UPPER =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT1_UPPER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_UPPERRIGHT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT1_UPPERRIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_LEFT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT1_LEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_CENTER =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT1_CENTER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_RIGHT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT1_RIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_LOWERLEFT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT1_LOWERLEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_LOWER =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT1_LOWER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_LOWERRIGHT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT1_LOWERRIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_UPPERLEFT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT2_UPPERLEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_UPPER =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT2_UPPER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_UPPERRIGHT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT2_UPPERRIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_LEFT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT2_LEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_CENTER =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT2_CENTER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_RIGHT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT2_RIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_LOWERLEFT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT2_LOWERLEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_LOWER =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT2_LOWER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_LOWERRIGHT =
            registerBlockItem(Blocks.KEEP_SPACE_VARIANT2_LOWERRIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item WHITE_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.WHITE_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item ORANGE_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.ORANGE_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item MAGENTA_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.MAGENTA_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.LIGHT_BLUE_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item YELLOW_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.YELLOW_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIME_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.LIME_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item PINK_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.PINK_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item GRAY_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.GRAY_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.LIGHT_GRAY_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item CYAN_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.CYAN_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item PURPLE_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.PURPLE_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BLUE_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.BLUE_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BROWN_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.BROWN_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item GREEN_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.GREEN_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item RED_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.RED_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BLACK_HALF1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.BLACK_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item WHITE_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.WHITE_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item ORANGE_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.ORANGE_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item MAGENTA_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.MAGENTA_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.LIGHT_BLUE_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item YELLOW_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.YELLOW_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIME_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.LIME_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item PINK_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.PINK_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item GRAY_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.GRAY_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.LIGHT_GRAY_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item CYAN_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.CYAN_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item PURPLE_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.PURPLE_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BLUE_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.BLUE_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BROWN_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.BROWN_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item GREEN_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.GREEN_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item RED_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.RED_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BLACK_FULL1_CYLINDRICAL_ROD =
            registerBlockItem(Blocks.BLACK_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item WHITE_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                         .WHITE_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                          .ORANGE_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                           .MAGENTA_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                              .LIGHT_BLUE_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                          .YELLOW_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item LIME_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                        .LIME_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item PINK_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                        .PINK_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item GRAY_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                        .GRAY_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                              .LIGHT_GRAY_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item CYAN_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                        .CYAN_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                          .PURPLE_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item BLUE_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                        .BLUE_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item BROWN_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                         .BROWN_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item GREEN_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                         .GREEN_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item RED_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                       .RED_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item BLACK_ROD_WITH_LAMP = registerBlockItem(Blocks
                                                                         .BLACK_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item FULL_SQUARE_BACKBOARD =
            registerBlockItem(Blocks.FULL_SQUARE_BACKBOARD, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED4_TP =
            registerBlockItem(Blocks.WHITE_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED4_TP =
            registerBlockItem(Blocks.ORANGE_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED4_TP =
            registerBlockItem(Blocks.MAGENTA_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED4_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED4_TP =
            registerBlockItem(Blocks.YELLOW_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED4_TP =
            registerBlockItem(Blocks.LIME_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED4_TP =
            registerBlockItem(Blocks.PINK_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED4_TP =
            registerBlockItem(Blocks.GRAY_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED4_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED4_TP =
            registerBlockItem(Blocks.CYAN_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED4_TP =
            registerBlockItem(Blocks.PURPLE_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED4_TP =
            registerBlockItem(Blocks.BLUE_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED4_TP =
            registerBlockItem(Blocks.BROWN_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED4_TP =
            registerBlockItem(Blocks.GREEN_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED4_TP =
            registerBlockItem(Blocks.RED_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED4_TP =
            registerBlockItem(Blocks.BLACK_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED5_TP =
            registerBlockItem(Blocks.WHITE_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED5_TP =
            registerBlockItem(Blocks.ORANGE_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED5_TP =
            registerBlockItem(Blocks.MAGENTA_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED5_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED5_TP =
            registerBlockItem(Blocks.YELLOW_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED5_TP =
            registerBlockItem(Blocks.LIME_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED5_TP =
            registerBlockItem(Blocks.PINK_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED5_TP =
            registerBlockItem(Blocks.GRAY_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED5_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED5_TP =
            registerBlockItem(Blocks.CYAN_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED5_TP =
            registerBlockItem(Blocks.PURPLE_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED5_TP =
            registerBlockItem(Blocks.BLUE_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED5_TP =
            registerBlockItem(Blocks.BROWN_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED5_TP =
            registerBlockItem(Blocks.GREEN_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED5_TP =
            registerBlockItem(Blocks.RED_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED5_TP =
            registerBlockItem(Blocks.BLACK_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED6_TP =
            registerBlockItem(Blocks.WHITE_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED6_TP =
            registerBlockItem(Blocks.ORANGE_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED6_TP =
            registerBlockItem(Blocks.MAGENTA_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED6_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED6_TP =
            registerBlockItem(Blocks.YELLOW_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED6_TP =
            registerBlockItem(Blocks.LIME_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED6_TP =
            registerBlockItem(Blocks.PINK_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED6_TP =
            registerBlockItem(Blocks.GRAY_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED6_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED6_TP =
            registerBlockItem(Blocks.CYAN_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED6_TP =
            registerBlockItem(Blocks.PURPLE_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED6_TP =
            registerBlockItem(Blocks.BLUE_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED6_TP =
            registerBlockItem(Blocks.BROWN_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED6_TP =
            registerBlockItem(Blocks.GREEN_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED6_TP =
            registerBlockItem(Blocks.RED_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED6_TP =
            registerBlockItem(Blocks.BLACK_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED7_TP =
            registerBlockItem(Blocks.WHITE_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED7_TP =
            registerBlockItem(Blocks.ORANGE_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED7_TP =
            registerBlockItem(Blocks.MAGENTA_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED7_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED7_TP =
            registerBlockItem(Blocks.YELLOW_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED7_TP =
            registerBlockItem(Blocks.LIME_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED7_TP =
            registerBlockItem(Blocks.PINK_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED7_TP =
            registerBlockItem(Blocks.GRAY_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED7_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED7_TP =
            registerBlockItem(Blocks.CYAN_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED7_TP =
            registerBlockItem(Blocks.PURPLE_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED7_TP =
            registerBlockItem(Blocks.BLUE_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED7_TP =
            registerBlockItem(Blocks.BROWN_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED7_TP =
            registerBlockItem(Blocks.GREEN_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED7_TP =
            registerBlockItem(Blocks.RED_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED7_TP =
            registerBlockItem(Blocks.BLACK_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED8_TP =
            registerBlockItem(Blocks.WHITE_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED8_TP =
            registerBlockItem(Blocks.ORANGE_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED8_TP =
            registerBlockItem(Blocks.MAGENTA_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED8_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED8_TP =
            registerBlockItem(Blocks.YELLOW_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED8_TP =
            registerBlockItem(Blocks.LIME_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED8_TP =
            registerBlockItem(Blocks.PINK_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED8_TP =
            registerBlockItem(Blocks.GRAY_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED8_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED8_TP =
            registerBlockItem(Blocks.CYAN_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED8_TP =
            registerBlockItem(Blocks.PURPLE_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED8_TP =
            registerBlockItem(Blocks.BLUE_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED8_TP =
            registerBlockItem(Blocks.BROWN_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED8_TP =
            registerBlockItem(Blocks.GREEN_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED8_TP =
            registerBlockItem(Blocks.RED_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED8_TP =
            registerBlockItem(Blocks.BLACK_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED9_TP =
            registerBlockItem(Blocks.WHITE_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED9_TP =
            registerBlockItem(Blocks.ORANGE_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED9_TP =
            registerBlockItem(Blocks.MAGENTA_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED9_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED9_TP =
            registerBlockItem(Blocks.YELLOW_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED9_TP =
            registerBlockItem(Blocks.LIME_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED9_TP =
            registerBlockItem(Blocks.PINK_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED9_TP =
            registerBlockItem(Blocks.GRAY_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED9_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED9_TP =
            registerBlockItem(Blocks.CYAN_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED9_TP =
            registerBlockItem(Blocks.PURPLE_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED9_TP =
            registerBlockItem(Blocks.BLUE_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED9_TP =
            registerBlockItem(Blocks.BROWN_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED9_TP =
            registerBlockItem(Blocks.GREEN_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED9_TP =
            registerBlockItem(Blocks.RED_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED9_TP =
            registerBlockItem(Blocks.BLACK_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED10_TP =
            registerBlockItem(Blocks.WHITE_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED10_TP =
            registerBlockItem(Blocks.ORANGE_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED10_TP =
            registerBlockItem(Blocks.MAGENTA_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED10_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED10_TP =
            registerBlockItem(Blocks.YELLOW_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED10_TP =
            registerBlockItem(Blocks.LIME_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED10_TP =
            registerBlockItem(Blocks.PINK_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED10_TP =
            registerBlockItem(Blocks.GRAY_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED10_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED10_TP =
            registerBlockItem(Blocks.CYAN_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED10_TP =
            registerBlockItem(Blocks.PURPLE_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED10_TP =
            registerBlockItem(Blocks.BLUE_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED10_TP =
            registerBlockItem(Blocks.BROWN_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED10_TP =
            registerBlockItem(Blocks.GREEN_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED10_TP =
            registerBlockItem(Blocks.RED_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED10_TP =
            registerBlockItem(Blocks.BLACK_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED4_TP =
            registerBlockItem(Blocks.WHITE_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED4_TP =
            registerBlockItem(Blocks.ORANGE_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED4_TP =
            registerBlockItem(Blocks.MAGENTA_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED4_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED4_TP =
            registerBlockItem(Blocks.YELLOW_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED4_TP =
            registerBlockItem(Blocks.LIME_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED4_TP =
            registerBlockItem(Blocks.PINK_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED4_TP =
            registerBlockItem(Blocks.GRAY_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED4_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED4_TP =
            registerBlockItem(Blocks.CYAN_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED4_TP =
            registerBlockItem(Blocks.PURPLE_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED4_TP =
            registerBlockItem(Blocks.BLUE_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED4_TP =
            registerBlockItem(Blocks.BROWN_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED4_TP =
            registerBlockItem(Blocks.GREEN_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED4_TP =
            registerBlockItem(Blocks.RED_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED4_TP =
            registerBlockItem(Blocks.BLACK_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED5_TP =
            registerBlockItem(Blocks.WHITE_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED5_TP =
            registerBlockItem(Blocks.ORANGE_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED5_TP =
            registerBlockItem(Blocks.MAGENTA_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED5_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED5_TP =
            registerBlockItem(Blocks.YELLOW_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED5_TP =
            registerBlockItem(Blocks.LIME_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED5_TP =
            registerBlockItem(Blocks.PINK_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED5_TP =
            registerBlockItem(Blocks.GRAY_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED5_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED5_TP =
            registerBlockItem(Blocks.CYAN_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED5_TP =
            registerBlockItem(Blocks.PURPLE_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED5_TP =
            registerBlockItem(Blocks.BLUE_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED5_TP =
            registerBlockItem(Blocks.BROWN_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED5_TP =
            registerBlockItem(Blocks.GREEN_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED5_TP =
            registerBlockItem(Blocks.RED_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED5_TP =
            registerBlockItem(Blocks.BLACK_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED6_TP =
            registerBlockItem(Blocks.WHITE_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED6_TP =
            registerBlockItem(Blocks.ORANGE_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED6_TP =
            registerBlockItem(Blocks.MAGENTA_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED6_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED6_TP =
            registerBlockItem(Blocks.YELLOW_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED6_TP =
            registerBlockItem(Blocks.LIME_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED6_TP =
            registerBlockItem(Blocks.PINK_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED6_TP =
            registerBlockItem(Blocks.GRAY_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED6_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED6_TP =
            registerBlockItem(Blocks.CYAN_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED6_TP =
            registerBlockItem(Blocks.PURPLE_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED6_TP =
            registerBlockItem(Blocks.BLUE_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED6_TP =
            registerBlockItem(Blocks.BROWN_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED6_TP =
            registerBlockItem(Blocks.GREEN_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED6_TP =
            registerBlockItem(Blocks.RED_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED6_TP =
            registerBlockItem(Blocks.BLACK_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED7_TP =
            registerBlockItem(Blocks.WHITE_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED7_TP =
            registerBlockItem(Blocks.ORANGE_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED7_TP =
            registerBlockItem(Blocks.MAGENTA_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED7_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED7_TP =
            registerBlockItem(Blocks.YELLOW_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED7_TP =
            registerBlockItem(Blocks.LIME_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED7_TP =
            registerBlockItem(Blocks.PINK_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED7_TP =
            registerBlockItem(Blocks.GRAY_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED7_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED7_TP =
            registerBlockItem(Blocks.CYAN_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED7_TP =
            registerBlockItem(Blocks.PURPLE_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED7_TP =
            registerBlockItem(Blocks.BLUE_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED7_TP =
            registerBlockItem(Blocks.BROWN_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED7_TP =
            registerBlockItem(Blocks.GREEN_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED7_TP =
            registerBlockItem(Blocks.RED_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED7_TP =
            registerBlockItem(Blocks.BLACK_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED8_TP =
            registerBlockItem(Blocks.WHITE_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED8_TP =
            registerBlockItem(Blocks.ORANGE_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED8_TP =
            registerBlockItem(Blocks.MAGENTA_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED8_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED8_TP =
            registerBlockItem(Blocks.YELLOW_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED8_TP =
            registerBlockItem(Blocks.LIME_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED8_TP =
            registerBlockItem(Blocks.PINK_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED8_TP =
            registerBlockItem(Blocks.GRAY_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED8_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED8_TP =
            registerBlockItem(Blocks.CYAN_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED8_TP =
            registerBlockItem(Blocks.PURPLE_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED8_TP =
            registerBlockItem(Blocks.BLUE_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED8_TP =
            registerBlockItem(Blocks.BROWN_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED8_TP =
            registerBlockItem(Blocks.GREEN_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED8_TP =
            registerBlockItem(Blocks.RED_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED8_TP =
            registerBlockItem(Blocks.BLACK_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED9_TP =
            registerBlockItem(Blocks.WHITE_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED9_TP =
            registerBlockItem(Blocks.ORANGE_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED9_TP =
            registerBlockItem(Blocks.MAGENTA_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED9_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED9_TP =
            registerBlockItem(Blocks.YELLOW_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED9_TP =
            registerBlockItem(Blocks.LIME_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED9_TP =
            registerBlockItem(Blocks.PINK_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED9_TP =
            registerBlockItem(Blocks.GRAY_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED9_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED9_TP =
            registerBlockItem(Blocks.CYAN_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED9_TP =
            registerBlockItem(Blocks.PURPLE_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED9_TP =
            registerBlockItem(Blocks.BLUE_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED9_TP =
            registerBlockItem(Blocks.BROWN_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED9_TP =
            registerBlockItem(Blocks.GREEN_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED9_TP =
            registerBlockItem(Blocks.RED_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED9_TP =
            registerBlockItem(Blocks.BLACK_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED10_TP =
            registerBlockItem(Blocks.WHITE_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED10_TP =
            registerBlockItem(Blocks.ORANGE_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED10_TP =
            registerBlockItem(Blocks.MAGENTA_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED10_TP =
            registerBlockItem(Blocks.LIGHT_BLUE_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED10_TP =
            registerBlockItem(Blocks.YELLOW_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED10_TP =
            registerBlockItem(Blocks.LIME_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED10_TP =
            registerBlockItem(Blocks.PINK_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED10_TP =
            registerBlockItem(Blocks.GRAY_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED10_TP =
            registerBlockItem(Blocks.LIGHT_GRAY_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED10_TP =
            registerBlockItem(Blocks.CYAN_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED10_TP =
            registerBlockItem(Blocks.PURPLE_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED10_TP =
            registerBlockItem(Blocks.BLUE_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED10_TP =
            registerBlockItem(Blocks.BROWN_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED10_TP =
            registerBlockItem(Blocks.GREEN_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED10_TP =
            registerBlockItem(Blocks.RED_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED10_TP =
            registerBlockItem(Blocks.BLACK_LINED10_TP, new Item.Settings().maxCount(64));
    }

    private static final Item[] SPEEDLIMIT_HIGH_ITEMS;
    private static final Item[] SPEEDLIMIT_LOW_ITEMS;
    private static final Item[] LIFT_SPEEDLIMIT_HIGH_ITEMS;
    private static final Item[] HEIGHTLIMIT_ITEMS;
    private static final Item[] PROHIBITION_ITEMS;
    private static final Item[] HIGHWAY_HM_ITEMS;
    private static final Item[] HALF1_CYLINDRICAL_ROD_ITEMS;
    private static final Item[] FULL1_CYLINDRICAL_ROD_ITEMS;
    private static final Item[] ROD_WITH_LAMP_ITEMS;
    private static final Item[][] DOTTED_TP_ITEMS;
    private static final Item[][] LINED_TP_ITEMS;
    private static final ItemGroup ITEM_GROUP;

    static {
        SPEEDLIMIT_HIGH_BLOCKS = new Block[]{Blocks.SPEEDLIMIT_HIGH_3, Blocks.SPEEDLIMIT_HIGH_5, Blocks.SPEEDLIMIT_HIGH_10, Blocks.SPEEDLIMIT_HIGH_15, Blocks.SPEEDLIMIT_HIGH_20, Blocks.SPEEDLIMIT_HIGH_25, Blocks.SPEEDLIMIT_HIGH_30, Blocks.SPEEDLIMIT_HIGH_35, Blocks.SPEEDLIMIT_HIGH_40, Blocks.SPEEDLIMIT_HIGH_45, Blocks.SPEEDLIMIT_HIGH_50, Blocks.SPEEDLIMIT_HIGH_55, Blocks.SPEEDLIMIT_HIGH_60, Blocks.SPEEDLIMIT_HIGH_65, Blocks.SPEEDLIMIT_HIGH_70, Blocks.SPEEDLIMIT_HIGH_75, Blocks.SPEEDLIMIT_HIGH_80, Blocks.SPEEDLIMIT_HIGH_85, Blocks.SPEEDLIMIT_HIGH_90, Blocks.SPEEDLIMIT_HIGH_95, Blocks.SPEEDLIMIT_HIGH_100, Blocks.SPEEDLIMIT_HIGH_105, Blocks.SPEEDLIMIT_HIGH_110, Blocks.SPEEDLIMIT_HIGH_115, Blocks.SPEEDLIMIT_HIGH_120, Blocks.SPEEDLIMIT_HIGH_125, Blocks.SPEEDLIMIT_HIGH_130, Blocks.SPEEDLIMIT_HIGH_135, Blocks.SPEEDLIMIT_HIGH_140, Blocks.SPEEDLIMIT_HIGH_145, Blocks.SPEEDLIMIT_HIGH_150, Blocks.SPEEDLIMIT_HIGH_SPECIAL};
        SPEEDLIMIT_LOW_BLOCKS = new Block[]{Blocks.SPEEDLIMIT_LOW_3, Blocks.SPEEDLIMIT_LOW_5, Blocks.SPEEDLIMIT_LOW_10, Blocks.SPEEDLIMIT_LOW_15, Blocks.SPEEDLIMIT_LOW_20, Blocks.SPEEDLIMIT_LOW_25, Blocks.SPEEDLIMIT_LOW_30, Blocks.SPEEDLIMIT_LOW_35, Blocks.SPEEDLIMIT_LOW_40, Blocks.SPEEDLIMIT_LOW_45, Blocks.SPEEDLIMIT_LOW_50, Blocks.SPEEDLIMIT_LOW_55, Blocks.SPEEDLIMIT_LOW_60, Blocks.SPEEDLIMIT_LOW_65, Blocks.SPEEDLIMIT_LOW_70, Blocks.SPEEDLIMIT_LOW_75, Blocks.SPEEDLIMIT_LOW_80, Blocks.SPEEDLIMIT_LOW_85, Blocks.SPEEDLIMIT_LOW_90, Blocks.SPEEDLIMIT_LOW_95, Blocks.SPEEDLIMIT_LOW_100, Blocks.SPEEDLIMIT_LOW_105, Blocks.SPEEDLIMIT_LOW_110, Blocks.SPEEDLIMIT_LOW_115, Blocks.SPEEDLIMIT_LOW_120, Blocks.SPEEDLIMIT_LOW_125, Blocks.SPEEDLIMIT_LOW_130, Blocks.SPEEDLIMIT_LOW_135, Blocks.SPEEDLIMIT_LOW_140, Blocks.SPEEDLIMIT_LOW_145, Blocks.SPEEDLIMIT_LOW_150, Blocks.SPEEDLIMIT_LOW_SPECIAL};
        LIFT_SPEEDLIMIT_HIGH_BLOCKS = new Block[]{Blocks.LIFT_SPEEDLIMIT_HIGH_3, Blocks.LIFT_SPEEDLIMIT_HIGH_5, Blocks.LIFT_SPEEDLIMIT_HIGH_10, Blocks.LIFT_SPEEDLIMIT_HIGH_15, Blocks.LIFT_SPEEDLIMIT_HIGH_20, Blocks.LIFT_SPEEDLIMIT_HIGH_25, Blocks.LIFT_SPEEDLIMIT_HIGH_30, Blocks.LIFT_SPEEDLIMIT_HIGH_35, Blocks.LIFT_SPEEDLIMIT_HIGH_40, Blocks.LIFT_SPEEDLIMIT_HIGH_45, Blocks.LIFT_SPEEDLIMIT_HIGH_50, Blocks.LIFT_SPEEDLIMIT_HIGH_55, Blocks.LIFT_SPEEDLIMIT_HIGH_60, Blocks.LIFT_SPEEDLIMIT_HIGH_65, Blocks.LIFT_SPEEDLIMIT_HIGH_70, Blocks.LIFT_SPEEDLIMIT_HIGH_75, Blocks.LIFT_SPEEDLIMIT_HIGH_80, Blocks.LIFT_SPEEDLIMIT_HIGH_85, Blocks.LIFT_SPEEDLIMIT_HIGH_90, Blocks.LIFT_SPEEDLIMIT_HIGH_95, Blocks.LIFT_SPEEDLIMIT_HIGH_100, Blocks.LIFT_SPEEDLIMIT_HIGH_105, Blocks.LIFT_SPEEDLIMIT_HIGH_110, Blocks.LIFT_SPEEDLIMIT_HIGH_115, Blocks.LIFT_SPEEDLIMIT_HIGH_120, Blocks.LIFT_SPEEDLIMIT_HIGH_125, Blocks.LIFT_SPEEDLIMIT_HIGH_130, Blocks.LIFT_SPEEDLIMIT_HIGH_135, Blocks.LIFT_SPEEDLIMIT_HIGH_140, Blocks.LIFT_SPEEDLIMIT_HIGH_145, Blocks.LIFT_SPEEDLIMIT_HIGH_150, Blocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL};
        HEIGHTLIMIT_BLOCKS = new Block[]{Blocks.HEIGHTLIMIT_SPECIAL, Blocks.HEIGHTLIMIT_0D1, Blocks.HEIGHTLIMIT_0D2, Blocks.HEIGHTLIMIT_0D3, Blocks.HEIGHTLIMIT_0D4, Blocks.HEIGHTLIMIT_0D5, Blocks.HEIGHTLIMIT_0D6, Blocks.HEIGHTLIMIT_0D7, Blocks.HEIGHTLIMIT_0D8, Blocks.HEIGHTLIMIT_0D9, Blocks.HEIGHTLIMIT_1, Blocks.HEIGHTLIMIT_1D1, Blocks.HEIGHTLIMIT_1D2, Blocks.HEIGHTLIMIT_1D3, Blocks.HEIGHTLIMIT_1D4, Blocks.HEIGHTLIMIT_1D5, Blocks.HEIGHTLIMIT_1D6, Blocks.HEIGHTLIMIT_1D7, Blocks.HEIGHTLIMIT_1D8, Blocks.HEIGHTLIMIT_1D9, Blocks.HEIGHTLIMIT_2, Blocks.HEIGHTLIMIT_2D1, Blocks.HEIGHTLIMIT_2D2, Blocks.HEIGHTLIMIT_2D3, Blocks.HEIGHTLIMIT_2D4, Blocks.HEIGHTLIMIT_2D5, Blocks.HEIGHTLIMIT_2D6, Blocks.HEIGHTLIMIT_2D7, Blocks.HEIGHTLIMIT_2D8, Blocks.HEIGHTLIMIT_2D9, Blocks.HEIGHTLIMIT_3, Blocks.HEIGHTLIMIT_3D1, Blocks.HEIGHTLIMIT_3D2, Blocks.HEIGHTLIMIT_3D3, Blocks.HEIGHTLIMIT_3D4, Blocks.HEIGHTLIMIT_3D5, Blocks.HEIGHTLIMIT_3D6, Blocks.HEIGHTLIMIT_3D7, Blocks.HEIGHTLIMIT_3D8, Blocks.HEIGHTLIMIT_3D9, Blocks.HEIGHTLIMIT_4, Blocks.HEIGHTLIMIT_4D1, Blocks.HEIGHTLIMIT_4D2, Blocks.HEIGHTLIMIT_4D3, Blocks.HEIGHTLIMIT_4D4, Blocks.HEIGHTLIMIT_4D5, Blocks.HEIGHTLIMIT_4D6, Blocks.HEIGHTLIMIT_4D7, Blocks.HEIGHTLIMIT_4D8, Blocks.HEIGHTLIMIT_4D9, Blocks.HEIGHTLIMIT_5, Blocks.HEIGHTLIMIT_5D1, Blocks.HEIGHTLIMIT_5D2, Blocks.HEIGHTLIMIT_5D3, Blocks.HEIGHTLIMIT_5D4, Blocks.HEIGHTLIMIT_5D5, Blocks.HEIGHTLIMIT_5D6, Blocks.HEIGHTLIMIT_5D7, Blocks.HEIGHTLIMIT_5D8, Blocks.HEIGHTLIMIT_5D9, Blocks.HEIGHTLIMIT_6, Blocks.HEIGHTLIMIT_6D1, Blocks.HEIGHTLIMIT_6D2, Blocks.HEIGHTLIMIT_6D3, Blocks.HEIGHTLIMIT_6D4, Blocks.HEIGHTLIMIT_6D5, Blocks.HEIGHTLIMIT_6D6, Blocks.HEIGHTLIMIT_6D7, Blocks.HEIGHTLIMIT_6D8, Blocks.HEIGHTLIMIT_6D9, Blocks.HEIGHTLIMIT_7, Blocks.HEIGHTLIMIT_7D1, Blocks.HEIGHTLIMIT_7D2, Blocks.HEIGHTLIMIT_7D3, Blocks.HEIGHTLIMIT_7D4, Blocks.HEIGHTLIMIT_7D5, Blocks.HEIGHTLIMIT_7D6, Blocks.HEIGHTLIMIT_7D7, Blocks.HEIGHTLIMIT_7D8, Blocks.HEIGHTLIMIT_7D9, Blocks.HEIGHTLIMIT_8, Blocks.HEIGHTLIMIT_8D1, Blocks.HEIGHTLIMIT_8D2, Blocks.HEIGHTLIMIT_8D3, Blocks.HEIGHTLIMIT_8D4, Blocks.HEIGHTLIMIT_8D5, Blocks.HEIGHTLIMIT_8D6, Blocks.HEIGHTLIMIT_8D7, Blocks.HEIGHTLIMIT_8D8, Blocks.HEIGHTLIMIT_8D9, Blocks.HEIGHTLIMIT_9, Blocks.HEIGHTLIMIT_9D1, Blocks.HEIGHTLIMIT_9D2, Blocks.HEIGHTLIMIT_9D3, Blocks.HEIGHTLIMIT_9D4, Blocks.HEIGHTLIMIT_9D5, Blocks.HEIGHTLIMIT_9D6, Blocks.HEIGHTLIMIT_9D7, Blocks.HEIGHTLIMIT_9D8, Blocks.HEIGHTLIMIT_9D9, Blocks.HEIGHTLIMIT_10};
        PROHIBITION_BLOCKS = new Block[]{Blocks.PROHIBITION, Blocks.NO_U_TURN, Blocks.NO_LEFT_TURN, Blocks.NO_RIGHT_TURN, Blocks.NO_PARKING};
        HIGHWAY_HM_BLOCKS = new Block[]{Blocks.HIGHWAY_1HM, Blocks.HIGHWAY_2HM, Blocks.HIGHWAY_3HM, Blocks.HIGHWAY_4HM, Blocks.HIGHWAY_5HM, Blocks.HIGHWAY_6HM, Blocks.HIGHWAY_7HM, Blocks.HIGHWAY_8HM, Blocks.HIGHWAY_9HM};
        HALF1_CYLINDRICAL_ROD_BLOCKS = new Block[]{Blocks.WHITE_HALF1_CYLINDRICAL_ROD, Blocks.ORANGE_HALF1_CYLINDRICAL_ROD, Blocks.MAGENTA_HALF1_CYLINDRICAL_ROD, Blocks.LIGHT_BLUE_HALF1_CYLINDRICAL_ROD, Blocks.YELLOW_HALF1_CYLINDRICAL_ROD, Blocks.LIME_HALF1_CYLINDRICAL_ROD, Blocks.PINK_HALF1_CYLINDRICAL_ROD, Blocks.GRAY_HALF1_CYLINDRICAL_ROD, Blocks.LIGHT_GRAY_HALF1_CYLINDRICAL_ROD, Blocks.CYAN_HALF1_CYLINDRICAL_ROD, Blocks.PURPLE_HALF1_CYLINDRICAL_ROD, Blocks.BLUE_HALF1_CYLINDRICAL_ROD, Blocks.BROWN_HALF1_CYLINDRICAL_ROD, Blocks.GREEN_HALF1_CYLINDRICAL_ROD, Blocks.RED_HALF1_CYLINDRICAL_ROD, Blocks.BLACK_HALF1_CYLINDRICAL_ROD};
        FULL1_CYLINDRICAL_ROD_BLOCKS = new Block[]{Blocks.WHITE_FULL1_CYLINDRICAL_ROD, Blocks.ORANGE_FULL1_CYLINDRICAL_ROD, Blocks.MAGENTA_FULL1_CYLINDRICAL_ROD, Blocks.LIGHT_BLUE_FULL1_CYLINDRICAL_ROD, Blocks.YELLOW_FULL1_CYLINDRICAL_ROD, Blocks.LIME_FULL1_CYLINDRICAL_ROD, Blocks.PINK_FULL1_CYLINDRICAL_ROD, Blocks.GRAY_FULL1_CYLINDRICAL_ROD, Blocks.LIGHT_GRAY_FULL1_CYLINDRICAL_ROD, Blocks.CYAN_FULL1_CYLINDRICAL_ROD, Blocks.PURPLE_FULL1_CYLINDRICAL_ROD, Blocks.BLUE_FULL1_CYLINDRICAL_ROD, Blocks.BROWN_FULL1_CYLINDRICAL_ROD, Blocks.GREEN_FULL1_CYLINDRICAL_ROD, Blocks.RED_FULL1_CYLINDRICAL_ROD, Blocks.BLACK_FULL1_CYLINDRICAL_ROD};
        ROD_WITH_LAMP_BLOCKS = new Block[]{Blocks.WHITE_ROD_WITH_LAMP, Blocks.ORANGE_ROD_WITH_LAMP, Blocks.MAGENTA_ROD_WITH_LAMP, Blocks.LIGHT_BLUE_ROD_WITH_LAMP, Blocks.YELLOW_ROD_WITH_LAMP, Blocks.LIME_ROD_WITH_LAMP, Blocks.PINK_ROD_WITH_LAMP, Blocks.GRAY_ROD_WITH_LAMP, Blocks.LIGHT_GRAY_ROD_WITH_LAMP, Blocks.CYAN_ROD_WITH_LAMP, Blocks.PURPLE_ROD_WITH_LAMP, Blocks.BLUE_ROD_WITH_LAMP, Blocks.BROWN_ROD_WITH_LAMP, Blocks.GREEN_ROD_WITH_LAMP, Blocks.RED_ROD_WITH_LAMP, Blocks.BLACK_ROD_WITH_LAMP};
        DOTTED_TP_BLOCKS = new Block[][]{new Block[0], new Block[0], new Block[0], new Block[0], new Block[]{Blocks.WHITE_DOTTED4_TP, Blocks.ORANGE_DOTTED4_TP, Blocks.MAGENTA_DOTTED4_TP, Blocks.LIGHT_BLUE_DOTTED4_TP, Blocks.YELLOW_DOTTED4_TP, Blocks.LIME_DOTTED4_TP, Blocks.PINK_DOTTED4_TP, Blocks.GRAY_DOTTED4_TP, Blocks.LIGHT_GRAY_DOTTED4_TP, Blocks.CYAN_DOTTED4_TP, Blocks.PURPLE_DOTTED4_TP, Blocks.BLUE_DOTTED4_TP, Blocks.BROWN_DOTTED4_TP, Blocks.GREEN_DOTTED4_TP, Blocks.RED_DOTTED4_TP, Blocks.BLACK_DOTTED4_TP}, new Block[]{Blocks.WHITE_DOTTED5_TP, Blocks.ORANGE_DOTTED5_TP, Blocks.MAGENTA_DOTTED5_TP, Blocks.LIGHT_BLUE_DOTTED5_TP, Blocks.YELLOW_DOTTED5_TP, Blocks.LIME_DOTTED5_TP, Blocks.PINK_DOTTED5_TP, Blocks.GRAY_DOTTED5_TP, Blocks.LIGHT_GRAY_DOTTED5_TP, Blocks.CYAN_DOTTED5_TP, Blocks.PURPLE_DOTTED5_TP, Blocks.BLUE_DOTTED5_TP, Blocks.BROWN_DOTTED5_TP, Blocks.GREEN_DOTTED5_TP, Blocks.RED_DOTTED5_TP, Blocks.BLACK_DOTTED5_TP}, new Block[]{Blocks.WHITE_DOTTED6_TP, Blocks.ORANGE_DOTTED6_TP, Blocks.MAGENTA_DOTTED6_TP, Blocks.LIGHT_BLUE_DOTTED6_TP, Blocks.YELLOW_DOTTED6_TP, Blocks.LIME_DOTTED6_TP, Blocks.PINK_DOTTED6_TP, Blocks.GRAY_DOTTED6_TP, Blocks.LIGHT_GRAY_DOTTED6_TP, Blocks.CYAN_DOTTED6_TP, Blocks.PURPLE_DOTTED6_TP, Blocks.BLUE_DOTTED6_TP, Blocks.BROWN_DOTTED6_TP, Blocks.GREEN_DOTTED6_TP, Blocks.RED_DOTTED6_TP, Blocks.BLACK_DOTTED6_TP}, new Block[]{Blocks.WHITE_DOTTED7_TP, Blocks.ORANGE_DOTTED7_TP, Blocks.MAGENTA_DOTTED7_TP, Blocks.LIGHT_BLUE_DOTTED7_TP, Blocks.YELLOW_DOTTED7_TP, Blocks.LIME_DOTTED7_TP, Blocks.PINK_DOTTED7_TP, Blocks.GRAY_DOTTED7_TP, Blocks.LIGHT_GRAY_DOTTED7_TP, Blocks.CYAN_DOTTED7_TP, Blocks.PURPLE_DOTTED7_TP, Blocks.BLUE_DOTTED7_TP, Blocks.BROWN_DOTTED7_TP, Blocks.GREEN_DOTTED7_TP, Blocks.RED_DOTTED7_TP, Blocks.BLACK_DOTTED7_TP}, new Block[]{Blocks.WHITE_DOTTED8_TP, Blocks.ORANGE_DOTTED8_TP, Blocks.MAGENTA_DOTTED8_TP, Blocks.LIGHT_BLUE_DOTTED8_TP, Blocks.YELLOW_DOTTED8_TP, Blocks.LIME_DOTTED8_TP, Blocks.PINK_DOTTED8_TP, Blocks.GRAY_DOTTED8_TP, Blocks.LIGHT_GRAY_DOTTED8_TP, Blocks.CYAN_DOTTED8_TP, Blocks.PURPLE_DOTTED8_TP, Blocks.BLUE_DOTTED8_TP, Blocks.BROWN_DOTTED8_TP, Blocks.GREEN_DOTTED8_TP, Blocks.RED_DOTTED8_TP, Blocks.BLACK_DOTTED8_TP}, new Block[]{Blocks.WHITE_DOTTED9_TP, Blocks.ORANGE_DOTTED9_TP, Blocks.MAGENTA_DOTTED9_TP, Blocks.LIGHT_BLUE_DOTTED9_TP, Blocks.YELLOW_DOTTED9_TP, Blocks.LIME_DOTTED9_TP, Blocks.PINK_DOTTED9_TP, Blocks.GRAY_DOTTED9_TP, Blocks.LIGHT_GRAY_DOTTED9_TP, Blocks.CYAN_DOTTED9_TP, Blocks.PURPLE_DOTTED9_TP, Blocks.BLUE_DOTTED9_TP, Blocks.BROWN_DOTTED9_TP, Blocks.GREEN_DOTTED9_TP, Blocks.RED_DOTTED9_TP, Blocks.BLACK_DOTTED9_TP}, new Block[]{Blocks.WHITE_DOTTED10_TP, Blocks.ORANGE_DOTTED10_TP, Blocks.MAGENTA_DOTTED10_TP, Blocks.LIGHT_BLUE_DOTTED10_TP, Blocks.YELLOW_DOTTED10_TP, Blocks.LIME_DOTTED10_TP, Blocks.PINK_DOTTED10_TP, Blocks.GRAY_DOTTED10_TP, Blocks.LIGHT_GRAY_DOTTED10_TP, Blocks.CYAN_DOTTED10_TP, Blocks.PURPLE_DOTTED10_TP, Blocks.BLUE_DOTTED10_TP, Blocks.BROWN_DOTTED10_TP, Blocks.GREEN_DOTTED10_TP, Blocks.RED_DOTTED10_TP, Blocks.BLACK_DOTTED10_TP}};
        LINED_TP_BLOCKS = new Block[][]{new Block[0], new Block[0], new Block[0], new Block[0], new Block[]{Blocks.WHITE_LINED4_TP, Blocks.ORANGE_LINED4_TP, Blocks.MAGENTA_LINED4_TP, Blocks.LIGHT_BLUE_LINED4_TP, Blocks.YELLOW_LINED4_TP, Blocks.LIME_LINED4_TP, Blocks.PINK_LINED4_TP, Blocks.GRAY_LINED4_TP, Blocks.LIGHT_GRAY_LINED4_TP, Blocks.CYAN_LINED4_TP, Blocks.PURPLE_LINED4_TP, Blocks.BLUE_LINED4_TP, Blocks.BROWN_LINED4_TP, Blocks.GREEN_LINED4_TP, Blocks.RED_LINED4_TP, Blocks.BLACK_LINED4_TP}, new Block[]{Blocks.WHITE_LINED5_TP, Blocks.ORANGE_LINED5_TP, Blocks.MAGENTA_LINED5_TP, Blocks.LIGHT_BLUE_LINED5_TP, Blocks.YELLOW_LINED5_TP, Blocks.LIME_LINED5_TP, Blocks.PINK_LINED5_TP, Blocks.GRAY_LINED5_TP, Blocks.LIGHT_GRAY_LINED5_TP, Blocks.CYAN_LINED5_TP, Blocks.PURPLE_LINED5_TP, Blocks.BLUE_LINED5_TP, Blocks.BROWN_LINED5_TP, Blocks.GREEN_LINED5_TP, Blocks.RED_LINED5_TP, Blocks.BLACK_LINED5_TP}, new Block[]{Blocks.WHITE_LINED6_TP, Blocks.ORANGE_LINED6_TP, Blocks.MAGENTA_LINED6_TP, Blocks.LIGHT_BLUE_LINED6_TP, Blocks.YELLOW_LINED6_TP, Blocks.LIME_LINED6_TP, Blocks.PINK_LINED6_TP, Blocks.GRAY_LINED6_TP, Blocks.LIGHT_GRAY_LINED6_TP, Blocks.CYAN_LINED6_TP, Blocks.PURPLE_LINED6_TP, Blocks.BLUE_LINED6_TP, Blocks.BROWN_LINED6_TP, Blocks.GREEN_LINED6_TP, Blocks.RED_LINED6_TP, Blocks.BLACK_LINED6_TP}, new Block[]{Blocks.WHITE_LINED7_TP, Blocks.ORANGE_LINED7_TP, Blocks.MAGENTA_LINED7_TP, Blocks.LIGHT_BLUE_LINED7_TP, Blocks.YELLOW_LINED7_TP, Blocks.LIME_LINED7_TP, Blocks.PINK_LINED7_TP, Blocks.GRAY_LINED7_TP, Blocks.LIGHT_GRAY_LINED7_TP, Blocks.CYAN_LINED7_TP, Blocks.PURPLE_LINED7_TP, Blocks.BLUE_LINED7_TP, Blocks.BROWN_LINED7_TP, Blocks.GREEN_LINED7_TP, Blocks.RED_LINED7_TP, Blocks.BLACK_LINED7_TP}, new Block[]{Blocks.WHITE_LINED8_TP, Blocks.ORANGE_LINED8_TP, Blocks.MAGENTA_LINED8_TP, Blocks.LIGHT_BLUE_LINED8_TP, Blocks.YELLOW_LINED8_TP, Blocks.LIME_LINED8_TP, Blocks.PINK_LINED8_TP, Blocks.GRAY_LINED8_TP, Blocks.LIGHT_GRAY_LINED8_TP, Blocks.CYAN_LINED8_TP, Blocks.PURPLE_LINED8_TP, Blocks.BLUE_LINED8_TP, Blocks.BROWN_LINED8_TP, Blocks.GREEN_LINED8_TP, Blocks.RED_LINED8_TP, Blocks.BLACK_LINED8_TP}, new Block[]{Blocks.WHITE_LINED9_TP, Blocks.ORANGE_LINED9_TP, Blocks.MAGENTA_LINED9_TP, Blocks.LIGHT_BLUE_LINED9_TP, Blocks.YELLOW_LINED9_TP, Blocks.LIME_LINED9_TP, Blocks.PINK_LINED9_TP, Blocks.GRAY_LINED9_TP, Blocks.LIGHT_GRAY_LINED9_TP, Blocks.CYAN_LINED9_TP, Blocks.PURPLE_LINED9_TP, Blocks.BLUE_LINED9_TP, Blocks.BROWN_LINED9_TP, Blocks.GREEN_LINED9_TP, Blocks.RED_LINED9_TP, Blocks.BLACK_LINED9_TP}, new Block[]{Blocks.WHITE_LINED10_TP, Blocks.ORANGE_LINED10_TP, Blocks.MAGENTA_LINED10_TP, Blocks.LIGHT_BLUE_LINED10_TP, Blocks.YELLOW_LINED10_TP, Blocks.LIME_LINED10_TP, Blocks.PINK_LINED10_TP, Blocks.GRAY_LINED10_TP, Blocks.LIGHT_GRAY_LINED10_TP, Blocks.CYAN_LINED10_TP, Blocks.PURPLE_LINED10_TP, Blocks.BLUE_LINED10_TP, Blocks.BROWN_LINED10_TP, Blocks.GREEN_LINED10_TP, Blocks.RED_LINED10_TP, Blocks.BLACK_LINED10_TP}};
        SPEEDLIMIT_HIGH_ITEMS = new Item[]{Items.SPEEDLIMIT_HIGH_3, Items.SPEEDLIMIT_HIGH_5, Items.SPEEDLIMIT_HIGH_10, Items.SPEEDLIMIT_HIGH_15, Items.SPEEDLIMIT_HIGH_20, Items.SPEEDLIMIT_HIGH_25, Items.SPEEDLIMIT_HIGH_30, Items.SPEEDLIMIT_HIGH_35, Items.SPEEDLIMIT_HIGH_40, Items.SPEEDLIMIT_HIGH_45, Items.SPEEDLIMIT_HIGH_50, Items.SPEEDLIMIT_HIGH_55, Items.SPEEDLIMIT_HIGH_60, Items.SPEEDLIMIT_HIGH_65, Items.SPEEDLIMIT_HIGH_70, Items.SPEEDLIMIT_HIGH_75, Items.SPEEDLIMIT_HIGH_80, Items.SPEEDLIMIT_HIGH_85, Items.SPEEDLIMIT_HIGH_90, Items.SPEEDLIMIT_HIGH_95, Items.SPEEDLIMIT_HIGH_100, Items.SPEEDLIMIT_HIGH_105, Items.SPEEDLIMIT_HIGH_110, Items.SPEEDLIMIT_HIGH_115, Items.SPEEDLIMIT_HIGH_120, Items.SPEEDLIMIT_HIGH_125, Items.SPEEDLIMIT_HIGH_130, Items.SPEEDLIMIT_HIGH_135, Items.SPEEDLIMIT_HIGH_140, Items.SPEEDLIMIT_HIGH_145, Items.SPEEDLIMIT_HIGH_150, Items.SPEEDLIMIT_HIGH_SPECIAL};
        SPEEDLIMIT_LOW_ITEMS = new Item[]{Items.SPEEDLIMIT_LOW_3, Items.SPEEDLIMIT_LOW_5, Items.SPEEDLIMIT_LOW_10, Items.SPEEDLIMIT_LOW_15, Items.SPEEDLIMIT_LOW_20, Items.SPEEDLIMIT_LOW_25, Items.SPEEDLIMIT_LOW_30, Items.SPEEDLIMIT_LOW_35, Items.SPEEDLIMIT_LOW_40, Items.SPEEDLIMIT_LOW_45, Items.SPEEDLIMIT_LOW_50, Items.SPEEDLIMIT_LOW_55, Items.SPEEDLIMIT_LOW_60, Items.SPEEDLIMIT_LOW_65, Items.SPEEDLIMIT_LOW_70, Items.SPEEDLIMIT_LOW_75, Items.SPEEDLIMIT_LOW_80, Items.SPEEDLIMIT_LOW_85, Items.SPEEDLIMIT_LOW_90, Items.SPEEDLIMIT_LOW_95, Items.SPEEDLIMIT_LOW_100, Items.SPEEDLIMIT_LOW_105, Items.SPEEDLIMIT_LOW_110, Items.SPEEDLIMIT_LOW_115, Items.SPEEDLIMIT_LOW_120, Items.SPEEDLIMIT_LOW_125, Items.SPEEDLIMIT_LOW_130, Items.SPEEDLIMIT_LOW_135, Items.SPEEDLIMIT_LOW_140, Items.SPEEDLIMIT_LOW_145, Items.SPEEDLIMIT_LOW_150, Items.SPEEDLIMIT_LOW_SPECIAL};
        LIFT_SPEEDLIMIT_HIGH_ITEMS = new Item[]{Items.LIFT_SPEEDLIMIT_HIGH_3, Items.LIFT_SPEEDLIMIT_HIGH_5, Items.LIFT_SPEEDLIMIT_HIGH_10, Items.LIFT_SPEEDLIMIT_HIGH_15, Items.LIFT_SPEEDLIMIT_HIGH_20, Items.LIFT_SPEEDLIMIT_HIGH_25, Items.LIFT_SPEEDLIMIT_HIGH_30, Items.LIFT_SPEEDLIMIT_HIGH_35, Items.LIFT_SPEEDLIMIT_HIGH_40, Items.LIFT_SPEEDLIMIT_HIGH_45, Items.LIFT_SPEEDLIMIT_HIGH_50, Items.LIFT_SPEEDLIMIT_HIGH_55, Items.LIFT_SPEEDLIMIT_HIGH_60, Items.LIFT_SPEEDLIMIT_HIGH_65, Items.LIFT_SPEEDLIMIT_HIGH_70, Items.LIFT_SPEEDLIMIT_HIGH_75, Items.LIFT_SPEEDLIMIT_HIGH_80, Items.LIFT_SPEEDLIMIT_HIGH_85, Items.LIFT_SPEEDLIMIT_HIGH_90, Items.LIFT_SPEEDLIMIT_HIGH_95, Items.LIFT_SPEEDLIMIT_HIGH_100, Items.LIFT_SPEEDLIMIT_HIGH_105, Items.LIFT_SPEEDLIMIT_HIGH_110, Items.LIFT_SPEEDLIMIT_HIGH_115, Items.LIFT_SPEEDLIMIT_HIGH_120, Items.LIFT_SPEEDLIMIT_HIGH_125, Items.LIFT_SPEEDLIMIT_HIGH_130, Items.LIFT_SPEEDLIMIT_HIGH_135, Items.LIFT_SPEEDLIMIT_HIGH_140, Items.LIFT_SPEEDLIMIT_HIGH_145, Items.LIFT_SPEEDLIMIT_HIGH_150, Items.LIFT_SPEEDLIMIT_HIGH_SPECIAL};
        HEIGHTLIMIT_ITEMS = new Item[]{Items.HEIGHTLIMIT_SPECIAL, Items.HEIGHTLIMIT_0D1, Items.HEIGHTLIMIT_0D2, Items.HEIGHTLIMIT_0D3, Items.HEIGHTLIMIT_0D4, Items.HEIGHTLIMIT_0D5, Items.HEIGHTLIMIT_0D6, Items.HEIGHTLIMIT_0D7, Items.HEIGHTLIMIT_0D8, Items.HEIGHTLIMIT_0D9, Items.HEIGHTLIMIT_1, Items.HEIGHTLIMIT_1D1, Items.HEIGHTLIMIT_1D2, Items.HEIGHTLIMIT_1D3, Items.HEIGHTLIMIT_1D4, Items.HEIGHTLIMIT_1D5, Items.HEIGHTLIMIT_1D6, Items.HEIGHTLIMIT_1D7, Items.HEIGHTLIMIT_1D8, Items.HEIGHTLIMIT_1D9, Items.HEIGHTLIMIT_2, Items.HEIGHTLIMIT_2D1, Items.HEIGHTLIMIT_2D2, Items.HEIGHTLIMIT_2D3, Items.HEIGHTLIMIT_2D4, Items.HEIGHTLIMIT_2D5, Items.HEIGHTLIMIT_2D6, Items.HEIGHTLIMIT_2D7, Items.HEIGHTLIMIT_2D8, Items.HEIGHTLIMIT_2D9, Items.HEIGHTLIMIT_3, Items.HEIGHTLIMIT_3D1, Items.HEIGHTLIMIT_3D2, Items.HEIGHTLIMIT_3D3, Items.HEIGHTLIMIT_3D4, Items.HEIGHTLIMIT_3D5, Items.HEIGHTLIMIT_3D6, Items.HEIGHTLIMIT_3D7, Items.HEIGHTLIMIT_3D8, Items.HEIGHTLIMIT_3D9, Items.HEIGHTLIMIT_4, Items.HEIGHTLIMIT_4D1, Items.HEIGHTLIMIT_4D2, Items.HEIGHTLIMIT_4D3, Items.HEIGHTLIMIT_4D4, Items.HEIGHTLIMIT_4D5, Items.HEIGHTLIMIT_4D6, Items.HEIGHTLIMIT_4D7, Items.HEIGHTLIMIT_4D8, Items.HEIGHTLIMIT_4D9, Items.HEIGHTLIMIT_5, Items.HEIGHTLIMIT_5D1, Items.HEIGHTLIMIT_5D2, Items.HEIGHTLIMIT_5D3, Items.HEIGHTLIMIT_5D4, Items.HEIGHTLIMIT_5D5, Items.HEIGHTLIMIT_5D6, Items.HEIGHTLIMIT_5D7, Items.HEIGHTLIMIT_5D8, Items.HEIGHTLIMIT_5D9, Items.HEIGHTLIMIT_6, Items.HEIGHTLIMIT_6D1, Items.HEIGHTLIMIT_6D2, Items.HEIGHTLIMIT_6D3, Items.HEIGHTLIMIT_6D4, Items.HEIGHTLIMIT_6D5, Items.HEIGHTLIMIT_6D6, Items.HEIGHTLIMIT_6D7, Items.HEIGHTLIMIT_6D8, Items.HEIGHTLIMIT_6D9, Items.HEIGHTLIMIT_7, Items.HEIGHTLIMIT_7D1, Items.HEIGHTLIMIT_7D2, Items.HEIGHTLIMIT_7D3, Items.HEIGHTLIMIT_7D4, Items.HEIGHTLIMIT_7D5, Items.HEIGHTLIMIT_7D6, Items.HEIGHTLIMIT_7D7, Items.HEIGHTLIMIT_7D8, Items.HEIGHTLIMIT_7D9, Items.HEIGHTLIMIT_8, Items.HEIGHTLIMIT_8D1, Items.HEIGHTLIMIT_8D2, Items.HEIGHTLIMIT_8D3, Items.HEIGHTLIMIT_8D4, Items.HEIGHTLIMIT_8D5, Items.HEIGHTLIMIT_8D6, Items.HEIGHTLIMIT_8D7, Items.HEIGHTLIMIT_8D8, Items.HEIGHTLIMIT_8D9, Items.HEIGHTLIMIT_9, Items.HEIGHTLIMIT_9D1, Items.HEIGHTLIMIT_9D2, Items.HEIGHTLIMIT_9D3, Items.HEIGHTLIMIT_9D4, Items.HEIGHTLIMIT_9D5, Items.HEIGHTLIMIT_9D6, Items.HEIGHTLIMIT_9D7, Items.HEIGHTLIMIT_9D8, Items.HEIGHTLIMIT_9D9, Items.HEIGHTLIMIT_10};
        PROHIBITION_ITEMS = new Item[]{Items.PROHIBITION, Items.NO_U_TURN, Items.NO_LEFT_TURN, Items.NO_RIGHT_TURN, Items.NO_PARKING};
        HIGHWAY_HM_ITEMS = new Item[]{Items.HIGHWAY_1HM, Items.HIGHWAY_2HM, Items.HIGHWAY_3HM, Items.HIGHWAY_4HM, Items.HIGHWAY_5HM, Items.HIGHWAY_6HM, Items.HIGHWAY_7HM, Items.HIGHWAY_8HM, Items.HIGHWAY_9HM};
        HALF1_CYLINDRICAL_ROD_ITEMS = new Item[]{Items.WHITE_HALF1_CYLINDRICAL_ROD, Items.ORANGE_HALF1_CYLINDRICAL_ROD, Items.MAGENTA_HALF1_CYLINDRICAL_ROD, Items.LIGHT_BLUE_HALF1_CYLINDRICAL_ROD, Items.YELLOW_HALF1_CYLINDRICAL_ROD, Items.LIME_HALF1_CYLINDRICAL_ROD, Items.PINK_HALF1_CYLINDRICAL_ROD, Items.GRAY_HALF1_CYLINDRICAL_ROD, Items.LIGHT_GRAY_HALF1_CYLINDRICAL_ROD, Items.CYAN_HALF1_CYLINDRICAL_ROD, Items.PURPLE_HALF1_CYLINDRICAL_ROD, Items.BLUE_HALF1_CYLINDRICAL_ROD, Items.BROWN_HALF1_CYLINDRICAL_ROD, Items.GREEN_HALF1_CYLINDRICAL_ROD, Items.RED_HALF1_CYLINDRICAL_ROD, Items.BLACK_HALF1_CYLINDRICAL_ROD};
        FULL1_CYLINDRICAL_ROD_ITEMS = new Item[]{Items.WHITE_FULL1_CYLINDRICAL_ROD, Items.ORANGE_FULL1_CYLINDRICAL_ROD, Items.MAGENTA_FULL1_CYLINDRICAL_ROD, Items.LIGHT_BLUE_FULL1_CYLINDRICAL_ROD, Items.YELLOW_FULL1_CYLINDRICAL_ROD, Items.LIME_FULL1_CYLINDRICAL_ROD, Items.PINK_FULL1_CYLINDRICAL_ROD, Items.GRAY_FULL1_CYLINDRICAL_ROD, Items.LIGHT_GRAY_FULL1_CYLINDRICAL_ROD, Items.CYAN_FULL1_CYLINDRICAL_ROD, Items.PURPLE_FULL1_CYLINDRICAL_ROD, Items.BLUE_FULL1_CYLINDRICAL_ROD, Items.BROWN_FULL1_CYLINDRICAL_ROD, Items.GREEN_FULL1_CYLINDRICAL_ROD, Items.RED_FULL1_CYLINDRICAL_ROD, Items.BLACK_FULL1_CYLINDRICAL_ROD};
        ROD_WITH_LAMP_ITEMS = new Item[]{Items.WHITE_ROD_WITH_LAMP, Items.ORANGE_ROD_WITH_LAMP, Items.MAGENTA_ROD_WITH_LAMP, Items.LIGHT_BLUE_ROD_WITH_LAMP, Items.YELLOW_ROD_WITH_LAMP, Items.LIME_ROD_WITH_LAMP, Items.PINK_ROD_WITH_LAMP, Items.GRAY_ROD_WITH_LAMP, Items.LIGHT_GRAY_ROD_WITH_LAMP, Items.CYAN_ROD_WITH_LAMP, Items.PURPLE_ROD_WITH_LAMP, Items.BLUE_ROD_WITH_LAMP, Items.BROWN_ROD_WITH_LAMP, Items.GREEN_ROD_WITH_LAMP, Items.RED_ROD_WITH_LAMP, Items.BLACK_ROD_WITH_LAMP};
        DOTTED_TP_ITEMS = new Item[][]{new Item[0], new Item[0], new Item[0], new Item[0], new Item[]{Items.WHITE_DOTTED4_TP, Items.ORANGE_DOTTED4_TP, Items.MAGENTA_DOTTED4_TP, Items.LIGHT_BLUE_DOTTED4_TP, Items.YELLOW_DOTTED4_TP, Items.LIME_DOTTED4_TP, Items.PINK_DOTTED4_TP, Items.GRAY_DOTTED4_TP, Items.LIGHT_GRAY_DOTTED4_TP, Items.CYAN_DOTTED4_TP, Items.PURPLE_DOTTED4_TP, Items.BLUE_DOTTED4_TP, Items.BROWN_DOTTED4_TP, Items.GREEN_DOTTED4_TP, Items.RED_DOTTED4_TP, Items.BLACK_DOTTED4_TP}, new Item[]{Items.WHITE_DOTTED5_TP, Items.ORANGE_DOTTED5_TP, Items.MAGENTA_DOTTED5_TP, Items.LIGHT_BLUE_DOTTED5_TP, Items.YELLOW_DOTTED5_TP, Items.LIME_DOTTED5_TP, Items.PINK_DOTTED5_TP, Items.GRAY_DOTTED5_TP, Items.LIGHT_GRAY_DOTTED5_TP, Items.CYAN_DOTTED5_TP, Items.PURPLE_DOTTED5_TP, Items.BLUE_DOTTED5_TP, Items.BROWN_DOTTED5_TP, Items.GREEN_DOTTED5_TP, Items.RED_DOTTED5_TP, Items.BLACK_DOTTED5_TP}, new Item[]{Items.WHITE_DOTTED6_TP, Items.ORANGE_DOTTED6_TP, Items.MAGENTA_DOTTED6_TP, Items.LIGHT_BLUE_DOTTED6_TP, Items.YELLOW_DOTTED6_TP, Items.LIME_DOTTED6_TP, Items.PINK_DOTTED6_TP, Items.GRAY_DOTTED6_TP, Items.LIGHT_GRAY_DOTTED6_TP, Items.CYAN_DOTTED6_TP, Items.PURPLE_DOTTED6_TP, Items.BLUE_DOTTED6_TP, Items.BROWN_DOTTED6_TP, Items.GREEN_DOTTED6_TP, Items.RED_DOTTED6_TP, Items.BLACK_DOTTED6_TP}, new Item[]{Items.WHITE_DOTTED7_TP, Items.ORANGE_DOTTED7_TP, Items.MAGENTA_DOTTED7_TP, Items.LIGHT_BLUE_DOTTED7_TP, Items.YELLOW_DOTTED7_TP, Items.LIME_DOTTED7_TP, Items.PINK_DOTTED7_TP, Items.GRAY_DOTTED7_TP, Items.LIGHT_GRAY_DOTTED7_TP, Items.CYAN_DOTTED7_TP, Items.PURPLE_DOTTED7_TP, Items.BLUE_DOTTED7_TP, Items.BROWN_DOTTED7_TP, Items.GREEN_DOTTED7_TP, Items.RED_DOTTED7_TP, Items.BLACK_DOTTED7_TP}, new Item[]{Items.WHITE_DOTTED8_TP, Items.ORANGE_DOTTED8_TP, Items.MAGENTA_DOTTED8_TP, Items.LIGHT_BLUE_DOTTED8_TP, Items.YELLOW_DOTTED8_TP, Items.LIME_DOTTED8_TP, Items.PINK_DOTTED8_TP, Items.GRAY_DOTTED8_TP, Items.LIGHT_GRAY_DOTTED8_TP, Items.CYAN_DOTTED8_TP, Items.PURPLE_DOTTED8_TP, Items.BLUE_DOTTED8_TP, Items.BROWN_DOTTED8_TP, Items.GREEN_DOTTED8_TP, Items.RED_DOTTED8_TP, Items.BLACK_DOTTED8_TP}, new Item[]{Items.WHITE_DOTTED9_TP, Items.ORANGE_DOTTED9_TP, Items.MAGENTA_DOTTED9_TP, Items.LIGHT_BLUE_DOTTED9_TP, Items.YELLOW_DOTTED9_TP, Items.LIME_DOTTED9_TP, Items.PINK_DOTTED9_TP, Items.GRAY_DOTTED9_TP, Items.LIGHT_GRAY_DOTTED9_TP, Items.CYAN_DOTTED9_TP, Items.PURPLE_DOTTED9_TP, Items.BLUE_DOTTED9_TP, Items.BROWN_DOTTED9_TP, Items.GREEN_DOTTED9_TP, Items.RED_DOTTED9_TP, Items.BLACK_DOTTED9_TP}, new Item[]{Items.WHITE_DOTTED10_TP, Items.ORANGE_DOTTED10_TP, Items.MAGENTA_DOTTED10_TP, Items.LIGHT_BLUE_DOTTED10_TP, Items.YELLOW_DOTTED10_TP, Items.LIME_DOTTED10_TP, Items.PINK_DOTTED10_TP, Items.GRAY_DOTTED10_TP, Items.LIGHT_GRAY_DOTTED10_TP, Items.CYAN_DOTTED10_TP, Items.PURPLE_DOTTED10_TP, Items.BLUE_DOTTED10_TP, Items.BROWN_DOTTED10_TP, Items.GREEN_DOTTED10_TP, Items.RED_DOTTED10_TP, Items.BLACK_DOTTED10_TP}};
        LINED_TP_ITEMS = new Item[][]{new Item[0], new Item[0], new Item[0], new Item[0], new Item[]{Items.WHITE_LINED4_TP, Items.ORANGE_LINED4_TP, Items.MAGENTA_LINED4_TP, Items.LIGHT_BLUE_LINED4_TP, Items.YELLOW_LINED4_TP, Items.LIME_LINED4_TP, Items.PINK_LINED4_TP, Items.GRAY_LINED4_TP, Items.LIGHT_GRAY_LINED4_TP, Items.CYAN_LINED4_TP, Items.PURPLE_LINED4_TP, Items.BLUE_LINED4_TP, Items.BROWN_LINED4_TP, Items.GREEN_LINED4_TP, Items.RED_LINED4_TP, Items.BLACK_LINED4_TP}, new Item[]{Items.WHITE_LINED5_TP, Items.ORANGE_LINED5_TP, Items.MAGENTA_LINED5_TP, Items.LIGHT_BLUE_LINED5_TP, Items.YELLOW_LINED5_TP, Items.LIME_LINED5_TP, Items.PINK_LINED5_TP, Items.GRAY_LINED5_TP, Items.LIGHT_GRAY_LINED5_TP, Items.CYAN_LINED5_TP, Items.PURPLE_LINED5_TP, Items.BLUE_LINED5_TP, Items.BROWN_LINED5_TP, Items.GREEN_LINED5_TP, Items.RED_LINED5_TP, Items.BLACK_LINED5_TP}, new Item[]{Items.WHITE_LINED6_TP, Items.ORANGE_LINED6_TP, Items.MAGENTA_LINED6_TP, Items.LIGHT_BLUE_LINED6_TP, Items.YELLOW_LINED6_TP, Items.LIME_LINED6_TP, Items.PINK_LINED6_TP, Items.GRAY_LINED6_TP, Items.LIGHT_GRAY_LINED6_TP, Items.CYAN_LINED6_TP, Items.PURPLE_LINED6_TP, Items.BLUE_LINED6_TP, Items.BROWN_LINED6_TP, Items.GREEN_LINED6_TP, Items.RED_LINED6_TP, Items.BLACK_LINED6_TP}, new Item[]{Items.WHITE_LINED7_TP, Items.ORANGE_LINED7_TP, Items.MAGENTA_LINED7_TP, Items.LIGHT_BLUE_LINED7_TP, Items.YELLOW_LINED7_TP, Items.LIME_LINED7_TP, Items.PINK_LINED7_TP, Items.GRAY_LINED7_TP, Items.LIGHT_GRAY_LINED7_TP, Items.CYAN_LINED7_TP, Items.PURPLE_LINED7_TP, Items.BLUE_LINED7_TP, Items.BROWN_LINED7_TP, Items.GREEN_LINED7_TP, Items.RED_LINED7_TP, Items.BLACK_LINED7_TP}, new Item[]{Items.WHITE_LINED8_TP, Items.ORANGE_LINED8_TP, Items.MAGENTA_LINED8_TP, Items.LIGHT_BLUE_LINED8_TP, Items.YELLOW_LINED8_TP, Items.LIME_LINED8_TP, Items.PINK_LINED8_TP, Items.GRAY_LINED8_TP, Items.LIGHT_GRAY_LINED8_TP, Items.CYAN_LINED8_TP, Items.PURPLE_LINED8_TP, Items.BLUE_LINED8_TP, Items.BROWN_LINED8_TP, Items.GREEN_LINED8_TP, Items.RED_LINED8_TP, Items.BLACK_LINED8_TP}, new Item[]{Items.WHITE_LINED9_TP, Items.ORANGE_LINED9_TP, Items.MAGENTA_LINED9_TP, Items.LIGHT_BLUE_LINED9_TP, Items.YELLOW_LINED9_TP, Items.LIME_LINED9_TP, Items.PINK_LINED9_TP, Items.GRAY_LINED9_TP, Items.LIGHT_GRAY_LINED9_TP, Items.CYAN_LINED9_TP, Items.PURPLE_LINED9_TP, Items.BLUE_LINED9_TP, Items.BROWN_LINED9_TP, Items.GREEN_LINED9_TP, Items.RED_LINED9_TP, Items.BLACK_LINED9_TP}, new Item[]{Items.WHITE_LINED10_TP, Items.ORANGE_LINED10_TP, Items.MAGENTA_LINED10_TP, Items.LIGHT_BLUE_LINED10_TP, Items.YELLOW_LINED10_TP, Items.LIME_LINED10_TP, Items.PINK_LINED10_TP, Items.GRAY_LINED10_TP, Items.LIGHT_GRAY_LINED10_TP, Items.CYAN_LINED10_TP, Items.PURPLE_LINED10_TP, Items.BLUE_LINED10_TP, Items.BROWN_LINED10_TP, Items.GREEN_LINED10_TP, Items.RED_LINED10_TP, Items.BLACK_LINED10_TP}};
        ITEM_GROUP = FabricCreativeModeTab.builder().icon(() -> new ItemStack(Items.SPEEDLIMIT_HIGH_120)).displayName(Text.translatableWithFallback("itemGroup.cntrafficsymbols_0d0",
                                                                                                                                             "CNTrafficSymbols 0.0")).entries((c, e) -> {
            for (Item i : SPEEDLIMIT_HIGH_ITEMS) e.add(i);
            for (Item i : SPEEDLIMIT_LOW_ITEMS) e.add(i);
            for (Item i : LIFT_SPEEDLIMIT_HIGH_ITEMS) e.add(i);
            e.add(Items.IRON_PLATE);
            e.add(Items.CIRCLE_BACKBOARD);
            for (Item i : HEIGHTLIMIT_ITEMS) e.add(i);
            for (Item i : PROHIBITION_ITEMS) e.add(i);
            for (Item i : HIGHWAY_HM_ITEMS) e.add(i);
            e.add(Items.WHITE_FLOOR_LINE_EIGHTH);
            e.add(Items.YELLOW_FLOOR_LINE_EIGHTH);
            e.add(Items.HIGHWAY_KM);
            e.add(Items.DISTANCE_DETECTION_0M_LEFT);
            e.add(Items.DISTANCE_DETECTION_0M_RIGHT);
            e.add(Items.DISTANCE_DETECTION_50M_LEFT);
            e.add(Items.DISTANCE_DETECTION_50M_RIGHT);
            e.add(Items.DISTANCE_DETECTION_100M_LEFT);
            e.add(Items.DISTANCE_DETECTION_100M_RIGHT);
            e.add(Items.DISTANCE_DETECTION_200M_LEFT);
            e.add(Items.DISTANCE_DETECTION_200M_RIGHT);
            e.add(Items.BARRICADE_1M_EDGE_1M_HEIGHT);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP);
            e.add(Items.KEEP_SPACE_VARIANT1_UPPERLEFT);
            e.add(Items.KEEP_SPACE_VARIANT1_UPPER);
            e.add(Items.KEEP_SPACE_VARIANT1_UPPERRIGHT);
            e.add(Items.KEEP_SPACE_VARIANT2_UPPERLEFT);
            e.add(Items.KEEP_SPACE_VARIANT2_UPPER);
            e.add(Items.KEEP_SPACE_VARIANT2_UPPERRIGHT);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE);
            e.add(Items.KEEP_SPACE_VARIANT1_LEFT);
            e.add(Items.KEEP_SPACE_VARIANT1_CENTER);
            e.add(Items.KEEP_SPACE_VARIANT1_RIGHT);
            e.add(Items.KEEP_SPACE_VARIANT2_LEFT);
            e.add(Items.KEEP_SPACE_VARIANT2_CENTER);
            e.add(Items.KEEP_SPACE_VARIANT2_RIGHT);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM);
            e.add(Items.KEEP_SPACE_VARIANT1_LOWERLEFT);
            e.add(Items.KEEP_SPACE_VARIANT1_LOWER);
            e.add(Items.KEEP_SPACE_VARIANT1_LOWERRIGHT);
            e.add(Items.KEEP_SPACE_VARIANT2_LOWERLEFT);
            e.add(Items.KEEP_SPACE_VARIANT2_LOWER);
            e.add(Items.KEEP_SPACE_VARIANT2_LOWERRIGHT);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE);
            e.add(Items.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE);
            e.add(Items.BARRICADE_50CM_EDGE_75CM_HEIGHT);
            e.add(Items.BARRICADE_50CM_EDGE_1M_HEIGHT);
            for (Item i : HALF1_CYLINDRICAL_ROD_ITEMS) e.add(i);
            for (Item i : FULL1_CYLINDRICAL_ROD_ITEMS) e.add(i);
            for (Item i : ROD_WITH_LAMP_ITEMS) e.add(i);
            e.add(Items.FULL_SQUARE_BACKBOARD);
            for (Item[] i : DOTTED_TP_ITEMS) for (Item j : i) e.add(j);
            for (Item[] i : LINED_TP_ITEMS) for (Item j : i) e.add(j);
        }).build();
    }

    public static void doit() {
        Blocks.FLOOR_LINE_EIGHTHS.setItm1(Items.WHITE_FLOOR_LINE_EIGHTH);
        Blocks.FLOOR_LINE_EIGHTHS.setItm2(Items.YELLOW_FLOOR_LINE_EIGHTH);
        Blocks.BARRICADES_1.setItm0(Items.BARRICADE_1M_EDGE_1M_HEIGHT);
        Blocks.BARRICADES_1.setItm1(Items.BARRICADE_50CM_EDGE_75CM_HEIGHT);
        Blocks.BARRICADES_1.setItm2(Items.BARRICADE_50CM_EDGE_1M_HEIGHT);
        Blocks.DISTANCE_DETECTION_0M_LEFT
            .addToArr(Blocks.DISTANCE_DETECTION_0M_LEFT);
        Blocks.DISTANCE_DETECTION_0M_LEFT
            .addToArr(Blocks.DISTANCE_DETECTION_0M_RIGHT);
        Blocks.DISTANCE_DETECTION_0M_LEFT.freezeArr();
        Blocks.DISTANCE_DETECTION_0M_RIGHT.freezeArr();
        Blocks.DISTANCE_DETECTION_50M_LEFT
            .addToArr(Blocks.DISTANCE_DETECTION_50M_LEFT);
        Blocks.DISTANCE_DETECTION_50M_LEFT
            .addToArr(Blocks.DISTANCE_DETECTION_50M_RIGHT);
        Blocks.DISTANCE_DETECTION_50M_LEFT.freezeArr();
        Blocks.DISTANCE_DETECTION_50M_RIGHT.freezeArr();
        Blocks.DISTANCE_DETECTION_100M_LEFT
            .addToArr(Blocks.DISTANCE_DETECTION_100M_LEFT);
        Blocks.DISTANCE_DETECTION_100M_LEFT
            .addToArr(Blocks.DISTANCE_DETECTION_100M_RIGHT);
        Blocks.DISTANCE_DETECTION_100M_LEFT.freezeArr();
        Blocks.DISTANCE_DETECTION_100M_RIGHT.freezeArr();
        Blocks.DISTANCE_DETECTION_200M_LEFT
            .addToArr(Blocks.DISTANCE_DETECTION_200M_LEFT);
        Blocks.DISTANCE_DETECTION_200M_LEFT
            .addToArr(Blocks.DISTANCE_DETECTION_200M_RIGHT);
        Blocks.DISTANCE_DETECTION_200M_LEFT.freezeArr();
        Blocks.DISTANCE_DETECTION_200M_RIGHT.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM
            .addToArr(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM);
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM.freezeArr();
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM.freezeArr();
        Blocks.KEEP_SPACE_VARIANT1_UPPERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT1_UPPERLEFT);
        Blocks.KEEP_SPACE_VARIANT1_UPPERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT1_UPPER);
        Blocks.KEEP_SPACE_VARIANT1_UPPERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT1_UPPERRIGHT);
        Blocks.KEEP_SPACE_VARIANT1_UPPERLEFT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT1_UPPER.freezeArr();
        Blocks.KEEP_SPACE_VARIANT1_UPPERRIGHT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT1_LEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT1_LEFT);
        Blocks.KEEP_SPACE_VARIANT1_LEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT1_CENTER);
        Blocks.KEEP_SPACE_VARIANT1_LEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT1_RIGHT);
        Blocks.KEEP_SPACE_VARIANT1_LEFT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT1_CENTER.freezeArr();
        Blocks.KEEP_SPACE_VARIANT1_RIGHT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT1_LOWERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT1_LOWERLEFT);
        Blocks.KEEP_SPACE_VARIANT1_LOWERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT1_LOWER);
        Blocks.KEEP_SPACE_VARIANT1_LOWERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT1_LOWERRIGHT);
        Blocks.KEEP_SPACE_VARIANT1_LOWERLEFT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT1_LOWER.freezeArr();
        Blocks.KEEP_SPACE_VARIANT1_LOWERRIGHT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT2_UPPERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT2_UPPERLEFT);
        Blocks.KEEP_SPACE_VARIANT2_UPPERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT2_UPPER);
        Blocks.KEEP_SPACE_VARIANT2_UPPERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT2_UPPERRIGHT);
        Blocks.KEEP_SPACE_VARIANT2_UPPERLEFT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT2_UPPER.freezeArr();
        Blocks.KEEP_SPACE_VARIANT2_UPPERRIGHT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT2_LEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT2_LEFT);
        Blocks.KEEP_SPACE_VARIANT2_LEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT2_CENTER);
        Blocks.KEEP_SPACE_VARIANT2_LEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT2_RIGHT);
        Blocks.KEEP_SPACE_VARIANT2_LEFT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT2_CENTER.freezeArr();
        Blocks.KEEP_SPACE_VARIANT2_RIGHT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT2_LOWERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT2_LOWERLEFT);
        Blocks.KEEP_SPACE_VARIANT2_LOWERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT2_LOWER);
        Blocks.KEEP_SPACE_VARIANT2_LOWERLEFT
            .addToArr(Blocks.KEEP_SPACE_VARIANT2_LOWERRIGHT);
        Blocks.KEEP_SPACE_VARIANT2_LOWERLEFT.freezeArr();
        Blocks.KEEP_SPACE_VARIANT2_LOWER.freezeArr();
        Blocks.KEEP_SPACE_VARIANT2_LOWERRIGHT.freezeArr();
        Registry.register(Registries.BLOCK_ENTITY_TYPE, commitAndGet(Registries.BLOCK_ENTITY_TYPE, "highway_hm"), rege.pegui.cntrafficsymbols.be
                              .HighwayHmSignBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, commitAndGet(Registries.BLOCK_ENTITY_TYPE, "highway_km"), rege.pegui.cntrafficsymbols.be
                              .HighwayKmSignBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, commitAndGet(Registries.BLOCK_ENTITY_TYPE, "highway_exit_distance_info_name"), rege.pegui
                              .cntrafficsymbols.be.HighwayExitDistanceInfoNameBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, commitAndGet(Registries.BLOCK_ENTITY_TYPE, "highway_exit_distance_info_km"), rege.pegui
                              .cntrafficsymbols.be.HighwayExitDistanceInfoKmBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, commitAndGet(Registries.BLOCK_ENTITY_TYPE, "rod_with_lamp"), rege.pegui.cntrafficsymbols.be
                              .RodWithLampBlockEntity.TYPE);
        Registry.register(Registries.ITEM_GROUP, Identifier.of(
                "cntrafficsymbols_0d0", "cntrafficsymbols"
        ), ITEM_GROUP);
        push();
        /*try {
            Block[] tab = {Blocks.SPEEDLIMIT_HIGH_3, Blocks.SPEEDLIMIT_HIGH_5, Blocks.SPEEDLIMIT_HIGH_10, Blocks.SPEEDLIMIT_HIGH_15, Blocks.SPEEDLIMIT_HIGH_20, Blocks.SPEEDLIMIT_HIGH_25, Blocks.SPEEDLIMIT_HIGH_30, Blocks.SPEEDLIMIT_HIGH_35, Blocks.SPEEDLIMIT_HIGH_40, Blocks.SPEEDLIMIT_HIGH_45, Blocks.SPEEDLIMIT_HIGH_50, Blocks.SPEEDLIMIT_HIGH_55, Blocks.SPEEDLIMIT_HIGH_60, Blocks.SPEEDLIMIT_HIGH_65, Blocks.SPEEDLIMIT_HIGH_70, Blocks.SPEEDLIMIT_HIGH_75, Blocks.SPEEDLIMIT_HIGH_80, Blocks.SPEEDLIMIT_HIGH_85, Blocks.SPEEDLIMIT_HIGH_90, Blocks.SPEEDLIMIT_HIGH_95, Blocks.SPEEDLIMIT_HIGH_100, Blocks.SPEEDLIMIT_HIGH_105, Blocks.SPEEDLIMIT_HIGH_110, Blocks.SPEEDLIMIT_HIGH_115, Blocks.SPEEDLIMIT_HIGH_120, Blocks.SPEEDLIMIT_HIGH_125, Blocks.SPEEDLIMIT_HIGH_130, Blocks.SPEEDLIMIT_HIGH_135, Blocks.SPEEDLIMIT_HIGH_140, Blocks.SPEEDLIMIT_HIGH_145, Blocks.SPEEDLIMIT_HIGH_150, Blocks.SPEEDLIMIT_HIGH_SPECIAL, Blocks.SPEEDLIMIT_LOW_3, Blocks.SPEEDLIMIT_LOW_5, Blocks.SPEEDLIMIT_LOW_10, Blocks.SPEEDLIMIT_LOW_15, Blocks.SPEEDLIMIT_LOW_20, Blocks.SPEEDLIMIT_LOW_25, Blocks.SPEEDLIMIT_LOW_30, Blocks.SPEEDLIMIT_LOW_35, Blocks.SPEEDLIMIT_LOW_40, Blocks.SPEEDLIMIT_LOW_45, Blocks.SPEEDLIMIT_LOW_50, Blocks.SPEEDLIMIT_LOW_55, Blocks.SPEEDLIMIT_LOW_60, Blocks.SPEEDLIMIT_LOW_65, Blocks.SPEEDLIMIT_LOW_70, Blocks.SPEEDLIMIT_LOW_75, Blocks.SPEEDLIMIT_LOW_80, Blocks.SPEEDLIMIT_LOW_85, Blocks.SPEEDLIMIT_LOW_90, Blocks.SPEEDLIMIT_LOW_95, Blocks.SPEEDLIMIT_LOW_100, Blocks.SPEEDLIMIT_LOW_105, Blocks.SPEEDLIMIT_LOW_110, Blocks.SPEEDLIMIT_LOW_115, Blocks.SPEEDLIMIT_LOW_120, Blocks.SPEEDLIMIT_LOW_125, Blocks.SPEEDLIMIT_LOW_130, Blocks.SPEEDLIMIT_LOW_135, Blocks.SPEEDLIMIT_LOW_140, Blocks.SPEEDLIMIT_LOW_145, Blocks.SPEEDLIMIT_LOW_150, Blocks.SPEEDLIMIT_LOW_SPECIAL};
            int d = 0;
            for (Attachment3 i : new Attachment3[]{Attachment3.NONE, Attachment3.DOWN, Attachment3.UP}) {
                for (DoubleFaceFacing j : new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH, DoubleFaceFacing.SSW, DoubleFaceFacing.SOUTHWEST, DoubleFaceFacing.WSW, DoubleFaceFacing.WEST, DoubleFaceFacing.WNW, DoubleFaceFacing.NORTHWEST, DoubleFaceFacing.NNW, DoubleFaceFacing.NORTH, DoubleFaceFacing.NNE, DoubleFaceFacing.NORTHEAST, DoubleFaceFacing.ENE, DoubleFaceFacing.EAST, DoubleFaceFacing.ESE, DoubleFaceFacing.SOUTHEAST, DoubleFaceFacing.SSE, DoubleFaceFacing.NORTH_SOUTH, DoubleFaceFacing.NNE_SSW, DoubleFaceFacing.NORTHEAST_SOUTHWEST, DoubleFaceFacing.ENE_WSW, DoubleFaceFacing.EAST_WEST, DoubleFaceFacing.ESE_WNW, DoubleFaceFacing.NORTHWEST_SOUTHEAST, DoubleFaceFacing.SSE_NNW, DoubleFaceFacing.WALL_SOUTH, DoubleFaceFacing.WALL_EAST, DoubleFaceFacing.WALL_NORTH, DoubleFaceFacing.WALL_WEST}) {
                    for (Block k : tab) {
                        BlockState st = k.getDefaultState().with(Attachment3.ATTACHMENT, i)
                                         .with(DoubleFaceFacing.FACING, j);
                        BlockNumberIDRegistry.INSTANCE.register(12200, d, st);
                        BlockNumberIDRecognitionRegistry.INSTANCE
                            .register(k.getRegistryEntry().registryKey().getValue(),
                                      new BlockProperties().mergeFromBlockState(st), 12200, d);
                        if (getWaterloggedProperty()) {
                            st = st.with(WATERLOGGED, true);
                            BlockNumberIDRegistry.INSTANCE.register(12200, ~d, st);
                            BlockNumberIDRecognitionRegistry.INSTANCE
                                .register(k.getRegistryEntry().registryKey().getValue(),
                                          new BlockProperties().mergeFromBlockState(st), 12200, ~d);
                        }
                        d++;
                    }
                }
                d += 256;
            }
            tab = LIFT_SPEEDLIMIT_HIGH_BLOCKS;
            d = 0;
            for (Attachment3 i : new Attachment3[]{Attachment3.NONE, Attachment3.DOWN, Attachment3.UP}) {
                for (DoubleFaceFacing j : new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH, DoubleFaceFacing.SSW, DoubleFaceFacing.SOUTHWEST, DoubleFaceFacing.WSW, DoubleFaceFacing.WEST, DoubleFaceFacing.WNW, DoubleFaceFacing.NORTHWEST, DoubleFaceFacing.NNW, DoubleFaceFacing.NORTH, DoubleFaceFacing.NNE, DoubleFaceFacing.NORTHEAST, DoubleFaceFacing.ENE, DoubleFaceFacing.EAST, DoubleFaceFacing.ESE, DoubleFaceFacing.SOUTHEAST, DoubleFaceFacing.SSE, DoubleFaceFacing.NORTH_SOUTH, DoubleFaceFacing.NNE_SSW, DoubleFaceFacing.NORTHEAST_SOUTHWEST, DoubleFaceFacing.ENE_WSW, DoubleFaceFacing.EAST_WEST, DoubleFaceFacing.ESE_WNW, DoubleFaceFacing.NORTHWEST_SOUTHEAST, DoubleFaceFacing.SSE_NNW, DoubleFaceFacing.WALL_SOUTH, DoubleFaceFacing.WALL_EAST, DoubleFaceFacing.WALL_NORTH, DoubleFaceFacing.WALL_WEST}) {
                    for (Block k : tab) {
                        BlockState st = k.getDefaultState().with(Attachment3.ATTACHMENT, i)
                                         .with(DoubleFaceFacing.FACING, j);
                        BlockNumberIDRegistry.INSTANCE.register(12201, d, st);
                        BlockNumberIDRecognitionRegistry.INSTANCE
                            .register(k.getRegistryEntry().registryKey().getValue(),
                                      new BlockProperties().mergeFromBlockState(st), 12201, d);
                        if (getWaterloggedProperty()) {
                            st = st.with(WATERLOGGED, true);
                            BlockNumberIDRegistry.INSTANCE.register(12201, ~d, st);
                            BlockNumberIDRecognitionRegistry.INSTANCE
                                .register(k.getRegistryEntry().registryKey().getValue(),
                                          new BlockProperties().mergeFromBlockState(st), 12201, ~d);
                        }
                        d++;
                    }
                    d += 32;
                }
                d += 256;
            }
            d = 0;
            for (Attachment3 i : new Attachment3[]{Attachment3.NONE, Attachment3.DOWN, Attachment3.UP}) {
                for (DoubleFaceFacing j : new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH, DoubleFaceFacing.SSW, DoubleFaceFacing.SOUTHWEST, DoubleFaceFacing.WSW, DoubleFaceFacing.WEST, DoubleFaceFacing.WNW, DoubleFaceFacing.NORTHWEST, DoubleFaceFacing.NNW, DoubleFaceFacing.NORTH, DoubleFaceFacing.NNE, DoubleFaceFacing.NORTHEAST, DoubleFaceFacing.ENE, DoubleFaceFacing.EAST, DoubleFaceFacing.ESE, DoubleFaceFacing.SOUTHEAST, DoubleFaceFacing.SSE, DoubleFaceFacing.NORTH_SOUTH, DoubleFaceFacing.NNE_SSW, DoubleFaceFacing.NORTHEAST_SOUTHWEST, DoubleFaceFacing.ENE_WSW, DoubleFaceFacing.EAST_WEST, DoubleFaceFacing.ESE_WNW, DoubleFaceFacing.NORTHWEST_SOUTHEAST, DoubleFaceFacing.SSE_NNW, DoubleFaceFacing.WALL_SOUTH, DoubleFaceFacing.WALL_EAST, DoubleFaceFacing.WALL_NORTH, DoubleFaceFacing.WALL_WEST}) {
                    BlockState st = Blocks.CIRCLE_BACKBOARD.getDefaultState()
                                                           .with(Attachment3.ATTACHMENT, i).with(DoubleFaceFacing.FACING, j);
                    BlockNumberIDRegistry.INSTANCE.register(12203, d, st);
                    BlockNumberIDRecognitionRegistry.INSTANCE
                        .register(Blocks.CIRCLE_BACKBOARD.getRegistryEntry().registryKey()
                                                         .getValue(), new BlockProperties().mergeFromBlockState(st), 12203, d);
                    if (getWaterloggedProperty()) {
                        st = st.with(WATERLOGGED, true);
                        BlockNumberIDRegistry.INSTANCE.register(12203, ~d, st);
                        BlockNumberIDRecognitionRegistry.INSTANCE
                            .register(Blocks.CIRCLE_BACKBOARD.getRegistryEntry().registryKey()
                                                             .getValue(), new BlockProperties().mergeFromBlockState(st), 12203, ~d);
                    }
                    d++;
                }
                d += 4;
            }
            tab = HEIGHTLIMIT_BLOCKS;
            d = 0;
            for (Attachment3 i : new Attachment3[]{Attachment3.NONE, Attachment3.DOWN, Attachment3.UP}) {
                for (DoubleFaceFacing j : new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH, DoubleFaceFacing.SSW, DoubleFaceFacing.SOUTHWEST, DoubleFaceFacing.WSW, DoubleFaceFacing.WEST, DoubleFaceFacing.WNW, DoubleFaceFacing.NORTHWEST, DoubleFaceFacing.NNW, DoubleFaceFacing.NORTH, DoubleFaceFacing.NNE, DoubleFaceFacing.NORTHEAST, DoubleFaceFacing.ENE, DoubleFaceFacing.EAST, DoubleFaceFacing.ESE, DoubleFaceFacing.SOUTHEAST, DoubleFaceFacing.SSE, DoubleFaceFacing.NORTH_SOUTH, DoubleFaceFacing.NNE_SSW, DoubleFaceFacing.NORTHEAST_SOUTHWEST, DoubleFaceFacing.ENE_WSW, DoubleFaceFacing.EAST_WEST, DoubleFaceFacing.ESE_WNW, DoubleFaceFacing.NORTHWEST_SOUTHEAST, DoubleFaceFacing.SSE_NNW, DoubleFaceFacing.WALL_SOUTH, DoubleFaceFacing.WALL_EAST, DoubleFaceFacing.WALL_NORTH, DoubleFaceFacing.WALL_WEST}) {
                    for (Block k : tab) {
                        BlockState st = k.getDefaultState().with(Attachment3.ATTACHMENT, i)
                                         .with(DoubleFaceFacing.FACING, j);
                        BlockNumberIDRegistry.INSTANCE.register(12204, d, st);
                        BlockNumberIDRecognitionRegistry.INSTANCE
                            .register(k.getRegistryEntry().registryKey().getValue(),
                                      new BlockProperties().mergeFromBlockState(st), 12204, d);
                        if (getWaterloggedProperty()) {
                            st = st.with(WATERLOGGED, true);
                            BlockNumberIDRegistry.INSTANCE.register(12204, ~d, st);
                            BlockNumberIDRecognitionRegistry.INSTANCE
                                .register(k.getRegistryEntry().registryKey().getValue(),
                                          new BlockProperties().mergeFromBlockState(st), 12204, ~d);
                        }
                        d++;
                    }
                    d += 27;
                }
                d += 512;
            }
            tab = PROHIBITION_BLOCKS;
            d = 0;
            for (Attachment3 i : new Attachment3[]{Attachment3.NONE, Attachment3.DOWN, Attachment3.UP}) {
                for (DoubleFaceFacing j : new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH, DoubleFaceFacing.SSW, DoubleFaceFacing.SOUTHWEST, DoubleFaceFacing.WSW, DoubleFaceFacing.WEST, DoubleFaceFacing.WNW, DoubleFaceFacing.NORTHWEST, DoubleFaceFacing.NNW, DoubleFaceFacing.NORTH, DoubleFaceFacing.NNE, DoubleFaceFacing.NORTHEAST, DoubleFaceFacing.ENE, DoubleFaceFacing.EAST, DoubleFaceFacing.ESE, DoubleFaceFacing.SOUTHEAST, DoubleFaceFacing.SSE, DoubleFaceFacing.NORTH_SOUTH, DoubleFaceFacing.NNE_SSW, DoubleFaceFacing.NORTHEAST_SOUTHWEST, DoubleFaceFacing.ENE_WSW, DoubleFaceFacing.EAST_WEST, DoubleFaceFacing.ESE_WNW, DoubleFaceFacing.NORTHWEST_SOUTHEAST, DoubleFaceFacing.SSE_NNW, DoubleFaceFacing.WALL_SOUTH, DoubleFaceFacing.WALL_EAST, DoubleFaceFacing.WALL_NORTH, DoubleFaceFacing.WALL_WEST}) {
                    for (Block k : tab) {
                        BlockState st = k.getDefaultState().with(Attachment3.ATTACHMENT, i)
                                         .with(DoubleFaceFacing.FACING, j);
                        BlockNumberIDRegistry.INSTANCE.register(12205, d, st);
                        BlockNumberIDRecognitionRegistry.INSTANCE
                            .register(k.getRegistryEntry().registryKey().getValue(),
                                      new BlockProperties().mergeFromBlockState(st), 12205, d);
                        if (getWaterloggedProperty()) {
                            st = st.with(WATERLOGGED, true);
                            BlockNumberIDRegistry.INSTANCE.register(12205, ~d, st);
                            BlockNumberIDRecognitionRegistry.INSTANCE
                                .register(k.getRegistryEntry().registryKey().getValue(),
                                          new BlockProperties().mergeFromBlockState(st), 12205, ~d);
                        }
                        d++;
                    }
                    d += 128 - tab.length;
                }
                d += 512;
            }
            tab = HIGHWAY_HM_BLOCKS;
            d = 0;
            for (Attachment3 i : new Attachment3[]{Attachment3.NONE, Attachment3.DOWN, Attachment3.UP}) {
                for (DoubleFaceFacing j : new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH, DoubleFaceFacing.SSW, DoubleFaceFacing.SOUTHWEST, DoubleFaceFacing.WSW, DoubleFaceFacing.WEST, DoubleFaceFacing.WNW, DoubleFaceFacing.NORTHWEST, DoubleFaceFacing.NNW, DoubleFaceFacing.NORTH, DoubleFaceFacing.NNE, DoubleFaceFacing.NORTHEAST, DoubleFaceFacing.ENE, DoubleFaceFacing.EAST, DoubleFaceFacing.ESE, DoubleFaceFacing.SOUTHEAST, DoubleFaceFacing.SSE, DoubleFaceFacing.NORTH_SOUTH, DoubleFaceFacing.NNE_SSW, DoubleFaceFacing.NORTHEAST_SOUTHWEST, DoubleFaceFacing.ENE_WSW, DoubleFaceFacing.EAST_WEST, DoubleFaceFacing.ESE_WNW, DoubleFaceFacing.NORTHWEST_SOUTHEAST, DoubleFaceFacing.SSE_NNW, DoubleFaceFacing.WALL_SOUTH, DoubleFaceFacing.WALL_EAST, DoubleFaceFacing.WALL_NORTH, DoubleFaceFacing.WALL_WEST}) {
                    for (Block k : tab) {
                        BlockState st = k.getDefaultState().with(Attachment3.ATTACHMENT, i)
                                         .with(DoubleFaceFacing.FACING, j);
                        BlockNumberIDRegistry.INSTANCE.register(12206, d, st);
                        BlockNumberIDRecognitionRegistry.INSTANCE
                            .register(k.getRegistryEntry().registryKey().getValue(),
                                      new BlockProperties().mergeFromBlockState(st), 12206, d);
                        if (getWaterloggedProperty()) {
                            st = st.with(WATERLOGGED, true);
                            BlockNumberIDRegistry.INSTANCE.register(12206, ~d, st);
                            BlockNumberIDRecognitionRegistry.INSTANCE
                                .register(k.getRegistryEntry().registryKey().getValue(),
                                          new BlockProperties().mergeFromBlockState(st), 12206, ~d);
                        }
                        d++;
                    }
                    d += 16 - tab.length;
                }
                d += 64;
            }
            BlockNumberIDRegistry.INSTANCE.register(12207, 0, AIR.getDefaultState());
            BlockNumberIDRegistry.INSTANCE.register(12207, 8192, AIR.getDefaultState());
            if (getWaterloggedProperty()) {
                BlockNumberIDRegistry.INSTANCE.register(12207, -1, WATER.getDefaultState());
                BlockNumberIDRegistry.INSTANCE
                    .register(12207, -8193, WATER.getDefaultState());
            }
            for (d = 1; d < 6561; d++) {
                BlockState st = FloorLineEighthBlock
                    .from3Pow(Blocks.FLOOR_LINE_EIGHTHS.getDefaultState(), d);
                BlockNumberIDRegistry.INSTANCE.register(12207, d, st);
                BlockNumberIDRecognitionRegistry.INSTANCE
                    .register(Blocks.FLOOR_LINE_EIGHTHS.getRegistryEntry().registryKey()
                                                       .getValue(), new BlockProperties().mergeFromBlockState(st), 12207, d);
                if (getWaterloggedProperty()) {
                    st = st.with(WATERLOGGED, true);
                    BlockNumberIDRegistry.INSTANCE.register(12207, ~d, st);
                    BlockNumberIDRecognitionRegistry.INSTANCE
                        .register(Blocks.FLOOR_LINE_EIGHTHS.getRegistryEntry().registryKey()
                                                           .getValue(), new BlockProperties().mergeFromBlockState(st), 12207, ~d);
                }
                st = st.with(net.minecraft.state.property.Properties.HORIZONTAL_AXIS,
                             net.minecraft.util.math.Direction.Axis.Z);
                BlockNumberIDRegistry.INSTANCE.register(12207, ~(d | 8192), st);
                BlockNumberIDRecognitionRegistry.INSTANCE
                    .register(Blocks.FLOOR_LINE_EIGHTHS.getRegistryEntry().registryKey()
                                                       .getValue(), new BlockProperties().mergeFromBlockState(st), 12207, ~(d | 8192));
                if (getWaterloggedProperty()) {
                    st = st.with(WATERLOGGED, false);
                    BlockNumberIDRegistry.INSTANCE.register(12207, d | 8192, st);
                    BlockNumberIDRecognitionRegistry.INSTANCE
                        .register(Blocks.FLOOR_LINE_EIGHTHS.getRegistryEntry().registryKey()
                                                           .getValue(), new BlockProperties().mergeFromBlockState(st), 12207, d | 8192);
                }
            }
            d = 0;
            for (Attachment3 i : new Attachment3[]{Attachment3.NONE, Attachment3.DOWN, Attachment3.UP}) {
                for (DoubleFaceFacing j : new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH, DoubleFaceFacing.SSW, DoubleFaceFacing.SOUTHWEST, DoubleFaceFacing.WSW, DoubleFaceFacing.WEST, DoubleFaceFacing.WNW, DoubleFaceFacing.NORTHWEST, DoubleFaceFacing.NNW, DoubleFaceFacing.NORTH, DoubleFaceFacing.NNE, DoubleFaceFacing.NORTHEAST, DoubleFaceFacing.ENE, DoubleFaceFacing.EAST, DoubleFaceFacing.ESE, DoubleFaceFacing.SOUTHEAST, DoubleFaceFacing.SSE, DoubleFaceFacing.NORTH_SOUTH, DoubleFaceFacing.NNE_SSW, DoubleFaceFacing.NORTHEAST_SOUTHWEST, DoubleFaceFacing.ENE_WSW, DoubleFaceFacing.EAST_WEST, DoubleFaceFacing.ESE_WNW, DoubleFaceFacing.NORTHWEST_SOUTHEAST, DoubleFaceFacing.SSE_NNW, DoubleFaceFacing.WALL_SOUTH, DoubleFaceFacing.WALL_EAST, DoubleFaceFacing.WALL_NORTH, DoubleFaceFacing.WALL_WEST}) {
                    BlockState st = Blocks.HIGHWAY_KM.getDefaultState()
                                                           .with(Attachment3.ATTACHMENT, i).with(DoubleFaceFacing.FACING, j);
                    BlockNumberIDRegistry.INSTANCE.register(12208, d, st);
                    BlockNumberIDRecognitionRegistry.INSTANCE
                        .register(Blocks.HIGHWAY_KM.getRegistryEntry().registryKey()
                                                         .getValue(), new BlockProperties().mergeFromBlockState(st), 12208, d);
                    if (getWaterloggedProperty()) {
                        st = st.with(WATERLOGGED, true);
                        BlockNumberIDRegistry.INSTANCE.register(12208, ~d, st);
                        BlockNumberIDRecognitionRegistry.INSTANCE
                            .register(Blocks.HIGHWAY_KM.getRegistryEntry().registryKey()
                                                             .getValue(), new BlockProperties().mergeFromBlockState(st), 12208, ~d);
                    }
                    d++;
                }
                d += 4;
            }
            tab = DISTANCE_DETECTION_BLOCKS;
            d = 0;
            for (DoubleFaceFacing90 i : new DoubleFaceFacing90[]{DoubleFaceFacing90.SOUTH, DoubleFaceFacing90.WEST, DoubleFaceFacing90.NORTH, DoubleFaceFacing90.EAST, DoubleFaceFacing90.NORTH_SOUTH, DoubleFaceFacing90.EAST_WEST, DoubleFaceFacing90.WALL_NORTH, DoubleFaceFacing90.WALL_EAST, DoubleFaceFacing90.WALL_SOUTH, DoubleFaceFacing90.WALL_WEST}) {
                for (Block j : tab) {
                    BlockState st = j.getDefaultState().with(DoubleFaceFacing90.FACING, i);
                    BlockNumberIDRegistry.INSTANCE.register(12209, d, st);
                    BlockNumberIDRecognitionRegistry.INSTANCE
                        .register(j.getRegistryEntry().registryKey()
                                                         .getValue(), new BlockProperties().mergeFromBlockState(st), 12209, d);
                    if (getWaterloggedProperty()) {
                        st = st.with(WATERLOGGED, true);
                        BlockNumberIDRegistry.INSTANCE.register(12209, ~d, st);
                        BlockNumberIDRecognitionRegistry.INSTANCE
                            .register(j.getRegistryEntry().registryKey()
                                                             .getValue(), new BlockProperties().mergeFromBlockState(st), 12209, ~d);
                    }
                    d++;
                }
            }
            for (d = 0; d < 81; d++) {
                BlockState st = Blocks.BARRICADES_1.getDefaultState().with(SquareQuarterDefaulted3Block.NORTHWEST, d % 3)
                    .with(SquareQuarterDefaulted3Block.NORTHEAST, (d / 3) % 3)
                    .with(SquareQuarterDefaulted3Block.SOUTHWEST, (d / 9) % 3)
                    .with(SquareQuarterDefaulted3Block.SOUTHEAST, d / 27);
                BlockNumberIDRegistry.INSTANCE.register(12210, d, st);
                BlockNumberIDRecognitionRegistry.INSTANCE
                    .register(Blocks.BARRICADES_1.getRegistryEntry().registryKey()
                                                 .getValue(), new BlockProperties().mergeFromBlockState(st), 12210, d);
                if (getWaterloggedProperty()) {
                    st = st.with(WATERLOGGED, true);
                    BlockNumberIDRegistry.INSTANCE.register(12210, ~d, st);
                    BlockNumberIDRecognitionRegistry.INSTANCE
                        .register(Blocks.BARRICADES_1.getRegistryEntry().registryKey()
                                                     .getValue(), new BlockProperties().mergeFromBlockState(st), 12210, ~d);
                }
            }
            Item[] tab2 = {Items.SPEEDLIMIT_HIGH_3, Items.SPEEDLIMIT_HIGH_5, Items.SPEEDLIMIT_HIGH_10, Items.SPEEDLIMIT_HIGH_15, Items.SPEEDLIMIT_HIGH_20, Items.SPEEDLIMIT_HIGH_25, Items.SPEEDLIMIT_HIGH_30, Items.SPEEDLIMIT_HIGH_35, Items.SPEEDLIMIT_HIGH_40, Items.SPEEDLIMIT_HIGH_45, Items.SPEEDLIMIT_HIGH_50, Items.SPEEDLIMIT_HIGH_55, Items.SPEEDLIMIT_HIGH_60, Items.SPEEDLIMIT_HIGH_65, Items.SPEEDLIMIT_HIGH_70, Items.SPEEDLIMIT_HIGH_75, Items.SPEEDLIMIT_HIGH_80, Items.SPEEDLIMIT_HIGH_85, Items.SPEEDLIMIT_HIGH_90, Items.SPEEDLIMIT_HIGH_95, Items.SPEEDLIMIT_HIGH_100, Items.SPEEDLIMIT_HIGH_105, Items.SPEEDLIMIT_HIGH_110, Items.SPEEDLIMIT_HIGH_115, Items.SPEEDLIMIT_HIGH_120, Items.SPEEDLIMIT_HIGH_125, Items.SPEEDLIMIT_HIGH_130, Items.SPEEDLIMIT_HIGH_135, Items.SPEEDLIMIT_HIGH_140, Items.SPEEDLIMIT_HIGH_145, Items.SPEEDLIMIT_HIGH_150, Items.SPEEDLIMIT_HIGH_SPECIAL, Items.SPEEDLIMIT_LOW_3, Items.SPEEDLIMIT_LOW_5, Items.SPEEDLIMIT_LOW_10, Items.SPEEDLIMIT_LOW_15, Items.SPEEDLIMIT_LOW_20, Items.SPEEDLIMIT_LOW_25, Items.SPEEDLIMIT_LOW_30, Items.SPEEDLIMIT_LOW_35, Items.SPEEDLIMIT_LOW_40, Items.SPEEDLIMIT_LOW_45, Items.SPEEDLIMIT_LOW_50, Items.SPEEDLIMIT_LOW_55, Items.SPEEDLIMIT_LOW_60, Items.SPEEDLIMIT_LOW_65, Items.SPEEDLIMIT_LOW_70, Items.SPEEDLIMIT_LOW_75, Items.SPEEDLIMIT_LOW_80, Items.SPEEDLIMIT_LOW_85, Items.SPEEDLIMIT_LOW_90, Items.SPEEDLIMIT_LOW_95, Items.SPEEDLIMIT_LOW_100, Items.SPEEDLIMIT_LOW_105, Items.SPEEDLIMIT_LOW_110, Items.SPEEDLIMIT_LOW_115, Items.SPEEDLIMIT_LOW_120, Items.SPEEDLIMIT_LOW_125, Items.SPEEDLIMIT_LOW_130, Items.SPEEDLIMIT_LOW_135, Items.SPEEDLIMIT_LOW_140, Items.SPEEDLIMIT_LOW_145, Items.SPEEDLIMIT_LOW_150, Items.SPEEDLIMIT_LOW_SPECIAL};
            d = 0;
            for (Item i : tab2) {
                ItemNumberIDRegistry.INSTANCE.register(12200, d, i);
                d++;
            }
            tab2 = LIFT_SPEEDLIMIT_HIGH_ITEMS;
            d = 0;
            for (Item i : tab2) {
                ItemNumberIDRegistry.INSTANCE.register(12201, d, i);
                d++;
            }
            ItemNumberIDRegistry.INSTANCE.register(12202, 0, Items.IRON_PLATE);
            ItemNumberIDRegistry.INSTANCE.register(12203, 0, Items.CIRCLE_BACKBOARD);
            tab2 = HEIGHTLIMIT_ITEMS;
            d = 0;
            for (Item i : tab2) {
                ItemNumberIDRegistry.INSTANCE.register(12204, d, i);
                d++;
            }
            tab2 = PROHIBITION_ITEMS;
            d = 0;
            for (Item i : tab2) {
                ItemNumberIDRegistry.INSTANCE.register(12205, d, i);
                d++;
            }
            tab2 = HIGHWAY_HM_ITEMS;
            d = 0;
            for (Item i : tab2) {
                ItemNumberIDRegistry.INSTANCE.register(12206, d, i);
                d++;
            }
            ItemNumberIDRegistry.INSTANCE
                .register(12207, 1, Items.WHITE_FLOOR_LINE_EIGHTH);
            ItemNumberIDRegistry.INSTANCE
                .register(12207, 2, Items.YELLOW_FLOOR_LINE_EIGHTH);
            ItemNumberIDRegistry.INSTANCE.register(12208, 0, Items.HIGHWAY_KM);
            tab2 = DISTANCE_DETECTION_ITEMS;
            d = 0;
            for (Item i : tab2) {
                ItemNumberIDRegistry.INSTANCE.register(12209, d, i);
                d++;
            }
            ItemNumberIDRegistry.INSTANCE
                .register(12210, 0, Items.BARRICADE_1M_EDGE_1M_HEIGHT);
            ItemNumberIDRegistry.INSTANCE
                .register(12210, 1, Items.BARRICADE_50CM_EDGE_75CM_HEIGHT);
            ItemNumberIDRegistry.INSTANCE
                .register(12210, 2, Items.BARRICADE_50CM_EDGE_1M_HEIGHT);
        } catch (NoClassDefFoundError ignored) {}*/
    }
}
