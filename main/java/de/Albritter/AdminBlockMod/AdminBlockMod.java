package de.Albritter.AdminBlockMod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.Albritter.AdminBlockMod.Blocks.ModBlock;
import de.Albritter.AdminBlockMod.Items.ModItem;
import de.Albritter.AdminBlockMod.configuration.ConfigurationHandler;
import de.Albritter.AdminBlockMod.help.reference.Reference;
import de.Albritter.AdminBlockMod.help.utility.LogHelper;
import de.Albritter.AdminBlockMod.proxy.IProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class AdminBlockMod
{
	@Instance(value = Reference.MOD_ID)
	public static AdminBlockMod instance;

	@SidedProxy(clientSide = Reference.SIDED_PROXY_CLIENT_SIDE, serverSide = Reference.SIDED_PROXY_SERVER_SIDE)
	public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent)
	{
		LogHelper.info("preInit");
		ConfigurationHandler.init(preInitEvent.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		ModBlock.loadBlocks();
		ModItem.loadItems();
	}

	@EventHandler
	private void init(FMLInitializationEvent initEvent)
	{
		//LogHelper.info("Init");
		//ModRecipes.loadRecipes();
	    
	}
}
