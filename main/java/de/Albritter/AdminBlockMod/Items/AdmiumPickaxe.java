package de.Albritter.AdminBlockMod.Items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import de.Albritter.AdminBlockMod.CreativeTabs.CreativeTab;
import de.Albritter.AdminBlockMod.help.reference.Material;
import de.Albritter.AdminBlockMod.help.utility.LogHelper;

public class AdmiumPickaxe extends ItemTool {

	public AdmiumPickaxe() {
		super(0, Material.Tools.ADMIUM, null);
		this.setUnlocalizedName("adminPickaxe");
		this.setCreativeTab(CreativeTab.myTab);
	}

	@Override
	public boolean canHarvestBlock(Block par1Block, ItemStack itemStack) {
		return true;
	}

	@Override
	public boolean doesSneakBypassUse(World world, int x, int y, int z,
			EntityPlayer player) {
		return true;
	}

	@Override
	public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_) {
		// TODO Auto-generated method stub
		if (p_150893_2_.getUnlocalizedName().equalsIgnoreCase("admingals")) {

			((de.Albritter.AdminBlockMod.Blocks.AdminGlassNormal) p_150893_2_)
					.destroyBlock();
		}
		LogHelper.fatal(p_150893_2_);
		return Float.MAX_VALUE;
	}

}
