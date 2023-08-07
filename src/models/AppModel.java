package models;

import controllers.EmailCreateController;
import controllers.EmailReadController;
import views.EmailCreateView;
import views.EmailReadView;

public class AppModel {

    private int choice;

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void addEmail() {
        EmailCreateModel model = new EmailCreateModel();
        EmailCreateView view = new EmailCreateView(model);
        EmailCreateController controller = new EmailCreateController(model, view);
        controller.addEmail();
    }

    public void readEmails() {
        EmailReadModel model = new EmailReadModel();
        EmailReadView view = new EmailReadView(model);
        EmailReadController controller = new EmailReadController(model, view);
        controller.getEmails();
    }
}
