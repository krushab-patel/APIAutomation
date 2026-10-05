package com.API.Test.Responce;


import com.API.Test.Deserilization.LoginResponce;
import com.API.Test.Deserilization.UserAPIResponce;
import com.API.Test.Request.LoginRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetAPIResponce {

    @Test

    // 1] Call login API to get token
    public void getapi() {
        // 1] Call login API to get token

        LoginRequest loginRequest = new LoginRequest("owner@jalpa","QcKfv6t0RsrXOdSFGH3KWjSAta+oanuJkciTRM6AEW4=");
        AuthService authService = new AuthService();
        Response response = authService.loginservice(loginRequest);
        LoginResponce loginResponce = response.as(LoginResponce.class);
        String token = loginResponce.getToken();


        // 2] call get API

        GetApis getApis = new GetApis();
        Response apiResponce = getApis.getuser(token);
        System.out.println(apiResponce.asPrettyString());
        UserAPIResponce getAPIResponce = apiResponce.as(UserAPIResponce.class);
        System.out.println(getAPIResponce.getData());

    }
}
