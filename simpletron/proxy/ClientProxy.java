package com.mtleo.simpletron.proxy;

import com.mtleo.simpletron.init.SimpletronBlocks;
import com.mtleo.simpletron.init.SimpletronItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		SimpletronItems.registerRenders();
		SimpletronBlocks.registerRenders();
	}
}
