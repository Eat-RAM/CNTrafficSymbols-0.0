package rege.pegui.cntrafficsymbols.be;
import org.jetbrains.annotations.Nullable;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
public class HighwayKmSignBlockEntity
extends net.minecraft.block.entity.BlockEntity
implements net.minecraft.util.Nameable{
	public static final BlockEntityType<HighwayKmSignBlockEntity>TYPE=
	FabricBlockEntityTypeBuilder.create(HighwayKmSignBlockEntity::new,
	rege.pegui.cntrafficsymbols.SelfWork.Blocks.HIGHWAY_KM).build();
	@Nullable private Text customName;
	private int km=0;
	public HighwayKmSignBlockEntity(BlockPos p,BlockState st){super(TYPE,p,st);}
	@Override public Text getName(){return(customName==null)?
	Text.translatable("block.regedt32.cntrafficsymbols.highway_km"):customName;}
	@Override @Nullable public Text getCustomName(){return customName;}
	public void setCustomName(Text cn){customName=cn;}
	public int getKm(){return km;}
	public void setKm(int v){km=(v<=99999)?((v>-100001)?v:-100000):99999;}
	@Override protected void writeNbt(NbtCompound nbt){
		super.writeNbt(nbt);nbt.putInt("km",km);if(customName!=null)
		nbt.putString("CustomName",Text.Serializer.toJson(customName));
	}
	@Override public void readNbt(NbtCompound nbt){
		super.readNbt(nbt);
		setKm(nbt.contains("km",NbtElement.INT_TYPE)?nbt.getInt("km"):0);
		if(nbt.contains("CustomName",NbtElement.STRING_TYPE))
		customName=Text.Serializer.fromJson(nbt.getString("CustomName"));
	}
	@Override public net.minecraft.network.packet.Packet
	<net.minecraft.network.listener.ClientPlayPacketListener>toUpdatePacket(){
		return net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket
		.create(this);
	}
	@Override public NbtCompound toInitialChunkDataNbt(){return createNbt();}
}
