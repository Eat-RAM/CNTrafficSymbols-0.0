package rege.pegui.cntrafficsymbols;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import rege.pegui.cntrafficsymbols.block.CircleStandingSymbolBlock;
import rege.pegui.cntrafficsymbols.struct.Attachment3;
import rege.pegui.cntrafficsymbols.struct.DoubleFaceFacing;
import rege.rege.minecraftmod.number_id_revival.state.BlockProperties;
import rege.rege.minecraftmod.number_id_revival.state.numberid.BlockNumberIDRecognitionRegistry;
import
rege.rege.minecraftmod.number_id_revival.state.numberid.BlockNumberIDRegistry;
import
rege.rege.minecraftmod.number_id_revival.state.numberid.ItemNumberIDRegistry;
public class SelfWork{
	public static class Blocks{
		public static final Block SPEEDLIMIT_HIGH_3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_10=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_10=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_15=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_15=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_20=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_20=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_25=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_25=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_30=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_30=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_35=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_35=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_40=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_40=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_45=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_45=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_50=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_50=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_55=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_55=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_60=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_60=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_65=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_65=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_70=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_70=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_75=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_75=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_80=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_80=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_85=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_85=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_90=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_90=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_95=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_95=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_100=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_100=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_105=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_105=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_110=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_110=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_115=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_115=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_120=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_120=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_125=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_125=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_130=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_130=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_135=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_135=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_140=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_140=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_145=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_145=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_150=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_150=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_HIGH_SPECIAL=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block SPEEDLIMIT_LOW_SPECIAL=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_3=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_5=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_10=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_15=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_20=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_25=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_30=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_35=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_40=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_45=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_50=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_55=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_60=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_65=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_70=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_75=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_80=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_85=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_90=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_95=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_100=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_105=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_110=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_115=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_120=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_125=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_130=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_135=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_140=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_145=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_150=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block LIFT_SPEEDLIMIT_HIGH_SPECIAL=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
		public static final Block CIRCLE_BACKBOARD=
		new CircleStandingSymbolBlock(Block.Settings.create().nonOpaque()
		.strength(12f,36f));
	}
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
	}
	private static final ItemGroup ITEM_GROUP=FabricItemGroup.builder()
	.icon(()->new ItemStack(Items.SPEEDLIMIT_HIGH_120))
	.displayName(Text.literal("CNTrafficSymbols"))
	.entries((c,e)->{
		for(Item i:new Item[]{Items.SPEEDLIMIT_HIGH_3,Items.SPEEDLIMIT_HIGH_5,Items.SPEEDLIMIT_HIGH_10,Items.SPEEDLIMIT_HIGH_15,Items.SPEEDLIMIT_HIGH_20,Items.SPEEDLIMIT_HIGH_25,Items.SPEEDLIMIT_HIGH_30,Items.SPEEDLIMIT_HIGH_35,Items.SPEEDLIMIT_HIGH_40,Items.SPEEDLIMIT_HIGH_45,Items.SPEEDLIMIT_HIGH_50,Items.SPEEDLIMIT_HIGH_55,Items.SPEEDLIMIT_HIGH_60,Items.SPEEDLIMIT_HIGH_65,Items.SPEEDLIMIT_HIGH_70,Items.SPEEDLIMIT_HIGH_75,Items.SPEEDLIMIT_HIGH_80,Items.SPEEDLIMIT_HIGH_85,Items.SPEEDLIMIT_HIGH_90,Items.SPEEDLIMIT_HIGH_95,Items.SPEEDLIMIT_HIGH_100,Items.SPEEDLIMIT_HIGH_105,Items.SPEEDLIMIT_HIGH_110,Items.SPEEDLIMIT_HIGH_115,Items.SPEEDLIMIT_HIGH_120,Items.SPEEDLIMIT_HIGH_125,Items.SPEEDLIMIT_HIGH_130,Items.SPEEDLIMIT_HIGH_135,Items.SPEEDLIMIT_HIGH_140,Items.SPEEDLIMIT_HIGH_145,Items.SPEEDLIMIT_HIGH_150,Items.SPEEDLIMIT_HIGH_SPECIAL,Items.SPEEDLIMIT_LOW_3,Items.SPEEDLIMIT_LOW_5,Items.SPEEDLIMIT_LOW_10,Items.SPEEDLIMIT_LOW_15,Items.SPEEDLIMIT_LOW_20,Items.SPEEDLIMIT_LOW_25,Items.SPEEDLIMIT_LOW_30,Items.SPEEDLIMIT_LOW_35,Items.SPEEDLIMIT_LOW_40,Items.SPEEDLIMIT_LOW_45,Items.SPEEDLIMIT_LOW_50,Items.SPEEDLIMIT_LOW_55,Items.SPEEDLIMIT_LOW_60,Items.SPEEDLIMIT_LOW_65,Items.SPEEDLIMIT_LOW_70,Items.SPEEDLIMIT_LOW_75,Items.SPEEDLIMIT_LOW_80,Items.SPEEDLIMIT_LOW_85,Items.SPEEDLIMIT_LOW_90,Items.SPEEDLIMIT_LOW_95,Items.SPEEDLIMIT_LOW_100,Items.SPEEDLIMIT_LOW_105,Items.SPEEDLIMIT_LOW_110,Items.SPEEDLIMIT_LOW_115,Items.SPEEDLIMIT_LOW_120,Items.SPEEDLIMIT_LOW_125,Items.SPEEDLIMIT_LOW_130,Items.SPEEDLIMIT_LOW_135,Items.SPEEDLIMIT_LOW_140,Items.SPEEDLIMIT_LOW_145,Items.SPEEDLIMIT_LOW_150,Items.SPEEDLIMIT_LOW_SPECIAL,Items.LIFT_SPEEDLIMIT_HIGH_3,Items.LIFT_SPEEDLIMIT_HIGH_5,Items.LIFT_SPEEDLIMIT_HIGH_10,Items.LIFT_SPEEDLIMIT_HIGH_15,Items.LIFT_SPEEDLIMIT_HIGH_20,Items.LIFT_SPEEDLIMIT_HIGH_25,Items.LIFT_SPEEDLIMIT_HIGH_30,Items.LIFT_SPEEDLIMIT_HIGH_35,Items.LIFT_SPEEDLIMIT_HIGH_40,Items.LIFT_SPEEDLIMIT_HIGH_45,Items.LIFT_SPEEDLIMIT_HIGH_50,Items.LIFT_SPEEDLIMIT_HIGH_55,Items.LIFT_SPEEDLIMIT_HIGH_60,Items.LIFT_SPEEDLIMIT_HIGH_65,Items.LIFT_SPEEDLIMIT_HIGH_70,Items.LIFT_SPEEDLIMIT_HIGH_75,Items.LIFT_SPEEDLIMIT_HIGH_80,Items.LIFT_SPEEDLIMIT_HIGH_85,Items.LIFT_SPEEDLIMIT_HIGH_90,Items.LIFT_SPEEDLIMIT_HIGH_95,Items.LIFT_SPEEDLIMIT_HIGH_100,Items.LIFT_SPEEDLIMIT_HIGH_105,Items.LIFT_SPEEDLIMIT_HIGH_110,Items.LIFT_SPEEDLIMIT_HIGH_115,Items.LIFT_SPEEDLIMIT_HIGH_120,Items.LIFT_SPEEDLIMIT_HIGH_125,Items.LIFT_SPEEDLIMIT_HIGH_130,Items.LIFT_SPEEDLIMIT_HIGH_135,Items.LIFT_SPEEDLIMIT_HIGH_140,Items.LIFT_SPEEDLIMIT_HIGH_145,Items.LIFT_SPEEDLIMIT_HIGH_150,Items.LIFT_SPEEDLIMIT_HIGH_SPECIAL,Items.IRON_PLATE,Items.CIRCLE_BACKBOARD}){
			e.add(i);
		}
	})
	.build();
	public static void doit(){
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_3"),Blocks.SPEEDLIMIT_HIGH_3);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_3"),Blocks.SPEEDLIMIT_LOW_3);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_5"),Blocks.SPEEDLIMIT_HIGH_5);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_5"),Blocks.SPEEDLIMIT_LOW_5);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_10"),Blocks.SPEEDLIMIT_HIGH_10);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_10"),Blocks.SPEEDLIMIT_LOW_10);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_15"),Blocks.SPEEDLIMIT_HIGH_15);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_15"),Blocks.SPEEDLIMIT_LOW_15);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_20"),Blocks.SPEEDLIMIT_HIGH_20);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_20"),Blocks.SPEEDLIMIT_LOW_20);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_25"),Blocks.SPEEDLIMIT_HIGH_25);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_25"),Blocks.SPEEDLIMIT_LOW_25);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_30"),Blocks.SPEEDLIMIT_HIGH_30);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_30"),Blocks.SPEEDLIMIT_LOW_30);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_35"),Blocks.SPEEDLIMIT_HIGH_35);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_35"),Blocks.SPEEDLIMIT_LOW_35);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_40"),Blocks.SPEEDLIMIT_HIGH_40);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_40"),Blocks.SPEEDLIMIT_LOW_40);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_45"),Blocks.SPEEDLIMIT_HIGH_45);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_45"),Blocks.SPEEDLIMIT_LOW_45);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_50"),Blocks.SPEEDLIMIT_HIGH_50);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_50"),Blocks.SPEEDLIMIT_LOW_50);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_55"),Blocks.SPEEDLIMIT_HIGH_55);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_55"),Blocks.SPEEDLIMIT_LOW_55);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_60"),Blocks.SPEEDLIMIT_HIGH_60);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_60"),Blocks.SPEEDLIMIT_LOW_60);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_65"),Blocks.SPEEDLIMIT_HIGH_65);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_65"),Blocks.SPEEDLIMIT_LOW_65);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_70"),Blocks.SPEEDLIMIT_HIGH_70);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_70"),Blocks.SPEEDLIMIT_LOW_70);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_75"),Blocks.SPEEDLIMIT_HIGH_75);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_75"),Blocks.SPEEDLIMIT_LOW_75);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_80"),Blocks.SPEEDLIMIT_HIGH_80);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_80"),Blocks.SPEEDLIMIT_LOW_80);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_85"),Blocks.SPEEDLIMIT_HIGH_85);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_85"),Blocks.SPEEDLIMIT_LOW_85);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_90"),Blocks.SPEEDLIMIT_HIGH_90);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_90"),Blocks.SPEEDLIMIT_LOW_90);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_95"),Blocks.SPEEDLIMIT_HIGH_95);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_95"),Blocks.SPEEDLIMIT_LOW_95);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_100"),Blocks.SPEEDLIMIT_HIGH_100);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_100"),Blocks.SPEEDLIMIT_LOW_100);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_105"),Blocks.SPEEDLIMIT_HIGH_105);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_105"),Blocks.SPEEDLIMIT_LOW_105);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_110"),Blocks.SPEEDLIMIT_HIGH_110);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_110"),Blocks.SPEEDLIMIT_LOW_110);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_115"),Blocks.SPEEDLIMIT_HIGH_115);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_115"),Blocks.SPEEDLIMIT_LOW_115);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_120"),Blocks.SPEEDLIMIT_HIGH_120);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_120"),Blocks.SPEEDLIMIT_LOW_120);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_125"),Blocks.SPEEDLIMIT_HIGH_125);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_125"),Blocks.SPEEDLIMIT_LOW_125);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_130"),Blocks.SPEEDLIMIT_HIGH_130);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_130"),Blocks.SPEEDLIMIT_LOW_130);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_135"),Blocks.SPEEDLIMIT_HIGH_135);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_135"),Blocks.SPEEDLIMIT_LOW_135);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_140"),Blocks.SPEEDLIMIT_HIGH_140);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_140"),Blocks.SPEEDLIMIT_LOW_140);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_145"),Blocks.SPEEDLIMIT_HIGH_145);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_145"),Blocks.SPEEDLIMIT_LOW_145);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_150"),Blocks.SPEEDLIMIT_HIGH_150);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_150"),Blocks.SPEEDLIMIT_LOW_150);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_special"),Blocks.SPEEDLIMIT_HIGH_SPECIAL);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_special"),Blocks.SPEEDLIMIT_LOW_SPECIAL);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_3"),Blocks.LIFT_SPEEDLIMIT_HIGH_3);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_5"),Blocks.LIFT_SPEEDLIMIT_HIGH_5);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_10"),Blocks.LIFT_SPEEDLIMIT_HIGH_10);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_15"),Blocks.LIFT_SPEEDLIMIT_HIGH_15);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_20"),Blocks.LIFT_SPEEDLIMIT_HIGH_20);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_25"),Blocks.LIFT_SPEEDLIMIT_HIGH_25);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_30"),Blocks.LIFT_SPEEDLIMIT_HIGH_30);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_35"),Blocks.LIFT_SPEEDLIMIT_HIGH_35);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_40"),Blocks.LIFT_SPEEDLIMIT_HIGH_40);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_45"),Blocks.LIFT_SPEEDLIMIT_HIGH_45);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_50"),Blocks.LIFT_SPEEDLIMIT_HIGH_50);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_55"),Blocks.LIFT_SPEEDLIMIT_HIGH_55);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_60"),Blocks.LIFT_SPEEDLIMIT_HIGH_60);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_65"),Blocks.LIFT_SPEEDLIMIT_HIGH_65);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_70"),Blocks.LIFT_SPEEDLIMIT_HIGH_70);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_75"),Blocks.LIFT_SPEEDLIMIT_HIGH_75);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_80"),Blocks.LIFT_SPEEDLIMIT_HIGH_80);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_85"),Blocks.LIFT_SPEEDLIMIT_HIGH_85);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_90"),Blocks.LIFT_SPEEDLIMIT_HIGH_90);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_95"),Blocks.LIFT_SPEEDLIMIT_HIGH_95);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_100"),Blocks.LIFT_SPEEDLIMIT_HIGH_100);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_105"),Blocks.LIFT_SPEEDLIMIT_HIGH_105);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_110"),Blocks.LIFT_SPEEDLIMIT_HIGH_110);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_115"),Blocks.LIFT_SPEEDLIMIT_HIGH_115);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_120"),Blocks.LIFT_SPEEDLIMIT_HIGH_120);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_125"),Blocks.LIFT_SPEEDLIMIT_HIGH_125);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_130"),Blocks.LIFT_SPEEDLIMIT_HIGH_130);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_135"),Blocks.LIFT_SPEEDLIMIT_HIGH_135);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_140"),Blocks.LIFT_SPEEDLIMIT_HIGH_140);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_145"),Blocks.LIFT_SPEEDLIMIT_HIGH_145);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_150"),Blocks.LIFT_SPEEDLIMIT_HIGH_150);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_special"),Blocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL);
		Registry.register(Registries.BLOCK,new Identifier("regedt32","cntrafficsymbols/circle_backboard"),Blocks.CIRCLE_BACKBOARD);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_3"),Items.SPEEDLIMIT_HIGH_3);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_3"),Items.SPEEDLIMIT_LOW_3);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_5"),Items.SPEEDLIMIT_HIGH_5);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_5"),Items.SPEEDLIMIT_LOW_5);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_10"),Items.SPEEDLIMIT_HIGH_10);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_10"),Items.SPEEDLIMIT_LOW_10);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_15"),Items.SPEEDLIMIT_HIGH_15);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_15"),Items.SPEEDLIMIT_LOW_15);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_20"),Items.SPEEDLIMIT_HIGH_20);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_20"),Items.SPEEDLIMIT_LOW_20);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_25"),Items.SPEEDLIMIT_HIGH_25);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_25"),Items.SPEEDLIMIT_LOW_25);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_30"),Items.SPEEDLIMIT_HIGH_30);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_30"),Items.SPEEDLIMIT_LOW_30);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_35"),Items.SPEEDLIMIT_HIGH_35);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_35"),Items.SPEEDLIMIT_LOW_35);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_40"),Items.SPEEDLIMIT_HIGH_40);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_40"),Items.SPEEDLIMIT_LOW_40);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_45"),Items.SPEEDLIMIT_HIGH_45);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_45"),Items.SPEEDLIMIT_LOW_45);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_50"),Items.SPEEDLIMIT_HIGH_50);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_50"),Items.SPEEDLIMIT_LOW_50);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_55"),Items.SPEEDLIMIT_HIGH_55);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_55"),Items.SPEEDLIMIT_LOW_55);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_60"),Items.SPEEDLIMIT_HIGH_60);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_60"),Items.SPEEDLIMIT_LOW_60);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_65"),Items.SPEEDLIMIT_HIGH_65);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_65"),Items.SPEEDLIMIT_LOW_65);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_70"),Items.SPEEDLIMIT_HIGH_70);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_70"),Items.SPEEDLIMIT_LOW_70);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_75"),Items.SPEEDLIMIT_HIGH_75);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_75"),Items.SPEEDLIMIT_LOW_75);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_80"),Items.SPEEDLIMIT_HIGH_80);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_80"),Items.SPEEDLIMIT_LOW_80);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_85"),Items.SPEEDLIMIT_HIGH_85);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_85"),Items.SPEEDLIMIT_LOW_85);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_90"),Items.SPEEDLIMIT_HIGH_90);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_90"),Items.SPEEDLIMIT_LOW_90);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_95"),Items.SPEEDLIMIT_HIGH_95);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_95"),Items.SPEEDLIMIT_LOW_95);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_100"),Items.SPEEDLIMIT_HIGH_100);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_100"),Items.SPEEDLIMIT_LOW_100);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_105"),Items.SPEEDLIMIT_HIGH_105);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_105"),Items.SPEEDLIMIT_LOW_105);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_110"),Items.SPEEDLIMIT_HIGH_110);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_110"),Items.SPEEDLIMIT_LOW_110);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_115"),Items.SPEEDLIMIT_HIGH_115);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_115"),Items.SPEEDLIMIT_LOW_115);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_120"),Items.SPEEDLIMIT_HIGH_120);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_120"),Items.SPEEDLIMIT_LOW_120);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_125"),Items.SPEEDLIMIT_HIGH_125);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_125"),Items.SPEEDLIMIT_LOW_125);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_130"),Items.SPEEDLIMIT_HIGH_130);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_130"),Items.SPEEDLIMIT_LOW_130);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_135"),Items.SPEEDLIMIT_HIGH_135);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_135"),Items.SPEEDLIMIT_LOW_135);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_140"),Items.SPEEDLIMIT_HIGH_140);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_140"),Items.SPEEDLIMIT_LOW_140);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_145"),Items.SPEEDLIMIT_HIGH_145);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_145"),Items.SPEEDLIMIT_LOW_145);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_150"),Items.SPEEDLIMIT_HIGH_150);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_150"),Items.SPEEDLIMIT_LOW_150);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_high_special"),Items.SPEEDLIMIT_HIGH_SPECIAL);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/speedlimit_low_special"),Items.SPEEDLIMIT_LOW_SPECIAL);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_3"),Items.LIFT_SPEEDLIMIT_HIGH_3);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_5"),Items.LIFT_SPEEDLIMIT_HIGH_5);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_10"),Items.LIFT_SPEEDLIMIT_HIGH_10);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_15"),Items.LIFT_SPEEDLIMIT_HIGH_15);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_20"),Items.LIFT_SPEEDLIMIT_HIGH_20);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_25"),Items.LIFT_SPEEDLIMIT_HIGH_25);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_30"),Items.LIFT_SPEEDLIMIT_HIGH_30);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_35"),Items.LIFT_SPEEDLIMIT_HIGH_35);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_40"),Items.LIFT_SPEEDLIMIT_HIGH_40);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_45"),Items.LIFT_SPEEDLIMIT_HIGH_45);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_50"),Items.LIFT_SPEEDLIMIT_HIGH_50);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_55"),Items.LIFT_SPEEDLIMIT_HIGH_55);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_60"),Items.LIFT_SPEEDLIMIT_HIGH_60);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_65"),Items.LIFT_SPEEDLIMIT_HIGH_65);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_70"),Items.LIFT_SPEEDLIMIT_HIGH_70);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_75"),Items.LIFT_SPEEDLIMIT_HIGH_75);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_80"),Items.LIFT_SPEEDLIMIT_HIGH_80);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_85"),Items.LIFT_SPEEDLIMIT_HIGH_85);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_90"),Items.LIFT_SPEEDLIMIT_HIGH_90);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_95"),Items.LIFT_SPEEDLIMIT_HIGH_95);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_100"),Items.LIFT_SPEEDLIMIT_HIGH_100);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_105"),Items.LIFT_SPEEDLIMIT_HIGH_105);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_110"),Items.LIFT_SPEEDLIMIT_HIGH_110);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_115"),Items.LIFT_SPEEDLIMIT_HIGH_115);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_120"),Items.LIFT_SPEEDLIMIT_HIGH_120);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_125"),Items.LIFT_SPEEDLIMIT_HIGH_125);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_130"),Items.LIFT_SPEEDLIMIT_HIGH_130);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_135"),Items.LIFT_SPEEDLIMIT_HIGH_135);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_140"),Items.LIFT_SPEEDLIMIT_HIGH_140);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_145"),Items.LIFT_SPEEDLIMIT_HIGH_145);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_150"),Items.LIFT_SPEEDLIMIT_HIGH_150);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/lift_speedlimit_high_special"),Items.LIFT_SPEEDLIMIT_HIGH_SPECIAL);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/iron_plate"),Items.IRON_PLATE);
		Registry.register(Registries.ITEM,new Identifier("regedt32","cntrafficsymbols/circle_backboard"),Items.CIRCLE_BACKBOARD);
		Registry.register(Registries.ITEM_GROUP,new Identifier("regedt32","cntrafficsymbols"),ITEM_GROUP);
		try{
			Block[]tab={Blocks.SPEEDLIMIT_HIGH_3,Blocks.SPEEDLIMIT_HIGH_5,Blocks.SPEEDLIMIT_HIGH_10,Blocks.SPEEDLIMIT_HIGH_15,Blocks.SPEEDLIMIT_HIGH_20,Blocks.SPEEDLIMIT_HIGH_25,Blocks.SPEEDLIMIT_HIGH_30,Blocks.SPEEDLIMIT_HIGH_35,Blocks.SPEEDLIMIT_HIGH_40,Blocks.SPEEDLIMIT_HIGH_45,Blocks.SPEEDLIMIT_HIGH_50,Blocks.SPEEDLIMIT_HIGH_55,Blocks.SPEEDLIMIT_HIGH_60,Blocks.SPEEDLIMIT_HIGH_65,Blocks.SPEEDLIMIT_HIGH_70,Blocks.SPEEDLIMIT_HIGH_75,Blocks.SPEEDLIMIT_HIGH_80,Blocks.SPEEDLIMIT_HIGH_85,Blocks.SPEEDLIMIT_HIGH_90,Blocks.SPEEDLIMIT_HIGH_95,Blocks.SPEEDLIMIT_HIGH_100,Blocks.SPEEDLIMIT_HIGH_105,Blocks.SPEEDLIMIT_HIGH_110,Blocks.SPEEDLIMIT_HIGH_115,Blocks.SPEEDLIMIT_HIGH_120,Blocks.SPEEDLIMIT_HIGH_125,Blocks.SPEEDLIMIT_HIGH_130,Blocks.SPEEDLIMIT_HIGH_135,Blocks.SPEEDLIMIT_HIGH_140,Blocks.SPEEDLIMIT_HIGH_145,Blocks.SPEEDLIMIT_HIGH_150,Blocks.SPEEDLIMIT_HIGH_SPECIAL,Blocks.SPEEDLIMIT_LOW_3,Blocks.SPEEDLIMIT_LOW_5,Blocks.SPEEDLIMIT_LOW_10,Blocks.SPEEDLIMIT_LOW_15,Blocks.SPEEDLIMIT_LOW_20,Blocks.SPEEDLIMIT_LOW_25,Blocks.SPEEDLIMIT_LOW_30,Blocks.SPEEDLIMIT_LOW_35,Blocks.SPEEDLIMIT_LOW_40,Blocks.SPEEDLIMIT_LOW_45,Blocks.SPEEDLIMIT_LOW_50,Blocks.SPEEDLIMIT_LOW_55,Blocks.SPEEDLIMIT_LOW_60,Blocks.SPEEDLIMIT_LOW_65,Blocks.SPEEDLIMIT_LOW_70,Blocks.SPEEDLIMIT_LOW_75,Blocks.SPEEDLIMIT_LOW_80,Blocks.SPEEDLIMIT_LOW_85,Blocks.SPEEDLIMIT_LOW_90,Blocks.SPEEDLIMIT_LOW_95,Blocks.SPEEDLIMIT_LOW_100,Blocks.SPEEDLIMIT_LOW_105,Blocks.SPEEDLIMIT_LOW_110,Blocks.SPEEDLIMIT_LOW_115,Blocks.SPEEDLIMIT_LOW_120,Blocks.SPEEDLIMIT_LOW_125,Blocks.SPEEDLIMIT_LOW_130,Blocks.SPEEDLIMIT_LOW_135,Blocks.SPEEDLIMIT_LOW_140,Blocks.SPEEDLIMIT_LOW_145,Blocks.SPEEDLIMIT_LOW_150,Blocks.SPEEDLIMIT_LOW_SPECIAL};
			int d=0;
			for(Attachment3 i:new Attachment3[]{Attachment3.NONE,Attachment3.DOWN,Attachment3.UP}){
				for(DoubleFaceFacing j:new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH,DoubleFaceFacing.SSW,DoubleFaceFacing.SOUTHWEST,DoubleFaceFacing.WSW,DoubleFaceFacing.WEST,DoubleFaceFacing.WNW,DoubleFaceFacing.NORTHWEST,DoubleFaceFacing.NNW,DoubleFaceFacing.NORTH,DoubleFaceFacing.NNE,DoubleFaceFacing.NORTHEAST,DoubleFaceFacing.ENE,DoubleFaceFacing.EAST,DoubleFaceFacing.ESE,DoubleFaceFacing.SOUTHEAST,DoubleFaceFacing.SSE,DoubleFaceFacing.NORTH_SOUTH,DoubleFaceFacing.NNE_SSW,DoubleFaceFacing.NORTHEAST_SOUTHWEST,DoubleFaceFacing.ENE_WSW,DoubleFaceFacing.EAST_WEST,DoubleFaceFacing.ESE_WNW,DoubleFaceFacing.NORTHWEST_SOUTHEAST,DoubleFaceFacing.SSE_NNW}){
					for(Block k:tab){
						BlockState st=k.getDefaultState().with(Attachment3.ATTACHMENT,i).with(DoubleFaceFacing.FACING,j);
						BlockNumberIDRegistry.INSTANCE.register(12200,d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE.register(k.getRegistryEntry().registryKey().getValue(),new BlockProperties().mergeFromBlockState(st),12200,d);
						st=st.with(net.minecraft.state.property.Properties.WATERLOGGED,true);
						BlockNumberIDRegistry.INSTANCE.register(12200,~d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE.register(k.getRegistryEntry().registryKey().getValue(),new BlockProperties().mergeFromBlockState(st),12200,~d);
						d++;
					}
				}
				d+=512;
			}
			tab=new Block[]{Blocks.LIFT_SPEEDLIMIT_HIGH_3,Blocks.LIFT_SPEEDLIMIT_HIGH_5,Blocks.LIFT_SPEEDLIMIT_HIGH_10,Blocks.LIFT_SPEEDLIMIT_HIGH_15,Blocks.LIFT_SPEEDLIMIT_HIGH_20,Blocks.LIFT_SPEEDLIMIT_HIGH_25,Blocks.LIFT_SPEEDLIMIT_HIGH_30,Blocks.LIFT_SPEEDLIMIT_HIGH_35,Blocks.LIFT_SPEEDLIMIT_HIGH_40,Blocks.LIFT_SPEEDLIMIT_HIGH_45,Blocks.LIFT_SPEEDLIMIT_HIGH_50,Blocks.LIFT_SPEEDLIMIT_HIGH_55,Blocks.LIFT_SPEEDLIMIT_HIGH_60,Blocks.LIFT_SPEEDLIMIT_HIGH_65,Blocks.LIFT_SPEEDLIMIT_HIGH_70,Blocks.LIFT_SPEEDLIMIT_HIGH_75,Blocks.LIFT_SPEEDLIMIT_HIGH_80,Blocks.LIFT_SPEEDLIMIT_HIGH_85,Blocks.LIFT_SPEEDLIMIT_HIGH_90,Blocks.LIFT_SPEEDLIMIT_HIGH_95,Blocks.LIFT_SPEEDLIMIT_HIGH_100,Blocks.LIFT_SPEEDLIMIT_HIGH_105,Blocks.LIFT_SPEEDLIMIT_HIGH_110,Blocks.LIFT_SPEEDLIMIT_HIGH_115,Blocks.LIFT_SPEEDLIMIT_HIGH_120,Blocks.LIFT_SPEEDLIMIT_HIGH_125,Blocks.LIFT_SPEEDLIMIT_HIGH_130,Blocks.LIFT_SPEEDLIMIT_HIGH_135,Blocks.LIFT_SPEEDLIMIT_HIGH_140,Blocks.LIFT_SPEEDLIMIT_HIGH_145,Blocks.LIFT_SPEEDLIMIT_HIGH_150,Blocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL};
			d=0;
			for(Attachment3 i:new Attachment3[]{Attachment3.NONE,Attachment3.DOWN,Attachment3.UP}){
				for(DoubleFaceFacing j:new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH,DoubleFaceFacing.SSW,DoubleFaceFacing.SOUTHWEST,DoubleFaceFacing.WSW,DoubleFaceFacing.WEST,DoubleFaceFacing.WNW,DoubleFaceFacing.NORTHWEST,DoubleFaceFacing.NNW,DoubleFaceFacing.NORTH,DoubleFaceFacing.NNE,DoubleFaceFacing.NORTHEAST,DoubleFaceFacing.ENE,DoubleFaceFacing.EAST,DoubleFaceFacing.ESE,DoubleFaceFacing.SOUTHEAST,DoubleFaceFacing.SSE,DoubleFaceFacing.NORTH_SOUTH,DoubleFaceFacing.NNE_SSW,DoubleFaceFacing.NORTHEAST_SOUTHWEST,DoubleFaceFacing.ENE_WSW,DoubleFaceFacing.EAST_WEST,DoubleFaceFacing.ESE_WNW,DoubleFaceFacing.NORTHWEST_SOUTHEAST,DoubleFaceFacing.SSE_NNW}){
					for(Block k:tab){
						BlockState st=k.getDefaultState().with(Attachment3.ATTACHMENT,i).with(DoubleFaceFacing.FACING,j);
						BlockNumberIDRegistry.INSTANCE.register(12201,d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE.register(k.getRegistryEntry().registryKey().getValue(),new BlockProperties().mergeFromBlockState(st),12201,d);
						st=st.with(net.minecraft.state.property.Properties.WATERLOGGED,true);
						BlockNumberIDRegistry.INSTANCE.register(12201,~d,st);
						BlockNumberIDRecognitionRegistry.INSTANCE.register(k.getRegistryEntry().registryKey().getValue(),new BlockProperties().mergeFromBlockState(st),12201,~d);
						d++;
					}
					d+=32;
				}
				d+=512;
			}
			d=0;
			for(Attachment3 i:new Attachment3[]{Attachment3.NONE,Attachment3.DOWN,Attachment3.UP}){
				for(DoubleFaceFacing j:new DoubleFaceFacing[]{DoubleFaceFacing.SOUTH,DoubleFaceFacing.SSW,DoubleFaceFacing.SOUTHWEST,DoubleFaceFacing.WSW,DoubleFaceFacing.WEST,DoubleFaceFacing.WNW,DoubleFaceFacing.NORTHWEST,DoubleFaceFacing.NNW,DoubleFaceFacing.NORTH,DoubleFaceFacing.NNE,DoubleFaceFacing.NORTHEAST,DoubleFaceFacing.ENE,DoubleFaceFacing.EAST,DoubleFaceFacing.ESE,DoubleFaceFacing.SOUTHEAST,DoubleFaceFacing.SSE,DoubleFaceFacing.NORTH_SOUTH,DoubleFaceFacing.NNE_SSW,DoubleFaceFacing.NORTHEAST_SOUTHWEST,DoubleFaceFacing.ENE_WSW,DoubleFaceFacing.EAST_WEST,DoubleFaceFacing.ESE_WNW,DoubleFaceFacing.NORTHWEST_SOUTHEAST,DoubleFaceFacing.SSE_NNW}){
					BlockState st=Blocks.CIRCLE_BACKBOARD.getDefaultState().with(Attachment3.ATTACHMENT,i).with(DoubleFaceFacing.FACING,j);
					BlockNumberIDRegistry.INSTANCE.register(12203,d,st);
					BlockNumberIDRecognitionRegistry.INSTANCE.register(Blocks.CIRCLE_BACKBOARD.getRegistryEntry().registryKey().getValue(),new BlockProperties().mergeFromBlockState(st),12201,d);
					st=st.with(net.minecraft.state.property.Properties.WATERLOGGED,true);
					BlockNumberIDRegistry.INSTANCE.register(12203,~d,st);
					BlockNumberIDRecognitionRegistry.INSTANCE.register(Blocks.CIRCLE_BACKBOARD.getRegistryEntry().registryKey().getValue(),new BlockProperties().mergeFromBlockState(st),12201,~d);
					d++;
				}
				d+=8;
			}
			Item[]tab2={Items.SPEEDLIMIT_HIGH_3,Items.SPEEDLIMIT_HIGH_5,Items.SPEEDLIMIT_HIGH_10,Items.SPEEDLIMIT_HIGH_15,Items.SPEEDLIMIT_HIGH_20,Items.SPEEDLIMIT_HIGH_25,Items.SPEEDLIMIT_HIGH_30,Items.SPEEDLIMIT_HIGH_35,Items.SPEEDLIMIT_HIGH_40,Items.SPEEDLIMIT_HIGH_45,Items.SPEEDLIMIT_HIGH_50,Items.SPEEDLIMIT_HIGH_55,Items.SPEEDLIMIT_HIGH_60,Items.SPEEDLIMIT_HIGH_65,Items.SPEEDLIMIT_HIGH_70,Items.SPEEDLIMIT_HIGH_75,Items.SPEEDLIMIT_HIGH_80,Items.SPEEDLIMIT_HIGH_85,Items.SPEEDLIMIT_HIGH_90,Items.SPEEDLIMIT_HIGH_95,Items.SPEEDLIMIT_HIGH_100,Items.SPEEDLIMIT_HIGH_105,Items.SPEEDLIMIT_HIGH_110,Items.SPEEDLIMIT_HIGH_115,Items.SPEEDLIMIT_HIGH_120,Items.SPEEDLIMIT_HIGH_125,Items.SPEEDLIMIT_HIGH_130,Items.SPEEDLIMIT_HIGH_135,Items.SPEEDLIMIT_HIGH_140,Items.SPEEDLIMIT_HIGH_145,Items.SPEEDLIMIT_HIGH_150,Items.SPEEDLIMIT_HIGH_SPECIAL,Items.SPEEDLIMIT_LOW_3,Items.SPEEDLIMIT_LOW_5,Items.SPEEDLIMIT_LOW_10,Items.SPEEDLIMIT_LOW_15,Items.SPEEDLIMIT_LOW_20,Items.SPEEDLIMIT_LOW_25,Items.SPEEDLIMIT_LOW_30,Items.SPEEDLIMIT_LOW_35,Items.SPEEDLIMIT_LOW_40,Items.SPEEDLIMIT_LOW_45,Items.SPEEDLIMIT_LOW_50,Items.SPEEDLIMIT_LOW_55,Items.SPEEDLIMIT_LOW_60,Items.SPEEDLIMIT_LOW_65,Items.SPEEDLIMIT_LOW_70,Items.SPEEDLIMIT_LOW_75,Items.SPEEDLIMIT_LOW_80,Items.SPEEDLIMIT_LOW_85,Items.SPEEDLIMIT_LOW_90,Items.SPEEDLIMIT_LOW_95,Items.SPEEDLIMIT_LOW_100,Items.SPEEDLIMIT_LOW_105,Items.SPEEDLIMIT_LOW_110,Items.SPEEDLIMIT_LOW_115,Items.SPEEDLIMIT_LOW_120,Items.SPEEDLIMIT_LOW_125,Items.SPEEDLIMIT_LOW_130,Items.SPEEDLIMIT_LOW_135,Items.SPEEDLIMIT_LOW_140,Items.SPEEDLIMIT_LOW_145,Items.SPEEDLIMIT_LOW_150,Items.SPEEDLIMIT_LOW_SPECIAL};
			d=0;
			for(Item i:tab2){
				ItemNumberIDRegistry.INSTANCE.register(12200,d,i);
				d++;
			}
			tab2=new Item[]{Items.LIFT_SPEEDLIMIT_HIGH_3,Items.LIFT_SPEEDLIMIT_HIGH_5,Items.LIFT_SPEEDLIMIT_HIGH_10,Items.LIFT_SPEEDLIMIT_HIGH_15,Items.LIFT_SPEEDLIMIT_HIGH_20,Items.LIFT_SPEEDLIMIT_HIGH_25,Items.LIFT_SPEEDLIMIT_HIGH_30,Items.LIFT_SPEEDLIMIT_HIGH_35,Items.LIFT_SPEEDLIMIT_HIGH_40,Items.LIFT_SPEEDLIMIT_HIGH_45,Items.LIFT_SPEEDLIMIT_HIGH_50,Items.LIFT_SPEEDLIMIT_HIGH_55,Items.LIFT_SPEEDLIMIT_HIGH_60,Items.LIFT_SPEEDLIMIT_HIGH_65,Items.LIFT_SPEEDLIMIT_HIGH_70,Items.LIFT_SPEEDLIMIT_HIGH_75,Items.LIFT_SPEEDLIMIT_HIGH_80,Items.LIFT_SPEEDLIMIT_HIGH_85,Items.LIFT_SPEEDLIMIT_HIGH_90,Items.LIFT_SPEEDLIMIT_HIGH_95,Items.LIFT_SPEEDLIMIT_HIGH_100,Items.LIFT_SPEEDLIMIT_HIGH_105,Items.LIFT_SPEEDLIMIT_HIGH_110,Items.LIFT_SPEEDLIMIT_HIGH_115,Items.LIFT_SPEEDLIMIT_HIGH_120,Items.LIFT_SPEEDLIMIT_HIGH_125,Items.LIFT_SPEEDLIMIT_HIGH_130,Items.LIFT_SPEEDLIMIT_HIGH_135,Items.LIFT_SPEEDLIMIT_HIGH_140,Items.LIFT_SPEEDLIMIT_HIGH_145,Items.LIFT_SPEEDLIMIT_HIGH_150,Items.LIFT_SPEEDLIMIT_HIGH_SPECIAL};
			d=0;
			for(Item i:tab2){
				ItemNumberIDRegistry.INSTANCE.register(12201,d,i);
				d++;
			}
			ItemNumberIDRegistry.INSTANCE.register(12202,0,Items.IRON_PLATE);
			ItemNumberIDRegistry.INSTANCE.register(12202,0,Items.CIRCLE_BACKBOARD);
		}catch(NoClassDefFoundError e){}
	}
}
