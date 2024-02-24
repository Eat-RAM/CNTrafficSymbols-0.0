package rege.pegui.cntrafficsymbols.be;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
public class RodWithLampBlockEntity extends net.minecraft.block.entity
.BlockEntity implements net.minecraft.util.Nameable{
	public static final BlockEntityType<RodWithLampBlockEntity>TYPE=
	FabricBlockEntityTypeBuilder.create(RodWithLampBlockEntity::new).build();
	public static final Integer OVERALL_DURATION=Integer.valueOf(23999);
	public static int canonicalizeDuration(int duration){
		return((((duration&0b111111111111111000000000000000)>>15)%24000)<<15)|
		((duration&0b111111111111111)%24000);
	}
	public static boolean isOverall(int duration){
		duration=canonicalizeDuration(duration);
		return duration==23999||((duration>>15)-(duration&0b111111111111111))==1;
	}
	public static boolean shouldLit(int duration,short daytime){
		if(isOverall(duration))return true;
		duration=canonicalizeDuration(duration);daytime%=24000;
		int start=duration>>15;int end=duration&0b111111111111111;return(end>=start)?
		start<=daytime&&daytime<=end:(daytime>=start||daytime<=end);
	}
	public RodWithLampBlockEntity(BlockPos p,BlockState st){super(TYPE,p,st);}
	@Nullable private Integer duration;
	@Override public Text getName(){return(duration==null)?Text
	.translatable("block.regedt32.cntrafficsymbols.rod_with_lamp"):Text
 .literal(duration.toString());}
	@Override @Nullable public Text getCustomName(){return(duration!=null)?Text
	.literal(duration.toString()):null;}
	public void setDuration(@Nullable Integer durationCode){
		duration=(durationCode!=null)?canonicalizeDuration(durationCode):null;
	}
	@Override protected void writeNbt(NbtCompound nbt){
		super.writeNbt(nbt);if(duration!=null){
			nbt.putInt("Duration",duration.intValue());
			nbt.putString("CustomName",Text.Serializer.toJson(getName()));//transient
		}
	}
	@Override public void readNbt(NbtCompound nbt){
		super.readNbt(nbt);if(nbt.contains("Duration",NbtElement.INT_TYPE)){
			int a=canonicalizeDuration(nbt.getInt("Duration"));
			duration=isOverall(a)?OVERALL_DURATION:Integer.valueOf(a);
		}
	}
	public void tick(World w,BlockPos p,BlockState st){
		w.setBlockState(p,st.withIfExists(net.minecraft.state.property.Properties
		.LIT,duration!=null&&shouldLit(duration.intValue(),(short)(w.getTimeOfDay()
		%24000))),3);
	}
}
