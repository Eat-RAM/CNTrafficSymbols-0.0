package io.github.eat_ram.cntrafficsymbols.v0d0.block.be;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity
       .FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.ComponentsAccess;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryView;
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

public class HighwayHmSignBlockEntity extends BlockEntity implements Nameable {
    public static final BlockEntityType<HighwayHmSignBlockEntity> TYPE =
    FabricBlockEntityTypeBuilder.create(
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

    protected void readComponents(final ComponentsAccess components) {
        super.readComponents(components);
        this.customName = components.get(DataComponentTypes.CUSTOM_NAME);
    }

    protected void addComponents(final ComponentMap.Builder builder) {
        super.addComponents(builder);
        builder.add(DataComponentTypes.CUSTOM_NAME, this.customName);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void removeFromCopiedStackData(WriteView view) {
        super.removeFromCopiedStackData(view);
        view.remove("CustomName");
    }

    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound
    toInitialChunkDataNbt(RegistryView.WrapperLookup registries) {
        return this.createNbt(registries);
    }
}
