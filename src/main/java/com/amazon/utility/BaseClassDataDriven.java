/**
 * @author gaurnitai
 * @created_date Mar 3, 2019
 */


package com.amazon.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassDataDriven {

	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void initChrome(String appurl) {
		System.setProperty("webdriver.chrome.driver", "/Users/gaurnitai/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(appurl);
		System.out.println("Launching url for " + appurl);
	}

	public void initFirefox(String appurl) {
		System.setProperty("webdriver.gecko.driver", "/Users/gaurnitai/Documents/SeleniumJava/geckodriver");
		driver = new FirefoxDriver();
		driver.get(appurl);
		System.out.println("Launching url for " + appurl);
	}

	@Parameters({ "browser", "appurl" })
	@BeforeMethod
	public void openBrowser(String browser, String appurl) {

		if (browser.equalsIgnoreCase("chrome")) {
			initChrome(appurl);
		} else if (browser.equalsIgnoreCase("firefox")) {
			initFirefox(appurl);
		} else {
			System.out.println("Please pass valid browser name!");
		}

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}


