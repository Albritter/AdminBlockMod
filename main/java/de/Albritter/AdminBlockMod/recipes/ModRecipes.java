package de.Albritter.AdminBlockMod.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import de.Albritter.AdminBlockMod.Items.ModItem;

public class ModRecipes {
	public static void loadRecipes() {
		GameRegistry.addRecipe(new ItemStack(ModItem.adminSword), " n ", " n ",
				" s ", 'n', new ItemStack(Items.nether_star), 's',
				new ItemStack(Items.stick));
		// GameRegistry.addShapelessRecipe(output, new
		// ItemStack(Items.nether_star),.....);
	}
}
