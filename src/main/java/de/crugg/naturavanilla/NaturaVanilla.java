package de.crugg.naturavanilla;

import de.crugg.naturavanilla.registry.NaturaBlocks;
import de.crugg.naturavanilla.registry.NaturaItems;
import net.fabricmc.api.ModInitializer;

public class NaturaVanilla implements ModInitializer {

    public static final String MOD_ID = "natura";

    @Override
    public void onInitialize() {
        // Register Items
        NaturaItems.registerItems();
        // Register Blocks
        NaturaBlocks.registerBlocks();
    }
}
