package com.myexamples.Tests;


import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.myexamples.Pages.CartPage;
import com.myexamples.Pages.HomePage;
import com.myexamples.Pages.ShopPage;

import dev.failsafe.internal.util.Assert;

public class ShopTest extends BaseTest {

    private String toyName = "Stuffed Frog";
    private String items = "2";
    
    @Test
    public void buyShopItems() throws InterruptedException{
        HomePage homeP = new HomePage(driver);
        homeP.clickShopBtn();
        ShopPage shopP = new ShopPage(driver);
        shopP.selectToys(toyName, items);
        CartPage cartP = new CartPage(driver);
        cartP.clickCartbtn();
        Boolean verifyToy1 = cartP.verifyItems(toyName, items);
        assertTrue(verifyToy1);        
    }   
}
