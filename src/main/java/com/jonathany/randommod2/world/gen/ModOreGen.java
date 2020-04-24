package com.jonathany.randommod2.world.gen;

import com.jonathany.randommod2.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

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

                ConfiguredPlacement fConfigOW = Placement.COUNT_RANGE.configure
                    (new CountRangeConfig(20, 5, 0, 60));
                ConfiguredPlacement fConfigNT = Placement.COUNT_RANGE.configure
                    (new CountRangeConfig(20, 12, 0, 100));
                ConfiguredPlacement fConfigEND = Placement.COUNT_RANGE.configure
                    (new CountRangeConfig(20, 0, 0, 255));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RUBY_ORE.get().getDefaultState(), 7)).withPlacement(rubyConfigOW));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SAPPHIRE_ORE.get().getDefaultState(), 7)).withPlacement(rubyConfigOW));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.FRIENDS_ORE.get().getDefaultState(), 10)).withPlacement(fConfigOW));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERRUBY_ORE.get().getDefaultState(), 7)).withPlacement(rubyConfigNT));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERSAPPHIRE_ORE.get().getDefaultState(), 7)).withPlacement(rubyConfigNT));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERFRIENDS_ORE.get().getDefaultState(), 10)).withPlacement(fConfigNT));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.ENDRUBY_ORE.get().getDefaultState(), 7)).withPlacement(rubyConfigEND));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig
                                (OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.ENDSAPPHIRE_ORE.get().getDefaultState(), 7)).withPlacement(rubyConfigEND));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(new OreFeatureConfig
                            (OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.ENDFRIENDS_ORE.get().getDefaultState(), 10)).withPlacement(fConfigEND));

        }
    }

}
