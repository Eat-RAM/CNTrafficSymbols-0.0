package io.github.eat_ram.cntrafficsymbols.v0d0.block.be;

import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import org.jetbrains.annotations.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

import static io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlocks
              .HIGHWAY_KM;

public class HighwayKmSignBlockEntity
extends net.minecraft.block.entity.BlockEntity
implements net.minecraft.util.Nameable {
    public static final BlockEntityType<HighwayKmSignBlockEntity> TYPE =
    BlockEntityType.Builder.create(HighwayKmSignBlockEntity::new, HIGHWAY_KM)
    .build();

    private @Nullable Text customName;
    private int km = 0;
    private boolean pointFive = false;

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

    public boolean isPointFive() {
        return this.pointFive;
    }

    public void setPointFive(boolean v) {
        this.pointFive = v;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putInt("km", this.km);
        if (this.pointFive) {
            nbt.putBoolean("PointFive", true);
        }
        if (this.customName != null) {
            nbt.putString("CustomName", Text.Serialization.toJsonString(
                this.customName
            ));
        }
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.setKm(nbt.contains("km", NbtElement.INT_TYPE) ?
                   nbt.getInt("km") : 0);
        this.pointFive =
        nbt.getBoolean("PointFive") || nbt.getBoolean("pointFive");
        if (nbt.contains("CustomName", NbtElement.STRING_TYPE)) {
            this.customName = Text.Serialization.fromJson(
                nbt.getString("CustomName")
            );
        }
    }

    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return this.createNbt();
    }
}
