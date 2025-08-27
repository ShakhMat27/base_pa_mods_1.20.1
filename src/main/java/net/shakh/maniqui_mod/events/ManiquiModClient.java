package net.shakh.maniqui_mod.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shakh.maniqui_mod.entity.client.ModModelLayers;
import net.shakh.maniqui_mod.entity.client.Rata_01;

@Mod.EventBusSubscriber(modid = "maniqui", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ManiquiModClient {
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.Rata_LAYER, Rata_01::createBodyLayer);
    }
}
