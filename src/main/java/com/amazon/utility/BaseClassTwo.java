/**
 * @author gaurnitai
 * @created_date Feb 24, 2019
 */


package com.amazon.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClassTwo {
	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void initChrome(String appurl) {
		System.setProperty("webdriver.chrome.driver", "E:\\New Eclipse\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appurl);
		System.out.println("Launching url for " + appurl);
	}

	public void initFirefox(String appurl) {
		System.setProperty("webdriver.gecko.driver", "E:\\New Eclipse\\Selenium Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(appurl);
		System.out.println("Launching url for " + appurl);
	}

	@Parameters({ "browser", "appurl" })
	@BeforeClass
	public void openBrowser(String browser, String appurl) {

		if (browser.equalsIgnoreCase("chrome")) {
			initChrome(appurl);
		} else if (browser.equalsIgnoreCase("firefox")) {
			initFirefox(appurl);
		} else {
			System.out.println("Please pass valid browser name!");
		}

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}


