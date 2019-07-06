/**
 * @author gaurnitai
 * @created_date Feb 23, 2019
 */

package com.amazon.testcases;

import org.testng.annotations.Test;

import com.amazon.utility.BaseClassTwo;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class AmazonTest extends BaseClassTwo {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}
		
	@Test
	public void verifyUrlAccess() 
	{
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		boolean isDisplay= searchbox.isDisplayed();
		Assert.assertTrue(isDisplay);
	}

	@Test
	public void verifyPageTitle() {	
		String expectedTitle = "Amazon.com: Online Shopping for Electronics,"; //Apparel, Computers, Books, DVDs & more";
		driver.get("https://www.amazon.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println(testResult.getStatus());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("Screenshots/" + testResult.getName() + "-" 
					+ Arrays.toString(testResult.getParameters()) +  ".jpg"));
	   }        
	}
	

}
