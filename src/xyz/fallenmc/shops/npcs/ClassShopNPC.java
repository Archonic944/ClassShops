package xyz.fallenmc.shops.npcs;

import me.zach.DesertMC.GameMechanics.NPCStructure.NPCSuper;
import me.zach.DesertMC.Utils.Config.ConfigUtils;
import me.zach.databank.saver.PlayerData;
import net.jitse.npclib.api.events.NPCInteractEvent;
import org.bukkit.Sound;

public abstract class ClassShopNPC extends NPCSuper {
    String levelLow;
    String unselected;
    String clazz;
    public ClassShopNPC(String npcName, String clazz, int skinID, String clickMessage, String levelLow, String unselected, Sound clickSound, String... npcTextExcludingName){
        super(npcName, skinID, clickMessage, clickSound, npcTextExcludingName);
        this.levelLow = levelLow;
        this.unselected = unselected;
        this.clazz = clazz;
    }

    public ClickResponse guiNpcClickResponse(NPCInteractEvent event){
        PlayerData data = ConfigUtils.getData(event.getWhoClicked());
        if(data.getClassLevel(clazz) <= 2){
            return new ClickResponse(levelLow, false);
        }else if(!data.getCurrentClass().equals(clazz)) return new ClickResponse(unselected, false);
        else return super.guiNpcClickResponse(event);
    }
}
