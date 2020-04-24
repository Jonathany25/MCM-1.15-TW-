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
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RandomMod2.MOD_ID);

    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> RUBY_DUST = ITEMS.register("ruby_dust", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_DUST = ITEMS.register("sapphire_dust", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> RUBY_SAPPHIRE_GEM = ITEMS.register("ruby_sapphire_gem", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> RUBY_SAPPHIRE_DUST = ITEMS.register("ruby_sapphire_dust", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> INVISIBILITY_MIRROR = ITEMS.register("invisibility_mirror", () -> new InvisibilityRing(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> OBSIDIAN_ROD = ITEMS.register("obsidian_rod", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_ROD = ITEMS.register("reinforced_obsidian_rod", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> PLASTIC_BOTTLE = ITEMS.register("plastic_bottle", () -> new PlasticBottle(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> FRIENDS_INGOT = ITEMS.register("friends_ingot", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    public static final RegistryObject<Item> FRIENDS_DUST = ITEMS.register("friends_dust", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance)));
    //Food
    public static final RegistryObject<Item> BEER = ITEMS.register("beer", () -> new Item(new Item.Properties().group(RandomMod2.ItemTab.instance).food(new Food.Builder().hunger(1).saturation(10f).setAlwaysEdible().meat()
            .effect(new EffectInstance(Effects.NAUSEA,200,1), 0.8f).build())));

    //Tools
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ItemInit.ItemTier.RUBY, 7, 5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ItemInit.ItemTier.RUBY, 1, 5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ItemInit.ItemTier.RUBY,8, 3.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ItemInit.ItemTier.RUBY, 5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ItemInit.ItemTier.RUBY, 1,5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> RUBY_SAPPHIRE_SWORD = ITEMS.register("ruby_sapphire_sword", () -> new SwordItem(ItemInit.ItemTier.SRUBY, 7, 5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> RUBY_SAPPHIRE_PICKAXE = ITEMS.register("ruby_sapphire_pickaxe", () -> new PickaxeItem(ItemInit.ItemTier.SRUBY, 1, 5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> RUBY_SAPPHIRE_AXE = ITEMS.register("ruby_sapphire_axe", () -> new AxeItem(ItemInit.ItemTier.SRUBY,8, 3.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> RUBY_SAPPHIRE_HOE = ITEMS.register("ruby_sapphire_hoe", () -> new HoeItem(ItemInit.ItemTier.SRUBY, 5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> RUBY_SAPPHIRE_SHOVEL = ITEMS.register("ruby_sapphire_shovel", () -> new ShovelItem(ItemInit.ItemTier.SRUBY, 1,5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ItemInit.ItemTier.SAPPHIRE, 7, 5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ItemInit.ItemTier.SAPPHIRE, 1, 5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ItemInit.ItemTier.SAPPHIRE,8, 3.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ItemInit.ItemTier.SAPPHIRE, 5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ItemInit.ItemTier.SAPPHIRE, 1,5.0f,new Item.Properties()
            .group(RandomMod2.ToolTab.instance)));

    //Armor
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ItemInit.ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ItemInit.ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ItemInit.ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ItemInit.ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_RUBY_HELMET = ITEMS.register("ruby_sapphire_helmet", () -> new ArmorItem(ItemInit.ModArmorMaterial.RUBYSAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_RUBY_CHESTPLATE = ITEMS.register("ruby_sapphire_chestplate", () -> new ArmorItem(ItemInit.ModArmorMaterial.RUBYSAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_RUBY_LEGGINGS = ITEMS.register("ruby_sapphire_leggings", () -> new ArmorItem(ItemInit.ModArmorMaterial.RUBYSAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_RUBY_BOOTS = ITEMS.register("ruby_sapphire_boots", () -> new ArmorItem(ItemInit.ModArmorMaterial.RUBYSAPPHIRE, EquipmentSlotType.FEET, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ItemInit.ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ItemInit.ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ItemInit.ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ItemInit.ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties()
            .group(RandomMod2.ArmorTab.instance)));


    public enum ItemTier implements IItemTier
    {
        RUBY(4, 2000, 15.0f, 6.0f, 10, () ->
        {
            return Ingredient.fromItems(ItemInit.RUBY.get());
        }),

        SAPPHIRE(4, 2000, 15.0f, 6.0f, 10, () ->
        {
            return Ingredient.fromItems(ItemInit.SAPPHIRE.get());
        }),

        SRUBY(4, 2000, 15.0f, 7.0f, 10, () ->
        {
            return Ingredient.fromItems(ItemInit.RUBY_SAPPHIRE_GEM.get());
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
            return Ingredient.fromItems(ItemInit.RUBY.get());
        }),

        SAPPHIRE(RandomMod2.MOD_ID + ":sapphire", 16, new int[] {4,7,9,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,4.0f,()->
        {
            return Ingredient.fromItems(ItemInit.SAPPHIRE.get());
        }),

        RUBYSAPPHIRE(RandomMod2.MOD_ID + ":ruby_sapphire", 20, new int[] {5,8,10,5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,5.0f,()->
        {
            return Ingredient.fromItems(ItemInit.RUBY_SAPPHIRE_GEM.get());
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
