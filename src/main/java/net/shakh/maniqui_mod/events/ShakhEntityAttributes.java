package net.shakh.maniqui_mod.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shakh.maniqui_mod.entity.ModEntities;
import net.shakh.maniqui_mod.entity.custom.RataEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShakhEntityAttributes {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.Rata.get(), RataEntity.createAttributes().build());
    }
}


