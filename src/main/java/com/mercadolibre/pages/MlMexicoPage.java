package com.mercadolibre.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MlMexicoPage extends BasePage {

    private By searchField = By.id("cb1-edit");
    private By searchButton = By.className("nav-search-btn");

    public void setSearchField(String searchValue){
        set(searchField, searchValue);
    }

    public MexicoListadoPage clickSearchButton(){
        click(searchButton);
        return new MexicoListadoPage();
    }

    public MexicoListadoPage startSearchingProduct(String searchValue){
        setSearchField(searchValue);
        return clickSearchButton();
    }

}
