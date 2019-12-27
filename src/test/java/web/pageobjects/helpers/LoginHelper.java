package web.pageobjects.helpers;

import web.pageobjects.pages.LoginPage;

public class LoginHelper extends AbstractHelper {
    LoginPage loginPage = new LoginPage();

    public LoginHelper navigateToLoginPage(){
        System.out.println("Navigate to 'Login' page");
        loginPage.navigateToLoginPage();
        return this;
    }

    public LoginHelper login(String username, String password){
        System.out.println("Login system using Username: " + username + " and Password: " + password);
        navigateToLoginPage();
        loginPage.fillUsernameField(username);
        loginPage.clickEnterPassBtn();
        loginPage.fillPasswordField(password);
        loginPage.clickEnterPassBtn();
        return this;
    }

    public boolean checkPageWithEmailsOpened(){
        return loginPage.isWriteLetterBtnDisplayed();
    }
}
