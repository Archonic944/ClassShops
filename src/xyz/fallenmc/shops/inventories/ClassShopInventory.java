package xyz.fallenmc.shops.inventories;

import me.zach.DesertMC.Utils.Config.ConfigUtils;
import me.zach.DesertMC.Utils.MiscUtils;
import me.zach.DesertMC.Utils.StringUtils.StringUtil;
import me.zach.DesertMC.shops.ShopInventory;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import xyz.fallenmc.shops.items.ClassShopItem;

public class ClassShopInventory extends ShopInventory {
    final String className;
    public ClassShopInventory(String className, Iterable<ClassShopItem> items, Player player, Material bottomLeftMaterial, byte glassColor){
        this(className, items, player, MiscUtils.generateItem(bottomLeftMaterial,
                StringUtil.stylizeClass(className) + " Shop",
                StringUtil.wrapLore(ChatColor.GRAY + "This is the class shop for the " + StringUtil.capitalizeFirst(className) + " class. Some items may be locked until you reach a higher level!\nCurrent level: " + ConfigUtils.getLevel(className, player)),
                (byte) -1,
                1), glassColor);
    }

    public ClassShopInventory(String className, Iterable<ClassShopItem> items, Player player, ItemStack bottomLeft, byte glassColor){
        super(StringUtil.capitalizeFirst(className) + " Shop", items, player, glassColor, bottomLeft);
        this.className = className;
    }
}