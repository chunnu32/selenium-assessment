package com.build.qa.build.selenium.pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class HomePage extends BasePage {
	
	private By buildThemeBody;
	private By closePopUp;
	private By txt_Search;
	private By btn_Search;
	public HomePage(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
		buildThemeBody = By.cssSelector("body.build-theme");
		closePopUp=By.xpath("//button[@class='close js-modal-close ']");
		txt_Search=By.id("search_txt");
		btn_Search=By.xpath("//button[@class='button-primary search-site-search']");
	}
	
	public boolean onBuildTheme() { 
		return wait.until(ExpectedConditions.presenceOfElementLocated(buildThemeBody)) != null;
	}
	
	public void closePopUpButton(){
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(closePopUp)));
		driver.findElement(closePopUp).click();
	}
	
	public void enterOnSearchText(String text){
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(txt_Search)));
		driver.findElement(txt_Search).sendKeys(text);
	}
	
	public void clickSearchButton(){
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(txt_Search)));
		driver.findElement(btn_Search).click();
	}
}
