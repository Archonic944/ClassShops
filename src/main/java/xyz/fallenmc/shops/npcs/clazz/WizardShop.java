package xyz.fallenmc.shops.npcs.clazz;

import net.jitse.npclib.api.events.NPCInteractEvent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.inventory.Inventory;
import xyz.fallenmc.shops.inventories.wizard.WizardShopInventory;
import xyz.fallenmc.shops.npcs.ClassShopNPC;

public class WizardShop extends ClassShopNPC {
    public WizardShop(){
        super(ChatColor.BLUE + "Wizard Shop", "wizard",  22689115, "My fine compatriot, I'm sure our superiorly intellectual class will offer a nice change of pace from your usual doodads. ...Not that I'm racist or anything. Too smart for that, heh.", "...I'm afraid you might need to be a little more *experienced* before you come visit my shop. What? Just because I'm a wizard doesn't mean I can't still make puns.", "I'm sure you'd make a fine wizard, friend, but the first step to unlocking our boundless intellects is actually having the Wizard class selected!", Sound.VILLAGER_HAGGLE, ChatColor.GRAY + "Click me to purchase exclusive Wizard items.");
    }

    public Inventory getStartInventory(NPCInteractEvent npcInteractEvent){
        return new WizardShopInventory(npcInteractEvent.getWhoClicked()).getInventory();
    }
}