package com.lumaa.usmp_tapes.sounds;

import com.lumaa.usmp_tapes.ModMain;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class UsmpSounds {
    public static SoundEvent WEIRD_AREA = registerSoundEvent("weird_area");
    public static SoundEvent THE_UNDERGROUND = registerSoundEvent("the_underground");
    public static SoundEvent STRESSFUL_ENVIRONMENT = registerSoundEvent("a_stressful_environment");
    public static SoundEvent UNKNOWN_FEELING = registerSoundEvent("an_unknown_feeling");
    public static SoundEvent NEW_WORLD = registerSoundEvent("a_new_world");
    public static SoundEvent ENDLESS_CORRIDORS = registerSoundEvent("endless_corridors_but_at_what_cost");
    public static SoundEvent SCROLL_TIME = registerSoundEvent("a_scroll_though_time");
    public static SoundEvent NEW_FREEDOM = registerSoundEvent("a_new_way_of_freedom");
    public static SoundEvent TRAGEDY = registerSoundEvent("tragedy");
    public static SoundEvent FORGETABLE_MEMORY = registerSoundEvent("a_forgetable_memory");
    public static SoundEvent UNREASONABLE_TREATMENT = registerSoundEvent("unreasonable_treatment");
    public static SoundEvent AN_END = registerSoundEvent("an_end");
    public static SoundEvent THE_OUTSIDE_WORLD = registerSoundEvent("the_outside_world");
    public static SoundEvent DISCOVERIES = registerSoundEvent("discoveries");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ModMain.MODID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void register() {
        WEIRD_AREA.getId();
    }
}
