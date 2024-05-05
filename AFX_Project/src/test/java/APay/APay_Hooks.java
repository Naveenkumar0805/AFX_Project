package APay;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import APay.POM.APay_MultiLogin_POM;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class APay_Hooks extends APay_Baseclass{
	
	
//	 private APay_MultiLogin_POM loginPage = new APay_MultiLogin_POM();
//	    private List<List<String>> credentials;
//	    private static int credentialIndex = 0; // Keep track of which credential set is being used
//
//	    @Before
//	    public void setUp(Scenario scenario) throws Exception {
//	    	getDriver();
//	        // Initialize Excel reader only once and load credentials if not already done
//	        if (credentials == null) {
//	        	APay_Baseclass excelReader = new APay_Baseclass();
//	            credentials = excelReader.readExcel("F://AFX Login creds/APay_credentials.xlsx", "Sheet1");
//	        }
//
//	        // Check if we have more credentials to test
//	        if (credentialIndex < credentials.size()) {
//	            List<String> credential = credentials.get(credentialIndex);
//	            loginPage.openApay();
//	            loginPage.entercredentials(credential.get(0), credential.get(1), credential.get(2));
//	            loginPage.login();
//	        }
//	    }


		@AfterStep
	    public static void screenshot(Scenario scenario) {
	 
	        //validate if scenario has failed
	        if(scenario.isFailed()) {
	        	
	        	TakesScreenshot screenshot = (TakesScreenshot) getDriver();
	            byte[] screenshottaken = screenshot.getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshottaken, "image/png", "Screenshot");
	            }
	        
	        }   
		
//		@After
//		 public static void tearDown(Scenario scenario) {
//			credentialIndex++;
//		}
		
		
	      

	}
