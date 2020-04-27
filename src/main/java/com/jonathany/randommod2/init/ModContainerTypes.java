package com.jonathany.randommod2.init;

import com.jonathany.randommod2.RandomMod2;
import com.jonathany.randommod2.container.LindsayChestContainer;
import com.jonathany.randommod2.container.RapaelChestContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes
{
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, RandomMod2.MOD_ID);

    public static final RegistryObject<ContainerType<RapaelChestContainer>> RAPAEL_CHEST = CONTAINER_TYPES .register("rapael_chest", ()-> IForgeContainerType.create(RapaelChestContainer::new));
    public static final RegistryObject<ContainerType<LindsayChestContainer>> LINDSAY_CHEST = CONTAINER_TYPES .register("lindsay_chest", ()-> IForgeContainerType.create(LindsayChestContainer::new));
}
