package registeration.service;

import registeration.model.User;
import registeration.util.UserValidator;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final List<User> users = new ArrayList<>();

    public boolean register(User user) {
        if (!UserValidator.isValidUsername(user.getUsername()) ||
                !UserValidator.isValidPassword(user.getPassword())) {
            return false;
        }
        if (users.contains(user)) {
            return false;
        }
        users.add(user);
        return true;
    }

    public boolean login(User user) {
        return users.contains(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
