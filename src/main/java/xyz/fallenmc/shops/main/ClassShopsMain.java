package xyz.fallenmc.shops.main;

import me.zach.DesertMC.CommandsPackage.NPCCommand;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.fallenmc.shops.npcs.clazz.CorrupterShop;
import xyz.fallenmc.shops.npcs.clazz.ScoutShop;
import xyz.fallenmc.shops.npcs.clazz.TankShop;
import xyz.fallenmc.shops.npcs.clazz.WizardShop;

public class ClassShopsMain extends JavaPlugin {
    @Override
    public void onEnable(){
        NPCCommand.registerNPC("ScoutShop", ScoutShop::new);
        NPCCommand.registerNPC("CorrupterShop", CorrupterShop::new);
        NPCCommand.registerNPC("WizardShop", WizardShop::new);
        NPCCommand.registerNPC("TankShop", TankShop::new);
    }
}
