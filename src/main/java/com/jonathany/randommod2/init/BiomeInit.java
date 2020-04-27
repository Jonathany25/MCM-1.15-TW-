package com.jonathany.randommod2.init;

import com.jonathany.randommod2.RandomMod2;
import com.jonathany.randommod2.world.biomes.GirlsBiome;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit
{
    public static DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, RandomMod2.MOD_ID);

    public static final RegistryObject<Biome> GIRLS_BIOME = BIOMES.register("girls_biome",
            () -> new GirlsBiome(new Biome.Builder().precipitation(Biome.RainType.SNOW).scale(1.2f).temperature(0.5f)
                    .waterColor(16724639).waterFogColor(16762304)
                    .            surfaceBuilder(SurfaceBuilder.DEFAULT,
                    new SurfaceBuilderConfig(BlockInit.ANNABELLE_BLOCK.get().getDefaultState(),
                            BlockInit.ANNABELLE_BLOCK.get().getDefaultState(),
                            BlockInit.ANNABELLE_BLOCK.get().getDefaultState()))
            .category(Biome.Category.PLAINS).downfall(0.5f).depth(0.12f).parent(null)));
    public static final RegistryObject<Biome> BOYS_BIOME = BIOMES.register("boys_biome",
            () -> new GirlsBiome(new Biome.Builder().precipitation(Biome.RainType.SNOW).scale(1.2f).temperature(0.5f)
                    .waterColor(16724639).waterFogColor(16762304)
                    .            surfaceBuilder(SurfaceBuilder.DEFAULT,
                            new SurfaceBuilderConfig(BlockInit.DYLAN_BLOCK.get().getDefaultState(),
                                    BlockInit.DYLAN_BLOCK.get().getDefaultState(),
                                    BlockInit.DYLAN_BLOCK.get().getDefaultState()))
                    .category(Biome.Category.PLAINS).downfall(0.5f).depth(0.12f).parent(null)));


    public static void registerBiomes()
    {
        registerBiome(GIRLS_BIOME.get(), BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(BOYS_BIOME.get(), BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
    }

    private static void registerBiome(Biome biome, BiomeDictionary.Type... types)
    {
        //Adds Biome in OW: BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome,100));
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }
}
