package com.github.MannaNebesnaya.telegrambot.command;

import com.github.MannaNebesnaya.telegrambot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * UnknownCommand {@link Command}
 */

public class UnknownCommand implements Command {
    private SendBotMessageService sendBotMessageService;

    public static final String UNKNOWN_MESSAGE = "Я вас что-то не понимаю." +
            "Напишите /help, чтобы посмотреть список доступных команд.";

    public UnknownCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), UNKNOWN_MESSAGE);
    }
}
