package com.myexamples.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.myexamples.Framework.Report;

public class LoginPage {

    WebDriver driver;
   
    By loginTitle = By.xpath("//h1[text()='Login']");
    By userName = By.id("loginUserName");
    By password = By.id("loginPassword");
    By loginButton = By.xpath("//button[text()='Login']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public String validateLoginTitle(){   /*had to changed from string to webeliment. is this correct? */
        return driver.findElement(loginTitle).getText();
    }

    public HomePage navigateToHomePageAfterLogin(String un, String pw){
        
        driver.findElement(userName).sendKeys(un);
        driver.findElement(password).sendKeys(pw);
        driver.findElement(loginButton).click();
        try {
            Report.takeScreenShot(driver) ;
        } catch (Exception e) {
        
            e.printStackTrace();
        }
        return new HomePage(driver);
        
    }
}
