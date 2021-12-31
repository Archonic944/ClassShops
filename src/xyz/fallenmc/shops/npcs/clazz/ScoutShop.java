package xyz.fallenmc.shops.npcs.clazz;

import me.zach.DesertMC.GameMechanics.NPCStructure.NPCSuper;
import net.jitse.npclib.api.events.NPCInteractEvent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.inventory.Inventory;
import xyz.fallenmc.shops.inventories.scout.ScoutShopInventory;
import xyz.fallenmc.shops.npcs.ClassShopNPC;

public class ScoutShop extends ClassShopNPC {
    public ScoutShop(){
        super(ChatColor.AQUA + "Scout Shop", "scout", 2070552210, "Another lightfooted friend! Why not grab a few things before your enemies catch up to you? Quickly, now!", "I'm sure you're in a rush, but Scout level 2 isn't a hard one to pass! Snap to it if you want to take a grab at my items!", "Dash back here after selecting the Scout class!", Sound.VILLAGER_HAGGLE, ChatColor.GRAY + "Click me to purchase exclusive Scout items");
    }

    public Inventory getStartInventory(NPCInteractEvent npcInteractEvent){
        return new ScoutShopInventory(npcInteractEvent.getWhoClicked()).getInventory();
    }
}
