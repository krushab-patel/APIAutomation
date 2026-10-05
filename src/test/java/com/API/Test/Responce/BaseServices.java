package com.API.Test.Responce;

import com.API.Test.Request.LoginRequest;
import com.API.filters.LoggingFilter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseServices {

    private static final String BASE_URL = "https://betaapiv2.adit.com";
    RequestSpecification requestSpecification;

    static {
        RestAssured.filters(new LoggingFilter());
    }

    public BaseServices()
    {
        requestSpecification = RestAssured.given().baseUri(BASE_URL);
    }

    protected Response postresponce(Object payload, String endpoint)    // Using object because it's use for all API so it's made universal methods
    {
       return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }

    protected Response PostAuthenticated (Object payload, String endpoint, String token)
    {
        return requestSpecification
                .body(payload)
                .contentType(ContentType.JSON)
                .header("Authorization",token)
                .post(endpoint);
    }

    protected Response getrequest(String endpoint,  String token)
    {
        return requestSpecification.header("Authorization",token).get(endpoint);
    }
}
