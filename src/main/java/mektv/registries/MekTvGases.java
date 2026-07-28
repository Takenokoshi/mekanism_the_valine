package mektv.registries;

import mekanism.api.chemical.attribute.ChemicalAttribute;
import mekanism.api.chemical.gas.attribute.GasAttributes.Fuel;
import mekanism.api.math.FloatingLong;
import mekanism.common.registration.impl.GasDeferredRegister;
import mekanism.common.registration.impl.GasRegistryObject;
import mektv.MekTvConstants;

public class MekTvGases {
    public static final GasDeferredRegister GASES = new GasDeferredRegister(MekTvConstants.MODID);

    public static final GasRegistryObject<?> VALINE_3G = GASES.register(
            "valine3g", 0x9f9ea4, new ChemicalAttribute[] {
                    new Fuel(() -> 2, () -> FloatingLong.create(57729))
            });

    public static final GasRegistryObject<?> SALTLESS_DRIED_SOYSOUCE = GASES.register(
            "saltless_dried_soysouce", 0x45281d, new ChemicalAttribute[] {
                    new Fuel(() -> 200, () -> FloatingLong.create(4382750))
            });

    public static final GasRegistryObject<?> SOYSAUCE = GASES.register(
            "soysauce", 0x15080d, new ChemicalAttribute[] {
                    new Fuel(() -> 1, () -> FloatingLong.create(5))
            });

    public static final GasRegistryObject<?> DVT = GASES.register(
            "deuterium_valine3g_tritium", 0xdda0dd, new ChemicalAttribute[] {
                    new Fuel(() -> 10, () -> FloatingLong.create(2147483647))
            });

    public static final GasRegistryObject<?> THE_INCOMPARABLE_VALINE = GASES.register(
            "the_incomparable_valine", 0xbfbec4, new ChemicalAttribute[] {
                    new Fuel(() -> 1000, () -> FloatingLong.MAX_VALUE)
            });
}
