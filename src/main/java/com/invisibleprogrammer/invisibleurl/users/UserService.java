package com.invisibleprogrammer.invisibleurl.users;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new InMemoryUserRepository();
    }

    public boolean signUp(SignUpRequest request) {
        if (userRepository.exists(request.email())) {
            return false;
        }

        return userRepository.signUp(new User(request.email(), request.password()));
    }
}
