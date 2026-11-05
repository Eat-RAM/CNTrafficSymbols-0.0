package io.github.eat_ram.cntrafficsymbols.v0d0.client.screen;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.HighwayHmSignBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayHmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.network
       .UpdateTrafficSignPayload;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.input.KeyInput;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;

import static io.github.eat_ram.cntrafficsymbols.core.client.helper.I18nHelper
              .tagTr;

public class HighwayHmSignEditScreen extends Screen {
    private final HighwayHmSignBlockEntity be;
    private final int hmDigit;
    private TextFieldWidget nameField;

    public HighwayHmSignEditScreen(HighwayHmSignBlockEntity be) {
        super(tagTr("gui.cntrafficsymbols_0d0.edit_highway_hm_sign"));
        this.be = be;
        this.hmDigit = HighwayHmSignBlock.getHmDigit(
            be.getCachedState().getBlock()
        );
    }

    @Override
    protected void init() {
        int cx = this.width / 2;
        int y = 92;

        this.nameField = new TextFieldWidget(
            this.textRenderer, cx - 100, y, 200, 20,
            tagTr("gui.cntrafficsymbols_0d0.road_number")
        );
        Text cn = this.be.getCustomName();
        this.nameField.setText(cn != null ? cn.getString() : "");
        this.nameField.setMaxLength(32);
        this.addDrawableChild(this.nameField);

        y += 34;
        this.addDrawableChild(ButtonWidget.builder(
            ScreenTexts.DONE, b -> this.saveAndClose()
        ).dimensions(cx - 105, y, 100, 20).build());
        this.addDrawableChild(ButtonWidget.builder(
            ScreenTexts.CANCEL, b -> this.close()
        ).dimensions(cx + 5, y, 100, 20).build());

        this.setInitialFocus(this.nameField);
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
        NbtCompound nbt = new NbtCompound();
        nbt.putString("CustomName", this.nameField.getText().strip());
        net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
        .send(new UpdateTrafficSignPayload(this.be.getPos(), nbt));
        this.close();
    }

    private void renderPreview(DrawContext context, int cx, int y) {
        int pw = 52;
        int ph = 52;
        int px = cx - pw / 2;

        context.fill(px, y, px + pw, y + ph / 2, 0xFF007A3D);
        context.fill(px, y + ph / 2, px + pw, y + ph, 0xFFF5F5F5);
        context.fill(px, y + ph / 2 - 1, px + pw, y + ph / 2, 0xFF009030);
        context.drawStrokedRectangle(px, y, pw, ph, 0xFF009030);

        String topText = Integer.toString(this.hmDigit);
        context.drawCenteredTextWithShadow(
            this.textRenderer, Text.literal(topText), cx, y + 8, 0xFFFFFFFF
        );

        String bottomText = this.nameField.getText().strip();
        if (!bottomText.isEmpty()) {
            int w = this.textRenderer.getWidth(bottomText);
            if (w > 44) {
                float scale = 44f / w;
                context.getMatrices().pushMatrix();
                context.getMatrices().translate((float)cx, (float)(y + 34));
                context.getMatrices().scale(scale, scale);
                context.drawText(
                    this.textRenderer, bottomText, -w / 2, 0,
                    0xFF009030, false
                );
                context.getMatrices().popMatrix();
            } else {
                context.drawText(
                    this.textRenderer, bottomText, cx - w / 2, y + 34,
                    0xFF009030, false
                );
            }
        }
    }

    @Override
    public void render(
        DrawContext context, int mouseX, int mouseY, float delta
    ) {
        this.renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        int cx = this.width / 2;

        context.drawCenteredTextWithShadow(
            this.textRenderer, this.title, cx, 8, 0xFFFFFFFF
        );

        this.renderPreview(context, cx, 22);

        context.drawTextWithShadow(this.textRenderer, tagTr(
            "gui.cntrafficsymbols_0d0.road_number.entry"
        ), cx - 100, 80, 0xFFA0A0A0);
    }
}
