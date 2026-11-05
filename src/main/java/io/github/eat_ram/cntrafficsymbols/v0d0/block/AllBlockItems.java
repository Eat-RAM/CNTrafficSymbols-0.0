package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static io.github.eat_ram.cntrafficsymbols.v0d0.bakcompa.DualIds
              .commitAndGet;
import static io.github.eat_ram.cntrafficsymbols.v0d0.helper.RegisterHelper
              .registerBlockItem;
import static io.github.eat_ram.cntrafficsymbols.v0d0.helper.RegisterHelper
              .registerItem;

public class AllBlockItems {
    public static final Item SPEEDLIMIT_HIGH_3 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_3);
    public static final Item SPEEDLIMIT_LOW_3 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_3);
    public static final Item SPEEDLIMIT_HIGH_5 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_5);
    public static final Item SPEEDLIMIT_LOW_5 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_5);
    public static final Item SPEEDLIMIT_HIGH_10 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_10);
    public static final Item SPEEDLIMIT_LOW_10 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_10);
    public static final Item SPEEDLIMIT_HIGH_15 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_15);
    public static final Item SPEEDLIMIT_LOW_15 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_15);
    public static final Item SPEEDLIMIT_HIGH_20 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_20);
    public static final Item SPEEDLIMIT_LOW_20 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_20);
    public static final Item SPEEDLIMIT_HIGH_25 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_25);
    public static final Item SPEEDLIMIT_LOW_25 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_25);
    public static final Item SPEEDLIMIT_HIGH_30 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_30);
    public static final Item SPEEDLIMIT_LOW_30 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_30);
    public static final Item SPEEDLIMIT_HIGH_35 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_35);
    public static final Item SPEEDLIMIT_LOW_35 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_35);
    public static final Item SPEEDLIMIT_HIGH_40 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_40);
    public static final Item SPEEDLIMIT_LOW_40 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_40);
    public static final Item SPEEDLIMIT_HIGH_45 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_45);
    public static final Item SPEEDLIMIT_LOW_45 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_45);
    public static final Item SPEEDLIMIT_HIGH_50 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_50);
    public static final Item SPEEDLIMIT_LOW_50 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_50);
    public static final Item SPEEDLIMIT_HIGH_55 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_55);
    public static final Item SPEEDLIMIT_LOW_55 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_55);
    public static final Item SPEEDLIMIT_HIGH_60 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_60);
    public static final Item SPEEDLIMIT_LOW_60 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_60);
    public static final Item SPEEDLIMIT_HIGH_65 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_65);
    public static final Item SPEEDLIMIT_LOW_65 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_65);
    public static final Item SPEEDLIMIT_HIGH_70 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_70);
    public static final Item SPEEDLIMIT_LOW_70 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_70);
    public static final Item SPEEDLIMIT_HIGH_75 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_75);
    public static final Item SPEEDLIMIT_LOW_75 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_75);
    public static final Item SPEEDLIMIT_HIGH_80 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_80);
    public static final Item SPEEDLIMIT_LOW_80 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_80);
    public static final Item SPEEDLIMIT_HIGH_85 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_85);
    public static final Item SPEEDLIMIT_LOW_85 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_85);
    public static final Item SPEEDLIMIT_HIGH_90 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_90);
    public static final Item SPEEDLIMIT_LOW_90 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_90);
    public static final Item SPEEDLIMIT_HIGH_95 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_95);
    public static final Item SPEEDLIMIT_LOW_95 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_95);
    public static final Item SPEEDLIMIT_HIGH_100 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_100);
    public static final Item SPEEDLIMIT_LOW_100 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_100);
    public static final Item SPEEDLIMIT_HIGH_105 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_105);
    public static final Item SPEEDLIMIT_LOW_105 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_105);
    public static final Item SPEEDLIMIT_HIGH_110 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_110);
    public static final Item SPEEDLIMIT_LOW_110 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_110);
    public static final Item SPEEDLIMIT_HIGH_115 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_115);
    public static final Item SPEEDLIMIT_LOW_115 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_115);
    public static final Item SPEEDLIMIT_HIGH_120 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_120);
    public static final Item SPEEDLIMIT_LOW_120 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_120);
    public static final Item SPEEDLIMIT_HIGH_125 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_125);
    public static final Item SPEEDLIMIT_LOW_125 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_125);
    public static final Item SPEEDLIMIT_HIGH_130 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_130);
    public static final Item SPEEDLIMIT_LOW_130 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_130);
    public static final Item SPEEDLIMIT_HIGH_135 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_135);
    public static final Item SPEEDLIMIT_LOW_135 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_135);
    public static final Item SPEEDLIMIT_HIGH_140 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_140);
    public static final Item SPEEDLIMIT_LOW_140 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_140);
    public static final Item SPEEDLIMIT_HIGH_145 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_145);
    public static final Item SPEEDLIMIT_LOW_145 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_145);
    public static final Item SPEEDLIMIT_HIGH_150 =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_150);
    public static final Item SPEEDLIMIT_LOW_150 =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_150);
    public static final Item SPEEDLIMIT_HIGH_SPECIAL =
    registerNormal(AllBlocks.SPEEDLIMIT_HIGH_SPECIAL);
    public static final Item SPEEDLIMIT_LOW_SPECIAL =
    registerNormal(AllBlocks.SPEEDLIMIT_LOW_SPECIAL);
    public static final Item LIFT_SPEEDLIMIT_HIGH_3 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_3);
    public static final Item LIFT_SPEEDLIMIT_HIGH_5 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_5);
    public static final Item LIFT_SPEEDLIMIT_HIGH_10 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_10);
    public static final Item LIFT_SPEEDLIMIT_HIGH_15 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_15);
    public static final Item LIFT_SPEEDLIMIT_HIGH_20 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_20);
    public static final Item LIFT_SPEEDLIMIT_HIGH_25 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_25);
    public static final Item LIFT_SPEEDLIMIT_HIGH_30 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_30);
    public static final Item LIFT_SPEEDLIMIT_HIGH_35 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_35);
    public static final Item LIFT_SPEEDLIMIT_HIGH_40 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_40);
    public static final Item LIFT_SPEEDLIMIT_HIGH_45 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_45);
    public static final Item LIFT_SPEEDLIMIT_HIGH_50 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_50);
    public static final Item LIFT_SPEEDLIMIT_HIGH_55 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_55);
    public static final Item LIFT_SPEEDLIMIT_HIGH_60 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_60);
    public static final Item LIFT_SPEEDLIMIT_HIGH_65 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_65);
    public static final Item LIFT_SPEEDLIMIT_HIGH_70 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_70);
    public static final Item LIFT_SPEEDLIMIT_HIGH_75 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_75);
    public static final Item LIFT_SPEEDLIMIT_HIGH_80 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_80);
    public static final Item LIFT_SPEEDLIMIT_HIGH_85 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_85);
    public static final Item LIFT_SPEEDLIMIT_HIGH_90 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_90);
    public static final Item LIFT_SPEEDLIMIT_HIGH_95 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_95);
    public static final Item LIFT_SPEEDLIMIT_HIGH_100 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_100);
    public static final Item LIFT_SPEEDLIMIT_HIGH_105 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_105);
    public static final Item LIFT_SPEEDLIMIT_HIGH_110 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_110);
    public static final Item LIFT_SPEEDLIMIT_HIGH_115 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_115);
    public static final Item LIFT_SPEEDLIMIT_HIGH_120 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_120);
    public static final Item LIFT_SPEEDLIMIT_HIGH_125 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_125);
    public static final Item LIFT_SPEEDLIMIT_HIGH_130 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_130);
    public static final Item LIFT_SPEEDLIMIT_HIGH_135 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_135);
    public static final Item LIFT_SPEEDLIMIT_HIGH_140 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_140);
    public static final Item LIFT_SPEEDLIMIT_HIGH_145 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_145);
    public static final Item LIFT_SPEEDLIMIT_HIGH_150 =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_150);
    public static final Item LIFT_SPEEDLIMIT_HIGH_SPECIAL =
    registerNormal(AllBlocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL);
    public static final Item IRON_PLATE = registerItem(
        commitAndGet(Registries.ITEM, "iron_plate"), Item::new,
        new Item.Settings().maxCount(64)
    );
    public static final Item CIRCLE_BACKBOARD =
    registerNormal(AllBlocks.CIRCLE_BACKBOARD);
    public static final Item HEIGHTLIMIT_SPECIAL =
    registerNormal(AllBlocks.HEIGHTLIMIT_SPECIAL);
    public static final Item HEIGHTLIMIT_0D1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_0D1);
    public static final Item HEIGHTLIMIT_0D2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_0D2);
    public static final Item HEIGHTLIMIT_0D3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_0D3);
    public static final Item HEIGHTLIMIT_0D4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_0D4);
    public static final Item HEIGHTLIMIT_0D5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_0D5);
    public static final Item HEIGHTLIMIT_0D6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_0D6);
    public static final Item HEIGHTLIMIT_0D7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_0D7);
    public static final Item HEIGHTLIMIT_0D8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_0D8);
    public static final Item HEIGHTLIMIT_0D9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_0D9);
    public static final Item HEIGHTLIMIT_1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_1);
    public static final Item HEIGHTLIMIT_1D1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_1D1);
    public static final Item HEIGHTLIMIT_1D2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_1D2);
    public static final Item HEIGHTLIMIT_1D3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_1D3);
    public static final Item HEIGHTLIMIT_1D4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_1D4);
    public static final Item HEIGHTLIMIT_1D5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_1D5);
    public static final Item HEIGHTLIMIT_1D6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_1D6);
    public static final Item HEIGHTLIMIT_1D7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_1D7);
    public static final Item HEIGHTLIMIT_1D8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_1D8);
    public static final Item HEIGHTLIMIT_1D9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_1D9);
    public static final Item HEIGHTLIMIT_2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_2);
    public static final Item HEIGHTLIMIT_2D1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_2D1);
    public static final Item HEIGHTLIMIT_2D2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_2D2);
    public static final Item HEIGHTLIMIT_2D3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_2D3);
    public static final Item HEIGHTLIMIT_2D4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_2D4);
    public static final Item HEIGHTLIMIT_2D5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_2D5);
    public static final Item HEIGHTLIMIT_2D6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_2D6);
    public static final Item HEIGHTLIMIT_2D7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_2D7);
    public static final Item HEIGHTLIMIT_2D8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_2D8);
    public static final Item HEIGHTLIMIT_2D9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_2D9);
    public static final Item HEIGHTLIMIT_3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_3);
    public static final Item HEIGHTLIMIT_3D1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_3D1);
    public static final Item HEIGHTLIMIT_3D2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_3D2);
    public static final Item HEIGHTLIMIT_3D3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_3D3);
    public static final Item HEIGHTLIMIT_3D4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_3D4);
    public static final Item HEIGHTLIMIT_3D5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_3D5);
    public static final Item HEIGHTLIMIT_3D6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_3D6);
    public static final Item HEIGHTLIMIT_3D7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_3D7);
    public static final Item HEIGHTLIMIT_3D8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_3D8);
    public static final Item HEIGHTLIMIT_3D9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_3D9);
    public static final Item HEIGHTLIMIT_4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_4);
    public static final Item HEIGHTLIMIT_4D1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_4D1);
    public static final Item HEIGHTLIMIT_4D2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_4D2);
    public static final Item HEIGHTLIMIT_4D3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_4D3);
    public static final Item HEIGHTLIMIT_4D4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_4D4);
    public static final Item HEIGHTLIMIT_4D5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_4D5);
    public static final Item HEIGHTLIMIT_4D6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_4D6);
    public static final Item HEIGHTLIMIT_4D7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_4D7);
    public static final Item HEIGHTLIMIT_4D8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_4D8);
    public static final Item HEIGHTLIMIT_4D9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_4D9);
    public static final Item HEIGHTLIMIT_5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_5);
    public static final Item HEIGHTLIMIT_5D1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_5D1);
    public static final Item HEIGHTLIMIT_5D2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_5D2);
    public static final Item HEIGHTLIMIT_5D3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_5D3);
    public static final Item HEIGHTLIMIT_5D4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_5D4);
    public static final Item HEIGHTLIMIT_5D5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_5D5);
    public static final Item HEIGHTLIMIT_5D6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_5D6);
    public static final Item HEIGHTLIMIT_5D7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_5D7);
    public static final Item HEIGHTLIMIT_5D8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_5D8);
    public static final Item HEIGHTLIMIT_5D9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_5D9);
    public static final Item HEIGHTLIMIT_6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_6);
    public static final Item HEIGHTLIMIT_6D1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_6D1);
    public static final Item HEIGHTLIMIT_6D2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_6D2);
    public static final Item HEIGHTLIMIT_6D3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_6D3);
    public static final Item HEIGHTLIMIT_6D4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_6D4);
    public static final Item HEIGHTLIMIT_6D5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_6D5);
    public static final Item HEIGHTLIMIT_6D6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_6D6);
    public static final Item HEIGHTLIMIT_6D7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_6D7);
    public static final Item HEIGHTLIMIT_6D8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_6D8);
    public static final Item HEIGHTLIMIT_6D9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_6D9);
    public static final Item HEIGHTLIMIT_7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_7);
    public static final Item HEIGHTLIMIT_7D1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_7D1);
    public static final Item HEIGHTLIMIT_7D2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_7D2);
    public static final Item HEIGHTLIMIT_7D3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_7D3);
    public static final Item HEIGHTLIMIT_7D4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_7D4);
    public static final Item HEIGHTLIMIT_7D5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_7D5);
    public static final Item HEIGHTLIMIT_7D6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_7D6);
    public static final Item HEIGHTLIMIT_7D7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_7D7);
    public static final Item HEIGHTLIMIT_7D8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_7D8);
    public static final Item HEIGHTLIMIT_7D9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_7D9);
    public static final Item HEIGHTLIMIT_8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_8);
    public static final Item HEIGHTLIMIT_8D1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_8D1);
    public static final Item HEIGHTLIMIT_8D2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_8D2);
    public static final Item HEIGHTLIMIT_8D3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_8D3);
    public static final Item HEIGHTLIMIT_8D4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_8D4);
    public static final Item HEIGHTLIMIT_8D5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_8D5);
    public static final Item HEIGHTLIMIT_8D6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_8D6);
    public static final Item HEIGHTLIMIT_8D7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_8D7);
    public static final Item HEIGHTLIMIT_8D8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_8D8);
    public static final Item HEIGHTLIMIT_8D9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_8D9);
    public static final Item HEIGHTLIMIT_9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_9);
    public static final Item HEIGHTLIMIT_9D1 =
    registerNormal(AllBlocks.HEIGHTLIMIT_9D1);
    public static final Item HEIGHTLIMIT_9D2 =
    registerNormal(AllBlocks.HEIGHTLIMIT_9D2);
    public static final Item HEIGHTLIMIT_9D3 =
    registerNormal(AllBlocks.HEIGHTLIMIT_9D3);
    public static final Item HEIGHTLIMIT_9D4 =
    registerNormal(AllBlocks.HEIGHTLIMIT_9D4);
    public static final Item HEIGHTLIMIT_9D5 =
    registerNormal(AllBlocks.HEIGHTLIMIT_9D5);
    public static final Item HEIGHTLIMIT_9D6 =
    registerNormal(AllBlocks.HEIGHTLIMIT_9D6);
    public static final Item HEIGHTLIMIT_9D7 =
    registerNormal(AllBlocks.HEIGHTLIMIT_9D7);
    public static final Item HEIGHTLIMIT_9D8 =
    registerNormal(AllBlocks.HEIGHTLIMIT_9D8);
    public static final Item HEIGHTLIMIT_9D9 =
    registerNormal(AllBlocks.HEIGHTLIMIT_9D9);
    public static final Item HEIGHTLIMIT_10 =
    registerNormal(AllBlocks.HEIGHTLIMIT_10);
    public static final Item PROHIBITION =
    registerNormal(AllBlocks.PROHIBITION);
    public static final Item NO_U_TURN = registerNormal(AllBlocks.NO_U_TURN);
    public static final Item NO_LEFT_TURN =
    registerNormal(AllBlocks.NO_LEFT_TURN);
    public static final Item NO_RIGHT_TURN =
    registerNormal(AllBlocks.NO_RIGHT_TURN);
    public static final Item NO_PARKING = registerNormal(AllBlocks.NO_PARKING);
    public static final Item NO_ENTRY = registerNormal(AllBlocks.NO_ENTRY);
    public static final Item NO_LEFT_AND_RIGHT_TURN =
    registerNormal(AllBlocks.NO_LEFT_AND_RIGHT_TURN);
    public static final Item NO_STRAIGHT_AHEAD =
    registerNormal(AllBlocks.NO_STRAIGHT_AHEAD);
    public static final Item NO_STRAIGHT_AHEAD_AND_LEFT_TURN =
    registerNormal(AllBlocks.NO_STRAIGHT_AHEAD_AND_LEFT_TURN);
    public static final Item NO_STRAIGHT_AHEAD_AND_RIGHT_TURN =
    registerNormal(AllBlocks.NO_STRAIGHT_AHEAD_AND_RIGHT_TURN);
    public static final Item NO_STOPPING =
    registerNormal(AllBlocks.NO_STOPPING);
    public static final Item NO_STOPPING_LEFT =
    registerNormal(AllBlocks.NO_STOPPING_LEFT);
    public static final Item NO_STOPPING_LEFT_RIGHT =
    registerNormal(AllBlocks.NO_STOPPING_LEFT_RIGHT);
    public static final Item NO_STOPPING_RIGHT =
    registerNormal(AllBlocks.NO_STOPPING_RIGHT);
    public static final Item HIGHWAY_1HM =
    registerNormal(AllBlocks.HIGHWAY_1HM);
    public static final Item HIGHWAY_2HM =
    registerNormal(AllBlocks.HIGHWAY_2HM);
    public static final Item HIGHWAY_3HM =
    registerNormal(AllBlocks.HIGHWAY_3HM);
    public static final Item HIGHWAY_4HM =
    registerNormal(AllBlocks.HIGHWAY_4HM);
    public static final Item HIGHWAY_5HM =
    registerNormal(AllBlocks.HIGHWAY_5HM);
    public static final Item HIGHWAY_6HM =
    registerNormal(AllBlocks.HIGHWAY_6HM);
    public static final Item HIGHWAY_7HM =
    registerNormal(AllBlocks.HIGHWAY_7HM);
    public static final Item HIGHWAY_8HM =
    registerNormal(AllBlocks.HIGHWAY_8HM);
    public static final Item HIGHWAY_9HM =
    registerNormal(AllBlocks.HIGHWAY_9HM);
    public static final Item WHITE_FLOOR_LINE_EIGHTH = registerItem(
        commitAndGet(Registries.ITEM, "white_floor_line_eighth"),
        settings ->
        new AliasedBlockItem(AllBlocks.FLOOR_LINE_EIGHTHS, settings),
        new Item.Settings().maxCount(64)
    );
    public static final Item YELLOW_FLOOR_LINE_EIGHTH = registerItem(
        commitAndGet(Registries.ITEM, "yellow_floor_line_eighth"),
        settings ->
        new AliasedBlockItem(AllBlocks.FLOOR_LINE_EIGHTHS, settings),
        new Item.Settings().maxCount(64)
    );
    public static final Item HIGHWAY_KM = registerNormal(AllBlocks.HIGHWAY_KM);
    public static final Item DISTANCE_DETECTION_0M_LEFT =
    registerNormal(AllBlocks.DISTANCE_DETECTION_0M_LEFT);
    public static final Item DISTANCE_DETECTION_0M_RIGHT =
    registerNormal(AllBlocks.DISTANCE_DETECTION_0M_RIGHT);
    public static final Item DISTANCE_DETECTION_50M_LEFT =
    registerNormal(AllBlocks.DISTANCE_DETECTION_50M_LEFT);
    public static final Item DISTANCE_DETECTION_50M_RIGHT =
    registerNormal(AllBlocks.DISTANCE_DETECTION_50M_RIGHT);
    public static final Item DISTANCE_DETECTION_100M_LEFT =
    registerNormal(AllBlocks.DISTANCE_DETECTION_100M_LEFT);
    public static final Item DISTANCE_DETECTION_100M_RIGHT =
    registerNormal(AllBlocks.DISTANCE_DETECTION_100M_RIGHT);
    public static final Item DISTANCE_DETECTION_200M_LEFT =
    registerNormal(AllBlocks.DISTANCE_DETECTION_200M_LEFT);
    public static final Item DISTANCE_DETECTION_200M_RIGHT =
    registerNormal(AllBlocks.DISTANCE_DETECTION_200M_RIGHT);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM);
    public static final Item HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM =
    registerNormal(AllBlocks.HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM);
    public static final Item BARRICADE_50CM_EDGE_75CM_HEIGHT = registerItem(
        commitAndGet(Registries.ITEM, "barricade_50cm_edge_75cm_height"),
        settings -> new AliasedBlockItem(AllBlocks.BARRICADES_1, settings),
        new Item.Settings().maxCount(64)
    );
    public static final Item BARRICADE_50CM_EDGE_1M_HEIGHT = registerItem(
        commitAndGet(Registries.ITEM, "barricade_50cm_edge_1m_height"),
        settings -> new AliasedBlockItem(AllBlocks.BARRICADES_1, settings),
        new Item.Settings().maxCount(64)
    );
    public static final Item BARRICADE_1M_EDGE_1M_HEIGHT = registerItem(
        commitAndGet(Registries.ITEM, "barricade_1m_edge_1m_height"),
        settings -> new AliasedBlockItem(AllBlocks.BARRICADES_1, settings),
        new Item.Settings().maxCount(64)
    );
    public static final Item KEEP_SPACE_VARIANT1_UPPERLEFT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT1_UPPERLEFT);
    public static final Item KEEP_SPACE_VARIANT1_UPPER =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT1_UPPER);
    public static final Item KEEP_SPACE_VARIANT1_UPPERRIGHT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT1_UPPERRIGHT);
    public static final Item KEEP_SPACE_VARIANT1_LEFT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT1_LEFT);
    public static final Item KEEP_SPACE_VARIANT1_CENTER =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT1_CENTER);
    public static final Item KEEP_SPACE_VARIANT1_RIGHT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT1_RIGHT);
    public static final Item KEEP_SPACE_VARIANT1_LOWERLEFT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT1_LOWERLEFT);
    public static final Item KEEP_SPACE_VARIANT1_LOWER =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT1_LOWER);
    public static final Item KEEP_SPACE_VARIANT1_LOWERRIGHT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT1_LOWERRIGHT);
    public static final Item KEEP_SPACE_VARIANT2_UPPERLEFT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT2_UPPERLEFT);
    public static final Item KEEP_SPACE_VARIANT2_UPPER =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT2_UPPER);
    public static final Item KEEP_SPACE_VARIANT2_UPPERRIGHT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT2_UPPERRIGHT);
    public static final Item KEEP_SPACE_VARIANT2_LEFT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT2_LEFT);
    public static final Item KEEP_SPACE_VARIANT2_CENTER =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT2_CENTER);
    public static final Item KEEP_SPACE_VARIANT2_RIGHT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT2_RIGHT);
    public static final Item KEEP_SPACE_VARIANT2_LOWERLEFT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT2_LOWERLEFT);
    public static final Item KEEP_SPACE_VARIANT2_LOWER =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT2_LOWER);
    public static final Item KEEP_SPACE_VARIANT2_LOWERRIGHT =
    registerNormal(AllBlocks.KEEP_SPACE_VARIANT2_LOWERRIGHT);
    public static final Item WHITE_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.WHITE_HALF1_CYLINDRICAL_ROD);
    public static final Item ORANGE_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.ORANGE_HALF1_CYLINDRICAL_ROD);
    public static final Item MAGENTA_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.MAGENTA_HALF1_CYLINDRICAL_ROD);
    public static final Item LIGHT_BLUE_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.LIGHT_BLUE_HALF1_CYLINDRICAL_ROD);
    public static final Item YELLOW_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.YELLOW_HALF1_CYLINDRICAL_ROD);
    public static final Item LIME_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.LIME_HALF1_CYLINDRICAL_ROD);
    public static final Item PINK_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.PINK_HALF1_CYLINDRICAL_ROD);
    public static final Item GRAY_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.GRAY_HALF1_CYLINDRICAL_ROD);
    public static final Item LIGHT_GRAY_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.LIGHT_GRAY_HALF1_CYLINDRICAL_ROD);
    public static final Item CYAN_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.CYAN_HALF1_CYLINDRICAL_ROD);
    public static final Item PURPLE_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.PURPLE_HALF1_CYLINDRICAL_ROD);
    public static final Item BLUE_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.BLUE_HALF1_CYLINDRICAL_ROD);
    public static final Item BROWN_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.BROWN_HALF1_CYLINDRICAL_ROD);
    public static final Item GREEN_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.GREEN_HALF1_CYLINDRICAL_ROD);
    public static final Item RED_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.RED_HALF1_CYLINDRICAL_ROD);
    public static final Item BLACK_HALF1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.BLACK_HALF1_CYLINDRICAL_ROD);
    public static final Item WHITE_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.WHITE_FULL1_CYLINDRICAL_ROD);
    public static final Item ORANGE_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.ORANGE_FULL1_CYLINDRICAL_ROD);
    public static final Item MAGENTA_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.MAGENTA_FULL1_CYLINDRICAL_ROD);
    public static final Item LIGHT_BLUE_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.LIGHT_BLUE_FULL1_CYLINDRICAL_ROD);
    public static final Item YELLOW_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.YELLOW_FULL1_CYLINDRICAL_ROD);
    public static final Item LIME_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.LIME_FULL1_CYLINDRICAL_ROD);
    public static final Item PINK_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.PINK_FULL1_CYLINDRICAL_ROD);
    public static final Item GRAY_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.GRAY_FULL1_CYLINDRICAL_ROD);
    public static final Item LIGHT_GRAY_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.LIGHT_GRAY_FULL1_CYLINDRICAL_ROD);
    public static final Item CYAN_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.CYAN_FULL1_CYLINDRICAL_ROD);
    public static final Item PURPLE_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.PURPLE_FULL1_CYLINDRICAL_ROD);
    public static final Item BLUE_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.BLUE_FULL1_CYLINDRICAL_ROD);
    public static final Item BROWN_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.BROWN_FULL1_CYLINDRICAL_ROD);
    public static final Item GREEN_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.GREEN_FULL1_CYLINDRICAL_ROD);
    public static final Item RED_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.RED_FULL1_CYLINDRICAL_ROD);
    public static final Item BLACK_FULL1_CYLINDRICAL_ROD =
    registerNormal(AllBlocks.BLACK_FULL1_CYLINDRICAL_ROD);
    public static final Item WHITE_ROD_WITH_LAMP =
    registerNormal(AllBlocks.WHITE_ROD_WITH_LAMP);
    public static final Item ORANGE_ROD_WITH_LAMP =
    registerNormal(AllBlocks.ORANGE_ROD_WITH_LAMP);
    public static final Item MAGENTA_ROD_WITH_LAMP =
    registerNormal(AllBlocks.MAGENTA_ROD_WITH_LAMP);
    public static final Item LIGHT_BLUE_ROD_WITH_LAMP =
    registerNormal(AllBlocks.LIGHT_BLUE_ROD_WITH_LAMP);
    public static final Item YELLOW_ROD_WITH_LAMP =
    registerNormal(AllBlocks.YELLOW_ROD_WITH_LAMP);
    public static final Item LIME_ROD_WITH_LAMP =
    registerNormal(AllBlocks.LIME_ROD_WITH_LAMP);
    public static final Item PINK_ROD_WITH_LAMP =
    registerNormal(AllBlocks.PINK_ROD_WITH_LAMP);
    public static final Item GRAY_ROD_WITH_LAMP =
    registerNormal(AllBlocks.GRAY_ROD_WITH_LAMP);
    public static final Item LIGHT_GRAY_ROD_WITH_LAMP =
    registerNormal(AllBlocks.LIGHT_GRAY_ROD_WITH_LAMP);
    public static final Item CYAN_ROD_WITH_LAMP =
    registerNormal(AllBlocks.CYAN_ROD_WITH_LAMP);
    public static final Item PURPLE_ROD_WITH_LAMP =
    registerNormal(AllBlocks.PURPLE_ROD_WITH_LAMP);
    public static final Item BLUE_ROD_WITH_LAMP =
    registerNormal(AllBlocks.BLUE_ROD_WITH_LAMP);
    public static final Item BROWN_ROD_WITH_LAMP =
    registerNormal(AllBlocks.BROWN_ROD_WITH_LAMP);
    public static final Item GREEN_ROD_WITH_LAMP =
    registerNormal(AllBlocks.GREEN_ROD_WITH_LAMP);
    public static final Item RED_ROD_WITH_LAMP =
    registerNormal(AllBlocks.RED_ROD_WITH_LAMP);
    public static final Item BLACK_ROD_WITH_LAMP =
    registerNormal(AllBlocks.BLACK_ROD_WITH_LAMP);
    public static final Item FULL_SQUARE_BACKBOARD =
    registerNormal(AllBlocks.FULL_SQUARE_BACKBOARD);
    public static final Item WHITE_DOTTED4_TP =
    registerNormal(AllBlocks.WHITE_DOTTED4_TP);
    public static final Item ORANGE_DOTTED4_TP =
    registerNormal(AllBlocks.ORANGE_DOTTED4_TP);
    public static final Item MAGENTA_DOTTED4_TP =
    registerNormal(AllBlocks.MAGENTA_DOTTED4_TP);
    public static final Item LIGHT_BLUE_DOTTED4_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_DOTTED4_TP);
    public static final Item YELLOW_DOTTED4_TP =
    registerNormal(AllBlocks.YELLOW_DOTTED4_TP);
    public static final Item LIME_DOTTED4_TP =
    registerNormal(AllBlocks.LIME_DOTTED4_TP);
    public static final Item PINK_DOTTED4_TP =
    registerNormal(AllBlocks.PINK_DOTTED4_TP);
    public static final Item GRAY_DOTTED4_TP =
    registerNormal(AllBlocks.GRAY_DOTTED4_TP);
    public static final Item LIGHT_GRAY_DOTTED4_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_DOTTED4_TP);
    public static final Item CYAN_DOTTED4_TP =
    registerNormal(AllBlocks.CYAN_DOTTED4_TP);
    public static final Item PURPLE_DOTTED4_TP =
    registerNormal(AllBlocks.PURPLE_DOTTED4_TP);
    public static final Item BLUE_DOTTED4_TP =
    registerNormal(AllBlocks.BLUE_DOTTED4_TP);
    public static final Item BROWN_DOTTED4_TP =
    registerNormal(AllBlocks.BROWN_DOTTED4_TP);
    public static final Item GREEN_DOTTED4_TP =
    registerNormal(AllBlocks.GREEN_DOTTED4_TP);
    public static final Item RED_DOTTED4_TP =
    registerNormal(AllBlocks.RED_DOTTED4_TP);
    public static final Item BLACK_DOTTED4_TP =
    registerNormal(AllBlocks.BLACK_DOTTED4_TP);
    public static final Item WHITE_DOTTED5_TP =
    registerNormal(AllBlocks.WHITE_DOTTED5_TP);
    public static final Item ORANGE_DOTTED5_TP =
    registerNormal(AllBlocks.ORANGE_DOTTED5_TP);
    public static final Item MAGENTA_DOTTED5_TP =
    registerNormal(AllBlocks.MAGENTA_DOTTED5_TP);
    public static final Item LIGHT_BLUE_DOTTED5_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_DOTTED5_TP);
    public static final Item YELLOW_DOTTED5_TP =
    registerNormal(AllBlocks.YELLOW_DOTTED5_TP);
    public static final Item LIME_DOTTED5_TP =
    registerNormal(AllBlocks.LIME_DOTTED5_TP);
    public static final Item PINK_DOTTED5_TP =
    registerNormal(AllBlocks.PINK_DOTTED5_TP);
    public static final Item GRAY_DOTTED5_TP =
    registerNormal(AllBlocks.GRAY_DOTTED5_TP);
    public static final Item LIGHT_GRAY_DOTTED5_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_DOTTED5_TP);
    public static final Item CYAN_DOTTED5_TP =
    registerNormal(AllBlocks.CYAN_DOTTED5_TP);
    public static final Item PURPLE_DOTTED5_TP =
    registerNormal(AllBlocks.PURPLE_DOTTED5_TP);
    public static final Item BLUE_DOTTED5_TP =
    registerNormal(AllBlocks.BLUE_DOTTED5_TP);
    public static final Item BROWN_DOTTED5_TP =
    registerNormal(AllBlocks.BROWN_DOTTED5_TP);
    public static final Item GREEN_DOTTED5_TP =
    registerNormal(AllBlocks.GREEN_DOTTED5_TP);
    public static final Item RED_DOTTED5_TP =
    registerNormal(AllBlocks.RED_DOTTED5_TP);
    public static final Item BLACK_DOTTED5_TP =
    registerNormal(AllBlocks.BLACK_DOTTED5_TP);
    public static final Item WHITE_DOTTED6_TP =
    registerNormal(AllBlocks.WHITE_DOTTED6_TP);
    public static final Item ORANGE_DOTTED6_TP =
    registerNormal(AllBlocks.ORANGE_DOTTED6_TP);
    public static final Item MAGENTA_DOTTED6_TP =
    registerNormal(AllBlocks.MAGENTA_DOTTED6_TP);
    public static final Item LIGHT_BLUE_DOTTED6_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_DOTTED6_TP);
    public static final Item YELLOW_DOTTED6_TP =
    registerNormal(AllBlocks.YELLOW_DOTTED6_TP);
    public static final Item LIME_DOTTED6_TP =
    registerNormal(AllBlocks.LIME_DOTTED6_TP);
    public static final Item PINK_DOTTED6_TP =
    registerNormal(AllBlocks.PINK_DOTTED6_TP);
    public static final Item GRAY_DOTTED6_TP =
    registerNormal(AllBlocks.GRAY_DOTTED6_TP);
    public static final Item LIGHT_GRAY_DOTTED6_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_DOTTED6_TP);
    public static final Item CYAN_DOTTED6_TP =
    registerNormal(AllBlocks.CYAN_DOTTED6_TP);
    public static final Item PURPLE_DOTTED6_TP =
    registerNormal(AllBlocks.PURPLE_DOTTED6_TP);
    public static final Item BLUE_DOTTED6_TP =
    registerNormal(AllBlocks.BLUE_DOTTED6_TP);
    public static final Item BROWN_DOTTED6_TP =
    registerNormal(AllBlocks.BROWN_DOTTED6_TP);
    public static final Item GREEN_DOTTED6_TP =
    registerNormal(AllBlocks.GREEN_DOTTED6_TP);
    public static final Item RED_DOTTED6_TP =
    registerNormal(AllBlocks.RED_DOTTED6_TP);
    public static final Item BLACK_DOTTED6_TP =
    registerNormal(AllBlocks.BLACK_DOTTED6_TP);
    public static final Item WHITE_DOTTED7_TP =
    registerNormal(AllBlocks.WHITE_DOTTED7_TP);
    public static final Item ORANGE_DOTTED7_TP =
    registerNormal(AllBlocks.ORANGE_DOTTED7_TP);
    public static final Item MAGENTA_DOTTED7_TP =
    registerNormal(AllBlocks.MAGENTA_DOTTED7_TP);
    public static final Item LIGHT_BLUE_DOTTED7_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_DOTTED7_TP);
    public static final Item YELLOW_DOTTED7_TP =
    registerNormal(AllBlocks.YELLOW_DOTTED7_TP);
    public static final Item LIME_DOTTED7_TP =
    registerNormal(AllBlocks.LIME_DOTTED7_TP);
    public static final Item PINK_DOTTED7_TP =
    registerNormal(AllBlocks.PINK_DOTTED7_TP);
    public static final Item GRAY_DOTTED7_TP =
    registerNormal(AllBlocks.GRAY_DOTTED7_TP);
    public static final Item LIGHT_GRAY_DOTTED7_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_DOTTED7_TP);
    public static final Item CYAN_DOTTED7_TP =
    registerNormal(AllBlocks.CYAN_DOTTED7_TP);
    public static final Item PURPLE_DOTTED7_TP =
    registerNormal(AllBlocks.PURPLE_DOTTED7_TP);
    public static final Item BLUE_DOTTED7_TP =
    registerNormal(AllBlocks.BLUE_DOTTED7_TP);
    public static final Item BROWN_DOTTED7_TP =
    registerNormal(AllBlocks.BROWN_DOTTED7_TP);
    public static final Item GREEN_DOTTED7_TP =
    registerNormal(AllBlocks.GREEN_DOTTED7_TP);
    public static final Item RED_DOTTED7_TP =
    registerNormal(AllBlocks.RED_DOTTED7_TP);
    public static final Item BLACK_DOTTED7_TP =
    registerNormal(AllBlocks.BLACK_DOTTED7_TP);
    public static final Item WHITE_DOTTED8_TP =
    registerNormal(AllBlocks.WHITE_DOTTED8_TP);
    public static final Item ORANGE_DOTTED8_TP =
    registerNormal(AllBlocks.ORANGE_DOTTED8_TP);
    public static final Item MAGENTA_DOTTED8_TP =
    registerNormal(AllBlocks.MAGENTA_DOTTED8_TP);
    public static final Item LIGHT_BLUE_DOTTED8_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_DOTTED8_TP);
    public static final Item YELLOW_DOTTED8_TP =
    registerNormal(AllBlocks.YELLOW_DOTTED8_TP);
    public static final Item LIME_DOTTED8_TP =
    registerNormal(AllBlocks.LIME_DOTTED8_TP);
    public static final Item PINK_DOTTED8_TP =
    registerNormal(AllBlocks.PINK_DOTTED8_TP);
    public static final Item GRAY_DOTTED8_TP =
    registerNormal(AllBlocks.GRAY_DOTTED8_TP);
    public static final Item LIGHT_GRAY_DOTTED8_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_DOTTED8_TP);
    public static final Item CYAN_DOTTED8_TP =
    registerNormal(AllBlocks.CYAN_DOTTED8_TP);
    public static final Item PURPLE_DOTTED8_TP =
    registerNormal(AllBlocks.PURPLE_DOTTED8_TP);
    public static final Item BLUE_DOTTED8_TP =
    registerNormal(AllBlocks.BLUE_DOTTED8_TP);
    public static final Item BROWN_DOTTED8_TP =
    registerNormal(AllBlocks.BROWN_DOTTED8_TP);
    public static final Item GREEN_DOTTED8_TP =
    registerNormal(AllBlocks.GREEN_DOTTED8_TP);
    public static final Item RED_DOTTED8_TP =
    registerNormal(AllBlocks.RED_DOTTED8_TP);
    public static final Item BLACK_DOTTED8_TP =
    registerNormal(AllBlocks.BLACK_DOTTED8_TP);
    public static final Item WHITE_DOTTED9_TP =
    registerNormal(AllBlocks.WHITE_DOTTED9_TP);
    public static final Item ORANGE_DOTTED9_TP =
    registerNormal(AllBlocks.ORANGE_DOTTED9_TP);
    public static final Item MAGENTA_DOTTED9_TP =
    registerNormal(AllBlocks.MAGENTA_DOTTED9_TP);
    public static final Item LIGHT_BLUE_DOTTED9_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_DOTTED9_TP);
    public static final Item YELLOW_DOTTED9_TP =
    registerNormal(AllBlocks.YELLOW_DOTTED9_TP);
    public static final Item LIME_DOTTED9_TP =
    registerNormal(AllBlocks.LIME_DOTTED9_TP);
    public static final Item PINK_DOTTED9_TP =
    registerNormal(AllBlocks.PINK_DOTTED9_TP);
    public static final Item GRAY_DOTTED9_TP =
    registerNormal(AllBlocks.GRAY_DOTTED9_TP);
    public static final Item LIGHT_GRAY_DOTTED9_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_DOTTED9_TP);
    public static final Item CYAN_DOTTED9_TP =
    registerNormal(AllBlocks.CYAN_DOTTED9_TP);
    public static final Item PURPLE_DOTTED9_TP =
    registerNormal(AllBlocks.PURPLE_DOTTED9_TP);
    public static final Item BLUE_DOTTED9_TP =
    registerNormal(AllBlocks.BLUE_DOTTED9_TP);
    public static final Item BROWN_DOTTED9_TP =
    registerNormal(AllBlocks.BROWN_DOTTED9_TP);
    public static final Item GREEN_DOTTED9_TP =
    registerNormal(AllBlocks.GREEN_DOTTED9_TP);
    public static final Item RED_DOTTED9_TP =
    registerNormal(AllBlocks.RED_DOTTED9_TP);
    public static final Item BLACK_DOTTED9_TP =
    registerNormal(AllBlocks.BLACK_DOTTED9_TP);
    public static final Item WHITE_DOTTED10_TP =
    registerNormal(AllBlocks.WHITE_DOTTED10_TP);
    public static final Item ORANGE_DOTTED10_TP =
    registerNormal(AllBlocks.ORANGE_DOTTED10_TP);
    public static final Item MAGENTA_DOTTED10_TP =
    registerNormal(AllBlocks.MAGENTA_DOTTED10_TP);
    public static final Item LIGHT_BLUE_DOTTED10_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_DOTTED10_TP);
    public static final Item YELLOW_DOTTED10_TP =
    registerNormal(AllBlocks.YELLOW_DOTTED10_TP);
    public static final Item LIME_DOTTED10_TP =
    registerNormal(AllBlocks.LIME_DOTTED10_TP);
    public static final Item PINK_DOTTED10_TP =
    registerNormal(AllBlocks.PINK_DOTTED10_TP);
    public static final Item GRAY_DOTTED10_TP =
    registerNormal(AllBlocks.GRAY_DOTTED10_TP);
    public static final Item LIGHT_GRAY_DOTTED10_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_DOTTED10_TP);
    public static final Item CYAN_DOTTED10_TP =
    registerNormal(AllBlocks.CYAN_DOTTED10_TP);
    public static final Item PURPLE_DOTTED10_TP =
    registerNormal(AllBlocks.PURPLE_DOTTED10_TP);
    public static final Item BLUE_DOTTED10_TP =
    registerNormal(AllBlocks.BLUE_DOTTED10_TP);
    public static final Item BROWN_DOTTED10_TP =
    registerNormal(AllBlocks.BROWN_DOTTED10_TP);
    public static final Item GREEN_DOTTED10_TP =
    registerNormal(AllBlocks.GREEN_DOTTED10_TP);
    public static final Item RED_DOTTED10_TP =
    registerNormal(AllBlocks.RED_DOTTED10_TP);
    public static final Item BLACK_DOTTED10_TP =
    registerNormal(AllBlocks.BLACK_DOTTED10_TP);
    public static final Item WHITE_LINED4_TP =
    registerNormal(AllBlocks.WHITE_LINED4_TP);
    public static final Item ORANGE_LINED4_TP =
    registerNormal(AllBlocks.ORANGE_LINED4_TP);
    public static final Item MAGENTA_LINED4_TP =
    registerNormal(AllBlocks.MAGENTA_LINED4_TP);
    public static final Item LIGHT_BLUE_LINED4_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_LINED4_TP);
    public static final Item YELLOW_LINED4_TP =
    registerNormal(AllBlocks.YELLOW_LINED4_TP);
    public static final Item LIME_LINED4_TP =
    registerNormal(AllBlocks.LIME_LINED4_TP);
    public static final Item PINK_LINED4_TP =
    registerNormal(AllBlocks.PINK_LINED4_TP);
    public static final Item GRAY_LINED4_TP =
    registerNormal(AllBlocks.GRAY_LINED4_TP);
    public static final Item LIGHT_GRAY_LINED4_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_LINED4_TP);
    public static final Item CYAN_LINED4_TP =
    registerNormal(AllBlocks.CYAN_LINED4_TP);
    public static final Item PURPLE_LINED4_TP =
    registerNormal(AllBlocks.PURPLE_LINED4_TP);
    public static final Item BLUE_LINED4_TP =
    registerNormal(AllBlocks.BLUE_LINED4_TP);
    public static final Item BROWN_LINED4_TP =
    registerNormal(AllBlocks.BROWN_LINED4_TP);
    public static final Item GREEN_LINED4_TP =
    registerNormal(AllBlocks.GREEN_LINED4_TP);
    public static final Item RED_LINED4_TP =
    registerNormal(AllBlocks.RED_LINED4_TP);
    public static final Item BLACK_LINED4_TP =
    registerNormal(AllBlocks.BLACK_LINED4_TP);
    public static final Item WHITE_LINED5_TP =
    registerNormal(AllBlocks.WHITE_LINED5_TP);
    public static final Item ORANGE_LINED5_TP =
    registerNormal(AllBlocks.ORANGE_LINED5_TP);
    public static final Item MAGENTA_LINED5_TP =
    registerNormal(AllBlocks.MAGENTA_LINED5_TP);
    public static final Item LIGHT_BLUE_LINED5_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_LINED5_TP);
    public static final Item YELLOW_LINED5_TP =
    registerNormal(AllBlocks.YELLOW_LINED5_TP);
    public static final Item LIME_LINED5_TP =
    registerNormal(AllBlocks.LIME_LINED5_TP);
    public static final Item PINK_LINED5_TP =
    registerNormal(AllBlocks.PINK_LINED5_TP);
    public static final Item GRAY_LINED5_TP =
    registerNormal(AllBlocks.GRAY_LINED5_TP);
    public static final Item LIGHT_GRAY_LINED5_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_LINED5_TP);
    public static final Item CYAN_LINED5_TP =
    registerNormal(AllBlocks.CYAN_LINED5_TP);
    public static final Item PURPLE_LINED5_TP =
    registerNormal(AllBlocks.PURPLE_LINED5_TP);
    public static final Item BLUE_LINED5_TP =
    registerNormal(AllBlocks.BLUE_LINED5_TP);
    public static final Item BROWN_LINED5_TP =
    registerNormal(AllBlocks.BROWN_LINED5_TP);
    public static final Item GREEN_LINED5_TP =
    registerNormal(AllBlocks.GREEN_LINED5_TP);
    public static final Item RED_LINED5_TP =
    registerNormal(AllBlocks.RED_LINED5_TP);
    public static final Item BLACK_LINED5_TP =
    registerNormal(AllBlocks.BLACK_LINED5_TP);
    public static final Item WHITE_LINED6_TP =
    registerNormal(AllBlocks.WHITE_LINED6_TP);
    public static final Item ORANGE_LINED6_TP =
    registerNormal(AllBlocks.ORANGE_LINED6_TP);
    public static final Item MAGENTA_LINED6_TP =
    registerNormal(AllBlocks.MAGENTA_LINED6_TP);
    public static final Item LIGHT_BLUE_LINED6_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_LINED6_TP);
    public static final Item YELLOW_LINED6_TP =
    registerNormal(AllBlocks.YELLOW_LINED6_TP);
    public static final Item LIME_LINED6_TP =
    registerNormal(AllBlocks.LIME_LINED6_TP);
    public static final Item PINK_LINED6_TP =
    registerNormal(AllBlocks.PINK_LINED6_TP);
    public static final Item GRAY_LINED6_TP =
    registerNormal(AllBlocks.GRAY_LINED6_TP);
    public static final Item LIGHT_GRAY_LINED6_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_LINED6_TP);
    public static final Item CYAN_LINED6_TP =
    registerNormal(AllBlocks.CYAN_LINED6_TP);
    public static final Item PURPLE_LINED6_TP =
    registerNormal(AllBlocks.PURPLE_LINED6_TP);
    public static final Item BLUE_LINED6_TP =
    registerNormal(AllBlocks.BLUE_LINED6_TP);
    public static final Item BROWN_LINED6_TP =
    registerNormal(AllBlocks.BROWN_LINED6_TP);
    public static final Item GREEN_LINED6_TP =
    registerNormal(AllBlocks.GREEN_LINED6_TP);
    public static final Item RED_LINED6_TP =
    registerNormal(AllBlocks.RED_LINED6_TP);
    public static final Item BLACK_LINED6_TP =
    registerNormal(AllBlocks.BLACK_LINED6_TP);
    public static final Item WHITE_LINED7_TP =
    registerNormal(AllBlocks.WHITE_LINED7_TP);
    public static final Item ORANGE_LINED7_TP =
    registerNormal(AllBlocks.ORANGE_LINED7_TP);
    public static final Item MAGENTA_LINED7_TP =
    registerNormal(AllBlocks.MAGENTA_LINED7_TP);
    public static final Item LIGHT_BLUE_LINED7_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_LINED7_TP);
    public static final Item YELLOW_LINED7_TP =
    registerNormal(AllBlocks.YELLOW_LINED7_TP);
    public static final Item LIME_LINED7_TP =
    registerNormal(AllBlocks.LIME_LINED7_TP);
    public static final Item PINK_LINED7_TP =
    registerNormal(AllBlocks.PINK_LINED7_TP);
    public static final Item GRAY_LINED7_TP =
    registerNormal(AllBlocks.GRAY_LINED7_TP);
    public static final Item LIGHT_GRAY_LINED7_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_LINED7_TP);
    public static final Item CYAN_LINED7_TP =
    registerNormal(AllBlocks.CYAN_LINED7_TP);
    public static final Item PURPLE_LINED7_TP =
    registerNormal(AllBlocks.PURPLE_LINED7_TP);
    public static final Item BLUE_LINED7_TP =
    registerNormal(AllBlocks.BLUE_LINED7_TP);
    public static final Item BROWN_LINED7_TP =
    registerNormal(AllBlocks.BROWN_LINED7_TP);
    public static final Item GREEN_LINED7_TP =
    registerNormal(AllBlocks.GREEN_LINED7_TP);
    public static final Item RED_LINED7_TP =
    registerNormal(AllBlocks.RED_LINED7_TP);
    public static final Item BLACK_LINED7_TP =
    registerNormal(AllBlocks.BLACK_LINED7_TP);
    public static final Item WHITE_LINED8_TP =
    registerNormal(AllBlocks.WHITE_LINED8_TP);
    public static final Item ORANGE_LINED8_TP =
    registerNormal(AllBlocks.ORANGE_LINED8_TP);
    public static final Item MAGENTA_LINED8_TP =
    registerNormal(AllBlocks.MAGENTA_LINED8_TP);
    public static final Item LIGHT_BLUE_LINED8_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_LINED8_TP);
    public static final Item YELLOW_LINED8_TP =
    registerNormal(AllBlocks.YELLOW_LINED8_TP);
    public static final Item LIME_LINED8_TP =
    registerNormal(AllBlocks.LIME_LINED8_TP);
    public static final Item PINK_LINED8_TP =
    registerNormal(AllBlocks.PINK_LINED8_TP);
    public static final Item GRAY_LINED8_TP =
    registerNormal(AllBlocks.GRAY_LINED8_TP);
    public static final Item LIGHT_GRAY_LINED8_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_LINED8_TP);
    public static final Item CYAN_LINED8_TP =
    registerNormal(AllBlocks.CYAN_LINED8_TP);
    public static final Item PURPLE_LINED8_TP =
    registerNormal(AllBlocks.PURPLE_LINED8_TP);
    public static final Item BLUE_LINED8_TP =
    registerNormal(AllBlocks.BLUE_LINED8_TP);
    public static final Item BROWN_LINED8_TP =
    registerNormal(AllBlocks.BROWN_LINED8_TP);
    public static final Item GREEN_LINED8_TP =
    registerNormal(AllBlocks.GREEN_LINED8_TP);
    public static final Item RED_LINED8_TP =
    registerNormal(AllBlocks.RED_LINED8_TP);
    public static final Item BLACK_LINED8_TP =
    registerNormal(AllBlocks.BLACK_LINED8_TP);
    public static final Item WHITE_LINED9_TP =
    registerNormal(AllBlocks.WHITE_LINED9_TP);
    public static final Item ORANGE_LINED9_TP =
    registerNormal(AllBlocks.ORANGE_LINED9_TP);
    public static final Item MAGENTA_LINED9_TP =
    registerNormal(AllBlocks.MAGENTA_LINED9_TP);
    public static final Item LIGHT_BLUE_LINED9_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_LINED9_TP);
    public static final Item YELLOW_LINED9_TP =
    registerNormal(AllBlocks.YELLOW_LINED9_TP);
    public static final Item LIME_LINED9_TP =
    registerNormal(AllBlocks.LIME_LINED9_TP);
    public static final Item PINK_LINED9_TP =
    registerNormal(AllBlocks.PINK_LINED9_TP);
    public static final Item GRAY_LINED9_TP =
    registerNormal(AllBlocks.GRAY_LINED9_TP);
    public static final Item LIGHT_GRAY_LINED9_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_LINED9_TP);
    public static final Item CYAN_LINED9_TP =
    registerNormal(AllBlocks.CYAN_LINED9_TP);
    public static final Item PURPLE_LINED9_TP =
    registerNormal(AllBlocks.PURPLE_LINED9_TP);
    public static final Item BLUE_LINED9_TP =
    registerNormal(AllBlocks.BLUE_LINED9_TP);
    public static final Item BROWN_LINED9_TP =
    registerNormal(AllBlocks.BROWN_LINED9_TP);
    public static final Item GREEN_LINED9_TP =
    registerNormal(AllBlocks.GREEN_LINED9_TP);
    public static final Item RED_LINED9_TP =
    registerNormal(AllBlocks.RED_LINED9_TP);
    public static final Item BLACK_LINED9_TP =
    registerNormal(AllBlocks.BLACK_LINED9_TP);
    public static final Item WHITE_LINED10_TP =
    registerNormal(AllBlocks.WHITE_LINED10_TP);
    public static final Item ORANGE_LINED10_TP =
    registerNormal(AllBlocks.ORANGE_LINED10_TP);
    public static final Item MAGENTA_LINED10_TP =
    registerNormal(AllBlocks.MAGENTA_LINED10_TP);
    public static final Item LIGHT_BLUE_LINED10_TP =
    registerNormal(AllBlocks.LIGHT_BLUE_LINED10_TP);
    public static final Item YELLOW_LINED10_TP =
    registerNormal(AllBlocks.YELLOW_LINED10_TP);
    public static final Item LIME_LINED10_TP =
    registerNormal(AllBlocks.LIME_LINED10_TP);
    public static final Item PINK_LINED10_TP =
    registerNormal(AllBlocks.PINK_LINED10_TP);
    public static final Item GRAY_LINED10_TP =
    registerNormal(AllBlocks.GRAY_LINED10_TP);
    public static final Item LIGHT_GRAY_LINED10_TP =
    registerNormal(AllBlocks.LIGHT_GRAY_LINED10_TP);
    public static final Item CYAN_LINED10_TP =
    registerNormal(AllBlocks.CYAN_LINED10_TP);
    public static final Item PURPLE_LINED10_TP =
    registerNormal(AllBlocks.PURPLE_LINED10_TP);
    public static final Item BLUE_LINED10_TP =
    registerNormal(AllBlocks.BLUE_LINED10_TP);
    public static final Item BROWN_LINED10_TP =
    registerNormal(AllBlocks.BROWN_LINED10_TP);
    public static final Item GREEN_LINED10_TP =
    registerNormal(AllBlocks.GREEN_LINED10_TP);
    public static final Item RED_LINED10_TP =
    registerNormal(AllBlocks.RED_LINED10_TP);
    public static final Item BLACK_LINED10_TP =
    registerNormal(AllBlocks.BLACK_LINED10_TP);
    public static final Item WHITE_THIN_22D5_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_THIN_22D5_FLOOR_LINE);
    public static final Item YELLOW_THIN_22D5_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_THIN_22D5_FLOOR_LINE);
    public static final Item WHITE_THIN_45_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_THIN_45_FLOOR_LINE);
    public static final Item YELLOW_THIN_45_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_THIN_45_FLOOR_LINE);
    public static final Item WHITE_R1_12_C1_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_12_C1_12_FLOOR_LINE);
    public static final Item WHITE_R1_12_C2_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_12_C2_12_FLOOR_LINE);
    public static final Item WHITE_R1_12_C3_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_12_C3_12_FLOOR_LINE);
    public static final Item WHITE_R2_12_C2_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R2_12_C2_12_FLOOR_LINE);
    public static final Item WHITE_R2_12_C3_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R2_12_C3_12_FLOOR_LINE);
    public static final Item WHITE_R3_12_C3_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R3_12_C3_12_FLOOR_LINE);
    public static final Item WHITE_R1_25_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_25_C1_25_FLOOR_LINE);
    public static final Item WHITE_R1_25_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_25_C2_25_FLOOR_LINE);
    public static final Item WHITE_R1_25_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_25_C3_25_FLOOR_LINE);
    public static final Item WHITE_R2_25_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R2_25_C2_25_FLOOR_LINE);
    public static final Item WHITE_R2_25_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R2_25_C3_25_FLOOR_LINE);
    public static final Item WHITE_R3_25_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R3_25_C3_25_FLOOR_LINE);
    public static final Item WHITE_R1_12_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_12_C1_25_FLOOR_LINE);
    public static final Item WHITE_R1_12_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_12_C2_25_FLOOR_LINE);
    public static final Item WHITE_R1_12_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_12_C3_25_FLOOR_LINE);
    public static final Item WHITE_R2_12_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R2_12_C1_25_FLOOR_LINE);
    public static final Item WHITE_R2_12_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R2_12_C2_25_FLOOR_LINE);
    public static final Item WHITE_R2_12_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R2_12_C3_25_FLOOR_LINE);
    public static final Item WHITE_R3_12_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R3_12_C1_25_FLOOR_LINE);
    public static final Item WHITE_R3_12_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R3_12_C2_25_FLOOR_LINE);
    public static final Item WHITE_R3_12_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R3_12_C3_25_FLOOR_LINE);
    public static final Item YELLOW_R1_12_C1_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_12_C1_12_FLOOR_LINE);
    public static final Item YELLOW_R1_12_C2_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_12_C2_12_FLOOR_LINE);
    public static final Item YELLOW_R1_12_C3_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_12_C3_12_FLOOR_LINE);
    public static final Item YELLOW_R2_12_C2_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R2_12_C2_12_FLOOR_LINE);
    public static final Item YELLOW_R2_12_C3_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R2_12_C3_12_FLOOR_LINE);
    public static final Item YELLOW_R3_12_C3_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R3_12_C3_12_FLOOR_LINE);
    public static final Item YELLOW_R1_25_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_25_C1_25_FLOOR_LINE);
    public static final Item YELLOW_R1_25_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_25_C2_25_FLOOR_LINE);
    public static final Item YELLOW_R1_25_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_25_C3_25_FLOOR_LINE);
    public static final Item YELLOW_R2_25_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R2_25_C2_25_FLOOR_LINE);
    public static final Item YELLOW_R2_25_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R2_25_C3_25_FLOOR_LINE);
    public static final Item YELLOW_R3_25_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R3_25_C3_25_FLOOR_LINE);
    public static final Item YELLOW_R1_12_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_12_C1_25_FLOOR_LINE);
    public static final Item YELLOW_R1_12_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_12_C2_25_FLOOR_LINE);
    public static final Item YELLOW_R1_12_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_12_C3_25_FLOOR_LINE);
    public static final Item YELLOW_R2_12_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R2_12_C1_25_FLOOR_LINE);
    public static final Item YELLOW_R2_12_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R2_12_C2_25_FLOOR_LINE);
    public static final Item YELLOW_R2_12_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R2_12_C3_25_FLOOR_LINE);
    public static final Item YELLOW_R3_12_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R3_12_C1_25_FLOOR_LINE);
    public static final Item YELLOW_R3_12_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R3_12_C2_25_FLOOR_LINE);
    public static final Item YELLOW_R3_12_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R3_12_C3_25_FLOOR_LINE);
    public static final Item WHITE_R0_12_C0_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_12_C0_12_FLOOR_LINE);
    public static final Item YELLOW_R0_12_C0_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_12_C0_12_FLOOR_LINE);
    public static final Item WHITE_R0_F12_YELLOW_C0_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F12_YELLOW_C0_12_FLOOR_LINE);
    public static final Item YELLOW_R0_F12_WHITE_C0_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F12_WHITE_C0_12_FLOOR_LINE);
    public static final Item WHITE_R0_12_C1_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_12_C1_12_FLOOR_LINE);
    public static final Item YELLOW_R0_12_C1_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_12_C1_12_FLOOR_LINE);
    public static final Item WHITE_R0_F12_YELLOW_C1_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F12_YELLOW_C1_12_FLOOR_LINE);
    public static final Item YELLOW_R0_F12_WHITE_C1_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F12_WHITE_C1_12_FLOOR_LINE);
    public static final Item WHITE_R0_12_C2_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_12_C2_12_FLOOR_LINE);
    public static final Item YELLOW_R0_12_C2_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_12_C2_12_FLOOR_LINE);
    public static final Item WHITE_R0_F12_YELLOW_C2_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F12_YELLOW_C2_12_FLOOR_LINE);
    public static final Item YELLOW_R0_F12_WHITE_C2_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F12_WHITE_C2_12_FLOOR_LINE);
    public static final Item WHITE_R0_12_C3_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_12_C3_12_FLOOR_LINE);
    public static final Item YELLOW_R0_12_C3_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_12_C3_12_FLOOR_LINE);
    public static final Item WHITE_R0_F12_YELLOW_C3_12_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F12_YELLOW_C3_12_FLOOR_LINE);
    public static final Item YELLOW_R0_F12_WHITE_C3_12_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F12_WHITE_C3_12_FLOOR_LINE);
    public static final Item WHITE_R0_25_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_25_C0_25_FLOOR_LINE);
    public static final Item YELLOW_R0_25_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_25_C0_25_FLOOR_LINE);
    public static final Item WHITE_R0_F25_YELLOW_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F25_YELLOW_C0_25_FLOOR_LINE);
    public static final Item YELLOW_R0_F25_WHITE_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F25_WHITE_C0_25_FLOOR_LINE);
    public static final Item WHITE_R0_25_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_25_C1_25_FLOOR_LINE);
    public static final Item YELLOW_R0_25_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_25_C1_25_FLOOR_LINE);
    public static final Item WHITE_R0_F25_YELLOW_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F25_YELLOW_C1_25_FLOOR_LINE);
    public static final Item YELLOW_R0_F25_WHITE_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F25_WHITE_C1_25_FLOOR_LINE);
    public static final Item WHITE_R0_25_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_25_C2_25_FLOOR_LINE);
    public static final Item YELLOW_R0_25_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_25_C2_25_FLOOR_LINE);
    public static final Item WHITE_R0_F25_YELLOW_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F25_YELLOW_C2_25_FLOOR_LINE);
    public static final Item YELLOW_R0_F25_WHITE_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F25_WHITE_C2_25_FLOOR_LINE);
    public static final Item WHITE_R0_25_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_25_C3_25_FLOOR_LINE);
    public static final Item YELLOW_R0_25_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_25_C3_25_FLOOR_LINE);
    public static final Item WHITE_R0_F25_YELLOW_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F25_YELLOW_C3_25_FLOOR_LINE);
    public static final Item YELLOW_R0_F25_WHITE_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F25_WHITE_C3_25_FLOOR_LINE);
    public static final Item WHITE_R0_12_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_12_C1_25_FLOOR_LINE);
    public static final Item YELLOW_R0_12_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_12_C1_25_FLOOR_LINE);
    public static final Item WHITE_R0_F12_YELLOW_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F12_YELLOW_C1_25_FLOOR_LINE);
    public static final Item YELLOW_R0_F12_WHITE_C1_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F12_WHITE_C1_25_FLOOR_LINE);
    public static final Item WHITE_R0_12_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_12_C2_25_FLOOR_LINE);
    public static final Item YELLOW_R0_12_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_12_C2_25_FLOOR_LINE);
    public static final Item WHITE_R0_F12_YELLOW_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F12_YELLOW_C2_25_FLOOR_LINE);
    public static final Item YELLOW_R0_F12_WHITE_C2_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F12_WHITE_C2_25_FLOOR_LINE);
    public static final Item WHITE_R0_12_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_12_C3_25_FLOOR_LINE);
    public static final Item YELLOW_R0_12_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_12_C3_25_FLOOR_LINE);
    public static final Item WHITE_R0_F12_YELLOW_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F12_YELLOW_C3_25_FLOOR_LINE);
    public static final Item YELLOW_R0_F12_WHITE_C3_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F12_WHITE_C3_25_FLOOR_LINE);
    public static final Item WHITE_R1_12_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_12_C0_25_FLOOR_LINE);
    public static final Item YELLOW_R1_12_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_12_C0_25_FLOOR_LINE);
    public static final Item WHITE_R1_12_YELLOW_C0_F25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R1_12_YELLOW_C0_F25_FLOOR_LINE);
    public static final Item YELLOW_R1_12_WHITE_C0_F25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R1_12_WHITE_C0_F25_FLOOR_LINE);
    public static final Item WHITE_R2_12_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R2_12_C0_25_FLOOR_LINE);
    public static final Item YELLOW_R2_12_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R2_12_C0_25_FLOOR_LINE);
    public static final Item WHITE_R2_12_YELLOW_C0_F25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R2_12_YELLOW_C0_F25_FLOOR_LINE);
    public static final Item YELLOW_R2_12_WHITE_C0_F25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R2_12_WHITE_C0_F25_FLOOR_LINE);
    public static final Item WHITE_R3_12_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R3_12_C0_25_FLOOR_LINE);
    public static final Item YELLOW_R3_12_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R3_12_C0_25_FLOOR_LINE);
    public static final Item WHITE_R3_12_YELLOW_C0_F25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R3_12_YELLOW_C0_F25_FLOOR_LINE);
    public static final Item YELLOW_R3_12_WHITE_C0_F25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R3_12_WHITE_C0_F25_FLOOR_LINE);
    public static final Item WHITE_R0_12_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_12_C0_25_FLOOR_LINE);
    public static final Item YELLOW_R0_12_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_12_C0_25_FLOOR_LINE);
    public static final Item WHITE_R0_F12_YELLOW_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_F12_YELLOW_C0_25_FLOOR_LINE);
    public static final Item YELLOW_R0_F12_WHITE_C0_25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_F12_WHITE_C0_25_FLOOR_LINE);
    public static final Item WHITE_R0_12_YELLOW_C0_F25_FLOOR_LINE =
    registerNormal(AllBlocks.WHITE_R0_12_YELLOW_C0_F25_FLOOR_LINE);
    public static final Item YELLOW_R0_12_WHITE_C0_F25_FLOOR_LINE =
    registerNormal(AllBlocks.YELLOW_R0_12_WHITE_C0_F25_FLOOR_LINE);
    public static final ItemGroup ITEM_GROUP;

    public static BlockItem registerNormal(Block block) {
        return registerBlockItem(block, new Item.Settings().maxCount(64));
    }

    public static void init() {}

    static {
        Item[] SPEEDLIMIT_HIGH_ITEMS = new Item[]{
            SPEEDLIMIT_HIGH_3, SPEEDLIMIT_HIGH_5, SPEEDLIMIT_HIGH_10,
            SPEEDLIMIT_HIGH_15, SPEEDLIMIT_HIGH_20, SPEEDLIMIT_HIGH_25,
            SPEEDLIMIT_HIGH_30, SPEEDLIMIT_HIGH_35, SPEEDLIMIT_HIGH_40,
            SPEEDLIMIT_HIGH_45, SPEEDLIMIT_HIGH_50, SPEEDLIMIT_HIGH_55,
            SPEEDLIMIT_HIGH_60, SPEEDLIMIT_HIGH_65, SPEEDLIMIT_HIGH_70,
            SPEEDLIMIT_HIGH_75, SPEEDLIMIT_HIGH_80, SPEEDLIMIT_HIGH_85,
            SPEEDLIMIT_HIGH_90, SPEEDLIMIT_HIGH_95, SPEEDLIMIT_HIGH_100,
            SPEEDLIMIT_HIGH_105, SPEEDLIMIT_HIGH_110, SPEEDLIMIT_HIGH_115,
            SPEEDLIMIT_HIGH_120, SPEEDLIMIT_HIGH_125, SPEEDLIMIT_HIGH_130,
            SPEEDLIMIT_HIGH_135, SPEEDLIMIT_HIGH_140, SPEEDLIMIT_HIGH_145,
            SPEEDLIMIT_HIGH_150, SPEEDLIMIT_HIGH_SPECIAL
        };
        Item[] SPEEDLIMIT_LOW_ITEMS = new Item[]{
            SPEEDLIMIT_LOW_3, SPEEDLIMIT_LOW_5, SPEEDLIMIT_LOW_10,
            SPEEDLIMIT_LOW_15, SPEEDLIMIT_LOW_20, SPEEDLIMIT_LOW_25,
            SPEEDLIMIT_LOW_30, SPEEDLIMIT_LOW_35, SPEEDLIMIT_LOW_40,
            SPEEDLIMIT_LOW_45, SPEEDLIMIT_LOW_50, SPEEDLIMIT_LOW_55,
            SPEEDLIMIT_LOW_60, SPEEDLIMIT_LOW_65, SPEEDLIMIT_LOW_70,
            SPEEDLIMIT_LOW_75, SPEEDLIMIT_LOW_80, SPEEDLIMIT_LOW_85,
            SPEEDLIMIT_LOW_90, SPEEDLIMIT_LOW_95, SPEEDLIMIT_LOW_100,
            SPEEDLIMIT_LOW_105, SPEEDLIMIT_LOW_110, SPEEDLIMIT_LOW_115,
            SPEEDLIMIT_LOW_120, SPEEDLIMIT_LOW_125, SPEEDLIMIT_LOW_130,
            SPEEDLIMIT_LOW_135, SPEEDLIMIT_LOW_140, SPEEDLIMIT_LOW_145,
            SPEEDLIMIT_LOW_150, SPEEDLIMIT_LOW_SPECIAL
        };
        Item[] LIFT_SPEEDLIMIT_HIGH_ITEMS = new Item[]{
            LIFT_SPEEDLIMIT_HIGH_3, LIFT_SPEEDLIMIT_HIGH_5,
            LIFT_SPEEDLIMIT_HIGH_10, LIFT_SPEEDLIMIT_HIGH_15,
            LIFT_SPEEDLIMIT_HIGH_20, LIFT_SPEEDLIMIT_HIGH_25,
            LIFT_SPEEDLIMIT_HIGH_30, LIFT_SPEEDLIMIT_HIGH_35,
            LIFT_SPEEDLIMIT_HIGH_40, LIFT_SPEEDLIMIT_HIGH_45,
            LIFT_SPEEDLIMIT_HIGH_50, LIFT_SPEEDLIMIT_HIGH_55,
            LIFT_SPEEDLIMIT_HIGH_60, LIFT_SPEEDLIMIT_HIGH_65,
            LIFT_SPEEDLIMIT_HIGH_70, LIFT_SPEEDLIMIT_HIGH_75,
            LIFT_SPEEDLIMIT_HIGH_80, LIFT_SPEEDLIMIT_HIGH_85,
            LIFT_SPEEDLIMIT_HIGH_90, LIFT_SPEEDLIMIT_HIGH_95,
            LIFT_SPEEDLIMIT_HIGH_100, LIFT_SPEEDLIMIT_HIGH_105,
            LIFT_SPEEDLIMIT_HIGH_110, LIFT_SPEEDLIMIT_HIGH_115,
            LIFT_SPEEDLIMIT_HIGH_120, LIFT_SPEEDLIMIT_HIGH_125,
            LIFT_SPEEDLIMIT_HIGH_130, LIFT_SPEEDLIMIT_HIGH_135,
            LIFT_SPEEDLIMIT_HIGH_140, LIFT_SPEEDLIMIT_HIGH_145,
            LIFT_SPEEDLIMIT_HIGH_150, LIFT_SPEEDLIMIT_HIGH_SPECIAL
        };
        Item[] HEIGHTLIMIT_ITEMS = new Item[]{
            HEIGHTLIMIT_SPECIAL, HEIGHTLIMIT_0D1, HEIGHTLIMIT_0D2,
            HEIGHTLIMIT_0D3, HEIGHTLIMIT_0D4, HEIGHTLIMIT_0D5, HEIGHTLIMIT_0D6,
            HEIGHTLIMIT_0D7, HEIGHTLIMIT_0D8, HEIGHTLIMIT_0D9, HEIGHTLIMIT_1,
            HEIGHTLIMIT_1D1, HEIGHTLIMIT_1D2, HEIGHTLIMIT_1D3, HEIGHTLIMIT_1D4,
            HEIGHTLIMIT_1D5, HEIGHTLIMIT_1D6, HEIGHTLIMIT_1D7, HEIGHTLIMIT_1D8,
            HEIGHTLIMIT_1D9, HEIGHTLIMIT_2, HEIGHTLIMIT_2D1, HEIGHTLIMIT_2D2,
            HEIGHTLIMIT_2D3, HEIGHTLIMIT_2D4, HEIGHTLIMIT_2D5, HEIGHTLIMIT_2D6,
            HEIGHTLIMIT_2D7, HEIGHTLIMIT_2D8, HEIGHTLIMIT_2D9, HEIGHTLIMIT_3,
            HEIGHTLIMIT_3D1, HEIGHTLIMIT_3D2, HEIGHTLIMIT_3D3, HEIGHTLIMIT_3D4,
            HEIGHTLIMIT_3D5, HEIGHTLIMIT_3D6, HEIGHTLIMIT_3D7, HEIGHTLIMIT_3D8,
            HEIGHTLIMIT_3D9, HEIGHTLIMIT_4, HEIGHTLIMIT_4D1, HEIGHTLIMIT_4D2,
            HEIGHTLIMIT_4D3, HEIGHTLIMIT_4D4, HEIGHTLIMIT_4D5, HEIGHTLIMIT_4D6,
            HEIGHTLIMIT_4D7, HEIGHTLIMIT_4D8, HEIGHTLIMIT_4D9, HEIGHTLIMIT_5,
            HEIGHTLIMIT_5D1, HEIGHTLIMIT_5D2, HEIGHTLIMIT_5D3, HEIGHTLIMIT_5D4,
            HEIGHTLIMIT_5D5, HEIGHTLIMIT_5D6, HEIGHTLIMIT_5D7, HEIGHTLIMIT_5D8,
            HEIGHTLIMIT_5D9, HEIGHTLIMIT_6, HEIGHTLIMIT_6D1, HEIGHTLIMIT_6D2,
            HEIGHTLIMIT_6D3, HEIGHTLIMIT_6D4, HEIGHTLIMIT_6D5, HEIGHTLIMIT_6D6,
            HEIGHTLIMIT_6D7, HEIGHTLIMIT_6D8, HEIGHTLIMIT_6D9, HEIGHTLIMIT_7,
            HEIGHTLIMIT_7D1, HEIGHTLIMIT_7D2, HEIGHTLIMIT_7D3, HEIGHTLIMIT_7D4,
            HEIGHTLIMIT_7D5, HEIGHTLIMIT_7D6, HEIGHTLIMIT_7D7, HEIGHTLIMIT_7D8,
            HEIGHTLIMIT_7D9, HEIGHTLIMIT_8, HEIGHTLIMIT_8D1, HEIGHTLIMIT_8D2,
            HEIGHTLIMIT_8D3, HEIGHTLIMIT_8D4, HEIGHTLIMIT_8D5, HEIGHTLIMIT_8D6,
            HEIGHTLIMIT_8D7, HEIGHTLIMIT_8D8, HEIGHTLIMIT_8D9, HEIGHTLIMIT_9,
            HEIGHTLIMIT_9D1, HEIGHTLIMIT_9D2, HEIGHTLIMIT_9D3, HEIGHTLIMIT_9D4,
            HEIGHTLIMIT_9D5, HEIGHTLIMIT_9D6, HEIGHTLIMIT_9D7, HEIGHTLIMIT_9D8,
            HEIGHTLIMIT_9D9, HEIGHTLIMIT_10
        };
        Item[] PROHIBITION_ITEMS = new Item[]{
            PROHIBITION, NO_U_TURN, NO_LEFT_TURN, NO_RIGHT_TURN, NO_PARKING,
            NO_ENTRY, NO_LEFT_AND_RIGHT_TURN, NO_STRAIGHT_AHEAD,
            NO_STRAIGHT_AHEAD_AND_LEFT_TURN, NO_STRAIGHT_AHEAD_AND_RIGHT_TURN,
            NO_STOPPING, NO_STOPPING_LEFT, NO_STOPPING_LEFT_RIGHT,
            NO_STOPPING_RIGHT
        };
        Item[] HIGHWAY_HM_ITEMS = new Item[]{
            HIGHWAY_1HM, HIGHWAY_2HM, HIGHWAY_3HM, HIGHWAY_4HM, HIGHWAY_5HM,
            HIGHWAY_6HM, HIGHWAY_7HM, HIGHWAY_8HM, HIGHWAY_9HM
        };
        Item[] HALF1_CYLINDRICAL_ROD_ITEMS = new Item[]{
            WHITE_HALF1_CYLINDRICAL_ROD, ORANGE_HALF1_CYLINDRICAL_ROD,
            MAGENTA_HALF1_CYLINDRICAL_ROD, LIGHT_BLUE_HALF1_CYLINDRICAL_ROD,
            YELLOW_HALF1_CYLINDRICAL_ROD, LIME_HALF1_CYLINDRICAL_ROD,
            PINK_HALF1_CYLINDRICAL_ROD, GRAY_HALF1_CYLINDRICAL_ROD,
            LIGHT_GRAY_HALF1_CYLINDRICAL_ROD, CYAN_HALF1_CYLINDRICAL_ROD,
            PURPLE_HALF1_CYLINDRICAL_ROD, BLUE_HALF1_CYLINDRICAL_ROD,
            BROWN_HALF1_CYLINDRICAL_ROD, GREEN_HALF1_CYLINDRICAL_ROD,
            RED_HALF1_CYLINDRICAL_ROD, BLACK_HALF1_CYLINDRICAL_ROD
        };
        Item[] FULL1_CYLINDRICAL_ROD_ITEMS = new Item[]{
            WHITE_FULL1_CYLINDRICAL_ROD, ORANGE_FULL1_CYLINDRICAL_ROD,
            MAGENTA_FULL1_CYLINDRICAL_ROD, LIGHT_BLUE_FULL1_CYLINDRICAL_ROD,
            YELLOW_FULL1_CYLINDRICAL_ROD, LIME_FULL1_CYLINDRICAL_ROD,
            PINK_FULL1_CYLINDRICAL_ROD, GRAY_FULL1_CYLINDRICAL_ROD,
            LIGHT_GRAY_FULL1_CYLINDRICAL_ROD, CYAN_FULL1_CYLINDRICAL_ROD,
            PURPLE_FULL1_CYLINDRICAL_ROD, BLUE_FULL1_CYLINDRICAL_ROD,
            BROWN_FULL1_CYLINDRICAL_ROD, GREEN_FULL1_CYLINDRICAL_ROD,
            RED_FULL1_CYLINDRICAL_ROD, BLACK_FULL1_CYLINDRICAL_ROD
        };
        Item[] ROD_WITH_LAMP_ITEMS = new Item[]{
            WHITE_ROD_WITH_LAMP, ORANGE_ROD_WITH_LAMP, MAGENTA_ROD_WITH_LAMP,
            LIGHT_BLUE_ROD_WITH_LAMP, YELLOW_ROD_WITH_LAMP, LIME_ROD_WITH_LAMP,
            PINK_ROD_WITH_LAMP, GRAY_ROD_WITH_LAMP, LIGHT_GRAY_ROD_WITH_LAMP,
            CYAN_ROD_WITH_LAMP, PURPLE_ROD_WITH_LAMP, BLUE_ROD_WITH_LAMP,
            BROWN_ROD_WITH_LAMP, GREEN_ROD_WITH_LAMP, RED_ROD_WITH_LAMP,
            BLACK_ROD_WITH_LAMP
        };
        Item[] EMPTY_ARR = new Item[0];
        Item[][] DOTTED_TP_ITEMS =
        new Item[][]{EMPTY_ARR, EMPTY_ARR, EMPTY_ARR, EMPTY_ARR, new Item[]{
            WHITE_DOTTED4_TP, ORANGE_DOTTED4_TP, MAGENTA_DOTTED4_TP,
            LIGHT_BLUE_DOTTED4_TP, YELLOW_DOTTED4_TP, LIME_DOTTED4_TP,
            PINK_DOTTED4_TP, GRAY_DOTTED4_TP, LIGHT_GRAY_DOTTED4_TP,
            CYAN_DOTTED4_TP, PURPLE_DOTTED4_TP, BLUE_DOTTED4_TP,
            BROWN_DOTTED4_TP, GREEN_DOTTED4_TP, RED_DOTTED4_TP,
            BLACK_DOTTED4_TP
        }, new Item[]{
            WHITE_DOTTED5_TP, ORANGE_DOTTED5_TP, MAGENTA_DOTTED5_TP,
            LIGHT_BLUE_DOTTED5_TP, YELLOW_DOTTED5_TP, LIME_DOTTED5_TP,
            PINK_DOTTED5_TP, GRAY_DOTTED5_TP, LIGHT_GRAY_DOTTED5_TP,
            CYAN_DOTTED5_TP, PURPLE_DOTTED5_TP, BLUE_DOTTED5_TP,
            BROWN_DOTTED5_TP, GREEN_DOTTED5_TP, RED_DOTTED5_TP,
            BLACK_DOTTED5_TP
        }, new Item[]{
            WHITE_DOTTED6_TP, ORANGE_DOTTED6_TP, MAGENTA_DOTTED6_TP,
            LIGHT_BLUE_DOTTED6_TP, YELLOW_DOTTED6_TP, LIME_DOTTED6_TP,
            PINK_DOTTED6_TP, GRAY_DOTTED6_TP, LIGHT_GRAY_DOTTED6_TP,
            CYAN_DOTTED6_TP, PURPLE_DOTTED6_TP, BLUE_DOTTED6_TP,
            BROWN_DOTTED6_TP, GREEN_DOTTED6_TP, RED_DOTTED6_TP,
            BLACK_DOTTED6_TP
        }, new Item[]{
            WHITE_DOTTED7_TP, ORANGE_DOTTED7_TP, MAGENTA_DOTTED7_TP,
            LIGHT_BLUE_DOTTED7_TP, YELLOW_DOTTED7_TP, LIME_DOTTED7_TP,
            PINK_DOTTED7_TP, GRAY_DOTTED7_TP, LIGHT_GRAY_DOTTED7_TP,
            CYAN_DOTTED7_TP, PURPLE_DOTTED7_TP, BLUE_DOTTED7_TP,
            BROWN_DOTTED7_TP, GREEN_DOTTED7_TP, RED_DOTTED7_TP,
            BLACK_DOTTED7_TP
        }, new Item[]{
            WHITE_DOTTED8_TP, ORANGE_DOTTED8_TP, MAGENTA_DOTTED8_TP,
            LIGHT_BLUE_DOTTED8_TP, YELLOW_DOTTED8_TP, LIME_DOTTED8_TP,
            PINK_DOTTED8_TP, GRAY_DOTTED8_TP, LIGHT_GRAY_DOTTED8_TP,
            CYAN_DOTTED8_TP, PURPLE_DOTTED8_TP, BLUE_DOTTED8_TP,
            BROWN_DOTTED8_TP, GREEN_DOTTED8_TP, RED_DOTTED8_TP,
            BLACK_DOTTED8_TP
        }, new Item[]{
            WHITE_DOTTED9_TP, ORANGE_DOTTED9_TP, MAGENTA_DOTTED9_TP,
            LIGHT_BLUE_DOTTED9_TP, YELLOW_DOTTED9_TP, LIME_DOTTED9_TP,
            PINK_DOTTED9_TP, GRAY_DOTTED9_TP, LIGHT_GRAY_DOTTED9_TP,
            CYAN_DOTTED9_TP, PURPLE_DOTTED9_TP, BLUE_DOTTED9_TP,
            BROWN_DOTTED9_TP, GREEN_DOTTED9_TP, RED_DOTTED9_TP,
            BLACK_DOTTED9_TP
        }, new Item[]{
            WHITE_DOTTED10_TP, ORANGE_DOTTED10_TP, MAGENTA_DOTTED10_TP,
            LIGHT_BLUE_DOTTED10_TP, YELLOW_DOTTED10_TP, LIME_DOTTED10_TP,
            PINK_DOTTED10_TP, GRAY_DOTTED10_TP, LIGHT_GRAY_DOTTED10_TP,
            CYAN_DOTTED10_TP, PURPLE_DOTTED10_TP, BLUE_DOTTED10_TP,
            BROWN_DOTTED10_TP, GREEN_DOTTED10_TP, RED_DOTTED10_TP,
            BLACK_DOTTED10_TP
        }};
        Item[][] LINED_TP_ITEMS =
        new Item[][]{EMPTY_ARR, EMPTY_ARR, EMPTY_ARR, EMPTY_ARR, new Item[]{
            WHITE_LINED4_TP, ORANGE_LINED4_TP, MAGENTA_LINED4_TP,
            LIGHT_BLUE_LINED4_TP, YELLOW_LINED4_TP, LIME_LINED4_TP,
            PINK_LINED4_TP, GRAY_LINED4_TP, LIGHT_GRAY_LINED4_TP,
            CYAN_LINED4_TP, PURPLE_LINED4_TP, BLUE_LINED4_TP,
            BROWN_LINED4_TP, GREEN_LINED4_TP, RED_LINED4_TP, BLACK_LINED4_TP
        }, new Item[]{
            WHITE_LINED5_TP, ORANGE_LINED5_TP, MAGENTA_LINED5_TP,
            LIGHT_BLUE_LINED5_TP, YELLOW_LINED5_TP, LIME_LINED5_TP,
            PINK_LINED5_TP, GRAY_LINED5_TP, LIGHT_GRAY_LINED5_TP,
            CYAN_LINED5_TP, PURPLE_LINED5_TP, BLUE_LINED5_TP,
            BROWN_LINED5_TP, GREEN_LINED5_TP, RED_LINED5_TP, BLACK_LINED5_TP
        }, new Item[]{
            WHITE_LINED6_TP, ORANGE_LINED6_TP, MAGENTA_LINED6_TP,
            LIGHT_BLUE_LINED6_TP, YELLOW_LINED6_TP, LIME_LINED6_TP,
            PINK_LINED6_TP, GRAY_LINED6_TP, LIGHT_GRAY_LINED6_TP,
            CYAN_LINED6_TP, PURPLE_LINED6_TP, BLUE_LINED6_TP,
            BROWN_LINED6_TP, GREEN_LINED6_TP, RED_LINED6_TP, BLACK_LINED6_TP
        }, new Item[]{
            WHITE_LINED7_TP, ORANGE_LINED7_TP, MAGENTA_LINED7_TP,
            LIGHT_BLUE_LINED7_TP, YELLOW_LINED7_TP, LIME_LINED7_TP,
            PINK_LINED7_TP, GRAY_LINED7_TP, LIGHT_GRAY_LINED7_TP,
            CYAN_LINED7_TP, PURPLE_LINED7_TP, BLUE_LINED7_TP,
            BROWN_LINED7_TP, GREEN_LINED7_TP, RED_LINED7_TP, BLACK_LINED7_TP
        }, new Item[]{
            WHITE_LINED8_TP, ORANGE_LINED8_TP, MAGENTA_LINED8_TP,
            LIGHT_BLUE_LINED8_TP, YELLOW_LINED8_TP, LIME_LINED8_TP,
            PINK_LINED8_TP, GRAY_LINED8_TP, LIGHT_GRAY_LINED8_TP,
            CYAN_LINED8_TP, PURPLE_LINED8_TP, BLUE_LINED8_TP,
            BROWN_LINED8_TP, GREEN_LINED8_TP, RED_LINED8_TP, BLACK_LINED8_TP
        }, new Item[]{
            WHITE_LINED9_TP, ORANGE_LINED9_TP, MAGENTA_LINED9_TP,
            LIGHT_BLUE_LINED9_TP, YELLOW_LINED9_TP, LIME_LINED9_TP,
            PINK_LINED9_TP, GRAY_LINED9_TP, LIGHT_GRAY_LINED9_TP,
            CYAN_LINED9_TP, PURPLE_LINED9_TP, BLUE_LINED9_TP,
            BROWN_LINED9_TP, GREEN_LINED9_TP, RED_LINED9_TP, BLACK_LINED9_TP
        }, new Item[]{
            WHITE_LINED10_TP, ORANGE_LINED10_TP, MAGENTA_LINED10_TP,
            LIGHT_BLUE_LINED10_TP, YELLOW_LINED10_TP, LIME_LINED10_TP,
            PINK_LINED10_TP, GRAY_LINED10_TP, LIGHT_GRAY_LINED10_TP,
            CYAN_LINED10_TP, PURPLE_LINED10_TP, BLUE_LINED10_TP,
            BROWN_LINED10_TP, GREEN_LINED10_TP, RED_LINED10_TP,
            BLACK_LINED10_TP
        }};
        Item[] FLOOR_LINE_CROSS_ITEMS = new Item[]{
            WHITE_R1_12_C1_12_FLOOR_LINE, WHITE_R1_12_C2_12_FLOOR_LINE,
            WHITE_R1_12_C3_12_FLOOR_LINE, WHITE_R2_12_C2_12_FLOOR_LINE,
            WHITE_R2_12_C3_12_FLOOR_LINE, WHITE_R3_12_C3_12_FLOOR_LINE,
            WHITE_R1_25_C1_25_FLOOR_LINE, WHITE_R1_25_C2_25_FLOOR_LINE,
            WHITE_R1_25_C3_25_FLOOR_LINE, WHITE_R2_25_C2_25_FLOOR_LINE,
            WHITE_R2_25_C3_25_FLOOR_LINE, WHITE_R3_25_C3_25_FLOOR_LINE,
            WHITE_R1_12_C1_25_FLOOR_LINE, WHITE_R1_12_C2_25_FLOOR_LINE,
            WHITE_R1_12_C3_25_FLOOR_LINE, WHITE_R2_12_C1_25_FLOOR_LINE,
            WHITE_R2_12_C2_25_FLOOR_LINE, WHITE_R2_12_C3_25_FLOOR_LINE,
            WHITE_R3_12_C1_25_FLOOR_LINE, WHITE_R3_12_C2_25_FLOOR_LINE,
            WHITE_R3_12_C3_25_FLOOR_LINE, YELLOW_R1_12_C1_12_FLOOR_LINE,
            YELLOW_R1_12_C2_12_FLOOR_LINE, YELLOW_R1_12_C3_12_FLOOR_LINE,
            YELLOW_R2_12_C2_12_FLOOR_LINE, YELLOW_R2_12_C3_12_FLOOR_LINE,
            YELLOW_R3_12_C3_12_FLOOR_LINE, YELLOW_R1_25_C1_25_FLOOR_LINE,
            YELLOW_R1_25_C2_25_FLOOR_LINE, YELLOW_R1_25_C3_25_FLOOR_LINE,
            YELLOW_R2_25_C2_25_FLOOR_LINE, YELLOW_R2_25_C3_25_FLOOR_LINE,
            YELLOW_R3_25_C3_25_FLOOR_LINE, YELLOW_R1_12_C1_25_FLOOR_LINE,
            YELLOW_R1_12_C2_25_FLOOR_LINE, YELLOW_R1_12_C3_25_FLOOR_LINE,
            YELLOW_R2_12_C1_25_FLOOR_LINE, YELLOW_R2_12_C2_25_FLOOR_LINE,
            YELLOW_R2_12_C3_25_FLOOR_LINE, YELLOW_R3_12_C1_25_FLOOR_LINE,
            YELLOW_R3_12_C2_25_FLOOR_LINE, YELLOW_R3_12_C3_25_FLOOR_LINE,
            WHITE_R0_12_C0_12_FLOOR_LINE, YELLOW_R0_12_C0_12_FLOOR_LINE,
            WHITE_R0_F12_YELLOW_C0_12_FLOOR_LINE,
            YELLOW_R0_F12_WHITE_C0_12_FLOOR_LINE,
            WHITE_R0_12_C1_12_FLOOR_LINE, YELLOW_R0_12_C1_12_FLOOR_LINE,
            WHITE_R0_F12_YELLOW_C1_12_FLOOR_LINE,
            YELLOW_R0_F12_WHITE_C1_12_FLOOR_LINE,
            WHITE_R0_12_C2_12_FLOOR_LINE, YELLOW_R0_12_C2_12_FLOOR_LINE,
            WHITE_R0_F12_YELLOW_C2_12_FLOOR_LINE,
            YELLOW_R0_F12_WHITE_C2_12_FLOOR_LINE,
            WHITE_R0_12_C3_12_FLOOR_LINE, YELLOW_R0_12_C3_12_FLOOR_LINE,
            WHITE_R0_F12_YELLOW_C3_12_FLOOR_LINE,
            YELLOW_R0_F12_WHITE_C3_12_FLOOR_LINE,
            WHITE_R0_25_C0_25_FLOOR_LINE, YELLOW_R0_25_C0_25_FLOOR_LINE,
            WHITE_R0_F25_YELLOW_C0_25_FLOOR_LINE,
            YELLOW_R0_F25_WHITE_C0_25_FLOOR_LINE,
            WHITE_R0_25_C1_25_FLOOR_LINE, YELLOW_R0_25_C1_25_FLOOR_LINE,
            WHITE_R0_F25_YELLOW_C1_25_FLOOR_LINE,
            YELLOW_R0_F25_WHITE_C1_25_FLOOR_LINE,
            WHITE_R0_25_C2_25_FLOOR_LINE, YELLOW_R0_25_C2_25_FLOOR_LINE,
            WHITE_R0_F25_YELLOW_C2_25_FLOOR_LINE,
            YELLOW_R0_F25_WHITE_C2_25_FLOOR_LINE,
            WHITE_R0_25_C3_25_FLOOR_LINE, YELLOW_R0_25_C3_25_FLOOR_LINE,
            WHITE_R0_F25_YELLOW_C3_25_FLOOR_LINE,
            YELLOW_R0_F25_WHITE_C3_25_FLOOR_LINE,
            WHITE_R0_12_C1_25_FLOOR_LINE, YELLOW_R0_12_C1_25_FLOOR_LINE,
            WHITE_R0_F12_YELLOW_C1_25_FLOOR_LINE,
            YELLOW_R0_F12_WHITE_C1_25_FLOOR_LINE,
            WHITE_R0_12_C2_25_FLOOR_LINE, YELLOW_R0_12_C2_25_FLOOR_LINE,
            WHITE_R0_F12_YELLOW_C2_25_FLOOR_LINE,
            YELLOW_R0_F12_WHITE_C2_25_FLOOR_LINE,
            WHITE_R0_12_C3_25_FLOOR_LINE, YELLOW_R0_12_C3_25_FLOOR_LINE,
            WHITE_R0_F12_YELLOW_C3_25_FLOOR_LINE,
            YELLOW_R0_F12_WHITE_C3_25_FLOOR_LINE,
            WHITE_R1_12_C0_25_FLOOR_LINE, YELLOW_R1_12_C0_25_FLOOR_LINE,
            WHITE_R1_12_YELLOW_C0_F25_FLOOR_LINE,
            YELLOW_R1_12_WHITE_C0_F25_FLOOR_LINE,
            WHITE_R2_12_C0_25_FLOOR_LINE, YELLOW_R2_12_C0_25_FLOOR_LINE,
            WHITE_R2_12_YELLOW_C0_F25_FLOOR_LINE,
            YELLOW_R2_12_WHITE_C0_F25_FLOOR_LINE,
            WHITE_R3_12_C0_25_FLOOR_LINE, YELLOW_R3_12_C0_25_FLOOR_LINE,
            WHITE_R3_12_YELLOW_C0_F25_FLOOR_LINE,
            YELLOW_R3_12_WHITE_C0_F25_FLOOR_LINE,
            WHITE_R0_12_C0_25_FLOOR_LINE, YELLOW_R0_12_C0_25_FLOOR_LINE,
            WHITE_R0_F12_YELLOW_C0_25_FLOOR_LINE,
            YELLOW_R0_F12_WHITE_C0_25_FLOOR_LINE,
            WHITE_R0_12_YELLOW_C0_F25_FLOOR_LINE,
            YELLOW_R0_12_WHITE_C0_F25_FLOOR_LINE
        };
        ITEM_GROUP =
        FabricItemGroup.builder()
        .icon(() -> new ItemStack(SPEEDLIMIT_HIGH_120))
        .displayName(Text.translatableWithFallback(
            "itemGroup.cntrafficsymbols_0d0", "CNTrafficSymbols 0.0"
        )).entries((c, e) -> {
            for (Item i : SPEEDLIMIT_HIGH_ITEMS) {
                e.add(i);
            }
            for (Item i : SPEEDLIMIT_LOW_ITEMS) {
                e.add(i);
            }
            for (Item i : LIFT_SPEEDLIMIT_HIGH_ITEMS) {
                e.add(i);
            }
            e.add(IRON_PLATE);
            e.add(CIRCLE_BACKBOARD);
            for (Item i : HEIGHTLIMIT_ITEMS) {
                e.add(i);
            }
            for (Item i : PROHIBITION_ITEMS) {
                e.add(i);
            }
            for (Item i : HIGHWAY_HM_ITEMS) {
                e.add(i);
            }
            e.add(WHITE_FLOOR_LINE_EIGHTH);
            e.add(YELLOW_FLOOR_LINE_EIGHTH);
            e.add(HIGHWAY_KM);
            e.add(DISTANCE_DETECTION_0M_LEFT);
            e.add(DISTANCE_DETECTION_0M_RIGHT);
            e.add(DISTANCE_DETECTION_50M_LEFT);
            e.add(DISTANCE_DETECTION_50M_RIGHT);
            e.add(DISTANCE_DETECTION_100M_LEFT);
            e.add(DISTANCE_DETECTION_100M_RIGHT);
            e.add(DISTANCE_DETECTION_200M_LEFT);
            e.add(DISTANCE_DETECTION_200M_RIGHT);
            e.add(BARRICADE_1M_EDGE_1M_HEIGHT);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP);
            e.add(KEEP_SPACE_VARIANT1_UPPERLEFT);
            e.add(KEEP_SPACE_VARIANT1_UPPER);
            e.add(KEEP_SPACE_VARIANT1_UPPERRIGHT);
            e.add(KEEP_SPACE_VARIANT2_UPPERLEFT);
            e.add(KEEP_SPACE_VARIANT2_UPPER);
            e.add(KEEP_SPACE_VARIANT2_UPPERRIGHT);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE);
            e.add(KEEP_SPACE_VARIANT1_LEFT);
            e.add(KEEP_SPACE_VARIANT1_CENTER);
            e.add(KEEP_SPACE_VARIANT1_RIGHT);
            e.add(KEEP_SPACE_VARIANT2_LEFT);
            e.add(KEEP_SPACE_VARIANT2_CENTER);
            e.add(KEEP_SPACE_VARIANT2_RIGHT);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM);
            e.add(KEEP_SPACE_VARIANT1_LOWERLEFT);
            e.add(KEEP_SPACE_VARIANT1_LOWER);
            e.add(KEEP_SPACE_VARIANT1_LOWERRIGHT);
            e.add(KEEP_SPACE_VARIANT2_LOWERLEFT);
            e.add(KEEP_SPACE_VARIANT2_LOWER);
            e.add(KEEP_SPACE_VARIANT2_LOWERRIGHT);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE);
            e.add(HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE);
            e.add(BARRICADE_50CM_EDGE_75CM_HEIGHT);
            e.add(BARRICADE_50CM_EDGE_1M_HEIGHT);
            for (Item i : HALF1_CYLINDRICAL_ROD_ITEMS) {
                e.add(i);
            }
            for (Item i : FULL1_CYLINDRICAL_ROD_ITEMS) {
                e.add(i);
            }
            for (Item i : ROD_WITH_LAMP_ITEMS) {
                e.add(i);
            }
            e.add(FULL_SQUARE_BACKBOARD);
            for (Item[] i : DOTTED_TP_ITEMS) {
                for (Item j : i) {
                    e.add(j);
                }
            }
            for (Item[] i : LINED_TP_ITEMS) {
                for (Item j : i) {
                    e.add(j);
                }
            }
            e.add(WHITE_THIN_22D5_FLOOR_LINE);
            e.add(YELLOW_THIN_22D5_FLOOR_LINE);
            e.add(WHITE_THIN_45_FLOOR_LINE);
            e.add(YELLOW_THIN_45_FLOOR_LINE);
            for (Item i : FLOOR_LINE_CROSS_ITEMS) {
                e.add(i);
            }
        }).build();
        Registry.register(Registries.ITEM_GROUP, Identifier.of(
            "cntrafficsymbols_0d0", "cntrafficsymbols"
        ), ITEM_GROUP);
    }
}
