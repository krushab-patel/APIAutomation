package com.API.Test.Responce;

import io.restassured.response.Response;
import org.testng.annotations.Test;


public class Forgot_password_test {

    @Test
    public void Forgot_Password() {
        AuthService authService = new AuthService();
        Response response = authService.Forgotpassword("kushab@owner");
        System.out.println(response.asPrettyString());
    }
}
