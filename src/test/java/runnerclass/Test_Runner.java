package runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import BaseClass.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//features", 
					 glue = "stepdefinition",
					 plugin={"pretty",
					 		"html:target/Html_Report",
					 		"json:target/Json_Report.json",
					 		"com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Report.html"})
public class Test_Runner extends Base_Class{

	@BeforeClass
	public static void setup() {

		browserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() {
		
		quitBrowser();

	}

}
