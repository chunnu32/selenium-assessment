package com.build.qa.build.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class AddToCartPage extends BasePage {
	
	private By btn_AddToCart;
	
	public AddToCartPage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		btn_AddToCart=By.xpath("//button[@data-original-title='Add to Cart']");
		
	}
	
	public void clickonAddToCart(){
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(btn_AddToCart)));
		driver.findElement(btn_AddToCart).click();
	}
	
	
}
