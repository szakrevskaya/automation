package web.pageobjects;

import by.stormnet.core.utils.IOUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import web.pageobjects.helpers.LoginHelper;

public class LoginTests {
    private LoginHelper loginHelper = new LoginHelper();
    private String username;
    private String password;

    @BeforeClass
    public void setUp() {
        username = IOUtils.loadGenericProperty("username", "configuration");
        password = IOUtils.loadGenericProperty("password", "configuration");
    }

    @Test(priority = 1)
    public void loginTests() {
        loginHelper.login(username, password);
        Assert.assertTrue(loginHelper.checkPageWithEmailsOpened(), "User is not logged in successfully");
    }

    @AfterClass
    public void tearDown() {
        loginHelper.quit();
    }

}
