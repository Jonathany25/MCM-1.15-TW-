package com.jonathany.randommod2.init;

import com.jonathany.randommod2.RandomMod2;
import com.jonathany.randommod2.world.dimension.BoysModDimension;
import com.jonathany.randommod2.world.dimension.GirlsModDimension;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit
{
    public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, RandomMod2.MOD_ID);
    public static final RegistryObject<ModDimension> BOYS_DIM = MOD_DIMENSIONS.register("boys_dimension", ()-> new BoysModDimension());
    public static final RegistryObject<ModDimension> GIRLS_DIM = MOD_DIMENSIONS.register("girls_dimension", ()-> new GirlsModDimension());
}
