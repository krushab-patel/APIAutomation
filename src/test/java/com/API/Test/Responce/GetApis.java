package com.API.Test.Responce;

import io.restassured.response.Response;

public class GetApis extends BaseServices{

    private String BASE_PATH = "/user/getuserlocationrole?user_id=e2eea432-ec2d-4577-babd-25be2b3d1a60";

    public Response getuser(String token)
    {
        return getrequest(BASE_PATH, token);
    }
}
