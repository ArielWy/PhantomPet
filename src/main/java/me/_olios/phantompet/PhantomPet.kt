package me._olios.phantompet

import org.bukkit.plugin.java.JavaPlugin

class PhantomPet : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("PhantomPet")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}