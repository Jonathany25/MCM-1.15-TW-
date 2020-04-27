package com.jonathany.randommod2.init;

import com.jonathany.randommod2.RandomMod2;
import com.jonathany.randommod2.tileentity.LindsayChestTileEntity;
import com.jonathany.randommod2.tileentity.QuarryTileEntity;
import com.jonathany.randommod2.tileentity.RapaelChestTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes
{
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, RandomMod2.MOD_ID);

    public static final RegistryObject<TileEntityType<QuarryTileEntity>> QUARRY = TILE_ENTITY_TYPES.register("quarry",() -> TileEntityType.Builder.create(QuarryTileEntity::new, BlockInit.QUARRY.get()).build(null));
    public static final RegistryObject<TileEntityType<RapaelChestTileEntity>> RAPAEL_CHEST = TILE_ENTITY_TYPES.register("rapael_chest", ()-> TileEntityType.Builder.create(RapaelChestTileEntity::new, BlockInit.RAPAEL_CHEST.get()).build(null));
    public static final RegistryObject<TileEntityType<LindsayChestTileEntity>> LINDSAY_CHEST = TILE_ENTITY_TYPES.register("lindsay_chest", ()-> TileEntityType.Builder.create(LindsayChestTileEntity::new, BlockInit.LINDSAY_CHEST.get()).build(null));
}
