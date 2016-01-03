package com.mtleo.simpletron.init;

import com.mtleo.simpletron.Reference;
import com.mtleo.simpletron.Simpletron;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SimpletronBlocks {
	
	public static Block test_block;
	public static Block MetalMach;
	public static Block QuartzMach;
	public static Block GemsMach;
	public static Block BurnablePower;
	public static Block LavaPower;
	public static Block FoodPower;
	public static Block Machine_Core;
	public static Block Super_Machine_Core;
	public static Block Liquid_Furnace;
	public static Block Food_Furnace;
	public static Block Gem_Extractor;

	public static void init(){
		test_block = new Block(Material.cloth).setUnlocalizedName("test_block").setCreativeTab(Simpletron.tabSimpletron);		
		MetalMach = new Block(Material.rock).setUnlocalizedName("MetalMach").setCreativeTab(Simpletron.tabSimpletron);		
		QuartzMach = new Block(Material.rock).setUnlocalizedName("QuartzMach").setCreativeTab(Simpletron.tabSimpletron);		
		GemsMach = new Block(Material.rock).setUnlocalizedName("GemsMach").setCreativeTab(Simpletron.tabSimpletron);		
		BurnablePower = new Block(Material.rock).setUnlocalizedName("BurnablePower").setCreativeTab(Simpletron.tabSimpletron);		
		LavaPower = new Block(Material.rock).setUnlocalizedName("LavaPower").setCreativeTab(Simpletron.tabSimpletron);		
		FoodPower = new Block(Material.rock).setUnlocalizedName("FoodPower").setCreativeTab(Simpletron.tabSimpletron);	
		Machine_Core = new Block(Material.rock).setUnlocalizedName("Machine_Core").setCreativeTab(Simpletron.tabSimpletron);	
		Super_Machine_Core = new Block(Material.rock).setUnlocalizedName("Super_Machine_Core").setCreativeTab(Simpletron.tabSimpletron);	
		Liquid_Furnace = new Block(Material.rock).setUnlocalizedName("Liquid_Furnace").setCreativeTab(Simpletron.tabSimpletron);	
		Food_Furnace = new Block(Material.rock).setUnlocalizedName("Food_Furnace").setCreativeTab(Simpletron.tabSimpletron);	
		Gem_Extractor = new Block(Material.rock).setUnlocalizedName("Gem_Extractor").setCreativeTab(Simpletron.tabSimpletron);	
	}
	
	public static void register(){
		GameRegistry.registerBlock(test_block, test_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(MetalMach, MetalMach.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(QuartzMach, QuartzMach.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(GemsMach, GemsMach.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BurnablePower, BurnablePower.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(LavaPower, LavaPower.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(FoodPower, FoodPower.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Machine_Core, Machine_Core.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Super_Machine_Core, Super_Machine_Core.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Liquid_Furnace, Liquid_Furnace.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Food_Furnace, Food_Furnace.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Gem_Extractor, Gem_Extractor.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(test_block);
		registerRender(MetalMach);
		registerRender(QuartzMach);
		registerRender(GemsMach);
		registerRender(BurnablePower);
		registerRender(LavaPower);
		registerRender(FoodPower);
		registerRender(Machine_Core);
		registerRender(Super_Machine_Core);
		registerRender(Liquid_Furnace);
		registerRender(Food_Furnace);
		registerRender(Gem_Extractor);
	}
	
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
