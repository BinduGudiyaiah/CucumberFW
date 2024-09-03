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
import utils.TestContextSetup;

public class CheckoutPageStepDefinitions {
	
	
TestContextSetup testContextSetup;

public CheckoutPageStepDefinitions(TestContextSetup testContextSetup) {
	this.testContextSetup=testContextSetup;
}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		System.out.println("User is on GreenCart Landing page");
	}
	
	
	@When("^User searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		System.out.println("------User searched with Shortname {string}-----");
		
		LandingPage landingPage = testContextSetup.pageObejectsManager.getLandingPage();
		landingPage.searchItem(shortname);
		
		Thread.sleep(2000);
		testContextSetup.landingPageproductName=landingPage.getProductName().split("-")[0].trim();
		
		System.out.println("Home page product name: "+testContextSetup.landingPageproductName);
		
	}
		
}
