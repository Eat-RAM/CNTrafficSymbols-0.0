package rege.pegui.cntrafficsymbols.mixin;
import org.spongepowered.asm.mixin.Mixin;import org.spongepowered.asm.mixin.gen.Accessor;
@Mixin(net.minecraft.state.State.class)
public interface Accessor1<O,S>{
	@Accessor("owner")public O getOwner();
}
