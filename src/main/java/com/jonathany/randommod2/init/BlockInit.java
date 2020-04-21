package com.jonathany.randommod2.init;

import com.jonathany.randommod2.RandomMod2;

import com.jonathany.randommod2.objects.blocks.FloorLight;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@ObjectHolder(RandomMod2.MOD_ID)
@Mod.EventBusSubscriber(modid = RandomMod2.MOD_ID, bus = Bus.MOD)
public class BlockInit
{

    public static final Block ruby_block = null;
    public static final Block sapphire_block = null;
    public static final Block ruby_sapphire_block = null;
    public static final Block ruby_ore = null;
    public static final Block sapphire_ore = null;
    public static final Block friends_ore = null;
    public static final Block netherruby_ore = null;
    public static final Block nethersapphire_ore = null;
    public static final Block endruby_ore = null;
    public static final Block endsapphire_ore = null;
    public static final Block floor_light = null;



    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,30)
                .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("ruby_block"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,30)
                .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("sapphire_block"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,30)
                .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("ruby_sapphire_block"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
                .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("ruby_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
                .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("sapphire_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
                .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("friends_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
                .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("netherruby_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
                .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("nethersapphire_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
                .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("endruby_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
                .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("endsapphire_ore"));
        event.getRegistry().register(new FloorLight(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f,10.0f)
                .harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.GLASS).lightValue(10).slipperiness(1.2f).speedFactor(0f).noDrops()).setRegistryName("floor_light"));

    }

    @SubscribeEvent
    public static void registerItemBlock(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(ruby_block, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("ruby_block"));
        event.getRegistry().register(new BlockItem(sapphire_block, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("sapphire_block"));
        event.getRegistry().register(new BlockItem(ruby_sapphire_block, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("ruby_sapphire_block"));
        event.getRegistry().register(new BlockItem(ruby_ore, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("ruby_ore"));
        event.getRegistry().register(new BlockItem(sapphire_ore, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("sapphire_ore"));
        event.getRegistry().register(new BlockItem(friends_ore, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("friends_ore"));
        event.getRegistry().register(new BlockItem(nethersapphire_ore, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("endsapphire_ore"));
        event.getRegistry().register(new BlockItem(netherruby_ore, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("endruby_ore"));
        event.getRegistry().register(new BlockItem(endsapphire_ore, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("nethersapphire_ore"));
        event.getRegistry().register(new BlockItem(endruby_ore, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("netherruby_ore"));
        event.getRegistry().register(new BlockItem(floor_light, new Item.Properties().group(RandomMod2.BlockTab.instance)).setRegistryName("floor_light"));
    }

    

}
