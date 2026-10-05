package APIdemo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given; // static import using because not need to write rest assured key word into code
import static org.hamcrest.Matchers.equalTo;

/*

Get user :
https://betaapiv2.adit.com/auth/enc/secureWebLogin

Post request :
https://betaapiv2.adit.com/auth/enc/secureWebLogin

{"email":"owner@jalpa","password":"QcKfv6t0RsrXOdSFGH3KWjSAta+oanuJkciTRM6AEW4="}

Put Request : (Update request)
https://betaapiv2.adit.com/auth/enc/secureWebLogin

{"email":"owner@jalpa","password":"QcKfv6t0RsrXOdSFGH3KWjSAta+oanuJkciTRM6AEW4="} (Change something, update body)

Delete User :

https://betaapiv2.adit.com/auth/enc/secureWebLogin
204
 */

public class HttpsResponce {


    public static void secureWebLogin(){

        Map<String, String> body = new HashMap<>();
        body.put("email", "owner@jalpa");
        body.put("password", "QcKfv6t0RsrXOdSFGH3KWjSAta+oanuJkciTRM6AEW4=");

        Response response = given()
                .baseUri("https://betaapiv2.adit.com")
                .header("accept", "application/json, text/plain, */*")
                .header("authorization", "b7b0b89b.ba89.4622.aede.a039cca687f9")
                .header("content-type", "application/json")
                .body(body)
                .when()
                .post("/auth/enc/secureWebLogin");

        System.out.println("Status Code: " + response.getStatusCode());
        response.prettyPrint();
        Assert.assertEquals(response.statusCode() , 200);
    }
}
