/**
 * @author gaurnitai
 * @created_date Feb 24, 2019
 */


package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {

	WebDriver driver;
	
	By yourAmazonCom = By.xpath("//a[text()='Your Amazon.in']");
	
	public AmazonHomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement yourAmazonCom() {
		return driver.findElement(yourAmazonCom);
	}
	
	
	
}


