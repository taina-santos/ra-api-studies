package login.api;

import io.restassured.response.Response;
import login.service.LoginService;

public class LoginAPI {
    LoginService loginService = new LoginService();
    private final String auth;
    private final int statusCode;
    private final String message;

    public LoginAPI(String email, String password) {
        // Ao invés de acessar e manipular as informações diretamente
        // (e facilitar posteriormente a manutenção),criamos a camada de API
        // para lidar com os requests
        Response response = loginService.login(email, password);
        auth = response.path("authorization");
        statusCode = response.statusCode();
        message = response.path("message");
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getAuth() {
        return auth;
    }

    public String getMessage() {
        return message;
    }
}
