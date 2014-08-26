package de.Albritter.AdminBlockMod.configuration;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import de.Albritter.AdminBlockMod.help.reference.Reference;
import net.minecraftforge.common.config.Configuration;

;

public class ConfigurationHandler
{
	public static Configuration configuration;
	public static boolean setUnbreakable = true;
	public static boolean enableCrafting = false;

	private static void loadConfiguration()
	{
		enableCrafting = configuration.getBoolean("enableCrafting", Configuration.CATEGORY_GENERAL, false, "");
		setUnbreakable = configuration.getBoolean("setUnbreakable",	Configuration.CATEGORY_GENERAL, true, "");
		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}

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
	public void onConfigurationChangedEvent(
			ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfiguration();
		}
	}

}
