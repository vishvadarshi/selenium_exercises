package com.myexamples.Tests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest {
    public WebDriver driver;
    
    @BeforeMethod
    public void launchBrowser() throws InterruptedException {

        System.out.println("CALLING BEFORE METHOD #################################################");

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\107.0.5304.62\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://jupiter.cloud.planittesting.com/");
        driver.manage().window().maximize();

    }

    public void takeSnapShot() throws Exception{
        //Convert web driver object to TakeScreenshot


        TakesScreenshot scrShot =((TakesScreenshot)this.driver);
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile=new File("D:\\VISHVA\\SeleniumWebDriver\\pics\\test.png");
        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
        
}
