package com.everneth.emiextras;

import co.aikar.commands.BukkitCommandManager;
import com.everneth.emiextras.commands.MapCommand;
import com.everneth.emiextras.commands.PieCommand;
import com.everneth.emiextras.commands.ShrugCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class EMIExtras extends JavaPlugin {

    private static EMIExtras plugin;
    private static BukkitCommandManager commandManager;

    @Override
    public void onEnable() {
        plugin = this;
        registerCommands();
    }
    @Override
    public void onDisable() {

    }
    public void registerCommands()
    {
        commandManager = new BukkitCommandManager(this);
        commandManager.registerCommand(new ShrugCommand());
        commandManager.registerCommand(new PieCommand());
        commandManager.registerCommand(new MapCommand());
    }
}
