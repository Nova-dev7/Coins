package net.mcreator.coins.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.coins.network.CoinsModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SendProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance != 0) {
			if (entity.getData(CoinsModVariables.PLAYER_VARIABLES).balance >= DoubleArgumentType.getDouble(arguments, "count")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aSuccessfully"), false);
			}
		}
	}
}