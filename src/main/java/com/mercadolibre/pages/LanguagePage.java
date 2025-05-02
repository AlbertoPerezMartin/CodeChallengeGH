package com.mercadolibre.pages;

import org.openqa.selenium.By;

public class LanguagePage extends BasePage {

    private By mxnBtn = By.id("MX");

    public MlMexicoPage clickLanguageButton(){
        click(mxnBtn);
        return new MlMexicoPage();
    }



}
