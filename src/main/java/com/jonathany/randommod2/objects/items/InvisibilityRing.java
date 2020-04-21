package com.jonathany.randommod2.objects.items;

import com.jonathany.randommod2.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class InvisibilityRing extends Item
{
    public InvisibilityRing(Properties properties)
    {
        super(properties);
    }

    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        if (KeyboardHelper.isHoldingShift())
        {
            tooltip.add(new StringTextComponent("\u00A76" + "Right Click " + "\u00A79" + "for invisibility"));
        }
        else
        {
            tooltip.add(new StringTextComponent("\u00A7f" + "Hold" + "\u00A73" + " Shift " + "\u00A7f" +"for more informantion"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        boolean Invis = playerIn.getActivePotionEffect(Effects.INVISIBILITY) != null;

        if (!Invis)
        {
            playerIn.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 20*60*99999, 255));
        }
        else if (Invis)
        {
            playerIn.removePotionEffect(Effects.INVISIBILITY);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
