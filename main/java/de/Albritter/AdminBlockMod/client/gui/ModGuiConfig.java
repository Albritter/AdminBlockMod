package de.Albritter.AdminBlockMod.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;
import de.Albritter.AdminBlockMod.configuration.ConfigurationHandler;
import de.Albritter.AdminBlockMod.help.reference.Reference;

public class ModGuiConfig extends GuiConfig {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModGuiConfig(GuiScreen guiScreen) {
		super(guiScreen, new ConfigElement(
				ConfigurationHandler.configuration
						.getCategory(Configuration.CATEGORY_GENERAL))
				.getChildElements(), Reference.MOD_ID, false, false, GuiConfig
				.getAbridgedConfigPath(ConfigurationHandler.configuration
						.toString()));
	}
}
