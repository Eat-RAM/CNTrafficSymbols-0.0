package io.github.eat_ram.cntrafficsymbols.v0d0.block.be;

import java.util.Collection;
import java.util.List;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.github.eat_ram.cntrafficsymbols.core.helper.DoubleIntervalHelper;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleInterval;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity
       .FabricBlockEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryView;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.attribute.timeline.Timeline;
import net.minecraft.world.attribute.timeline.Timelines;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.state.property.Properties.LIT;

public class RodWithLampBlockEntity extends BlockEntity {
    public static final BlockEntityType<RodWithLampBlockEntity> TYPE =
    FabricBlockEntityTypeBuilder.create(
        RodWithLampBlockEntity::new, AllBlocks.WHITE_ROD_WITH_LAMP,
        AllBlocks.ORANGE_ROD_WITH_LAMP, AllBlocks.MAGENTA_ROD_WITH_LAMP,
        AllBlocks.LIGHT_BLUE_ROD_WITH_LAMP, AllBlocks.YELLOW_ROD_WITH_LAMP,
        AllBlocks.LIME_ROD_WITH_LAMP, AllBlocks.PINK_ROD_WITH_LAMP,
        AllBlocks.GRAY_ROD_WITH_LAMP, AllBlocks.LIGHT_GRAY_ROD_WITH_LAMP,
        AllBlocks.CYAN_ROD_WITH_LAMP, AllBlocks.PURPLE_ROD_WITH_LAMP,
        AllBlocks.BLUE_ROD_WITH_LAMP, AllBlocks.BROWN_ROD_WITH_LAMP,
        AllBlocks.GREEN_ROD_WITH_LAMP, AllBlocks.RED_ROD_WITH_LAMP,
        AllBlocks.BLACK_ROD_WITH_LAMP
    ).build();
    public static final Codec<List<DoubleInterval>> CODEC_WITH_LEGACY =
    Codec.either(DoubleInterval.LIST_CODEC, Codec.INT).xmap(
        either -> either.map(
            DoubleIntervalHelper::unionAll,
            RodWithLampBlockEntity::fromLegacyDuration
        ), Either::left
    );

    @Contract(pure = true)
    public static int canonicalizeLegacyDuration(int duration) {
        return ((((duration & 0b111111111111111000000000000000) >> 15) % 24000)
                << 15) | ((duration & 0b111111111111111) % 24000);
    }

    @Contract(pure = true)
    public static boolean isLegacyOverall(int duration) {
        duration = canonicalizeLegacyDuration(duration);
        return duration == 23999 ||
               (duration >> 15) - (duration & 0b111111111111111) == 1;
    }

    public static @NotNull List<DoubleInterval>
    fromLegacyDuration(int duration) {
        if (isLegacyOverall(duration)) {
            return DoubleIntervalHelper.FULL_MEASURE;
        }
        duration = canonicalizeLegacyDuration(duration);
        int startTick = (duration >> 15) % 24000;
        int endTick = (duration & 0b111111111111111) % 24000;
        double s = startTick / 24000.;
        double e = endTick / 24000.;
        return DoubleIntervalHelper.fromLoopedMeasure(s, e);
    }

    @Contract("null -> null")
    public static @Nullable List<DoubleInterval>
    parseString(@Nullable String str) {
        if (str == null || str.isBlank()) {
            return null;
        }
        str = str.strip();
        try {
            int legacy = Integer.parseInt(str);
            return fromLegacyDuration(legacy);
        } catch (NumberFormatException ignored) {}
        return DoubleIntervalHelper.parseString(str);
    }

    @Deprecated(since = "0.0.3-a1", forRemoval = true)
    @Contract(pure = true)
    public static int canonicalizeDuration(int duration) {
        return canonicalizeLegacyDuration(duration);
    }

    @Deprecated(since = "0.0.3-a1", forRemoval = true)
    @Contract(pure = true)
    public static boolean isOverall(int duration) {
        return isLegacyOverall(duration);
    }

    @Deprecated(since = "0.0.3-a1", forRemoval = true)
    public static boolean shouldLit(int duration, short daytime) {
        List<DoubleInterval> list = fromLegacyDuration(duration);
        double t = ((daytime % 24000) + 24000) % 24000 / 24000.;
        return DoubleIntervalHelper.contains(list, t);
    }

    public static double getDaytimeProgress(World world) {
        for (RegistryEntry<Timeline> entry :
             world.getDimension().timelines()) {
            if (entry.matchesKey(Timelines.DAY)) {
                Timeline tl = entry.value();
                int period = tl.getPeriod().orElse(24000);
                long time = tl.getEffectiveTimeOfDay(world.getClocks());
                return (double)((time % period + period) % period) / period;
            }
        }
        var opt = world.getRegistryManager().getOptionalEntry(Timelines.DAY);
        if (opt.isPresent()) {
            Timeline tl = opt.get().value();
            int period = tl.getPeriod().orElse(24000);
            long time = tl.getEffectiveTimeOfDay(world.getClocks());
            return (double)((time % period + period) % period) / period;
        }
        long dimTime = world.getDimensionTime();
        return (double)((dimTime % 24000L + 24000L) % 24000L) / 24000.;
    }

    private @Nullable Timeline timeline;
    private int period = 24000;
    private boolean timelineResolved = false;
    private @Nullable List<DoubleInterval> durations;

    public RodWithLampBlockEntity(BlockPos p, BlockState st) {
        super(TYPE, p, st);
    }

    private void ensureTimeline(World w) {
        if (!this.timelineResolved) {
            this.timelineResolved = true;
            for (RegistryEntry<Timeline> e : w.getDimension().timelines()) {
                if (e.matchesKey(Timelines.DAY)) {
                    this.timeline = e.value();
                    break;
                }
            }
            if (this.timeline == null) {
                var opt = w.getRegistryManager().getOptionalEntry(Timelines.DAY);
                if (opt.isPresent()) {
                    this.timeline = opt.get().value();
                }
            }
            if (this.timeline != null && this.timeline.getPeriod().isPresent()) {
                this.period = this.timeline.getPeriod().get();
            }
        }
    }

    public @Nullable List<DoubleInterval> getDurations() {
        return this.durations;
    }

    public void setDurations(@Nullable Collection<DoubleInterval> intervals) {
        this.durations =
        intervals != null ? DoubleIntervalHelper.unionAll(intervals) : null;
    }

    public void setDuration(@Nullable Integer durationCode) {
        this.durations =
        durationCode != null ? fromLegacyDuration(durationCode) : null;
    }

    public void setDurationFromString(@Nullable String str) {
        this.durations = DoubleIntervalHelper.parseString(str);
    }

    @Override
    protected void writeData(WriteView view) {
        super.writeData(view);
        if (this.durations != null && !this.durations.isEmpty()) {
            view.put("Duration", DoubleInterval.LIST_CODEC, this.durations);
        }
    }

    @Override
    protected void readData(ReadView view) {
        super.readData(view);
        this.durations = view.read("Duration", CODEC_WITH_LEGACY).orElse(null);
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

    public void tick(World w, BlockPos p, BlockState st) {
        this.ensureTimeline(w);
        long t = (this.timeline != null) ?
                 this.timeline.getEffectiveTimeOfDay(w.getClocks()) :
                 w.getDimensionTime();
        double relTime =
        (double)((t % this.period + this.period) % this.period) / this.period;
        w.setBlockState(p, st.withIfExists(
            LIT, DoubleIntervalHelper.contains(this.durations, relTime)
        ), 3);
    }
}
