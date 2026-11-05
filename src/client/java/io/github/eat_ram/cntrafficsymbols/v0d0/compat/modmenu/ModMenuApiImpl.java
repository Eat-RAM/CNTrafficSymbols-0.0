package io.github.eat_ram.cntrafficsymbols.v0d0.compat.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import io.github.eat_ram.cntrafficsymbols.core.client.helper.I18nHelper;
import io.github.eat_ram.cntrafficsymbols.v0d0.Main;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.HighwayHmWallUpConnection;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.RodWallUpConnection;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.DirectionalLayoutWidget;
import net.minecraft.client.gui.widget.Positioner;
import net.minecraft.client.gui.widget.SimplePositioningWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.screen.ScreenTexts.DONE;

public class ModMenuApiImpl implements ModMenuApi {
    @Override
    public ConfigScreenFactory<Screen> getModConfigScreenFactory() {
        return parent -> new Screen(I18nHelper.tagTr(
            "gui.cntrafficsymbols_0d0.config.title"
        )) {
            @Override
            protected void init() {
                this.clearChildren();
                DirectionalLayoutWidget layout =
                DirectionalLayoutWidget.vertical().spacing(5);
                layout.add(new TextWidget(this.title, this.textRenderer),
                           Positioner::alignHorizontalCenter);
                layout.add(ButtonWidget.builder(Text.literal(
                    "hardcoded_floor_line_eighths_loot_enabled: " +
                    getNullableBooleanText(
                        Main.getHardcodedFloorLineEighthsLootEnabled()
                    )
                ), button -> {
                    Main.setHardcodedFloorLineEighthsLootEnabled(
                        getNullableBooleanNext(
                            Main.getHardcodedFloorLineEighthsLootEnabled()
                        )
                    );
                    button.setMessage(Text.literal(
                        "hardcoded_floor_line_eighths_loot_enabled: " +
                        getNullableBooleanText(
                            Main.getHardcodedFloorLineEighthsLootEnabled()
                        )
                    ));
                }).dimensions(this.width / 2 - 155, 40, 310, 20).build());
                layout.add(ButtonWidget.builder(Text.literal(
                    "highway_hm_wall_up_connection_mode: " +
                    getNullableEnumText(
                        Main.getHighwayHmWallUpConnectionMode(), "UNSET"
                    )
                ), button -> {
                    Main.setHighwayHmWallUpConnectionMode(getNullableEnumNext(
                        HighwayHmWallUpConnection.class,
                        Main.getHighwayHmWallUpConnectionMode()
                    ));
                    button.setMessage(Text.literal(
                        "highway_hm_wall_up_connection_mode: " +
                        getNullableEnumText(
                            Main.getHighwayHmWallUpConnectionMode(), "UNSET"
                        )
                    ));
                }).dimensions(this.width / 2 - 155, 40, 310, 20).build());
                layout.add(ButtonWidget.builder(Text.literal(
                    "rod_wall_up_connection_mode: " + getNullableEnumText(
                        Main.getRodWallUpConnectionMode(), "UNSET"
                    )
                ), button -> {
                    Main.setRodWallUpConnectionMode(getNullableEnumNext(
                        RodWallUpConnection.class,
                        Main.getRodWallUpConnectionMode()
                    ));
                    button.setMessage(Text.literal(
                        "rod_wall_up_connection_mode: " + getNullableEnumText(
                            Main.getRodWallUpConnectionMode(), "UNSET"
                        )
                    ));
                }).dimensions(this.width / 2 - 155, 40, 310, 20).build());
                layout.refreshPositions();
                SimplePositioningWidget
                .setPos(layout, this.getNavigationFocus());
                layout.forEachChild(this::addDrawableChild);
                this.addDrawableChild(ButtonWidget.builder(DONE, button -> {
                    if (this.client != null) {
                        this.client.setScreen(parent);
                    }
                }).dimensions(this.width / 2 - 100, this.height - 27, 200,
                              20).build());
            }
        };
    }

    @Contract(pure = true)
    public static String getNullableBooleanText(@Nullable Boolean b) {
        return (b == null) ? "Auto" : (b ? "Yes" : "No");
    }

    @Contract(value = "null -> !null", pure = true)
    public static @Nullable Boolean
    getNullableBooleanNext(@Nullable Boolean b) {
        return (b == null) ? Boolean.TRUE : (b ? Boolean.FALSE : null);
    }

    @Contract(pure = true)
    public static String
    getNullableEnumText(@Nullable Enum<?> e, @Nullable String n) {
        return e == null ? (n == null ? "null" : n) : e.name();
    }

    public static <T extends Enum<T>> @Nullable T
    getNullableEnumNext(@NotNull Class<T> clazz, @Nullable T t) {
        T[] enums = clazz.getEnumConstants();
        if (t == null) {
            return enums.length == 0 ? null : enums[0];
        }
        int next = t.ordinal() + 1;
        return next < enums.length ? enums[next] : null;
    }
}
