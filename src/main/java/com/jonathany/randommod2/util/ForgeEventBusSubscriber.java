package com.jonathany.randommod2.util;

import com.jonathany.randommod2.RandomMod2;
import com.jonathany.randommod2.init.DimensionInit;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RandomMod2.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusSubscriber
{
    @SubscribeEvent
    public static void registerDimensions(final RegisterDimensionsEvent event)
    {
        if(DimensionType.byName(RandomMod2.BOYS_DIM_TYPE) == null)
        {
            DimensionManager.registerDimension(RandomMod2.BOYS_DIM_TYPE, DimensionInit.BOYS_DIM.get(),null,false);
        }
        if(DimensionType.byName(RandomMod2.GIRLS_DIM_TYPE) == null)
        {
            DimensionManager.registerDimension(RandomMod2.GIRLS_DIM_TYPE, DimensionInit.GIRLS_DIM.get(),null,true);
        }
        RandomMod2.LOGGER.info("DONE REGISTERING DIMS!");
    }
}
