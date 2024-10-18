package rege.pegui.cntrafficsymbols.mixin;
import com.google.common.collect.Table;
import net.minecraft.state.State;import net.minecraft.state.property.Property;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import rege.pegui.cntrafficsymbols.state.StateOptimizable;
import rege.pegui.cntrafficsymbols.state.StateOptimizer;
import java.util.*;
import static rege.pegui.cntrafficsymbols.Main.getBlockstateOptimizations;
@org.spongepowered.asm.mixin.Mixin(net.minecraft.state.State.class)
public abstract class Mixin2<O,S>{
	@Shadow@Final protected O owner;
	@Shadow private Table<Property<?>,Comparable<?>,S>withTable;
	@Inject(method="createWithTable",at=@At("HEAD"),cancellable=true)private void
	injectCreateWithTable(CallbackInfo info){if(this
	.owner instanceof StateOptimizable&&getBlockstateOptimizations().contains(this
	.getClass())){State<?,?>TH=(State<?,?>)(Object)this;
	StateOptimizer.add(TH);this.withTable=new Table<>(){
		@Override public boolean contains(Object rowKey,
		Object columnKey){return true;}
		@Override public boolean containsRow(Object rowKey){return true;}
		@Override public boolean containsColumn(Object columnKey){return true;}
		@Override public boolean containsValue(Object value){return true;}
		@Override@SuppressWarnings("unchecked")public S get(Object rowKey,
		Object columnKey){
			HashMap<Property<?>,Comparable<?>>HM=new HashMap<>(TH.getEntries());
			HM.put((Property<?>)rowKey,(Comparable<?>)columnKey);
			return(S)StateOptimizer.get(((Accessor1<?,?>)TH).getOwner(),HM);
		}
		@Override public boolean isEmpty(){return false;}
		@Override public int size(){return 1;}
		@Override public void clear(){}
		@Override public S put(Property<?>rowKey,Comparable<?>columnKey,
		S value){return null;}
		@Override public void putAll(@NotNull Table<?extends Property<?>,
		?extends Comparable<?>,?extends S>table){}
		@Override public S remove(Object rowKey,Object columnKey){return null;}
		@Override public@NotNull Map<Comparable<?>,
		S>row(Property<?>rowKey){return Map.of();}
		@Override public@NotNull Map<Property<?>,
		S>column(Comparable<?>columnKey){return Map.of();}
		@Override public@NotNull Set<Cell<Property<?>,Comparable<?>,
		S>>cellSet(){return Set.of();}
		@Override public@NotNull Set<Property<?>>rowKeySet(){return Set.of();}
		@Override public@NotNull Set<Comparable<?>>columnKeySet(){return Set.of();}
		@Override public@NotNull Collection<S>values(){return List.of();}
		@Override public@NotNull Map<Property<?>,Map<Comparable<?>,
		S>>rowMap(){return Map.of();}
		@Override public@NotNull Map<Comparable<?>,Map<Property<?>,
		S>>columnMap(){return Map.of();}
	};info.cancel();}}
}