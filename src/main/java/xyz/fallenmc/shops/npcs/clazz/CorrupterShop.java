package xyz.fallenmc.shops.npcs.clazz;

import net.jitse.npclib.api.events.NPCInteractEvent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.inventory.Inventory;
import xyz.fallenmc.shops.inventories.corrupter.CorrupterShopInventory;
import xyz.fallenmc.shops.npcs.ClassShopNPC;

public class CorrupterShop extends ClassShopNPC {
    public CorrupterShop(){
        super(ChatColor.RED + "Corrupter Shop", "corrupter", 400417, "Ahaa, a fellow Corrupter!! Take a look at some of my exclusive wares if you need help wreaking some havoc on the battlefield! But mostly for making fire! And more fire! And big numbers that I don't quite understand, but like to see anyways for some reason!! GAGHAHHAHAHA!", "They said that you gotta get \"Corrupter Level 2\" before you can buy my items, whatever that means. But if you ask me, this whole \"leveling\" junk's a whole load 'a crap, anyways. Just get out there and cause some chaos already, you know what I mean! GAAHAHAHAHA!", "GRRRAAHK! How do you expect to wreak havoc if you aren't even a corrupter! It makes my blood BOIL! Then again... pretty much everything does. My doctor tells me I need to calm down or I'll pop a BLOOD VESSEL! Can you BELIEVE that??! GAAAAH!", Sound.ENDERMAN_SCREAM, ChatColor.GRAY + "Destruction! Gahh!");
    }

    public Inventory getStartInventory(NPCInteractEvent npcInteractEvent){
        return new CorrupterShopInventory(npcInteractEvent.getWhoClicked()).getInventory();
    }
}
