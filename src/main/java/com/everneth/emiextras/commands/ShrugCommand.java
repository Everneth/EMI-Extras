package com.everneth.emiextras.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShrugCommand extends BaseCommand {
    @CommandAlias("shrug")
    public void onShrug(CommandSender sender, String msg)
    {
        Player player = (Player) sender;
        player.chat(msg + " ¯\\\\_(ツ)_/¯");
    }
}
