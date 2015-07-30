package tv.savageboy74.projectarcane.handler;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {
    public static Configuration configuration;
    public static boolean checkForUpdates = true;

    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        checkForUpdates = configuration.getBoolean("Check For Updates", Configuration.CATEGORY_GENERAL, true, "Allow Project: Arcane to check for updates");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}