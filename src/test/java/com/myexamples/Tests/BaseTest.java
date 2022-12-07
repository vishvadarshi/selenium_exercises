package com.myexamples.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {
    public WebDriver driver;
    @BeforeTest
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\107.0.5304.62\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://jupiter.cloud.planittesting.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }

 

    @AfterTest
    public void quitBrowser(){
        driver.quit();
    }
        
}
