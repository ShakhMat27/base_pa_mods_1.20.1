package net.shakh.maniqui_mod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shakh.maniqui_mod.Lienzo;
import net.shakh.maniqui_mod.entity.custom.RataEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Lienzo.MODID);

    public static final RegistryObject<EntityType<RataEntity>> Rata =
            ENTITY_TYPES.register("rata", () -> EntityType.Builder.of(RataEntity::new, MobCategory.CREATURE)
                    .sized(0.4f,1.0f).build("rata"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
