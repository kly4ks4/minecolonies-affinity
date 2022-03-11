package com.minecolonies.coremod.blocks.huts;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

/**
 * Hut for the graveyard. No different from {@link AbstractBlockHut}
 */

public class BlockHutArcheologist extends AbstractBlockHut<BlockHutArcheologist>
{
    /**
     * tall shape.
     */
    private static final VoxelShape SHAPE = Shapes.box(0.1, 0.1, 0.1, 0.9, 1.9, 0.9);

    public BlockHutArcheologist()
    {
        //No different from Abstract parent
        super();
    }

    @NotNull
    @Override
    public VoxelShape getShape(final BlockState state, final BlockGetter worldIn, final BlockPos pos, final CollisionContext context)
    {
        return SHAPE;
    }

    @NotNull
    @Override
    public String getHutName() { return "blockhutarcheologist"; }

    @Override
    public BuildingEntry getBuildingEntry()
    {
        return ModBuildings.archeologist;
    }
}