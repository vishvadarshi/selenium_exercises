package com.myexamples.Framework;

import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

import com.myexamples.Pages.HomePage;
import com.myexamples.Tests.BaseTest;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Report extends BaseTest implements ITestListener {

    String filepath;

    public static void LogStep(String step){
        Reporter.log(step, true);
    }



    public void onTestStart(org.testng.ITestResult result) {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    
    public void onTestFailure(org.testng.ITestResult result) {



        try {
            // if (driver == null) {
            //     launchBrowser();
            // }

            takeSnapShot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    }
 



