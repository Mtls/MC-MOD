package com.mtleo.simpletron;

import com.mtleo.simpletron.init.SimpletronBlocks;
import com.mtleo.simpletron.init.SimpletronItems;
import com.mtleo.simpletron.items.ItemExcalibur;
import com.mtleo.simpletron.proxy.CommonProxy;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Simpletron {
    	
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
    public static final SimpletronTab tabSimpletron = new SimpletronTab("tabSimpletron");

    public static final Item.ToolMaterial ruby = EnumHelper.addToolMaterial("ruby", 3, 1000, 5.0F, 3.0F, 10);
    public static final Item.ToolMaterial emerald = EnumHelper.addToolMaterial("emerald", 3, 1000, 5.0F, 3.0F, 10);
    public static final Item.ToolMaterial sapphire = EnumHelper.addToolMaterial("sapphire", 3, 1000, 5.0F, 3.0F, 10);

    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	SimpletronItems.init();
		SimpletronItems.register();
		SimpletronBlocks.init();
    	SimpletronBlocks.register();
	}
	
    @EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenders();
	}
	
    @EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
