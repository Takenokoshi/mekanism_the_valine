package mektv;

import net.minecraft.resources.ResourceLocation;

public class MekTvConstants {
    public static final String MODID = "mekanism_the_valine";

    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
