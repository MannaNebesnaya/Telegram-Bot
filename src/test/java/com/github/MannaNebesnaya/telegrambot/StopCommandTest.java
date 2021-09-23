package com.github.MannaNebesnaya.telegrambot;

import com.github.MannaNebesnaya.telegrambot.command.Command;
import com.github.MannaNebesnaya.telegrambot.command.StopCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.MannaNebesnaya.telegrambot.command.CommandName.STOP;
import static com.github.MannaNebesnaya.telegrambot.command.StopCommand.STOP_MESSAGE;

@DisplayName("Unit-level testing for StopCommand")
public class StopCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
