package com.minecolonies.api.compatibility.aquaculture;

import com.teammetallurgy.aquaculture.init.AquaLootTables;

import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class AquacultureCompat extends AquacultureProxy {
    @Override
    public boolean isAquaculturePresent()
    {
        return true;
    }

    @Override
    public List<ResourceLocation> getGenericFishingLoot()
    {
        List<ResourceLocation> lootTables = new ArrayList<>();

        lootTables.add(AquaLootTables.BOX);
        lootTables.add(AquaLootTables.LOCKBOX);
        lootTables.add(AquaLootTables.TREASURE_CHEST);
        lootTables.add(AquaLootTables.NEPTUNES_BOUNTY);

        return lootTables;
    }

    @Override
    public List<ResourceLocation> getWaterFishingLoot()
    {
        List<ResourceLocation> lootTables = new ArrayList<>();

        lootTables.add(AquaLootTables.FISH);
        lootTables.add(AquaLootTables.JUNK);
        lootTables.add(AquaLootTables.NEPTUNIUM);

        return lootTables;
    }

    @Override
    public List<ResourceLocation> getLavaFishingLoot()
    {
        List<ResourceLocation> lootTables = new ArrayList<>();

        lootTables.add(AquaLootTables.LAVA_FISHING);
        lootTables.add(AquaLootTables.LAVA_FISH);
        lootTables.add(AquaLootTables.LAVA_JUNK);
        lootTables.add(AquaLootTables.LAVA_TREASURE);

        return lootTables;
    }

    @Override
    public List<ResourceLocation> getNetherFishingLoot()
    {
        List<ResourceLocation> lootTables = new ArrayList<>();

        lootTables.add(AquaLootTables.NETHER_FISHING);
        lootTables.add(AquaLootTables.NETHER_FISH);
        lootTables.add(AquaLootTables.NETHER_JUNK);
        lootTables.add(AquaLootTables.NETHER_TREASURE);

        return lootTables;
    }
}
