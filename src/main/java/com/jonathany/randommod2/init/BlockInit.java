package com.jonathany.randommod2.init;

import com.jonathany.randommod2.RandomMod2;
import com.jonathany.randommod2.objects.blocks.BlockQuarry;
import com.jonathany.randommod2.objects.blocks.FloorLight;
import com.jonathany.randommod2.objects.blocks.ModPressurePlateBlock;
import com.jonathany.randommod2.objects.blocks.ModWoodButtonBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, RandomMod2.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,30)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,30)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> RUBY_SAPPHIRE_BLOCK = BLOCKS.register("ruby_sapphire_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,30)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> NETHERSAPPHIRE_ORE = BLOCKS.register("nethersapphire_ore", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> NETHERRUBY_ORE = BLOCKS.register("netherruby_ore", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> ENDSAPPHIRE_ORE = BLOCKS.register("endsapphire_ore", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> ENDRUBY_ORE = BLOCKS.register("endruby_ore", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> FRIENDS_ORE = BLOCKS.register("friends_ore", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> FLOOR_LIGHT = BLOCKS.register("floor_light", () -> new FloorLight(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f,10.0f)
            .harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.GLASS).lightValue(10).slipperiness(1.2f).speedFactor(0f).noDrops()));
    public static final RegistryObject<Block> QUARRY = BLOCKS.register("quarry", () -> new BlockQuarry(Block.Properties.create(Material.IRON).hardnessAndResistance(5,10)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));

    //Stairs
    public static final RegistryObject<Block> RUBY_STAIRS = BLOCKS.register("ruby_stairs", ()-> new StairsBlock(()-> RUBY_BLOCK.get().getDefaultState(), Block.Properties.create(Material.IRON).hardnessAndResistance(5,30)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> RUBY_FENCE = BLOCKS.register("ruby_fence", ()-> new FenceBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(5,30)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> RUBY_BUTTON = BLOCKS.register("ruby_button", ()-> new ModWoodButtonBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(5,30)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> RUBY_PRESSURE_PLATE = BLOCKS.register("ruby_pressure_plate", ()-> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.IRON, MaterialColor.AIR).hardnessAndResistance(5,30)
            .sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));



}
