package io.github.eat_ram.cntrafficsymbols.v0d0.block.be;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.Nameable;
import org.jetbrains.annotations.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class HighwayHmSignBlockEntity extends BlockEntity implements Nameable {
    public static final BlockEntityType<HighwayHmSignBlockEntity> TYPE =
    BlockEntityType.Builder.create(
        HighwayHmSignBlockEntity::new, AllBlocks.HIGHWAY_1HM,
        AllBlocks.HIGHWAY_2HM, AllBlocks.HIGHWAY_3HM, AllBlocks.HIGHWAY_4HM,
        AllBlocks.HIGHWAY_5HM, AllBlocks.HIGHWAY_6HM, AllBlocks.HIGHWAY_7HM,
        AllBlocks.HIGHWAY_8HM, AllBlocks.HIGHWAY_9HM
    ).build();

    private @Nullable Text customName;

    public HighwayHmSignBlockEntity(BlockPos p, BlockState st) {
        super(TYPE, p, st);
    }

    @Override
    public Text getName() {
        return (this.customName == null) ?
               Text.translatable("block.cntrafficsymbols_0d0.highway_hm")
               : this.customName;
    }

    @Override
    public @Nullable Text getCustomName() {
        return this.customName;
    }

    public void setCustomName(@Nullable Text cn) {
        this.customName = cn;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        if (this.customName != null) {
            nbt.putString("CustomName", Text.Serialization.toJsonString(
                this.customName
            ));
        }
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
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
