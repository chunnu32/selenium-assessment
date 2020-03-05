package com.build.qa.build.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class SearchPage extends BasePage {
	
	private By secondProduct;
	//private By secondProductName;
	public SearchPage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		secondProduct=By.xpath("(//a[@class='js-product-link theme-grey-dark db'])[2]");
		//secondProductName=By.xpath("//a[@data-automation='kohler-caxton-rectangle-20-1-4-undermount-bathroom-sink-with-overflow']");
	}
	
	public void clickonSecondProduct(){
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(secondProduct)));
		driver.findElement(secondProduct).click();
	}
	
	public String getSecondProductName(){
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(secondProduct)));
		String productName=driver.findElement(secondProduct).getAttribute("data-automation");
		return productName;
	}
	
}
