package de.Albritter.AdminBlockMod.Blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.Albritter.AdminBlockMod.help.utility.LogHelper;

public class AdminGlass extends CustomBlock
{
	public AdminGlass()
	{
		super(Material.glass);		
		setBlockName("adminGlass");
		setHarvestLevel("FIST", 9001);
		LogHelper.info(this.getUnlocalizedName() + "!!!!!!!!!!!!!!!!!!!!!");
	}

	public int quantityDropped(Random p)
	{
	    LogHelper.info("call \"public int quantityDropped(Random p)\"");	
	    return 0;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	protected boolean canSilkHarvest()
	{
		return false;
	}

	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass()
	{
		return 1; // 0 Fuer Solid und 1 fuer Alpha
	}
	public void destroyBlock(){
		this.blockHardness=0;
	LogHelper.info("call \"public void destroyBlock() \"");	
	}
}
