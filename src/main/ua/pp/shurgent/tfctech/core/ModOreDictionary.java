package ua.pp.shurgent.tfctech.core;

import org.apache.commons.lang3.text.WordUtils;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ua.pp.shurgent.tfctech.TFCTech;

import com.bioxx.tfc.Items.ItemDyeCustom;
import com.bioxx.tfc.api.TFCItems;

public class ModOreDictionary {

	public static void initialise()
	{
		TFCTech.LOG.info("Registering Ore Dictionary");
		
		registerOreDict();
		
		TFCTech.LOG.info("Done Registering Ore Dictionary");
	}
	
	public static void registerOreDict() {
		
		final int WILD = OreDictionary.WILDCARD_VALUE;

		// Ores
		OreDictionary.registerOre("oreNormalBauxite", new ItemStack(ModItems.oreChunk, 1, 0));
		OreDictionary.registerOre("oreSmallBauxite", new ItemStack(ModItems.smallOreChunk, 1, 0));
		OreDictionary.registerOre("oreRichBauxite", new ItemStack(ModItems.oreChunk, 1, 1));
		OreDictionary.registerOre("orePoorBauxite", new ItemStack(ModItems.oreChunk, 1, 2));

		// Ingots
		OreDictionary.registerOre("ingotAluminum", new ItemStack(ModItems.aluminumIngot, 1, WILD));
		OreDictionary.registerOre("ingotElectrum", new ItemStack(ModItems.electrumIngot, 1, WILD));
		OreDictionary.registerOre("ingotConstantan", new ItemStack(ModItems.constantanIngot, 1, WILD));
		OreDictionary.registerOre("ingotCupronickel", new ItemStack(ModItems.constantanIngot, 1, WILD));
		OreDictionary.registerOre("ingotInvar", new ItemStack(ModItems.invarIngot, 1, WILD));
		OreDictionary.registerOre("ingotRedAlloy", new ItemStack(ModItems.redAlloyIngot, 1, WILD));

		/**
		 * Chisel hardness
		 */
		String n;
		// HARD
		n = "itemChiselHard";
		OreDictionary.registerOre(n, new ItemStack(TFCItems.blueSteelChisel, 1, WILD));
		OreDictionary.registerOre(n, new ItemStack(TFCItems.redSteelChisel, 1, WILD));
		
		// MEDIUM
		n = "itemChiselMedium";
		OreDictionary.registerOre(n, new ItemStack(TFCItems.blueSteelChisel, 1, WILD));
		OreDictionary.registerOre(n, new ItemStack(TFCItems.redSteelChisel, 1, WILD));
		OreDictionary.registerOre(n, new ItemStack(TFCItems.blackSteelChisel, 1, WILD));
		OreDictionary.registerOre(n, new ItemStack(TFCItems.steelChisel, 1, WILD));
		
		// NORMAL
		n = "itemChiselNormal";
		OreDictionary.registerOre(n, new ItemStack(TFCItems.blueSteelChisel, 1, WILD));
		OreDictionary.registerOre(n, new ItemStack(TFCItems.redSteelChisel, 1, WILD));
		OreDictionary.registerOre(n, new ItemStack(TFCItems.blackSteelChisel, 1, WILD));
		OreDictionary.registerOre(n, new ItemStack(TFCItems.steelChisel, 1, WILD));
		OreDictionary.registerOre(n, new ItemStack(TFCItems.wroughtIronChisel, 1, WILD));
		
		// == INTEGRATION =====================================================
		
		/**
		 * Gears
		 */
		OreDictionary.registerOre("gearBismuthBronze", new ItemStack(ModItems.bismuthBronzeGear, 1, WILD));
		OreDictionary.registerOre("gearBlackBronze", new ItemStack(ModItems.blackBronzeGear, 1, WILD));
		OreDictionary.registerOre("gearBlueSteel", new ItemStack(ModItems.blueSteelGear, 1, WILD));
		OreDictionary.registerOre("gearBrass", new ItemStack(ModItems.brassGear, 1, WILD));
		OreDictionary.registerOre("gearBronze", new ItemStack(ModItems.bronzeGear, 1, WILD));
		OreDictionary.registerOre("gearCopper", new ItemStack(ModItems.copperGear, 1, WILD));
		OreDictionary.registerOre("gearGold", new ItemStack(ModItems.goldGear, 1, WILD));
		OreDictionary.registerOre("gearWroughtIron", new ItemStack(ModItems.wroughtIronGear, 1, WILD));
		OreDictionary.registerOre("gearSteel", new ItemStack(ModItems.steelGear, 1, WILD));
		OreDictionary.registerOre("gearTin", new ItemStack(ModItems.tinGear, 1, WILD));
		
		OreDictionary.registerOre("gearAnyBronze", new ItemStack(ModItems.bronzeGear, 1, WILD));
		OreDictionary.registerOre("gearAnyBronze", new ItemStack(ModItems.bismuthBronzeGear, 1, WILD));
		OreDictionary.registerOre("gearAnyBronze", new ItemStack(ModItems.blackBronzeGear, 1, WILD));
		OreDictionary.registerOre("gearIron", new ItemStack(ModItems.wroughtIronGear, 1, WILD));
		
		OreDictionary.registerOre("gemQuartz", new ItemStack(ModItems.gemQuartz, 1, WILD));
		OreDictionary.registerOre("dustChalk", new ItemStack(ModItems.chalkPowder, 1, WILD));
		OreDictionary.registerOre("itemRubber", new ItemStack(ModItems.rubber, 1, WILD));
		OreDictionary.registerOre("materialRubber", new ItemStack(ModItems.rubber, 1, WILD));
		OreDictionary.registerOre("materialGlue", new ItemStack(ModItems.glue, 1, WILD));
		OreDictionary.registerOre("materialPaper", new ItemStack(Items.paper, 1, WILD)); // Add Vanilla paper to OreDictionary as material
		
		for (int i = 0; i < ItemDyeCustom.DYE_COLOR_NAMES.length; i++) {
			OreDictionary.registerOre("dye" + WordUtils.capitalize(ItemDyeCustom.DYE_COLOR_NAMES[i]), new ItemStack(ModItems.limePaint, 1, i));
		}

		OreDictionary.registerOre("plateCeramic", new ItemStack(ModItems.potteryCeramicPlate, 1, 1));
	}
	
}
