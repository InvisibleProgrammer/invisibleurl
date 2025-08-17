package com.invisibleprogrammer.invisibleurl.users;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    boolean signUp(User user);

    boolean exists(String email);
}
