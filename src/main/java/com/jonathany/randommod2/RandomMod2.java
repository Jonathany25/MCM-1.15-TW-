package com.jonathany.randommod2;

import com.jonathany.randommod2.init.BlockInit;
import com.jonathany.randommod2.init.ItemInit;
import com.jonathany.randommod2.world.gen.ModOreGen;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MerchantOffer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;


@Mod("randommod2")
public class RandomMod2
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "randommod2";
    public static RandomMod2 instance;

    public RandomMod2() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance=this;

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        ModOreGen.generateOre();
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event)
    {

    }

    public static class ItemTab extends ItemGroup
    {
        public static final ItemTab instance = new ItemTab(ItemGroup.GROUPS.length, "itemtab");
        private ItemTab(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ItemInit.ruby_sapphire_gem);
        }
    }

    public static class BlockTab extends ItemGroup
    {
        public static final BlockTab instance = new BlockTab(ItemGroup.GROUPS.length, "blocktab");
        private BlockTab(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(BlockInit.ruby_sapphire_block);
        }
    }

    public static class ToolTab extends ItemGroup
    {
        public static final ToolTab instance = new ToolTab(ItemGroup.GROUPS.length, "tooltab");
        private ToolTab(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ItemInit.ruby_sapphire_pickaxe);
        }
    }

    public static class ArmorTab extends ItemGroup
    {
        public static final ArmorTab instance = new ArmorTab(ItemGroup.GROUPS.length, "armortab");
        private ArmorTab(int index, String label)
        {
            super(index, label);
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ItemInit.ruby_sapphire_chestplate);
        }
    }
}
