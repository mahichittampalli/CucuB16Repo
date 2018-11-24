package com.multiplestepdeffilesjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;

public class ParentStepDefs {
	protected WebDriver driver;
	 
	/**
	 * This method is created to just get the driver. This can be easily achieved in step defs class by
	 * creating the @Before method 
	 * 
	 */
	public WebDriver getDriver() throws InterruptedException {
		System.out.println("in setup");
//		System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MAHI\\Desktop\\radical software\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		System.out.println("opned browser");
		Thread.sleep(5000);
		return driver;
	}

}
