package com.allFilesInSameFolder;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class MyFirstStepDef {
	
	protected WebDriver driver;
	
	@Given("open facebook page")
	public void openFacebookPage()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MAHI\\Desktop\\radical software\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
