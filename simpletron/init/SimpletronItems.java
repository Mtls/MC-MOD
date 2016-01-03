package com.mtleo.simpletron.init;

import com.mtleo.simpletron.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SimpletronItems {
	public static Item test_item;
	public static Item Diaron;
	public static Item Goldiron;

	public static void init(){
		test_item = new Item().setUnlocalizedName("test_item");
		Diaron = new Item().setUnlocalizedName("Diaron");
		Goldiron = new Item().setUnlocalizedName("Goldiron");
	}
	
	public static void register(){
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Diaron, Diaron.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Goldiron, Goldiron.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(test_item);
		registerRender(Diaron);
		registerRender(Goldiron);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
