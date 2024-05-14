package APay;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class APay_Hooks extends APay_Baseclass{
	
		@AfterStep
	    public static void tearDown(Scenario scenario) {
	 
	        //validate if scenario has failed
	        if(scenario.isFailed()) {
	        	
	        	TakesScreenshot screenshot = (TakesScreenshot) driver;
	            byte[] screenshottaken = screenshot.getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshottaken, "image/png", "Screenshot");
	            }
	        }   
	      

	}
