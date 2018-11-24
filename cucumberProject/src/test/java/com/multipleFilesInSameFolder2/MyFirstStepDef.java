package com.multipleFilesInSameFolder2;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class MyFirstStepDef {
	
	
	
	@Given("open facebook page")
	public void openFacebookPage()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MAHI\\Desktop\\radical software\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
