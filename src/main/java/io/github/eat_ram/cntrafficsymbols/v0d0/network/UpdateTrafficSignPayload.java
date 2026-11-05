package io.github.eat_ram.cntrafficsymbols.v0d0.network;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public record
UpdateTrafficSignPayload(@NotNull BlockPos pos, @Nullable NbtCompound data) {
    public UpdateTrafficSignPayload(@NotNull PacketByteBuf buf) {
        this(buf.readBlockPos(), buf.readNbt());
    }

    public void write(@NotNull PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
        buf.writeNbt(this.data);
    }

    public @NotNull PacketByteBuf toBuffer() {
        PacketByteBuf buf = PacketByteBufs.create();
        this.write(buf);
        return buf;
    }
}
