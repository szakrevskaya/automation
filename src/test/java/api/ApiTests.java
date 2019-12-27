package api;

import api.entities.UserService;
import by.stormnet.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTests {
    private UserService userService = new UserService();

    @Test
    public void getAllUsersTest(){
        Response response = userService.getUsersList();
        int code = response.getCode();
        boolean containsEmail = response.getBody().contains("george.bluth@reqres.in");
        Assert.assertTrue(code == 200 && containsEmail, "Users are not available!");
    }

    @Test
    public void createNewUserTest(){
        String newUser = "{\"name\": \"morpheus\",\"job\": \"leader\"}";
        Response response = userService.createNewUser(newUser);
        int code = response.getCode();
        boolean containsUserName = response.getBody().contains("morpheus");
        Assert.assertTrue(code == 201 && containsUserName, "User is not created!");
    }

}
