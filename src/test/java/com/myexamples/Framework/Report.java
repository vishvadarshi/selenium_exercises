package com.myexamples.Framework;

import org.testng.Reporter;
import com.myexamples.Tests.BaseTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Report{
//public class Report extends BaseTest implements ITestListener {
    //String filepath;

   
    public static void LogStep(String step){
        Reporter.log(step, true);
    }

    public static void takeScreenShot(WebDriver driver) throws Exception{
        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile=new File("D:\\VISHVA\\SeleniumWebDriver\\pics\\test.png");
        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }

   /*  public void onTestStart(org.testng.ITestResult result) {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    
    public void onTestFailure(org.testng.ITestResult result) {



        try {
            
            takeSnapShot();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    
    }
 



