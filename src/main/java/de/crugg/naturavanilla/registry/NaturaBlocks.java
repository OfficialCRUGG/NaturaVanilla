package de.crugg.naturavanilla.registry;

import de.crugg.naturavanilla.NaturaVanilla;
import de.crugg.naturavanilla.blocks.NaturaBarleyBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NaturaBlocks {

    public static final Block BARLEY = new NaturaBarleyBlock(
        AbstractBlock.Settings.of(Material.PLANT)
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP)
            .nonOpaque()
    );

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(NaturaVanilla.MOD_ID, "barley"), BARLEY);

        try {
            setRenderTypes();
        } catch(Error ignored) {

        }
    }

    @Environment(EnvType.CLIENT)
    public static void setRenderTypes() {
        BlockRenderLayerMap.INSTANCE.putBlock(NaturaBlocks.BARLEY, RenderLayer.getCutout());
    }
}
