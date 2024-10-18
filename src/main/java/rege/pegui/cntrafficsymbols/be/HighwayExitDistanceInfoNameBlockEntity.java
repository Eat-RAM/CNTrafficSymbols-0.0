package rege.pegui.cntrafficsymbols.be;
import com.google.gson.JsonParser;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import rege.pegui.cntrafficsymbols.SelfWork.Blocks;
public class HighwayExitDistanceInfoNameBlockEntity
extends net.minecraft.block.entity.BlockEntity
implements net.minecraft.util.Nameable{
	public static final BlockEntityType<HighwayExitDistanceInfoNameBlockEntity>
	TYPE=BlockEntityType.Builder
	.create(HighwayExitDistanceInfoNameBlockEntity::new,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE).build();
	@Nullable private Text customName;
	public HighwayExitDistanceInfoNameBlockEntity(BlockPos p,
	BlockState st){super(TYPE,p,st);}
	@Override public Text getName(){return(customName==null)?Text.translatable(
		"block.regedt32.cntrafficsymbols.highway_exit_distance_info_name"
	):customName;}
	@Override @Nullable public Text getCustomName(){return customName;}
	public void setCustomName(Text cn){customName=cn;}
	@Override protected void writeNbt(NbtCompound nbt,RegistryWrapper
	.WrapperLookup rl){
		super.writeNbt(nbt,rl);if(customName!=null)
		nbt.putString("CustomName",new Text.Serializer(rl).serialize(customName,null,
		null).toString());
	}
	@Override public void readNbt(NbtCompound nbt,RegistryWrapper
	.WrapperLookup rl){
		super.readNbt(nbt,rl);if(nbt.contains("CustomName",NbtElement.STRING_TYPE))
		customName=new Text.Serializer(rl).deserialize(JsonParser.parseString(nbt
		.getString("CustomName")),null,null);
	}
	@Override public net.minecraft.network.packet.Packet
	<net.minecraft.network.listener.ClientPlayPacketListener>toUpdatePacket(){
		return net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket
		.create(this);
	}
	@Override public NbtCompound toInitialChunkDataNbt(RegistryWrapper
	.WrapperLookup rl){return createNbt(rl);}
}
