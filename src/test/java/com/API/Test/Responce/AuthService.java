package com.API.Test.Responce;

import com.API.Test.Request.CreateUser;
import com.API.Test.Request.LoginRequest;
import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends BaseServices {

    private static final String LOGIN_PATH = "/auth/enc/";
    private static final String USER_PATH = "/";
    private static final String FORGOT_PASSWORD_PATH = "/auth/";

    public Response loginservice(LoginRequest payload)
    {
       return postresponce(payload, LOGIN_PATH+ "secureWebLogin");
    }

    public Response CreateUser(CreateUser payload, String token)
    {
        return PostAuthenticated(payload,USER_PATH + "user",token);
    }

    public Response Forgotpassword(String username)
    {
        HashMap<String,String> payload = new HashMap<String,String>();
        payload.put("username" , username);
        return postresponce(payload, FORGOT_PASSWORD_PATH + "forgotPassword");
    }

}