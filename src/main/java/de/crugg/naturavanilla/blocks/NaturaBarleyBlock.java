package de.crugg.naturavanilla.blocks;

import de.crugg.naturavanilla.registry.NaturaItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class NaturaBarleyBlock extends CropBlock {
    public NaturaBarleyBlock(Settings settings) {
        super(settings);
    }

    public int getMaxAge() {
        return 3;
    }

    @Environment(EnvType.CLIENT)
    protected ItemConvertible getSeedsItem() {
        return NaturaItems.BARLEY_SEEDS;
    }
}
