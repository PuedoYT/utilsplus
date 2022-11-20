package me.puedo.utilplus.Commands;

import me.puedo.utilplus.CommandModule;
import me.puedo.utilplus.Main;
import me.puedo.utilplus.Util.MessageType;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode extends CommandModule
{

    public Gamemode()
    {
        //It defines the label, min args, and max args.
        super("gamemode", "heal", 0, 1);
    }

    public Main m;

    //The method that "runs" the command.
    public void run(CommandSender sender, String[] args)
    {
        Player p = (Player) sender;
        String gamemode = args[0];
        int gamemode_int = Integer.parseInt(gamemode);

        if(Integer.valueOf(gamemode_int) != null)
        {

        } //
        else
            {

            }

        }

}
