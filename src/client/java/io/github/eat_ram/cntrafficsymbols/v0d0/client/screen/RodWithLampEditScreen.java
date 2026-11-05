package io.github.eat_ram.cntrafficsymbols.v0d0.client.screen;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import io.github.eat_ram.cntrafficsymbols.core.helper.DoubleIntervalHelper;
import io.github.eat_ram.cntrafficsymbols.core.helper.String2McText;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleInterval;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.RodWithLampBlock
       .LightVisualColor;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .RodWithLampBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.network
       .UpdateTrafficSignPayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.SliderWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.input.KeyInput;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;

import static io.github.eat_ram.cntrafficsymbols.core.client.helper.I18nHelper
              .tagTr;

public class RodWithLampEditScreen extends Screen {
    private final RodWithLampBlockEntity be;
    private LightVisualColor selectedColor;
    private List<DoubleInterval> intervals;
    private int selectedIntervalIndex = -1;
    private boolean updatingFromCode = false;
    private final List<ButtonWidget> colorButtons = new ArrayList<>();
    private ButtonWidget prevBtn;
    private ButtonWidget nextBtn;
    private ButtonWidget intervalInfoBtn;
    private ButtonWidget delBtn;
    private TimeSlider startSlider;
    private TimeSlider endSlider;
    private TextFieldWidget intervalField;
    private ButtonWidget doneBtn;

    public RodWithLampEditScreen(
        RodWithLampBlockEntity be, LightVisualColor color
    ) {
        super(tagTr("gui.cntrafficsymbols_0d0.edit_rod_with_lamp"));
        this.be = be;
        this.selectedColor = color != null ? color : LightVisualColor.WHITE;
        this.intervals = be.getDurations() == null ? new ArrayList<>() :
                         new ArrayList<>(be.getDurations());
        if (!this.intervals.isEmpty()) {
            this.selectedIntervalIndex = 0;
        }
    }

    @Override
    protected void init() {
        int cx = this.width / 2;
        int y = 18;

        this.colorButtons.clear();
        int btnW = 74;
        int spacing = 4;
        int totalW = 4 * btnW + 3 * spacing;
        int startX = cx - totalW / 2;
        for (int i = 0; i < LightVisualColor.VARS.size(); i++) {
            LightVisualColor c = LightVisualColor.VARS.get(i);
            int idx = i;
            ButtonWidget btn = ButtonWidget.builder(
                this.getColorButtonText(c), b -> this.selectColor(idx)
            ).dimensions(startX + i * (btnW + spacing), y, btnW, 20).build();
            this.colorButtons.add(btn);
            this.addDrawableChild(btn);
        }

        y += 24;
        int pW = 74;
        int pStart = cx - (4 * pW + 3 * spacing) / 2;
        this.addDrawableChild(ButtonWidget.builder(
            tagTr("gui.cntrafficsymbols_0d0.constant_light"),
            b -> this.applyPreset(0., 1.)
        ).dimensions(pStart, y, pW, 20).build());
        this.addDrawableChild(ButtonWidget.builder(
            tagTr("gui.cntrafficsymbols_0d0.only_night"),
            b -> this.applyPreset(0.5, 1.)
        ).dimensions(pStart + (pW + spacing), y, pW, 20).build());
        this.addDrawableChild(ButtonWidget.builder(
            tagTr("gui.cntrafficsymbols_0d0.only_day"),
            b -> this.applyPreset(0., 0.5)
        ).dimensions(pStart + 2 * (pW + spacing), y, pW, 20).build());
        this.addDrawableChild(ButtonWidget.builder(
            tagTr("gui.cntrafficsymbols_0d0.always_unlit"),
            b -> this.applyPresetEmpty()
        ).dimensions(pStart + 3 * (pW + spacing), y, pW, 20).build());

        y += 50;
        this.prevBtn = ButtonWidget.builder(
            tagTr("gui.cntrafficsymbols_0d0.page.prev_btn"),
            b -> this.selectPrevInterval()
        ).dimensions(cx - 154, y, 20, 20).build();
        this.addDrawableChild(this.prevBtn);

        this.intervalInfoBtn = ButtonWidget.builder(
            this.getIntervalInfoText(), b -> this.selectNextInterval()
        ).dimensions(cx - 130, y, 128, 20).build();
        this.addDrawableChild(this.intervalInfoBtn);

        this.nextBtn = ButtonWidget.builder(
            tagTr("gui.cntrafficsymbols_0d0.page.next_btn"),
            b -> this.selectNextInterval()
        ).dimensions(cx + 2, y, 20, 20).build();
        this.addDrawableChild(this.nextBtn);

        this.addDrawableChild(ButtonWidget.builder(tagTr(
            "gui.cntrafficsymbols_0d0.add_btn"
        ), b -> this.addInterval()).dimensions(cx + 26, y, 62, 20).build());

        this.delBtn = ButtonWidget.builder(tagTr(
            "gui.cntrafficsymbols_0d0.delete_btn"
        ), b -> this.removeInterval()).dimensions(cx + 92, y, 62, 20).build();
        this.addDrawableChild(this.delBtn);

        double curS = 0.5;
        double curE = 1.;
        if (this.selectedIntervalIndex >= 0 &&
            this.selectedIntervalIndex < this.intervals.size()) {
            DoubleInterval in = this.intervals.get(this.selectedIntervalIndex);
            curS = in.getStart();
            curE = in.getEnd();
        }

        y += 24;
        this.startSlider = new TimeSlider(cx - 154, y, 308, 20, I18n.translate(
            "gui.cntrafficsymbols_0d0.light_on_time"
        ), true, curS);
        this.addDrawableChild(this.startSlider);

        y += 24;
        this.endSlider = new TimeSlider(cx - 154, y, 308, 20, I18n.translate(
            "gui.cntrafficsymbols_0d0.light_off_time"
        ), false, curE);
        this.addDrawableChild(this.endSlider);

        y += 32;
        this.intervalField = new TextFieldWidget(
            this.textRenderer, cx - 154, y, 308, 20,
            tagTr("gui.cntrafficsymbols_0d0.time_interval_text")
        );
        this.intervalField.setMaxLength(512);
        this.intervalField
        .setText(DoubleIntervalHelper.format(this.intervals));
        this.intervalField.setChangedListener(this::onTextChanged);
        this.addDrawableChild(this.intervalField);

        y += 28;
        this.doneBtn = ButtonWidget.builder(
            ScreenTexts.DONE, b -> this.saveAndClose()
        ).dimensions(cx - 105, y, 100, 20).build();
        this.addDrawableChild(this.doneBtn);
        this.addDrawableChild(ButtonWidget.builder(
            ScreenTexts.CANCEL, b -> this.close()
        ).dimensions(cx + 5, y, 100, 20).build());

        this.updateControlsForSelection();
        this.setInitialFocus(this.intervalField);
    }

    private Text getIntervalInfoText() {
        if (this.intervals.isEmpty() || this.selectedIntervalIndex < 0 ||
            this.selectedIntervalIndex >= this.intervals.size()) {
            return tagTr("gui.cntrafficsymbols_0d0.no_interval_selected");
        }
        return tagTr(
            "gui.cntrafficsymbols_0d0.interval.cur_total",
            this.selectedIntervalIndex + 1, this.intervals.size()
        );
    }

    private void updateControlsForSelection() {
        boolean has = (this.selectedIntervalIndex >= 0 &&
                       this.selectedIntervalIndex < this.intervals.size());
        if (this.prevBtn != null) {
            this.prevBtn.active = (this.selectedIntervalIndex > 0);
        }
        if (this.nextBtn != null) {
            this.nextBtn.active =
            has && this.selectedIntervalIndex < this.intervals.size() - 1;
        }
        if (this.delBtn != null) {
            this.delBtn.active = has;
        }
        if (this.startSlider != null) {
            this.startSlider.active = has;
        }
        if (this.endSlider != null) {
            this.endSlider.active = has;
        }
        if (this.intervalInfoBtn != null) {
            this.intervalInfoBtn.setMessage(this.getIntervalInfoText());
        }
        if (has) {
            DoubleInterval in = this.intervals.get(this.selectedIntervalIndex);
            this.updatingFromCode = true;
            if (this.startSlider != null) {
                this.startSlider.setVal(in.getStart());
            }
            if (this.endSlider != null) {
                this.endSlider.setVal(in.getEnd());
            }
            this.updatingFromCode = false;
        }
    }

    private void addInterval() {
        DoubleInterval in = new DoubleInterval(0.5, 1.);
        this.intervals.add(in);
        this.selectedIntervalIndex = this.intervals.size() - 1;
        this.updateControlsForSelection();
        this.syncIntervalFieldText();
    }

    private void removeInterval() {
        if (this.selectedIntervalIndex >= 0 &&
            this.selectedIntervalIndex < this.intervals.size()) {
            this.intervals.remove(this.selectedIntervalIndex);
            if (this.intervals.isEmpty()) {
                this.selectedIntervalIndex = -1;
            } else if (this.selectedIntervalIndex >= this.intervals.size()) {
                this.selectedIntervalIndex = this.intervals.size() - 1;
            }
            this.updateControlsForSelection();
            this.syncIntervalFieldText();
        }
    }

    private void selectPrevInterval() {
        if (this.selectedIntervalIndex > 0) {
            this.selectedIntervalIndex--;
            this.updateControlsForSelection();
        }
    }

    private void selectNextInterval() {
        if (this.selectedIntervalIndex < this.intervals.size() - 1) {
            this.selectedIntervalIndex++;
            this.updateControlsForSelection();
        } else if (this.intervals.size() > 1 &&
                   this.selectedIntervalIndex == this.intervals.size() - 1) {
            this.selectedIntervalIndex = 0;
            this.updateControlsForSelection();
        }
    }

    private void syncIntervalFieldText() {
        if (this.intervalField != null) {
            this.updatingFromCode = true;
            this.intervalField.setText(
                DoubleIntervalHelper.format(this.intervals)
            );
            this.intervalField.setEditableColor(0xFFFFFFFF);
            if (this.doneBtn != null) {
                this.doneBtn.active = true;
            }
            this.updatingFromCode = false;
        }
    }

    private Text getColorButtonText(LightVisualColor c) {
        String keyBase = "gui.cntrafficsymbols_0d0.rod_with_lamp.";
        String name;
        switch (c) {
            case WHITE: name = "white"; break;
            case LIGHT_YELLOW: name = "lightyellow"; break;
            case YELLOW: name = "yellow"; break;
            case ORANGE: name = "orange"; break;
            default: name = c.asString();
        }
        String colorStr = I18n.translate(keyBase + name);
        return String2McText.tagStyle(
            this.selectedColor == c ? MessageFormat.format(I18n.translate(
                "gui.cntrafficsymbols_0d0.option.selected"
            ), colorStr) : colorStr, -1
        );
    }

    private void selectColor(int idx) {
        this.selectedColor = LightVisualColor.VARS.get(idx);
        for (int i = 0; i < this.colorButtons.size(); i++) {
            this.colorButtons.get(i).setMessage(
                this.getColorButtonText(LightVisualColor.VARS.get(i))
            );
        }
    }

    private void onSliderChanged(boolean isStart, double val) {
        if (this.updatingFromCode || this.selectedIntervalIndex < 0 ||
            this.selectedIntervalIndex >= this.intervals.size()) {
            return;
        }
        DoubleInterval cur = this.intervals.get(this.selectedIntervalIndex);
        double s = cur.getStart();
        double e = cur.getEnd();
        if (isStart) {
            s = val;
            if (s > e) {
                e = s;
                if (this.endSlider != null) {
                    this.updatingFromCode = true;
                    this.endSlider.setVal(e);
                    this.updatingFromCode = false;
                }
            }
        } else {
            e = val;
            if (e < s) {
                s = e;
                if (this.startSlider != null) {
                    this.updatingFromCode = true;
                    this.startSlider.setVal(s);
                    this.updatingFromCode = false;
                }
            }
        }
        this.intervals.set(
            this.selectedIntervalIndex, new DoubleInterval(s, e)
        );
        this.syncIntervalFieldText();
        if (this.intervalInfoBtn != null) {
            this.intervalInfoBtn.setMessage(this.getIntervalInfoText());
        }
    }

    private void applyPreset(double s, double e) {
        this.intervals = new ArrayList<>(
            DoubleIntervalHelper.fromLoopedMeasure(s, e)
        );
        this.selectedIntervalIndex = this.intervals.isEmpty() ? -1 : 0;
        this.updateControlsForSelection();
        this.syncIntervalFieldText();
    }

    private void applyPresetEmpty() {
        this.intervals = new ArrayList<>();
        this.selectedIntervalIndex = -1;
        this.updateControlsForSelection();
        this.syncIntervalFieldText();
    }

    private void onTextChanged(String text) {
        if (this.updatingFromCode) {
            return;
        }
        List<DoubleInterval> parsed = DoubleIntervalHelper.fromString(text);
        boolean valid = (parsed != null);
        this.intervalField.setEditableColor(valid ? 0xFFFFFFFF : 0xFFFF5555);
        if (this.doneBtn != null) {
            this.doneBtn.active = valid;
        }
        if (valid) {
            this.intervals = new ArrayList<>(parsed);
            this.selectedIntervalIndex = this.intervals.isEmpty() ? -1 : 0;
            this.updateControlsForSelection();
        }
    }

    private void saveAndClose() {
        List<DoubleInterval> merged =
        DoubleIntervalHelper.unionAll(this.intervals);
        NbtCompound nbt = new NbtCompound();
        nbt.putString("Duration", DoubleIntervalHelper.format(merged));
        nbt.putInt("Color", this.selectedColor.id);

        ClientPlayNetworking
        .send(new UpdateTrafficSignPayload(this.be.getPos(), nbt));
        this.close();
    }

    @Override
    public boolean keyPressed(KeyInput input) {
        if (super.keyPressed(input)) {
            return true;
        }
        if (input.isEnter()) {
            if (this.doneBtn == null || this.doneBtn.active) {
                this.saveAndClose();
                return true;
            }
        }
        return false;
    }

    @Override
    public void render(
        DrawContext context, int mouseX, int mouseY, float delta
    ) {
        this.renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);

        int cx = this.width / 2;
        context.drawCenteredTextWithShadow(
            this.textRenderer, this.title, cx, 6, 0xFFFFFFFF
        );

        int barY = 66;
        int barW = 304;
        int barX = cx - 152;

        context.fill(
            barX - 1, barY - 1, barX + barW + 1, barY + 13, 0xFF555555
        );
        context.fill(barX, barY, barX + barW / 2, barY + 12, 0xFF2A394A);
        context.fill(
            barX + barW / 2, barY, barX + barW, barY + 12, 0xFF141A24
        );

        if (this.intervals != null) {
            for (int i = 0; i < this.intervals.size(); i++) {
                DoubleInterval in = this.intervals.get(i);
                int x1 = barX + (int)Math.round(in.getStart() * barW);
                int x2 = barX + (int)Math.round(in.getEnd() * barW);
                if (x2 > x1) {
                    boolean isSel = i == this.selectedIntervalIndex;
                    int color = isSel ? 0xFFFFE082 : 0xCCFFD54F;
                    context.fill(x1, barY, x2, barY + 12, color);
                    if (isSel) {
                        context.drawStrokedRectangle(
                            x1, barY, x2 - x1, 12, 0xFFFFFFFF
                        );
                    }
                }
            }
        }

        if (this.client != null && this.client.world != null) {
            double rel =
            RodWithLampBlockEntity.getDaytimeProgress(this.client.world);
            int curX = barX + (int)(rel * barW);
            context.fill(curX - 1, barY - 2, curX + 1, barY + 14, 0xFFFF3333);
        }

        Text c0600Text = tagTr("gui.cntrafficsymbols_0d0.clocktime.0600");
        context.drawTextWithShadow(
            this.textRenderer, c0600Text, barX, barY + 14, 0xFF888888
        );
        context.drawCenteredTextWithShadow(this.textRenderer, tagTr(
            "gui.cntrafficsymbols_0d0.clocktime_sunset"
        ), cx, barY + 14, 0xFF888888);
        context.drawTextWithShadow(
            this.textRenderer, c0600Text,
            barX + barW - this.textRenderer.getWidth(c0600Text), barY + 14,
            0xFF888888
        );

        context.drawTextWithShadow(this.textRenderer, tagTr(
            "gui.cntrafficsymbols_0d0.advanced_interval_text.entry"
        ), barX, 162, 0xFFA0A0A0);
    }

    private class TimeSlider extends SliderWidget {
        private final String label;
        private final boolean isStart;

        public TimeSlider(
            int x, int y, int w, int h, String label, boolean isStart,
            double val
        ) {
            super(x, y, w, h, Text.empty(), val);
            this.label = label;
            this.isStart = isStart;
            this.updateMessage();
        }

        @Override
        protected void updateMessage() {
            int mins = (int)Math.round(
                ((this.value * 24. + 6.) % 24.) * 60.
            );
            int h = (mins / 60) % 24;
            int m = mins % 60;
            int h12 = (h + 11) % 12 + 1;
            String ampm = I18n.translate(
                h < 12 ?
                "gui.cntrafficsymbols_0d0.am" : "gui.cntrafficsymbols_0d0.pm"
            );
            this.setMessage(tagTr(
                "gui.cntrafficsymbols_0d0.tag_clocktime_01v",
                this.label, h, m, this.value, h12, ampm
            ));
        }

        @Override
        protected void applyValue() {
            RodWithLampEditScreen.this
            .onSliderChanged(this.isStart, this.value);
        }

        public void setVal(double v) {
            this.value = v > 0. ? (v < 1. ? v : 1.) : 0.;
            this.updateMessage();
        }
    }
}
