package ua.pp.shurgent.tfctech.items;

import net.minecraft.item.ItemStack;
import ua.pp.shurgent.tfctech.TFCTech;
import ua.pp.shurgent.tfctech.core.ModItems;
import ua.pp.shurgent.tfctech.core.ModOptions;

import com.bioxx.tfc.api.HeatIndex;
import com.bioxx.tfc.api.HeatRaw;
import com.bioxx.tfc.api.HeatRegistry;
import com.bioxx.tfc.api.TFCItems;

public class ItemHeat {

	public static void setupItemHeat() {

		HeatRegistry manager = HeatRegistry.getInstance();

		HeatRaw aluminumRaw = new HeatRaw(0.25, 660);
		HeatRaw electrumRaw = new HeatRaw(0.5, 1012);
		HeatRaw constantanRaw = new HeatRaw(0.45, 1260);
		HeatRaw invarRaw = new HeatRaw(0.48, 1425);
		HeatRaw redAlloyRaw = new HeatRaw(0.25, 1870);
		
		// TFC HeatRaw
		HeatRaw bismuthRaw = new HeatRaw(0.14, 270);
		HeatRaw bismuthBronzeRaw = new HeatRaw(0.35, 985);
		HeatRaw blackBronzeRaw = new HeatRaw(0.35, 1070);
		HeatRaw blackSteelRaw = new HeatRaw(0.35, 1485);
		HeatRaw blueSteelRaw = new HeatRaw(0.35, 1540);
		HeatRaw brassRaw = new HeatRaw(0.35, 930);
		HeatRaw bronzeRaw = new HeatRaw(0.35, 950);
		HeatRaw copperRaw = new HeatRaw(0.35, 1080);
		HeatRaw goldRaw = new HeatRaw(0.6, 1060);
		HeatRaw ironRaw = new HeatRaw(0.35, 1535);
		HeatRaw leadRaw = new HeatRaw(0.22, 328);
		HeatRaw nickelRaw = new HeatRaw(0.48, 1453);
		HeatRaw pigIronRaw = new HeatRaw(0.35, 1500);
		HeatRaw platinumRaw = new HeatRaw(0.35, 1730);
		HeatRaw redSteelRaw = new HeatRaw(0.35, 1540);
		HeatRaw roseGoldRaw = new HeatRaw(0.35, 960);
		HeatRaw silverRaw = new HeatRaw(0.48, 961);
		HeatRaw steelRaw = new HeatRaw(0.35, 1540);
		HeatRaw sterlingSilverRaw = new HeatRaw(0.35, 900);
		HeatRaw tinRaw = new HeatRaw(0.14, 230);
		HeatRaw zincRaw = new HeatRaw(0.21, 420);

		// Aluminum
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumIngot,1), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumIngot2x,1), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,2,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumUnshaped,1), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));

		manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumStripe,1), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumWire,1), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedAluminumWire,1,0), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedAluminumWire,1,1), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedAluminumWire,1,2), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));
		
		if (ModOptions.cfgEnableHeatingBauxite) {
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk, 1, 0), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk, 1, 1), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk, 1, 2), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallOreChunk, 1, 0), aluminumRaw, new ItemStack(ModItems.aluminumUnshaped,1)));
		} else {
		}
		
		//Electrum
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.electrumIngot,1), electrumRaw, new ItemStack(ModItems.electrumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.electrumIngot2x,1), electrumRaw, new ItemStack(ModItems.electrumUnshaped,2,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.electrumUnshaped,1), electrumRaw, new ItemStack(ModItems.electrumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.electrumStripe,1), electrumRaw, new ItemStack(ModItems.electrumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.electrumWire,1), electrumRaw, new ItemStack(ModItems.electrumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedElectrumWire,1,0), electrumRaw, new ItemStack(ModItems.electrumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedElectrumWire,1,1), electrumRaw, new ItemStack(ModItems.electrumUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedElectrumWire,1,2), electrumRaw, new ItemStack(ModItems.electrumUnshaped,1)));
		
		//Constantan
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.constantanIngot,1), constantanRaw, new ItemStack(ModItems.constantanUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.constantanIngot2x,1), constantanRaw, new ItemStack(ModItems.constantanUnshaped,2,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.constantanUnshaped,1), constantanRaw, new ItemStack(ModItems.constantanUnshaped,1)));
		//Invar
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.invarIngot,1), invarRaw, new ItemStack(ModItems.invarUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.invarIngot2x,1), invarRaw, new ItemStack(ModItems.invarUnshaped,2,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.invarUnshaped,1), invarRaw, new ItemStack(ModItems.invarUnshaped,1)));
		//Red Alloy
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.redAlloyIngot,1), redAlloyRaw, new ItemStack(ModItems.redAlloyUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.redAlloyUnshaped,1), redAlloyRaw, new ItemStack(ModItems.redAlloyUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.redAlloyWire,1), redAlloyRaw, new ItemStack(ModItems.redAlloyUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedRedAlloyWire,1,0), redAlloyRaw, new ItemStack(ModItems.redAlloyUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedRedAlloyWire,1,1), redAlloyRaw, new ItemStack(ModItems.redAlloyUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedRedAlloyWire,1,2), redAlloyRaw, new ItemStack(ModItems.redAlloyUnshaped,1)));

		//Bismuth Bronze
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.bismuthBronzeGearPiece,1), bismuthBronzeRaw, new ItemStack(TFCItems.bismuthBronzeUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.bismuthBronzeRackwheel,1), bismuthBronzeRaw, new ItemStack(TFCItems.bismuthBronzeUnshaped,4,0)));
		
		//Black Bronze
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.blackBronzeGearPiece,1), blackBronzeRaw, new ItemStack(TFCItems.bismuthBronzeUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.blackBronzeRackwheel,1), blackBronzeRaw, new ItemStack(TFCItems.bismuthBronzeUnshaped,4,0)));
		
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.blueSteelGearPiece,1), blueSteelRaw, new ItemStack(TFCItems.blueSteelUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.blueSteelRackwheel,1), blueSteelRaw, new ItemStack(TFCItems.blueSteelUnshaped,4,0)));
		
		//Brass
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.brassGearPiece,1), brassRaw, new ItemStack(TFCItems.brassUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.brassRackwheel,1), brassRaw, new ItemStack(TFCItems.brassUnshaped,4,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.brassSleeve,1), brassRaw, new ItemStack(TFCItems.brassUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.oilcan,1), brassRaw, new ItemStack(TFCItems.brassUnshaped,2,0)));
		
		//Bronze
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.bronzeGearPiece,1), bronzeRaw, new ItemStack(TFCItems.bronzeUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.bronzeRackwheel,1), bronzeRaw, new ItemStack(TFCItems.bronzeUnshaped,4,0)));
		
		//Copper
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.copperGearPiece,1), copperRaw, new ItemStack(TFCItems.copperUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.copperRackwheel,1), copperRaw, new ItemStack(TFCItems.copperUnshaped,4,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.copperStripe,1), copperRaw, new ItemStack(TFCItems.copperUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.copperWire,1), copperRaw, new ItemStack(TFCItems.copperUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedCopperWire,1,0), copperRaw, new ItemStack(TFCItems.copperUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedCopperWire,1,2), copperRaw, new ItemStack(TFCItems.copperUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedCopperWire,1,3), copperRaw, new ItemStack(TFCItems.copperUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.inductor,1), copperRaw, new ItemStack(TFCItems.copperUnshaped,2,0)));
		
		//Gold
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.goldGearPiece,1), goldRaw, new ItemStack(TFCItems.goldUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.goldRackwheel,1), goldRaw, new ItemStack(TFCItems.goldUnshaped,4,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.goldStripe,1), goldRaw, new ItemStack(TFCItems.goldUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.goldWire,1), goldRaw, new ItemStack(TFCItems.goldUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedGoldWire,1,0), goldRaw, new ItemStack(TFCItems.goldUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedGoldWire,1,1), goldRaw, new ItemStack(TFCItems.goldUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedGoldWire,1,3), goldRaw, new ItemStack(TFCItems.goldUnshaped,1)));
		
		//Wrought Iron
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.wroughtIronGearPiece,1), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.wroughtIronRackwheel,1), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,4,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.mount,1), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.groove,1), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.ironStripe,1), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.dixie,1), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,2,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.ironWire,1), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedIronWire,1,0), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedIronWire,1,1), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedIronWire,1,2), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.steelGearPiece,1), steelRaw, new ItemStack(TFCItems.steelUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.steelRackwheel,1), steelRaw, new ItemStack(TFCItems.steelUnshaped,4,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.steelSleeve,1), steelRaw, new ItemStack(TFCItems.steelUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.steelStripe,1), steelRaw, new ItemStack(TFCItems.steelUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.steelWire,1), steelRaw, new ItemStack(TFCItems.steelUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedSteelWire,1,0), steelRaw, new ItemStack(TFCItems.steelUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedSteelWire,1,1), steelRaw, new ItemStack(TFCItems.steelUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedSteelWire,1,2), steelRaw, new ItemStack(TFCItems.steelUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.tinGearPiece,1), tinRaw, new ItemStack(TFCItems.tinUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.tinRackwheel,1), tinRaw, new ItemStack(TFCItems.tinUnshaped,4,0)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.tinSleeve,1), tinRaw, new ItemStack(TFCItems.tinUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.tinStripe,1), tinRaw, new ItemStack(TFCItems.tinUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.tinWire,1), tinRaw, new ItemStack(TFCItems.tinUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedTinWire,1,0), tinRaw, new ItemStack(TFCItems.tinUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedTinWire,1,1), tinRaw, new ItemStack(TFCItems.tinUnshaped,1)));
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.unfinishedTinWire,1,2), tinRaw, new ItemStack(TFCItems.tinUnshaped,1)));

		//Rubber
		if (ModOptions.cfgEnableHeatingRubber) {
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.rubberMix,1), 1, 600, new ItemStack(ModItems.rubber,1)));
		}
		
		//Glue
		manager.addIndex(new HeatIndex(new ItemStack(ModItems.dixieBones,1), ModOptions.cfgGlueBoilingSpeed, 400, new ItemStack(ModItems.dixieGlue,1)));
		
		if (TFCTech.enableBCTransport) {
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameElectrum,1), electrumRaw, new ItemStack(ModItems.electrumUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameBlackSteel,1), blackSteelRaw, new ItemStack(TFCItems.blackSteelUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameBlueSteel,1), blueSteelRaw, new ItemStack(TFCItems.blueSteelUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameBronze,1), bronzeRaw, new ItemStack(TFCItems.bronzeUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameCopper,1), copperRaw, new ItemStack(TFCItems.copperUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameWroughtIron,1), ironRaw, new ItemStack(TFCItems.wroughtIronUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameLead,1), leadRaw, new ItemStack(TFCItems.leadUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameRedSteel,1), redSteelRaw, new ItemStack(TFCItems.redSteelUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameSilver,1), silverRaw, new ItemStack(TFCItems.silverUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameSteel,1), steelRaw, new ItemStack(TFCItems.steelUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameSterlingSilver,1), sterlingSilverRaw, new ItemStack(TFCItems.sterlingSilverUnshaped,2,0)));
			manager.addIndex(new HeatIndex(new ItemStack(ModItems.pipeFrameZinc,1), zincRaw, new ItemStack(TFCItems.zincUnshaped,2,0)));
		}
	}

}
