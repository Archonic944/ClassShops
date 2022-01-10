package xyz.fallenmc.shops.inventories.scout;

import itempackage.Items;
import me.zach.DesertMC.Utils.ench.CustomEnch;
import org.bukkit.inventory.ItemStack;
import xyz.fallenmc.shops.items.ClassShopItem;

import java.util.Arrays;

public class ScoutShopItems {
    Iterable<ClassShopItem> items = Arrays.asList(new ClassShopItem(400, 2, "scout") {
        protected ItemStack get(){
            return Items.getEnergySnack();
        }
    }, new ClassShopItem(2000, 3, "scout") {
        protected ItemStack get(){
            return Items.getScoutGoggles();
        }
    }, new ClassShopItem(2000, 4, "scout") {
        protected ItemStack get(){
            return CustomEnch.ANTI_FOCUS.getBook(1);
        }
    }, new ClassShopItem(3000, 4, "scout") {
        protected ItemStack get(){
            return CustomEnch.ANTI_FOCUS.getBook(2);
        }
    }, new ClassShopItem(4000, 4, "scout") {
        protected ItemStack get(){
            return Items.getDagger();
        }
    }, new ClassShopItem(5000, 6, "scout") {
        protected ItemStack get(){
            return Items.getScoutBlade();
        }
    }, new ClassShopItem(5000, 6, "scout") {
        protected ItemStack get(){
            return CustomEnch.ANTI_FOCUS.getBook(3);
        }
    }, new ClassShopItem(4000, 7, "scout") {
        protected ItemStack get(){
            return CustomEnch.SPIRIT_GUARD.getBook(1);
        }
    }, new ClassShopItem(5000, 7, "scout") {
        protected ItemStack get(){
            return CustomEnch.SPIRIT_GUARD.getBook(2);
        }
    }, new ClassShopItem(7000, 8, "scout") {
        protected ItemStack get(){
            return CustomEnch.SPIRIT_GUARD.getBook(3);
        }
    });
}
