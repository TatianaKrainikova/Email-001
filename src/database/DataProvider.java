package database;

import database.entities.MailContact;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {

    static Map<String, String> map;

    public static Map<String, String> getData() {
        map = new HashMap<>();
        map.put("Alice", "alice@gmail.com");
        map.put("Bob", "bob@mail.com");
        map.put("Denis", "denis_ley@gmail.com");
        map.put("Tom", "tomas@dop.com");
        map.put("Samanta", "sem_leiko@mail.ru");
        return map;
    }

    public static Map<String, String> addData(MailContact name, MailContact email) {
        getData();
        map.put(name.getName(), email.getEmail());
        return map;
    }
}
