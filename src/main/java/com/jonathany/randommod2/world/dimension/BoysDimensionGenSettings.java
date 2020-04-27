package com.jonathany.randommod2.world.dimension;

import com.jonathany.randommod2.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationSettings;

public class BoysDimensionGenSettings extends GenerationSettings
{
    public BoysDimensionGenSettings()
    {
        this.setDefaultBlock(BlockInit.BRIAN_BLOCK.get().getDefaultState());
        this.setDefaultFluid(Blocks.LAVA.getDefaultState());
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
