package com.rizet.herbacraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rizet.herbacraft.core.init.BlockManager;
import com.rizet.herbacraft.core.init.EffectManager;
import com.rizet.herbacraft.core.init.ItemManager;
import com.rizet.herbacraft.world.FossilGenerator;

@Mod(Herbacraft.MOD_ID)
public class Herbacraft
{
	public static final String MOD_ID = "herbacraft";
	public static final Logger LOGGING = LogManager.getLogger();

    public Herbacraft() {
    	IEventBus mbus = FMLJavaModLoadingContext.get().getModEventBus();
        mbus.addListener(this::setup);

        ItemManager.ITEMS.register(mbus);
        BlockManager.BLOCKS.register(mbus);
        EffectManager.EFFECTS.register(mbus);
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FossilGenerator::generateFossils);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
}
