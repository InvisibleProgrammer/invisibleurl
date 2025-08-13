package com.invisibleprogrammer.invisibleurl.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

    private static final Logger log = LoggerFactory.getLogger(SignUpController.class);

    @PostMapping("sign-up")
    public void signUp(@RequestBody SignUpRequest signUpRequest) {
        log.info("Sign-up for user: {}", signUpRequest.email());
    }
}
