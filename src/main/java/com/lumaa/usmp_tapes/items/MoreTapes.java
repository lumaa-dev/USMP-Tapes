package com.lumaa.usmp_tapes.items;

import com.lumaa.usmp_tapes.ModMain;
import com.lumaa.usmp_tapes.sounds.UsmpSounds;
import com.lumination.backrooms.items.BackroomsItemsGroup;
import com.lumination.backrooms.items.interactables.MusicTape;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreTapes {
    public static final Item WEIRD_AREA = registerItem(new MusicTape(1, UsmpSounds.WEIRD_AREA, new Item.Settings(), 1));
    public static final Item THE_UNDERGROUND = registerItem(new MusicTape(2, UsmpSounds.THE_UNDERGROUND, new Item.Settings(), 1));
    public static final Item STRESSFUL_ENVIRONMENT = registerItem(new MusicTape(3, UsmpSounds.STRESSFUL_ENVIRONMENT, new Item.Settings(), 1));
    public static final Item UNKNOWN_FEELING = registerItem(new MusicTape(4, UsmpSounds.UNKNOWN_FEELING, new Item.Settings(), 1));
    public static final Item NEW_WORLD = registerItem(new MusicTape(5, UsmpSounds.NEW_WORLD, new Item.Settings(), 1));
    public static final Item ENDLESS_CORRIDORS = registerItem(new MusicTape(6, UsmpSounds.ENDLESS_CORRIDORS, new Item.Settings(), 1));
    public static final Item SCROLL_TIME = registerItem(new MusicTape(7, UsmpSounds.SCROLL_TIME, new Item.Settings(), 1));
    public static final Item NEW_FREEDOM = registerItem(new MusicTape(8, UsmpSounds.NEW_FREEDOM, new Item.Settings(), 1));
    public static final Item TRAGEDY = registerItem(new MusicTape(9, UsmpSounds.TRAGEDY, new Item.Settings(), 1));
    public static final Item FORGETABLE_MEMORY = registerItem(new MusicTape(10, UsmpSounds.FORGETABLE_MEMORY, new Item.Settings(), 1));
    public static final Item UNREASONABLE_TREATMENT = registerItem(new MusicTape(11, UsmpSounds.UNREASONABLE_TREATMENT, new Item.Settings(), 1));
    public static final Item AN_END = registerItem(new MusicTape(12, UsmpSounds.AN_END, new Item.Settings(), 1));
    public static final Item THE_OUTSIDE_WORLD = registerItem(new MusicTape(13, UsmpSounds.THE_OUTSIDE_WORLD, new Item.Settings(), 1));
    public static final Item DISCOVERIES = registerItem(new MusicTape(14, UsmpSounds.DISCOVERIES, new Item.Settings(), 1));

    private static Item registerItem(MusicTape item) {
        Item newItem = Registry.register(Registries.ITEM, new Identifier(ModMain.MODID, item.getSound().getId().getPath() + "_tape"), item);

        // put in item group
        ItemGroupEvents.modifyEntriesEvent(BackroomsItemsGroup.MusicTapes).register(content -> {
            content.add(newItem);
        });

        return newItem;
    }

    public static void register() {
        ModMain.logger.info("Registered USMP Tapes Items");
    }
}