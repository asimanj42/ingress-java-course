package registeration.util;

import java.util.Scanner;

public class ConsoleUtil {
    private ConsoleUtil() throws Exception {
        throw new Exception("Utility class");
    }
    private final static Scanner scanner = new Scanner(System.in);

    public static String readLine(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }
}
