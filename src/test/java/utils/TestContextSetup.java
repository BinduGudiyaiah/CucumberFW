package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObejectsManager;

//This is class is created to eliminate the object creation in the step definition page
//This class is very important class through this class we are sending driver to every other class
//in other words entire frame work
public class TestContextSetup {
	
	public WebDriver driver;
	public String landingPageproductName;
	public String offerpageProductname;
	public TestBase testBase;
	
	public PageObejectsManager pageObejectsManager;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObejectsManager = new PageObejectsManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
}
