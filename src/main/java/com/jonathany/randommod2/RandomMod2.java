package com.jonathany.randommod2;

import com.jonathany.randommod2.init.*;
import com.jonathany.randommod2.world.gen.ModOreGen;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("randommod2")
@Mod.EventBusSubscriber(modid = RandomMod2.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RandomMod2
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "randommod2";
    public static RandomMod2 instance;
    public static final ResourceLocation BOYS_DIM_TYPE = new ResourceLocation(MOD_ID, "boys_dimension");
    public static final ResourceLocation GIRLS_DIM_TYPE = new ResourceLocation(MOD_ID, "girls_dimension");


    public RandomMod2() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
        BiomeInit.BIOMES.register(modEventBus);
        DimensionInit.MOD_DIMENSIONS.register(modEventBus);

        instance=this;

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event)
    {
        final IForgeRegistry<Item> registry = event.getRegistry();
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(BlockTab.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
        LOGGER.debug("DONE REGISTERING BLOCKITEM!");
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event)
    {
        BiomeInit.registerBiomes();
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
            return new ItemStack(ItemInit.RUBY_SAPPHIRE_GEM.get());
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
            return new ItemStack(BlockInit.RUBY_SAPPHIRE_BLOCK.get());
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
            return new ItemStack(ItemInit.RUBY_SAPPHIRE_PICKAXE.get());
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
            return new ItemStack(ItemInit.SAPPHIRE_RUBY_CHESTPLATE.get());
        }
    }
}
