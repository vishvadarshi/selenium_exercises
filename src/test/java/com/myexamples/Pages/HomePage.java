package com.myexamples.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {

    WebDriver driver;

    @FindBy(id = "nav-home")
    WebElement home;

    

    @FindBy(id = "nav-contact")
    WebElement contact;

    @FindBy(xpath = "//a[text()='Start Shopping »']")
    WebElement startShoppingBtn;

    By shopTab = By.xpath("//a[text()='Shop']");
	
	/*  @FindBy(xpath = "//a[text()='Login']")
    WebElement loginbtn;*/

    By loginbtn = By.id("nav-login");
    By userName = By.id("nav-user");
    By shop = By.id("nav-shop");
    
    /*initialisation */
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    /*Actions */
    public void clickLoginBtn(){
        driver.findElement(loginbtn).click();
    }

    public String validateUserAfterLogin(){
        return driver.findElement(userName).getText();    
    }

    public void clickShopBtn(){
        driver.findElement(shopTab).click();
    }
}

