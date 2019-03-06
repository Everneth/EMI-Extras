package com.everneth.emiextras.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PieCommand extends BaseCommand {
    @CommandAlias("pie")
    public void onPie(CommandSender sender, String name)
    {
        Player player = (Player) sender;
        player.chat("WELCOME TO ETHERNET " + name.toUpperCase() + "!!!");
    }
}
