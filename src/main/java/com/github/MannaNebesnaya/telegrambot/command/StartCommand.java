package com.github.MannaNebesnaya.telegrambot.command;

import com.github.MannaNebesnaya.telegrambot.service.SendBotMessageService;
import com.github.MannaNebesnaya.telegrambot.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Start {@link Command}
 */

public class StartCommand implements Command {
    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Привет. Я Telegram Bot. Мы тут реализуем всякие штучки." +
            "Я ещё маленький и набираюсь опыта.";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
