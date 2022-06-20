package com.nattaya.qa.steps_definitions;

import com.nattaya.qa.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

	@Before
	public void setUp() {
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@After
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
		}
		Driver.closeDriver();
	}
}
