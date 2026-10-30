package io.github.eat_ram.cntrafficsymbols.v0d0.client.screen;

import io.github.eat_ram.cntrafficsymbols.core.client.gui
       .NumericTextFieldWidget;
import io.github.eat_ram.cntrafficsymbols.v0d0.block
       .HighwayExitDistanceInfoParts;
import io.github.eat_ram.cntrafficsymbols.v0d0.network
       .UpdateTrafficSignPayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.input.KeyInput;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.math.Direction;

import static io.github.eat_ram.cntrafficsymbols.core.client.helper.I18nHelper
              .tagTr;

public class HighwayExitInfoEditScreen extends Screen {
    private final HighwayExitDistanceInfoParts parts;
    private TextFieldWidget toLeftField;
    private TextFieldWidget toMiddleField;
    private NumericTextFieldWidget kmField;
    private boolean locked;

    public HighwayExitInfoEditScreen(HighwayExitDistanceInfoParts parts) {
        super(tagTr(
            "gui.cntrafficsymbols_0d0.highway_exit_distance_info.title", ""
        ));
        this.parts = parts;
        this.locked =
        parts.kmBe != null && Math.copySign(1f, parts.kmBe.getKm()) == -1f;
    }

    @Override
    protected void init() {
        int cx = this.width / 2;
        int count = (this.parts.leftBe != null ? 1 : 0) +
                    (this.parts.middleBe != null ? 1 : 0) +
                    (this.parts.kmBe != null ? 1 : 0);
        int y = (count == 3) ? 76 : (count == 2 ? 86 : 98);

        if (this.parts.leftBe != null) {
            this.toLeftField = new TextFieldWidget(
                this.textRenderer, cx - 111, y, 222, 20, tagTr(
                    "gui.cntrafficsymbols_0d0.highway_exit_distance_info.line1"
                )
            );
            Text cn = this.parts.leftBe.getCustomName();
            this.toLeftField.setText(cn != null ? cn.getString() : "");
            this.toLeftField.setMaxLength(64);
            this.addDrawableChild(this.toLeftField);
            y += 34;
        }

        if (this.parts.middleBe != null) {
            this.toMiddleField = new TextFieldWidget(
                this.textRenderer, cx - 111, y, 222, 20, tagTr(
                    "gui.cntrafficsymbols_0d0.highway_exit_distance_info.line2"
                )
            );
            Text cn = this.parts.middleBe.getCustomName();
            this.toMiddleField.setText(cn != null ? cn.getString() : "");
            this.toMiddleField.setMaxLength(64);
            this.addDrawableChild(this.toMiddleField);
            y += 34;
        }

        if (this.parts.kmBe != null) {
            this.kmField = new NumericTextFieldWidget(
                this.textRenderer, cx - 111, y, 54, 20,
                tagTr("gui.cntrafficsymbols_0d0.distance.name"), true
            );
            this.kmField.setText(this.parts.kmBe.getKmStr());
            this.kmField.setMaxLength(8);
            this.addDrawableChild(this.kmField);

            this.addDrawableChild(ButtonWidget.builder(
                tagTr("gui.cntrafficsymbols_0d0.distance.500m"),
                b -> this.kmField.setText("0.5")
            ).dimensions(cx - 53, y, 40, 20).build());
            this.addDrawableChild(ButtonWidget.builder(
                tagTr("gui.cntrafficsymbols_0d0.distance.1km"),
                b -> this.kmField.setText("1")
            ).dimensions(cx - 9, y, 38, 20).build());
            this.addDrawableChild(ButtonWidget.builder(
                tagTr("gui.cntrafficsymbols_0d0.distance.2km"),
                b -> this.kmField.setText("2")
            ).dimensions(cx + 33, y, 38, 20).build());
            this.addDrawableChild(ButtonWidget.builder(
                tagTr("gui.cntrafficsymbols_0d0.distance.3km"),
                b -> this.kmField.setText("3")
            ).dimensions(cx + 75, y, 36, 20).build());
            y += 34;
            this.addDrawableChild(ButtonWidget.builder(
                HighwayKmSignEditScreen.getLockText(this.locked), b -> {
                    this.locked = !this.locked;
                    b.setMessage(HighwayKmSignEditScreen.getLockText(
                        this.locked
                    ));
                    b.setTooltip(Tooltip.of(tagTr(
                        this.locked ?
                        "gui.cntrafficsymbols_0d0.locked.on.tooltip" :
                        "gui.cntrafficsymbols_0d0.locked.off.tooltip"
                    )));
                }
            ).dimensions(cx - 100, y, 200, 20).tooltip(Tooltip.of(tagTr(
                this.locked ? "gui.cntrafficsymbols_0d0.locked.on.tooltip" :
                "gui.cntrafficsymbols_0d0.locked.off.tooltip"
            ))).build());
            y += 34;
        }

        y += 4;
        this.addDrawableChild(ButtonWidget.builder(
            ScreenTexts.DONE, b -> this.saveAndClose()
        ).dimensions(cx - 105, y, 100, 20).build());
        this.addDrawableChild(ButtonWidget.builder(
            ScreenTexts.CANCEL, b -> this.close()
        ).dimensions(cx + 5, y, 100, 20).build());

        if (this.toLeftField != null) {
            this.setInitialFocus(this.toLeftField);
        } else if (this.toMiddleField != null) {
            this.setInitialFocus(this.toMiddleField);
        } else if (this.kmField != null) {
            this.setInitialFocus(this.kmField);
        }
    }

    @Override
    public boolean keyPressed(KeyInput input) {
        if (super.keyPressed(input)) {
            return true;
        }
        if (input.isEnter()) {
            this.saveAndClose();
            return true;
        }
        return false;
    }

    private void saveAndClose() {
        if (this.parts.leftBe != null && this.parts.leftPos != null &&
            this.toLeftField != null) {
            NbtCompound nbt = new NbtCompound();
            nbt.putString("CustomName", this.toLeftField.getText());
            ClientPlayNetworking.send(
                new UpdateTrafficSignPayload(this.parts.leftPos, nbt)
            );
        }
        if (this.parts.middleBe != null && this.parts.middlePos != null &&
            this.toMiddleField != null) {
            NbtCompound nbt = new NbtCompound();
            nbt.putString("CustomName", this.toMiddleField.getText());
            ClientPlayNetworking.send(
                new UpdateTrafficSignPayload(this.parts.middlePos, nbt)
            );
        }
        if (this.parts.kmBe != null && this.parts.kmPos != null &&
            this.kmField != null) {
            float km = 0f;
            try {
                km = Float.parseFloat(this.kmField.getText().strip());
            } catch (NumberFormatException ignored) {}
            km = Math.copySign(km, this.locked ? -1f : 1f);
            NbtCompound nbt = new NbtCompound();
            nbt.putFloat("km", km);
            ClientPlayNetworking.send(
                new UpdateTrafficSignPayload(this.parts.kmPos, nbt)
            );
        }
        this.close();
    }

    private void drawScaledCenteredText(
        DrawContext context, String text, int centerX, int y, float scale,
        int color
    ) {
        if (text.isEmpty()) {
            return;
        }
        int w = this.textRenderer.getWidth(text);
        if (Math.abs(scale - 1f) < 0.01f) {
            context.drawCenteredTextWithShadow(
                this.textRenderer, text, centerX, y, color
            );
            return;
        }
        context.getMatrices().pushMatrix();
        context.getMatrices().translate((float)centerX, (float)y);
        context.getMatrices().scale(scale, scale);
        context.drawTextWithShadow(this.textRenderer, text, -w / 2, 0, color);
        context.getMatrices().popMatrix();
    }

    private void renderPreview(DrawContext context, int cx, int y) {
        int pw = 222;
        int ph = 44;
        int px = cx - pw / 2;

        context.fill(px, y, px + pw, y + ph, 0xFF006633);
        context.drawStrokedRectangle(px, y, pw, ph, 0xFFFFFFFF);

        boolean hasDistance = this.parts.kmBe != null;
        int exitAreaW = hasDistance ? (pw / 3) : 0;
        int nameAreaW = pw - exitAreaW;

        String ltx = (this.toLeftField != null) ?
                     this.toLeftField.getText().strip() : "";
        int lColor = 0xFFFFFFFF;

        String mtx = (this.toMiddleField != null) ?
                     this.toMiddleField.getText().strip() : "";
        int mColor = 0xFFFFFFFF;

        int nameCenterX = px + nameAreaW / 2;
        float maxAvailableW = nameAreaW - 12;

        if (this.parts.leftBe != null && this.parts.middleBe != null) {
            int lw = this.textRenderer.getWidth(ltx);
            int mw = this.textRenderer.getWidth(mtx);

            float lScale = 2f;
            if (lw * lScale > maxAvailableW && lw > 0) {
                lScale = maxAvailableW / lw;
            }
            float mScale = lScale / 2f;
            if (mw * mScale > maxAvailableW && mw > 0) {
                mScale = maxAvailableW / mw;
                lScale = mScale * 2f;
            }

            int totalH = Math.round(9 * lScale + 3 + 9 * mScale);
            int startY = y + Math.max(3, (ph - totalH) / 2);
            int pyY = startY + Math.round(9 * lScale) + 3;

            this.drawScaledCenteredText(
                context, ltx, nameCenterX, startY, lScale, lColor
            );
            this.drawScaledCenteredText(
                context, mtx, nameCenterX, pyY, mScale, mColor
            );
        } else if (this.parts.leftBe != null) {
            int lw = this.textRenderer.getWidth(ltx);
            float lScale = 2f;
            if (lw * lScale > maxAvailableW && lw > 0) {
                lScale = maxAvailableW / lw;
            }
            int startY = y + (ph - Math.round(9 * lScale)) / 2;
            this.drawScaledCenteredText(
                context, ltx, nameCenterX, startY, lScale, lColor
            );
        } else if (this.parts.middleBe != null) {
            int mw = this.textRenderer.getWidth(mtx);
            float mScale = 1f;
            if (mw * mScale > maxAvailableW && mw > 0) {
                mScale = maxAvailableW / mw;
            }
            int startY = y + (ph - Math.round(9 * mScale)) / 2;
            this.drawScaledCenteredText(
                context, mtx, nameCenterX, startY, mScale, mColor
            );
        }

        if (hasDistance) {
            context.fill(
                px + nameAreaW, y + 4, px + nameAreaW + 1, y + ph - 4,
                0x88FFFFFF
            );
            int exitCenterX = px + nameAreaW + exitAreaW / 2;
            String kmTx = (this.kmField != null) ?
                          this.kmField.getText().strip() : "";
            if (kmTx.isEmpty()) {
                kmTx = "--";
            }
            context.drawCenteredTextWithShadow(this.textRenderer, tagTr(
                "gui.cntrafficsymbols_0d0.highway_exit_distance_info.exit"
            ), exitCenterX, y + 10, 0xC0FFFFFF);
            context.drawCenteredTextWithShadow(
                this.textRenderer, Text.literal(kmTx + "km"),
                exitCenterX, y + 24, 0xFFFFFFFF
            );
        }
    }

    @Override
    public void render(
        DrawContext context, int mouseX, int mouseY, float delta
    ) {
        this.renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        int cx = this.width / 2;
        int count = (this.parts.leftBe != null ? 1 : 0) +
                    (this.parts.middleBe != null ? 1 : 0) +
                    (this.parts.kmBe != null ? 1 : 0);
        int y = (count == 3) ? 76 : (count == 2 ? 86 : 98);

        String sideHint = "";
        if (this.parts.facingId == 4) {
            sideHint = I18n.translate(
this.parts.hitSide == Direction.NORTH ?
"gui.cntrafficsymbols_0d0.highway_exit_distance_info.side.north" :
"gui.cntrafficsymbols_0d0.highway_exit_distance_info.side.south"
            );
        } else if (this.parts.facingId == 5) {
            sideHint = I18n.translate(
                this.parts.hitSide == Direction.NORTH ?
                "gui.cntrafficsymbols_0d0.highway_exit_distance_info.side.east"
              : "gui.cntrafficsymbols_0d0.highway_exit_distance_info.side.west"
            );
        }
        Text fullTitle = tagTr(
            "gui.cntrafficsymbols_0d0.highway_exit_distance_info.title",
            sideHint
        );

        context.drawCenteredTextWithShadow(
            this.textRenderer, fullTitle, cx, 6, 0xFFFFFFFF
        );

        this.renderPreview(context, cx, 18);

        if (this.parts.leftBe != null && this.parts.middleBe == null) {
            context.drawCenteredTextWithShadow(this.textRenderer, tagTr(
"gui.cntrafficsymbols_0d0.highway_exit_distance_info.no_middle_found"
            ), cx, 64, 0xFFFFAA00);
        } else if (this.parts.leftBe == null && this.parts.middleBe != null) {
            context.drawCenteredTextWithShadow(this.textRenderer, tagTr(
"gui.cntrafficsymbols_0d0.highway_exit_distance_info.no_left_found"
            ), cx, 64, 0xFFFFAA00);
        }

        if (this.parts.leftBe != null) {
            context.drawTextWithShadow(this.textRenderer, tagTr(
            "gui.cntrafficsymbols_0d0.highway_exit_distance_info.line1.entry"
            ), cx - 111, y - 10, 0xFFA0A0A0);
            y += 34;
        }

        if (this.parts.middleBe != null) {
            context.drawTextWithShadow(this.textRenderer, tagTr(
            "gui.cntrafficsymbols_0d0.highway_exit_distance_info.line2.entry"
            ), cx - 111, y - 10, 0xFFA0A0A0);
            y += 34;
        }

        if (this.parts.kmBe != null) {
            context.drawTextWithShadow(this.textRenderer, tagTr(
            "gui.cntrafficsymbols_0d0.highway_exit_distance_info.right.entry"
            ), cx - 111, y - 10, 0xFFA0A0A0);
        }
    }
}
