package com.github.MannaNebesnaya.telegrambot.command;


import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Command interface for handling telegram-bot commands.
 */
public interface Command {

    /**
     * Main method which is executing commands
     *
     * @param update provided {@link Update} object whith all needed data for command.
     */
    void execute(Update update);

}
