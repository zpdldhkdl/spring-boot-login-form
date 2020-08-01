package com.spring.loginform.controller;

import com.spring.loginform.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping(path="/login")
    public String getLoginForm() {
        return "login";
    }

    @PostMapping(path="login")
    public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

        if(username.equals("admin") && password.equals("admin")) {
            return "home";
        }
        model.addAttribute("invaildAuth", true);
        return "login";
    }
}
