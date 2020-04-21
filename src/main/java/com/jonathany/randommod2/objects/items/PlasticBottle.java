package com.jonathany.randommod2.objects.items;

import com.jonathany.randommod2.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class PlasticBottle extends Item
{
    public PlasticBottle(Properties properties)
    {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        if (KeyboardHelper.isHoldingShift())
        {
            tooltip.add(new StringTextComponent("\u00A76" + "Burn Time: " + "\u00A79" + "600 ticks"));
        }
        else
        {
            tooltip.add(new StringTextComponent("\u00A7f" + "Hold" + "\u00A73" + " Shift " + "\u00A7f" +"for more informantion"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public int getBurnTime(ItemStack itemStack)
    {
        return 600;
    }
}
