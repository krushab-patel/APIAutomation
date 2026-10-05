package com.API.Test.Request;

public class LoginRequest {

    private String Email;
    private String Password;

    public LoginRequest(String Email, String Password) {
        this.Email = Email;
        this.Password = Password;

    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String username) {
        Email = username;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
