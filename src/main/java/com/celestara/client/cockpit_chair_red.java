// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class cockpit_chair_red extends EntityModel<Entity> {
	private final ModelPart bb_main;
	public cockpit_chair_red(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-10.0F, -4.0F, -10.0F, 20.0F, 4.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 20).cuboid(-10.0F, -32.0F, 6.0F, 20.0F, 32.0F, 4.0F, new Dilation(0.0F))
		.uv(48, 20).cuboid(-8.0F, -8.0F, -8.0F, 14.0F, 4.0F, 14.0F, new Dilation(0.0F))
		.uv(0, 56).cuboid(-10.0F, -14.0F, -10.0F, 2.0F, 10.0F, 16.0F, new Dilation(0.0F))
		.uv(48, 38).cuboid(6.0F, -14.0F, -10.0F, 4.0F, 10.0F, 16.0F, new Dilation(0.0F))
		.uv(36, 64).cuboid(-11.0F, -12.0F, -8.0F, 1.0F, 6.0F, 7.0F, new Dilation(0.0F))
		.uv(52, 64).cuboid(7.0F, -15.0F, -9.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(72, 12).cuboid(7.0F, -15.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(72, 15).cuboid(-2.0F, -8.0F, -9.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 56).cuboid(-1.0F, -4.0F, 10.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 64).cuboid(-1.0F, -8.0F, 10.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 76).cuboid(8.0F, -8.0F, 10.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 64).cuboid(8.0F, -4.0F, 10.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 69).cuboid(-10.0F, -8.0F, 10.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 70).cuboid(-10.0F, -4.0F, 10.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 82).cuboid(-5.0F, -25.0F, 10.0F, 10.0F, 14.0F, 2.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(-1.0F, -11.0F, 10.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(2.0F, -11.0F, 10.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(-4.0F, -11.0F, 10.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(-4.0F, -26.0F, 10.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(-1.0F, -26.0F, 10.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(2.0F, -26.0F, 10.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 104).cuboid(5.0F, -15.0F, 10.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 104).cuboid(5.0F, -19.0F, 10.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 104).cuboid(5.0F, -23.0F, 10.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 104).cuboid(-6.0F, -23.0F, 10.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 104).cuboid(-6.0F, -19.0F, 10.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 104).cuboid(-6.0F, -15.0F, 10.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bb_main.addChild("cube_r1", ModelPartBuilder.create().uv(57, 1).cuboid(-2.0F, -12.0F, -1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.0F, -13.0F, 0.0F, 4.0F, 14.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, -19.0F, 6.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r2 = bb_main.addChild("cube_r2", ModelPartBuilder.create().uv(72, 6).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 77).cuboid(-1.0F, -8.0F, -1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-11.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r3 = bb_main.addChild("cube_r3", ModelPartBuilder.create().uv(72, 0).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r4 = bb_main.addChild("cube_r4", ModelPartBuilder.create().uv(42, 77).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, -4.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r5 = bb_main.addChild("cube_r5", ModelPartBuilder.create().uv(36, 77).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, -4.0F, 7.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r6 = bb_main.addChild("cube_r6", ModelPartBuilder.create().uv(60, 71).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, 0.0F, 7.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r7 = bb_main.addChild("cube_r7", ModelPartBuilder.create().uv(52, 71).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(74, 76).cuboid(-1.0F, -8.0F, -1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-11.0F, 0.0F, 7.0F, 0.0F, -1.5708F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}