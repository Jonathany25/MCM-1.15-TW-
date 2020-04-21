package com.jonathany.randommod2.objects.blocks;

import com.jonathany.randommod2.init.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.Properties;

public class BlockQuarry extends Block
{
    public BlockQuarry(Properties properties)
    {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world)
    {
       return ModTileEntityTypes.QUARRY.get().create();
    }
}
