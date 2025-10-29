/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coins.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.coins.item.NetheritecoinItem;
import net.mcreator.coins.item.IroncoinItem;
import net.mcreator.coins.item.GoldcoinItem;
import net.mcreator.coins.item.EmeraldcoinItem;
import net.mcreator.coins.item.DiamondcoinItem;
import net.mcreator.coins.item.CoppercoinItem;
import net.mcreator.coins.CoinsMod;

import java.util.function.Function;

public class CoinsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CoinsMod.MODID);
	public static final DeferredItem<Item> COPPER_COIN = register("copper_coin", CoppercoinItem::new);
	public static final DeferredItem<Item> IRON_COIN = register("iron_coin", IroncoinItem::new);
	public static final DeferredItem<Item> GOLD_COIN = register("gold_coin", GoldcoinItem::new);
	public static final DeferredItem<Item> EMERALD_COIN = register("emerald_coin", EmeraldcoinItem::new);
	public static final DeferredItem<Item> DIAMOND_COIN = register("diamond_coin", DiamondcoinItem::new);
	public static final DeferredItem<Item> NETHERITE_COIN = register("netherite_coin", NetheritecoinItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}