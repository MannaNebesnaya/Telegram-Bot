package com.github.MannaNebesnaya.telegrambot.command;


import com.github.MannaNebesnaya.telegrambot.service.SendBotMessageService;
import com.google.common.collect.ImmutableMap;

import static com.github.MannaNebesnaya.telegrambot.command.CommandName.*;

/**
 * Container of the {@link Command}s, which are using for handling telegram commands.
 */
public class CommandContainer {
    private final ImmutableMap<String, Command> commandMap;
    private final UnknownCommand unknownCommand;

    public CommandContainer(SendBotMessageService sendBotMessageService) {

        commandMap = new ImmutableMap.Builder<String, Command>()
                .put(START.getCommandName(), new StartCommand(sendBotMessageService))
                .put(STOP.getCommandName(), new StopCommand(sendBotMessageService))
                .put(HELP.getCommandName(), new HelpCommand(sendBotMessageService))
                .put(NO.getCommandName(), new NoCommand(sendBotMessageService))
                .build();

        unknownCommand = new UnknownCommand(sendBotMessageService);
    }

    public Command retrieveCommand(String commandIdentifier) {
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }
}
