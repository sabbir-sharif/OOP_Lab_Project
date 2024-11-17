package com.loginDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerHtmlController {

        @GetMapping("/register")
        public String showRegisterPage() {
            return "register"; // This matches the register.html file in the templates folder
        }

        @GetMapping("/login")
        public String showLoginPage() {
            return "login"; // This matches the login.html file in the templates folder
        }

}
