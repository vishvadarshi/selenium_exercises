package com.myexamples.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;

    By Cartbtn = By.id("nav-cart");
    By productsInCart =  By.xpath("//li[@id='nav-cart']/a/span");
    By toyItems = By.xpath("//*[@class='ng-binding'][1]");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCartbtn(){
        driver.findElement(Cartbtn).click();
    }

    public Boolean verifyItems(String itemName, String quantity) throws InterruptedException {
		List<WebElement> toys = driver.findElements(toyItems);
		int numberOfItems = toys.size();
		for(int i= 1; i <= numberOfItems; i++) {
			WebElement eachItem = driver.findElement(By.xpath("//*[@class='cart-item ng-scope']["+i+"]/td[1]"));
			String item = eachItem.getText();
			if(item.contains(itemName)) {
				Thread.sleep(2000);
				Boolean qua = driver.findElement(By.xpath("//*[@class='cart-item ng-scope']["+i+"]/td[3]/input")).getAttribute("value").contains(quantity);
				return qua;
			}
		} return false;
	}

}
