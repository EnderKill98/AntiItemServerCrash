package me.enderkill98.antiitemservercrash;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;

public class AntiItemServerCrashPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onInvClick(InventoryClickEvent event) {
        if(event.getAction() == InventoryAction.UNKNOWN && event.getHotbarButton() < 0) {
            event.setCancelled(true);
            System.out.println(event.getWhoClicked().getName() + " is very naughty!");
        }
    }
}
