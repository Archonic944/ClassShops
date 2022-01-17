package xyz.fallenmc.shops.inventories.corrupter;

import me.zach.databank.saver.Key;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import xyz.fallenmc.shops.inventories.ClassShopInventory;

public class CorrupterShopInventory extends ClassShopInventory {
    public CorrupterShopInventory(Player player){
        super(Key.CORRUPTER, new CorrupterShopItems().items, player, Material.LAVA_BUCKET, DyeColor.ORANGE.getData());
    }
}
