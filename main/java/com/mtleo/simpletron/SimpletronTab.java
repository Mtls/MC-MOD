package com.mtleo.simpletron;

import com.mtleo.simpletron.init.SimpletronItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SimpletronTab extends CreativeTabs {

	public SimpletronTab(String label) {
		super(label);
		this.setBackgroundImageName("simpletron.png");
	}

	@Override
	public Item getTabIconItem() {
		return SimpletronItems.test_item;
	}

	
}
