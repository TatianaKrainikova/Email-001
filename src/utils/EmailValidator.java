package utils;

import java.util.Scanner;

public class EmailValidator {

    public static String validateEmailInput(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println(Constants.EMAIL_EMPTY_MSG);
            str = scanner.nextLine().trim();
        }
        return str;
    }
}
