package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage (WebDriver driver) {
		this.driver = driver;
	}
	
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("h4.product-name");
	private By topDeals = By.xpath("//a[text()='Top Deals']");
	
	public void searchItem(String shortname) {
			
			driver.findElement(search).sendKeys(shortname);		
	}
	
	public void getSearchText() {
		driver.findElement(search).getText();
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDeals() {
		driver.findElement(topDeals).click();
	}

	
}
