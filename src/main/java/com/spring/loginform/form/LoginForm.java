package com.spring.loginform.form;

import lombok.Data;

@Data
public class LoginForm {
    private String username;
    private String password;

    public LoginForm() {
        super();
    }
}
