package com.rr.mccourse.block;
import com.rr.mccourse.RRMCCourseMod;
import com.rr.mccourse.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final RegistryObject<Block> COPPER_BLOCK = register("copper_block",
            ()-> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3f, 10f).sound(SoundType.METAL)));

    public static void register() { }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(RRMCCourseMod.RRMcCOURSE_TAB)));
        return toReturn;
    }
}
