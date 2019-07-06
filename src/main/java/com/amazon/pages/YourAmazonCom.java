/**
 * @author gaurnitai
 * @created_date Feb 24, 2019
 */

package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class YourAmazonCom {

	WebDriver driver;

	By signInEmail = By.id("ap_email");
	By signInPwd = By.name("password");
	By continueBtn = By.id("continue");
	By signInBtn = By.xpath("//input[@type='submit']");

	public YourAmazonCom(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement signInEmail() {
		return driver.findElement(signInEmail);
	}

	public WebElement signInPwd() {
		return driver.findElement(signInPwd);
	}

	public WebElement signInBtn() {
		return driver.findElement(signInBtn);
	}
	
	public WebElement continueBtn() {
		return driver.findElement(continueBtn);
	}

}
