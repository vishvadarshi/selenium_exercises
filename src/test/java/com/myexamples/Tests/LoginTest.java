package com.myexamples.Tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myexamples.Data.UserDetails;
import com.myexamples.Framework.Report;
import com.myexamples.Pages.HomePage;
import com.myexamples.Pages.LoginPage;

@Listeners(Report.class)
public class LoginTest extends BaseTest {

    /*private String userName = "somethig";
    private String password = "letmein";*/

    @Test
    public void loginValidation(){

        UserDetails user = new UserDetails();

        HomePage h = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        h.clickLoginBtn();
        lp.navigateToHomePageAfterLogin(user.getuserName(), user.getpassWord());
        String name = h.validateUserAfterLogin();
        assertEquals(user.getuserName(), name);
        System.out.println(name+"=======================+");
    }
    @Test
    public void loginFailValidation() throws InterruptedException{
        
        UserDetails user1 = new UserDetails();
        UserDetails user = new UserDetails();

        HomePage h1 = new HomePage(driver);
        LoginPage lp1 = new LoginPage(driver);
        
        System.out.println("111111111111111111111111");
        h1.clickLoginBtn();
        System.out.println("22222222222222222222222222222222");
        lp1.navigateToHomePageAfterLogin(user1.getuserName1(), user1.getpassWord1());
        String name = h1.validateUserAfterLogin();
        //assertEquals(user.getuserName(), name);
        assertEquals(user1.getuserName1(), name);

        System.out.println(name);
    }
}
