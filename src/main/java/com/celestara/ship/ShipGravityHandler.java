package com.celestara.ship;

import net.minecraft.world.entity.player.Player;
import java.util.HashSet;
import java.util.Set;

public class ShipGravityHandler {
    private static final Set<Player> affectedPlayers = new HashSet<>();

    public static void toggleGravity(Player player) {
        if (affectedPlayers.contains(player)) {
            affectedPlayers.remove(player);
            System.out.println("[Ship AI]: Gravity restored for " + player.getName().getString());
        } else {
            affectedPlayers.add(player);
            System.out.println("[Ship AI]: Gravity disabled for " + player.getName().getString());
        }
    }
}
