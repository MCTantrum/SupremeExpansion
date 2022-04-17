package br.com.ohanacraft.supremeexpansion.gear.thornium;

import br.com.ohanacraft.supremeexpansion.magical.Cetrus;
import br.com.ohanacraft.supremeexpansion.resource.Components;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Leggings {

    public static final SlimefunItemStack THORNIUM_LEGGINGS = new SlimefunItemStack("ARMOR_THORNIUM_LEGGINGS",
            Material.NETHERITE_LEGGINGS, "&f&lThornium Leggings", "&f&lA leggings of Thornium");
    public static final ItemStack[] RECIPE_THORNIUM_LEGGINGS = {
            Cetrus.CETRUS_VENTUS, Components.THORNIUM_INGOT, Cetrus.CETRUS_VENTUS,
            Components.THORNIUM_INGOT,    null,   Components.THORNIUM_INGOT,
            Components.THORNIUM_INGOT,    null,   Components.THORNIUM_INGOT
    };

    public static final SlimefunItemStack THORNIUM_LEGGINGS_MAGIC = new SlimefunItemStack("ARMOR_THORNIUM_LEGGINGS_MAGIC",
            Material.NETHERITE_LEGGINGS, "&a&lMagic Leggings", "&f&lA Magic leggings of Thornium");

    public static final SlimefunItemStack THORNIUM_LEGGINGS_RARE = new SlimefunItemStack("ARMOR_THORNIUM_LEGGINGS_RARE",
            Material.NETHERITE_LEGGINGS, "&b&lRare Leggings", "&f&lA Rare leggings of Thornium");

    public static final SlimefunItemStack THORNIUM_LEGGINGS_EPIC = new SlimefunItemStack("ARMOR_THORNIUM_LEGGINGS_EPIC",
            Material.NETHERITE_LEGGINGS, "&d&lEpic Leggings", "&f&lA Epic leggings of Thornium");

    public static final SlimefunItemStack THORNIUM_LEGGINGS_LEGENDARY = new SlimefunItemStack("ARMOR_THORNIUM_LEGGINGS_LEGENDARY",
            Material.NETHERITE_LEGGINGS, "&6&lLegendary Leggings", "&f&lA Legendary leggings of Thornium");

    public static final SlimefunItemStack THORNIUM_LEGGINGS_SUPREME = new SlimefunItemStack("ARMOR_THORNIUM_LEGGINGS_SUPREME",
            Material.NETHERITE_LEGGINGS, "&4&lSupreme Leggings", "&f&lA Supreme leggings of Thornium");

}
