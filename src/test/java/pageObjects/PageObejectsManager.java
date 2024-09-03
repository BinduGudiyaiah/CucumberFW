package pageObjects;

import org.openqa.selenium.WebDriver;
//This class is used to create the objects for all the pages
public class PageObejectsManager {

	public LandingPage landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	
	//creating the constructor for the activate the driver
	
	public PageObejectsManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		landingPage =new LandingPage(driver);
		return landingPage;
	}
	
	public OffersPage getOffersPage() {
		offersPage =new OffersPage(driver);
		return offersPage;
	}

}
