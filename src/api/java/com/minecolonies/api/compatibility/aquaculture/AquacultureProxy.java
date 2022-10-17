package com.minecolonies.api.compatibility.aquaculture;

import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class AquacultureProxy {
    public boolean isAquaculturePresent()
    {
        return false;
    }

    public List<ResourceLocation> getWaterFishingLoot()
    {
        return null;
    }

    public List<ResourceLocation> getLavaFishingLoot()
    {
        return null;
    }

    public List<ResourceLocation> getGenericFishingLoot()
    {
        return null;
    }

    public List<ResourceLocation> getNetherFishingLoot()
    {
        return null;
    }
}
