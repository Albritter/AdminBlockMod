package de.Albritter.AdminBlockMod.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItem {
	public static Item adminSword = new AdmiumSword();
	public static Item adminPickaxe = new AdmiumSchacke();

	public static void loadItems() {
		GameRegistry.registerItem(adminSword, "adminSword");
		GameRegistry.registerItem(adminPickaxe, "adminPickaxe");

	}
}
