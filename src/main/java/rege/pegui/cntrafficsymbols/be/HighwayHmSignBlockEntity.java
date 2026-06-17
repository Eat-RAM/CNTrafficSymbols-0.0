package rege.pegui.cntrafficsymbols.be;

import net.fabricmc.fabric.api.object.builder.v1.block.entity
       .FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.text.TextCodecs;
import net.minecraft.util.Nameable;
import org.jetbrains.annotations.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import rege.pegui.cntrafficsymbols.SelfWork.Blocks;

public class HighwayHmSignBlockEntity extends BlockEntity implements Nameable {
    public static final BlockEntityType<HighwayHmSignBlockEntity> TYPE =
    FabricBlockEntityTypeBuilder.create(
        HighwayHmSignBlockEntity::new, Blocks.HIGHWAY_1HM, Blocks.HIGHWAY_2HM,
        Blocks.HIGHWAY_3HM, Blocks.HIGHWAY_4HM, Blocks.HIGHWAY_5HM,
        Blocks.HIGHWAY_6HM, Blocks.HIGHWAY_7HM, Blocks.HIGHWAY_8HM,
        Blocks.HIGHWAY_9HM
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
    protected void writeData(WriteView view) {
        super.writeData(view);
        if (this.customName != null) {
            view.put("CustomName", TextCodecs.CODEC, this.customName);
        }
    }

    @Override
    protected void readData(ReadView view) {
        super.readData(view);
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
