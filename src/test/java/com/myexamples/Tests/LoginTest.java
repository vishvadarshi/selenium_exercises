package com.myexamples.Tests;


import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import com.myexamples.Data.UserDetails;
import com.myexamples.Pages.HomePage;
import com.myexamples.Pages.LoginPage;


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
        System.out.println(name);
    }
}
