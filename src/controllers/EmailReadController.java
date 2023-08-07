package controllers;

import models.EmailReadModel;
import utils.AppStarter;
import views.EmailReadView;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EmailReadController {

    EmailReadModel model;
    EmailReadView view;

    public EmailReadController(EmailReadModel model, EmailReadView view) {
        this.model = model;
        this.view = view;
    }

    public void getEmails() {
        view.getOutput(readEmails());
        restartApp();
    }

    public String readEmails() {
        Map<String, String> map = model.readEmails();
        AtomicInteger count = new AtomicInteger(0);
        StringBuilder stringBuilder= new StringBuilder();
        map.forEach((key, value) ->
                stringBuilder.append(count.incrementAndGet())
                        .append(") ")
                        .append(key)
                        .append(" ")
                        .append(value)
                        .append("\n")
        );
        return stringBuilder.toString();
    }

    private void restartApp() {
        AppStarter.startApp();
    }
}
