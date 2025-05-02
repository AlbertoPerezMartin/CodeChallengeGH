package com.mercadolibre.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MexicoListadoPage extends BasePage {

    private By conditionFilterNuevo = By.xpath("/html/body/main/div/div[2]/aside/section[2]/div[5]/ul/li[1]/a");
    private By locationFilterDistritoFederal = By.xpath("//*[@id=\"root-app\"]/div/div[2]/aside/section[2]/div[10]/ul/li[1]/a");
    private By dropdownOrderBy = By.id(":R1b56ie:-display-values");
    private By orderByMayor = By.id(":R1b56ie:-menu-list-option-price_desc");
    private By cookieBanner = By.xpath("/html/body/div[4]/div[1]/div/div[2]/button[1]");
    private List<By> firstFiveItems = new ArrayList<>();
    private HashMap<String,String> itemsMap = new HashMap<String,String>();

    public void clickCookiesBanner() throws  InterruptedException{
        Thread.sleep(500);
        click(cookieBanner);
    }

    public void clickConditionFilter() throws InterruptedException {
        Thread.sleep(500);
        click(conditionFilterNuevo);
    }

    public void clicklocationFilterDistritoFederal() throws InterruptedException{
        Thread.sleep(500);
        click(locationFilterDistritoFederal);
    }

    public void getFirstFiveItems() throws InterruptedException {
        clickConditionFilter();
        clickCookiesBanner();
        clicklocationFilterDistritoFederal();
        clickorderByMayor();
        itemsMap.put(find(By.xpath("//*[@id=\"root-app\"]/div/div[2]/section/div[6]/ol/li[1]/div/div/div/div[2]/h3/a/text()")).getText(),find(By.xpath("//*[@id=\"root-app\"]/div/div[2]/section/div[6]/ol/li[1]/div/div/div/div[2]/div/div[1]/div[1]/div/span/span[2]")).getText());
        System.out.println(itemsMap);
        firstFiveItems.add(By.xpath(""));
        firstFiveItems.add(By.xpath(""));
        firstFiveItems.add(By.xpath(""));
        firstFiveItems.add(By.xpath(""));
    }

    public void clickorderByMayor() throws InterruptedException{
        Thread.sleep(500);
        click(dropdownOrderBy);
        Thread.sleep(500);
        click(orderByMayor);
    }

    public void startFilteringAndSorting() throws InterruptedException {
        clickConditionFilter();
        clickCookiesBanner();
        clicklocationFilterDistritoFederal();
        clickorderByMayor();
    }

}
