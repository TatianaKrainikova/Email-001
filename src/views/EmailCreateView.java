package views;

import database.entities.MailContact;
import models.EmailCreateModel;
import utils.EmailValidator;
import utils.NameValidator;

import java.util.Scanner;

public class EmailCreateView {

    EmailCreateModel model;
    MailContact email;
    String title;
    Scanner scanner;

    public EmailCreateView(EmailCreateModel model) {
        this.model = model;
    }

    public MailContact doInputs() {

        scanner = new Scanner(System.in);
        email = new MailContact();

        title = "Enter name: ";
        System.out.println(title);
        email.setName(NameValidator.validateNameInput(scanner));

        title = "Enter email: ";
        System.out.println(title);
        email.setEmail(EmailValidator.validateEmailInput(scanner));

        return email;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
