package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class OfferPageStepDefinitions {
	
	
public String offerpageProductname;

TestContextSetup testContextSetup;

//single responsibility Principle -- meaning 1 stepdefn file should take care of the particular page only. 
//loosely coupled -- We can access the methods and variables from the other classes also.
/*
 * Loosely coupled --  this can be achieved by creating the class and we need to provide the variables that shared across the files.
 * Then we need to create the constructor in a particular page and pass the instance of the class which has the shared variables
 * 
 * Other example for Looely coupling is switching to other window was written inside the @Then annotation it is restricted to that only we cannot reuse that code if we want to check the pagination
 * 
 * In order to reuse the code we need to create the method and provide the reqd number lines of code in the method and then we should call the method in the required annotation
 * 
 */
public OfferPageStepDefinitions(TestContextSetup testContextSetup) {
	this.testContextSetup=testContextSetup;
}

	@Then("^User searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortname) throws InterruptedException {
	    System.out.println("User searched for same shortname in offers page to check if product exist");
		
		switchToOffersPage();
		OffersPage offersPage =  testContextSetup.pageObejectsManager.getOffersPage();
		offersPage.searchItem(shortname);
		
		Thread.sleep(2000);
		offerpageProductname= offersPage.getProductName();
	}
	
	public void switchToOffersPage() {
		//if you are already switched to offer page --> skip the below part
	//	if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase(offerpageProductname))
		
		LandingPage landingPage = testContextSetup.pageObejectsManager.getLandingPage();
		landingPage.selectTopDeals();
		testContextSetup.genericUtils.SwitchWindowToChild();
	}
	
	@Then("Validate product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page_matches_with_Landing_page() {
		
		Assert.assertEquals(offerpageProductname, testContextSetup.landingPageproductName);
	}
}
