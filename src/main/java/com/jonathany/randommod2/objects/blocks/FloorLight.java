package com.jonathany.randommod2.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class FloorLight extends Block
{
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(5, 0.1, 2, 11, 0.9, 3),
            Block.makeCuboidShape(4, 0.1, 3, 12, 0.9, 4),
            Block.makeCuboidShape(3, 0.1, 4, 13, 0.9, 6),
            Block.makeCuboidShape(4, 0.1, 5, 12, 0.9, 6),
            Block.makeCuboidShape(6, 0.1, 6, 10, 0.9, 15),
            Block.makeCuboidShape(6, 0.1, 7, 10, 0.9, 16),
            Block.makeCuboidShape(6, 0.1, 1, 10, 0.9, 2),
            Block.makeCuboidShape(7, 0.1, 0, 9, 0.9, 1),
            Block.makeCuboidShape(6, 0, 2, 10, 1, 3),
            Block.makeCuboidShape(5, 0, 3, 11, 1, 4),
            Block.makeCuboidShape(4, 0, 4, 12, 1, 5),
            Block.makeCuboidShape(7, 0, 1, 9, 1, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(2, 0.1, 5, 3, 0.9, 11),
            Block.makeCuboidShape(3, 0.1, 4, 4, 0.9, 12),
            Block.makeCuboidShape(4, 0.1, 3, 6, 0.9, 13),
            Block.makeCuboidShape(5, 0.1, 4, 6, 0.9, 12),
            Block.makeCuboidShape(6, 0.1, 6, 15, 0.9, 10),
            Block.makeCuboidShape(7, 0.1, 6, 16, 0.9, 10),
            Block.makeCuboidShape(1, 0.1, 6, 2, 0.9, 10),
            Block.makeCuboidShape(0, 0.1, 7, 1, 0.9, 9),
            Block.makeCuboidShape(2, 0, 6, 3, 1, 10),
            Block.makeCuboidShape(3, 0, 5, 4, 1, 11),
            Block.makeCuboidShape(4, 0, 4, 5, 1, 12),
            Block.makeCuboidShape(1, 0, 7, 15, 1, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_S =Stream.of(
            Block.makeCuboidShape(5, 0.1, 13, 11, 0.9, 14),
            Block.makeCuboidShape(4, 0.1, 12, 12, 0.9, 13),
            Block.makeCuboidShape(3, 0.1, 10, 13, 0.9, 12),
            Block.makeCuboidShape(4, 0.1, 10, 12, 0.9, 11),
            Block.makeCuboidShape(6, 0.1, 1, 10, 0.9, 10),
            Block.makeCuboidShape(6, 0.1, 0, 10, 0.9, 9),
            Block.makeCuboidShape(6, 0.1, 14, 10, 0.9, 15),
            Block.makeCuboidShape(7, 0.1, 15, 9, 0.9, 16),
            Block.makeCuboidShape(6, 0, 13, 10, 1, 14),
            Block.makeCuboidShape(5, 0, 12, 11, 1, 13),
            Block.makeCuboidShape(4, 0, 11, 12, 1, 12),
            Block.makeCuboidShape(7, 0, 1, 9, 1, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E =Stream.of(
            Block.makeCuboidShape(13, 0.1, 5, 14, 0.9, 11),
            Block.makeCuboidShape(12, 0.1, 4, 13, 0.9, 12),
            Block.makeCuboidShape(10, 0.1, 3, 12, 0.9, 13),
            Block.makeCuboidShape(10, 0.1, 4, 11, 0.9, 12),
            Block.makeCuboidShape(1, 0.1, 6, 10, 0.9, 10),
            Block.makeCuboidShape(0, 0.1, 6, 9, 0.9, 10),
            Block.makeCuboidShape(14, 0.1, 6, 15, 0.9, 10),
            Block.makeCuboidShape(15, 0.1, 7, 16, 0.9, 9),
            Block.makeCuboidShape(13, 0, 6, 14, 1, 10),
            Block.makeCuboidShape(12, 0, 5, 13, 1, 11),
            Block.makeCuboidShape(11, 0, 4, 12, 1, 12),
            Block.makeCuboidShape(1, 0, 7, 15, 1, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    public FloorLight(Properties properties)
    {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        switch (state.get(FACING))
        {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.with(FACING,rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.rotate((mirrorIn.toRotation(state.get(FACING))));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        if(!worldIn.isRemote())
        {
            ServerWorld serverWorld = (ServerWorld)worldIn;
            LightningBoltEntity entity = new LightningBoltEntity(worldIn, pos.getX(),pos.getY(),pos.getZ(), false);
            serverWorld.addLightningBolt(entity);
        }
        return ActionResultType.SUCCESS;
    }
}

