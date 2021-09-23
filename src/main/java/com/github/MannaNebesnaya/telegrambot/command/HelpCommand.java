package com.github.MannaNebesnaya.telegrambot.command;


import com.github.MannaNebesnaya.telegrambot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.github.MannaNebesnaya.telegrambot.command.CommandName.*;

/**
 * Help {@link Command}
 */

public class HelpCommand implements Command {
    private SendBotMessageService sendBotMessageService;

    public static final String HELP_MESSAGE = String.format("✨ <b>Доступные команды</b> ✨ \n\n"

            + "<b> Начать\\ закончить работу с ботом</b> \n"
            + "%s - начать работу\n"
            + "%s - закончить работу\n"
            + "%s - доступные команды",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());


    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
