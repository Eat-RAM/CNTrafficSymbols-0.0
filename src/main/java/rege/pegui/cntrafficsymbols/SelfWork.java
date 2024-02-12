package rege.pegui.cntrafficsymbols;
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
import rege.pegui.cntrafficsymbols.block.CircleStandingSymbolBlock;
import rege.pegui.cntrafficsymbols.block.FloorLineEighthBlock;
import rege.pegui.cntrafficsymbols.block.HighwayHmSignBlock;
import rege.pegui.cntrafficsymbols.block.WideBoardBlock;
import rege.pegui.cntrafficsymbols.struct.Attachment3;
import rege.pegui.cntrafficsymbols.struct.DoubleFaceFacing;
import rege.rege.minecraftmod.number_id_revival.state.BlockProperties;
import rege.rege.minecraftmod.number_id_revival.state.numberid.BlockNumberIDRecognitionRegistry;
import
rege.rege.minecraftmod.number_id_revival.state.numberid.BlockNumberIDRegistry;
import
rege.rege.minecraftmod.number_id_revival.state.numberid.ItemNumberIDRegistry;
import static net.minecraft.block.Blocks.AIR;
import static net.minecraft.block.Blocks.WATER;
import static net.minecraft.state.property.Properties.WATERLOGGED;
public class SelfWork{
	public static class Blocks{
		public static final Block SPEEDLIMIT_HIGH_3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_10=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_10=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_15=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_15=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_20=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_20=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_25=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_25=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_30=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_30=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_35=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_35=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_40=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_40=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_45=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_45=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_50=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_50=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_55=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_55=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_60=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_60=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_65=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_65=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_70=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_70=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_75=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_75=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_80=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_80=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_85=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_85=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_90=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_90=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_95=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_95=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_100=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_100=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_105=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_105=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_110=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_110=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_115=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_115=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_120=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_120=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_125=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_125=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_130=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_130=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_135=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_135=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_140=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_140=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_145=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_145=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_150=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_150=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_HIGH_SPECIAL=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block SPEEDLIMIT_LOW_SPECIAL=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_10=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_15=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_20=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_25=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_30=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_35=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_40=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_45=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_50=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_55=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_60=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_65=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_70=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_75=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_80=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_85=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_90=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_95=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_100=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_105=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_110=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_115=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_120=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_125=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_130=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_135=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_140=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_145=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_150=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_SPECIAL=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block CIRCLE_BACKBOARD=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_SPECIAL=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_0D1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_0D2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_0D3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_0D4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_0D5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_0D6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_0D7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_0D8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_0D9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_1D1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_1D2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_1D3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_1D4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_1D5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_1D6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_1D7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_1D8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_1D9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_2D1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_2D2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_2D3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_2D4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_2D5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_2D6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_2D7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_2D8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_2D9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_3D1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_3D2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_3D3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_3D4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_3D5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_3D6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_3D7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_3D8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_3D9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_4D1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_4D2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_4D3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_4D4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_4D5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_4D6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_4D7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_4D8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_4D9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_5D1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_5D2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_5D3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_5D4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_5D5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_5D6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_5D7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_5D8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_5D9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_6D1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_6D2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_6D3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_6D4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_6D5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_6D6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_6D7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_6D8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_6D9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_7D1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_7D2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_7D3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_7D4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_7D5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_7D6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_7D7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_7D8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_7D9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_8D1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_8D2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_8D3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_8D4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_8D5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_8D6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_8D7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_8D8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_8D9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_9D1=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_9D2=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_9D3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_9D4=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_9D5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_9D6=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_9D7=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_9D8=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_9D9=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HEIGHTLIMIT_10=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block PROHIBITION=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block NO_U_TURN=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block NO_LEFT_TURN=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block NO_RIGHT_TURN=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block NO_PARKING=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(9f,36f));
		public static final Block HIGHWAY_1HM=
		new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f,4f)
		.mapColor(MapColor.GREEN));
		public static final Block HIGHWAY_2HM=
		new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f,4f)
		.mapColor(MapColor.GREEN));
		public static final Block HIGHWAY_3HM=
		new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f,4f)
		.mapColor(MapColor.GREEN));
		public static final Block HIGHWAY_4HM=
		new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f,4f)
		.mapColor(MapColor.GREEN));
		public static final Block HIGHWAY_5HM=
		new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f,4f)
		.mapColor(MapColor.GREEN));
		public static final Block HIGHWAY_6HM=
		new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f,4f)
		.mapColor(MapColor.GREEN));
		public static final Block HIGHWAY_7HM=
		new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f,4f)
		.mapColor(MapColor.GREEN));
		public static final Block HIGHWAY_8HM=
		new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f,4f)
		.mapColor(MapColor.GREEN));
		public static final Block HIGHWAY_9HM=
		new HighwayHmSignBlock(Block.Settings.create().nonOpaque().strength(1f,4f)
		.mapColor(MapColor.GREEN));
		public static final FloorLineEighthBlock FLOOR_LINE_EIGHTHS=
		new FloorLineEighthBlock(Block.Settings.create().strength(4f,4f));
		public static final Block HIGHWAY_KM=
		new rege.pegui.cntrafficsymbols.block.HighwayKmSignBlock(Block.Settings
		.create().nonOpaque().strength(7f,28f).mapColor(MapColor.GREEN));
		public static final WideBoardBlock DISTANCE_DETECTION_0M_LEFT=
		new WideBoardBlock(Block.Settings.create().strength(21f,84f));
		public static final WideBoardBlock DISTANCE_DETECTION_0M_RIGHT=
		new WideBoardBlock(DISTANCE_DETECTION_0M_LEFT,
		Block.Settings.create().strength(21f,84f));
		public static final WideBoardBlock DISTANCE_DETECTION_50M_LEFT=
		new WideBoardBlock(Block.Settings.create().strength(21f,84f));
		public static final WideBoardBlock DISTANCE_DETECTION_50M_RIGHT=
		new WideBoardBlock(DISTANCE_DETECTION_50M_LEFT,
		Block.Settings.create().strength(21f,84f));
		public static final WideBoardBlock DISTANCE_DETECTION_100M_LEFT=
		new WideBoardBlock(Block.Settings.create().strength(21f,84f));
		public static final WideBoardBlock DISTANCE_DETECTION_100M_RIGHT=
		new WideBoardBlock(DISTANCE_DETECTION_100M_LEFT,
		Block.Settings.create().strength(21f,84f));
		public static final WideBoardBlock DISTANCE_DETECTION_200M_LEFT=
		new WideBoardBlock(Block.Settings.create().strength(21f,84f));
		public static final WideBoardBlock DISTANCE_DETECTION_200M_RIGHT=
		new WideBoardBlock(DISTANCE_DETECTION_200M_LEFT,
		Block.Settings.create().strength(21f,84f));
	}
	private static final Block[]SPEEDLIMIT_HIGH_BLOCKS;
	private static final Block[]SPEEDLIMIT_LOW_BLOCKS;
	private static final Block[]LIFT_SPEEDLIMIT_HIGH_BLOCKS;
	private static final Block[]HEIGHTLIMIT_BLOCKS;
	private static final Block[]PROHIBITION_BLOCKS;
	private static final Block[]HIGHWAY_HM_BLOCKS;
	public static class Items{
		public static final Item SPEEDLIMIT_HIGH_3=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_3,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_3=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_3,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_5=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_5,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_5=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_5,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_10=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_10,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_10=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_10,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_15=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_15,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_15=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_15,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_20=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_20,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_20=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_20,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_25=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_25,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_25=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_25,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_30=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_30,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_30=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_30,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_35=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_35,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_35=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_35,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_40=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_40,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_40=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_40,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_45=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_45,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_45=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_45,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_50=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_50,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_50=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_50,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_55=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_55,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_55=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_55,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_60=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_60,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_60=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_60,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_65=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_65,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_65=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_65,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_70=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_70,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_70=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_70,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_75=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_75,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_75=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_75,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_80=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_80,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_80=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_80,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_85=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_85,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_85=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_85,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_90=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_90,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_90=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_90,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_95=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_95,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_95=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_95,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_100=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_100,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_100=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_100,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_105=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_105,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_105=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_105,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_110=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_110,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_110=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_110,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_115=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_115,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_115=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_115,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_120=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_120,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_120=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_120,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_125=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_125,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_125=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_125,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_130=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_130,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_130=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_130,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_135=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_135,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_135=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_135,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_140=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_140,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_140=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_140,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_145=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_145,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_145=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_145,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_150=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_150,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_150=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_150,new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_HIGH_SPECIAL=
		new BlockItem(Blocks.SPEEDLIMIT_HIGH_SPECIAL,
		new Item.Settings().maxCount(64));
		public static final Item SPEEDLIMIT_LOW_SPECIAL=
		new BlockItem(Blocks.SPEEDLIMIT_LOW_SPECIAL,
		new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_3=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_3,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_5=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_5,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_10=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_10,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_15=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_15,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_20=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_20,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_25=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_25,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_30=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_30,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_35=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_35,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_40=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_40,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_45=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_45,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_50=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_50,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_55=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_55,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_60=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_60,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_65=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_65,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_70=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_70,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_75=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_75,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_80=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_80,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_85=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_85,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_90=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_90,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_95=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_95,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_100=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_100,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_105=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_105,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_110=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_110,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_115=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_115,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_120=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_120,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_125=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_125,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_130=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_130,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_135=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_135,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_140=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_140,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_145=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_145,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_150=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_150,new Item.Settings().maxCount(64));
		public static final Item LIFT_SPEEDLIMIT_HIGH_SPECIAL=
		new BlockItem(Blocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL,
		new Item.Settings().maxCount(64));
		public static final Item IRON_PLATE=new Item(new Item.Settings().maxCount(64));
		public static final Item CIRCLE_BACKBOARD=
		new BlockItem(Blocks.CIRCLE_BACKBOARD,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_SPECIAL=
		new BlockItem(Blocks.HEIGHTLIMIT_SPECIAL,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_0D1=
		new BlockItem(Blocks.HEIGHTLIMIT_0D1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_0D2=
		new BlockItem(Blocks.HEIGHTLIMIT_0D2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_0D3=
		new BlockItem(Blocks.HEIGHTLIMIT_0D3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_0D4=
		new BlockItem(Blocks.HEIGHTLIMIT_0D4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_0D5=
		new BlockItem(Blocks.HEIGHTLIMIT_0D5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_0D6=
		new BlockItem(Blocks.HEIGHTLIMIT_0D6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_0D7=
		new BlockItem(Blocks.HEIGHTLIMIT_0D7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_0D8=
		new BlockItem(Blocks.HEIGHTLIMIT_0D8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_0D9=
		new BlockItem(Blocks.HEIGHTLIMIT_0D9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_1=
		new BlockItem(Blocks.HEIGHTLIMIT_1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_1D1=
		new BlockItem(Blocks.HEIGHTLIMIT_1D1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_1D2=
		new BlockItem(Blocks.HEIGHTLIMIT_1D2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_1D3=
		new BlockItem(Blocks.HEIGHTLIMIT_1D3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_1D4=
		new BlockItem(Blocks.HEIGHTLIMIT_1D4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_1D5=
		new BlockItem(Blocks.HEIGHTLIMIT_1D5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_1D6=
		new BlockItem(Blocks.HEIGHTLIMIT_1D6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_1D7=
		new BlockItem(Blocks.HEIGHTLIMIT_1D7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_1D8=
		new BlockItem(Blocks.HEIGHTLIMIT_1D8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_1D9=
		new BlockItem(Blocks.HEIGHTLIMIT_1D9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_2=
		new BlockItem(Blocks.HEIGHTLIMIT_2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_2D1=
		new BlockItem(Blocks.HEIGHTLIMIT_2D1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_2D2=
		new BlockItem(Blocks.HEIGHTLIMIT_2D2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_2D3=
		new BlockItem(Blocks.HEIGHTLIMIT_2D3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_2D4=
		new BlockItem(Blocks.HEIGHTLIMIT_2D4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_2D5=
		new BlockItem(Blocks.HEIGHTLIMIT_2D5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_2D6=
		new BlockItem(Blocks.HEIGHTLIMIT_2D6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_2D7=
		new BlockItem(Blocks.HEIGHTLIMIT_2D7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_2D8=
		new BlockItem(Blocks.HEIGHTLIMIT_2D8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_2D9=
		new BlockItem(Blocks.HEIGHTLIMIT_2D9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_3=
		new BlockItem(Blocks.HEIGHTLIMIT_3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_3D1=
		new BlockItem(Blocks.HEIGHTLIMIT_3D1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_3D2=
		new BlockItem(Blocks.HEIGHTLIMIT_3D2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_3D3=
		new BlockItem(Blocks.HEIGHTLIMIT_3D3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_3D4=
		new BlockItem(Blocks.HEIGHTLIMIT_3D4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_3D5=
		new BlockItem(Blocks.HEIGHTLIMIT_3D5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_3D6=
		new BlockItem(Blocks.HEIGHTLIMIT_3D6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_3D7=
		new BlockItem(Blocks.HEIGHTLIMIT_3D7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_3D8=
		new BlockItem(Blocks.HEIGHTLIMIT_3D8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_3D9=
		new BlockItem(Blocks.HEIGHTLIMIT_3D9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_4=
		new BlockItem(Blocks.HEIGHTLIMIT_4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_4D1=
		new BlockItem(Blocks.HEIGHTLIMIT_4D1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_4D2=
		new BlockItem(Blocks.HEIGHTLIMIT_4D2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_4D3=
		new BlockItem(Blocks.HEIGHTLIMIT_4D3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_4D4=
		new BlockItem(Blocks.HEIGHTLIMIT_4D4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_4D5=
		new BlockItem(Blocks.HEIGHTLIMIT_4D5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_4D6=
		new BlockItem(Blocks.HEIGHTLIMIT_4D6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_4D7=
		new BlockItem(Blocks.HEIGHTLIMIT_4D7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_4D8=
		new BlockItem(Blocks.HEIGHTLIMIT_4D8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_4D9=
		new BlockItem(Blocks.HEIGHTLIMIT_4D9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_5=
		new BlockItem(Blocks.HEIGHTLIMIT_5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_5D1=
		new BlockItem(Blocks.HEIGHTLIMIT_5D1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_5D2=
		new BlockItem(Blocks.HEIGHTLIMIT_5D2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_5D3=
		new BlockItem(Blocks.HEIGHTLIMIT_5D3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_5D4=
		new BlockItem(Blocks.HEIGHTLIMIT_5D4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_5D5=
		new BlockItem(Blocks.HEIGHTLIMIT_5D5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_5D6=
		new BlockItem(Blocks.HEIGHTLIMIT_5D6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_5D7=
		new BlockItem(Blocks.HEIGHTLIMIT_5D7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_5D8=
		new BlockItem(Blocks.HEIGHTLIMIT_5D8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_5D9=
		new BlockItem(Blocks.HEIGHTLIMIT_5D9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_6=
		new BlockItem(Blocks.HEIGHTLIMIT_6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_6D1=
		new BlockItem(Blocks.HEIGHTLIMIT_6D1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_6D2=
		new BlockItem(Blocks.HEIGHTLIMIT_6D2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_6D3=
		new BlockItem(Blocks.HEIGHTLIMIT_6D3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_6D4=
		new BlockItem(Blocks.HEIGHTLIMIT_6D4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_6D5=
		new BlockItem(Blocks.HEIGHTLIMIT_6D5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_6D6=
		new BlockItem(Blocks.HEIGHTLIMIT_6D6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_6D7=
		new BlockItem(Blocks.HEIGHTLIMIT_6D7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_6D8=
		new BlockItem(Blocks.HEIGHTLIMIT_6D8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_6D9=
		new BlockItem(Blocks.HEIGHTLIMIT_6D9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_7=
		new BlockItem(Blocks.HEIGHTLIMIT_7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_7D1=
		new BlockItem(Blocks.HEIGHTLIMIT_7D1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_7D2=
		new BlockItem(Blocks.HEIGHTLIMIT_7D2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_7D3=
		new BlockItem(Blocks.HEIGHTLIMIT_7D3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_7D4=
		new BlockItem(Blocks.HEIGHTLIMIT_7D4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_7D5=
		new BlockItem(Blocks.HEIGHTLIMIT_7D5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_7D6=
		new BlockItem(Blocks.HEIGHTLIMIT_7D6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_7D7=
		new BlockItem(Blocks.HEIGHTLIMIT_7D7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_7D8=
		new BlockItem(Blocks.HEIGHTLIMIT_7D8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_7D9=
		new BlockItem(Blocks.HEIGHTLIMIT_7D9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_8=
		new BlockItem(Blocks.HEIGHTLIMIT_8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_8D1=
		new BlockItem(Blocks.HEIGHTLIMIT_8D1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_8D2=
		new BlockItem(Blocks.HEIGHTLIMIT_8D2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_8D3=
		new BlockItem(Blocks.HEIGHTLIMIT_8D3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_8D4=
		new BlockItem(Blocks.HEIGHTLIMIT_8D4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_8D5=
		new BlockItem(Blocks.HEIGHTLIMIT_8D5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_8D6=
		new BlockItem(Blocks.HEIGHTLIMIT_8D6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_8D7=
		new BlockItem(Blocks.HEIGHTLIMIT_8D7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_8D8=
		new BlockItem(Blocks.HEIGHTLIMIT_8D8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_8D9=
		new BlockItem(Blocks.HEIGHTLIMIT_8D9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_9=
		new BlockItem(Blocks.HEIGHTLIMIT_9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_9D1=
		new BlockItem(Blocks.HEIGHTLIMIT_9D1,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_9D2=
		new BlockItem(Blocks.HEIGHTLIMIT_9D2,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_9D3=
		new BlockItem(Blocks.HEIGHTLIMIT_9D3,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_9D4=
		new BlockItem(Blocks.HEIGHTLIMIT_9D4,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_9D5=
		new BlockItem(Blocks.HEIGHTLIMIT_9D5,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_9D6=
		new BlockItem(Blocks.HEIGHTLIMIT_9D6,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_9D7=
		new BlockItem(Blocks.HEIGHTLIMIT_9D7,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_9D8=
		new BlockItem(Blocks.HEIGHTLIMIT_9D8,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_9D9=
		new BlockItem(Blocks.HEIGHTLIMIT_9D9,new Item.Settings().maxCount(64));
		public static final Item HEIGHTLIMIT_10=
		new BlockItem(Blocks.HEIGHTLIMIT_10,new Item.Settings().maxCount(64));
		public static final Item PROHIBITION=
		new BlockItem(Blocks.PROHIBITION,new Item.Settings().maxCount(64));
		public static final Item NO_U_TURN=
		new BlockItem(Blocks.NO_U_TURN,new Item.Settings().maxCount(64));
		public static final Item NO_LEFT_TURN=
		new BlockItem(Blocks.NO_LEFT_TURN,new Item.Settings().maxCount(64));
		public static final Item NO_RIGHT_TURN=
		new BlockItem(Blocks.NO_RIGHT_TURN,new Item.Settings().maxCount(64));
		public static final Item NO_PARKING=
		new BlockItem(Blocks.NO_PARKING,new Item.Settings().maxCount(64));
		public static final Item HIGHWAY_1HM=
		new BlockItem(Blocks.HIGHWAY_1HM,new Item.Settings().maxCount(64));
		public static final Item HIGHWAY_2HM=
		new BlockItem(Blocks.HIGHWAY_2HM,new Item.Settings().maxCount(64));
		public static final Item HIGHWAY_3HM=
		new BlockItem(Blocks.HIGHWAY_3HM,new Item.Settings().maxCount(64));
		public static final Item HIGHWAY_4HM=
		new BlockItem(Blocks.HIGHWAY_4HM,new Item.Settings().maxCount(64));
		public static final Item HIGHWAY_5HM=
		new BlockItem(Blocks.HIGHWAY_5HM,new Item.Settings().maxCount(64));
		public static final Item HIGHWAY_6HM=
		new BlockItem(Blocks.HIGHWAY_6HM,new Item.Settings().maxCount(64));
		public static final Item HIGHWAY_7HM=
		new BlockItem(Blocks.HIGHWAY_7HM,new Item.Settings().maxCount(64));
		public static final Item HIGHWAY_8HM=
		new BlockItem(Blocks.HIGHWAY_8HM,new Item.Settings().maxCount(64));
		public static final Item HIGHWAY_9HM=
		new BlockItem(Blocks.HIGHWAY_9HM,new Item.Settings().maxCount(64));
		public static final Item WHITE_FLOOR_LINE_EIGHTH=
		new AliasedBlockItem(Blocks.FLOOR_LINE_EIGHTHS,
		new Item.Settings().maxCount(64)){
			@Override public Block getBlock(){return Blocks.FLOOR_LINE_EIGHTHS;}
		};
		public static final Item YELLOW_FLOOR_LINE_EIGHTH=
		new AliasedBlockItem(Blocks.FLOOR_LINE_EIGHTHS,
		new Item.Settings().maxCount(64)){
			@Override public Block getBlock(){return Blocks.FLOOR_LINE_EIGHTHS;}
		};
		public static final Item HIGHWAY_KM=
		new BlockItem(Blocks.HIGHWAY_KM,new Item.Settings().maxCount(64));
		public static final Item DISTANCE_DETECTION_0M_LEFT=new BlockItem(Blocks
		.DISTANCE_DETECTION_0M_LEFT,new Item.Settings().maxCount(64));
		public static final Item DISTANCE_DETECTION_0M_RIGHT=new BlockItem(Blocks
		.DISTANCE_DETECTION_0M_RIGHT,new Item.Settings().maxCount(64));
		public static final Item DISTANCE_DETECTION_50M_LEFT=new BlockItem(Blocks
		.DISTANCE_DETECTION_50M_LEFT,new Item.Settings().maxCount(64));
		public static final Item DISTANCE_DETECTION_50M_RIGHT=new BlockItem(Blocks
		.DISTANCE_DETECTION_50M_RIGHT,new Item.Settings().maxCount(64));
		public static final Item DISTANCE_DETECTION_100M_LEFT=new BlockItem(Blocks
		.DISTANCE_DETECTION_100M_LEFT,new Item.Settings().maxCount(64));
		public static final Item DISTANCE_DETECTION_100M_RIGHT=new BlockItem(Blocks
		.DISTANCE_DETECTION_100M_RIGHT,new Item.Settings().maxCount(64));
		public static final Item DISTANCE_DETECTION_200M_LEFT=new BlockItem(Blocks
		.DISTANCE_DETECTION_200M_LEFT,new Item.Settings().maxCount(64));
		public static final Item DISTANCE_DETECTION_200M_RIGHT=new BlockItem(Blocks
		.DISTANCE_DETECTION_200M_RIGHT,new Item.Settings().maxCount(64));
	}
	private static final Item[]SPEEDLIMIT_HIGH_ITEMS;
	private static final Item[]SPEEDLIMIT_LOW_ITEMS;
	private static final Item[]LIFT_SPEEDLIMIT_HIGH_ITEMS;
	private static final Item[]HEIGHTLIMIT_ITEMS;
	private static final Item[]PROHIBITION_ITEMS;
	private static final Item[]HIGHWAY_HM_ITEMS;
	private static final ItemGroup ITEM_GROUP;
	static{
		SPEEDLIMIT_HIGH_BLOCKS=new Block[]{Blocks.SPEEDLIMIT_HIGH_3,Blocks.SPEEDLIMIT_HIGH_5,Blocks.SPEEDLIMIT_HIGH_10,Blocks.SPEEDLIMIT_HIGH_15,Blocks.SPEEDLIMIT_HIGH_20,Blocks.SPEEDLIMIT_HIGH_25,Blocks.SPEEDLIMIT_HIGH_30,Blocks.SPEEDLIMIT_HIGH_35,Blocks.SPEEDLIMIT_HIGH_40,Blocks.SPEEDLIMIT_HIGH_45,Blocks.SPEEDLIMIT_HIGH_50,Blocks.SPEEDLIMIT_HIGH_55,Blocks.SPEEDLIMIT_HIGH_60,Blocks.SPEEDLIMIT_HIGH_65,Blocks.SPEEDLIMIT_HIGH_70,Blocks.SPEEDLIMIT_HIGH_75,Blocks.SPEEDLIMIT_HIGH_80,Blocks.SPEEDLIMIT_HIGH_85,Blocks.SPEEDLIMIT_HIGH_90,Blocks.SPEEDLIMIT_HIGH_95,Blocks.SPEEDLIMIT_HIGH_100,Blocks.SPEEDLIMIT_HIGH_105,Blocks.SPEEDLIMIT_HIGH_110,Blocks.SPEEDLIMIT_HIGH_115,Blocks.SPEEDLIMIT_HIGH_120,Blocks.SPEEDLIMIT_HIGH_125,Blocks.SPEEDLIMIT_HIGH_130,Blocks.SPEEDLIMIT_HIGH_135,Blocks.SPEEDLIMIT_HIGH_140,Blocks.SPEEDLIMIT_HIGH_145,Blocks.SPEEDLIMIT_HIGH_150,Blocks.SPEEDLIMIT_HIGH_SPECIAL};
		SPEEDLIMIT_LOW_BLOCKS=new Block[]{Blocks.SPEEDLIMIT_LOW_3,Blocks.SPEEDLIMIT_LOW_5,Blocks.SPEEDLIMIT_LOW_10,Blocks.SPEEDLIMIT_LOW_15,Blocks.SPEEDLIMIT_LOW_20,Blocks.SPEEDLIMIT_LOW_25,Blocks.SPEEDLIMIT_LOW_30,Blocks.SPEEDLIMIT_LOW_35,Blocks.SPEEDLIMIT_LOW_40,Blocks.SPEEDLIMIT_LOW_45,Blocks.SPEEDLIMIT_LOW_50,Blocks.SPEEDLIMIT_LOW_55,Blocks.SPEEDLIMIT_LOW_60,Blocks.SPEEDLIMIT_LOW_65,Blocks.SPEEDLIMIT_LOW_70,Blocks.SPEEDLIMIT_LOW_75,Blocks.SPEEDLIMIT_LOW_80,Blocks.SPEEDLIMIT_LOW_85,Blocks.SPEEDLIMIT_LOW_90,Blocks.SPEEDLIMIT_LOW_95,Blocks.SPEEDLIMIT_LOW_100,Blocks.SPEEDLIMIT_LOW_105,Blocks.SPEEDLIMIT_LOW_110,Blocks.SPEEDLIMIT_LOW_115,Blocks.SPEEDLIMIT_LOW_120,Blocks.SPEEDLIMIT_LOW_125,Blocks.SPEEDLIMIT_LOW_130,Blocks.SPEEDLIMIT_LOW_135,Blocks.SPEEDLIMIT_LOW_140,Blocks.SPEEDLIMIT_LOW_145,Blocks.SPEEDLIMIT_LOW_150,Blocks.SPEEDLIMIT_LOW_SPECIAL};
		LIFT_SPEEDLIMIT_HIGH_BLOCKS=new Block[]{Blocks.LIFT_SPEEDLIMIT_HIGH_3,Blocks.LIFT_SPEEDLIMIT_HIGH_5,Blocks.LIFT_SPEEDLIMIT_HIGH_10,Blocks.LIFT_SPEEDLIMIT_HIGH_15,Blocks.LIFT_SPEEDLIMIT_HIGH_20,Blocks.LIFT_SPEEDLIMIT_HIGH_25,Blocks.LIFT_SPEEDLIMIT_HIGH_30,Blocks.LIFT_SPEEDLIMIT_HIGH_35,Blocks.LIFT_SPEEDLIMIT_HIGH_40,Blocks.LIFT_SPEEDLIMIT_HIGH_45,Blocks.LIFT_SPEEDLIMIT_HIGH_50,Blocks.LIFT_SPEEDLIMIT_HIGH_55,Blocks.LIFT_SPEEDLIMIT_HIGH_60,Blocks.LIFT_SPEEDLIMIT_HIGH_65,Blocks.LIFT_SPEEDLIMIT_HIGH_70,Blocks.LIFT_SPEEDLIMIT_HIGH_75,Blocks.LIFT_SPEEDLIMIT_HIGH_80,Blocks.LIFT_SPEEDLIMIT_HIGH_85,Blocks.LIFT_SPEEDLIMIT_HIGH_90,Blocks.LIFT_SPEEDLIMIT_HIGH_95,Blocks.LIFT_SPEEDLIMIT_HIGH_100,Blocks.LIFT_SPEEDLIMIT_HIGH_105,Blocks.LIFT_SPEEDLIMIT_HIGH_110,Blocks.LIFT_SPEEDLIMIT_HIGH_115,Blocks.LIFT_SPEEDLIMIT_HIGH_120,Blocks.LIFT_SPEEDLIMIT_HIGH_125,Blocks.LIFT_SPEEDLIMIT_HIGH_130,Blocks.LIFT_SPEEDLIMIT_HIGH_135,Blocks.LIFT_SPEEDLIMIT_HIGH_140,Blocks.LIFT_SPEEDLIMIT_HIGH_145,Blocks.LIFT_SPEEDLIMIT_HIGH_150,Blocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL};
		HEIGHTLIMIT_BLOCKS=new Block[]{Blocks.HEIGHTLIMIT_SPECIAL,Blocks.HEIGHTLIMIT_0D1,Blocks.HEIGHTLIMIT_0D2,Blocks.HEIGHTLIMIT_0D3,Blocks.HEIGHTLIMIT_0D4,Blocks.HEIGHTLIMIT_0D5,Blocks.HEIGHTLIMIT_0D6,Blocks.HEIGHTLIMIT_0D7,Blocks.HEIGHTLIMIT_0D8,Blocks.HEIGHTLIMIT_0D9,Blocks.HEIGHTLIMIT_1,Blocks.HEIGHTLIMIT_1D1,Blocks.HEIGHTLIMIT_1D2,Blocks.HEIGHTLIMIT_1D3,Blocks.HEIGHTLIMIT_1D4,Blocks.HEIGHTLIMIT_1D5,Blocks.HEIGHTLIMIT_1D6,Blocks.HEIGHTLIMIT_1D7,Blocks.HEIGHTLIMIT_1D8,Blocks.HEIGHTLIMIT_1D9,Blocks.HEIGHTLIMIT_2,Blocks.HEIGHTLIMIT_2D1,Blocks.HEIGHTLIMIT_2D2,Blocks.HEIGHTLIMIT_2D3,Blocks.HEIGHTLIMIT_2D4,Blocks.HEIGHTLIMIT_2D5,Blocks.HEIGHTLIMIT_2D6,Blocks.HEIGHTLIMIT_2D7,Blocks.HEIGHTLIMIT_2D8,Blocks.HEIGHTLIMIT_2D9,Blocks.HEIGHTLIMIT_3,Blocks.HEIGHTLIMIT_3D1,Blocks.HEIGHTLIMIT_3D2,Blocks.HEIGHTLIMIT_3D3,Blocks.HEIGHTLIMIT_3D4,Blocks.HEIGHTLIMIT_3D5,Blocks.HEIGHTLIMIT_3D6,Blocks.HEIGHTLIMIT_3D7,Blocks.HEIGHTLIMIT_3D8,Blocks.HEIGHTLIMIT_3D9,Blocks.HEIGHTLIMIT_4,Blocks.HEIGHTLIMIT_4D1,Blocks.HEIGHTLIMIT_4D2,Blocks.HEIGHTLIMIT_4D3,Blocks.HEIGHTLIMIT_4D4,Blocks.HEIGHTLIMIT_4D5,Blocks.HEIGHTLIMIT_4D6,Blocks.HEIGHTLIMIT_4D7,Blocks.HEIGHTLIMIT_4D8,Blocks.HEIGHTLIMIT_4D9,Blocks.HEIGHTLIMIT_5,Blocks.HEIGHTLIMIT_5D1,Blocks.HEIGHTLIMIT_5D2,Blocks.HEIGHTLIMIT_5D3,Blocks.HEIGHTLIMIT_5D4,Blocks.HEIGHTLIMIT_5D5,Blocks.HEIGHTLIMIT_5D6,Blocks.HEIGHTLIMIT_5D7,Blocks.HEIGHTLIMIT_5D8,Blocks.HEIGHTLIMIT_5D9,Blocks.HEIGHTLIMIT_6,Blocks.HEIGHTLIMIT_6D1,Blocks.HEIGHTLIMIT_6D2,Blocks.HEIGHTLIMIT_6D3,Blocks.HEIGHTLIMIT_6D4,Blocks.HEIGHTLIMIT_6D5,Blocks.HEIGHTLIMIT_6D6,Blocks.HEIGHTLIMIT_6D7,Blocks.HEIGHTLIMIT_6D8,Blocks.HEIGHTLIMIT_6D9,Blocks.HEIGHTLIMIT_7,Blocks.HEIGHTLIMIT_7D1,Blocks.HEIGHTLIMIT_7D2,Blocks.HEIGHTLIMIT_7D3,Blocks.HEIGHTLIMIT_7D4,Blocks.HEIGHTLIMIT_7D5,Blocks.HEIGHTLIMIT_7D6,Blocks.HEIGHTLIMIT_7D7,Blocks.HEIGHTLIMIT_7D8,Blocks.HEIGHTLIMIT_7D9,Blocks.HEIGHTLIMIT_8,Blocks.HEIGHTLIMIT_8D1,Blocks.HEIGHTLIMIT_8D2,Blocks.HEIGHTLIMIT_8D3,Blocks.HEIGHTLIMIT_8D4,Blocks.HEIGHTLIMIT_8D5,Blocks.HEIGHTLIMIT_8D6,Blocks.HEIGHTLIMIT_8D7,Blocks.HEIGHTLIMIT_8D8,Blocks.HEIGHTLIMIT_8D9,Blocks.HEIGHTLIMIT_9,Blocks.HEIGHTLIMIT_9D1,Blocks.HEIGHTLIMIT_9D2,Blocks.HEIGHTLIMIT_9D3,Blocks.HEIGHTLIMIT_9D4,Blocks.HEIGHTLIMIT_9D5,Blocks.HEIGHTLIMIT_9D6,Blocks.HEIGHTLIMIT_9D7,Blocks.HEIGHTLIMIT_9D8,Blocks.HEIGHTLIMIT_9D9,Blocks.HEIGHTLIMIT_10};
		PROHIBITION_BLOCKS=new Block[]{Blocks.PROHIBITION,Blocks.NO_U_TURN,Blocks.NO_LEFT_TURN,Blocks.NO_RIGHT_TURN,Blocks.NO_PARKING};
		HIGHWAY_HM_BLOCKS=new Block[]{Blocks.HIGHWAY_1HM,Blocks.HIGHWAY_2HM,Blocks.HIGHWAY_3HM,Blocks.HIGHWAY_4HM,Blocks.HIGHWAY_5HM,Blocks.HIGHWAY_6HM,Blocks.HIGHWAY_7HM,Blocks.HIGHWAY_8HM,Blocks.HIGHWAY_9HM};
		SPEEDLIMIT_HIGH_ITEMS=new Item[]{Items.SPEEDLIMIT_HIGH_3,Items.SPEEDLIMIT_HIGH_5,Items.SPEEDLIMIT_HIGH_10,Items.SPEEDLIMIT_HIGH_15,Items.SPEEDLIMIT_HIGH_20,Items.SPEEDLIMIT_HIGH_25,Items.SPEEDLIMIT_HIGH_30,Items.SPEEDLIMIT_HIGH_35,Items.SPEEDLIMIT_HIGH_40,Items.SPEEDLIMIT_HIGH_45,Items.SPEEDLIMIT_HIGH_50,Items.SPEEDLIMIT_HIGH_55,Items.SPEEDLIMIT_HIGH_60,Items.SPEEDLIMIT_HIGH_65,Items.SPEEDLIMIT_HIGH_70,Items.SPEEDLIMIT_HIGH_75,Items.SPEEDLIMIT_HIGH_80,Items.SPEEDLIMIT_HIGH_85,Items.SPEEDLIMIT_HIGH_90,Items.SPEEDLIMIT_HIGH_95,Items.SPEEDLIMIT_HIGH_100,Items.SPEEDLIMIT_HIGH_105,Items.SPEEDLIMIT_HIGH_110,Items.SPEEDLIMIT_HIGH_115,Items.SPEEDLIMIT_HIGH_120,Items.SPEEDLIMIT_HIGH_125,Items.SPEEDLIMIT_HIGH_130,Items.SPEEDLIMIT_HIGH_135,Items.SPEEDLIMIT_HIGH_140,Items.SPEEDLIMIT_HIGH_145,Items.SPEEDLIMIT_HIGH_150,Items.SPEEDLIMIT_HIGH_SPECIAL};
		SPEEDLIMIT_LOW_ITEMS=new Item[]{Items.SPEEDLIMIT_LOW_3,Items.SPEEDLIMIT_LOW_5,Items.SPEEDLIMIT_LOW_10,Items.SPEEDLIMIT_LOW_15,Items.SPEEDLIMIT_LOW_20,Items.SPEEDLIMIT_LOW_25,Items.SPEEDLIMIT_LOW_30,Items.SPEEDLIMIT_LOW_35,Items.SPEEDLIMIT_LOW_40,Items.SPEEDLIMIT_LOW_45,Items.SPEEDLIMIT_LOW_50,Items.SPEEDLIMIT_LOW_55,Items.SPEEDLIMIT_LOW_60,Items.SPEEDLIMIT_LOW_65,Items.SPEEDLIMIT_LOW_70,Items.SPEEDLIMIT_LOW_75,Items.SPEEDLIMIT_LOW_80,Items.SPEEDLIMIT_LOW_85,Items.SPEEDLIMIT_LOW_90,Items.SPEEDLIMIT_LOW_95,Items.SPEEDLIMIT_LOW_100,Items.SPEEDLIMIT_LOW_105,Items.SPEEDLIMIT_LOW_110,Items.SPEEDLIMIT_LOW_115,Items.SPEEDLIMIT_LOW_120,Items.SPEEDLIMIT_LOW_125,Items.SPEEDLIMIT_LOW_130,Items.SPEEDLIMIT_LOW_135,Items.SPEEDLIMIT_LOW_140,Items.SPEEDLIMIT_LOW_145,Items.SPEEDLIMIT_LOW_150,Items.SPEEDLIMIT_LOW_SPECIAL};
		LIFT_SPEEDLIMIT_HIGH_ITEMS=new Item[]{Items.LIFT_SPEEDLIMIT_HIGH_3,Items.LIFT_SPEEDLIMIT_HIGH_5,Items.LIFT_SPEEDLIMIT_HIGH_10,Items.LIFT_SPEEDLIMIT_HIGH_15,Items.LIFT_SPEEDLIMIT_HIGH_20,Items.LIFT_SPEEDLIMIT_HIGH_25,Items.LIFT_SPEEDLIMIT_HIGH_30,Items.LIFT_SPEEDLIMIT_HIGH_35,Items.LIFT_SPEEDLIMIT_HIGH_40,Items.LIFT_SPEEDLIMIT_HIGH_45,Items.LIFT_SPEEDLIMIT_HIGH_50,Items.LIFT_SPEEDLIMIT_HIGH_55,Items.LIFT_SPEEDLIMIT_HIGH_60,Items.LIFT_SPEEDLIMIT_HIGH_65,Items.LIFT_SPEEDLIMIT_HIGH_70,Items.LIFT_SPEEDLIMIT_HIGH_75,Items.LIFT_SPEEDLIMIT_HIGH_80,Items.LIFT_SPEEDLIMIT_HIGH_85,Items.LIFT_SPEEDLIMIT_HIGH_90,Items.LIFT_SPEEDLIMIT_HIGH_95,Items.LIFT_SPEEDLIMIT_HIGH_100,Items.LIFT_SPEEDLIMIT_HIGH_105,Items.LIFT_SPEEDLIMIT_HIGH_110,Items.LIFT_SPEEDLIMIT_HIGH_115,Items.LIFT_SPEEDLIMIT_HIGH_120,Items.LIFT_SPEEDLIMIT_HIGH_125,Items.LIFT_SPEEDLIMIT_HIGH_130,Items.LIFT_SPEEDLIMIT_HIGH_135,Items.LIFT_SPEEDLIMIT_HIGH_140,Items.LIFT_SPEEDLIMIT_HIGH_145,Items.LIFT_SPEEDLIMIT_HIGH_150,Items.LIFT_SPEEDLIMIT_HIGH_SPECIAL};
		HEIGHTLIMIT_ITEMS=new Item[]{Items.HEIGHTLIMIT_SPECIAL,Items.HEIGHTLIMIT_0D1,Items.HEIGHTLIMIT_0D2,Items.HEIGHTLIMIT_0D3,Items.HEIGHTLIMIT_0D4,Items.HEIGHTLIMIT_0D5,Items.HEIGHTLIMIT_0D6,Items.HEIGHTLIMIT_0D7,Items.HEIGHTLIMIT_0D8,Items.HEIGHTLIMIT_0D9,Items.HEIGHTLIMIT_1,Items.HEIGHTLIMIT_1D1,Items.HEIGHTLIMIT_1D2,Items.HEIGHTLIMIT_1D3,Items.HEIGHTLIMIT_1D4,Items.HEIGHTLIMIT_1D5,Items.HEIGHTLIMIT_1D6,Items.HEIGHTLIMIT_1D7,Items.HEIGHTLIMIT_1D8,Items.HEIGHTLIMIT_1D9,Items.HEIGHTLIMIT_2,Items.HEIGHTLIMIT_2D1,Items.HEIGHTLIMIT_2D2,Items.HEIGHTLIMIT_2D3,Items.HEIGHTLIMIT_2D4,Items.HEIGHTLIMIT_2D5,Items.HEIGHTLIMIT_2D6,Items.HEIGHTLIMIT_2D7,Items.HEIGHTLIMIT_2D8,Items.HEIGHTLIMIT_2D9,Items.HEIGHTLIMIT_3,Items.HEIGHTLIMIT_3D1,Items.HEIGHTLIMIT_3D2,Items.HEIGHTLIMIT_3D3,Items.HEIGHTLIMIT_3D4,Items.HEIGHTLIMIT_3D5,Items.HEIGHTLIMIT_3D6,Items.HEIGHTLIMIT_3D7,Items.HEIGHTLIMIT_3D8,Items.HEIGHTLIMIT_3D9,Items.HEIGHTLIMIT_4,Items.HEIGHTLIMIT_4D1,Items.HEIGHTLIMIT_4D2,Items.HEIGHTLIMIT_4D3,Items.HEIGHTLIMIT_4D4,Items.HEIGHTLIMIT_4D5,Items.HEIGHTLIMIT_4D6,Items.HEIGHTLIMIT_4D7,Items.HEIGHTLIMIT_4D8,Items.HEIGHTLIMIT_4D9,Items.HEIGHTLIMIT_5,Items.HEIGHTLIMIT_5D1,Items.HEIGHTLIMIT_5D2,Items.HEIGHTLIMIT_5D3,Items.HEIGHTLIMIT_5D4,Items.HEIGHTLIMIT_5D5,Items.HEIGHTLIMIT_5D6,Items.HEIGHTLIMIT_5D7,Items.HEIGHTLIMIT_5D8,Items.HEIGHTLIMIT_5D9,Items.HEIGHTLIMIT_6,Items.HEIGHTLIMIT_6D1,Items.HEIGHTLIMIT_6D2,Items.HEIGHTLIMIT_6D3,Items.HEIGHTLIMIT_6D4,Items.HEIGHTLIMIT_6D5,Items.HEIGHTLIMIT_6D6,Items.HEIGHTLIMIT_6D7,Items.HEIGHTLIMIT_6D8,Items.HEIGHTLIMIT_6D9,Items.HEIGHTLIMIT_7,Items.HEIGHTLIMIT_7D1,Items.HEIGHTLIMIT_7D2,Items.HEIGHTLIMIT_7D3,Items.HEIGHTLIMIT_7D4,Items.HEIGHTLIMIT_7D5,Items.HEIGHTLIMIT_7D6,Items.HEIGHTLIMIT_7D7,Items.HEIGHTLIMIT_7D8,Items.HEIGHTLIMIT_7D9,Items.HEIGHTLIMIT_8,Items.HEIGHTLIMIT_8D1,Items.HEIGHTLIMIT_8D2,Items.HEIGHTLIMIT_8D3,Items.HEIGHTLIMIT_8D4,Items.HEIGHTLIMIT_8D5,Items.HEIGHTLIMIT_8D6,Items.HEIGHTLIMIT_8D7,Items.HEIGHTLIMIT_8D8,Items.HEIGHTLIMIT_8D9,Items.HEIGHTLIMIT_9,Items.HEIGHTLIMIT_9D1,Items.HEIGHTLIMIT_9D2,Items.HEIGHTLIMIT_9D3,Items.HEIGHTLIMIT_9D4,Items.HEIGHTLIMIT_9D5,Items.HEIGHTLIMIT_9D6,Items.HEIGHTLIMIT_9D7,Items.HEIGHTLIMIT_9D8,Items.HEIGHTLIMIT_9D9,Items.HEIGHTLIMIT_10};
		PROHIBITION_ITEMS=new Item[]{Items.PROHIBITION,Items.NO_U_TURN,Items.NO_LEFT_TURN,Items.NO_RIGHT_TURN,Items.NO_PARKING};
		HIGHWAY_HM_ITEMS=new Item[]{Items.HIGHWAY_1HM,Items.HIGHWAY_2HM,Items.HIGHWAY_3HM,Items.HIGHWAY_4HM,Items.HIGHWAY_5HM,Items.HIGHWAY_6HM,Items.HIGHWAY_7HM,Items.HIGHWAY_8HM,Items.HIGHWAY_9HM};
		ITEM_GROUP=FabricItemGroup.builder()
	 .icon(()->new ItemStack(Items.SPEEDLIMIT_HIGH_120))
	 .displayName(Text.literal("CNTrafficSymbols"))
	 .entries((c,e)->{
	 	for(Item i:SPEEDLIMIT_HIGH_ITEMS){e.add(i);}
	 	for(Item i:SPEEDLIMIT_LOW_ITEMS){e.add(i);}
			for(Item i:LIFT_SPEEDLIMIT_HIGH_ITEMS){e.add(i);}
	 	e.add(Items.IRON_PLATE);
			e.add(Items.CIRCLE_BACKBOARD);
			for(Item i:HEIGHTLIMIT_ITEMS){e.add(i);}
			for(Item i:PROHIBITION_ITEMS){e.add(i);}
			for(Item i:HIGHWAY_HM_ITEMS){e.add(i);}
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
	 })
	 .build();
	}
	public static void doit(){
		for(int i=1;i<31;i++){
			Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_"+Integer.toString(i*5)),SPEEDLIMIT_HIGH_BLOCKS[i]);
			Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_"+Integer.toString(i*5)),SPEEDLIMIT_LOW_BLOCKS[i]);
			Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_"+Integer.toString(i*5)),LIFT_SPEEDLIMIT_HIGH_BLOCKS[i]);
			Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_"+Integer.toString(i*5)),SPEEDLIMIT_HIGH_ITEMS[i]);
			Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_"+Integer.toString(i*5)),SPEEDLIMIT_LOW_ITEMS[i]);
			Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_"+Integer.toString(i*5)),LIFT_SPEEDLIMIT_HIGH_ITEMS[i]);
		}
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_3"),Blocks.SPEEDLIMIT_HIGH_3);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_3"),Blocks.SPEEDLIMIT_LOW_3);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_special"),Blocks.SPEEDLIMIT_HIGH_SPECIAL);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_special"),Blocks.SPEEDLIMIT_LOW_SPECIAL);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_3"),Blocks.LIFT_SPEEDLIMIT_HIGH_3);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_special"),Blocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/circle_backboard"),Blocks.CIRCLE_BACKBOARD);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/heightlimit_special"),Blocks.HEIGHTLIMIT_SPECIAL);
		for(int i=1;i<101;i++){
			Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/heightlimit_"+((i%10!=0)?Integer.toString(i/10)+"d"+Integer.toString(i%10):Integer.toString(i/10))),HEIGHTLIMIT_BLOCKS[i]);
			Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/heightlimit_"+((i%10!=0)?Integer.toString(i/10)+"d"+Integer.toString(i%10):Integer.toString(i/10))),HEIGHTLIMIT_ITEMS[i]);
		}
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/prohibition"),Blocks.PROHIBITION);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/no_u_turn"),Blocks.NO_U_TURN);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/no_left_turn"),Blocks.NO_LEFT_TURN);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/no_right_turn"),Blocks.NO_RIGHT_TURN);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/no_parking"),Blocks.NO_PARKING);
		for(int i=0;i<9;i++){
			Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/highway_"+Integer.toString(i+1)+"hm"),HIGHWAY_HM_BLOCKS[i]);
			Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/highway_"+Integer.toString(i+1)+"hm"),HIGHWAY_HM_ITEMS[i]);
		}
		Blocks.FLOOR_LINE_EIGHTHS.setItm1(Items.WHITE_FLOOR_LINE_EIGHTH);
		Blocks.FLOOR_LINE_EIGHTHS.setItm2(Items.YELLOW_FLOOR_LINE_EIGHTH);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/floor_line_eighths"),Blocks.FLOOR_LINE_EIGHTHS);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/highway_km"),Blocks.HIGHWAY_KM);
		Blocks.DISTANCE_DETECTION_0M_LEFT.addToArr(Blocks.DISTANCE_DETECTION_0M_LEFT);
		Blocks.DISTANCE_DETECTION_0M_LEFT.addToArr(Blocks.DISTANCE_DETECTION_0M_RIGHT);
		Blocks.DISTANCE_DETECTION_0M_LEFT.freezeArr();
		Blocks.DISTANCE_DETECTION_0M_RIGHT.freezeArr();
		Blocks.DISTANCE_DETECTION_50M_LEFT.addToArr(Blocks.DISTANCE_DETECTION_50M_LEFT);
		Blocks.DISTANCE_DETECTION_50M_LEFT.addToArr(Blocks.DISTANCE_DETECTION_50M_RIGHT);
		Blocks.DISTANCE_DETECTION_50M_LEFT.freezeArr();
		Blocks.DISTANCE_DETECTION_50M_RIGHT.freezeArr();
		Blocks.DISTANCE_DETECTION_100M_LEFT.addToArr(Blocks.DISTANCE_DETECTION_100M_LEFT);
		Blocks.DISTANCE_DETECTION_100M_LEFT.addToArr(Blocks.DISTANCE_DETECTION_100M_RIGHT);
		Blocks.DISTANCE_DETECTION_100M_LEFT.freezeArr();
		Blocks.DISTANCE_DETECTION_100M_RIGHT.freezeArr();
		Blocks.DISTANCE_DETECTION_200M_LEFT.addToArr(Blocks.DISTANCE_DETECTION_200M_LEFT);
		Blocks.DISTANCE_DETECTION_200M_LEFT.addToArr(Blocks.DISTANCE_DETECTION_200M_RIGHT);
		Blocks.DISTANCE_DETECTION_200M_LEFT.freezeArr();
		Blocks.DISTANCE_DETECTION_200M_RIGHT.freezeArr();
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/distance_detection_0m_left"),Blocks.DISTANCE_DETECTION_0M_LEFT);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/distance_detection_0m_right"),Blocks.DISTANCE_DETECTION_0M_RIGHT);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/distance_detection_50m_left"),Blocks.DISTANCE_DETECTION_50M_LEFT);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/distance_detection_50m_right"),Blocks.DISTANCE_DETECTION_50M_RIGHT);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/distance_detection_100m_left"),Blocks.DISTANCE_DETECTION_100M_LEFT);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/distance_detection_100m_right"),Blocks.DISTANCE_DETECTION_100M_RIGHT);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/distance_detection_200m_left"),Blocks.DISTANCE_DETECTION_200M_LEFT);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/distance_detection_200m_right"),Blocks.DISTANCE_DETECTION_200M_RIGHT);
		Registry.register(Registries.BLOCK_ENTITY_TYPE,new Identifier("regedt32","cntrafficsymbols/highway_hm"),rege.pegui.cntrafficsymbols.be.HighwayHmSignBlockEntity.TYPE);
		Registry.register(Registries.BLOCK_ENTITY_TYPE,new Identifier("regedt32","cntrafficsymbols/highway_km"),rege.pegui.cntrafficsymbols.be.HighwayKmSignBlockEntity.TYPE);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_3"),Items.SPEEDLIMIT_HIGH_3);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_3"),Items.SPEEDLIMIT_LOW_3);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_special"),Items.SPEEDLIMIT_HIGH_SPECIAL);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_special"),Items.SPEEDLIMIT_LOW_SPECIAL);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_3"),Items.LIFT_SPEEDLIMIT_HIGH_3);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_special"),Items.LIFT_SPEEDLIMIT_HIGH_SPECIAL);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/iron_plate"),Items.IRON_PLATE);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/circle_backboard"),Items.CIRCLE_BACKBOARD);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/heightlimit_special"),Items.HEIGHTLIMIT_SPECIAL);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/prohibition"),Items.PROHIBITION);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/no_u_turn"),Items.NO_U_TURN);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/no_left_turn"),Items.NO_LEFT_TURN);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/no_right_turn"),Items.NO_RIGHT_TURN);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/no_parking"),Items.NO_PARKING);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/white_floor_line_eighth"),Items.WHITE_FLOOR_LINE_EIGHTH);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/yellow_floor_line_eighth"),Items.YELLOW_FLOOR_LINE_EIGHTH);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/highway_km"),Items.HIGHWAY_KM);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/distance_detection_0m_left"),Items.DISTANCE_DETECTION_0M_LEFT);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/distance_detection_0m_right"),Items.DISTANCE_DETECTION_0M_RIGHT);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/distance_detection_50m_left"),Items.DISTANCE_DETECTION_50M_LEFT);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/distance_detection_50m_right"),Items.DISTANCE_DETECTION_50M_RIGHT);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/distance_detection_100m_left"),Items.DISTANCE_DETECTION_100M_LEFT);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/distance_detection_100m_right"),Items.DISTANCE_DETECTION_100M_RIGHT);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/distance_detection_200m_left"),Items.DISTANCE_DETECTION_200M_LEFT);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/distance_detection_200m_right"),Items.DISTANCE_DETECTION_200M_RIGHT);
		Registry.register(Registries.ITEM_GROUP,new Identifier("regedt32","cntrafficsymbols"),ITEM_GROUP);
		try{
			Block[]tab={Blocks.SPEEDLIMIT_HIGH_3,Blocks.SPEEDLIMIT_HIGH_5,Blocks.SPEEDLIMIT_HIGH_10,Blocks.SPEEDLIMIT_HIGH_15,Blocks.SPEEDLIMIT_HIGH_20,Blocks.SPEEDLIMIT_HIGH_25,Blocks.SPEEDLIMIT_HIGH_30,Blocks.SPEEDLIMIT_HIGH_35,Blocks.SPEEDLIMIT_HIGH_40,Blocks.SPEEDLIMIT_HIGH_45,Blocks.SPEEDLIMIT_HIGH_50,Blocks.SPEEDLIMIT_HIGH_55,Blocks.SPEEDLIMIT_HIGH_60,Blocks.SPEEDLIMIT_HIGH_65,Blocks.SPEEDLIMIT_HIGH_70,Blocks.SPEEDLIMIT_HIGH_75,Blocks.SPEEDLIMIT_HIGH_80,Blocks.SPEEDLIMIT_HIGH_85,Blocks.SPEEDLIMIT_HIGH_90,Blocks.SPEEDLIMIT_HIGH_95,Blocks.SPEEDLIMIT_HIGH_100,Blocks.SPEEDLIMIT_HIGH_105,Blocks.SPEEDLIMIT_HIGH_110,Blocks.SPEEDLIMIT_HIGH_115,Blocks.SPEEDLIMIT_HIGH_120,Blocks.SPEEDLIMIT_HIGH_125,Blocks.SPEEDLIMIT_HIGH_130,Blocks.SPEEDLIMIT_HIGH_135,Blocks.SPEEDLIMIT_HIGH_140,Blocks.SPEEDLIMIT_HIGH_145,Blocks.SPEEDLIMIT_HIGH_150,Blocks.SPEEDLIMIT_HIGH_SPECIAL,Blocks.SPEEDLIMIT_LOW_3,Blocks.SPEEDLIMIT_LOW_5,Blocks.SPEEDLIMIT_LOW_10,Blocks.SPEEDLIMIT_LOW_15,Blocks.SPEEDLIMIT_LOW_20,Blocks.SPEEDLIMIT_LOW_25,Blocks.SPEEDLIMIT_LOW_30,Blocks.SPEEDLIMIT_LOW_35,Blocks.SPEEDLIMIT_LOW_40,Blocks.SPEEDLIMIT_LOW_45,Blocks.SPEEDLIMIT_LOW_50,Blocks.SPEEDLIMIT_LOW_55,Blocks.SPEEDLIMIT_LOW_60,Blocks.SPEEDLIMIT_LOW_65,Blocks.SPEEDLIMIT_LOW_70,Blocks.SPEEDLIMIT_LOW_75,Blocks.SPEEDLIMIT_LOW_80,Blocks.SPEEDLIMIT_LOW_85,Blocks.SPEEDLIMIT_LOW_90,Blocks.SPEEDLIMIT_LOW_95,Blocks.SPEEDLIMIT_LOW_100,Blocks.SPEEDLIMIT_LOW_105,Blocks.SPEEDLIMIT_LOW_110,Blocks.SPEEDLIMIT_LOW_115,Blocks.SPEEDLIMIT_LOW_120,Blocks.SPEEDLIMIT_LOW_125,Blocks.SPEEDLIMIT_LOW_130,Blocks.SPEEDLIMIT_LOW_135,Blocks.SPEEDLIMIT_LOW_140,Blocks.SPEEDLIMIT_LOW_145,Blocks.SPEEDLIMIT_LOW_150,Blocks.SPEEDLIMIT_LOW_SPECIAL};
			int d=0;
			for(Attachment3 i:new Attachment3[]{Attachment3.NONE,Attachment3.DOWN,Attachment3.UP}){
				for(DoubleFaceFacing j:new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH,DoubleFaceFacing.SSW,DoubleFaceFacing.SOUTHWEST,DoubleFaceFacing.WSW,DoubleFaceFacing.WEST,DoubleFaceFacing.WNW,DoubleFaceFacing.NORTHWEST,DoubleFaceFacing.NNW,DoubleFaceFacing.NORTH,DoubleFaceFacing.NNE,DoubleFaceFacing.NORTHEAST,DoubleFaceFacing.ENE,DoubleFaceFacing.EAST,DoubleFaceFacing.ESE,DoubleFaceFacing.SOUTHEAST,DoubleFaceFacing.SSE,DoubleFaceFacing.NORTH_SOUTH,DoubleFaceFacing.NNE_SSW,DoubleFaceFacing.NORTHEAST_SOUTHWEST,DoubleFaceFacing.ENE_WSW,DoubleFaceFacing.EAST_WEST,DoubleFaceFacing.ESE_WNW,DoubleFaceFacing.NORTHWEST_SOUTHEAST,DoubleFaceFacing.SSE_NNW,DoubleFaceFacing.WALL_SOUTH,DoubleFaceFacing.WALL_EAST,DoubleFaceFacing.WALL_NORTH,DoubleFaceFacing.WALL_WEST}){
					for(Block k:tab){
						BlockState st=k.getDefaultState().with(Attachment3.ATTACHMENT,i)
						.with(DoubleFaceFacing.FACING,j);
						BlockNumberIDRegistry.INSTANCE.register(12200,d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE
						.register(k.getRegistryEntry().registryKey().getValue(),
						new BlockProperties().mergeFromBlockState(st),12200,d);
						st=st.with(WATERLOGGED,true);
						BlockNumberIDRegistry.INSTANCE.register(12200,~d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE
						.register(k.getRegistryEntry().registryKey().getValue(),
						new BlockProperties().mergeFromBlockState(st),12200,~d);
						d++;
					}
				}
				d+=256;
			}
			tab=LIFT_SPEEDLIMIT_HIGH_BLOCKS;
			d=0;
			for(Attachment3 i:new Attachment3[]{Attachment3.NONE,Attachment3.DOWN,Attachment3.UP}){
				for(DoubleFaceFacing j:new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH,DoubleFaceFacing.SSW,DoubleFaceFacing.SOUTHWEST,DoubleFaceFacing.WSW,DoubleFaceFacing.WEST,DoubleFaceFacing.WNW,DoubleFaceFacing.NORTHWEST,DoubleFaceFacing.NNW,DoubleFaceFacing.NORTH,DoubleFaceFacing.NNE,DoubleFaceFacing.NORTHEAST,DoubleFaceFacing.ENE,DoubleFaceFacing.EAST,DoubleFaceFacing.ESE,DoubleFaceFacing.SOUTHEAST,DoubleFaceFacing.SSE,DoubleFaceFacing.NORTH_SOUTH,DoubleFaceFacing.NNE_SSW,DoubleFaceFacing.NORTHEAST_SOUTHWEST,DoubleFaceFacing.ENE_WSW,DoubleFaceFacing.EAST_WEST,DoubleFaceFacing.ESE_WNW,DoubleFaceFacing.NORTHWEST_SOUTHEAST,DoubleFaceFacing.SSE_NNW,DoubleFaceFacing.WALL_SOUTH,DoubleFaceFacing.WALL_EAST,DoubleFaceFacing.WALL_NORTH,DoubleFaceFacing.WALL_WEST}){
					for(Block k:tab){
						BlockState st=k.getDefaultState().with(Attachment3.ATTACHMENT,i)
						.with(DoubleFaceFacing.FACING,j);
						BlockNumberIDRegistry.INSTANCE.register(12201,d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE
						.register(k.getRegistryEntry().registryKey().getValue(),
						new BlockProperties().mergeFromBlockState(st),12201,d);
						st=st.with(WATERLOGGED,true);
						BlockNumberIDRegistry.INSTANCE.register(12201,~d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE
						.register(k.getRegistryEntry().registryKey().getValue(),
						new BlockProperties().mergeFromBlockState(st),12201,~d);
						d++;
					}
					d+=32;
				}
				d+=256;
			}
			d=0;
			for(Attachment3 i:new Attachment3[]{Attachment3.NONE,Attachment3.DOWN,Attachment3.UP}){
				for(DoubleFaceFacing j:new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH,DoubleFaceFacing.SSW,DoubleFaceFacing.SOUTHWEST,DoubleFaceFacing.WSW,DoubleFaceFacing.WEST,DoubleFaceFacing.WNW,DoubleFaceFacing.NORTHWEST,DoubleFaceFacing.NNW,DoubleFaceFacing.NORTH,DoubleFaceFacing.NNE,DoubleFaceFacing.NORTHEAST,DoubleFaceFacing.ENE,DoubleFaceFacing.EAST,DoubleFaceFacing.ESE,DoubleFaceFacing.SOUTHEAST,DoubleFaceFacing.SSE,DoubleFaceFacing.NORTH_SOUTH,DoubleFaceFacing.NNE_SSW,DoubleFaceFacing.NORTHEAST_SOUTHWEST,DoubleFaceFacing.ENE_WSW,DoubleFaceFacing.EAST_WEST,DoubleFaceFacing.ESE_WNW,DoubleFaceFacing.NORTHWEST_SOUTHEAST,DoubleFaceFacing.SSE_NNW,DoubleFaceFacing.WALL_SOUTH,DoubleFaceFacing.WALL_EAST,DoubleFaceFacing.WALL_NORTH,DoubleFaceFacing.WALL_WEST}){
					BlockState st=Blocks.CIRCLE_BACKBOARD.getDefaultState()
					.with(Attachment3.ATTACHMENT,i).with(DoubleFaceFacing.FACING,j);
					BlockNumberIDRegistry.INSTANCE.register(12203,d,st);
					BlockNumberIDRecognitionRegistry.INSTANCE
					.register(Blocks.CIRCLE_BACKBOARD.getRegistryEntry().registryKey()
					.getValue(),new BlockProperties().mergeFromBlockState(st),12201,d);
					st=st.with(WATERLOGGED,true);
					BlockNumberIDRegistry.INSTANCE.register(12203,~d,st);
					BlockNumberIDRecognitionRegistry.INSTANCE
					.register(Blocks.CIRCLE_BACKBOARD.getRegistryEntry().registryKey()
					.getValue(),new BlockProperties().mergeFromBlockState(st),12201,~d);
					d++;
				}
				d+=4;
			}
			tab=HEIGHTLIMIT_BLOCKS;
			d=0;
			for(Attachment3 i:new Attachment3[]{Attachment3.NONE,Attachment3.DOWN,Attachment3.UP}){
				for(DoubleFaceFacing j:new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH,DoubleFaceFacing.SSW,DoubleFaceFacing.SOUTHWEST,DoubleFaceFacing.WSW,DoubleFaceFacing.WEST,DoubleFaceFacing.WNW,DoubleFaceFacing.NORTHWEST,DoubleFaceFacing.NNW,DoubleFaceFacing.NORTH,DoubleFaceFacing.NNE,DoubleFaceFacing.NORTHEAST,DoubleFaceFacing.ENE,DoubleFaceFacing.EAST,DoubleFaceFacing.ESE,DoubleFaceFacing.SOUTHEAST,DoubleFaceFacing.SSE,DoubleFaceFacing.NORTH_SOUTH,DoubleFaceFacing.NNE_SSW,DoubleFaceFacing.NORTHEAST_SOUTHWEST,DoubleFaceFacing.ENE_WSW,DoubleFaceFacing.EAST_WEST,DoubleFaceFacing.ESE_WNW,DoubleFaceFacing.NORTHWEST_SOUTHEAST,DoubleFaceFacing.SSE_NNW,DoubleFaceFacing.WALL_SOUTH,DoubleFaceFacing.WALL_EAST,DoubleFaceFacing.WALL_NORTH,DoubleFaceFacing.WALL_WEST}){
					for(Block k:tab){
						BlockState st=k.getDefaultState().with(Attachment3.ATTACHMENT,i)
						.with(DoubleFaceFacing.FACING,j);
						BlockNumberIDRegistry.INSTANCE.register(12204,d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE
						.register(k.getRegistryEntry().registryKey().getValue(),
						new BlockProperties().mergeFromBlockState(st),12204,d);
						st=st.with(WATERLOGGED,true);
						BlockNumberIDRegistry.INSTANCE.register(12204,~d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE
						.register(k.getRegistryEntry().registryKey().getValue(),
						new BlockProperties().mergeFromBlockState(st),12204,~d);
						d++;
					}
					d+=27;
				}
				d+=512;
			}
			tab=PROHIBITION_BLOCKS;
			d=0;
			for(Attachment3 i:new Attachment3[]{Attachment3.NONE,Attachment3.DOWN,Attachment3.UP}){
				for(DoubleFaceFacing j:new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH,DoubleFaceFacing.SSW,DoubleFaceFacing.SOUTHWEST,DoubleFaceFacing.WSW,DoubleFaceFacing.WEST,DoubleFaceFacing.WNW,DoubleFaceFacing.NORTHWEST,DoubleFaceFacing.NNW,DoubleFaceFacing.NORTH,DoubleFaceFacing.NNE,DoubleFaceFacing.NORTHEAST,DoubleFaceFacing.ENE,DoubleFaceFacing.EAST,DoubleFaceFacing.ESE,DoubleFaceFacing.SOUTHEAST,DoubleFaceFacing.SSE,DoubleFaceFacing.NORTH_SOUTH,DoubleFaceFacing.NNE_SSW,DoubleFaceFacing.NORTHEAST_SOUTHWEST,DoubleFaceFacing.ENE_WSW,DoubleFaceFacing.EAST_WEST,DoubleFaceFacing.ESE_WNW,DoubleFaceFacing.NORTHWEST_SOUTHEAST,DoubleFaceFacing.SSE_NNW,DoubleFaceFacing.WALL_SOUTH,DoubleFaceFacing.WALL_EAST,DoubleFaceFacing.WALL_NORTH,DoubleFaceFacing.WALL_WEST}){
					for(Block k:tab){
						BlockState st=k.getDefaultState().with(Attachment3.ATTACHMENT,i)
						.with(DoubleFaceFacing.FACING,j);
						BlockNumberIDRegistry.INSTANCE.register(12205,d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE
						.register(k.getRegistryEntry().registryKey().getValue(),
						new BlockProperties().mergeFromBlockState(st),12205,d);
						st=st.with(WATERLOGGED,true);
						BlockNumberIDRegistry.INSTANCE.register(12205,~d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE
						.register(k.getRegistryEntry().registryKey().getValue(),
						new BlockProperties().mergeFromBlockState(st),12205,~d);
						d++;
					}
					d+=128-tab.length;
				}
				d+=512;
			}
			tab=HIGHWAY_HM_BLOCKS;
			d=0;
			for(Attachment3 i:new Attachment3[]{Attachment3.NONE,Attachment3.DOWN,Attachment3.UP}){
				for(DoubleFaceFacing j:new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH,DoubleFaceFacing.SSW,DoubleFaceFacing.SOUTHWEST,DoubleFaceFacing.WSW,DoubleFaceFacing.WEST,DoubleFaceFacing.WNW,DoubleFaceFacing.NORTHWEST,DoubleFaceFacing.NNW,DoubleFaceFacing.NORTH,DoubleFaceFacing.NNE,DoubleFaceFacing.NORTHEAST,DoubleFaceFacing.ENE,DoubleFaceFacing.EAST,DoubleFaceFacing.ESE,DoubleFaceFacing.SOUTHEAST,DoubleFaceFacing.SSE,DoubleFaceFacing.NORTH_SOUTH,DoubleFaceFacing.NNE_SSW,DoubleFaceFacing.NORTHEAST_SOUTHWEST,DoubleFaceFacing.ENE_WSW,DoubleFaceFacing.EAST_WEST,DoubleFaceFacing.ESE_WNW,DoubleFaceFacing.NORTHWEST_SOUTHEAST,DoubleFaceFacing.SSE_NNW,DoubleFaceFacing.WALL_SOUTH,DoubleFaceFacing.WALL_EAST,DoubleFaceFacing.WALL_NORTH,DoubleFaceFacing.WALL_WEST}){
					for(Block k:tab){
						BlockState st=k.getDefaultState().with(Attachment3.ATTACHMENT,i)
						.with(DoubleFaceFacing.FACING,j);
						BlockNumberIDRegistry.INSTANCE.register(12206,d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE
						.register(k.getRegistryEntry().registryKey().getValue(),
						new BlockProperties().mergeFromBlockState(st),12206,d);
						st=st.with(WATERLOGGED,true);
						BlockNumberIDRegistry.INSTANCE.register(12206,~d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE
						.register(k.getRegistryEntry().registryKey().getValue(),
						new BlockProperties().mergeFromBlockState(st),12206,~d);
						d++;
					}
					d+=16-tab.length;
				}
				d+=64;
			}
			BlockNumberIDRegistry.INSTANCE.register(12207,0,AIR.getDefaultState());
			BlockNumberIDRegistry.INSTANCE.register(12207,8192,AIR.getDefaultState());
			BlockNumberIDRegistry.INSTANCE.register(12207,-1,WATER.getDefaultState());
			BlockNumberIDRegistry.INSTANCE
			.register(12207,-8193,WATER.getDefaultState());
			for(d=1;d<6561;d++){
				BlockState st=FloorLineEighthBlock
				.from3Pow(Blocks.FLOOR_LINE_EIGHTHS.getDefaultState(),d);
				BlockNumberIDRegistry.INSTANCE.register(12207,d,st);
				BlockNumberIDRecognitionRegistry.INSTANCE
				.register(Blocks.FLOOR_LINE_EIGHTHS.getRegistryEntry().registryKey()
				.getValue(),new BlockProperties().mergeFromBlockState(st),12207,d);
				st=st.with(WATERLOGGED,true);
				BlockNumberIDRegistry.INSTANCE.register(12207,~d,st);
				BlockNumberIDRecognitionRegistry.INSTANCE
				.register(Blocks.FLOOR_LINE_EIGHTHS.getRegistryEntry().registryKey()
				.getValue(),new BlockProperties().mergeFromBlockState(st),12207,~d);
				st=st.with(net.minecraft.state.property.Properties.HORIZONTAL_AXIS,
				net.minecraft.util.math.Direction.Axis.Z);
				BlockNumberIDRegistry.INSTANCE.register(12207,~(d|8192),st);
				BlockNumberIDRecognitionRegistry.INSTANCE
				.register(Blocks.FLOOR_LINE_EIGHTHS.getRegistryEntry().registryKey()
				.getValue(),new BlockProperties().mergeFromBlockState(st),12207,~(d|8192));
				st=st.with(WATERLOGGED,false);
				BlockNumberIDRegistry.INSTANCE.register(12207,d|8192,st);
				BlockNumberIDRecognitionRegistry.INSTANCE
				.register(Blocks.FLOOR_LINE_EIGHTHS.getRegistryEntry().registryKey()
				.getValue(),new BlockProperties().mergeFromBlockState(st),12207,d|8192);
			}
			Item[]tab2={Items.SPEEDLIMIT_HIGH_3,Items.SPEEDLIMIT_HIGH_5,Items.SPEEDLIMIT_HIGH_10,Items.SPEEDLIMIT_HIGH_15,Items.SPEEDLIMIT_HIGH_20,Items.SPEEDLIMIT_HIGH_25,Items.SPEEDLIMIT_HIGH_30,Items.SPEEDLIMIT_HIGH_35,Items.SPEEDLIMIT_HIGH_40,Items.SPEEDLIMIT_HIGH_45,Items.SPEEDLIMIT_HIGH_50,Items.SPEEDLIMIT_HIGH_55,Items.SPEEDLIMIT_HIGH_60,Items.SPEEDLIMIT_HIGH_65,Items.SPEEDLIMIT_HIGH_70,Items.SPEEDLIMIT_HIGH_75,Items.SPEEDLIMIT_HIGH_80,Items.SPEEDLIMIT_HIGH_85,Items.SPEEDLIMIT_HIGH_90,Items.SPEEDLIMIT_HIGH_95,Items.SPEEDLIMIT_HIGH_100,Items.SPEEDLIMIT_HIGH_105,Items.SPEEDLIMIT_HIGH_110,Items.SPEEDLIMIT_HIGH_115,Items.SPEEDLIMIT_HIGH_120,Items.SPEEDLIMIT_HIGH_125,Items.SPEEDLIMIT_HIGH_130,Items.SPEEDLIMIT_HIGH_135,Items.SPEEDLIMIT_HIGH_140,Items.SPEEDLIMIT_HIGH_145,Items.SPEEDLIMIT_HIGH_150,Items.SPEEDLIMIT_HIGH_SPECIAL,Items.SPEEDLIMIT_LOW_3,Items.SPEEDLIMIT_LOW_5,Items.SPEEDLIMIT_LOW_10,Items.SPEEDLIMIT_LOW_15,Items.SPEEDLIMIT_LOW_20,Items.SPEEDLIMIT_LOW_25,Items.SPEEDLIMIT_LOW_30,Items.SPEEDLIMIT_LOW_35,Items.SPEEDLIMIT_LOW_40,Items.SPEEDLIMIT_LOW_45,Items.SPEEDLIMIT_LOW_50,Items.SPEEDLIMIT_LOW_55,Items.SPEEDLIMIT_LOW_60,Items.SPEEDLIMIT_LOW_65,Items.SPEEDLIMIT_LOW_70,Items.SPEEDLIMIT_LOW_75,Items.SPEEDLIMIT_LOW_80,Items.SPEEDLIMIT_LOW_85,Items.SPEEDLIMIT_LOW_90,Items.SPEEDLIMIT_LOW_95,Items.SPEEDLIMIT_LOW_100,Items.SPEEDLIMIT_LOW_105,Items.SPEEDLIMIT_LOW_110,Items.SPEEDLIMIT_LOW_115,Items.SPEEDLIMIT_LOW_120,Items.SPEEDLIMIT_LOW_125,Items.SPEEDLIMIT_LOW_130,Items.SPEEDLIMIT_LOW_135,Items.SPEEDLIMIT_LOW_140,Items.SPEEDLIMIT_LOW_145,Items.SPEEDLIMIT_LOW_150,Items.SPEEDLIMIT_LOW_SPECIAL};
			d=0;
			for(Item i:tab2){
				ItemNumberIDRegistry.INSTANCE.register(12200,d,i);
				d++;
			}
			tab2=LIFT_SPEEDLIMIT_HIGH_ITEMS;
			d=0;
			for(Item i:tab2){
				ItemNumberIDRegistry.INSTANCE.register(12201,d,i);
				d++;
			}
			ItemNumberIDRegistry.INSTANCE.register(12202,0,Items.IRON_PLATE);
			ItemNumberIDRegistry.INSTANCE.register(12203,0,Items.CIRCLE_BACKBOARD);
			tab2=HEIGHTLIMIT_ITEMS;
			d=0;
			for(Item i:tab2){
				ItemNumberIDRegistry.INSTANCE.register(12204,d,i);
				d++;
			}
			tab2=PROHIBITION_ITEMS;
			d=0;
			for(Item i:tab2){
				ItemNumberIDRegistry.INSTANCE.register(12205,d,i);
				d++;
			}
			tab2=HIGHWAY_HM_ITEMS;
			for(Item i:tab2){
				ItemNumberIDRegistry.INSTANCE.register(12206,d,i);
				d++;
			}
			ItemNumberIDRegistry.INSTANCE
			.register(12207,1,Items.WHITE_FLOOR_LINE_EIGHTH);
			ItemNumberIDRegistry.INSTANCE
			.register(12207,2,Items.YELLOW_FLOOR_LINE_EIGHTH);
		}catch(NoClassDefFoundError e){}
	}
}
