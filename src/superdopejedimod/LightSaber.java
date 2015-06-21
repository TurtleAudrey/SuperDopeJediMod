package superdopesquad.superdopejedimod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LightSaber extends BaseItem {
	
	String color;
	

	public LightSaber(String unlocalizedName, String colorInput) {
		
		super(unlocalizedName);
		
		this.setMaxStackSize(1);
		
		this.color = colorInput;
		
		this.setCreativeTab(CreativeTabs.tabCombat);
		//this.setMaxStackSize(64);
		//this.setCreativeTab(CreativeTabs.tabMisc);
		//this.setUnlocalizedName(unlocalizedName);
	}
	
	
//	public void registerRecipe() {
//		
//		// Bryn, here is the edited code you gave me, feel free to uncomment it out!
//		// Note that you might have a missing space in the top row of your recipe below for where
//		// the redcrystal goes.
//		// Recipe for creating a LightSaber
//		ItemStack redPowerCrystalStack = new ItemStack(SuperDopeJediMod.redPowerCrystal);
//		ItemStack stoneButtonStack = new ItemStack(Blocks.stone_button);
//		ItemStack ironIngotStack = new ItemStack(Items.iron_ingot);
//		GameRegistry.addRecipe(new ItemStack(this), " x", " y", " z", 'x', redPowerCrystalStack, 'y', stoneButtonStack, 'z', ironIngotStack);
//
//	}

}
