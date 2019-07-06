/**
 * @author gaurnitai
 * @created_date Mar 3, 2019
 */


package com.amazon.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.pages.AmazonHomePage;
import com.amazon.pages.YourAmazonCom;
import com.amazon.utility.BaseClassDataDriven;
import com.amazon.utility.BaseClassTwo;
import com.amazon.utility.GetTestData;

public class SignInTestData extends BaseClassDataDriven {
	
	WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = getDriver();
    }

	@Test(dataProvider="getSignData", dataProviderClass=GetTestData.class) //, dataProviderClass=GetTestData.class
    public void verifySignIn(String username, String password) throws InterruptedException {

        AmazonHomePage ahp = new AmazonHomePage(driver);
        YourAmazonCom yac = new YourAmazonCom(driver);
        Thread.sleep(4000);
        ahp.yourAmazonCom().click();
        Thread.sleep(4000);
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
		return new Object[][] {{"sharma.rajeshwar9@gmail.com","passwordone"},{"sharma.rajeshwar9@gmail.com","passwordtwo"}};

	}
	
	
	
	

}


