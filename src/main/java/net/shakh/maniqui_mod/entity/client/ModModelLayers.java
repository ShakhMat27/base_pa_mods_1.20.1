package net.shakh.maniqui_mod.entity.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shakh.maniqui_mod.Lienzo;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;


public class ModModelLayers {
    public static final ModelLayerLocation Rata_LAYER = new ModelLayerLocation(
            new ResourceLocation(Lienzo.MODID, "rata_layer"),"main");



}
