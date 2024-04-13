package com.wenkrang.boatflybootloader;

import com.wenkrang.boatfly.Loader.LoadCommand;
import com.wenkrang.boatfly.Loader.LoadEvent;
import com.wenkrang.boatfly.Loader.LoadRecipe;
import com.wenkrang.boatfly.event.GUI.book.PlayerInteract;
import com.wenkrang.boatfly.item.Materials;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;

import static org.bukkit.Bukkit.getServer;

public class init {
    //初始化插件
    public static void init() throws IOException {
        //复制插件至版本文件夹
        new File("./plugins/BoatFly/version").mkdirs();
        if (true) {
            ClassLoader classLoader = BoatFly_BootLoader.class.getClassLoader();
            URL resource = classLoader.getResource("BoatFly-" + MainData.PluginName + ".jar");
            InputStream inputStream = resource.openStream();
            Files.copy(inputStream, new File("./plugins/BoatFly/version/BoatFly-" + MainData.PluginName + ".jar").toPath());
            inputStream.close();
        }
        //储存加载器应加载的插件的版本号
        if (true) {
            File file = new File("./plugins/BoatFly/SetupNumber");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(String.valueOf(MainData.Number));
            bufferedWriter.close();
            fileWriter.close();
        }
        //储存加载器应加载的插件的名字
        if (true) {
            File file = new File("./plugins/BoatFly/SetupName");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("BoatFly-" + MainData.PluginName + ".jar");
            bufferedWriter.close();
            fileWriter.close();
        }
        //储存加载器的路径
        if (true) {
            File file = new File("./plugins/BoatFly/Bootloader");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(MainData.PluginFile.toPath().toString());
            bufferedWriter.close();
            fileWriter.close();
        }
    }

    public static void upgrade() throws IOException {
        //和init差不多
        new File("./plugins/BoatFly/SetupNumber").delete();
        new File("./plugins/BoatFly/SetupName").delete();
        new File("./plugins/BoatFly/Bootloader").delete();

        if (true) {
            ClassLoader classLoader = BoatFly_BootLoader.class.getClassLoader();
            URL resource = classLoader.getResource("BoatFly-" + MainData.PluginName + ".jar");
            InputStream inputStream = resource.openStream();
            Files.copy(inputStream, new File("./plugins/BoatFly/version/BoatFly-" + MainData.PluginName + ".jar").toPath());
            inputStream.close();
        }

        if (true) {
            File file = new File("./plugins/BoatFly/SetupNumber");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(MainData.Number);
            bufferedWriter.close();
            fileWriter.close();
        }

        if (true) {
            File file = new File("./plugins/BoatFly/SetupName");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("BoatFly-" + MainData.PluginName + ".jar");
            bufferedWriter.close();
            fileWriter.close();
        }

        if (true) {
            File file = new File("./plugins/BoatFly/Bootloader");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(MainData.PluginFile.toPath().toString());
            bufferedWriter.close();
            fileWriter.close();
        }
    }
}
