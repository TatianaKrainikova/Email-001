package models;

import database.DataProvider;
import database.entities.MailContact;

import java.util.Map;

public class EmailCreateModel {

    public Map<String, String> createEmail(MailContact contact) {
        return DataProvider.addData(contact, contact);
    }

}
