package xyz.fallenmc.shops.inventories.corrupter;

import itempackage.Items;
import org.bukkit.inventory.ItemStack;
import xyz.fallenmc.shops.items.ClassShopItem;

import java.util.Arrays;

class CorrupterShopItems {
    final Iterable<ClassShopItem> items;
    public CorrupterShopItems(){
        this.items = Arrays.asList(new ClassShopItem(400, 2, "corrupter") {
            protected ItemStack get(){
                return Items.getLavaCake();
            }
        }, new ClassShopItem(3000, 3, "corrupter") {
            protected ItemStack get(){
                return Items.getVolcanicSword();
            }
        }, new ClassShopItem(5000, 5, "corrupter") {
            protected ItemStack get(){
                return Items.getCorrupterLeggings();
            }
        }, new ClassShopItem(6500, 6, "corrupter") {
            protected ItemStack get(){
                return Items.getCorrupterLeggings();
            }
        }); //TODO enchantments
    }
}
