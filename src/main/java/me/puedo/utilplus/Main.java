package me.puedo.utilplus;

import me.puedo.utilplus.Commands.Fly;
import me.puedo.utilplus.Commands.Heal;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

import static org.bukkit.Bukkit.getPluginManager;

public final class Main extends JavaPlugin {

    /*
    Main class
    Every listeners & commands are registered here
    */

    public static Main instance;

    //Create a new hashmap that will store all the commands.
    public static HashMap<String, CommandModule> commands;

    public void onEnable()
    {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        instance = this;
        commands = new HashMap<String, CommandModule>();

        //A method that calls all the constructors.
        registerCommands();
    }

    //To prevent memory leaks.
    public void onDisable()
    {
        instance = null;
        commands.clear();
    }

    //The method that calls all the constructors.
    public void registerCommands()
    {
        new Fly();
        new Heal();
        //Feel free to add more :)
    }
    
}
