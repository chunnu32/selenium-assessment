package com.build.qa.build.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class ShoppingCartPage extends BasePage {
	
	private By cartProductName;
	//private By secondProductName;
	public ShoppingCartPage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		cartProductName=By.xpath("//a[@data-automation='cart-item-description']");
		//secondProductName=By.xpath("//a[@data-automation='kohler-caxton-rectangle-20-1-4-undermount-bathroom-sink-with-overflow']");
	}
	
	public String getCartProductName(){
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(cartProductName)));
		String text=driver.findElement(cartProductName).getText();
		return text;
	}
	
	
	
}
