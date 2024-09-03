package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//only if you want to compile the code and not run the code then we need to include drayRun=true in the below attributes


@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",monochrome=true,
plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"})

public class TestNG_TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
 
