package com.mercadolibre.tests.Language;

import com.mercadolibre.base.BaseTest;
import org.junit.Test;

public class LanguageTests extends BaseTest {

    @Test
    public void testLanguagePage() throws InterruptedException {
        languagePage.clickLanguageButton();

        mlMexicoPage.startSearchingProduct("playstation 5");

        mexicoListadoPage.getFirstFiveItems();
    }
}
