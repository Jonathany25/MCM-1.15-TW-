package com.jonathany.randommod2.world.dimension;

import net.minecraft.world.gen.GenerationSettings;

public class BoysDimensionGenSettings extends GenerationSettings
{
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
