package com.API.Test.Responce;

import com.API.Test.Deserilization.LoginResponce;
import com.API.Test.Request.CreateUser;
import com.API.Test.Request.LoginRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CreateUserTest {

    @Test
    public void createUserTest() {

        // 1. login first to get token
        LoginRequest loginRequest = new LoginRequest("kushab@admin","FTzTOUx/LZvFi7mrfpTpWw==");
        AuthService authService = new AuthService();
        Response loginresponse  = authService.loginservice(loginRequest);
        LoginResponce loginResponce = loginresponse.as(LoginResponce.class);
        String token = loginResponce.getToken();

        // 2. Use this token to create user
        CreateUser createUser = new CreateUser.Builder()
                .Firstname("stacy")
                .Lastname("adit")
                .Email("stacy" + System.currentTimeMillis() + "@adit.com")
                .Username("stacy" + System.currentTimeMillis() + "@owner")
                .Password("stacy@adit.com")
                .Userole("766b28df-92a1-40cc-a3c8-9822a5ba8e69")
                .IsSendEmail(false)
                .Apps(List.of(
                        "0c0941e4-1722-11ee-be56-0242ac120002",
                        "5aad8fe6-c3f9-444f-82ff-7ea2c6d6c48b",
                        "b5928b68-4d55-4387-8c04-638dda785c78",
                        "40a650bf-6484-4d2f-a373-807029500b77",
                        "ab24771d-353f-4fce-9bb4-fa8ae24f5e46",
                        "d7afe00b-a89f-43e4-b7f1-6801e905eed2",
                        "119fa0da-a80d-46d2-9e54-67487b0a63d7",
                        "19cb5797-0d9e-48ca-a2ea-8576aa914f89",
                        "80b93b39-38ac-49ef-95f6-504b149bc664",
                        "40a650bf-6484-4d2f-a373-807029500b76",
                        "8c76b282-3af7-4d3c-b772-b0695385f8ff",
                        "e6c028df-8eff-4d0f-85e4-d5a9514009e9",
                        "4f4ade1f-129e-4036-a27c-7b9eacd1587c",
                        "ad056d84-eab7-42b8-8a64-06833a253234"
                ))
                .Organizations(List.of("960c490b-58f5-4a7c-a817-5c24c1316fcc"))
                .addLocationRole("6cb1d565-a691-451f-8a0f-9cfb6a590c02", "766b28df-92a1-40cc-a3c8-9822a5ba8e69")
                .build();

       Response response = authService.CreateUser(createUser,token);

        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asPrettyString());

        boolean success = response.jsonPath().getBoolean("status");
        String message = response.jsonPath().getString("message");
 

        Assert.assertEquals(response.getStatusCode(), 200); // or 201, whatever success is for this API

    }
}