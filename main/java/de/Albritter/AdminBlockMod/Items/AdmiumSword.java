package de.Albritter.AdminBlockMod.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.Albritter.AdminBlockMod.CreativeTabs.CreativeTab;
import de.Albritter.AdminBlockMod.help.reference.Material;
import de.Albritter.AdminBlockMod.help.reference.Reference;
import de.Albritter.AdminBlockMod.help.utility.LogHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class AdmiumSword extends ItemSword {

    public AdmiumSword() {
	super(Material.Tools.ADMIUM);
	this.setUnlocalizedName("admin_sword");
	this.setCreativeTab(CreativeTab.myTab);
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

    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_) {
	// LogHelper.info(p_77644_3_ + " = p_77644_3_ \n" + p_77644_2_ +
	// " = p_77644_2_");
	p_77644_2_.setHealth(0);
	p_77644_2_.setDead();
	p_77644_1_.damageItem(1, p_77644_3_);
	return true;
    }
}