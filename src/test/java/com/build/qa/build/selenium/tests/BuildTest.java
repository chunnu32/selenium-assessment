package com.build.qa.build.selenium.tests;

import org.junit.Test;
import org.openqa.selenium.By;

import com.build.qa.build.selenium.framework.BaseFramework;
import com.build.qa.build.selenium.pageobjects.AddToCartPage;
import com.build.qa.build.selenium.pageobjects.SearchPage;
import com.build.qa.build.selenium.pageobjects.ShoppingCartPage;
import com.build.qa.build.selenium.pageobjects.homepage.HomePage;

public class BuildTest extends BaseFramework {

	/**
	 * Extremely basic test that outlines some basic
	 * functionality and page objects as well as assertJ
	 */

	@Test
	public void navigateToHomePage() {
		driver.get(getConfiguration("HOMEPAGE"));
		HomePage homePage = new HomePage(driver, wait);

		softly.assertThat(homePage.onBuildTheme())
			.as("The website should load up with the Build.com desktop theme.")
			.isTrue();
	}

	/**
	 * Search for the Quoizel MY1613 from the search bar
	 * @assert: That the product page we land on is what is expected by checking the product title
	 * @difficulty Easy
	 */
	@Test
	public void searchForProductLandsOnCorrectProduct() {
		// TODO: Implement this test]
		driver.get(getConfiguration("HOMEPAGE"));
		HomePage homePage = new HomePage(driver, wait);
		homePage.closePopUpButton();
		homePage.enterOnSearchText("Quoizel MY1613");
		homePage.clickSearchButton();
		softly.assertThat(driver.getTitle()).as("Search Result page should display").isEqualTo("Quoizel My1613");
	
	}

	/**
	 * Go to the Bathroom Sinks category directly (https://www.build.com/bathroom-sinks/c108504)
	 * and add the second product on the search results (Category Drop) page to the cart.
	 * @assert: the product that is added to the cart is what is expected
	 * @difficulty Easy-Medium
	 */
	@Test
	public void addProductToCartFromCategoryDrop() {
		// TODO: Implement this test
		
		driver.get("https://www.build.com/bathroom-sinks/c108504");
		HomePage homePage = new HomePage(driver, wait);
		homePage.closePopUpButton();
		SearchPage sp=new SearchPage(driver, wait);
		String productName=sp.getSecondProductName();
		sp.clickonSecondProduct();
		AddToCartPage ap=new AddToCartPage(driver, wait);
		ap.clickonAddToCart();
		ShoppingCartPage shp=new ShoppingCartPage(driver, wait);
		String cartProduct=shp.getCartProductName();

		softly.assertThat(cartProduct)
			.as("product that is added to the cart is what is expected")
			.isEqualTo(productName);
	}

	/**
	 * Add a product to the cart and email the cart to yourself, also to my email address: test.automation+SeleniumTest@build.com
	 * Include this message in the "message field" of the email form: "This is {yourName}, sending you a cart from my automation!"
	 * @assert that the "Cart Sent" success message is displayed after emailing the cart
	 * @difficulty Medium-Hard
	 */
	
	@Test
	public void addProductToCartAndEmailIt() {
		// TODO: Implement this test
		
		// I am not able to find out this functionality
	}

	/**
	 * Go to a category drop page (such as Bathroom Faucets) and narrow by
	 * at least two filters (facets), e.g: Finish=Chromes and Theme=Modern
	 * @assert that the correct filters are being narrowed, and the result count
	 * is correct, such that each facet selection is narrowing the product count.
	 * @difficulty Hard
	 */
	
	@Test
	public void facetNarrowBysResultInCorrectProductCounts() {
		// TODO: Implement this test
		// I am not able to find out this functionality
		
	
	}
}
