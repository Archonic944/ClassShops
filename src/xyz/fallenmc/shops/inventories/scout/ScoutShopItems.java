package xyz.fallenmc.shops.inventories.scout;

import itempackage.Items;
import org.bukkit.inventory.ItemStack;
import xyz.fallenmc.shops.items.ClassShopItem;

import java.util.Arrays;

public class ScoutShopItems {
    Iterable<ClassShopItem> items = Arrays.asList(new ClassShopItem(400, 2, "scout") {
        protected ItemStack get(){
            return Items.getEnergySnack();
        }
    }, new ClassShopItem(2000, 3, "scout"){
        protected ItemStack get(){
            return Items.getScoutGoggles();
        }
    }, new ClassShopItem(4000, 4, "scout") {
        protected ItemStack get(){
            return Items.getDagger();
        }
    }, new ClassShopItem(5000, 6, "scout"){
        protected ItemStack get(){
            return Items.getScoutBlade();
        }
    });
}
