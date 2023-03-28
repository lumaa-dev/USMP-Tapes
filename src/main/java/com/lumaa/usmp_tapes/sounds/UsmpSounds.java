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
    public static SoundEvent UNKNOWN_FEELING = registerSoundEvent("weird_area");
    public static SoundEvent NEW_WORLD = registerSoundEvent("weird_area");
    public static SoundEvent ENDLESS_CORRIDORS = registerSoundEvent("weird_area");
    public static SoundEvent SCROLL_TIME = registerSoundEvent("weird_area");
    public static SoundEvent NEW_FREEDOM = registerSoundEvent("weird_area");
    public static SoundEvent TRAGEDY = registerSoundEvent("weird_area");
    public static SoundEvent FORGETABLE_MEMORY = registerSoundEvent("weird_area");
    public static SoundEvent UNREASONABLE_TREATMENT = registerSoundEvent("weird_area");
    public static SoundEvent AN_END = registerSoundEvent("weird_area");
    public static SoundEvent THE_OUTSIDE_WORLD = registerSoundEvent("weird_area");
    public static SoundEvent DISCOVERIES = registerSoundEvent("weird_area");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ModMain.MODID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void register() {
        WEIRD_AREA.getId();
    }
}
