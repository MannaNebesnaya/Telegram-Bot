package com.github.MannaNebesnaya.telegrambot;

import com.github.MannaNebesnaya.telegrambot.command.Command;
import com.github.MannaNebesnaya.telegrambot.command.StartCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.MannaNebesnaya.telegrambot.command.CommandName.START;
import static com.github.MannaNebesnaya.telegrambot.command.StartCommand.START_MESSAGE;

@DisplayName("Unit-level testing for StartCommand")
class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}
