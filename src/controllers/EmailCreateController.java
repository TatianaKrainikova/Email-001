package controllers;

import database.entities.MailContact;
import models.EmailCreateModel;
import utils.AppStarter;
import views.EmailCreateView;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EmailCreateController {

    EmailCreateModel model;
    EmailCreateView view;
    MailContact email;

    public EmailCreateController(EmailCreateModel model, EmailCreateView view) {
        this.model = model;
        this.view = view;
    }

    public void addEmail() {
        email = view.doInputs();
        model.createEmail(email);
        view.getOutput(readEmails(model.createEmail(email)));
        restartApp();
    }

    public String readEmails(Map<String, String> map) {
        AtomicInteger count = new AtomicInteger(0);
        StringBuilder stringBuilder = new StringBuilder();
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
