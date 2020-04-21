package com.jonathany.randommod2.util.helpers;

import com.jonathany.randommod2.tileentity.QuarryTileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class NBTHELPER
{
    public static CompoundNBT toNBT(Object o)
    {
        if(o instanceof ItemStack)
        {
            return writeItemStack((ItemStack)o);
        }

        if(o instanceof QuarryTileEntity)
        {
            return writeQuarry((QuarryTileEntity)o);
        }
        return null;
    }
    private static CompoundNBT writeQuarry(QuarryTileEntity o)
    {
        CompoundNBT compoundNBT=new CompoundNBT();
        compoundNBT.putInt("x",o.x);
        compoundNBT.putInt("y",o.y);
        compoundNBT.putInt("z",o.z);
        return compoundNBT;
    }

    private static CompoundNBT writeItemStack(ItemStack i)
    {
        CompoundNBT nbt = new CompoundNBT();
        nbt.putInt("count",i.getCount());
        nbt.putString("item",i.getItem().getRegistryName().toString());
        return nbt;
    }


    @Nullable
    public static Object fromNBT(@Nonnull CompoundNBT compound) {
        switch (compound.getByte("type")) {
            case 0:
                return readItemStack(compound);
            default:
                return null;
        }
    }

    private static ItemStack readItemStack(CompoundNBT compound) {
        Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(compound.getString("item")));
        int count = compound.getInt("count");
        return new ItemStack(item, count);
    }
}
