package com.rr.mccourse.item;

import com.rr.mccourse.RRMCCourseMod;
import com.rr.mccourse.util.Registration;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModItems {



    public static final RegistryObject<Item> COPPER_INGOT =
            Registration.ITEMS.register("copper_ingot",
                    () -> new Item(new Item.Properties().tab(RRMCCourseMod.RRMcCOURSE_TAB)));

    public static final RegistryObject<Item> COPPER_WIRE =
            Registration.ITEMS.register("copper_wire",
                    () -> new Item(new Item.Properties().tab(RRMCCourseMod.RRMcCOURSE_TAB)));

    public static final RegistryObject<Item> COPPERED_APPLE =
            Registration.ITEMS.register("coppered_apple",
                    () -> new CopperedApple());

    public static void register() { }
}
