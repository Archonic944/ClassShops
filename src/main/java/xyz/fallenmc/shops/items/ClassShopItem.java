package xyz.fallenmc.shops.items;

import me.zach.DesertMC.Utils.StringUtils.StringUtil;
import me.zach.DesertMC.shops.ShopItem;
import me.zach.databank.saver.PlayerData;

public abstract class ClassShopItem extends ShopItem {
    public final int requiredLevel;
    public final String clazz;
    public ClassShopItem(int price, int requiredLevel, String clazz){
        super(price);
        this.requiredLevel = requiredLevel;
        this.clazz = clazz;
    }

    public PurchaseResponse checkPurchase(PlayerData data, int amount){
        PurchaseResponse response = super.checkPurchase(data, amount);
        int currentLevel = data.getClassLevel(clazz);
        if(currentLevel <= requiredLevel) response = new PurchaseResponse("Requires completing " + StringUtil.capitalizeFirst(clazz) + " level " + requiredLevel + "!", false);
        return response;
    }
}
