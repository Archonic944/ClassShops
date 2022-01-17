package xyz.fallenmc.shops.inventories.tank;

import itempackage.Items;
import me.zach.DesertMC.Utils.ench.CustomEnch;
import org.bukkit.inventory.ItemStack;
import xyz.fallenmc.shops.items.ClassShopItem;

import java.util.Arrays;

public class TankShopItems {
    Iterable<ClassShopItem> items = Arrays.asList(new ClassShopItem(350, 2, "tank") {
        protected ItemStack get(){
            return Items.getProteinSnack();
        }
    }, new ClassShopItem(2700, 3, "tank") {
        protected ItemStack get(){
            return Items.getBludgeon();
        }
    }, new ClassShopItem(2000, 4, "tank") {
        protected ItemStack get(){
            return CustomEnch.TURTLE.getBook(1);
        }
    }, new ClassShopItem(3000, 4, "tank") {
        protected ItemStack get(){
            return CustomEnch.TURTLE.getBook(2);
        }
    }, new ClassShopItem(4000, 5, "tank") {
        protected ItemStack get(){
            return Items.getStubbornBoots();
        }
    }, new ClassShopItem(4000, 6, "tank") {
        protected ItemStack get(){
            return CustomEnch.TURTLE.getBook(3);
        }
    }, new ClassShopItem(4000, 7, "tank") {
        protected ItemStack get(){
            return CustomEnch.CRUEL_BLOW.getBook(1);
        }
    }, new ClassShopItem(5000, 7, "tank") {
        protected ItemStack get(){
            return CustomEnch.CRUEL_BLOW.getBook(2);
        }
    }, new ClassShopItem(4000, 7, "tank") {
        protected ItemStack get(){
            return Items.getStomper();
        }
    }, new ClassShopItem(7000, 8, "tank") {
        protected ItemStack get(){
            return CustomEnch.CRUEL_BLOW.getBook(3);
        }
    });
}