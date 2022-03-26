package xyz.fallenmc.shops.inventories.wizard;

import itempackage.Items;
import me.zach.DesertMC.Utils.ench.CustomEnch;
import org.bukkit.inventory.ItemStack;
import xyz.fallenmc.shops.items.ClassShopItem;

import java.util.Arrays;

public class WizardShopItems {
    public final Iterable<ClassShopItem> items = Arrays.asList(new ClassShopItem(400, 2, "wizard") {
        protected ItemStack get(){
            return Items.getMagicSnack();
        }
    }, new ClassShopItem(3000, 3, "wizard") {
        protected ItemStack get(){
            return Items.getMagicWand();
        }
    }, new ClassShopItem(1000, 4, "wizard") {
        protected ItemStack get(){
            return CustomEnch.ALERT.getBook(1);
        }
    }, new ClassShopItem(1500, 4, "wizard"){
        protected ItemStack get(){
            return CustomEnch.ALERT.getBook(2);
        }
    }, new ClassShopItem(5400, 6, "wizard") {
        protected ItemStack get(){
            return Items.getLuckyChestplate();
        }
    }, new ClassShopItem(7000, 6, "wizard") {
        protected ItemStack get(){
            return Items.getWizardBlade();
        }
    }, new ClassShopItem(3500, 7, "wizard"){
        protected ItemStack get(){
            return CustomEnch.ALERT.getBook(3);
        }
    }, new ClassShopItem(4000, 7, "wizard") {
        protected ItemStack get(){
            return CustomEnch.ETHEREAL.getBook(1);
        }
    }, new ClassShopItem(5000, 7, "wizard") {
        protected ItemStack get(){
            return CustomEnch.ETHEREAL.getBook(2);
        }
    }, new ClassShopItem(7000, 8, "wizard") {
        protected ItemStack get(){
            return CustomEnch.ETHEREAL.getBook(3);
        }
    });
}
