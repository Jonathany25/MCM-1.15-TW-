package com.jonathany.randommod2.world.gen;

import com.jonathany.randommod2.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;

public class ModOreGen
{
    public static void generateOre()
    {
        for(Biome biome : ForgeRegistries.BIOMES) {

                ConfiguredPlacement rubyConfigOW = Placement.COUNT_RANGE.configure
                        (new CountRangeConfig(6, 5, 0, 30));
                ConfiguredPlacement rubyConfigNT = Placement.COUNT_RANGE.configure
                        (new CountRangeConfig(15, 12, 0, 100));
                ConfiguredPlacement rubyConfigEND = Placement.COUNT_RANGE.configure
                        (new CountRangeConfig(15, 0, 0, 255));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ruby_ore.getDefaultState(), 7)).withPlacement(rubyConfigOW));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.sapphire_ore.getDefaultState(), 7)).withPlacement(rubyConfigOW));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.netherruby_ore.getDefaultState(), 7)).withPlacement(rubyConfigNT));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.nethersapphire_ore.getDefaultState(), 7)).withPlacement(rubyConfigNT));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.endruby_ore.getDefaultState(), 7)).withPlacement(rubyConfigEND));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.endsapphire_ore.getDefaultState(), 7)).withPlacement(rubyConfigEND));


        }
    }

}
