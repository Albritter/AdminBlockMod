package de.Albritter.AdminBlockMod.Blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.Albritter.AdminBlockMod.CreativeTabs.CreativeTab;
import de.Albritter.AdminBlockMod.help.reference.Config;
import de.Albritter.AdminBlockMod.help.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCommon extends Block
{ 

	public BlockCommon(Material m)
	{
		super(m);
		setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":"
				+ getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTab.myTab);
		initProp();
		

	}
	
	
	private void initProp()
	{
		if (Config.setUnbreakable)
		{
			setBlockUnbreakable();
			setResistance(6000000.0F);
		} else
		{
			setHardness(0.0F);
			setResistance(0.0F);
		}
		
	}

	public int quantityDropped(Random p)
	{
		return 1;
	}

	public boolean isOpaqueCube()
	{
		return true;
	}

	public boolean renderAsNormalBlock()
	{
		return true;
	}

	protected boolean canSilkHarvest()
	{
		return false;
	}

	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass()
	{
		return 0; // 0 Für Solid und 1 für Alpha
	}

	public int getMobilityFlag()
	{
		return 2;
	}

}

