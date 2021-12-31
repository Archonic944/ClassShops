package xyz.fallenmc.shops.inventories.wizard;

import itempackage.Items;
import org.bukkit.inventory.ItemStack;
import xyz.fallenmc.shops.items.ClassShopItem;

import java.util.Arrays;

public class WizardShopItems {
    public final Iterable<ClassShopItem> items = Arrays.asList(new ClassShopItem(400, 2, "wizard") {
        protected ItemStack get(){
            return Items.getMagicSnack();
        }
    }, new ClassShopItem(3000, 3, "wizard"){
        protected ItemStack get(){
            return Items.getMagicWand();
        }
    }, new ClassShopItem(5400, 6, "wizard"){
        protected ItemStack get(){
            return Items.getLuckyChestplate();
        }
    }, new ClassShopItem(7000, 6, "wizard"){
        protected ItemStack get(){
            return Items.getWizardBlade();
        }
    });
}
