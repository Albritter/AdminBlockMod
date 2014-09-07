package de.Albritter.AdminBlockMod.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import de.Albritter.AdminBlockMod.CreativeTabs.CreativeTab;
import de.Albritter.AdminBlockMod.help.reference.Material;
import de.Albritter.AdminBlockMod.help.reference.Reference;
import de.Albritter.AdminBlockMod.help.utility.LogHelper;
import de.Albritter.AdminBlockMod.Blocks.AdminGlass;
import de.Albritter.AdminBlockMod.Blocks.CustomBlock;

;

public class AdmiumSchacke extends ItemTool {

    public AdmiumSchacke() {
	super(0, Material.Tools.ADMIUM, null);
	this.setUnlocalizedName("admin_tool");
	this.setCreativeTab(CreativeTab.myTab);
    }

    @Override
    public boolean canHarvestBlock(Block par1Block, ItemStack itemStack) {
	return true;
    }

    @Override
    public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_) {

	if (p_150893_2_.getUnlocalizedName().equals("tile.adminGlass")) {
	    ((AdminGlass) p_150893_2_).destroyBlock();
	} else {
	    try {
		((CustomBlock) p_150893_2_).blockHardness = -1;
	    } catch (Exception e) {

	    }

	}
	LogHelper.debug(p_150893_2_);
	return Float.MAX_VALUE;
    }

    @Override
    public String getUnlocalizedName() {
	LogHelper.info(String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
	return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
	return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
	return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
