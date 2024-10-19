package rege.pegui.cntrafficsymbols;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rege.pegui.cntrafficsymbols.block.FloorLineEighthBlock;
public class Main implements net.fabricmc.api.ModInitializer{
	public static final org.slf4j.Logger LOGGER=
	org.slf4j.LoggerFactory.getLogger("cntrafficsymbols");
	private static@Nullable Boolean hardcodedFloorLineEighthsLootEnabled=null;
	private static boolean waterloggedProperty=true;
	private static@Nullable Boolean hardcodedBarricades1LootEnabled=null;
	private static final@NotNull HashSet<@NotNull Class<?>>
	blockstateOptimizations=new HashSet<>();
	public static@Nullable Boolean parseNullableBoolean(String s,String[]forTrue,
	String[]forFalse,String[]forNull)throws IllegalArgumentException{
		for(String i:forTrue){if(s.equals(i))return Boolean.TRUE;}
		for(String i:forFalse){if(s.equals(i))return Boolean.FALSE;}
		for(String i:forNull){if(s.equals(i))return null;}
		throw new IllegalArgumentException(s);
	}
	public static@Nullable Boolean getHardcodedFloorLineEighthsLootEnabled(){
		return hardcodedFloorLineEighthsLootEnabled;
	}
	public static boolean getWaterloggedProperty(){return waterloggedProperty;}
	public static@Nullable Boolean getHardcodedBarricades1LootEnabled(){
		return hardcodedBarricades1LootEnabled;
	}
	public static@NotNull HashSet<@NotNull Class<?>>getBlockstateOptimizations(){
		return new HashSet<>(blockstateOptimizations);
	}
	public static@Nullable Boolean
	setHardcodedFloorLineEighthsLootEnabled(@Nullable Boolean newVal){
		Boolean r=hardcodedFloorLineEighthsLootEnabled;
		hardcodedFloorLineEighthsLootEnabled=newVal;return r;
	}
	public static@Nullable Boolean
	setHardcodedBarricades1LootEnabled(@Nullable Boolean newVal){
		Boolean r=hardcodedBarricades1LootEnabled;
		hardcodedBarricades1LootEnabled=newVal;return r;
	}
	public static@NotNull HashSet<@NotNull Class<?>>
	setBlockstateOptimizations(@NotNull Iterable<@NotNull Class<?>>newVal){
		HashSet<Class<?>>r=new HashSet<>(blockstateOptimizations);
		blockstateOptimizations.clear();
		for(Class<?>i:newVal)blockstateOptimizations.add(i);
		return r;
	}
	public static void addDefaultBlockstateOptimizations(){
		blockstateOptimizations.add(FloorLineEighthBlock.class);
	}
	public static void readProperties()throws IOException{
		Properties ppts=new Properties();
		FileInputStream f=new FileInputStream("config/cntrafficsymbols.properties");
		ppts.load(f);
		if(ppts.containsKey("hardcoded_floor_line_eighths_loot_enabled")){
			try{
				hardcodedFloorLineEighthsLootEnabled=parseNullableBoolean(ppts
				.getProperty("hardcoded_floor_line_eighths_loot_enabled").strip()
				.toLowerCase(),new String[]{"true","yes","always"},
				new String[]{"false","no","never"},new String[]{"null","auto"});
				LOGGER.info("Overriding property value hardcoded_floor_line_eighths_loot_enabled with "+Objects.toString(hardcodedFloorLineEighthsLootEnabled));
			}catch(IllegalArgumentException e){
				LOGGER.warn("Invalid config property value of hardcoded_floor_line_eighths_loot_enabled: "+e.getMessage());
			}
		}else{
			LOGGER.info("No property hardcoded_floor_line_eighths_loot_enabled found. Use defalt value \"auto\".");
		}
		if(ppts.containsKey("waterlogged_property")){
			waterloggedProperty=Boolean.parseBoolean(ppts
			.getProperty("waterlogged_property").strip().toUpperCase());
			LOGGER.info("Overriding property value waterlogged_property with "
			+waterloggedProperty);
		}else{
			LOGGER.info(
				"No property waterlogged_property found. Use default value \"true\"."
			);
		}
		if(ppts.containsKey("hardcoded_barricades_1_loot_enabled")){
			try{
				hardcodedBarricades1LootEnabled=parseNullableBoolean(ppts
				.getProperty("hardcoded_barricades_1_loot_enabled").strip()
				.toLowerCase(),new String[]{"true","yes","always"},
				new String[]{"false","no","never"},new String[]{"null","auto"});
				LOGGER
				.info("Overriding property value hardcoded_barricades_1_loot_enabled with "
				+hardcodedBarricades1LootEnabled);
			}catch(IllegalArgumentException e){
				LOGGER.warn(
					"Invalid config property value of hardcoded_barricades_1_loot_enabled: "+
					e.getMessage()
				);
			}
		}else{
			LOGGER.info("No property hardcoded_barricades_1_loot_enabled found. Use defalt value \"auto\".");
		}
		if(ppts.containsKey("blockstate_optimizations")){
			try{
				for(String i:ppts
				.getProperty("blockstate_optimizations").strip().split(";")){
					blockstateOptimizations.add(Class.forName(i));
				}
				LOGGER.info("Overriding property value blockstate_optimizations with "
				+blockstateOptimizations);
			}catch(ClassNotFoundException e){
				blockstateOptimizations.clear();
				addDefaultBlockstateOptimizations();
				LOGGER.warn(
					"Invalid config property value of blockstate_optimizations: "+
					e.getMessage()
				);
			}
		}else{
			addDefaultBlockstateOptimizations();
			LOGGER.info("No property blockstate_optimizations found. Use defalt value \"rege.pegui.cntrafficsymbols.block.FloorLineEighthBlock\".");
		}
	}
	@Override public void onInitialize(){
		try{readProperties();}
		catch(java.io.FileNotFoundException e){
			addDefaultBlockstateOptimizations();
			LOGGER.info("No cntrafficsymbols.properties found. Use default config.");
		}catch(IOException e){e.printStackTrace();}
		SelfWork.doit();
	}
}
