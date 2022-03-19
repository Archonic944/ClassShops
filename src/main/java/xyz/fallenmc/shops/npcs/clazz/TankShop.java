package xyz.fallenmc.shops.npcs.clazz;

import me.zach.DesertMC.CommandsPackage.NPCCommand;
import net.jitse.npclib.api.events.NPCInteractEvent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import xyz.fallenmc.shops.inventories.tank.TankShopInventory;
import xyz.fallenmc.shops.npcs.ClassShopNPC;

public class TankShop extends ClassShopNPC {

    public TankShop(){
        super( ChatColor.DARK_GREEN + "Tank Shop", "tank", 1585898172,"Make sure to hold your ground out there, young warrior. My items are designed for only the toughest and most steadfast of warriors.", "Wait a minute, you aren't only the toughest and most steadfast of warriors! Finish tank level 2 and then come back to me!", "A good tank always comes prepared. Select your Tank class, and make sure you've passed level 2 before visiting me again!", Sound.DONKEY_IDLE, ChatColor.GRAY + "Click me to purchase exclusive Tank items");
    }

    public Inventory getStartInventory(NPCInteractEvent npcInteractEvent){
        return new TankShopInventory(npcInteractEvent.getWhoClicked()).getInventory();
    }
}
