package web.pageobjects.helpers;

import web.pageobjects.pages.AbstractPage;

public class AbstractHelper {
    AbstractPage abstractPage = new AbstractPage();

    public void quit(){
        abstractPage.getDriver().quit();
    }
}
