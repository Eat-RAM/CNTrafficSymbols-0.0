package rege.pegui.cntrafficsymbols.be;

import net.fabricmc.fabric.api.object.builder.v1.block.entity
       .FabricBlockEntityTypeBuilder;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.text.TextCodecs;
import org.jetbrains.annotations.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

import static rege.pegui.cntrafficsymbols.SelfWork.Blocks.HIGHWAY_KM;

public class HighwayKmSignBlockEntity
    extends net.minecraft.block.entity.BlockEntity
    implements net.minecraft.util.Nameable {
    public static final BlockEntityType<HighwayKmSignBlockEntity> TYPE =
    FabricBlockEntityTypeBuilder
    .create(HighwayKmSignBlockEntity::new, HIGHWAY_KM).build();

    private @Nullable Text customName;
    private int km = 0;

    public HighwayKmSignBlockEntity(BlockPos p, BlockState st) {
        super(TYPE, p, st);
    }

    @Override
    public Text getName() {
        return (this.customName == null) ?
               Text.translatable("block.cntrafficsymbols_0d0.highway_km")
               : this.customName;
    }

    @Override
    public @Nullable Text getCustomName() {
        return this.customName;
    }

    public void setCustomName(@Nullable Text cn) {
        this.customName = cn;
    }

    public int getKm() {
        return this.km;
    }

    public void setKm(int v) {
        this.km = (v <= 99999) ? ((v > -100001) ? v : -100000) : 99999;
    }

    @Override
    protected void writeData(WriteView view) {
        super.writeData(view);
        view.putInt("km", this.km);
        if (this.customName != null) {
            view.put("CustomName", TextCodecs.CODEC, this.customName);
        }
    }

    @Override
    protected void readData(ReadView view) {
        super.readData(view);
        this.setKm(view.getInt("km", 0));
        Text cn = tryParseCustomName(view, "CustomName");
        if (cn != null) {
            this.customName = cn;
        }
    }

    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound
    toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registries) {
        return this.createNbt(registries);
    }
}
