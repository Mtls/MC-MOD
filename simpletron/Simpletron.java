package com.mtleo.simpletron;

import com.mtleo.simpletron.init.SimpletronBlocks;
import com.mtleo.simpletron.init.SimpletronItems;
import com.mtleo.simpletron.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Simpletron
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final SimpletronTab tabSimpletron = new SimpletronTab("tabSimpletron");
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	// some code
    	SimpletronItems.init();
    	SimpletronItems.register();
    	SimpletronBlocks.init();
    	SimpletronBlocks.register();
    }
    
    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
		// some code
    	proxy.registerRenders();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	// some code
    }
}
