package com.jonathany.randommod2.world.dimension;

import com.google.common.collect.ImmutableSet;
import com.jonathany.randommod2.init.BiomeInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.Random;
import java.util.Set;

public class BoysDimensionBiomeProvider extends BiomeProvider
{
    private Random random;

    public BoysDimensionBiomeProvider()
    {
        super(biomeList);
        random = new Random();
    }

    private static final Set<Biome> biomeList = ImmutableSet.of(BiomeInit.BOYS_BIOME.get());

    @Override
    public Biome getNoiseBiome(int x, int y, int z)
    {
    return BiomeInit.BOYS_BIOME.get();
    }
}
