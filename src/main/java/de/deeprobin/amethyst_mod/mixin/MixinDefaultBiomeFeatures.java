package de.deeprobin.amethyst_mod.mixin;

import de.deeprobin.amethyst_mod.AmethystMod;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.biome.GenerationSettings.Builder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public abstract class MixinDefaultBiomeFeatures {

    @Inject(method = "addDefaultOres", at = @At("HEAD"))
    private static void addDefaultOres(Builder builder, CallbackInfo info) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, AmethystMod.AMETHYST_ORE_FEATURE);
    }

}
