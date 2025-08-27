package net.shakh.maniqui_mod.entity.client;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Rata_01<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("maniqui", "rata_01"), "main");
	private final ModelPart Rata;
	private final ModelPart Cuerpo;
	private final ModelPart Cola;
	private final ModelPart ExtInferiores;
	private final ModelPart ExtSuperiores;
	private final ModelPart ojos;
	private final ModelPart Orejas;

	public Rata_01(ModelPart root) {
		this.Rata = root.getChild("Rata");
		this.Cuerpo = this.Rata.getChild("Cuerpo");
		this.Cola = this.Rata.getChild("Cola");
		this.ExtInferiores = this.Rata.getChild("ExtInferiores");
		this.ExtSuperiores = this.Rata.getChild("ExtSuperiores");
		this.ojos = this.Rata.getChild("ojos");
		this.Orejas = this.Rata.getChild("Orejas");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Rata = partdefinition.addOrReplaceChild("Rata", CubeListBuilder.create(), PartPose.offset(1.0F, 23.0F, -4.0F));

		PartDefinition Cuerpo = Rata.addOrReplaceChild("Cuerpo", CubeListBuilder.create().texOffs(0, 11).addBox(-1.5F, -14.0F, -1.5F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -9.0F, -2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-1.5F, -17.0F, -2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(32, 22).addBox(0.0F, -16.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 6).addBox(-1.0F, -16.0F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 1.0F, 4.0F));

		PartDefinition Cola = Rata.addOrReplaceChild("Cola", CubeListBuilder.create().texOffs(16, 11).addBox(-0.5F, -1.5F, -12.75F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(16, 19).addBox(-0.25F, -1.25F, -6.75F, 1.5F, 1.5F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(0.0F, -1.0F, -0.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -1.5F, 16.75F));

		PartDefinition ExtInferiores = Rata.addOrReplaceChild("ExtInferiores", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(20, 6).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(10, 27).addBox(4.0F, -3.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(20, 27).addBox(4.5F, 0.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 0.0F, 3.0F));

		PartDefinition ExtSuperiores = Rata.addOrReplaceChild("ExtSuperiores", CubeListBuilder.create().texOffs(30, 27).addBox(-0.5F, -11.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 10).addBox(-0.5F, -10.0F, -3.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 31).addBox(4.5F, -11.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 13).addBox(4.5F, -10.0F, -3.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 0.0F, 3.0F));

		PartDefinition ojos = Rata.addOrReplaceChild("ojos", CubeListBuilder.create().texOffs(32, 16).addBox(-2.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 18).addBox(1.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -14.5F, 3.5F));

		PartDefinition Orejas = Rata.addOrReplaceChild("Orejas", CubeListBuilder.create().texOffs(20, 32).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(32, 20).addBox(3.5F, -2.0F, -1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.75F, -15.0F, 5.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Rata.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Rata;
	}
}