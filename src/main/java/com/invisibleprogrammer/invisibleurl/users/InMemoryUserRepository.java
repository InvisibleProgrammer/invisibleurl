package com.invisibleprogrammer.invisibleurl.users;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserRepository implements UserRepository {
    private final List<User> users = new ArrayList<>();

    @Override
    public boolean signUp(User user) {
        if (users.contains(user)) {
            return false;
        }

        users.add(user);
        return true;
    }

    @Override
    public boolean exists(String email) {
        return users.stream().anyMatch(u -> email.equals(u.email()));
    }
}
