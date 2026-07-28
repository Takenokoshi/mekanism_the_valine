package mektv;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import mektv.registries.MekTvGases;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MekTvConstants.MODID)
public class MekTv {
    public static final Logger LOGGER = LogUtils.getLogger();
    public MekTv(){
        FMLJavaModLoadingContext context = FMLJavaModLoadingContext.get();
        IEventBus modEventBus = context.getModEventBus();
        MekTvGases.GASES.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
