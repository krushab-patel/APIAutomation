package APITEST;


import APIdemo.HttpsResponce;
import org.testng.annotations.Test;

public class Responce {

    @Test
    public void login()

    {
        HttpsResponce.secureWebLogin();
    }
}
