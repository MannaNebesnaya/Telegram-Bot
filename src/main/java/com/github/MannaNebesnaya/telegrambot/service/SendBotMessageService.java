package com.github.MannaNebesnaya.telegrambot.service;

/**
 * Service for sending message via telegram-bot.
 */

public interface SendBotMessageService {


    /**
     * Send message for telegram-bot
     *
     * @param chatId
     * @param message
     */
    void sendMessage(String chatId, String message);

}
