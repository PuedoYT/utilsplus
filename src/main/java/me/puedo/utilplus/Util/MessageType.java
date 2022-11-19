package me.puedo.utilplus.Util;

import me.puedo.utilplus.Main;


public enum MessageType {

    /* Messages type, they  all got their prefix
    Prefixes non-customisable via config, they are hard-coded here*/

    MESSAGE(null),
    ERROR("§7(§cError§7)§r ");

    String prefix; // Prefix ^^

    MessageType(String a) { // Setting up some stuff
        this.prefix = a;
    }

    public String getPrefix() { // Get prefix method
        return prefix;
    }
}
