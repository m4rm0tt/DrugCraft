package com.m4rm0tt.drugcraft.block;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

import com.m4rm0tt.drugcraft.registry.ModItems;

public class CocaCropBlock extends CropBlock {
	public CocaCropBlock(Settings settings) {
		super(settings);
	}

	@Override
	protected ItemConvertible getSeedsItem() {
		return ModItems.COCA_SEEDS;
	}

	@Override
	public int getMaxAge() {
		return 7;
	}
}
