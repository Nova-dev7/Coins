package net.mcreator.coins.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.coins.network.CoinsModVariables;
import net.mcreator.coins.init.CoinsModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CraftedcoinsProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getEntity(), event.getCrafting());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == CoinsModItems.COPPER_COIN.get()) {
			{
				CoinsModVariables.PlayerVariables _vars = entity.getData(CoinsModVariables.PLAYER_VARIABLES);
				_vars.diamond = entity.getData(CoinsModVariables.PLAYER_VARIABLES).diamond + 1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (itemstack.getItem() == CoinsModItems.IRON_COIN.get()) {
			{
				CoinsModVariables.PlayerVariables _vars = entity.getData(CoinsModVariables.PLAYER_VARIABLES);
				_vars.netherite = entity.getData(CoinsModVariables.PLAYER_VARIABLES).netherite + 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}