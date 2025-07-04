package registeration.util;

public class UserValidator {
    private UserValidator() throws Exception {
        throw new Exception("Utility class");
    }
    public static boolean isValidUsername(String username) {
        return username.length() >= 2 && username.length() <= 10;
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 4 && password.length() <= 8;
    }
}
