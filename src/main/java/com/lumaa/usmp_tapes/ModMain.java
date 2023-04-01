package com.lumaa.usmp_tapes;

import com.lumaa.usmp_tapes.items.MoreTapes;
import com.lumaa.usmp_tapes.sounds.UsmpSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import java.util.logging.Logger;

public class ModMain implements ModInitializer {
    public static final String MODID = "usmp_tapes";
    public static final Logger logger = Logger.getLogger(MODID);

    @Override
    public void onInitialize() {
        assert FabricLoader.getInstance().isModLoaded("backrooms");
        UsmpSounds.register();
        MoreTapes.register();

        logger.info("[Unknown SMP - Tapes] Initialized");
    }
}
