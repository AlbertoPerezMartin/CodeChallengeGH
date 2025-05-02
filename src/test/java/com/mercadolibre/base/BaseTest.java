package com.mercadolibre.base;

import com.mercadolibre.pages.BasePage;
import com.mercadolibre.pages.LanguagePage;
import com.mercadolibre.pages.MexicoListadoPage;
import com.mercadolibre.pages.MlMexicoPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected static WebDriver driver;
    protected static BasePage basePage;
    protected  static LanguagePage languagePage;
    protected  static MlMexicoPage mlMexicoPage;
    protected  static MexicoListadoPage mexicoListadoPage;
    private static String url = "https://www.mercadolibre.com/";

    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("profile.default_content_setting_values.cookies");

        basePage = new BasePage();
        basePage.setDriver(driver);
        languagePage = new LanguagePage();
        mlMexicoPage = new MlMexicoPage();
        mexicoListadoPage = new MexicoListadoPage();
    }

    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }
}
