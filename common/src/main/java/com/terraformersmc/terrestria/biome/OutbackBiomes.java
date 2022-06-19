package com.terraformersmc.terrestria.biome;

import com.terraformersmc.terrestria.init.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

import static com.terraformersmc.terrestria.init.TerrestriaBiomes.addBasicFeatures;

public class OutbackBiomes {
	public static void register() {
		final Biome.Builder template = new Biome.Builder()
				.precipitation(Biome.Precipitation.NONE).category(Biome.Category.SAVANNA)
				.temperature(1.8F)
				.downfall(0.3F)
				.effects(TerrestriaBiomes.createDefaultBiomeEffects()
					.waterColor(0x3f76e4)
					.waterFogColor(0x50533)
					.build()
				);

		TerrestriaBiomes.OUTBACK = TerrestriaBiomes.register("outback", template
			.generationSettings(outbackGenerationSettings().build())
			.spawnSettings(defaultSpawnSettings().build())
			//.configureSurfaceBuilder(TerrestriaSurfaces.PATCHY_GRASS, TerrestriaSurfaces.OUTBACK_CONFIG)
			//.depth(0.125F)
			//.scale(0.05F)
			.build());
	}

	private static GenerationSettings.Builder outbackGenerationSettings() {
		GenerationSettings.Builder builder = new GenerationSettings.Builder();
		DefaultBiomeFeatures.addFossils(builder);
		addBasicFeatures(builder);
		DefaultBiomeFeatures.addDefaultOres(builder);
		DefaultBiomeFeatures.addClayOre(builder);
		DefaultBiomeFeatures.addDefaultDisks(builder);
		builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, TerrestriaPlacedFeatures.RARE_YUCCA_PALM_TREES);
		builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, TerrestriaPlacedFeatures.PATCH_DEAD_GRASS);
		builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, TerrestriaPlacedFeatures.ACACIA_DOT_SHRUBS);
		DefaultBiomeFeatures.addSavannaGrass(builder);
		DefaultBiomeFeatures.addDesertDeadBushes(builder);
		DefaultBiomeFeatures.addDefaultMushrooms(builder);
		DefaultBiomeFeatures.addDefaultVegetation(builder);
		//DefaultBiomeFeatures.addDesertLakes(builder);  (vv addDesertFeatures instead?)
		DefaultBiomeFeatures.addDesertFeatures(builder);
		return builder;
	}

	private static GenerationSettings.Builder outbackUluruGenerationSettings() {
		GenerationSettings.Builder builder = new GenerationSettings.Builder();
		DefaultBiomeFeatures.addFossils(builder);
		addBasicFeatures(builder);
		DefaultBiomeFeatures.addClayOre(builder);
		DefaultBiomeFeatures.addDefaultOres(builder);
		DefaultBiomeFeatures.addDefaultDisks(builder);
		DefaultBiomeFeatures.addSavannaGrass(builder);
		DefaultBiomeFeatures.addDesertDeadBushes(builder);
		DefaultBiomeFeatures.addDefaultMushrooms(builder);
		DefaultBiomeFeatures.addDefaultVegetation(builder);
		//DefaultBiomeFeatures.addDesertLakes(builder);  (vv addDesertFeatures instead?)
		DefaultBiomeFeatures.addDesertFeatures(builder);
		return builder;
	}

	private static GenerationSettings.Builder outbackBushlandGenerationSettings() {
		GenerationSettings.Builder builder = new GenerationSettings.Builder();
		DefaultBiomeFeatures.addFossils(builder);
		addBasicFeatures(builder);
		DefaultBiomeFeatures.addDefaultOres(builder);
		DefaultBiomeFeatures.addClayOre(builder);
		DefaultBiomeFeatures.addDefaultDisks(builder);
		builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, TerrestriaPlacedFeatures.OAK_DOT_SHRUBS);
		builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, TerrestriaPlacedFeatures.ACACIA_DOT_SHRUBS);
		builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, TerrestriaPlacedFeatures.OUTBACK_BUSHLAND_TREES);
		builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, TerrestriaPlacedFeatures.PATCH_OUTBACK_BUSHLAND_GRASS);
		DefaultBiomeFeatures.addSavannaGrass(builder);
		DefaultBiomeFeatures.addDesertDeadBushes(builder);
		DefaultBiomeFeatures.addDefaultMushrooms(builder);
		DefaultBiomeFeatures.addDefaultVegetation(builder);
		//DefaultBiomeFeatures.addDesertLakes(builder);  (vv addDesertFeatures instead?)
		DefaultBiomeFeatures.addDesertFeatures(builder);
		return builder;
	}

	private static SpawnSettings.Builder defaultSpawnSettings() {
		SpawnSettings.Builder builder = TerrestriaBiomes.createDefaultSpawnSettings();
		builder.creatureSpawnProbability(0.03F);
		return builder;
	}
}