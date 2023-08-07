package views;

import models.EmailReadModel;

public class EmailReadView {

    EmailReadModel model;

    public EmailReadView(EmailReadModel model) {
        this.model = model;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
