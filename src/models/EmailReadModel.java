package models;

import database.DataProvider;

import java.util.Map;

public class EmailReadModel {

    public Map<String, String> readContacts() {
        return DataProvider.getData();
    }
}
