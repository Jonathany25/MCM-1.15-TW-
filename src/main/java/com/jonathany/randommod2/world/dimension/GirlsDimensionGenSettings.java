package com.jonathany.randommod2.world.dimension;

import com.jonathany.randommod2.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationSettings;

public class GirlsDimensionGenSettings extends GenerationSettings
{
    GirlsDimensionGenSettings()
    {
        this.setDefaultBlock(BlockInit.KEIRA_BLOCK.get().getDefaultState());
        this.setDefaultFluid(Blocks.WATER.getDefaultState());
    }

    public int getBiomeSize()
    {
        return 5;
    }

    public int getRiverSize()
    {
        return 5;
    }

    public int getBiomeID()
    {
        return -1;
    }

    @Override
    public int getBedrockFloorHeight()
    {
        return 0;
    }
}
