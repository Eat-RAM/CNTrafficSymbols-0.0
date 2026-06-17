package rege.pegui.cntrafficsymbols.be;

import net.fabricmc.fabric.api.object.builder.v1.block.entity
       .FabricBlockEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.text.Text;
import net.minecraft.text.TextCodecs;
import net.minecraft.util.Nameable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import rege.pegui.cntrafficsymbols.SelfWork.Blocks;

import static net.minecraft.state.property.Properties.LIT;

public class RodWithLampBlockEntity extends BlockEntity implements Nameable {
    public static final BlockEntityType<RodWithLampBlockEntity> TYPE =
    FabricBlockEntityTypeBuilder.create(
        RodWithLampBlockEntity::new, Blocks.WHITE_ROD_WITH_LAMP,
        Blocks.ORANGE_ROD_WITH_LAMP, Blocks.MAGENTA_ROD_WITH_LAMP,
        Blocks.LIGHT_BLUE_ROD_WITH_LAMP, Blocks.YELLOW_ROD_WITH_LAMP,
        Blocks.LIME_ROD_WITH_LAMP, Blocks.PINK_ROD_WITH_LAMP,
        Blocks.GRAY_ROD_WITH_LAMP, Blocks.LIGHT_GRAY_ROD_WITH_LAMP,
        Blocks.CYAN_ROD_WITH_LAMP, Blocks.PURPLE_ROD_WITH_LAMP,
        Blocks.BLUE_ROD_WITH_LAMP, Blocks.BROWN_ROD_WITH_LAMP,
        Blocks.GREEN_ROD_WITH_LAMP, Blocks.RED_ROD_WITH_LAMP,
        Blocks.BLACK_ROD_WITH_LAMP
    ).build();
    public static final Integer OVERALL_DURATION = Integer.valueOf(23999);

    public static int canonicalizeDuration(int duration) {
        return ((((duration & 0b111111111111111000000000000000) >> 15) % 24000)
                << 15) | ((duration & 0b111111111111111) % 24000);
    }

    public static boolean isOverall(int duration) {
        duration = canonicalizeDuration(duration);
        return duration == 23999 ||
               ((duration >> 15) - (duration & 0b111111111111111)) == 1;
    }

    public static boolean shouldLit(int duration, short daytime) {
        if (isOverall(duration)) {
            return true;
        }
        duration = canonicalizeDuration(duration);
        daytime %= 24000;
        int start = duration >> 15;
        int end = duration & 0b111111111111111;
        return (end >= start) ? start <= daytime && daytime <= end :
               (daytime >= start || daytime <= end);
    }

    public RodWithLampBlockEntity(BlockPos p, BlockState st) {
        super(TYPE, p, st);
    }

    private @Nullable Integer duration;

    @Override
    public Text getName() {
        return (this.duration == null) ? Text.translatable(
            "block.cntrafficsymbols_0d0.rod_with_lamp"
        ) : Text.literal(this.duration.toString());
    }

    @Override
    public @Nullable Text getCustomName() {
        return (this.duration != null) ?
               Text.literal(this.duration.toString()) : null;
    }

    public void setDuration(@Nullable Integer durationCode) {
        this.duration = (durationCode != null) ?
                        canonicalizeDuration(durationCode) : null;
    }

    @Override
    protected void writeData(WriteView view) {
        super.writeData(view);
        if (this.duration != null) {
            view.putInt("Duration", this.duration.intValue());
            view.put("CustomName", TextCodecs.CODEC, this.getName());
        }
    }

    @Override
    protected void readData(ReadView view) {
        super.readData(view);
        view.getOptionalInt("Duration").ifPresent(integer -> {
            int a = canonicalizeDuration(integer);
            this.duration = isOverall(a) ? OVERALL_DURATION :
                            Integer.valueOf(a);
        });
    }

    public void tick(World w, BlockPos p, BlockState st) {
        w.setBlockState(p, st.withIfExists(
            LIT, this.duration != null && shouldLit(
                this.duration.intValue(), (short)(w.getDimensionTime() % 24000)
            )
        ), 3);
    }
}
