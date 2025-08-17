package com.invisibleprogrammer.invisibleurl.users;

import java.util.Objects;

public record User(String email, String passwordHash) {
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(passwordHash, user.passwordHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, passwordHash);
    }
}
