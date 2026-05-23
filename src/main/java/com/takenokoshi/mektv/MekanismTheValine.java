package com.takenokoshi.mektv;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalBuilder;
import mekanism.api.chemical.attribute.ChemicalAttributes;
import mekanism.common.registration.impl.ChemicalDeferredRegister;
import mekanism.common.registration.impl.DeferredChemical;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MekanismTheValine.MODID)
public class MekanismTheValine {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "mekanism_the_valine";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final ChemicalDeferredRegister CHEMICALS = new ChemicalDeferredRegister(MODID);

    public static final DeferredChemical<?> VALINE3G = CHEMICALS.register("valine3g", () -> new Chemical(
            ChemicalBuilder.builder().tint(0x9f9ea4).with(new ChemicalAttributes.Fuel(() -> 2, () -> 57729l))));
    public static final DeferredChemical<?> SALTLESS_DRIED_SOYSOUCE = CHEMICALS.register("saltless_dried_soysouce",
            () -> new Chemical(ChemicalBuilder.builder().tint(0x45281d)
                    .with(new ChemicalAttributes.Fuel(() -> 200, () -> 4382750l))));
    public static final DeferredChemical<?> SOYSAUCE = CHEMICALS.register("soysauce", () -> new Chemical(
            ChemicalBuilder.builder().tint(0x15080d).with(new ChemicalAttributes.Fuel(() -> 1, () -> 5l))));
    public static final DeferredChemical<?> DVT = CHEMICALS.register("deuterium_valine3g_tritium", () -> new Chemical(
            ChemicalBuilder.builder().tint(0xdda0dd).with(new ChemicalAttributes.Fuel(() -> 10, () -> 0x7fffffffl))));
    public static final DeferredChemical<?> THE_INCOMPARABLE_VALINE = CHEMICALS.register("the_incomparable_valine",
            () -> new Chemical(ChemicalBuilder.builder().tint(0xbfbec4)
                    .with(new ChemicalAttributes.Fuel(() -> 1000, () -> Long.MAX_VALUE))));

    // The constructor for the mod class is the first code that is run when your mod
    // is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and
    // pass them in automatically.
    public MekanismTheValine(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        CHEMICALS.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM MekTV SETUP");
    }
}
