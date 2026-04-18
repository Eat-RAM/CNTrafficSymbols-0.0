package io.github.eat_ram.cntrafficsymbols.v0d0.compat.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.DirectionalLayoutWidget;
import net.minecraft.client.gui.widget.SimplePositioningWidget;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.screen.ScreenTexts.DONE;
import static rege.pegui.cntrafficsymbols.Main
              .getHardcodedBarricades1LootEnabled;
import static rege.pegui.cntrafficsymbols.Main
              .getHardcodedFloorLineEighthsLootEnabled;
import static rege.pegui.cntrafficsymbols.Main
              .setHardcodedBarricades1LootEnabled;
import static rege.pegui.cntrafficsymbols.Main
              .setHardcodedFloorLineEighthsLootEnabled;

public class ModMenuApiImpl implements ModMenuApi {
    @Override
    public ConfigScreenFactory<Screen> getModConfigScreenFactory() {
        return parent -> new Screen(
            Text.literal("CNTrafficSymbols 0.0 Config")
        ) {
            public final DirectionalLayoutWidget layout =
            DirectionalLayoutWidget.vertical().spacing(5);
            public final ButtonWidget
            hardcodedFloorLineEighthsLootEnabledButton;
            public final ButtonWidget hardcodedBarricades1LootEnabledButton;

            public void draw() {
                this.layout.getMainPositioner().alignHorizontalCenter()
                .margin(10);
                this.layout.refreshPositions();
                this.layout.forEachChild(this::addDrawableChild);
                this.addDrawableChild(ButtonWidget.builder(DONE, button -> {
                    if (this.client != null) {
                        this.client.setScreen(parent);
                    }
                }).dimensions(this.width / 2 - 100, this.height - 27, 200,
                              20).build());
            }

            {
                ButtonWidget.Builder bwb = ButtonWidget.builder(Text.literal(
                    "hardcoded_floor_line_eighths_loot_enabled: " +
                    getNullableBooleanText(
                        getHardcodedFloorLineEighthsLootEnabled()
                    )
                ), button -> {
                    setHardcodedFloorLineEighthsLootEnabled(
                        getNullableBooleanNext(
                            getHardcodedFloorLineEighthsLootEnabled()
                        )
                    );
                    this.init();
                    button.setMessage(Text.literal(
                        "hardcoded_floor_line_eighths_loot_enabled: " +
                        getNullableBooleanText(
                            getHardcodedFloorLineEighthsLootEnabled()
                        )
                    ));
                }).dimensions(this.width / 2 - 155, 40, 310, 20);
                this.hardcodedFloorLineEighthsLootEnabledButton = bwb.build();
                this.layout
                .add(this.hardcodedFloorLineEighthsLootEnabledButton);
                bwb = ButtonWidget.builder(Text.literal(
                    "hardcoded_barricades_1_loot_enabled: " +
                    getNullableBooleanText(
                        getHardcodedBarricades1LootEnabled()
                    )
                ), button -> {
                    setHardcodedBarricades1LootEnabled(getNullableBooleanNext(
                        getHardcodedBarricades1LootEnabled()
                    ));
                    this.init();
                    button.setMessage(Text.literal(
                        "hardcoded_barricades_1_loot_enabled: " +
                        getNullableBooleanText(
                            getHardcodedBarricades1LootEnabled()
                        )
                    ));
                }).dimensions(this.width / 2 - 155, 40, 310, 20);
                this.hardcodedBarricades1LootEnabledButton = bwb.build();
                this.layout.add(this.hardcodedBarricades1LootEnabledButton);
            }

            @Override
            protected void init() {
                this.draw();
                this.initTabNavigation();
            }

            @Override
            protected void initTabNavigation() {
                this.clearChildren();
                this.draw();
                this.layout.refreshPositions();
                SimplePositioningWidget
                .setPos(this.layout, this.getNavigationFocus());
            }

            @Override
            public void
            render(DrawContext context, int mouseX, int mouseY, float delta) {
                context.drawCenteredTextWithShadow(
                    this.textRenderer, this.title, this.width / 2, 15, 16777215
                );
                super.render(context, mouseX, mouseY, delta);
            }
        };
    }

    @Contract(pure = true)
    public static String getNullableBooleanText(@Nullable Boolean b) {
        return (b == null) ? "Auto" : (b ? "Yes" : "No");
    }

    @Contract(pure = true)
    public static @Nullable Boolean
    getNullableBooleanNext(@Nullable Boolean b) {
        return (b == null) ? Boolean.TRUE : (b ? Boolean.FALSE : null);
    }
}
