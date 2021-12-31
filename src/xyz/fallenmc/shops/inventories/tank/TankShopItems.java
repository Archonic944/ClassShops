package xyz.fallenmc.shops.inventories.tank;

import itempackage.Items;
import org.bukkit.inventory.ItemStack;
import xyz.fallenmc.shops.items.ClassShopItem;

import java.util.Arrays;

public class TankShopItems {
    Iterable<ClassShopItem> items = Arrays.asList(new ClassShopItem(350, 2, "tank") {
        protected ItemStack get(){
            return Items.getProteinSnack();
        }
    }, new ClassShopItem(2700, 3, "tank"){
        protected ItemStack get(){
            return Items.getBludgeon();
        }
    }, new ClassShopItem(4000, 5, "tank"){
        protected ItemStack get(){
            return Items.getStubbornBoots();
        }
    }, new ClassShopItem(6000, 6, "tank") {
        protected ItemStack get(){
            return Items.getStomper();
        }
    });
}