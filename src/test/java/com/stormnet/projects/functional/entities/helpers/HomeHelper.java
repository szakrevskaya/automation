package com.stormnet.projects.functional.entities.helpers;

import com.stormnet.projects.functional.entities.pages.HomePage;

public class HomeHelper extends AbstractHelper {
    private HomePage homePage = new HomePage();

    public HomeHelper navigateToHomePage(){
        System.out.println("Navigate to 'Home' page");
        homePage.navigateToHomePage();
        return this;
    }

    public SearchHelper search(String searchKey){
        navigateToHomePage();
        homePage
                .fillSearchField(searchKey)
                .clickSearchButton();
        return new SearchHelper();
    }


}
