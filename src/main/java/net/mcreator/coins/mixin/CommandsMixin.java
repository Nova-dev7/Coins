package net.mcreator.coins.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.coins.event.MiscEvents;

import com.mojang.brigadier.ParseResults;

@Mixin(Commands.class)
public abstract class CommandsMixin {
	@Inject(method = "performCommand", at = @At("HEAD"), cancellable = true)
	private void performCommand(ParseResults<CommandSourceStack> parseResults, String string, CallbackInfo ci) {
		boolean result = MiscEvents.COMMAND_EXECUTE.invoker().onCommandExecuted(parseResults);
		if (!result)
			ci.cancel();
	}
}