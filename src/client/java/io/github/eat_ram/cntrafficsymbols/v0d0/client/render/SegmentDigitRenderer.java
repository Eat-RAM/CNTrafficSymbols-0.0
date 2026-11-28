package io.github.eat_ram.cntrafficsymbols.v0d0.client.render;

import io.github.eat_ram.cntrafficsymbols.v0d0.helper.RegisterHelper;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.client.render.OverlayTexture.DEFAULT_UV;

public abstract class SegmentDigitRenderer {
    private static final Identifier @NotNull[] DIGIT_TEXTURES =
    new Identifier[16];

    @Contract(pure = true)
    public static Identifier getDigitTexture(int digit) {
        return DIGIT_TEXTURES[(digit < 0 || digit > 15) ? 0 : digit];
    }

    public static void renderDigits(
        MatrixStack matrices, @NotNull VertexConsumerProvider vcs,
        float cx, float cy, float z, float digitWidth, float digitHeight,
        float digitSpacing, int number, int r, int g, int b, int a
    ) {
        if (number < 0) {
            return;
        }
        int clamped = Math.min(number, 159);
        int tens = clamped / 10;
        int ones = clamped % 10;

        float halfSpacing = digitSpacing * 0.5f;
        if (tens > 0) {
            renderSingleDigit(
                matrices, vcs, cx - halfSpacing, cy, z,
                digitWidth, digitHeight, tens, r, g, b, a
            );
        }
        renderSingleDigit(
            matrices, vcs, cx + halfSpacing, cy, z,
            digitWidth, digitHeight, ones, r, g, b, a
        );
    }

    public static void renderSingleDigit(
        MatrixStack matrices, @NotNull VertexConsumerProvider vcs,
        float xCenter, float yCenter, float z, float w, float h, int digit,
        int r, int g, int b, int a
    ) {
        Identifier tex = getDigitTexture(digit);
        float x1 = xCenter - w * 0.5f;
        float x2 = xCenter + w * 0.5f;
        float y1 = yCenter - h * 0.5f;
        float y2 = yCenter + h * 0.5f;

        VertexConsumer vc =
        vcs.getBuffer(RenderLayer.getEntityTranslucentEmissive(tex));
        MatrixStack.Entry entry = matrices.peek();
        vc.vertex(entry.getPositionMatrix(), x1, y1, z).color(r, g, b, a)
        .texture(0f, 1f).overlay(DEFAULT_UV).light(15728880)
        .normal(entry.getNormalMatrix(), 0f, 0f, 1f).next();
        vc.vertex(entry.getPositionMatrix(), x2, y1, z).color(r, g, b, a)
        .texture(1f, 1f).overlay(DEFAULT_UV).light(15728880)
        .normal(entry.getNormalMatrix(), 0f, 0f, 1f).next();
        vc.vertex(entry.getPositionMatrix(), x2, y2, z).color(r, g, b, a)
        .texture(1f, 0f).overlay(DEFAULT_UV).light(15728880)
        .normal(entry.getNormalMatrix(), 0f, 0f, 1f).next();
        vc.vertex(entry.getPositionMatrix(), x1, y2, z).color(r, g, b, a)
        .texture(0f, 0f).overlay(DEFAULT_UV).light(15728880)
        .normal(entry.getNormalMatrix(), 0f, 0f, 1f).next();
    }

    static {
        for (int i = 0; i < 16; i++) {
            DIGIT_TEXTURES[i] = RegisterHelper.nsId(
                "textures/entity/traffic_light/digit_" +
                Integer.toHexString(i) + ".png"
            );
        }
    }

    @Contract(value = "-> fail", pure = true)
    private SegmentDigitRenderer() {
        throw new UnsupportedOperationException("Utility class");
    }
}
