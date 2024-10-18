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
public class HighwayHmSignBlockEntity
extends net.minecraft.block.entity.BlockEntity
implements net.minecraft.util.Nameable{
	public static final BlockEntityType<HighwayHmSignBlockEntity>TYPE=
	BlockEntityType.Builder.create(HighwayHmSignBlockEntity::new,
	Blocks.HIGHWAY_1HM,Blocks.HIGHWAY_2HM,Blocks.HIGHWAY_3HM,Blocks.HIGHWAY_4HM,
	Blocks.HIGHWAY_5HM,Blocks.HIGHWAY_6HM,Blocks.HIGHWAY_7HM,Blocks.HIGHWAY_8HM,
	Blocks.HIGHWAY_9HM).build();
	@Nullable private Text customName;
	public HighwayHmSignBlockEntity(BlockPos p,BlockState st){super(TYPE,p,st);}
	@Override public Text getName(){return(customName==null)?
	Text.translatable("block.regedt32.cntrafficsymbols.highway_hm"):customName;}
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
