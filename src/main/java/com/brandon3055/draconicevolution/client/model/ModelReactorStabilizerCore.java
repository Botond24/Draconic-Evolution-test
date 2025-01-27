package com.brandon3055.draconicevolution.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Quaternion;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Function;

/**
 * ReactorStabilizerCore - brandon3055
 * Created using Tabula 5.0.0
 */
public class ModelReactorStabilizerCore extends Model {
//    public ModelPart hub1;
//    public ModelPart hub2;
//    public ModelPart rotor1R;
//    public ModelPart rotor2R;
//    public ModelPart rotor1R_1;
//    public ModelPart rotor1R_2;
//    public ModelPart rotor1R_3;
//    public ModelPart rotor1R_4;
//    public ModelPart rotor1L;
//    public ModelPart rotor1L_1;
//    public ModelPart rotor1L_2;
//    public ModelPart rotor1L_3;
//    public ModelPart rotor1L_4;
//    public ModelPart rotor2R_1;
//    public ModelPart rotor2R_2;
//    public ModelPart rotor2R_3;
//    public ModelPart rotor2R_4;
//    public ModelPart rotor2R_5;
//    public ModelPart rotor2R_6;
//    public ModelPart rotor2L;
//    public ModelPart rotor2L_1;
//    public ModelPart rotor2L_2;
//    public ModelPart rotor2L_3;
//    public ModelPart rotor2L_4;
//    public ModelPart rotor2L_5;
//    public ModelPart rotor2L_6;
//    public ModelPart basePlate;
//    public ModelPart frame1;
//    public ModelPart frame2;
//    public ModelPart frame3;
//    public ModelPart frame4;
//    public ModelPart frame5;
//    public ModelPart frame6;
//    public ModelPart frame7;
//    public ModelPart frame8;
//    public ModelPart frame9;
//    public ModelPart frame10;
//    public ModelPart frame11;
//    public ModelPart frame12;
//    public ModelPart backSpoke1;
//    public ModelPart backSpoke2;
//    public ModelPart coreElement2;
//    public ModelPart coreElement1;
    public float brightness = 0F;
    public float rotation = 0F;

    public ModelReactorStabilizerCore(Function<ResourceLocation, RenderType> renderTypeIn) {
        super(renderTypeIn);
//        this.texWidth = 64;
//        this.texHeight = 32;
//        this.coreElement2 = new ModelPart(this, 32, 20);
//        this.coreElement2.setPos(0.0F, 0.0F, 0.0F);
//        this.coreElement2.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F);
//        this.rotor2L_1 = new ModelPart(this, 0, 4);
//        this.rotor2L_1.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2L_1.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2L_1, 0.0F, 0.0F, -3.3213615665452094F);
//        this.rotor2L_5 = new ModelPart(this, 0, 4);
//        this.rotor2L_5.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2L_5.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2L_5, 0.0F, 0.0F, 2.602285914723545F);
//        this.rotor1L_3 = new ModelPart(this, 28, 2);
//        this.rotor1L_3.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor1L_3.addBox(3.0F, -0.5F, -6.0F, 1, 1, 11, 0.0F);
//        this.setRotateAngle(rotor1L_3, 0.0F, 0.0F, 3.637266161156183F);
//        this.rotor2L_6 = new ModelPart(this, 0, 4);
//        this.rotor2L_6.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2L_6.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2L_6, 0.0F, 0.0F, 3.6808993924560407F);
//        this.frame12 = new ModelPart(this, 0, 4);
//        this.frame12.setPos(0.0F, 0.0F, 0.0F);
//        this.frame12.addBox(7.0F, -6.0F, 7.0F, 1, 12, 1, 0.0F);
//        this.frame10 = new ModelPart(this, 0, 4);
//        this.frame10.setPos(0.0F, 0.0F, 0.0F);
//        this.frame10.addBox(-8.0F, -6.0F, -8.0F, 1, 12, 1, 0.0F);
//        this.rotor2L_3 = new ModelPart(this, 0, 4);
//        this.rotor2L_3.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2L_3.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2L_3, 0.0F, 0.0F, -3.501130479500625F);
//        this.rotor2R_6 = new ModelPart(this, 0, 4);
//        this.rotor2R_6.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2R_6.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2R_6, 0.0F, 0.0F, 0.5393067388662478F);
//        this.coreElement1 = new ModelPart(this, 32, 14);
//        this.coreElement1.setPos(0.0F, 0.0F, 0.0F);
//        this.coreElement1.addBox(-1.0F, -1.0F, 2.0F, 2, 2, 4, 0.0F);
//        this.rotor1L_4 = new ModelPart(this, 28, 2);
//        this.rotor1L_4.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor1L_4.addBox(3.0F, -0.5F, -6.0F, 1, 1, 11, 0.0F);
//        this.setRotateAngle(rotor1L_4, 0.0F, 0.0F, 2.6459191460234033F);
//        this.basePlate = new ModelPart(this, 0, 18);
//        this.basePlate.setPos(0.0F, 0.0F, 0.0F);
//        this.basePlate.addBox(-4.0F, -4.0F, 6.0F, 8, 8, 2, 0.0F);
//        this.rotor1L_2 = new ModelPart(this, 28, 2);
//        this.rotor1L_2.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor1L_2.addBox(3.0F, -0.5F, -6.0F, 1, 1, 11, 0.0F);
//        this.setRotateAngle(rotor1L_2, 0.0F, 0.0F, 2.8937558998065986F);
//        this.frame1 = new ModelPart(this, 12, 14);
//        this.frame1.setPos(0.0F, 0.0F, 0.0F);
//        this.frame1.addBox(6.0F, 6.0F, -8.0F, 2, 2, 16, 0.0F);
//        this.rotor1L_1 = new ModelPart(this, 28, 2);
//        this.rotor1L_1.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor1L_1.addBox(3.0F, -0.5F, -6.0F, 1, 1, 11, 0.0F);
//        this.setRotateAngle(rotor1L_1, 0.0F, 0.0F, -2.8937558998065986F);
//        this.frame5 = new ModelPart(this, 14, 0);
//        this.frame5.setPos(0.0F, 0.0F, 0.0F);
//        this.frame5.addBox(-6.0F, -8.0F, -8.0F, 12, 1, 1, 0.0F);
//        this.frame11 = new ModelPart(this, 0, 4);
//        this.frame11.setPos(0.0F, 0.0F, 0.0F);
//        this.frame11.addBox(7.0F, -6.0F, -8.0F, 1, 12, 1, 0.0F);
//        this.rotor1R_3 = new ModelPart(this, 28, 2);
//        this.rotor1R_3.setPos(0.0F, 0.0F, 1.0F);
//        this.rotor1R_3.addBox(3.0F, -0.5F, -7.0F, 1, 1, 11, 0.0F);
//        this.setRotateAngle(rotor1R_3, 0.0F, 0.0F, -0.49567350756638956F);
//        this.rotor2R_3 = new ModelPart(this, 0, 4);
//        this.rotor2R_3.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2R_3.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2R_3, 0.0F, 0.0F, 0.3595378259108319F);
//        this.frame3 = new ModelPart(this, 12, 14);
//        this.frame3.setPos(0.0F, 0.0F, 0.0F);
//        this.frame3.addBox(6.0F, -8.0F, -8.0F, 2, 2, 16, 0.0F);
//        this.rotor2R_5 = new ModelPart(this, 0, 4);
//        this.rotor2R_5.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2R_5.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2R_5, 0.0F, 0.0F, -0.5393067388662478F);
//        this.rotor2R_2 = new ModelPart(this, 0, 4);
//        this.rotor2R_2.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2R_2.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2R_2, 0.0F, 0.0F, 0.17976891295541594F);
//        this.backSpoke2 = new ModelPart(this, 52, 0);
//        this.backSpoke2.setPos(0.0F, 0.0F, 0.0F);
//        this.backSpoke2.addBox(-0.5F, -9.5F, 6.95F, 1, 19, 1, 0.0F);
//        this.setRotateAngle(backSpoke2, 0.0F, 0.0F, 0.7853981633974483F);
//        this.frame6 = new ModelPart(this, 14, 0);
//        this.frame6.setPos(0.0F, 0.0F, 0.0F);
//        this.frame6.addBox(-6.0F, 7.0F, -8.0F, 12, 1, 1, 0.0F);
//        this.rotor1R_2 = new ModelPart(this, 28, 2);
//        this.rotor1R_2.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor1R_2.addBox(3.0F, -0.5F, -6.0F, 1, 1, 11, 0.0F);
//        this.setRotateAngle(rotor1R_2, 0.0F, 0.0F, 0.24783675378319478F);
//        this.hub1 = new ModelPart(this, 0, 0);
//        this.hub1.setPos(0.0F, 0.0F, -0.02F);
//        this.hub1.addBox(-3.0F, -0.5F, 4.0F, 6, 1, 1, 0.0F);
//        this.rotor2R_1 = new ModelPart(this, 0, 4);
//        this.rotor2R_1.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2R_1.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2R_1, 0.0F, 0.0F, -0.17976891295541594F);
//        this.hub2 = new ModelPart(this, 0, 2);
//        this.hub2.setPos(0.0F, 0.0F, -0.01F);
//        this.hub2.addBox(-4.5F, -0.5F, 5.0F, 9, 1, 1, 0.0F);
//        this.backSpoke1 = new ModelPart(this, 52, 0);
//        this.backSpoke1.setPos(0.0F, 0.0F, 0.0F);
//        this.backSpoke1.addBox(-0.5F, -9.5F, 6.95F, 1, 19, 1, 0.0F);
//        this.setRotateAngle(backSpoke1, 0.0F, 0.0F, -0.7853981633974483F);
//        this.rotor1R_4 = new ModelPart(this, 28, 2);
//        this.rotor1R_4.setPos(0.0F, 0.0F, 1.0F);
//        this.rotor1R_4.addBox(3.0F, -0.5F, -7.0F, 1, 1, 11, 0.0F);
//        this.setRotateAngle(rotor1R_4, 0.0F, 0.0F, 0.49567350756638956F);
//        this.rotor1R = new ModelPart(this, 28, 2);
//        this.rotor1R.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor1R.addBox(3.0F, -0.5F, -6.0F, 1, 1, 11, 0.0F);
//        this.rotor2L_4 = new ModelPart(this, 0, 4);
//        this.rotor2L_4.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2L_4.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2L_4, 0.0F, 0.0F, -2.7820548276789614F);
//        this.frame4 = new ModelPart(this, 12, 14);
//        this.frame4.setPos(0.0F, 0.0F, 0.0F);
//        this.frame4.addBox(-8.0F, -8.0F, -8.0F, 2, 2, 16, 0.0F);
//        this.rotor2R = new ModelPart(this, 0, 4);
//        this.rotor2R.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2R.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.rotor2R_4 = new ModelPart(this, 0, 4);
//        this.rotor2R_4.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2R_4.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2R_4, 0.0F, 0.0F, -0.3595378259108319F);
//        this.rotor2L_2 = new ModelPart(this, 0, 4);
//        this.rotor2L_2.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2L_2.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2L_2, 0.0F, 0.0F, -2.961823740634377F);
//        this.frame9 = new ModelPart(this, 0, 4);
//        this.frame9.setPos(0.0F, 0.0F, 0.0F);
//        this.frame9.addBox(-8.0F, -6.0F, 7.0F, 1, 12, 1, 0.0F);
//        this.rotor2L = new ModelPart(this, 0, 4);
//        this.rotor2L.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor2L.addBox(4.5F, -0.5F, -7.0F, 1, 1, 13, 0.0F);
//        this.setRotateAngle(rotor2L, 0.0F, 0.0F, -3.141592653589793F);
//        this.rotor1L = new ModelPart(this, 28, 2);
//        this.rotor1L.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor1L.addBox(3.0F, -0.5F, -6.0F, 1, 1, 11, 0.0F);
//        this.setRotateAngle(rotor1L, 0.0F, 0.0F, -3.141592653589793F);
//        this.frame8 = new ModelPart(this, 14, 0);
//        this.frame8.setPos(0.0F, 0.0F, 0.0F);
//        this.frame8.addBox(-6.0F, 7.0F, 7.0F, 12, 1, 1, 0.0F);
//        this.frame2 = new ModelPart(this, 12, 14);
//        this.frame2.setPos(0.0F, 0.0F, 0.0F);
//        this.frame2.addBox(-8.0F, 6.0F, -8.0F, 2, 2, 16, 0.0F);
//        this.frame7 = new ModelPart(this, 14, 0);
//        this.frame7.setPos(0.0F, 0.0F, 0.0F);
//        this.frame7.addBox(-6.0F, -8.0F, 7.0F, 12, 1, 1, 0.0F);
//        this.rotor1R_1 = new ModelPart(this, 28, 2);
//        this.rotor1R_1.setPos(0.0F, 0.0F, 0.0F);
//        this.rotor1R_1.addBox(3.0F, -0.5F, -6.0F, 1, 1, 11, 0.0F);
//        this.setRotateAngle(rotor1R_1, 0.0F, 0.0F, -0.24783675378319478F);
//        this.basePlate.addChild(this.coreElement2);
//        this.rotor2R.addChild(this.rotor2L_1);
//        this.rotor2R.addChild(this.rotor2L_5);
//        this.rotor1R.addChild(this.rotor1L_3);
//        this.rotor2R.addChild(this.rotor2L_6);
//        this.basePlate.addChild(this.frame12);
//        this.basePlate.addChild(this.frame10);
//        this.rotor2R.addChild(this.rotor2L_3);
//        this.rotor2R.addChild(this.rotor2R_6);
//        this.basePlate.addChild(this.coreElement1);
//        this.rotor1R.addChild(this.rotor1L_4);
//        this.rotor1R.addChild(this.rotor1L_2);
//        this.basePlate.addChild(this.frame1);
//        this.rotor1R.addChild(this.rotor1L_1);
//        this.basePlate.addChild(this.frame5);
//        this.basePlate.addChild(this.frame11);
//        this.rotor1R.addChild(this.rotor1R_3);
//        this.rotor2R.addChild(this.rotor2R_3);
//        this.basePlate.addChild(this.frame3);
//        this.rotor2R.addChild(this.rotor2R_5);
//        this.rotor2R.addChild(this.rotor2R_2);
//        this.basePlate.addChild(this.backSpoke2);
//        this.basePlate.addChild(this.frame6);
//        this.rotor1R.addChild(this.rotor1R_2);
//        this.rotor2R.addChild(this.rotor2R_1);
//        this.basePlate.addChild(this.backSpoke1);
//        this.rotor1R.addChild(this.rotor1R_4);
//        this.rotor2R.addChild(this.rotor2L_4);
//        this.basePlate.addChild(this.frame4);
//        this.rotor2R.addChild(this.rotor2R_4);
//        this.rotor2R.addChild(this.rotor2L_2);
//        this.basePlate.addChild(this.frame9);
//        this.rotor2R.addChild(this.rotor2L);
//        this.rotor1R.addChild(this.rotor1L);
//        this.basePlate.addChild(this.frame8);
//        this.basePlate.addChild(this.frame2);
//        this.basePlate.addChild(this.frame7);
//        this.rotor1R.addChild(this.rotor1R_1);
    }

    @Override
    public void renderToBuffer(PoseStack matrix, VertexConsumer buffer, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
//        matrix.pushPose();
//        int light = Math.max((int)(brightness * 240), packedLightIn % 240);
//
//        this.basePlate.render(matrix, buffer, packedLightIn, packedOverlayIn);
//
//        matrix.mulPose(new Quaternion(0, 0, rotation, true));
//        this.hub1.render(matrix, buffer, packedLightIn, packedOverlayIn);
//        matrix.mulPose(new Quaternion(0, 0, rotation * -2, true));
//        this.hub2.render(matrix, buffer, packedLightIn, packedOverlayIn);
//
//        this.rotor2R.render(matrix, buffer, light, packedOverlayIn);
//        matrix.mulPose(new Quaternion(0, 0, rotation * 2, true));
//        this.rotor1R.render(matrix, buffer, light, packedOverlayIn);
//
//        matrix.popPose();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
