package com.wenkrang.boatflybootloader;

import org.bukkit.Bukkit;
import org.bukkit.plugin.InvalidDescriptionException;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public final class BoatFly_BootLoader extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        MainData.plugin = getPlugin(BoatFly_BootLoader.class);
        MainData.PluginFile = getFile();
        if (true) {
            if (!getFile().toPath().toString().contains("version")) {
                try {
                    if (!new File("./plugins/BoatFly/SetupName").exists()) {
                        init.init();
                        File file = new File("./plugins/BoatFly/SetupName");
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        String s = br.readLine();
                        ConsoleLoger.info("./plugins/BoatFly/version/" + s);
                        Plugin plugin = Bukkit.getServer().getPluginManager().loadPlugin(new File("./plugins/BoatFly/version/" + s));
                        ConsoleLoger.info(plugin.toString());
                        Bukkit.getServer().getPluginManager().enablePlugin(plugin);

                    }else {
                        if (true) {
                            File file = new File("./plugins/BoatFly/SetupNumber");
                            FileReader fr = new FileReader(file);
                            BufferedReader br = new BufferedReader(fr);
                            String s = br.readLine();
                            int i = 0;
                            try {
                                i = Integer.parseInt(s);

                            }catch (Exception ex) {
                                file.delete();
                                init.upgrade();
                                ConsoleLoger.error("./plugins/BoatFly/version/" + MainData.PluginName);
                            }
                            if (MainData.Number > i) {
                                init.upgrade();
                            }
                        }
                        File file = new File("./plugins/BoatFly/SetupName");
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        String s = br.readLine();

                        Plugin plugin = Bukkit.getServer().getPluginManager().loadPlugin(new File("./plugins/BoatFly/version/" + s));

                        ConsoleLoger.info(plugin.toString());
                        Bukkit.getServer().getPluginManager().enablePlugin(plugin);

                    }

                } catch (IOException | InvalidPluginException | InvalidDescriptionException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
