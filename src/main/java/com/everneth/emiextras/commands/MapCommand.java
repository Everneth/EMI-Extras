package com.everneth.emiextras.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandAlias("map")
public class MapCommand extends BaseCommand {
    public void onMap(CommandSender sender)
    {
        Player player = (Player) sender;
        player.sendMessage("http://everneth.com/map/maps/");
    }
}
