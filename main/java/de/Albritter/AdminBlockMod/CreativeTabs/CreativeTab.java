package de.Albritter.AdminBlockMod.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import de.Albritter.AdminBlockMod.Items.ModItem;
import de.Albritter.AdminBlockMod.help.reference.Reference;

public class CreativeTab
{
		public static final CreativeTabs myTab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem(){return ModItem.adminSword;}};

	
}
