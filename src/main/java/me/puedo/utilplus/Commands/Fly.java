package me.puedo.utilplus.Commands;

import me.puedo.utilplus.CommandModule;
import me.puedo.utilplus.Main;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly extends CommandModule
{
    public Fly()
    {
        //It defines the label, min args, and max args.
        super("fly", 0, 0);
    }

    public Main m;

    //The method that "runs" the command.
    public void run(CommandSender sender, String[] args)
    {
        Player p = (Player) sender;

        if(!p.hasPermission("fly")) p.sendMessage(m.getConfig().getString("errors.NoPermission"));

        p.setFlying(p.getAllowFlight());
        sender.sendMessage("Fly: " + p.isFlying());
    }

}