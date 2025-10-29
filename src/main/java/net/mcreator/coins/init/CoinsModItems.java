/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coins.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.coins.item.NetheritecoinItem;
import net.mcreator.coins.item.IroncoinItem;
import net.mcreator.coins.item.GoldcoinItem;
import net.mcreator.coins.item.EmeraldcoinItem;
import net.mcreator.coins.item.DiamondcoinItem;
import net.mcreator.coins.item.CoppercoinItem;
import net.mcreator.coins.CoinsMod;

import java.util.function.Function;

public class CoinsModItems {
	public static Item COPPER_COIN;
	public static Item IRON_COIN;
	public static Item GOLD_COIN;
	public static Item EMERALD_COIN;
	public static Item DIAMOND_COIN;
	public static Item NETHERITE_COIN;

	public static void load() {
		COPPER_COIN = register("copper_coin", CoppercoinItem::new);
		IRON_COIN = register("iron_coin", IroncoinItem::new);
		GOLD_COIN = register("gold_coin", GoldcoinItem::new);
		EMERALD_COIN = register("emerald_coin", EmeraldcoinItem::new);
		DIAMOND_COIN = register("diamond_coin", DiamondcoinItem::new);
		NETHERITE_COIN = register("netherite_coin", NetheritecoinItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CoinsMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}