package de.crugg.naturavanilla.registry;

import de.crugg.naturavanilla.NaturaVanilla;
import de.crugg.naturavanilla.utils.NaturaFoodComponents;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NaturaItems {

    // Barley Items
    public static final Item BARLEY_SEEDS = new AliasedBlockItem(
        NaturaBlocks.BARLEY,
        new Item.Settings()
            .group(ItemGroup.FOOD)
    );

    public static final Item BARLEY = new Item(
            new Item.Settings()
                .group(ItemGroup.FOOD)
    );

    public static final Item BARLEY_BREAD = new Item(
            new Item.Settings()
                    .group(ItemGroup.FOOD)
                    .food(FoodComponents.BREAD)
    );

    // Cooked Breads
    public static final Item BAKED_BARLEY_BREAD = new Item(
            new Item.Settings()
                    .group(ItemGroup.FOOD)
                    .food(NaturaFoodComponents.BAKED_BREAD)
    );

    public static final Item BAKED_BREAD = new Item(
            new Item.Settings()
                    .group(ItemGroup.FOOD)
                    .food(NaturaFoodComponents.BAKED_BREAD)
    );

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(NaturaVanilla.MOD_ID, "barley_seeds"), BARLEY_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(NaturaVanilla.MOD_ID, "barley"), BARLEY);
        Registry.register(Registry.ITEM, new Identifier(NaturaVanilla.MOD_ID, "barley_bread"), BARLEY_BREAD);
        Registry.register(Registry.ITEM, new Identifier(NaturaVanilla.MOD_ID, "baked_barley_bread"), BAKED_BARLEY_BREAD);
        Registry.register(Registry.ITEM, new Identifier(NaturaVanilla.MOD_ID, "baked_bread"), BAKED_BREAD);
    }

}
