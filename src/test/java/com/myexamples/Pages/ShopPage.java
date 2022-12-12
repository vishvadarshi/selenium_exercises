package com.myexamples.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {
    WebDriver driver;
    
    By toyTitles = By.xpath("//*[@class='product-title ng-binding']");
    
	By buyBtn = By.xpath("//*[@class='btn btn-success']");

    public  ShopPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectToys(String toyName, String numberOfItems){
        List<WebElement> toys = driver.findElements(toyTitles);
        int numberofToys = toys.size();

        for(int i = 0; i < numberofToys; i++){
            String nameOfTheToy = toys.get(i).getText();
            if(nameOfTheToy.contains(toyName)){
                for(int y = 1; y <= Integer.parseInt(numberOfItems); y++){
                    driver.findElements(buyBtn).get(i).click();
                }
            }
        }
    }
    
}
