package com.suhas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome!";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome! User";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome! Admin";
    }
}
