package com.github.relativobr.supremeexpansion.generators;

import com.github.relativobr.supremeexpansion.core.SupremeCoreAlloy;
import com.github.relativobr.supremeexpansion.magical.SupremeCetrus;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import com.github.relativobr.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeGenerator {

  // BASIC TIER
  public static final int BASIC_IGNIS_ENERGY = 2500;
  public static final int BASIC_IGNIS_BUFFER = 5000;
  public static final int BASIC_VENTUS_ENERGY = 2500;
  public static final int BASIC_VENTUS_BUFFER = 5000;
  public static final int BASIC_AQUA_ENERGY = 2500;
  public static final int BASIC_AQUA_BUFFER = 5000;
  public static final int BASIC_LUX_ENERGY = 2500;
  public static final int BASIC_LUX_BUFFER = 5000;
  public static final int BASIC_LUMIUM_ENERGY = 5000;
  public static final int BASIC_LUMIUM_BUFFER = 10000;
  // ADVANCED TIER
  public static final int IGNIS_ENERGY = 25000;
  public static final int IGNIS_BUFFER = 50000;
  public static final int VENTUS_ENERGY = 25000;
  public static final int VENTUS_BUFFER = 50000;
  public static final int AQUA_ENERGY = 25000;
  public static final int AQUA_BUFFER = 50000;
  public static final int LUX_ENERGY = 25000;
  public static final int LUX_BUFFER = 50000;
  public static final int LUMIUM_ENERGY = 75000;
  public static final int LUMIUM_BUFFER = 500000;
  // END_GAME TIER
  public static final int THORNIUM_ENERGY = 1000000; //  (IGNIS + AQUA + VENTUS)
  public static final int THORNIUM_BUFFER = 6000000;
  public static final int SUPREME_ENERGY = 2000000; //  (LUX + LUMIUM + THORNIUM)
  public static final int SUPREME_BUFFER = 12000000;

  public static final SlimefunItemStack BASIC_IGNIS_GENERATOR =
      new SlimefunItemStack(
          "BASIC_IGNIS_GENERATOR",
          Material.ORANGE_CONCRETE,
          "&9Basic Ignis Generator",
          "&fNeed fire under this block to work",
          "",
          "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(BASIC_IGNIS_BUFFER),
          UtilEnergy.energyPowerPerSecond(BASIC_IGNIS_ENERGY));

  public static final ItemStack[] MACHINE_BASIC_IGNIS_GENERATOR =
      new ItemStack[] {
        SupremeComponents.ALLOY_AURUM, SupremeCoreAlloy.RESOURCE_CORE_REDSTONE,
            SupremeComponents.ALLOY_AURUM,
        SupremeComponents.INDUCTIVE_MACHINE, SlimefunItems.COAL_GENERATOR_2,
            SupremeComponents.INDUCTIVE_MACHINE,
        SupremeComponents.CARRIAGE_MACHINE, SlimefunItems.STAFF_FIRE,
            SupremeComponents.CARRIAGE_MACHINE
      };

  //IGNIS GENERATOR
  public static final SlimefunItemStack IGNIS_GENERATOR =
      new SlimefunItemStack(
          "IGNIS_GENERATOR",
          Material.ORANGE_GLAZED_TERRACOTTA,
          "&9Ignis Generator",
          "&fNeed fire under this block to work",
          "",
          "",
          LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(IGNIS_BUFFER),
          UtilEnergy.energyPowerPerSecond(IGNIS_ENERGY));

  public static final ItemStack[] MACHINE_IGNIS_GENERATOR =
      new ItemStack[] {
        SupremeComponents.AURUM_PLATE, SupremeCetrus.CETRUS_IGNIS, SupremeComponents.AURUM_PLATE,
        SupremeComponents.INDUCTOR_MACHINE, new SlimefunItemStack(SlimefunItems.COAL_GENERATOR_2, 16),
            SupremeComponents.INDUCTOR_MACHINE,
        SupremeComponents.CONVEYANCE_MACHINE, SlimefunItems.STAFF_FIRE,
            SupremeComponents.CONVEYANCE_MACHINE
      };

  public static final SlimefunItemStack BASIC_VENTUS_GENERATOR =
      new SlimefunItemStack(
          "BASIC_VENTUS_GENERATOR",
          Material.LIGHT_BLUE_CONCRETE,
          "&9Basic Ventus Generator",
          "&fIt needs to be with its faces",
          "&fin the wind to work",
          "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(BASIC_VENTUS_BUFFER),
          UtilEnergy.energyPowerPerSecond(BASIC_VENTUS_ENERGY));

  public static final ItemStack[] MACHINE_BASIC_VENTUS_GENERATOR =
      new ItemStack[] {
        SupremeComponents.ALLOY_IRIDIUM, SupremeCoreAlloy.RESOURCE_CORE_LAPIS,
            SupremeComponents.ALLOY_IRIDIUM,
        SupremeComponents.INDUCTIVE_MACHINE, SlimefunItems.BIO_REACTOR,
            SupremeComponents.INDUCTIVE_MACHINE,
        SupremeComponents.CARRIAGE_MACHINE, SlimefunItems.STAFF_WIND,
            SupremeComponents.CARRIAGE_MACHINE
      };

  // VENTUS GENERATOR
  public static final SlimefunItemStack VENTUS_GENERATOR =
      new SlimefunItemStack(
          "VENTUS_GENERATOR",
          Material.LIGHT_BLUE_GLAZED_TERRACOTTA,
          "&9Ventus Generator",
          "&fIt needs to be with its faces",
          "&fin the wind to work",
          "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(VENTUS_BUFFER),
          UtilEnergy.energyPowerPerSecond(VENTUS_ENERGY));

  public static final ItemStack[] MACHINE_VENTUS_GENERATOR =
      new ItemStack[] {
        SupremeComponents.IRIDIUM_PLATE, SupremeCetrus.CETRUS_VENTUS,
            SupremeComponents.IRIDIUM_PLATE,
        SupremeComponents.INDUCTOR_MACHINE, new SlimefunItemStack(SlimefunItems.BIO_REACTOR, 16),
            SupremeComponents.INDUCTOR_MACHINE,
        SupremeComponents.CONVEYANCE_MACHINE, SlimefunItems.STAFF_WIND,
            SupremeComponents.CONVEYANCE_MACHINE
      };

  public static final SlimefunItemStack BASIC_AQUA_GENERATOR =
      new SlimefunItemStack(
          "BASIC_AQUA_GENERATOR",
          Material.BLUE_CONCRETE,
          "&9Basic Aqua Generator",
          "&fNeed water under this block to work",
          "",
          "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(BASIC_AQUA_BUFFER),
          UtilEnergy.energyPowerPerSecond(BASIC_AQUA_ENERGY));

  public static final ItemStack[] MACHINE_BASIC_AQUA_GENERATOR =
      new ItemStack[] {
        SupremeComponents.ALLOY_MANGANESE, SupremeCoreAlloy.RESOURCE_CORE_DIAMOND,
            SupremeComponents.ALLOY_MANGANESE,
        SupremeComponents.INDUCTIVE_MACHINE, SlimefunItems.MAGNESIUM_GENERATOR,
            SupremeComponents.INDUCTIVE_MACHINE,
        SupremeComponents.CARRIAGE_MACHINE, SlimefunItems.STAFF_WATER,
            SupremeComponents.CARRIAGE_MACHINE
      };

  // AQUA GENERATOR
  public static final SlimefunItemStack AQUA_GENERATOR =
      new SlimefunItemStack(
          "AQUA_GENERATOR",
          Material.BLUE_GLAZED_TERRACOTTA,
          "&9Aqua Generator",
          "&fNeed water under this block to work",
          "",
          "",
          LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(AQUA_BUFFER),
          UtilEnergy.energyPowerPerSecond(AQUA_ENERGY));

  public static final ItemStack[] MACHINE_AQUA_GENERATOR =
          new ItemStack[] {
                  SupremeComponents.MANGANESE_PLATE, SupremeCetrus.CETRUS_AQUA,
                  SupremeComponents.MANGANESE_PLATE,
                  SupremeComponents.INDUCTOR_MACHINE, new SlimefunItemStack(SlimefunItems.MAGNESIUM_GENERATOR, 16),
                  SupremeComponents.INDUCTOR_MACHINE,
                  SupremeComponents.CONVEYANCE_MACHINE, SlimefunItems.STAFF_WATER,
                  SupremeComponents.CONVEYANCE_MACHINE
          };



  public static final SlimefunItemStack BASIC_LUX_GENERATOR =
      new SlimefunItemStack(
          "BASIC_LUX_GENERATOR",
          Material.WHITE_CONCRETE,
          "&9Basic Lux Generator",
          "&fNeeds to receive sunlight",
          "&for moonlight to work",
          "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(BASIC_LUX_BUFFER),
          UtilEnergy.energyPowerPerSecond(BASIC_LUX_ENERGY));

  public static final ItemStack[] MACHINE_BASIC_LUX_GENERATOR =
          new ItemStack[] {
                  SupremeComponents.ALLOY_TITANIUM, SupremeCoreAlloy.RESOURCE_CORE_QUARTZ,
                  SupremeComponents.TITANIUM_PLATE,
                  SupremeComponents.INDUCTIVE_MACHINE, SlimefunItems.SOLAR_GENERATOR_4,
                  SupremeComponents.INDUCTIVE_MACHINE,
                  SupremeComponents.CARRIAGE_MACHINE, SlimefunItems.STAFF_STORM,
                  SupremeComponents.CARRIAGE_MACHINE
          };

  // LUX GENERATOR
  public static final SlimefunItemStack LUX_GENERATOR =
          new SlimefunItemStack(
                  "LUX_GENERATOR",
                  Material.WHITE_GLAZED_TERRACOTTA,
                  "&9Lux Generator",
                  "&fNeeds to receive sunlight",
                  "&for moonlight to work",
                  "",
                  LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
                  UtilEnergy.energyBuffer(LUX_BUFFER),
                  UtilEnergy.energyPowerPerSecond(LUX_ENERGY));
  public static final ItemStack[] MACHINE_LUX_GENERATOR =
      new ItemStack[] {
        SupremeComponents.TITANIUM_PLATE, SupremeCetrus.CETRUS_LUX,
            SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.INDUCTOR_MACHINE, new SlimefunItemStack(SlimefunItems.SOLAR_GENERATOR_4, 16), SupremeComponents.INDUCTOR_MACHINE,
        SupremeComponents.CONVEYANCE_MACHINE, SlimefunItems.STAFF_STORM,
            SupremeComponents.CONVEYANCE_MACHINE
      };


  public static final SlimefunItemStack BASIC_LUMIUM_GENERATOR =
      new SlimefunItemStack(
          "BASIC_LUMIUM_GENERATOR",
          Material.BROWN_CONCRETE,
          "&9Basic Lumium Generator",
          "&fNeeds to be below ground to work",
          "",
          "",
          LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(BASIC_LUMIUM_BUFFER),
          UtilEnergy.energyPowerPerSecond(BASIC_LUMIUM_ENERGY));

  public static final ItemStack[] MACHINE_BASIC_LUMIUM_GENERATOR =
      new ItemStack[] {
        SupremeComponents.ALLOY_ADAMANTIUM, SupremeCoreAlloy.RESOURCE_CORE_NETHERITE,
            SupremeComponents.ALLOY_ADAMANTIUM,
        SupremeComponents.INDUCTIVE_MACHINE, new SlimefunItemStack(SlimefunItems.LAVA_GENERATOR_2, 16),
            SupremeComponents.INDUCTIVE_MACHINE,
        SupremeComponents.PETRIFIER_MACHINE, SlimefunItems.GEO_MINER,
            SupremeComponents.PETRIFIER_MACHINE
      };

  // LUMIUM GENERATOR
  public static final SlimefunItemStack LUMIUM_GENERATOR =
      new SlimefunItemStack(
          "LUMIUM_GENERATOR",
          Material.BROWN_GLAZED_TERRACOTTA,
          "&9Lumium Generator",
          "&fNeeds to be below ground to work",
          "",
          "",
          LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(LUMIUM_BUFFER),
          UtilEnergy.energyPowerPerSecond(LUMIUM_ENERGY));
  public static final ItemStack[] MACHINE_LUMIUM_GENERATOR =
          new ItemStack[] {
                  SupremeComponents.ADAMANTIUM_PLATE, SupremeCetrus.CETRUS_LUMIUM,
                  SupremeComponents.ADAMANTIUM_PLATE,
                  SupremeComponents.INDUCTOR_MACHINE, new SlimefunItemStack(SlimefunItems.LAVA_GENERATOR_2, 16),
                  SupremeComponents.INDUCTOR_MACHINE,
                  SupremeComponents.CRYSTALLIZER_MACHINE, SlimefunItems.GEO_MINER,
                  SupremeComponents.CRYSTALLIZER_MACHINE
          };

  // THORIUM GENERATOR
  public static final SlimefunItemStack THORNIUM_GENERATOR =
      new SlimefunItemStack(
          "THORNIUM_GENERATOR",
          Material.BLACK_GLAZED_TERRACOTTA,
          "&9Thornium Generator",
          "&fGenerates energy anywhere",
          "",
          "",
          LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(THORNIUM_BUFFER),
          UtilEnergy.energyPowerPerSecond(THORNIUM_ENERGY));
  public static final ItemStack[] MACHINE_THORNIUM_GENERATOR =
          new ItemStack[] {
                  SupremeComponents.THORNIUM_ENERGIZED, IGNIS_GENERATOR, SupremeComponents.THORNIUM_ENERGIZED,
                  SupremeComponents.THORNIUM_ENERGIZED, AQUA_GENERATOR, SupremeComponents.THORNIUM_ENERGIZED,
                  SupremeComponents.CRYSTALLIZER_MACHINE, VENTUS_GENERATOR,
                  SupremeComponents.CRYSTALLIZER_MACHINE
          };

// SUPREME GENERATOR
  public static final SlimefunItemStack SUPREME_GENERATOR =
      new SlimefunItemStack(
          "SUPREME_GENERATOR",
          Material.PURPLE_GLAZED_TERRACOTTA,
          "&9Supreme Generator",
          "&fGenerates energy anywhere",
          "",
          "",
          LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
          UtilEnergy.energyBuffer(SUPREME_BUFFER),
          UtilEnergy.energyPowerPerSecond(SUPREME_ENERGY));
  public static final ItemStack[] MACHINE_SUPREME_GENERATOR =
          new ItemStack[] {
                  SupremeComponents.SUPREME, LUX_GENERATOR, SupremeComponents.SUPREME,
                  SupremeComponents.SUPREME, LUMIUM_GENERATOR, SupremeComponents.SUPREME,
                  SupremeComponents.CRYSTALLIZER_MACHINE, THORNIUM_GENERATOR,
                  SupremeComponents.CRYSTALLIZER_MACHINE
          };
}
