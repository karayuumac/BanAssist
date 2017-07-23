package com.github.karayuumac.BanAssist;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * Created by karayuu on 2017/07/23.
 */
public class BanAssist extends JavaPlugin{

    public static BanAssist plugin;

    /**
     * 起動時に呼び出される。
     * 初期化作業をここで行う。
     */
    @Override
    public void onEnable() {
        plugin = this;
        
        Bukkit.getServer().getLogger().info(ChatColor.BLUE + "BanAssist起動完了。");
    }

    /**
     * 終了時に呼び出される。
     * 保存作業をここで行う。
     */
    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info(ChatColor.RED + "BanAssist終了完了。");
    }
}
