package com.celestara;

import com.celestara.research.ResearchTableBlock;
import com.celestara.events.MeteorShowerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("celestara")
@EventBusSubscriber(modid = "celestara", bus = EventBusSubscriber.Bus.MOD)
public class Celestara {
    public static final String MOD_ID = "celestara";

    public Celestara() {
        // Register all setup methods
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        System.out.println("Celestara Mod: Common setup initialized.");
        ResearchTableBlock.register();
        MeteorShowerEvent.init();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        System.out.println("Celestara Mod: Client setup initialized.");
    }
}
