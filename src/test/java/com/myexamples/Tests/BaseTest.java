package com.myexamples.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;


public class BaseTest {
    public WebDriver driver;
    @BeforeTest
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\107.0.5304.62\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://jupiter.cloud.planittesting.com/");
        driver.manage().window().maximize();

    }

 

    /*@AfterTest
    public void quitBrowser(){
        driver.quit();
    }*/
        
}
