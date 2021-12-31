package xyz.fallenmc.shops.inventories.wizard;

import me.zach.databank.saver.Key;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import xyz.fallenmc.shops.inventories.ClassShopInventory;

public class WizardShopInventory extends ClassShopInventory {
    public WizardShopInventory(Player player){
        super(Key.WIZARD, new WizardShopItems().items, player, Material.ENCHANTMENT_TABLE, DyeColor.BLUE.getData());
    }
}
