package io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be;

import io.github.eat_ram.cntrafficsymbols.core.helper.TimelineHelper;
import io.github.eat_ram.cntrafficsymbols.core.struct.LampSignal;
import io.github.eat_ram.cntrafficsymbols.core.struct.TrafficAttach7;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .CountdownTimerBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.render
       .SegmentDigitRenderer;
import io.github.eat_ram.cntrafficsymbols.core.traffic.ClientTrafficLightCache;
import io.github.eat_ram.cntrafficsymbols.core.traffic.TrafficLightGroup;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.World;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.state.property.Properties.HORIZONTAL_FACING;

public class CountdownTimerBERenderer
implements CustomBERenderer<CountdownTimerBlockEntity> {
    private static final float DIGIT_WIDTH = 3.8f / 16f;
    private static final float DIGIT_HEIGHT = 7.6f / 16f;
    private static final float DIGIT_SPACING = 4.6f / 16f;

    @Contract(pure = true)
    private static float getFaceZ(TrafficAttach7 attach) {
        if (attach == TrafficAttach7.CEILING) {
            return 10.005f / 16f;
        } else if (attach == TrafficAttach7.CENTER) {
            return 8.005f / 16f;
        }
        return 2.005f / 16f;
    }

    @Contract(pure = true)
    private static float getCenterX(TrafficAttach7 attach) {
        if (attach == TrafficAttach7.LEFT) {
            return 5.5f / 16f;
        } else if (attach == TrafficAttach7.RIGHT) {
            return 10.5f / 16f;
        }
        return 0.5f;
    }

    @Contract(pure = true)
    private static float getCenterY(TrafficAttach7 attach) {
        if (attach == TrafficAttach7.UP ||
            attach == TrafficAttach7.CEILING) {
            return 11f / 16f;
        } else if (attach == TrafficAttach7.DOWN) {
            return 5f / 16f;
        }
        return 0.5f;
    }

    @Contract(value = "_ -> new", pure = true)
    public static int @NotNull[] getSignalRgb(LampSignal signal) {
        return switch (signal) {
            case RED -> new int[]{255, 32, 32};
            case YELLOW, YELLOW_FLASHING -> new int[]{255, 184, 0};
            case GREEN, GREEN_FLASHING -> new int[]{0, 230, 118};
            default -> new int[]{0, 0, 0};
        };
    }

    public CountdownTimerBERenderer(BlockEntityRendererFactory.Context ctx) {}

    @Override
    public void render(
        CustomBERenderState<CountdownTimerBlockEntity> state,
        MatrixStack matrices, OrderedRenderCommandQueue queue,
        CameraRenderState cameraState
    ) {
        CountdownTimerBlockEntity be = state.blockEntity;
        World world = be.getWorld();
        if (world == null) {
            return;
        }
        BlockPos pos = be.getPos();
        TrafficLightGroup group = ClientTrafficLightCache.getGroupByPos(pos);
        if (group == null) {
            return;
        }
        BlockPos boundPos = group.getCountdownBindings().get(pos);
        if (boundPos == null || !group.getLights().containsKey(boundPos)) {
            return;
        }

        long time =
        TimelineHelper.getEffectiveTime(world, group.syncWithDayNight);
        int remSec =
        group.getRemainingSecondsForCountdown(time, boundPos, true);
        LampSignal colorSig = group.getActiveCountdownColor(time, boundPos);
        if (remSec < 0 || colorSig == null) {
            return;
        }

        int[] rgb = getSignalRgb(colorSig);
        BlockState bst = be.getCachedState();
        Direction facing = bst.get(HORIZONTAL_FACING);
        TrafficAttach7 attach = bst.get(TrafficAttach7.ATTACHMENT);

        float z = getFaceZ(attach);
        float cx = getCenterX(attach);
        float cy = getCenterY(attach);

        matrices.push();
        matrices.translate(0.5f, 0.5f, 0.5f);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(
            -facing.getPositiveHorizontalDegrees()
        ));
        matrices.translate(-0.5f, -0.5f, -0.5f);

        SegmentDigitRenderer.renderDigits(
            matrices, queue, cx, cy, z, DIGIT_WIDTH, DIGIT_HEIGHT,
            DIGIT_SPACING, remSec, rgb[0], rgb[1], rgb[2], 255
        );

        matrices.pop();
    }
}
