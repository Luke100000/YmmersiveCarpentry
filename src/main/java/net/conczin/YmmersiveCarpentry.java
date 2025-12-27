package net.conczin;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;


public class YmmersiveCarpentry extends JavaPlugin {
    private static YmmersiveCarpentry instance;

    public YmmersiveCarpentry(@Nonnull JavaPluginInit init) {
        super(init);
        instance = this;
    }

    @Override
    protected void setup() {

    }

    public static YmmersiveCarpentry getInstance() {
        return instance;
    }
}