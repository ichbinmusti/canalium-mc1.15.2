// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class amongusrig extends EntityModel<Entity> {
	private final ModelRenderer sagbacak;
	private final ModelRenderer solboccak;
	private final ModelRenderer bb_main;

	public amongusrig() {
		textureWidth = 32;
		textureHeight = 32;

		sagbacak = new ModelRenderer(this);
		sagbacak.setRotationPoint(0.0F, 24.0F, 0.0F);
		sagbacak.setTextureOffset(14, 3).addBox(-1.0F, -1.0F, -3.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		sagbacak.setTextureOffset(18, 11).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		solboccak = new ModelRenderer(this);
		solboccak.setRotationPoint(0.0F, 24.0F, 0.0F);
		solboccak.setTextureOffset(14, 0).addBox(-1.0F, -1.0F, 1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		solboccak.setTextureOffset(6, 13).addBox(-1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-2.0F, -10.0F, -3.0F, 4.0F, 7.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(10, 13).addBox(-1.0F, -13.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 13).addBox(-3.0F, -9.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		sagbacak.render(matrixStack, buffer, packedLight, packedOverlay);
		solboccak.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}