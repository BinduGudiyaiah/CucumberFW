package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public WebDriver driver;

public WebDriver WebDriverManager() throws IOException {
	FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//src//test//resoucres//config.properties");
	Properties prop = new Properties();
	prop.load(file);
	if(driver==null)
	{
	driver = new ChromeDriver();
	driver.get(prop.getProperty("QAURL"));
	}
	return driver;
	
	
}
}
