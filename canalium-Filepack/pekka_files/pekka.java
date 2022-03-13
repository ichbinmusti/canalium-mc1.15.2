// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer govde;
	private final ModelRenderer solayak;
	private final ModelRenderer sagayak;
	private final ModelRenderer bb_main;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		govde = new ModelRenderer(this);
		govde.setRotationPoint(0.0F, 24.0F, 0.0F);
		govde.setTextureOffset(0, 21).addBox(-5.0F, -13.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		govde.setTextureOffset(0, 13).addBox(-6.0F, -7.0F, -3.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);

		solayak = new ModelRenderer(this);
		solayak.setRotationPoint(0.0F, 24.0F, 0.0F);
		solayak.setTextureOffset(26, 20).addBox(-4.0F, -1.0F, 2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		solayak.setTextureOffset(20, 21).addBox(-4.0F, -6.0F, 2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		sagayak = new ModelRenderer(this);
		sagayak.setRotationPoint(0.0F, 24.0F, 0.0F);
		sagayak.setTextureOffset(26, 26).addBox(-4.0F, -6.0F, -3.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		sagayak.setTextureOffset(28, 7).addBox(-4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(21, 13).addBox(-4.0F, -12.0F, -7.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-6.0F, -19.0F, -3.0F, 7.0F, 6.0F, 7.0F, 0.0F, false);
		bb_main.setTextureOffset(21, 0).addBox(-4.0F, -12.0F, 3.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		govde.render(matrixStack, buffer, packedLight, packedOverlay);
		solayak.render(matrixStack, buffer, packedLight, packedOverlay);
		sagayak.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}