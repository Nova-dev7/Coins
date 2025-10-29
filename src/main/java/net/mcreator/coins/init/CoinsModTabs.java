/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coins.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.coins.CoinsMod;

public class CoinsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoinsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COINS = REGISTRY.register("coins",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.coins.coins")).icon(() -> new ItemStack(CoinsModItems.COPPER_COIN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CoinsModItems.COPPER_COIN.get());
				tabData.accept(CoinsModItems.IRON_COIN.get());
				tabData.accept(CoinsModItems.GOLD_COIN.get());
				tabData.accept(CoinsModItems.EMERALD_COIN.get());
				tabData.accept(CoinsModItems.DIAMOND_COIN.get());
				tabData.accept(CoinsModItems.NETHERITE_COIN.get());
			}).build());
}