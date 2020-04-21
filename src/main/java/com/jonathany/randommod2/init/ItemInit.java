package com.jonathany.randommod2.init;

import com.jonathany.randommod2.RandomMod2;
import com.jonathany.randommod2.objects.items.InvisibilityRing;
import com.jonathany.randommod2.objects.items.PlasticBottle;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Random;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = RandomMod2.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(RandomMod2.MOD_ID)

public class ItemInit
{
    //Items
    public static final Item ruby = null;
    public static final Item ruby_dust = null;
    public static final Item sapphire = null;
    public static final Item sapphire_dust = null;
    public static final Item ruby_sapphire_gem = null;
    public static final Item ruby_sapphire_dust = null;
    public static final Item invisibility_mirror = null;
    public static final Item obsidian_rod = null;
    public static final Item reinforced_obsidian_rod = null;

    //Tools
    public static final Item ruby_sword = null;
    public static final Item ruby_axe = null;
    public static final Item ruby_pickaxe = null;
    public static final Item ruby_hoe = null;
    public static final Item ruby_shovel = null;
    public static final Item sapphire_sword = null;
    public static final Item sapphire_axe = null;
    public static final Item sapphire_pickaxe = null;
    public static final Item sapphire_hoe = null;
    public static final Item sapphire_shovel = null;
    public static final Item ruby_sapphire_sword = null;
    public static final Item ruby_sapphire_axe = null;
    public static final Item ruby_sapphire_pickaxe = null;
    public static final Item ruby_sapphire_hoe = null;
    public static final Item ruby_sapphire_shovel = null;

    //Armor
    public static final Item ruby_helmet = null;
    public static final Item ruby_chestplate = null;
    public static final Item ruby_leggings = null;
    public static final Item ruby_boots = null;
    public static final Item sapphire_helmet = null;
    public static final Item sapphire_chestplate = null;
    public static final Item sapphire_leggings = null;
    public static final Item sapphire_boots = null;
    public static final Item ruby_sapphire_helmet = null;
    public static final Item ruby_sapphire_chestplate = null;
    public static final Item ruby_sapphire_leggings = null;
    public static final Item ruby_sapphire_boots = null;
    public static final Item plastic_bottle = null;


    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {   //Items
        event.getRegistry().register(new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)).setRegistryName("ruby"));
        event.getRegistry().register(new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)).setRegistryName("sapphire"));
        event.getRegistry().register(new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)).setRegistryName("ruby_sapphire_gem"));
        event.getRegistry().register(new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)).setRegistryName("ruby_dust"));
        event.getRegistry().register(new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)).setRegistryName("sapphire_dust"));
        event.getRegistry().register(new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)).setRegistryName("ruby_sapphire_dust"));
        event.getRegistry().register(new InvisibilityRing(new Item.Properties().group(RandomMod2.ToolTab.instance).maxStackSize(1))
                .setRegistryName("invisibility_mirror"));
        event.getRegistry().register(new PlasticBottle(new Item.Properties().group(RandomMod2.ItemTab.instance).maxStackSize(64))
                .setRegistryName("plastic_bottle"));
        event.getRegistry().register(new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)).setRegistryName("obsidian_rod"));
        event.getRegistry().register(new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)).setRegistryName("reinforced_obsidian_rod"));

        //Food
        event.getRegistry().register(new Item(new Item.Properties().group(RandomMod2.ItemTab.instance).food(new Food.Builder().hunger(1).saturation(10f).setAlwaysEdible().meat()
                .effect(new EffectInstance(Effects.NAUSEA,200,1), 0.8f).build())).setRegistryName("beer"));

        //Tools
        event.getRegistry().register(new SwordItem(ItemTier.RUBY, 7, 5.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("ruby_sword"));
        event.getRegistry().register(new PickaxeItem(ItemTier.RUBY, 1, 5.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("ruby_pickaxe"));
        event.getRegistry().register(new AxeItem(ItemTier.RUBY,8, 3.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("ruby_axe"));
        event.getRegistry().register(new HoeItem(ItemTier.RUBY, 5.0f,new Item.Properties().group(RandomMod2.ToolTab.instance)).setRegistryName("ruby_hoe"));
        event.getRegistry().register(new ShovelItem(ItemTier.RUBY, 1,5.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("ruby_shovel"));
        event.getRegistry().register(new SwordItem(ItemTier.SAPPHIRE, 7, 5.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("sapphire_sword"));
        event.getRegistry().register(new PickaxeItem(ItemTier.SAPPHIRE, 1, 5.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("sapphire_pickaxe"));
        event.getRegistry().register(new AxeItem(ItemTier.SAPPHIRE,8, 3.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("sapphire_axe"));
        event.getRegistry().register(new HoeItem(ItemTier.SAPPHIRE, 5.0f,new Item.Properties().group(RandomMod2.ToolTab.instance)).setRegistryName("sapphire_hoe"));
        event.getRegistry().register(new ShovelItem(ItemTier.SAPPHIRE, 1,5.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("sapphire_shovel"));
        event.getRegistry().register(new SwordItem(ItemTier.SRUBY, 7, 5.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("ruby_sapphire_sword"));
        event.getRegistry().register(new PickaxeItem(ItemTier.SRUBY, 1, 5.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("ruby_sapphire_pickaxe"));
        event.getRegistry().register(new AxeItem(ItemTier.SRUBY,8, 3.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("ruby_sapphire_axe"));
        event.getRegistry().register(new HoeItem(ItemTier.SRUBY, 5.0f,new Item.Properties().group(RandomMod2.ToolTab.instance)).setRegistryName("ruby_sapphire_hoe"));
        event.getRegistry().register(new ShovelItem(ItemTier.SRUBY, 1,5.0f,new Item.Properties()
                .group(RandomMod2.ToolTab.instance)).setRegistryName("ruby_sapphire_shovel"));

        //Armor
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("ruby_helmet"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("ruby_chestplate"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("ruby_leggings"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("ruby_boots"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("sapphire_helmet"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("sapphire_chestplate"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("sapphire_leggings"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("sapphire_boots"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBYSAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("ruby_sapphire_helmet"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBYSAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("ruby_sapphire_chestplate"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBYSAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("ruby_sapphire_leggings"));
        event.getRegistry().register(new ArmorItem(ModArmorMaterial.RUBYSAPPHIRE, EquipmentSlotType.FEET, new Item.Properties()
                .group(RandomMod2.ArmorTab.instance)).setRegistryName("ruby_sapphire_boots"));
    }

    public enum ItemTier implements IItemTier
    {
        RUBY(4, 2000, 15.0f, 6.0f, 10, () ->
        {
            return Ingredient.fromItems(ItemInit.ruby);
        }),

        SAPPHIRE(4, 2000, 15.0f, 6.0f, 10, () ->
        {
            return Ingredient.fromItems(ItemInit.sapphire);
        }),

        SRUBY(4, 2000, 15.0f, 7.0f, 10, () ->
        {
            return Ingredient.fromItems(ItemInit.ruby_sapphire_gem);
        });

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private ItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
        {
            this.harvestLevel=harvestLevel;
            this.maxUses=maxUses;
            this.efficiency=efficiency;
            this.attackDamage=attackDamage;
            this.enchantability=enchantability;
            this.repairMaterial=new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses()
        {
            return maxUses;
        }

        @Override
        public float getEfficiency()
        {
            return efficiency;
        }

        @Override
        public float getAttackDamage()
        {

            return attackDamage;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public int getEnchantability()
        {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial()
        {
            return this.repairMaterial.getValue();
        }
    }

    public enum ModArmorMaterial implements IArmorMaterial
    {
        RUBY(RandomMod2.MOD_ID + ":ruby", 16, new int[] {4,7,9,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,4.0f,()->
        {
            return Ingredient.fromItems(ItemInit.ruby);
        }),

        SAPPHIRE(RandomMod2.MOD_ID + ":sapphire", 16, new int[] {4,7,9,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,4.0f,()->
        {
            return Ingredient.fromItems(ItemInit.sapphire);
        }),

        RUBYSAPPHIRE(RandomMod2.MOD_ID + ":ruby_sapphire", 20, new int[] {5,8,10,5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,5.0f,()->
        {
            return Ingredient.fromItems(ItemInit.ruby_sapphire_gem);
        });


        private static final int[] MAX_DAMAGE_ARRAY = new int[]{16,16,16,16};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final LazyValue<Ingredient> repairMaterial;

        private ModArmorMaterial(String nameIn, int maxDamageFactor, int[] damageReductionAmountIn,int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn)
        {
            this.name = nameIn;
            this.maxDamageFactor=maxDamageFactor;
            this.damageReductionAmountArray = damageReductionAmountIn;
            this.enchantability = enchantabilityIn;
            this.soundEvent=soundEventIn;
            this.toughness=toughnessIn;
            this.repairMaterial=new LazyValue<>(repairMaterialIn);
        }


        @Override
        public int getDurability(EquipmentSlotType slotIn)
        {
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn)
        {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability()
        {
            return this.enchantability;
        }

        @Override
        public SoundEvent getSoundEvent()
        {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial()
        {
            return this.repairMaterial.getValue();
        }

        @OnlyIn(Dist.CLIENT)
        @Override
        public String getName()
        {
            return this.name;
        }

        @Override
        public float getToughness()
        {
            return this.toughness;
        }
    }

}
