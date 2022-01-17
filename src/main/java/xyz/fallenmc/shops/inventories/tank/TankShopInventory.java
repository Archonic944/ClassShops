package xyz.fallenmc.shops.inventories.tank;

import me.zach.databank.saver.Key;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import xyz.fallenmc.shops.inventories.ClassShopInventory;

public class TankShopInventory extends ClassShopInventory {
    public TankShopInventory(Player player){
        super(Key.TANK, new TankShopItems().items, player, Material.OBSIDIAN, DyeColor.GREEN.getData());
    }
}
