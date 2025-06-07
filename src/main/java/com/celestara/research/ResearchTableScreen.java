package com.celestara.research;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class ResearchTableScreen extends Screen {
    private Button researchButton;

    public ResearchTableScreen() {
        super(Component.literal("Research Table"));
    }

    @Override
    protected void init() {
        this.researchButton = this.addRenderableWidget(new Button(this.width / 2 - 50, this.height / 2, 100, 20,
                Component.literal("Start Research"), (button) -> {
            startResearch();
        }));
    }

    private void startResearch() {
        ResearchManager.unlockResearch("basic_space_travel");
        System.out.println("Research started for basic space travel!");
    }
}
