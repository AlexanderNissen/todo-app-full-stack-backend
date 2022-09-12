package com.alexandernissen.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {

    @GetMapping("/basicauth")
    public AuthenticationBean AuthenticationBean() {
        return new AuthenticationBean("You are authenticated");
    }
}
