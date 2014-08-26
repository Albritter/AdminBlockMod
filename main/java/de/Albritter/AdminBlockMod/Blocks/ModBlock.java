package de.Albritter.AdminBlockMod.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlock
{

	public static Block adminGlass;

	public static void loadBlocks()
	{
		adminGlass = new AdminGlass();

		GameRegistry.registerBlock(adminGlass,"adminGlass");
	}
}
