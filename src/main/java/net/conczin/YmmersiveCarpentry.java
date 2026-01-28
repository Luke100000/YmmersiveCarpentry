package net.conczin;

import com.hypixel.hytale.common.plugin.PluginIdentifier;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.plugin.PluginBase;
import com.hypixel.hytale.server.core.plugin.PluginManager;

import javax.annotation.Nonnull;
import java.awt.*;


public class YmmersiveCarpentry extends JavaPlugin {
    public YmmersiveCarpentry(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        PluginBase plugin = PluginManager.get().getPlugin(PluginIdentifier.fromString("Conczin:Resource Groups"));
        if (plugin == null) {
            getEventRegistry().registerGlobal(PlayerReadyEvent.class, this::onPlayerConnect);
        }
    }

    private void onPlayerConnect(PlayerReadyEvent event) {
        event.getPlayer().sendMessage(Message.translation("server.YmmersiveCarpentry.resourceGroupsMissing").color(Color.ORANGE));
    }
}