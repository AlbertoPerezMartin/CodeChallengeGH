package com.mercadolibre.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MexicoListadoPage extends BasePage {

    private By conditionFilterNuevo = By.xpath("/html/body/main/div/div[2]/aside/section[2]/div[5]/ul/li[1]/a");
    private By locationFilterDistritoFederal = By.xpath("//*[@id=\"root-app\"]/div/div[2]/aside/section[2]/div[10]/ul/li[1]/a");
    //private By dropdownOrderBy = By.xpath("//button[@aria-labelledby = \":R1b56ie:-label :R1b56ie:-display-values\"]//div[@class=\"andes-dropdown__standalone-arrow\"]");
    private By dropdownOrderBy = By.id(":R1b56ie:-trigger");
    private By orderByMayor = By.id(":R1b56ie:-menu-list-option-price_desc");
    private By cookieBanner = By.xpath("/html/body/div[4]/div[1]/div/div[2]/button[1]");
    private By itemsList = By.xpath("//div[@class=\"poly-card__content\"]");

    public void clickCookiesBanner(){
        waitUntilDisplayed(cookieBanner);
        click(cookieBanner);
    }

    public void clickConditionFilter() {
        waitUntilDisplayed(conditionFilterNuevo);
        click(conditionFilterNuevo);
    }

    public void clickLocationFilterDistritoFederal(){
        waitUntilDisplayed(locationFilterDistritoFederal);
        click(locationFilterDistritoFederal);
    }

    public void clickOrderByMayor() throws InterruptedException {
        Thread.sleep(500);
        click(dropdownOrderBy);
        //clickJs(dropdownOrderBy);
        Thread.sleep(500);
        click(orderByMayor);
    }

    public void getFirstFiveItems() throws InterruptedException {
        clickConditionFilter();
        clickCookiesBanner();
        clickLocationFilterDistritoFederal();
        clickOrderByMayor();
        waitUntilDisplayed(itemsList);
        List<WebElement> list = setElementsList(itemsList);


        for(int i = 0; i < 5; i++){
            String productString = list.get(i).findElement(By.xpath(".//a[@class=\"poly-component__title\"]")).getText();
            //If the price is commented all names are caught correctly
            //String priceString = list.get(i).findElement(By.xpath(".//div[@class=\"poly-price__current\"]/span[@class=\"andes-money-amount andes-money-amount--cents-superscript\"]/span[@class=\"andes-money-amount__fraction\"]")).getText();
            //System.out.println("Product: " + productString + ". Price: " + priceString +".");
            //Not sure why the code sometimes pushes 2 or 4 correct and then it suddenly fails. I think it has to do with the reviews, that's the only main difference between the last working xpath and the failing one
            System.out.println("Product: " + productString + ".");
        }
    }
}
