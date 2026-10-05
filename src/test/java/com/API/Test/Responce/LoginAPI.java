package com.API.Test.Responce;


import com.API.Test.Deserilization.LoginResponce;
import com.API.Test.Request.LoginRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*Serialization and Deserilization

Java Object (LoginRequest)
        │
        │  SERIALIZATION (Java → JSON)
        ▼
   JSON sent in HTTP request body
        │
        ▼
     [API Server processes it]
        │
        ▼
   JSON returned in HTTP response body
        │
        │  DESERIALIZATION (JSON → Java)
        ▼
Java Object (LoginResponce)

 */

@Listeners(com.java.listeners.TestListener.class)
public class LoginAPI {

    @Test
    public void LoginAPItest() {

        LoginRequest loginRequest = new LoginRequest("kushab@admin","FTzTOUx/LZvFi7mrfpTpWw==");
        AuthService authService = new AuthService();
        Response response  = authService.loginservice(loginRequest);
        LoginResponce loginResponce = response.as(LoginResponce.class);

        System.out.println(response.asPrettyString());
        System.out.println(loginResponce.getToken());

        Assert.assertTrue(loginResponce.getToken() != null);
    }
}
