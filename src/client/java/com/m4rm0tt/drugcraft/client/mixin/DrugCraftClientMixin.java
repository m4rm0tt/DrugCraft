package com.m4rm0tt.drugcraft.client.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class DrugCraftClientMixin {
	@Inject(at = @At("HEAD"), method = "run")
	private void init(CallbackInfo info) {
	}
}
