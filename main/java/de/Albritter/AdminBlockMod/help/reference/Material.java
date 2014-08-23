package de.Albritter.AdminBlockMod.help.reference;

import net.minecraft.item.Item;

import net.minecraftforge.common.util.EnumHelper;

public class Material {
	public static final class Tools {
		public static final Item.ToolMaterial ADMIUM = EnumHelper
				.addToolMaterial("admium", 4, 0, 16f, -1f, 22);
		// ("Name",harvestLevel,maxUses,efficiencyOnProperMaterial,damageVsEntity,enchantability)
	}

	// public static final class Armor
	// {
	// public static final ItemArmor.ArmorMaterial DARK_MATTER =
	// EnumHelper.addArmorMaterial(Names.Materials.DARK_MATTER, 0, new int[]{3,
	// 8, 6, 3}, 0);
	// }
}