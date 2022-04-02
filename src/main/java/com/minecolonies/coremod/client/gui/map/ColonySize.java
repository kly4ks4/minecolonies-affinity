package com.minecolonies.coremod.client.gui.map;

import com.ldtteam.blockout.Loader;
import com.ldtteam.blockout.Pane;
import com.ldtteam.blockout.controls.Text;
import com.ldtteam.blockout.views.View;
import com.minecolonies.coremod.network.messages.client.colony.ColonyListMessage;
import net.minecraft.util.text.StringTextComponent;

/**
 * Represents a colony by size, returns the used image corresponding for each size.
 */
public enum ColonySize
{
    SMALL("minecolonies:gui/map/colonysmall.xml", 25),
    MEDIUM("minecolonies:gui/map/colonymedium.xml", 75),
    LARGE("minecolonies:gui/map/colonylarge.xml", 5000);

    private final String imagePath;
    private final int    maxCitizens;

    ColonySize(final String imagePath, final int maxCitizens)
    {
        this.imagePath = imagePath;
        this.maxCitizens = maxCitizens;
    }

    public static View createViewForInfo(final ColonyListMessage.ColonyInfo colony)
    {
        final View colonyPane = new View();

        final ColonySize size = getSizeByCount(colony.getCitizencount());

        Loader.createFromXMLFile(size.imagePath, colonyPane);

        final Pane background = colonyPane.findPaneByID("background");
        colonyPane.setSize(background.getWidth(), background.getHeight());

        final Text colonyName = colonyPane.findPaneOfTypeByID("textcontent", Text.class);
        colonyName.setText(new StringTextComponent(colony.getName()));

        return colonyPane;
    }

    public static ColonySize getSizeByCount(final int count)
    {
        for (ColonySize size : values())
        {
            if (count < size.maxCitizens)
            {
                return size;
            }
        }
        return SMALL;
    }
}