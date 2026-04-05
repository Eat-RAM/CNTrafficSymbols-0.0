package rege.pegui.cntrafficsymbols;

import java.util.List;

import io.github.eat_ram.cntrafficsymbols.core.block.CircleStandingSymbolBlock;
import io.github.eat_ram.cntrafficsymbols.core.block.DoubleFaceFacingBlock;
import io.github.eat_ram.cntrafficsymbols.core.block
       .SquareQuarterDefaulted3Block;
import io.github.eat_ram.cntrafficsymbols.core.block.WideBoardBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.item.AliasedBlockItem;
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
        public static final Block SPEEDLIMIT_HIGH_3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_10 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_10 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_15 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_15 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_20 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_20 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_25 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_25 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_30 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_30 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_35 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_35 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_40 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_40 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_45 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_45 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_50 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_50 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_55 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_55 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_60 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_60 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_65 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_65 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_70 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_70 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_75 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_75 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_80 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_80 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_85 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_85 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_90 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_90 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_95 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_95 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_100 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_100 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_105 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_105 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_110 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_110 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_115 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_115 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_120 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_120 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_125 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_125 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_130 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_130 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_135 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_135 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_140 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_140 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_145 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_145 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_150 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_150 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_HIGH_SPECIAL =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block SPEEDLIMIT_LOW_SPECIAL =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_10 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_15 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_20 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_25 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_30 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_35 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_40 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_45 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_50 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_55 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_60 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_65 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_70 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_75 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_80 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_85 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_90 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_95 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_100 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_105 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_110 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_115 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_120 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_125 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_130 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_135 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_140 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_145 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_150 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block LIFT_SPEEDLIMIT_HIGH_SPECIAL =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block CIRCLE_BACKBOARD =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_SPECIAL =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_0D1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_0D2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_0D3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_0D4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_0D5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_0D6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_0D7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_0D8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_0D9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_1D1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_1D2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_1D3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_1D4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_1D5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_1D6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_1D7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_1D8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_1D9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_2D1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_2D2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_2D3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_2D4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_2D5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_2D6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_2D7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_2D8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_2D9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_3D1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_3D2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_3D3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_3D4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_3D5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_3D6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_3D7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_3D8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_3D9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_4D1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_4D2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_4D3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_4D4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_4D5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_4D6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_4D7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_4D8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_4D9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_5D1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_5D2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_5D3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_5D4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_5D5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_5D6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_5D7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_5D8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_5D9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_6D1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_6D2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_6D3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_6D4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_6D5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_6D6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_6D7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_6D8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_6D9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_7D1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_7D2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_7D3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_7D4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_7D5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_7D6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_7D7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_7D8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_7D9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_8D1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_8D2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_8D3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_8D4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_8D5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_8D6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_8D7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_8D8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_8D9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_9D1 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_9D2 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_9D3 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_9D4 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_9D5 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_9D6 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_9D7 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_9D8 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_9D9 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HEIGHTLIMIT_10 =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block PROHIBITION =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block NO_U_TURN =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block NO_LEFT_TURN =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block NO_RIGHT_TURN =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block NO_PARKING =
            new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
                                                        .strength(9f, 36f));
        public static final Block HIGHWAY_1HM =
            new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f, 4f)
                                                 .mapColor(st -> ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue())
                                                                  ? MapColor.CYAN : MapColor.GREEN)));
        public static final Block HIGHWAY_2HM =
            new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f, 4f)
                                                 .mapColor(st -> ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue())
                                                                  ? MapColor.CYAN : MapColor.GREEN)));
        public static final Block HIGHWAY_3HM =
            new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f, 4f)
                                                 .mapColor(st -> ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue())
                                                                  ? MapColor.CYAN : MapColor.GREEN)));
        public static final Block HIGHWAY_4HM =
            new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f, 4f)
                                                 .mapColor(st -> ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue())
                                                                  ? MapColor.CYAN : MapColor.GREEN)));
        public static final Block HIGHWAY_5HM =
            new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f, 4f)
                                                 .mapColor(st -> ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue())
                                                                  ? MapColor.CYAN : MapColor.GREEN)));
        public static final Block HIGHWAY_6HM =
            new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f, 4f)
                                                 .mapColor(st -> ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue())
                                                                  ? MapColor.CYAN : MapColor.GREEN)));
        public static final Block HIGHWAY_7HM =
            new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f, 4f)
                                                 .mapColor(st -> ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue())
                                                                  ? MapColor.CYAN : MapColor.GREEN)));
        public static final Block HIGHWAY_8HM =
            new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f, 4f)
                                                 .mapColor(st -> ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue())
                                                                  ? MapColor.CYAN : MapColor.GREEN)));
        public static final Block HIGHWAY_9HM =
            new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f, 4f)
                                                 .mapColor(st -> ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue())
                                                                  ? MapColor.CYAN : MapColor.GREEN)));
        public static final FloorLineEighthBlock FLOOR_LINE_EIGHTHS =
            new FloorLineEighthBlock(Block.Settings.create().strength(4f, 4f));
        public static final Block HIGHWAY_KM =
            new rege.pegui.cntrafficsymbols.block.HighwayKmSignBlock(Block.Settings
                                                                         .create().nonOpaque().strength(7f, 28f).mapColor(st ->
                                                                                                                              ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue()) ? MapColor.CYAN
                                                                                                                                                                                                : MapColor.GREEN)));
        public static final WideBoardBlock DISTANCE_DETECTION_0M_LEFT =
            new WideBoardBlock(Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock DISTANCE_DETECTION_0M_RIGHT =
            new WideBoardBlock(DISTANCE_DETECTION_0M_LEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock DISTANCE_DETECTION_50M_LEFT =
            new WideBoardBlock(Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock DISTANCE_DETECTION_50M_RIGHT =
            new WideBoardBlock(DISTANCE_DETECTION_50M_LEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock DISTANCE_DETECTION_100M_LEFT =
            new WideBoardBlock(Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock DISTANCE_DETECTION_100M_RIGHT =
            new WideBoardBlock(DISTANCE_DETECTION_100M_LEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock DISTANCE_DETECTION_200M_LEFT =
            new WideBoardBlock(Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock DISTANCE_DETECTION_200M_RIGHT =
            new WideBoardBlock(DISTANCE_DETECTION_200M_LEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE =
            new HighwayExitDistanceInfoLeftBlock(Block.Settings.create()
                                                               .strength(21f, 84f));
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE =
            new HighwayExitDistanceInfoMiddleBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE,
                Block.Settings.create().strength(21f, 84f)
            );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE =
            new HighwayExitDistanceInfoRightBlock(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE,
                                                  Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP =
            new HighwayExitDistanceInfoLeftBlock(Block.Settings.create()
                                                               .strength(21f, 84f));
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP =
            new HighwayExitDistanceInfoMiddleBlock(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP,
                                                   Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP =
            new HighwayExitDistanceInfoRightBlock(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP,
                                                  Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE =
            new HighwayExitDistanceInfoLeftBlock(Block.Settings.create()
                                                               .strength(21f, 84f));
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE =
            new HighwayExitDistanceInfoMiddleBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE,
                Block.Settings.create().strength(21f, 84f)
            );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE =
            new HighwayExitDistanceInfoRightBlock(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE,
                                                  Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM =
            new HighwayExitDistanceInfoLeftBlock(Block.Settings.create()
                                                               .strength(21f, 84f));
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM =
            new HighwayExitDistanceInfoMiddleBlock(
                HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM,
                Block.Settings.create().strength(21f, 84f)
            );
        public static final WideBoardBlock HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM =
            new HighwayExitDistanceInfoRightBlock(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM,
                                                  Block.Settings.create().strength(21f, 84f));
        public static final SquareQuarterDefaulted3Block BARRICADES_1 =
            new SquareQuarterDefaulted3Block(Block.Settings.create().strength(9f, 10.5f)
                                                           .mapColor(st -> ((getWaterloggedProperty() && st.get(WATERLOGGED).booleanValue())
                                                                            ? MapColor.PURPLE : MapColor.ORANGE))) {
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
            };
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_UPPERLEFT =
            new WideBoardBlock(Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_UPPER =
            new WideBoardBlock(KEEP_SPACE_VARIANT1_UPPERLEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_UPPERRIGHT =
            new WideBoardBlock(KEEP_SPACE_VARIANT1_UPPERLEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_LEFT =
            new WideBoardBlock(Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_CENTER =
            new WideBoardBlock(KEEP_SPACE_VARIANT1_LEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_RIGHT =
            new WideBoardBlock(KEEP_SPACE_VARIANT1_LEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_LOWERLEFT =
            new WideBoardBlock(Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_LOWER =
            new WideBoardBlock(KEEP_SPACE_VARIANT1_LOWERLEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT1_LOWERRIGHT =
            new WideBoardBlock(KEEP_SPACE_VARIANT1_LOWERLEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_UPPERLEFT =
            new WideBoardBlock(Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_UPPER =
            new WideBoardBlock(KEEP_SPACE_VARIANT2_UPPERLEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_UPPERRIGHT =
            new WideBoardBlock(KEEP_SPACE_VARIANT2_UPPERLEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_LEFT =
            new WideBoardBlock(Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_CENTER =
            new WideBoardBlock(KEEP_SPACE_VARIANT2_LEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_RIGHT =
            new WideBoardBlock(KEEP_SPACE_VARIANT2_LEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_LOWERLEFT =
            new WideBoardBlock(Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_LOWER =
            new WideBoardBlock(KEEP_SPACE_VARIANT2_LOWERLEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final WideBoardBlock KEEP_SPACE_VARIANT2_LOWERRIGHT =
            new WideBoardBlock(KEEP_SPACE_VARIANT2_LOWERLEFT,
                               Block.Settings.create().strength(21f, 84f));
        public static final Block WHITE_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block ORANGE_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block MAGENTA_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block LIGHT_BLUE_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block YELLOW_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block LIME_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block PINK_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block GRAY_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block LIGHT_GRAY_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block CYAN_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block PURPLE_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block BLUE_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block BROWN_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block GREEN_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block RED_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block BLACK_HALF1_CYLINDRICAL_ROD =
            new Half1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block WHITE_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block ORANGE_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block MAGENTA_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block LIGHT_BLUE_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block YELLOW_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block LIME_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block PINK_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block GRAY_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block LIGHT_GRAY_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block CYAN_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block PURPLE_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block BLUE_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block BROWN_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block GREEN_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block RED_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block BLACK_FULL1_CYLINDRICAL_ROD =
            new Full1CylindricalRodBlock(Block.Settings.create().strength(5f, 20f));
        public static final Block WHITE_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                 .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block ORANGE_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                  .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block MAGENTA_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                   .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block LIGHT_BLUE_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                      .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block YELLOW_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                  .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block LIME_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block PINK_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block GRAY_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block LIGHT_GRAY_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                      .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block CYAN_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block PURPLE_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                  .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block BLUE_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block BROWN_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                 .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block GREEN_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                 .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block RED_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                               .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block BLACK_ROD_WITH_LAMP = new RodWithLampBlock(Block
                                                                                 .Settings.create().strength(5f, 20f).luminance(RodWithLampBlock.LUMINANCE));
        public static final Block FULL_SQUARE_BACKBOARD =
            new DoubleFaceFacingBlock(Block.Settings.create().strength(21f, 84f)) {
                public static final VoxelShape SHAPE_DEFAULT =
                    cuboid(.3125, 0, .3125, .6875, 1, .6875);

                @Override
                public VoxelShape getOutlineShape(BlockState st, net.minecraft
                    .world.BlockView v, BlockPos p, net.minecraft.block.ShapeContext c) {
                    switch (st.get(DoubleFaceFacing.FACING).id) {
                        case 0:
                            return WideBoardBlock.SHAPE0;
                        case 4:
                            return WideBoardBlock.SHAPE1;
                        case 8:
                            return WideBoardBlock.SHAPE2;
                        case 12:
                            return WideBoardBlock.SHAPE3;
                        case 16:
                            return WideBoardBlock.SHAPE4;
                        case 20:
                            return WideBoardBlock.SHAPE5;
                        case 24:
                            return WideBoardBlock.SHAPE6;
                        case 25:
                            return WideBoardBlock.SHAPE7;
                        case 26:
                            return WideBoardBlock.SHAPE8;
                        case 27:
                            return WideBoardBlock.SHAPE9;
                        default:
                            return SHAPE_DEFAULT;
                    }
                }
            };
        public static final Block WHITE_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                         Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_DOTTED4_TP = new DottedTPBlock((byte) 4,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                         Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_DOTTED5_TP = new DottedTPBlock((byte) 5,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                         Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_DOTTED6_TP = new DottedTPBlock((byte) 6,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                         Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_DOTTED7_TP = new DottedTPBlock((byte) 7,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                         Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_DOTTED8_TP = new DottedTPBlock((byte) 8,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                         Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                            Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_DOTTED9_TP = new DottedTPBlock((byte) 9,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                         Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                             Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                         Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                             Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                         Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_DOTTED10_TP = new DottedTPBlock((byte) 10,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                   Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_LINED4_TP = new LinedTPBlock((byte) 4,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                   Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_LINED5_TP = new LinedTPBlock((byte) 5,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                   Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_LINED6_TP = new LinedTPBlock((byte) 6,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                   Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_LINED7_TP = new LinedTPBlock((byte) 7,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                   Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_LINED8_TP = new LinedTPBlock((byte) 8,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                          Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                   Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_LINED9_TP = new LinedTPBlock((byte) 9,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block WHITE_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block ORANGE_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block MAGENTA_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                        Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_BLUE_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                           Block.Settings.create().strength(.9f).requiresTool());
        public static final Block YELLOW_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIME_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PINK_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GRAY_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block LIGHT_GRAY_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                           Block.Settings.create().strength(.9f).requiresTool());
        public static final Block CYAN_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block PURPLE_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                       Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLUE_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                     Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BROWN_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block GREEN_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
        public static final Block RED_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                    Block.Settings.create().strength(.9f).requiresTool());
        public static final Block BLACK_LINED10_TP = new LinedTPBlock((byte) 10,
                                                                      Block.Settings.create().strength(.9f).requiresTool());
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
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_3, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_3 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_3, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_5 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_5, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_5 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_5, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_10 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_10, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_10 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_10, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_15 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_15, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_15 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_15, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_20 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_20, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_20 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_20, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_25 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_25, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_25 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_25, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_30 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_30, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_30 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_30, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_35 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_35, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_35 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_35, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_40 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_40, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_40 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_40, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_45 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_45, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_45 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_45, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_50 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_50, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_50 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_50, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_55 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_55, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_55 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_55, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_60 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_60, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_60 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_60, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_65 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_65, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_65 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_65, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_70 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_70, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_70 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_70, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_75 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_75, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_75 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_75, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_80 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_80, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_80 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_80, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_85 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_85, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_85 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_85, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_90 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_90, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_90 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_90, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_95 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_95, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_95 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_95, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_100 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_100, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_100 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_100, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_105 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_105, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_105 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_105, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_110 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_110, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_110 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_110, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_115 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_115, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_115 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_115, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_120 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_120, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_120 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_120, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_125 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_125, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_125 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_125, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_130 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_130, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_130 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_130, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_135 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_135, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_135 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_135, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_140 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_140, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_140 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_140, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_145 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_145, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_145 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_145, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_150 =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_150, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_150 =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_150, new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_HIGH_SPECIAL =
            new BlockItem(Blocks.SPEEDLIMIT_HIGH_SPECIAL,
                          new Item.Settings().maxCount(64));
        public static final Item SPEEDLIMIT_LOW_SPECIAL =
            new BlockItem(Blocks.SPEEDLIMIT_LOW_SPECIAL,
                          new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_3 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_3, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_5 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_5, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_10 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_10, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_15 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_15, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_20 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_20, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_25 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_25, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_30 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_30, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_35 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_35, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_40 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_40, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_45 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_45, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_50 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_50, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_55 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_55, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_60 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_60, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_65 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_65, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_70 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_70, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_75 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_75, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_80 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_80, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_85 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_85, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_90 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_90, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_95 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_95, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_100 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_100, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_105 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_105, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_110 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_110, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_115 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_115, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_120 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_120, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_125 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_125, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_130 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_130, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_135 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_135, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_140 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_140, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_145 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_145, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_150 =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_150, new Item.Settings().maxCount(64));
        public static final Item LIFT_SPEEDLIMIT_HIGH_SPECIAL =
            new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL,
                          new Item.Settings().maxCount(64));
        public static final Item IRON_PLATE = new Item(new Item.Settings().maxCount(64));
        public static final Item CIRCLE_BACKBOARD =
            new BlockItem(Blocks.CIRCLE_BACKBOARD, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_SPECIAL =
            new BlockItem(Blocks.HEIGHTLIMIT_SPECIAL, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D1 =
            new BlockItem(Blocks.HEIGHTLIMIT_0D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D2 =
            new BlockItem(Blocks.HEIGHTLIMIT_0D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D3 =
            new BlockItem(Blocks.HEIGHTLIMIT_0D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D4 =
            new BlockItem(Blocks.HEIGHTLIMIT_0D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D5 =
            new BlockItem(Blocks.HEIGHTLIMIT_0D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D6 =
            new BlockItem(Blocks.HEIGHTLIMIT_0D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D7 =
            new BlockItem(Blocks.HEIGHTLIMIT_0D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D8 =
            new BlockItem(Blocks.HEIGHTLIMIT_0D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_0D9 =
            new BlockItem(Blocks.HEIGHTLIMIT_0D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1 =
            new BlockItem(Blocks.HEIGHTLIMIT_1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D1 =
            new BlockItem(Blocks.HEIGHTLIMIT_1D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D2 =
            new BlockItem(Blocks.HEIGHTLIMIT_1D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D3 =
            new BlockItem(Blocks.HEIGHTLIMIT_1D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D4 =
            new BlockItem(Blocks.HEIGHTLIMIT_1D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D5 =
            new BlockItem(Blocks.HEIGHTLIMIT_1D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D6 =
            new BlockItem(Blocks.HEIGHTLIMIT_1D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D7 =
            new BlockItem(Blocks.HEIGHTLIMIT_1D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D8 =
            new BlockItem(Blocks.HEIGHTLIMIT_1D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_1D9 =
            new BlockItem(Blocks.HEIGHTLIMIT_1D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2 =
            new BlockItem(Blocks.HEIGHTLIMIT_2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D1 =
            new BlockItem(Blocks.HEIGHTLIMIT_2D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D2 =
            new BlockItem(Blocks.HEIGHTLIMIT_2D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D3 =
            new BlockItem(Blocks.HEIGHTLIMIT_2D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D4 =
            new BlockItem(Blocks.HEIGHTLIMIT_2D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D5 =
            new BlockItem(Blocks.HEIGHTLIMIT_2D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D6 =
            new BlockItem(Blocks.HEIGHTLIMIT_2D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D7 =
            new BlockItem(Blocks.HEIGHTLIMIT_2D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D8 =
            new BlockItem(Blocks.HEIGHTLIMIT_2D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_2D9 =
            new BlockItem(Blocks.HEIGHTLIMIT_2D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3 =
            new BlockItem(Blocks.HEIGHTLIMIT_3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D1 =
            new BlockItem(Blocks.HEIGHTLIMIT_3D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D2 =
            new BlockItem(Blocks.HEIGHTLIMIT_3D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D3 =
            new BlockItem(Blocks.HEIGHTLIMIT_3D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D4 =
            new BlockItem(Blocks.HEIGHTLIMIT_3D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D5 =
            new BlockItem(Blocks.HEIGHTLIMIT_3D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D6 =
            new BlockItem(Blocks.HEIGHTLIMIT_3D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D7 =
            new BlockItem(Blocks.HEIGHTLIMIT_3D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D8 =
            new BlockItem(Blocks.HEIGHTLIMIT_3D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_3D9 =
            new BlockItem(Blocks.HEIGHTLIMIT_3D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4 =
            new BlockItem(Blocks.HEIGHTLIMIT_4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D1 =
            new BlockItem(Blocks.HEIGHTLIMIT_4D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D2 =
            new BlockItem(Blocks.HEIGHTLIMIT_4D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D3 =
            new BlockItem(Blocks.HEIGHTLIMIT_4D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D4 =
            new BlockItem(Blocks.HEIGHTLIMIT_4D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D5 =
            new BlockItem(Blocks.HEIGHTLIMIT_4D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D6 =
            new BlockItem(Blocks.HEIGHTLIMIT_4D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D7 =
            new BlockItem(Blocks.HEIGHTLIMIT_4D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D8 =
            new BlockItem(Blocks.HEIGHTLIMIT_4D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_4D9 =
            new BlockItem(Blocks.HEIGHTLIMIT_4D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5 =
            new BlockItem(Blocks.HEIGHTLIMIT_5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D1 =
            new BlockItem(Blocks.HEIGHTLIMIT_5D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D2 =
            new BlockItem(Blocks.HEIGHTLIMIT_5D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D3 =
            new BlockItem(Blocks.HEIGHTLIMIT_5D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D4 =
            new BlockItem(Blocks.HEIGHTLIMIT_5D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D5 =
            new BlockItem(Blocks.HEIGHTLIMIT_5D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D6 =
            new BlockItem(Blocks.HEIGHTLIMIT_5D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D7 =
            new BlockItem(Blocks.HEIGHTLIMIT_5D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D8 =
            new BlockItem(Blocks.HEIGHTLIMIT_5D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_5D9 =
            new BlockItem(Blocks.HEIGHTLIMIT_5D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6 =
            new BlockItem(Blocks.HEIGHTLIMIT_6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D1 =
            new BlockItem(Blocks.HEIGHTLIMIT_6D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D2 =
            new BlockItem(Blocks.HEIGHTLIMIT_6D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D3 =
            new BlockItem(Blocks.HEIGHTLIMIT_6D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D4 =
            new BlockItem(Blocks.HEIGHTLIMIT_6D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D5 =
            new BlockItem(Blocks.HEIGHTLIMIT_6D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D6 =
            new BlockItem(Blocks.HEIGHTLIMIT_6D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D7 =
            new BlockItem(Blocks.HEIGHTLIMIT_6D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D8 =
            new BlockItem(Blocks.HEIGHTLIMIT_6D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_6D9 =
            new BlockItem(Blocks.HEIGHTLIMIT_6D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7 =
            new BlockItem(Blocks.HEIGHTLIMIT_7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D1 =
            new BlockItem(Blocks.HEIGHTLIMIT_7D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D2 =
            new BlockItem(Blocks.HEIGHTLIMIT_7D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D3 =
            new BlockItem(Blocks.HEIGHTLIMIT_7D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D4 =
            new BlockItem(Blocks.HEIGHTLIMIT_7D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D5 =
            new BlockItem(Blocks.HEIGHTLIMIT_7D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D6 =
            new BlockItem(Blocks.HEIGHTLIMIT_7D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D7 =
            new BlockItem(Blocks.HEIGHTLIMIT_7D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D8 =
            new BlockItem(Blocks.HEIGHTLIMIT_7D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_7D9 =
            new BlockItem(Blocks.HEIGHTLIMIT_7D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8 =
            new BlockItem(Blocks.HEIGHTLIMIT_8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D1 =
            new BlockItem(Blocks.HEIGHTLIMIT_8D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D2 =
            new BlockItem(Blocks.HEIGHTLIMIT_8D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D3 =
            new BlockItem(Blocks.HEIGHTLIMIT_8D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D4 =
            new BlockItem(Blocks.HEIGHTLIMIT_8D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D5 =
            new BlockItem(Blocks.HEIGHTLIMIT_8D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D6 =
            new BlockItem(Blocks.HEIGHTLIMIT_8D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D7 =
            new BlockItem(Blocks.HEIGHTLIMIT_8D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D8 =
            new BlockItem(Blocks.HEIGHTLIMIT_8D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_8D9 =
            new BlockItem(Blocks.HEIGHTLIMIT_8D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9 =
            new BlockItem(Blocks.HEIGHTLIMIT_9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D1 =
            new BlockItem(Blocks.HEIGHTLIMIT_9D1, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D2 =
            new BlockItem(Blocks.HEIGHTLIMIT_9D2, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D3 =
            new BlockItem(Blocks.HEIGHTLIMIT_9D3, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D4 =
            new BlockItem(Blocks.HEIGHTLIMIT_9D4, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D5 =
            new BlockItem(Blocks.HEIGHTLIMIT_9D5, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D6 =
            new BlockItem(Blocks.HEIGHTLIMIT_9D6, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D7 =
            new BlockItem(Blocks.HEIGHTLIMIT_9D7, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D8 =
            new BlockItem(Blocks.HEIGHTLIMIT_9D8, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_9D9 =
            new BlockItem(Blocks.HEIGHTLIMIT_9D9, new Item.Settings().maxCount(64));
        public static final Item HEIGHTLIMIT_10 =
            new BlockItem(Blocks.HEIGHTLIMIT_10, new Item.Settings().maxCount(64));
        public static final Item PROHIBITION =
            new BlockItem(Blocks.PROHIBITION, new Item.Settings().maxCount(64));
        public static final Item NO_U_TURN =
            new BlockItem(Blocks.NO_U_TURN, new Item.Settings().maxCount(64));
        public static final Item NO_LEFT_TURN =
            new BlockItem(Blocks.NO_LEFT_TURN, new Item.Settings().maxCount(64));
        public static final Item NO_RIGHT_TURN =
            new BlockItem(Blocks.NO_RIGHT_TURN, new Item.Settings().maxCount(64));
        public static final Item NO_PARKING =
            new BlockItem(Blocks.NO_PARKING, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_1HM =
            new BlockItem(Blocks.HIGHWAY_1HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_2HM =
            new BlockItem(Blocks.HIGHWAY_2HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_3HM =
            new BlockItem(Blocks.HIGHWAY_3HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_4HM =
            new BlockItem(Blocks.HIGHWAY_4HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_5HM =
            new BlockItem(Blocks.HIGHWAY_5HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_6HM =
            new BlockItem(Blocks.HIGHWAY_6HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_7HM =
            new BlockItem(Blocks.HIGHWAY_7HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_8HM =
            new BlockItem(Blocks.HIGHWAY_8HM, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_9HM =
            new BlockItem(Blocks.HIGHWAY_9HM, new Item.Settings().maxCount(64));
        public static final Item WHITE_FLOOR_LINE_EIGHTH =
            new AliasedBlockItem(Blocks.FLOOR_LINE_EIGHTHS,
                                 new Item.Settings().maxCount(64)) {
                @Override
                public Block getBlock() {
                    return Blocks.FLOOR_LINE_EIGHTHS;
                }
            };
        public static final Item YELLOW_FLOOR_LINE_EIGHTH =
            new AliasedBlockItem(Blocks.FLOOR_LINE_EIGHTHS,
                                 new Item.Settings().maxCount(64)) {
                @Override
                public Block getBlock() {
                    return Blocks.FLOOR_LINE_EIGHTHS;
                }
            };
        public static final Item HIGHWAY_KM =
            new BlockItem(Blocks.HIGHWAY_KM, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_0M_LEFT = new BlockItem(Blocks
                                                                                .DISTANCE_DETECTION_0M_LEFT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_0M_RIGHT = new BlockItem(Blocks
                                                                                 .DISTANCE_DETECTION_0M_RIGHT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_50M_LEFT = new BlockItem(Blocks
                                                                                 .DISTANCE_DETECTION_50M_LEFT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_50M_RIGHT = new BlockItem(Blocks
                                                                                  .DISTANCE_DETECTION_50M_RIGHT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_100M_LEFT = new BlockItem(Blocks
                                                                                  .DISTANCE_DETECTION_100M_LEFT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_100M_RIGHT = new BlockItem(Blocks
                                                                                   .DISTANCE_DETECTION_100M_RIGHT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_200M_LEFT = new BlockItem(Blocks
                                                                                  .DISTANCE_DETECTION_200M_LEFT, new Item.Settings().maxCount(64));
        public static final Item DISTANCE_DETECTION_200M_RIGHT = new BlockItem(Blocks
                                                                                   .DISTANCE_DETECTION_200M_RIGHT, new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM,
                          new Item.Settings().maxCount(64));
        public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM =
            new BlockItem(Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM,
                          new Item.Settings().maxCount(64));
        public static final Item BARRICADE_50CM_EDGE_75CM_HEIGHT =
            new AliasedBlockItem(Blocks.BARRICADES_1,
                                 new Item.Settings().maxCount(64)) {
                @Override
                public Block getBlock() {
                    return Blocks.BARRICADES_1;
                }
            };
        public static final Item BARRICADE_50CM_EDGE_1M_HEIGHT =
            new AliasedBlockItem(Blocks.BARRICADES_1,
                                 new Item.Settings().maxCount(64)) {
                @Override
                public Block getBlock() {
                    return Blocks.BARRICADES_1;
                }
            };
        public static final Item BARRICADE_1M_EDGE_1M_HEIGHT =
            new AliasedBlockItem(Blocks.BARRICADES_1,
                                 new Item.Settings().maxCount(64)) {
                @Override
                public Block getBlock() {
                    return Blocks.BARRICADES_1;
                }
            };
        public static final Item KEEP_SPACE_VARIANT1_UPPERLEFT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT1_UPPERLEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_UPPER =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT1_UPPER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_UPPERRIGHT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT1_UPPERRIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_LEFT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT1_LEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_CENTER =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT1_CENTER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_RIGHT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT1_RIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_LOWERLEFT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT1_LOWERLEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_LOWER =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT1_LOWER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT1_LOWERRIGHT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT1_LOWERRIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_UPPERLEFT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT2_UPPERLEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_UPPER =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT2_UPPER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_UPPERRIGHT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT2_UPPERRIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_LEFT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT2_LEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_CENTER =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT2_CENTER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_RIGHT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT2_RIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_LOWERLEFT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT2_LOWERLEFT,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_LOWER =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT2_LOWER,
                          new Item.Settings().maxCount(64));
        public static final Item KEEP_SPACE_VARIANT2_LOWERRIGHT =
            new BlockItem(Blocks.KEEP_SPACE_VARIANT2_LOWERRIGHT,
                          new Item.Settings().maxCount(64));
        public static final Item WHITE_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.WHITE_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item ORANGE_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.ORANGE_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item MAGENTA_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.MAGENTA_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.LIGHT_BLUE_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item YELLOW_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.YELLOW_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIME_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.LIME_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item PINK_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.PINK_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item GRAY_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.GRAY_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.LIGHT_GRAY_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item CYAN_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.CYAN_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item PURPLE_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.PURPLE_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BLUE_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.BLUE_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BROWN_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.BROWN_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item GREEN_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.GREEN_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item RED_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.RED_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BLACK_HALF1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.BLACK_HALF1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item WHITE_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.WHITE_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item ORANGE_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.ORANGE_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item MAGENTA_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.MAGENTA_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.LIGHT_BLUE_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item YELLOW_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.YELLOW_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIME_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.LIME_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item PINK_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.PINK_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item GRAY_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.GRAY_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.LIGHT_GRAY_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item CYAN_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.CYAN_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item PURPLE_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.PURPLE_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BLUE_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.BLUE_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BROWN_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.BROWN_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item GREEN_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.GREEN_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item RED_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.RED_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item BLACK_FULL1_CYLINDRICAL_ROD =
            new BlockItem(Blocks.BLACK_FULL1_CYLINDRICAL_ROD,
                          new Item.Settings().maxCount(64));
        public static final Item WHITE_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                         .WHITE_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                          .ORANGE_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                           .MAGENTA_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                              .LIGHT_BLUE_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                          .YELLOW_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item LIME_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                        .LIME_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item PINK_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                        .PINK_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item GRAY_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                        .GRAY_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                              .LIGHT_GRAY_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item CYAN_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                        .CYAN_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                          .PURPLE_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item BLUE_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                        .BLUE_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item BROWN_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                         .BROWN_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item GREEN_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                         .GREEN_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item RED_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                       .RED_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item BLACK_ROD_WITH_LAMP = new BlockItem(Blocks
                                                                         .BLACK_ROD_WITH_LAMP, new Item.Settings().maxCount(64));
        public static final Item FULL_SQUARE_BACKBOARD =
            new BlockItem(Blocks.FULL_SQUARE_BACKBOARD, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED4_TP =
            new BlockItem(Blocks.WHITE_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED4_TP =
            new BlockItem(Blocks.ORANGE_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED4_TP =
            new BlockItem(Blocks.MAGENTA_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED4_TP =
            new BlockItem(Blocks.LIGHT_BLUE_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED4_TP =
            new BlockItem(Blocks.YELLOW_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED4_TP =
            new BlockItem(Blocks.LIME_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED4_TP =
            new BlockItem(Blocks.PINK_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED4_TP =
            new BlockItem(Blocks.GRAY_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED4_TP =
            new BlockItem(Blocks.LIGHT_GRAY_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED4_TP =
            new BlockItem(Blocks.CYAN_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED4_TP =
            new BlockItem(Blocks.PURPLE_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED4_TP =
            new BlockItem(Blocks.BLUE_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED4_TP =
            new BlockItem(Blocks.BROWN_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED4_TP =
            new BlockItem(Blocks.GREEN_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED4_TP =
            new BlockItem(Blocks.RED_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED4_TP =
            new BlockItem(Blocks.BLACK_DOTTED4_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED5_TP =
            new BlockItem(Blocks.WHITE_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED5_TP =
            new BlockItem(Blocks.ORANGE_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED5_TP =
            new BlockItem(Blocks.MAGENTA_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED5_TP =
            new BlockItem(Blocks.LIGHT_BLUE_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED5_TP =
            new BlockItem(Blocks.YELLOW_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED5_TP =
            new BlockItem(Blocks.LIME_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED5_TP =
            new BlockItem(Blocks.PINK_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED5_TP =
            new BlockItem(Blocks.GRAY_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED5_TP =
            new BlockItem(Blocks.LIGHT_GRAY_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED5_TP =
            new BlockItem(Blocks.CYAN_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED5_TP =
            new BlockItem(Blocks.PURPLE_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED5_TP =
            new BlockItem(Blocks.BLUE_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED5_TP =
            new BlockItem(Blocks.BROWN_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED5_TP =
            new BlockItem(Blocks.GREEN_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED5_TP =
            new BlockItem(Blocks.RED_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED5_TP =
            new BlockItem(Blocks.BLACK_DOTTED5_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED6_TP =
            new BlockItem(Blocks.WHITE_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED6_TP =
            new BlockItem(Blocks.ORANGE_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED6_TP =
            new BlockItem(Blocks.MAGENTA_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED6_TP =
            new BlockItem(Blocks.LIGHT_BLUE_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED6_TP =
            new BlockItem(Blocks.YELLOW_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED6_TP =
            new BlockItem(Blocks.LIME_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED6_TP =
            new BlockItem(Blocks.PINK_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED6_TP =
            new BlockItem(Blocks.GRAY_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED6_TP =
            new BlockItem(Blocks.LIGHT_GRAY_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED6_TP =
            new BlockItem(Blocks.CYAN_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED6_TP =
            new BlockItem(Blocks.PURPLE_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED6_TP =
            new BlockItem(Blocks.BLUE_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED6_TP =
            new BlockItem(Blocks.BROWN_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED6_TP =
            new BlockItem(Blocks.GREEN_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED6_TP =
            new BlockItem(Blocks.RED_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED6_TP =
            new BlockItem(Blocks.BLACK_DOTTED6_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED7_TP =
            new BlockItem(Blocks.WHITE_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED7_TP =
            new BlockItem(Blocks.ORANGE_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED7_TP =
            new BlockItem(Blocks.MAGENTA_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED7_TP =
            new BlockItem(Blocks.LIGHT_BLUE_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED7_TP =
            new BlockItem(Blocks.YELLOW_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED7_TP =
            new BlockItem(Blocks.LIME_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED7_TP =
            new BlockItem(Blocks.PINK_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED7_TP =
            new BlockItem(Blocks.GRAY_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED7_TP =
            new BlockItem(Blocks.LIGHT_GRAY_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED7_TP =
            new BlockItem(Blocks.CYAN_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED7_TP =
            new BlockItem(Blocks.PURPLE_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED7_TP =
            new BlockItem(Blocks.BLUE_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED7_TP =
            new BlockItem(Blocks.BROWN_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED7_TP =
            new BlockItem(Blocks.GREEN_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED7_TP =
            new BlockItem(Blocks.RED_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED7_TP =
            new BlockItem(Blocks.BLACK_DOTTED7_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED8_TP =
            new BlockItem(Blocks.WHITE_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED8_TP =
            new BlockItem(Blocks.ORANGE_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED8_TP =
            new BlockItem(Blocks.MAGENTA_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED8_TP =
            new BlockItem(Blocks.LIGHT_BLUE_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED8_TP =
            new BlockItem(Blocks.YELLOW_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED8_TP =
            new BlockItem(Blocks.LIME_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED8_TP =
            new BlockItem(Blocks.PINK_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED8_TP =
            new BlockItem(Blocks.GRAY_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED8_TP =
            new BlockItem(Blocks.LIGHT_GRAY_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED8_TP =
            new BlockItem(Blocks.CYAN_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED8_TP =
            new BlockItem(Blocks.PURPLE_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED8_TP =
            new BlockItem(Blocks.BLUE_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED8_TP =
            new BlockItem(Blocks.BROWN_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED8_TP =
            new BlockItem(Blocks.GREEN_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED8_TP =
            new BlockItem(Blocks.RED_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED8_TP =
            new BlockItem(Blocks.BLACK_DOTTED8_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED9_TP =
            new BlockItem(Blocks.WHITE_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED9_TP =
            new BlockItem(Blocks.ORANGE_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED9_TP =
            new BlockItem(Blocks.MAGENTA_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED9_TP =
            new BlockItem(Blocks.LIGHT_BLUE_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED9_TP =
            new BlockItem(Blocks.YELLOW_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED9_TP =
            new BlockItem(Blocks.LIME_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED9_TP =
            new BlockItem(Blocks.PINK_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED9_TP =
            new BlockItem(Blocks.GRAY_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED9_TP =
            new BlockItem(Blocks.LIGHT_GRAY_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED9_TP =
            new BlockItem(Blocks.CYAN_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED9_TP =
            new BlockItem(Blocks.PURPLE_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED9_TP =
            new BlockItem(Blocks.BLUE_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED9_TP =
            new BlockItem(Blocks.BROWN_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED9_TP =
            new BlockItem(Blocks.GREEN_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED9_TP =
            new BlockItem(Blocks.RED_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED9_TP =
            new BlockItem(Blocks.BLACK_DOTTED9_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_DOTTED10_TP =
            new BlockItem(Blocks.WHITE_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_DOTTED10_TP =
            new BlockItem(Blocks.ORANGE_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_DOTTED10_TP =
            new BlockItem(Blocks.MAGENTA_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_DOTTED10_TP =
            new BlockItem(Blocks.LIGHT_BLUE_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_DOTTED10_TP =
            new BlockItem(Blocks.YELLOW_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_DOTTED10_TP =
            new BlockItem(Blocks.LIME_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_DOTTED10_TP =
            new BlockItem(Blocks.PINK_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_DOTTED10_TP =
            new BlockItem(Blocks.GRAY_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_DOTTED10_TP =
            new BlockItem(Blocks.LIGHT_GRAY_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_DOTTED10_TP =
            new BlockItem(Blocks.CYAN_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_DOTTED10_TP =
            new BlockItem(Blocks.PURPLE_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_DOTTED10_TP =
            new BlockItem(Blocks.BLUE_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_DOTTED10_TP =
            new BlockItem(Blocks.BROWN_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_DOTTED10_TP =
            new BlockItem(Blocks.GREEN_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item RED_DOTTED10_TP =
            new BlockItem(Blocks.RED_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_DOTTED10_TP =
            new BlockItem(Blocks.BLACK_DOTTED10_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED4_TP =
            new BlockItem(Blocks.WHITE_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED4_TP =
            new BlockItem(Blocks.ORANGE_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED4_TP =
            new BlockItem(Blocks.MAGENTA_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED4_TP =
            new BlockItem(Blocks.LIGHT_BLUE_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED4_TP =
            new BlockItem(Blocks.YELLOW_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED4_TP =
            new BlockItem(Blocks.LIME_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED4_TP =
            new BlockItem(Blocks.PINK_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED4_TP =
            new BlockItem(Blocks.GRAY_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED4_TP =
            new BlockItem(Blocks.LIGHT_GRAY_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED4_TP =
            new BlockItem(Blocks.CYAN_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED4_TP =
            new BlockItem(Blocks.PURPLE_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED4_TP =
            new BlockItem(Blocks.BLUE_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED4_TP =
            new BlockItem(Blocks.BROWN_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED4_TP =
            new BlockItem(Blocks.GREEN_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED4_TP =
            new BlockItem(Blocks.RED_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED4_TP =
            new BlockItem(Blocks.BLACK_LINED4_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED5_TP =
            new BlockItem(Blocks.WHITE_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED5_TP =
            new BlockItem(Blocks.ORANGE_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED5_TP =
            new BlockItem(Blocks.MAGENTA_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED5_TP =
            new BlockItem(Blocks.LIGHT_BLUE_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED5_TP =
            new BlockItem(Blocks.YELLOW_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED5_TP =
            new BlockItem(Blocks.LIME_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED5_TP =
            new BlockItem(Blocks.PINK_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED5_TP =
            new BlockItem(Blocks.GRAY_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED5_TP =
            new BlockItem(Blocks.LIGHT_GRAY_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED5_TP =
            new BlockItem(Blocks.CYAN_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED5_TP =
            new BlockItem(Blocks.PURPLE_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED5_TP =
            new BlockItem(Blocks.BLUE_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED5_TP =
            new BlockItem(Blocks.BROWN_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED5_TP =
            new BlockItem(Blocks.GREEN_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED5_TP =
            new BlockItem(Blocks.RED_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED5_TP =
            new BlockItem(Blocks.BLACK_LINED5_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED6_TP =
            new BlockItem(Blocks.WHITE_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED6_TP =
            new BlockItem(Blocks.ORANGE_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED6_TP =
            new BlockItem(Blocks.MAGENTA_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED6_TP =
            new BlockItem(Blocks.LIGHT_BLUE_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED6_TP =
            new BlockItem(Blocks.YELLOW_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED6_TP =
            new BlockItem(Blocks.LIME_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED6_TP =
            new BlockItem(Blocks.PINK_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED6_TP =
            new BlockItem(Blocks.GRAY_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED6_TP =
            new BlockItem(Blocks.LIGHT_GRAY_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED6_TP =
            new BlockItem(Blocks.CYAN_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED6_TP =
            new BlockItem(Blocks.PURPLE_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED6_TP =
            new BlockItem(Blocks.BLUE_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED6_TP =
            new BlockItem(Blocks.BROWN_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED6_TP =
            new BlockItem(Blocks.GREEN_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED6_TP =
            new BlockItem(Blocks.RED_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED6_TP =
            new BlockItem(Blocks.BLACK_LINED6_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED7_TP =
            new BlockItem(Blocks.WHITE_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED7_TP =
            new BlockItem(Blocks.ORANGE_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED7_TP =
            new BlockItem(Blocks.MAGENTA_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED7_TP =
            new BlockItem(Blocks.LIGHT_BLUE_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED7_TP =
            new BlockItem(Blocks.YELLOW_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED7_TP =
            new BlockItem(Blocks.LIME_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED7_TP =
            new BlockItem(Blocks.PINK_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED7_TP =
            new BlockItem(Blocks.GRAY_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED7_TP =
            new BlockItem(Blocks.LIGHT_GRAY_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED7_TP =
            new BlockItem(Blocks.CYAN_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED7_TP =
            new BlockItem(Blocks.PURPLE_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED7_TP =
            new BlockItem(Blocks.BLUE_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED7_TP =
            new BlockItem(Blocks.BROWN_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED7_TP =
            new BlockItem(Blocks.GREEN_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED7_TP =
            new BlockItem(Blocks.RED_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED7_TP =
            new BlockItem(Blocks.BLACK_LINED7_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED8_TP =
            new BlockItem(Blocks.WHITE_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED8_TP =
            new BlockItem(Blocks.ORANGE_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED8_TP =
            new BlockItem(Blocks.MAGENTA_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED8_TP =
            new BlockItem(Blocks.LIGHT_BLUE_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED8_TP =
            new BlockItem(Blocks.YELLOW_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED8_TP =
            new BlockItem(Blocks.LIME_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED8_TP =
            new BlockItem(Blocks.PINK_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED8_TP =
            new BlockItem(Blocks.GRAY_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED8_TP =
            new BlockItem(Blocks.LIGHT_GRAY_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED8_TP =
            new BlockItem(Blocks.CYAN_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED8_TP =
            new BlockItem(Blocks.PURPLE_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED8_TP =
            new BlockItem(Blocks.BLUE_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED8_TP =
            new BlockItem(Blocks.BROWN_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED8_TP =
            new BlockItem(Blocks.GREEN_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED8_TP =
            new BlockItem(Blocks.RED_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED8_TP =
            new BlockItem(Blocks.BLACK_LINED8_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED9_TP =
            new BlockItem(Blocks.WHITE_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED9_TP =
            new BlockItem(Blocks.ORANGE_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED9_TP =
            new BlockItem(Blocks.MAGENTA_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED9_TP =
            new BlockItem(Blocks.LIGHT_BLUE_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED9_TP =
            new BlockItem(Blocks.YELLOW_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED9_TP =
            new BlockItem(Blocks.LIME_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED9_TP =
            new BlockItem(Blocks.PINK_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED9_TP =
            new BlockItem(Blocks.GRAY_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED9_TP =
            new BlockItem(Blocks.LIGHT_GRAY_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED9_TP =
            new BlockItem(Blocks.CYAN_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED9_TP =
            new BlockItem(Blocks.PURPLE_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED9_TP =
            new BlockItem(Blocks.BLUE_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED9_TP =
            new BlockItem(Blocks.BROWN_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED9_TP =
            new BlockItem(Blocks.GREEN_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED9_TP =
            new BlockItem(Blocks.RED_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED9_TP =
            new BlockItem(Blocks.BLACK_LINED9_TP, new Item.Settings().maxCount(64));
        public static final Item WHITE_LINED10_TP =
            new BlockItem(Blocks.WHITE_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item ORANGE_LINED10_TP =
            new BlockItem(Blocks.ORANGE_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item MAGENTA_LINED10_TP =
            new BlockItem(Blocks.MAGENTA_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_BLUE_LINED10_TP =
            new BlockItem(Blocks.LIGHT_BLUE_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item YELLOW_LINED10_TP =
            new BlockItem(Blocks.YELLOW_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIME_LINED10_TP =
            new BlockItem(Blocks.LIME_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item PINK_LINED10_TP =
            new BlockItem(Blocks.PINK_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item GRAY_LINED10_TP =
            new BlockItem(Blocks.GRAY_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item LIGHT_GRAY_LINED10_TP =
            new BlockItem(Blocks.LIGHT_GRAY_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item CYAN_LINED10_TP =
            new BlockItem(Blocks.CYAN_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item PURPLE_LINED10_TP =
            new BlockItem(Blocks.PURPLE_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item BLUE_LINED10_TP =
            new BlockItem(Blocks.BLUE_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item BROWN_LINED10_TP =
            new BlockItem(Blocks.BROWN_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item GREEN_LINED10_TP =
            new BlockItem(Blocks.GREEN_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item RED_LINED10_TP =
            new BlockItem(Blocks.RED_LINED10_TP, new Item.Settings().maxCount(64));
        public static final Item BLACK_LINED10_TP =
            new BlockItem(Blocks.BLACK_LINED10_TP, new Item.Settings().maxCount(64));
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
        ITEM_GROUP = FabricItemGroup.builder().icon(() -> new ItemStack(Items
                                                                            .SPEEDLIMIT_HIGH_120)).displayName(Text
                                                                                                                   .translatableWithFallback("itemGroup.regedt32.cntrafficsymbols",
                                                                                                                                             "CNTrafficSymbols")).entries((c, e) -> {
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
        for (int i = 1; i < 31; i++) {
            Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                               "cntrafficsymbols/speedlimit_high_" + Integer.toString(i * 5)),
                              SPEEDLIMIT_HIGH_BLOCKS[i]);
            Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                               "cntrafficsymbols/speedlimit_low_" + Integer.toString(i * 5)),
                              SPEEDLIMIT_LOW_BLOCKS[i]);
            Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                               "cntrafficsymbols/lift_speedlimit_high_" + Integer.toString(i * 5)),
                              LIFT_SPEEDLIMIT_HIGH_BLOCKS[i]);
            Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                              "cntrafficsymbols/speedlimit_high_" + Integer.toString(i * 5)),
                              SPEEDLIMIT_HIGH_ITEMS[i]);
            Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                              "cntrafficsymbols/speedlimit_low_" + Integer.toString(i * 5)),
                              SPEEDLIMIT_LOW_ITEMS[i]);
            Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                              "cntrafficsymbols/lift_speedlimit_high_" + Integer.toString(i * 5)),
                              LIFT_SPEEDLIMIT_HIGH_ITEMS[i]);
        }
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/speedlimit_high_3"), Blocks.SPEEDLIMIT_HIGH_3);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/speedlimit_low_3"), Blocks.SPEEDLIMIT_LOW_3);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/speedlimit_high_special"), Blocks.SPEEDLIMIT_HIGH_SPECIAL);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/speedlimit_low_special"), Blocks.SPEEDLIMIT_LOW_SPECIAL);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/lift_speedlimit_high_3"), Blocks.LIFT_SPEEDLIMIT_HIGH_3);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/lift_speedlimit_high_special"),
                          Blocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/circle_backboard"), Blocks.CIRCLE_BACKBOARD);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/heightlimit_special"), Blocks.HEIGHTLIMIT_SPECIAL);
        for (int i = 1; i < 101; i++) {
            Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                               "cntrafficsymbols/heightlimit_" + ((i % 10 != 0) ? Integer.toString(i / 10) + "d" +
                                                                                                                  Integer.toString(i % 10) : Integer.toString(i / 10))), HEIGHTLIMIT_BLOCKS[i]);
            Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                              "cntrafficsymbols/heightlimit_" + ((i % 10 != 0) ? Integer.toString(i / 10) + "d" +
                                                                                                                 Integer.toString(i % 10) : Integer.toString(i / 10))), HEIGHTLIMIT_ITEMS[i]);
        }
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/prohibition"), Blocks.PROHIBITION);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/no_u_turn"), Blocks.NO_U_TURN);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/no_left_turn"), Blocks.NO_LEFT_TURN);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/no_right_turn"), Blocks.NO_RIGHT_TURN);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/no_parking"), Blocks.NO_PARKING);
        for (int i = 0; i < 9; i++) {
            Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                               "cntrafficsymbols/highway_" + Integer.toString(i + 1) + "hm"),
                              HIGHWAY_HM_BLOCKS[i]);
            Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                              "cntrafficsymbols/highway_" + Integer.toString(i + 1) + "hm"),
                              HIGHWAY_HM_ITEMS[i]);
        }
        Blocks.FLOOR_LINE_EIGHTHS.setItm1(Items.WHITE_FLOOR_LINE_EIGHTH);
        Blocks.FLOOR_LINE_EIGHTHS.setItm2(Items.YELLOW_FLOOR_LINE_EIGHTH);
        Blocks.BARRICADES_1.setItm0(Items.BARRICADE_1M_EDGE_1M_HEIGHT);
        Blocks.BARRICADES_1.setItm1(Items.BARRICADE_50CM_EDGE_75CM_HEIGHT);
        Blocks.BARRICADES_1.setItm2(Items.BARRICADE_50CM_EDGE_1M_HEIGHT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/floor_line_eighths"), Blocks.FLOOR_LINE_EIGHTHS);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_km"), Blocks.HIGHWAY_KM);
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
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/distance_detection_0m_left"),
                          Blocks.DISTANCE_DETECTION_0M_LEFT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/distance_detection_0m_right"),
                          Blocks.DISTANCE_DETECTION_0M_RIGHT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/distance_detection_50m_left"),
                          Blocks.DISTANCE_DETECTION_50M_LEFT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/distance_detection_50m_right"),
                          Blocks.DISTANCE_DETECTION_50M_RIGHT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/distance_detection_100m_left"),
                          Blocks.DISTANCE_DETECTION_100M_LEFT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/distance_detection_100m_right"),
                          Blocks.DISTANCE_DETECTION_100M_RIGHT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/distance_detection_200m_left"),
                          Blocks.DISTANCE_DETECTION_200M_LEFT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/distance_detection_200m_right"),
                          Blocks.DISTANCE_DETECTION_200M_RIGHT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_left_single"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_middle_single"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_right_single"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_left_top"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_middle_top"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_right_top"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_left_middle"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_middle_middle"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_right_middle"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_left_bottom"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_middle_bottom"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/highway_exit_distance_info_right_bottom"),
                          Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/barricades_1"), Blocks.BARRICADES_1);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant1_upperleft"),
                          Blocks.KEEP_SPACE_VARIANT1_UPPERLEFT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant1_upper"),
                          Blocks.KEEP_SPACE_VARIANT1_UPPER);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant1_upperright"),
                          Blocks.KEEP_SPACE_VARIANT1_UPPERRIGHT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant1_left"),
                          Blocks.KEEP_SPACE_VARIANT1_LEFT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant1_center"),
                          Blocks.KEEP_SPACE_VARIANT1_CENTER);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant1_right"),
                          Blocks.KEEP_SPACE_VARIANT1_RIGHT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant1_lowerleft"),
                          Blocks.KEEP_SPACE_VARIANT1_LOWERLEFT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant1_lower"),
                          Blocks.KEEP_SPACE_VARIANT1_LOWER);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant1_lowerright"),
                          Blocks.KEEP_SPACE_VARIANT1_LOWERRIGHT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant2_upperleft"),
                          Blocks.KEEP_SPACE_VARIANT2_UPPERLEFT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant2_upper"),
                          Blocks.KEEP_SPACE_VARIANT2_UPPER);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant2_upperright"),
                          Blocks.KEEP_SPACE_VARIANT2_UPPERRIGHT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant2_left"),
                          Blocks.KEEP_SPACE_VARIANT2_LEFT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant2_center"),
                          Blocks.KEEP_SPACE_VARIANT2_CENTER);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant2_right"),
                          Blocks.KEEP_SPACE_VARIANT2_RIGHT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant2_lowerleft"),
                          Blocks.KEEP_SPACE_VARIANT2_LOWERLEFT);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant2_lower"),
                          Blocks.KEEP_SPACE_VARIANT2_LOWER);
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/keep_space_variant2_lowerright"),
                          Blocks.KEEP_SPACE_VARIANT2_LOWERRIGHT);
        for (int i = 0; i < 16; i++) {
            Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                               "cntrafficsymbols/" + COLORS_MC16.get(i) + "_half1_cylindrical_rod"),
                              HALF1_CYLINDRICAL_ROD_BLOCKS[i]);
            Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                               "cntrafficsymbols/" + COLORS_MC16.get(i) + "_full1_cylindrical_rod"),
                              FULL1_CYLINDRICAL_ROD_BLOCKS[i]);
            Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                               "cntrafficsymbols/" + COLORS_MC16.get(i) + "_rod_with_lamp"),
                              ROD_WITH_LAMP_BLOCKS[i]);
            Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                              "cntrafficsymbols/" + COLORS_MC16.get(i) + "_half1_cylindrical_rod"),
                              HALF1_CYLINDRICAL_ROD_ITEMS[i]);
            Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                              "cntrafficsymbols/" + COLORS_MC16.get(i) + "_full1_cylindrical_rod"),
                              FULL1_CYLINDRICAL_ROD_ITEMS[i]);
            Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                              "cntrafficsymbols/" + COLORS_MC16.get(i) + "_rod_with_lamp"),
                              ROD_WITH_LAMP_ITEMS[i]);
        }
        Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                           "cntrafficsymbols/full_square_backboard"), Blocks.FULL_SQUARE_BACKBOARD);
        for (int i = 4; i < 11; i++) {
            for (int j = 0; j < 16; j++) {
                Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                                   "cntrafficsymbols/" + COLORS_MC16.get(j) + "_dotted" + Integer.toString(i) +
                                                                   "_tp"), DOTTED_TP_BLOCKS[i][j]);
                Registry.register(Registries.BLOCK, new Identifier("regedt32",
                                                                   "cntrafficsymbols/" + COLORS_MC16.get(j) + "_lined" + Integer.toString(i) +
                                                                   "_tp"), LINED_TP_BLOCKS[i][j]);
                Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                                  "cntrafficsymbols/" + COLORS_MC16.get(j) + "_dotted" + Integer.toString(i) +
                                                                  "_tp"), DOTTED_TP_ITEMS[i][j]);
                Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                                  "cntrafficsymbols/" + COLORS_MC16.get(j) + "_lined" + Integer.toString(i) +
                                                                  "_tp"), LINED_TP_ITEMS[i][j]);
            }
        }
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier("regedt32",
                                                                       "cntrafficsymbols/highway_hm"), rege.pegui.cntrafficsymbols.be
                              .HighwayHmSignBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier("regedt32",
                                                                       "cntrafficsymbols/highway_km"), rege.pegui.cntrafficsymbols.be
                              .HighwayKmSignBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier("regedt32",
                                                                       "cntrafficsymbols/highway_exit_distance_info_name"), rege.pegui
                              .cntrafficsymbols.be.HighwayExitDistanceInfoNameBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier("regedt32",
                                                                       "cntrafficsymbols/highway_exit_distance_info_km"), rege.pegui
                              .cntrafficsymbols.be.HighwayExitDistanceInfoKmBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier("regedt32",
                                                                       "cntrafficsymbols/rod_with_lamp"), rege.pegui.cntrafficsymbols.be
                              .RodWithLampBlockEntity.TYPE);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/speedlimit_high_3"), Items.SPEEDLIMIT_HIGH_3);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/speedlimit_low_3"), Items.SPEEDLIMIT_LOW_3);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/speedlimit_high_special"), Items.SPEEDLIMIT_HIGH_SPECIAL);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/speedlimit_low_special"), Items.SPEEDLIMIT_LOW_SPECIAL);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/lift_speedlimit_high_3"), Items.LIFT_SPEEDLIMIT_HIGH_3);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/lift_speedlimit_high_special"),
                          Items.LIFT_SPEEDLIMIT_HIGH_SPECIAL);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/iron_plate"), Items.IRON_PLATE);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/circle_backboard"), Items.CIRCLE_BACKBOARD);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/heightlimit_special"), Items.HEIGHTLIMIT_SPECIAL);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/prohibition"), Items.PROHIBITION);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/no_u_turn"), Items.NO_U_TURN);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/no_left_turn"), Items.NO_LEFT_TURN);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/no_right_turn"), Items.NO_RIGHT_TURN);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/no_parking"), Items.NO_PARKING);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/white_floor_line_eighth"), Items.WHITE_FLOOR_LINE_EIGHTH);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/yellow_floor_line_eighth"), Items.YELLOW_FLOOR_LINE_EIGHTH);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_km"), Items.HIGHWAY_KM);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/distance_detection_0m_left"),
                          Items.DISTANCE_DETECTION_0M_LEFT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/distance_detection_0m_right"),
                          Items.DISTANCE_DETECTION_0M_RIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/distance_detection_50m_left"),
                          Items.DISTANCE_DETECTION_50M_LEFT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/distance_detection_50m_right"),
                          Items.DISTANCE_DETECTION_50M_RIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/distance_detection_100m_left"),
                          Items.DISTANCE_DETECTION_100M_LEFT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/distance_detection_100m_right"),
                          Items.DISTANCE_DETECTION_100M_RIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/distance_detection_200m_left"),
                          Items.DISTANCE_DETECTION_200M_LEFT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/distance_detection_200m_right"),
                          Items.DISTANCE_DETECTION_200M_RIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_left_single"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_middle_single"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_right_single"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_left_top"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_middle_top"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_right_top"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_left_middle"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_middle_middle"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_right_middle"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_left_bottom"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_middle_bottom"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/highway_exit_distance_info_right_bottom"),
                          Items.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/barricade_50cm_edge_75cm_height"),
                          Items.BARRICADE_50CM_EDGE_75CM_HEIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/barricade_50cm_edge_1m_height"),
                          Items.BARRICADE_50CM_EDGE_1M_HEIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/barricade_1m_edge_1m_height"),
                          Items.BARRICADE_1M_EDGE_1M_HEIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant1_upperleft"),
                          Items.KEEP_SPACE_VARIANT1_UPPERLEFT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant1_upper"),
                          Items.KEEP_SPACE_VARIANT1_UPPER);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant1_upperright"),
                          Items.KEEP_SPACE_VARIANT1_UPPERRIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant1_left"),
                          Items.KEEP_SPACE_VARIANT1_LEFT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant1_center"),
                          Items.KEEP_SPACE_VARIANT1_CENTER);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant1_right"),
                          Items.KEEP_SPACE_VARIANT1_RIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant1_lowerleft"),
                          Items.KEEP_SPACE_VARIANT1_LOWERLEFT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant1_lower"),
                          Items.KEEP_SPACE_VARIANT1_LOWER);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant1_lowerright"),
                          Items.KEEP_SPACE_VARIANT1_LOWERRIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant2_upperleft"),
                          Items.KEEP_SPACE_VARIANT2_UPPERLEFT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant2_upper"),
                          Items.KEEP_SPACE_VARIANT2_UPPER);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant2_upperright"),
                          Items.KEEP_SPACE_VARIANT2_UPPERRIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant2_left"),
                          Items.KEEP_SPACE_VARIANT2_LEFT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant2_center"),
                          Items.KEEP_SPACE_VARIANT2_CENTER);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant2_right"),
                          Items.KEEP_SPACE_VARIANT2_RIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant2_lowerleft"),
                          Items.KEEP_SPACE_VARIANT2_LOWERLEFT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant2_lower"),
                          Items.KEEP_SPACE_VARIANT2_LOWER);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/keep_space_variant2_lowerright"),
                          Items.KEEP_SPACE_VARIANT2_LOWERRIGHT);
        Registry.register(Registries.ITEM, new Identifier("regedt32",
                                                          "cntrafficsymbols/full_square_backboard"),
                          Items.FULL_SQUARE_BACKBOARD);
        Registry.register(Registries.ITEM_GROUP, new Identifier("regedt32",
                                                                "cntrafficsymbols"), ITEM_GROUP);
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
                                                         .getValue(), new BlockProperties().mergeFromBlockState(st), 12201, d);
                    if (getWaterloggedProperty()) {
                        st = st.with(WATERLOGGED, true);
                        BlockNumberIDRegistry.INSTANCE.register(12203, ~d, st);
                        BlockNumberIDRecognitionRegistry.INSTANCE
                            .register(Blocks.CIRCLE_BACKBOARD.getRegistryEntry().registryKey()
                                                             .getValue(), new BlockProperties().mergeFromBlockState(st), 12201, ~d);
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
        } catch (NoClassDefFoundError e) {
        }*/
    }
}
