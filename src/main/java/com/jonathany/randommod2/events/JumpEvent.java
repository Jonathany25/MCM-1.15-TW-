package com.jonathany.randommod2.events;

import com.jonathany.randommod2.RandomMod2;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RandomMod2.MOD_ID,bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class JumpEvent
{
    @SubscribeEvent
    public static void JumpEvent(LivingEvent.LivingJumpEvent event)
    {
        LivingEntity entity = event.getEntityLiving();
        RandomMod2.LOGGER.info("Fired by " + entity);
        World world = entity.getEntityWorld();

    }
}
