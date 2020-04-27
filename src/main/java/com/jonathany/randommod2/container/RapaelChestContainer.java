package com.jonathany.randommod2.container;

import com.jonathany.randommod2.init.BlockInit;
import com.jonathany.randommod2.init.ModContainerTypes;
import com.jonathany.randommod2.tileentity.RapaelChestTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;

import java.util.Objects;

public class RapaelChestContainer extends Container
{
    public final RapaelChestTileEntity tileEntity;
    private final IWorldPosCallable canInteractWitCallable;

    public RapaelChestContainer(final int windowId, final PlayerInventory playerInventory, final RapaelChestTileEntity tileEntity)
    {
        super(ModContainerTypes.RAPAEL_CHEST.get(), windowId);
        this.tileEntity = tileEntity;
        this.canInteractWitCallable = IWorldPosCallable.of(tileEntity.getWorld(), tileEntity.getPos());

        //Main Inventory
        int startX = 8;
        int startY = 18;
        int slotSizePlus2 = 18;

        for (int row = 0; row < 6; ++row) {
            for (int column = 0; column < 9; ++column) {
                this.addSlot(new Slot(tileEntity, row * 9 + column, startX + (column * slotSizePlus2), startY + (row * slotSizePlus2)));
            }
        }

        //Main Player Inventory
        int startPlayerInvY = startY * 7 + 14;
        for (int row = 0; row < 3; ++row) {
            for (int column = 0; column < 9; ++column) {
                this.addSlot(new Slot(playerInventory, 9 + row * 9 + column, startX + (column * slotSizePlus2), startPlayerInvY + (row * slotSizePlus2)));
            }
        }

        //hotbar
        int hotbarY = startPlayerInvY + (slotSizePlus2 * 3) + 4;
        for (int column = 0; column < 9; ++column) {
            this.addSlot(new Slot(playerInventory, column, startX + (column * slotSizePlus2), hotbarY));

        }

    }

    private static RapaelChestTileEntity getTileEntity(final PlayerInventory playerInventory, final PacketBuffer data) {
        Objects.requireNonNull(playerInventory, "playerInventory cannot be null");
        Objects.requireNonNull(data, "data cannot be null");
        final TileEntity tileatPos = playerInventory.player.world.getTileEntity(data.readBlockPos());
        if (tileatPos instanceof RapaelChestTileEntity) {
            return (RapaelChestTileEntity) tileatPos;

        }
        throw new IllegalStateException("Tile Entity is not correct!" + tileatPos);
    }

    public RapaelChestContainer(final int windowId, final PlayerInventory playerInventory, final PacketBuffer data)
    {
        this(windowId, playerInventory, getTileEntity(playerInventory, data));
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn)
    {
        return isWithinUsableDistance(canInteractWitCallable,playerIn, BlockInit.RAPAEL_CHEST.get());
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index)
    {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if(slot != null && slot.getHasStack())
        {
            ItemStack itemStack1 = slot.getStack();
            itemStack = itemStack1.copy();
            if(index< 54)
            {
                if(!this.mergeItemStack(itemStack1,54, this.inventorySlots.size(), true))
                {
                    return ItemStack.EMPTY;
                }
                else  if(!this.mergeItemStack(itemStack1,0,54, false))
                {
                    return ItemStack.EMPTY;
                }
                if(itemStack1.isEmpty())
                {
                    slot.putStack(ItemStack.EMPTY);
                }
                else
                {
                    slot.onSlotChanged();
                }
            }
        }
        return itemStack;
    }
}
