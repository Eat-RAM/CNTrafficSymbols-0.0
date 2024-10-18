package rege.pegui.cntrafficsymbols.be;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import rege.pegui.cntrafficsymbols.SelfWork.Blocks;
public class HighwayExitDistanceInfoKmBlockEntity
extends net.minecraft.block.entity.BlockEntity
implements net.minecraft.util.Nameable{
	private static final float[]ROUNDS={
		0f,.1f,.2f,.3f,.4f,.5f,.6f,.7f,.8f,.9f,1f,1.1f,1.2f,1.3f,1.4f,1.5f,1.6f,1.7f,
		1.8f,1.9f,2f,2.1f,2.2f,2.3f,2.4f,2.5f,2.6f,2.7f,2.8f,2.9f,3f,3.1f,3.2f,3.3f,
		3.4f,3.5f,3.6f,3.7f,3.8f,3.9f,4f,4.1f,4.2f,4.3f,4.4f,4.5f,4.6f,4.7f,4.8f,
		4.9f,5f,5.1f,5.2f,5.3f,5.4f,5.5f,5.6f,5.7f,5.8f,5.9f,6f,6.1f,6.2f,6.3f,6.4f,
		6.5f,6.6f,6.7f,6.8f,6.9f,7f,7.1f,7.2f,7.3f,7.4f,7.5f,7.6f,7.7f,7.8f,7.9f,8f,
		8.1f,8.2f,8.3f,8.4f,8.5f,8.6f,8.7f,8.8f,8.9f,9f,9.1f,9.2f,9.3f,9.4f,9.5f,
		9.6f,9.7f,9.8f,9.9f,10f
	};
	public static final BlockEntityType<HighwayExitDistanceInfoKmBlockEntity>TYPE=
	BlockEntityType.Builder.create(HighwayExitDistanceInfoKmBlockEntity::new,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM,
	Blocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE).build();
	private float km=0f;
	public HighwayExitDistanceInfoKmBlockEntity(BlockPos p,
	BlockState st){super(TYPE,p,st);}
	public String getKmStr(){return (km%1f==0f)?Integer.toString((int)km):String
	.format("%.1f",Math.abs(km));}
	@Override public Text getName(){return Text.literal(getKmStr());}
	@Override @Nullable public Text getCustomName(){return getName();}
	public void setKm(float v){
		if(v>99999f){km=99999f;return;}
		if(v<-99999f){km=-99999f;return;}
		if(Math.abs(v)<10f){
			km=Math.copySign(ROUNDS[Math.round((float)(Math.abs(v)*10))],v);return;
		}
		km=Math.round(v);
	}
	@Override protected void writeNbt(NbtCompound nbt,RegistryWrapper
	.WrapperLookup rl){
		super.writeNbt(nbt,rl);nbt.putFloat("km",km);
		nbt.putString("CustomName",new Text.Serializer(rl).serialize(getName(),null,
		null).toString());//transient
	}
	@Override public void readNbt(NbtCompound nbt,RegistryWrapper.WrapperLookup rl){
		super.readNbt(nbt,rl);
		setKm(nbt.contains("km",NbtElement.FLOAT_TYPE)?nbt.getFloat("km"):0f);
	}
	@Override public net.minecraft.network.packet.Packet
	<net.minecraft.network.listener.ClientPlayPacketListener>toUpdatePacket(){
		return net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket
		.create(this);
	}
	@Override public NbtCompound toInitialChunkDataNbt(RegistryWrapper
	.WrapperLookup rl){return createNbt(rl);}
}
