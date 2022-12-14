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
        super("fly", "fly", 0, 0);
    }

    public Main m;

    //The method that "runs" the command.
    public void run(CommandSender sender, String[] args)
    {
        Player p = (Player) sender;

        p.setAllowFlight(!p.getAllowFlight());
        p.setFlying(p.getAllowFlight());
        sender.sendMessage("Fly: " + p.isFlying());
    }

}