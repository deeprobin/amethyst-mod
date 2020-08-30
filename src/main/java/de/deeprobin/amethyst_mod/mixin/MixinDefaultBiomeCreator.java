package de.deeprobin.amethyst_mod.mixin;

import de.deeprobin.amethyst_mod.AmethystMod;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeCreator;
import net.minecraft.world.biome.GenerationSettings.Builder;
import net.minecraft.world.gen.GenerationStep;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DefaultBiomeCreator.class)
public abstract class MixinDefaultBiomeCreator {

    @Inject(method = "method_31065", at = @At("HEAD"))
    private static void addEndOres(Builder builder, CallbackInfoReturnable<Biome> info) {
        builder.feature(GenerationStep.Feature.SURFACE_STRUCTURES, AmethystMod.THE_END_AMETHYST_ORE_FEATURE);
    }


}
