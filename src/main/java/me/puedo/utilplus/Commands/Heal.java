package me.puedo.utilplus.Commands;

import me.puedo.utilplus.CommandModule;
import me.puedo.utilplus.Main;
import me.puedo.utilplus.Util.MessageType;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal extends CommandModule
{

    public Heal()
    {
        //It defines the label, min args, and max args.
        super("heal", "heal", 1, 1);
    }

    public Main m;

    //The method that "runs" the command.
    public void run(CommandSender sender, String[] args)
    {
        Player p = (Player) sender;
        String health_arg = args[0];

        try {

            double health_to_set = Double.parseDouble(health_arg);
            p.setHealth(health_to_set);

            sendMessage(MessageType.MESSAGE, sender, "§aYou healed yourself for: " + health_to_set); //Send msg to player
        } catch (NumberFormatException e) {
            sendMessage(MessageType.ERROR, sender, "§cYou cannt put a string as an integer."); //Sends err to player
        }
    }

}