package login;

import login.api.LoginAPI;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class LoginTestIT {
    @Test
    public void login_successfully(){
        LoginAPI loginAPI = new LoginAPI("tainaqa@test.com", "teste123");
        assertEquals(HttpStatus.SC_OK, loginAPI.getStatusCode());
        assertEquals("Login realizado com sucesso", loginAPI.getMessage());
        assertNotEquals("", loginAPI.getAuth());
    }
}
