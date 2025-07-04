package registeration;

import registeration.model.User;
import registeration.service.UserService;
import registeration.util.ConsoleUtil;
import registeration.util.UserValidator;

public class Application {
    private final UserService userService;

    public Application() {
        this.userService = new UserService();
    }

    public void run() {
        while (true) {
            ConsoleUtil.showMessage("1. Register\n2. Login\n3. Exit");
            int choice = Integer.parseInt(ConsoleUtil.readLine("Choose:"));
            switch (choice) {
                case 1 -> handleRegister();
                case 2 -> handleLogin();
                case 3 -> {
                    ConsoleUtil.showMessage("Exiting...");
                    return;
                }
                default -> ConsoleUtil.showMessage("Invalid choice");
            }
        }
    }

    private void handleRegister() {
        String username = ConsoleUtil.readLine("Enter username:");
        String password = ConsoleUtil.readLine("Enter password:");
        User user = new User(username, password);
        boolean success = userService.register(user);
        if (success) {
            ConsoleUtil.showMessage("Registration successful!");
        } else if (!UserValidator.isValidUsername(username) || !UserValidator.isValidPassword(password)) {
            ConsoleUtil.showMessage("Invalid username or password. Username must be 2-10 characters and password must be 4-8 characters.");
        } else {
            ConsoleUtil.showMessage("User already exists!");
        }
    }

    private void handleLogin() {
        int attempts = 0;
        while (attempts < 3) {
            String username = ConsoleUtil.readLine("Enter username:");
            String password = ConsoleUtil.readLine("Enter password:");
            User user = new User(username, password);
            if (userService.login(user)) {
                ConsoleUtil.showMessage("Login successful!");
                return;
            } else {
                attempts++;
                ConsoleUtil.showMessage("Invalid credentials. Attempts left: " + (3 - attempts));
            }
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
}
