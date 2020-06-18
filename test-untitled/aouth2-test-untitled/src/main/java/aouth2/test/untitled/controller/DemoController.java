package aouth2.test.untitled.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/info")
    public Authentication authentication(Authentication authentication) {
        return authentication;
    }
}