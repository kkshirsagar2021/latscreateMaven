/**
 * @author gaurnitai
 * @created_date Feb 24, 2019
 */

// Here alt + command for alignment

package com.amazon.testcases;

//import com.amazon.utility.GetTestData;
import com.amazon.pages.AmazonHomePage;
import com.amazon.pages.SignUp;
import com.amazon.pages.YourAmazonCom;
import com.amazon.utility.BaseClassTwo;
import com.github.yev.FailTestScreenshotListener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(FailTestScreenshotListener.class)
public class SiginPageTest extends BaseClassTwo {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	@Test(enabled=false)

    public void verifySignIn() throws InterruptedException {

        AmazonHomePage ahp = new AmazonHomePage(driver);
        YourAmazonCom yac = new YourAmazonCom(driver);
        ahp.yourAmazonCom().click();
		int x = 10;
        Thread.sleep(4000);
        yac.signInEmail().sendKeys("sharma.rajeshwar@gmail.com");
        yac.signInPwd().sendKeys("passwewte");
        yac.signInBtn().click();

    }
	
	@Test
	public void signup() throws InterruptedException
	{
	       AmazonHomePage ahp = new AmazonHomePage(driver);
	       
	       driver.manage().window().maximize();
		
	       SignUp sp=new SignUp(driver);
	       ahp.yourAmazonCom().click();
	       sp.accnt().click();
	       
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       sp.yourname().sendKeys("afroj");
	       
	       sp.mobilenumber().sendKeys("123500");
	       
	       sp.email().sendKeys("asif@gmail.com");
	       
	       sp.password().sendKeys("12346");
	       
	       sp.butncontinue().click();
	     
		

	}


	@Test(dataProvider = "getSignInData",enabled = false) // , dataProviderClass=GetTestData.class
	public void verifySignIn(String username, String password) throws InterruptedException {

		AmazonHomePage ahp = new AmazonHomePage(driver);
		YourAmazonCom yac = new YourAmazonCom(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ahp.yourAmazonCom().click();
		
		yac.signInEmail().sendKeys(username);
		yac.continueBtn().click();
		yac.signInPwd().sendKeys(password);
		yac.signInBtn().click();

	}

	@DataProvider(name = "getSignInData")
	public Object[][] getSignInData() {

		Object[][] data = new Object[3][2];
		data[0][0] = "sharma.rajeshwar9@gmail.com";
		data[0][1] = "passwordone";
		data[1][0] = "asif@gmail.com";
		data[1][1] = "passwordtwo";
		data[2][0] = "johny@gmail.com";
		data[2][1] = "johnyrap";
		return data;

	}

	@DataProvider(name = "getSignData")
	public Object[][] getSignData() {
		return new Object[][] { { "sharma.rajeshwar9@gmail.com", "passwordone" },
				{ "sharma.rajeshwar9@gmail.com", "passwordtwo" } };
	}

}
