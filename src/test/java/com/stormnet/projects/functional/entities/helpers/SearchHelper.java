package com.stormnet.projects.functional.entities.helpers;

import com.stormnet.projects.functional.entities.pages.SearchPage;

public class SearchHelper {
    private SearchPage searchPage = new SearchPage();

    public int getSearchResultsCountPerPage(){
        return searchPage.getResultsSizePerPage();
    }

    public int getAllResultsCount(){
        return Integer.parseInt(searchPage.getResultsCount().split(" ")[0]);
    }
}
