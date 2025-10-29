/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coins.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.coins.CoinsMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class CoinsModTabs {
	public static ResourceKey<CreativeModeTab> TAB_COINS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(CoinsMod.MODID, "coins"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_COINS, FabricItemGroup.builder().title(Component.translatable("item_group.coins.coins")).icon(() -> new ItemStack(CoinsModItems.COPPER_COIN)).displayItems((parameters, tabData) -> {
			tabData.accept(CoinsModItems.COPPER_COIN);
			tabData.accept(CoinsModItems.IRON_COIN);
			tabData.accept(CoinsModItems.GOLD_COIN);
			tabData.accept(CoinsModItems.EMERALD_COIN);
			tabData.accept(CoinsModItems.DIAMOND_COIN);
			tabData.accept(CoinsModItems.NETHERITE_COIN);
		}).build());
	}
}