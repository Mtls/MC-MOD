package com.mtleo.simpletron.init;

import com.mtleo.simpletron.Reference;
import com.mtleo.simpletron.Simpletron;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SimpletronItems {
	public static Item test_item;
	public static Item Diaron;
	public static Item Goldiron;
	
	public static Item ruby_nugget;
	public static Item ruby_t1;
	public static Item ruby_t2;
	public static Item ruby_t3;
	public static Item ruby_t4;
	public static Item ruby_t5;
	
	public static Item emerald_nugget;
	public static Item emerald_t1;
	public static Item emerald_t2;
	public static Item emerald_t3;
	public static Item emerald_t4;
	public static Item emerald_t5;
	
	public static Item sapphire_nugget;
	public static Item sapphire_t1;
	public static Item sapphire_t2;
	public static Item sapphire_t3;
	public static Item sapphire_t4;
	public static Item sapphire_t5;

	public static void init(){
		test_item = new Item().setUnlocalizedName("test_item").setCreativeTab(Simpletron.tabSimpletron);
		Diaron = new Item().setUnlocalizedName("Diaron").setCreativeTab(Simpletron.tabSimpletron);
		Goldiron = new Item().setUnlocalizedName("Goldiron").setCreativeTab(Simpletron.tabSimpletron);
		
		// Rubies
		ruby_nugget = new Item().setUnlocalizedName("ruby_nugget").setCreativeTab(Simpletron.tabSimpletron);
		ruby_t1 = new Item().setUnlocalizedName("ruby_t1").setCreativeTab(Simpletron.tabSimpletron);
		ruby_t2 = new Item().setUnlocalizedName("ruby_t2").setCreativeTab(Simpletron.tabSimpletron);
		ruby_t3 = new Item().setUnlocalizedName("ruby_t3").setCreativeTab(Simpletron.tabSimpletron);
		ruby_t4 = new Item().setUnlocalizedName("ruby_t4").setCreativeTab(Simpletron.tabSimpletron);
		ruby_t5 = new Item().setUnlocalizedName("ruby_t5").setCreativeTab(Simpletron.tabSimpletron);
		
		// Emeralds
		emerald_nugget = new Item().setUnlocalizedName("emerald_nugget").setCreativeTab(Simpletron.tabSimpletron);
		emerald_t1 = new Item().setUnlocalizedName("emerald_t1").setCreativeTab(Simpletron.tabSimpletron);
		emerald_t2 = new Item().setUnlocalizedName("emerald_t2").setCreativeTab(Simpletron.tabSimpletron);
		emerald_t3 = new Item().setUnlocalizedName("emerald_t3").setCreativeTab(Simpletron.tabSimpletron);
		emerald_t4 = new Item().setUnlocalizedName("emerald_t4").setCreativeTab(Simpletron.tabSimpletron);
		emerald_t5 = new Item().setUnlocalizedName("emerald_t5").setCreativeTab(Simpletron.tabSimpletron);
		
		// Sapphires
		sapphire_nugget = new Item().setUnlocalizedName("sapphire_nugget").setCreativeTab(Simpletron.tabSimpletron);
		sapphire_t1 = new Item().setUnlocalizedName("sapphire_t1").setCreativeTab(Simpletron.tabSimpletron);
		sapphire_t2 = new Item().setUnlocalizedName("sapphire_t2").setCreativeTab(Simpletron.tabSimpletron);
		sapphire_t3 = new Item().setUnlocalizedName("sapphire_t3").setCreativeTab(Simpletron.tabSimpletron);
		sapphire_t4 = new Item().setUnlocalizedName("sapphire_t4").setCreativeTab(Simpletron.tabSimpletron);
		sapphire_t5 = new Item().setUnlocalizedName("sapphire_t5").setCreativeTab(Simpletron.tabSimpletron);
	}
	
	public static void register(){
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Diaron, Diaron.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Goldiron, Goldiron.getUnlocalizedName().substring(5));
		
		// Rubies
		GameRegistry.registerItem(ruby_nugget, ruby_nugget.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby_t1, ruby_t1.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby_t2, ruby_t2.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby_t3, ruby_t3.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby_t4, ruby_t4.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby_t5, ruby_t5.getUnlocalizedName().substring(5));
		
		// Emeralds
		GameRegistry.registerItem(emerald_nugget, emerald_nugget.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_t1, emerald_t1.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_t2, emerald_t2.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_t3, emerald_t3.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_t4, emerald_t4.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_t5, emerald_t5.getUnlocalizedName().substring(5));
		
		// Sapphires
		GameRegistry.registerItem(sapphire_nugget, sapphire_nugget.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire_t1, sapphire_t1.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire_t2, sapphire_t2.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire_t3, sapphire_t3.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire_t4, sapphire_t4.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire_t5, sapphire_t5.getUnlocalizedName().substring(5));
		
		
	}
	
	public static void registerRenders(){
		registerRender(test_item);
		registerRender(Diaron);
		registerRender(Goldiron);
		
		// Rubies
		registerRender(ruby_nugget);
		registerRender(ruby_t1);
		registerRender(ruby_t2);
		registerRender(ruby_t3);
		registerRender(ruby_t4);
		registerRender(ruby_t5);
		
		// Emeralds
		registerRender(emerald_nugget);
		registerRender(emerald_t1);
		registerRender(emerald_t2);
		registerRender(emerald_t3);
		registerRender(emerald_t4);
		registerRender(emerald_t5);
		
		// Sapphires
		registerRender(sapphire_nugget);
		registerRender(sapphire_t1);
		registerRender(sapphire_t2);
		registerRender(sapphire_t3);
		registerRender(sapphire_t4);
		registerRender(sapphire_t5);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
