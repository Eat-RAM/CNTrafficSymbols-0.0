package rege.pegui.cntrafficsymbols.be;

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
import rege.pegui.cntrafficsymbols.SelfWork.Blocks;

public class HighwayExitDistanceInfoNameBlockEntity extends BlockEntity
implements Nameable {
    public static final BlockEntityType<HighwayExitDistanceInfoNameBlockEntity>
    TYPE = BlockEntityType.Builder.create(
        HighwayExitDistanceInfoNameBlockEntity::new,
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE,
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP,
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM,
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE,
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE,
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP,
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM,
        Blocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE
    ).build();

    private @Nullable Text customName;

    public HighwayExitDistanceInfoNameBlockEntity(BlockPos p, BlockState st) {
        super(TYPE, p, st);
    }

    @Override
    public Text getName() {
        return (this.customName == null) ? Text.translatable(
            "block.cntrafficsymbols_0d0.highway_exit_distance_info_name"
        ) : this.customName;
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
