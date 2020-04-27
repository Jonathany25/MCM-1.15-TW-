package com.jonathany.randommod2.objects.blocks;

import com.jonathany.randommod2.init.ModTileEntityTypes;
import com.jonathany.randommod2.tileentity.LindsayChestTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;

public class LindsayChestBlock extends Block
{

    public LindsayChestBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world)
    {
        return ModTileEntityTypes.LINDSAY_CHEST.get().create();
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        if(!worldIn.isRemote)
        {
            TileEntity tile = worldIn.getTileEntity(pos);
            if(tile instanceof LindsayChestTileEntity)
            {
                NetworkHooks.openGui((ServerPlayerEntity)player, (LindsayChestTileEntity)tile, pos);
                return ActionResultType.SUCCESS;
            }
        }
        return ActionResultType.FAIL;
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving)
    {
        if(state.getBlock() != newState.getBlock())
        {
            TileEntity te = worldIn.getTileEntity(pos);
            if(te instanceof LindsayChestTileEntity)
            {
                InventoryHelper.dropItems(worldIn,pos,((LindsayChestTileEntity) te).getItems());
            }
        }
    }
}
