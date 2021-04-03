package com.guardian.navstraight;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Navstraight implements ClientModInitializer {

    public static final String MODID = "navstraight";
    public static final Logger LOG = LogManager.getLogger(Navstraight.MODID);

    public static Identifier id(String name){
        return new Identifier(MODID, name);
    }

    @Override
    public void onInitializeClient() {

    }
}
