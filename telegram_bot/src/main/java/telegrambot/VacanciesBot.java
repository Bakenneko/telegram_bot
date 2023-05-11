package telegrambot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class VacanciesBot extends TelegramLongPollingBot {

        // 5795437222:AAGSYFXK0jCd7AUJH6WZd2hDlNw489TmLc0


    public VacanciesBot() {
        super("5795437222:AAGSYFXK0jCd7AUJH6WZd2hDlNw489TmLc0");
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println("event received");
    }

    @Override
    public String getBotUsername() {
        return "akurylyk vacancies bot";
    }
}
