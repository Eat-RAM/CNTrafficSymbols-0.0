package io.github.eat_ram.cntrafficsymbols.v0d0.network;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.RodWithLampBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayExitDistanceInfoKmBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayExitDistanceInfoNameBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayHmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayKmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be.RodWithLampBlockEntity;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Contract;

public abstract class ModNetworking {
    public static void init() {
        PayloadTypeRegistry.clientboundPlay().register(
            OpenEditTrafficSignPayload.ID, OpenEditTrafficSignPayload.CODEC
        );
        PayloadTypeRegistry.serverboundPlay()
        .register(UpdateTrafficSignPayload.ID, UpdateTrafficSignPayload.CODEC);

        ServerPlayNetworking
        .registerGlobalReceiver(UpdateTrafficSignPayload.ID,
                                (payload, context) -> {
            ServerPlayerEntity player = context.player();
            BlockPos pos = payload.pos();
            double reach = player.getAttributes().getValue(
                EntityAttributes.ENTITY_INTERACTION_RANGE
            ) + 5.;
            if (pos.getSquaredDistanceFromCenter(
                player.getX(), player.getY(), player.getZ()
            ) > reach * reach) {
                return;
            }
            World world = player.getEntityWorld();
            BlockEntity be = world.getBlockEntity(pos);
            if (be == null) {
                return;
            }
            BlockState bst = world.getBlockState(pos);
            NbtCompound data = payload.data();
            if (be instanceof HighwayKmSignBlockEntity kmSign) {
                if (data.contains("km")) {
                    kmSign.setKm(data.getInt("km", 0));
                }
                if (data.contains("PointFive")) {
                    kmSign.setPointFive(data.getBoolean("PointFive", false));
                }
                if (data.contains("CustomName")) {
                    String name = data.getString("CustomName", "");
                    kmSign
                    .setCustomName(name.isEmpty() ? null : Text.literal(name));
                }
                kmSign.markDirty();
                world.updateListeners(pos, bst, bst, Block.NOTIFY_ALL);
            } else if (be instanceof HighwayHmSignBlockEntity hmSign) {
                if (data.contains("CustomName")) {
                    String name = data.getString("CustomName", "");
                    hmSign
                    .setCustomName(name.isEmpty() ? null : Text.literal(name));
                }
                hmSign.markDirty();
                world.updateListeners(pos, bst, bst, Block.NOTIFY_ALL);
            } else if (be instanceof
                       HighwayExitDistanceInfoNameBlockEntity exitName) {
                if (data.contains("CustomName")) {
                    String name = data.getString("CustomName", "");
                    exitName
                    .setCustomName(name.isEmpty() ? null : Text.literal(name));
                }
                exitName.markDirty();
                world.updateListeners(pos, bst, bst, Block.NOTIFY_ALL);
            } else if (be instanceof
                       HighwayExitDistanceInfoKmBlockEntity exitKm) {
                if (data.contains("km")) {
                    exitKm.setKm(data.getFloat("km", 0f));
                }
                exitKm.markDirty();
                world.updateListeners(pos, bst, bst, Block.NOTIFY_ALL);
            } else if (be instanceof RodWithLampBlockEntity rodLamp) {
                if (data.contains("Duration")) {
                    rodLamp
                    .setDurationFromString(data.getString("Duration", ""));
                }
                if (data.contains("Color") &&
                    bst.contains(RodWithLampBlock.COLOR)) {
                    int colorId = data.getInt("Color", 0);
                    bst = bst.with(
                        RodWithLampBlock.COLOR,
                        RodWithLampBlock.LightVisualColor.byID(colorId)
                    );
                    world.setBlockState(pos, bst, Block.NOTIFY_ALL);
                }
                rodLamp.markDirty();
                world.updateListeners(pos, bst, bst, Block.NOTIFY_ALL);
            }
        });
    }

    @Contract(value = "-> fail", pure = true)
    private ModNetworking() {
        throw new UnsupportedOperationException("Utility class");
    }
}
