package com.github.MannaNebesnaya.telegrambot;


import com.github.MannaNebesnaya.telegrambot.command.Command;
import com.github.MannaNebesnaya.telegrambot.command.CommandContainer;
import com.github.MannaNebesnaya.telegrambot.command.CommandName;
import com.github.MannaNebesnaya.telegrambot.command.UnknownCommand;
import com.github.MannaNebesnaya.telegrambot.service.SendBotMessageService;
import com.github.MannaNebesnaya.telegrambot.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

@DisplayName("Unit-level testing for CommandContainer")
class CommandContainerTest {
    private CommandContainer commandContainer;

    @BeforeEach
    public void init() {
        SendBotMessageService messageService = Mockito.mock(SendBotMessageService.class);
        commandContainer = new CommandContainer(messageService);
    }


    @Test
    public void shouldGetAllExistingCommands() {
        //when-then
        Arrays.stream(CommandName.values())
                .forEach(commandName -> {
                    Command command = commandContainer.retrieveCommand(commandName.getCommandName());
                    Assertions.assertNotEquals(UnknownCommand.class, command.getClass());
                });
    }

    @Test
    public void shouldReturnUnknownCommand() {
        //given
        String unknownCommand = "/fgjhdfgdfg";

        //when
        Command command = commandContainer.retrieveCommand(unknownCommand);

        //then
        Assertions.assertEquals(UnknownCommand.class, command.getClass());
    }
}
