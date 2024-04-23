package APay;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/FeatureFiles", glue = "APay", dryRun = false, monochrome = true,
				plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				)


public class Apay_Runner extends AbstractTestNGCucumberTests {
//public class Apay_Runner {
	
	
	//tags ="@Dashboard" /APay_Dashboard.feature

}
