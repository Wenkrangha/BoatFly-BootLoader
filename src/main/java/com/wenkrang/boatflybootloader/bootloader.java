package com.wenkrang.boatflybootloader;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class bootloader implements CommandExecutor {
    /**
     * 向传入的CommandSender对象发送帮助信息
     *
     * @param sender CommandSender对象，用于发送消息
     */
    public static void gethelp(CommandSender sender) {
        sender.sendMessage("§7[!]  §4飞船加载器 - BoatFly §7正在运行");
        sender.sendMessage(" §4| §7help  帮助列表");
        sender.sendMessage(" §4| §7upgrade  全自动更新插件");
        sender.sendMessage(" §4| §7作者:Wenkrang");
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 0) {
            gethelp(commandSender);
        } else {
            if (true) { //Debug

                if (strings[0].equalsIgnoreCase("help")) {
                    gethelp(commandSender);
                }
                if (strings[0].equalsIgnoreCase("upgrade")) {
                    try {
                        UpgradeCentre.update();
                    } catch (IOException e) {
                        e.printStackTrace();
                        throw new RuntimeException(e);
                    } catch (Exception e) {
                        e.printStackTrace();
                        throw new RuntimeException(e);
                    }
                }
            }


        }

        return true;
    }
}
