package io.github.eat_ram.cntrafficsymbols.v0d0.client.screen;

import io.github.eat_ram.cntrafficsymbols.core.client.gui
       .NumericTextFieldWidget;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayKmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.network
       .UpdateTrafficSignPayload;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.CheckboxWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.input.KeyInput;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

import static io.github.eat_ram.cntrafficsymbols.core.client.helper.I18nHelper
              .tagTr;

public class HighwayKmSignEditScreen extends Screen {
    private final HighwayKmSignBlockEntity be;
    private NumericTextFieldWidget kmField;
    private TextFieldWidget nameField;
    private CheckboxWidget pointFiveCheckbox;
    private boolean locked;
    private ButtonWidget lockButton;

    public HighwayKmSignEditScreen(HighwayKmSignBlockEntity be) {
        super(tagTr("gui.cntrafficsymbols_0d0.edit_highway_km_sign"));
        this.be = be;
        this.locked = be.getKm() < 0;
    }

    @Override
    protected void init() {
        int cx = this.width / 2;
        int y = 82;

        this.kmField = new NumericTextFieldWidget(
            this.textRenderer, cx - 100, y, 68, 20,
            tagTr("gui.cntrafficsymbols_0d0.km_marker"), false
        );
        int currentKm = this.be.getKm();
        this.kmField
        .setText(Integer.toString(currentKm < 0 ? ~currentKm : currentKm));
        this.kmField.setMaxLength(5);
        this.addDrawableChild(this.kmField);

        this.addDrawableChild(ButtonWidget.builder(tagTr(
            "gui.cntrafficsymbols_0d0.decrease_by.10"
        ), b -> this.adjustKm(-10)).dimensions(cx - 28, y, 30, 20).build());
        this.addDrawableChild(ButtonWidget.builder(tagTr(
            "gui.cntrafficsymbols_0d0.decrease_by.1"
        ), b -> this.adjustKm(-1)).dimensions(cx + 4, y, 26, 20).build());
        this.addDrawableChild(ButtonWidget.builder(tagTr(
            "gui.cntrafficsymbols_0d0.increase_by.1"
        ), b -> this.adjustKm(1)).dimensions(cx + 32, y, 26, 20).build());
        this.addDrawableChild(ButtonWidget.builder(tagTr(
            "gui.cntrafficsymbols_0d0.increase_by.10"
        ), b -> this.adjustKm(10)).dimensions(cx + 60, y, 30, 20).build());

        y += 24;
        this.pointFiveCheckbox = CheckboxWidget.builder(
            tagTr("gui.cntrafficsymbols_0d0.has_half_km"), this.textRenderer
        ).pos(cx - 100, y).checked(this.be.isPointFive()).build();
        this.addDrawableChild(this.pointFiveCheckbox);

        y += 34;
        this.nameField = new TextFieldWidget(
            this.textRenderer, cx - 100, y, 200, 20,
            tagTr("gui.cntrafficsymbols_0d0.road_number_or_name")
        );
        Text cn = this.be.getCustomName();
        this.nameField.setText(cn != null ? cn.getString() : "");
        this.nameField.setMaxLength(64);
        this.addDrawableChild(this.nameField);

        y += 24;
        this.lockButton = ButtonWidget.builder(getLockText(this.locked), b -> {
            this.locked = !this.locked;
            b.setMessage(getLockText(this.locked));
            b.setTooltip(Tooltip.of(tagTr(
                this.locked ? "gui.cntrafficsymbols_0d0.locked.on.tooltip" :
                "gui.cntrafficsymbols_0d0.locked.off.tooltip"
            )));
        }).dimensions(cx - 100, y, 200, 20).tooltip(Tooltip.of(tagTr(
            this.locked ? "gui.cntrafficsymbols_0d0.locked.on.tooltip" :
            "gui.cntrafficsymbols_0d0.locked.off.tooltip"
        ))).build();
        this.addDrawableChild(this.lockButton);

        y += 28;
        this.addDrawableChild(ButtonWidget.builder(
            ScreenTexts.DONE, b -> this.saveAndClose()
        ).dimensions(cx - 105, y, 100, 20).build());
        this.addDrawableChild(ButtonWidget.builder(
            ScreenTexts.CANCEL, b -> this.close()
        ).dimensions(cx + 5, y, 100, 20).build());

        this.setInitialFocus(this.kmField);
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

    public static MutableText getLockText(boolean locked) {
        return tagTr(locked ? "gui.cntrafficsymbols_0d0.locked.on" :
                     "gui.cntrafficsymbols_0d0.locked.off");
    }

    private void adjustKm(int delta) {
        int v = 0;
        try {
            v = Integer.parseInt(this.kmField.getText().strip());
        } catch (NumberFormatException ignored) {}
        v = Math.max(0, Math.min(99999, v + delta));
        this.kmField.setText(Integer.toString(v));
    }

    private void saveAndClose() {
        int v = 0;
        try {
            v = Integer.parseInt(this.kmField.getText().strip());
        } catch (NumberFormatException ignored) {}
        v = Math.max(0, Math.min(99999, v));
        if (this.locked) {
            v = ~v;
        }

        NbtCompound nbt = new NbtCompound();
        nbt.putInt("km", v);
        nbt.putBoolean("PointFive", this.pointFiveCheckbox.isChecked());
        nbt.putString("CustomName", this.nameField.getText());

        net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
        .send(new UpdateTrafficSignPayload(this.be.getPos(), nbt));
        this.close();
    }

    private void renderPreview(DrawContext context, int cx, int y) {
        int pw = 70;
        int ph = 46;
        int px = cx - pw / 2;

        context.fill(px, y, px + pw, y + ph, 0xFF007A3D);
        context.drawStrokedRectangle(px, y, pw, ph, 0xFFFFFFFF);
        context.fill(px + 4, y + 22, px + pw - 4, y + 23, 0x88FFFFFF);

        String kmStr = this.kmField.getText().strip();
        if (kmStr.isEmpty()) {
            kmStr = "0";
        }
        if (this.pointFiveCheckbox.isChecked()) {
            kmStr += ".\u2085";
        }
        context.drawCenteredTextWithShadow(
            this.textRenderer, Text.literal(kmStr), cx, y + 7, 0xFFFFFFFF
        );

        String road = this.nameField.getText().strip();
        int roadColor =
        this.nameField.getText().isBlank() ? 0xFFAAAAAA : 0xFFFFFFFF;
        context.drawCenteredTextWithShadow(
            this.textRenderer, road.isEmpty() ? tagTr(
                "gui.cntrafficsymbols_0d0.road_number"
            ) : Text.literal(road), cx, y + 28, roadColor
        );
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
            "gui.cntrafficsymbols_0d0.km_marker.entry"
        ), cx - 100, 71, 0xFFA0A0A0);
        context.drawTextWithShadow(this.textRenderer, tagTr(
            "gui.cntrafficsymbols_0d0.road_number_or_name.entry"
        ), cx - 100, 129, 0xFFA0A0A0);
    }
}
