package com.celestara.entities;

import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class AlienVillager extends Villager {
    private String faction;

    public AlienVillager(EntityType<? extends Villager> entityType, Level world, String faction) {
        super(entityType, world);
        this.faction = faction;
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (this.getRandom().nextFloat() < 0.005F) {
            switch (faction) {
                case "Xylox":
                    System.out.println("[Xylox Citizen]: \"Greetings, traveler. The cybernetic order welcomes you.\"");
                    break;
                case "Vel’Thar":
                    System.out.println("[Vel’Thar Warrior]: \"Outsiders must prove their worth.\"");
                    break;
                case "Zypherian":
                    System.out.println("[Zypherian Scholar]: \"Energy flows through all things.\"");
                    break;
            }
        }
    }
}
