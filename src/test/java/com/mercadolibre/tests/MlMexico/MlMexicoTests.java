package com.mercadolibre.tests.MlMexico;

import com.mercadolibre.base.BaseTest;
import com.mercadolibre.pages.MexicoListadoPage;
import com.mercadolibre.pages.MlMexicoPage;
import org.junit.Test;

public class MlMexicoTests extends BaseTest {

    @Test
    public void testMlMexicoPage() throws InterruptedException {
        MexicoListadoPage listadoPage = mlMexicoPage.startSearchingProduct("playstation 5");
        listadoPage.startFilteringAndSorting();

    }
}
