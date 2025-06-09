package org.winglessbirds.noplayernametags.mixin;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PlayerEntityRenderer.class)
public abstract class PlayerEntityRendererMixin<T extends LivingEntity, M extends EntityModel<T>> extends LivingEntityRenderer<T, M> {

    public PlayerEntityRendererMixin(EntityRendererFactory.Context ctx, M model, float shadowRadius) {
        super(ctx, model, shadowRadius);
    }

    @Override
    protected boolean hasLabel (T livingEntity) {
        return false;
    }

}
