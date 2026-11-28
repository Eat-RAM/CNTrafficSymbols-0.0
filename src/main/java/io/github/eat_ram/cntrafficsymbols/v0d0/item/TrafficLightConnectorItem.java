package io.github.eat_ram.cntrafficsymbols.v0d0.item;

import java.util.List;
import java.util.UUID;

import io.github.eat_ram.cntrafficsymbols.core.block.BaseTrafficLightBlock;
import io.github.eat_ram.cntrafficsymbols.core.network
       .OpenTrafficLightConfigPayload;
import io.github.eat_ram.cntrafficsymbols.core.network
       .RemoveTrafficLightGroupPayload;
import io.github.eat_ram.cntrafficsymbols.core.network
       .SyncTrafficLightGroupPayload;
import io.github.eat_ram.cntrafficsymbols.core.traffic.LightConfig;
import io.github.eat_ram.cntrafficsymbols.core.traffic.TrafficLightGroup;
import io.github.eat_ram.cntrafficsymbols.core.traffic
       .TrafficLightGroupManager;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.CountdownTimerBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .CountdownTimerBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .TrafficLightBlockEntity;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TrafficLightConnectorItem extends Item {
    public static @Nullable UUID getSelectedGroup(@NotNull ItemStack stack) {
        NbtCompound nbt = stack.getNbt();
        if (nbt == null || !nbt.contains("SelectedGroupId")) {
            return null;
        }
        try {
            return UUID.fromString(nbt.getString("SelectedGroupId"));
        } catch (IllegalArgumentException ignored) {
            return null;
        }
    }

    public static void
    setSelectedGroup(@NotNull ItemStack stack, @Nullable UUID id) {
        NbtCompound nbt = stack.getOrCreateNbt();
        if (id != null) {
            nbt.putString("SelectedGroupId", id.toString());
        } else {
            nbt.remove("SelectedGroupId");
        }
    }

    public static @Nullable BlockPos
    getPendingTimerPos(@NotNull ItemStack stack) {
        NbtCompound nbt = stack.getNbt();
        if (nbt == null) {
            return null;
        }
        return nbt.contains("PendingTimerX") && nbt.contains("PendingTimerY")
               && nbt.contains("PendingTimerZ") ? new BlockPos(
            nbt.getInt("PendingTimerX"), nbt.getInt("PendingTimerY"),
            nbt.getInt("PendingTimerZ")
        ) : null;
    }

    public static void setPendingTimerPos(
        @NotNull ItemStack stack, @Nullable BlockPos pos
    ) {
        NbtCompound nbt = stack.getOrCreateNbt();
        if (pos != null) {
            nbt.putInt("PendingTimerX", pos.getX());
            nbt.putInt("PendingTimerY", pos.getY());
            nbt.putInt("PendingTimerZ", pos.getZ());
        } else {
            nbt.remove("PendingTimerX");
            nbt.remove("PendingTimerY");
            nbt.remove("PendingTimerZ");
        }
    }

    public static void clearMemory(@NotNull ItemStack stack) {
        NbtCompound nbt = stack.getNbt();
        if (nbt != null) {
            nbt.remove("SelectedGroupId");
            nbt.remove("PendingTimerX");
            nbt.remove("PendingTimerY");
            nbt.remove("PendingTimerZ");
        }
    }

    private static void
    syncGroupToPlayers(ServerWorld world, TrafficLightGroup group) {
        if (group == null) {
            return;
        }
        SyncTrafficLightGroupPayload payload =
        new SyncTrafficLightGroupPayload(group);
        for (ServerPlayerEntity p : world.getPlayers()) {
            ServerPlayNetworking
            .send(p, SyncTrafficLightGroupPayload.ID, payload.toBuffer());
        }
    }

    private static void
    broadcastGroupRemoval(ServerWorld world, UUID groupId) {
        RemoveTrafficLightGroupPayload payload =
        new RemoveTrafficLightGroupPayload(groupId);
        for (ServerPlayerEntity p : world.getPlayers()) {
            ServerPlayNetworking
            .send(p, RemoveTrafficLightGroupPayload.ID, payload.toBuffer());
        }
    }

    public TrafficLightConnectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(
        ItemStack stack, @Nullable World world, List<Text> tooltip,
        TooltipContext context
    ) {
        UUID gid = getSelectedGroup(stack);
        tooltip.add(gid != null ? Text.translatable(
            "item.cntrafficsymbols_0d0.connector.selected",
            gid.toString().substring(0, 8)
        ) : Text.translatable("item.cntrafficsymbols_0d0.connector.no_group"));
        BlockPos timer = getPendingTimerPos(stack);
        if (timer != null) {
            tooltip.add(Text.translatable(
                "item.cntrafficsymbols_0d0.connector.pending_timer",
                timer.getX(), timer.getY(), timer.getZ()
            ));
        }
    }

    private static void syncPlayer(@Nullable PlayerEntity player) {
        if (player instanceof ServerPlayerEntity sp) {
            sp.currentScreenHandler.sendContentUpdates();
        }
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getStack();
        if (player == null) {
            return ActionResult.PASS;
        }

        BlockState state = world.getBlockState(pos);
        Block blk = state.getBlock();
        boolean isTimer = blk instanceof CountdownTimerBlock;
        boolean isTrafficLight = blk instanceof BaseTrafficLightBlock;

        if (!isTimer && !isTrafficLight && !player.isSneaking()) {
            return ActionResult.PASS;
        }

        if (!(world instanceof ServerWorld sw)) {
            return ActionResult.SUCCESS;
        }

        TrafficLightGroupManager mgr = TrafficLightGroupManager.get(sw);

        // 1. Countdown timer interaction
        if (isTimer) {
            if (player.isSneaking()) {
                mgr.removeCountdownBinding(pos);
                BlockEntity be = sw.getBlockEntity(pos);
                if (be instanceof CountdownTimerBlockEntity cbe) {
                    cbe.setGroupId(null);
                    cbe.setBoundLightPos(null);
                    cbe.markDirty();
                    sw.updateListeners(pos, state, state, Block.NOTIFY_ALL);
                }
                if (pos.equals(getPendingTimerPos(stack))) {
                    setPendingTimerPos(stack, null);
                    syncPlayer(player);
                }
                player.sendMessage(Text.translatable(
                    "msg.cntrafficsymbols_0d0.countdown.unbound"
                ), true);
            } else {
                setPendingTimerPos(stack, pos);
                syncPlayer(player);
                player.sendMessage(Text.translatable(
                    "msg.cntrafficsymbols_0d0.countdown.selected"
                ), true);
            }
            return ActionResult.SUCCESS;
        }

        // 2. Traffic light interaction
        if (isTrafficLight) {
            BlockPos pendingTimer = getPendingTimerPos(stack);
            if (pendingTimer != null) {
                setPendingTimerPos(stack, null);
                syncPlayer(player);
                UUID groupId = mgr.getGroupIdByPos(pos);
                if (groupId == null) {
                    player.sendMessage(Text.translatable(
                        "msg.cntrafficsymbols_0d0.bind.target_not_grouped"
                    ), true);
                    return ActionResult.SUCCESS;
                }
                BlockEntity timerBe = sw.getBlockEntity(pendingTimer);
                if (timerBe instanceof CountdownTimerBlockEntity cbe) {
                    cbe.setGroupId(groupId);
                    cbe.setBoundLightPos(pos);
                    cbe.markDirty();
                    BlockState tState = sw.getBlockState(pendingTimer);
                    sw.updateListeners(
                        pendingTimer, tState, tState, Block.NOTIFY_ALL
                    );
                    mgr.bindCountdown(groupId, pendingTimer, pos);
                    syncGroupToPlayers(sw, mgr.getGroup(groupId));
                    player.sendMessage(Text.translatable(
                        "msg.cntrafficsymbols_0d0.bind.success"
                    ), true);
                } else {
                    player.sendMessage(Text.translatable(
                        "msg.cntrafficsymbols_0d0.bind.timer_invalid"
                    ), true);
                }
                return ActionResult.SUCCESS;
            }

            // Normal traffic light operation
            if (player.isSneaking()) {
                UUID gid = mgr.getGroupIdByPos(pos);
                if (gid == null) {
                    player.sendMessage(Text.translatable(
                        "msg.cntrafficsymbols_core.traffic_light.not_grouped"
                    ), true);
                    return ActionResult.SUCCESS;
                }
                mgr.removeLight(gid, pos);
                BlockEntity be = sw.getBlockEntity(pos);
                if (be instanceof TrafficLightBlockEntity lbe) {
                    lbe.setGroupId(null);
                    lbe.markDirty();
                    sw.updateListeners(pos, state, state, Block.NOTIFY_ALL);
                }
                TrafficLightGroup g = mgr.getGroup(gid);
                if (g != null) {
                    syncGroupToPlayers(sw, g);
                } else {
                    broadcastGroupRemoval(sw, gid);
                }
                player.sendMessage(Text.translatable(
                    "msg.cntrafficsymbols_0d0.traffic_light.removed"
                ), true);
                return ActionResult.SUCCESS;
            }

            // Regular right click
            UUID existingGid = mgr.getGroupIdByPos(pos);
            if (existingGid != null) {
                setSelectedGroup(stack, existingGid);
                syncPlayer(player);
                TrafficLightGroup group = mgr.getGroup(existingGid);
                if (group != null && player instanceof ServerPlayerEntity sp) {
                    OpenTrafficLightConfigPayload payload =
                    new OpenTrafficLightConfigPayload(group, pos);
                    ServerPlayNetworking.send(
                        sp, OpenTrafficLightConfigPayload.ID,
                        payload.toBuffer()
                    );
                }
                return ActionResult.SUCCESS;
            }

            // Not yet grouped
            UUID activeGid = getSelectedGroup(stack);
            TrafficLightGroup activeGroup =
            activeGid != null ? mgr.getGroup(activeGid) : null;
            LightConfig lightCfg =
            ((BaseTrafficLightBlock)blk).createDefaultLightConfig();

            if (activeGroup == null) {
                UUID newId = UUID.randomUUID();
                String name =
                "Intersection " + newId.toString().substring(0, 4);
                activeGroup =
                TrafficLightGroup.createDefault(newId, name, pos, lightCfg);
                mgr.addOrUpdateGroup(activeGroup);
                setSelectedGroup(stack, newId);
                syncPlayer(player);
                BlockEntity be = sw.getBlockEntity(pos);
                if (be instanceof TrafficLightBlockEntity lbe) {
                    lbe.setGroupId(newId);
                    lbe.markDirty();
                    sw.updateListeners(pos, state, state, Block.NOTIFY_ALL);
                }
                syncGroupToPlayers(sw, activeGroup);
                player.sendMessage(Text.translatable(
                    "msg.cntrafficsymbols_0d0.traffic_light.group_created",
                    name
                ), true);
            } else {
                activeGroup.addLight(pos, lightCfg);
                mgr.addOrUpdateGroup(activeGroup);
                BlockEntity be = sw.getBlockEntity(pos);
                if (be instanceof TrafficLightBlockEntity lbe) {
                    lbe.setGroupId(activeGroup.id);
                    lbe.markDirty();
                    sw.updateListeners(pos, state, state, Block.NOTIFY_ALL);
                }
                syncGroupToPlayers(sw, activeGroup);
                player.sendMessage(Text.translatable(
                    "msg.cntrafficsymbols_0d0.traffic_light.added_to_group",
                    activeGroup.getName()
                ), true);
            }
            return ActionResult.SUCCESS;
        }

        // 3. Clicked any other block while sneaking -> clear memory
        if (!player.isSneaking()) {
            return ActionResult.PASS;
        }
        clearMemory(stack);
        syncPlayer(player);
        player.sendMessage(Text.translatable(
            "msg.cntrafficsymbols_0d0.connector.memory_cleared"
        ), true);
        return ActionResult.SUCCESS;
    }

    @Override
    public TypedActionResult<ItemStack>
    use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);
        if (!player.isSneaking()) {
            return TypedActionResult.pass(stack);
        }
        if (!world.isClient()) {
            clearMemory(stack);
            syncPlayer(player);
            player.sendMessage(Text.translatable(
                "msg.cntrafficsymbols_0d0.connector.memory_cleared"
            ), true);
        }
        return TypedActionResult.success(stack);
    }
}
