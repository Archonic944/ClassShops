package xyz.fallenmc.shops.inventories.scout;

import me.zach.databank.saver.Key;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import xyz.fallenmc.shops.inventories.ClassShopInventory;

public class ScoutShopInventory extends ClassShopInventory {
    public ScoutShopInventory(Player player){
        super(Key.SCOUT, new ScoutShopItems().items, player, Material.LEATHER_BOOTS, DyeColor.LIGHT_BLUE.getData());
    }
}
