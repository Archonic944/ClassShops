package xyz.fallenmc.shops.inventories.corrupter;

import itempackage.Items;
import me.zach.DesertMC.Utils.ench.CustomEnch;
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
        }, new ClassShopItem(1000, 4, "corrupter") {
            protected ItemStack get(){
                return CustomEnch.EXTRAVERT.getBook(1);
            }
        }, new ClassShopItem(1500, 4, "corrupter") {
            protected ItemStack get(){
                return CustomEnch.EXTRAVERT.getBook(2);
            }
        }, new ClassShopItem(5000, 5, "corrupter") {
            protected ItemStack get(){
                return Items.getCorrupterLeggings();
            }
        }, new ClassShopItem(6500, 6, "corrupter") {
            protected ItemStack get(){
                return Items.getCorruptedSword();
            }
        }, new ClassShopItem(2500, 6, "corrupter") {
            protected ItemStack get(){
                return CustomEnch.NO_MERCY.getBook(1);
            }
        }, new ClassShopItem(4000, 6, "corrupter") {
            protected ItemStack get(){
                return CustomEnch.NO_MERCY.getBook(2);
            }
        }, new ClassShopItem(3000, 6, "corrupter") {
            protected ItemStack get(){
                return CustomEnch.EXTRAVERT.getBook(3);
            }
        }, new ClassShopItem(5000, 8, "corrupter") {
            protected ItemStack get(){
                return CustomEnch.NO_MERCY.getBook(3);
            }
        });
    }
}
