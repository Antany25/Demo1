package DefinitionPackage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import UtilsPackage.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass {
	
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
	}
	 
	@After
	public static void tearDown(Scenario scenario) {
	 
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName()); 
		}   
		HelperClass.tearDown();
	}
	
}
