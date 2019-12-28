package com.stormnet.projects.functional.tests;

import com.stormnet.projects.functional.entities.helpers.HomeHelper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LamodaSearchTest {
    private HomeHelper homeHelper = new HomeHelper();
    private String searchKey = "jeans";

    @Test
    public void performSearch(){
        int countPerPage = homeHelper.search(searchKey)
                .getSearchResultsCountPerPage();
        Assert.assertTrue(countPerPage > 0, "No results were found!");
    }

    @AfterClass
    public void tearDown() {
        homeHelper.quit();
    }
}
