package com.myexamples.Tests;

import java.io.File;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.myexamples.Framework.Report;
import com.myexamples.Framework.Settings;


public class BaseTest {
    public WebDriver driver;
    
    @BeforeMethod
    public void launchBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\107.0.5304.62\\chromedriver.exe");
        driver = new ChromeDriver();
        //Settings.readSettings();
        //driver.manage().timeouts().implicitlyWait(Settings.getTimeout_seconds(), TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://jupiter.cloud.planittesting.com/");
        
        //driver.get(Settings.getUrl());
        driver.manage().window().maximize();

    }

   /*public void takeSnapShot() throws Exception{
        //Convert web driver object to TakeScreenshot


        TakesScreenshot scrShot =((TakesScreenshot)this.driver);
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile=new File("D:\\VISHVA\\SeleniumWebDriver\\pics\\test.png");
        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }*/

   /*  @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }*/

    @AfterMethod
    public void teardown(ITestResult result){
        
        if(!result.isSuccess()){
            try {
                Report.takeScreenShot(driver);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

       // driver.quit();
    }
        
}
