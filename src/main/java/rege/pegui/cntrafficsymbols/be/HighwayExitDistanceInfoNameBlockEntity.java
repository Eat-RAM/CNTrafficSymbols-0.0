package rege.pegui.cntrafficsymbols.be;
import org.jetbrains.annotations.Nullable;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
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
	TYPE=FabricBlockEntityTypeBuilder
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
	@Override protected void writeNbt(NbtCompound nbt){
		super.writeNbt(nbt);if(customName!=null)
		nbt.putString("CustomName",Text.Serializer.toJson(customName));
	}
	@Override public void readNbt(NbtCompound nbt){
		super.readNbt(nbt);if(nbt.contains("CustomName",NbtElement.STRING_TYPE))
		customName=Text.Serializer.fromJson(nbt.getString("CustomName"));
	}
	@Override public net.minecraft.network.packet.Packet
	<net.minecraft.network.listener.ClientPlayPacketListener>toUpdatePacket(){
		return net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket
		.create(this);
	}
	@Override public NbtCompound toInitialChunkDataNbt(){return createNbt();}
}
