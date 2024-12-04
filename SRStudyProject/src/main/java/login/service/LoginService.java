package login.service;

import utils.KeysURL;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginService {
    // Aqui manipularemos o serviço de login, buscando as informações que precisamos
    // para repassar aos outros serviços
    public LoginService(){}

    public Response login(String email, String password){
        // Criação do headers e payload de login
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        Map<String, String> loginPayload = new HashMap<>();
        loginPayload.put("email", email);
        loginPayload.put("password", password);

        String url = KeysURL.BASE_URL + KeysURL.LOGIN_URL;

        return
            given()
                .headers(headers)
                .body(loginPayload)
            .when()
                .post(url)
            .then()
                .extract().response();
    }

}
