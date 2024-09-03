package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	
	public CheckoutPage (WebDriver driver) {
		this.driver = driver;
	}
	
	
	private By bag = By.className("cart-icon");
	private By add = By.xpath("//a[text()='+']");
	private By checkOutBtn = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	private By promoBtn = By.className("promoBtn");
	private By placeOrderBtn = By.xpath("//button[text()='Place Order']");
	
		
	public void addTocart() {
		driver.findElement(add).click();
	}
	
	public void viewCart() {
		driver.findElement(bag).click();
	}
	
	public void checkOutBtn() {
		driver.findElement(checkOutBtn).click();
	}
	
	public void promoBtn() {
		driver.findElement(promoBtn).click();
	}
	
	public void placeOrderBtn() {
		driver.findElement(placeOrderBtn).click();
	}

	public void CheckoutItems() {
		viewCart();
		checkOutBtn();
	}
	
	public boolean verifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public boolean verifyplaceOrderBtn() {
		return driver.findElement(placeOrderBtn).isDisplayed();
	}
}
