package com.everneth.emiextras.commands;

import co.aikar.commands.BaseCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShrugCommand extends BaseCommand {
    public void onShrug(CommandSender sender, String msg)
    {
        Player player = (Player) sender;
        player.chat(msg + " ¯\\\\_(ツ)_/¯");
    }
}
