package com.stormnet.projects.functional.entities.helpers;

import com.stormnet.projects.functional.entities.pages.AbstractPage;

public class AbstractHelper {
    AbstractPage abstractPage = new AbstractPage();

    public void quit(){
        abstractPage.getDriver().quit();
    }
}
