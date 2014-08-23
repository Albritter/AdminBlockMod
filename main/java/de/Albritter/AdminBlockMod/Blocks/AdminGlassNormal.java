package de.Albritter.AdminBlockMod.Blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AdminGlassNormal extends BlockCommon
{
	public AdminGlassNormal()
	{
		super(Material.glass);		
		setBlockName("adminGlassNormal");
		setHarvestLevel("FIST", 9001);
		
		
	}

	public int quantityDropped(Random p)
	{
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
		return 1; // 0 Fuer Solid und 1 fr Alpha
	}
	public void destroyBlock(){
		this.blockHardness=0;
	}
}
