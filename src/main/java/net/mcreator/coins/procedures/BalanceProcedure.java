package net.mcreator.coins.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.coins.network.CoinsModVariables;

public class BalanceProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Balance: " + (Math.floor(entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance) + "\u00A7a$"))), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("netherite: " + (Math.floor(entity.getData(CoinsModVariables.PLAYER_VARIABLES).netherite) + "\u00A7a$ "))), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("diamond: " + (Math.floor(entity.getData(CoinsModVariables.PLAYER_VARIABLES).diamond) + "\u00A7a$ "))), false);
	}
}