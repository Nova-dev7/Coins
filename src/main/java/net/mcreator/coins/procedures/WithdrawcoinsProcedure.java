package net.mcreator.coins.procedures;

import org.checkerframework.checker.units.qual.g;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.coins.network.CoinsModVariables;
import net.mcreator.coins.init.CoinsModItems;

public class WithdrawcoinsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double n = 0;
		double d = 0;
		double e = 0;
		double g = 0;
		double i = 0;
		double c = 0;
		if (entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance != 0) {
			while (entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance >= 1024) {
				n = Math.floor(entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance / 1024);
				{
					CoinsModVariables.PlayerVariables _vars = entity.getData(CoinsModVariables.PLAYER_VARIABLES);
					_vars.balance = entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance - n * 1024;
					_vars.syncPlayerVariables(entity);
				}
			}
			while (entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance >= 256) {
				d = Math.floor(entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance / 256);
				{
					CoinsModVariables.PlayerVariables _vars = entity.getData(CoinsModVariables.PLAYER_VARIABLES);
					_vars.balance = entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance - d * 256;
					_vars.syncPlayerVariables(entity);
				}
			}
			while (entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance >= 64) {
				e = Math.floor(entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance / 64);
				{
					CoinsModVariables.PlayerVariables _vars = entity.getData(CoinsModVariables.PLAYER_VARIABLES);
					_vars.balance = entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance - e * 64;
					_vars.syncPlayerVariables(entity);
				}
			}
			while (entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance >= 16) {
				g = Math.floor(entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance / 16);
				{
					CoinsModVariables.PlayerVariables _vars = entity.getData(CoinsModVariables.PLAYER_VARIABLES);
					_vars.balance = entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance - g * 16;
					_vars.syncPlayerVariables(entity);
				}
			}
			while (entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance >= 4) {
				i = Math.floor(entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance / 4);
				{
					CoinsModVariables.PlayerVariables _vars = entity.getData(CoinsModVariables.PLAYER_VARIABLES);
					_vars.balance = entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance - i * 4;
					_vars.syncPlayerVariables(entity);
				}
			}
			while (entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance >= 1) {
				c = Math.floor(entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance);
				{
					CoinsModVariables.PlayerVariables _vars = entity.getData(CoinsModVariables.PLAYER_VARIABLES);
					_vars.balance = entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance - c;
					_vars.syncPlayerVariables(entity);
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CoinsModItems.NETHERITE_COIN.get()).copy();
				_setstack.setCount((int) n);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CoinsModItems.DIAMOND_COIN.get()).copy();
				_setstack.setCount((int) d);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CoinsModItems.EMERALD_COIN.get()).copy();
				_setstack.setCount((int) e);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CoinsModItems.GOLD_COIN.get()).copy();
				_setstack.setCount((int) g);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CoinsModItems.IRON_COIN.get()).copy();
				_setstack.setCount((int) i);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CoinsModItems.COPPER_COIN.get()).copy();
				_setstack.setCount((int) c);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7aSuccessfully"), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cNo have"), false);
		}
	}
}