package net.shakh.maniqui_mod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.ChatFormatting;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.shakh.maniqui_mod.Lienzo;
import net.shakh.maniqui_mod.entity.custom.RataEntity;


public class RataRenderer extends MobRenderer<RataEntity, Rata_01<RataEntity>> {

    public RataRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Rata_01<>(pContext.bakeLayer(ModModelLayers.Rata_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(RataEntity rataEntity) {
        String s = ChatFormatting.stripFormatting(rataEntity.getName().getString());

        if ("Lando".equalsIgnoreCase(s)) {
            return new ResourceLocation(Lienzo.MODID, "textures/entity/rata_lando.png");
        }
        return new ResourceLocation(Lienzo.MODID, "textures/entity/rata.png");
    }

    @Override
    public void render(RataEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}

