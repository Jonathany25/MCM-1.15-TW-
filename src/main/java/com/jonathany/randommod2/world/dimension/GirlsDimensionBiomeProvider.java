package com.jonathany.randommod2.world.dimension;

import com.google.common.collect.ImmutableSet;
import com.jonathany.randommod2.init.BiomeInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.Random;
import java.util.Set;

public class GirlsDimensionBiomeProvider extends BiomeProvider
{
    private Random random;

    public GirlsDimensionBiomeProvider()
    {
        super(biomeList);
        random = new Random();
    }

    private static final Set<Biome> biomeList = ImmutableSet.of(BiomeInit.GIRLS_BIOME.get());

    @Override
    public Biome getNoiseBiome(int x, int y, int z)
    {
    return BiomeInit.GIRLS_BIOME.get();
    }
}
