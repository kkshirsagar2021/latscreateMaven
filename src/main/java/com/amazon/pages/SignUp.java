/**
 * @author gaurnitai
 * @created_date Mar 2, 2019
 */

package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignUp 

{
	WebDriver driver;
	
	
	public By accnt = By.xpath("//a[@id='createAccountSubmit']");
	
	//public By creat = By.xpath("//*[@id='createAccountSubmit']");
	
	
public By yourna = By.xpath("//input[@type ='text']");

public By mobilenumber = By.xpath("//*[@id= 'ap_phone_number']");

public By email = By.xpath("//*[@id= 'ap_email']");

public By password = By.xpath("//*[@id= 'ap_password']");

public By btncontinue = By.xpath("//input[@id='continue']");


public SignUp(WebDriver driver)
{
	this.driver = driver;
}



public WebElement accnt()
{
return driver.findElement(accnt);	
}


/*public WebElement create()
{
return driver.findElement(creat);	
}*/



public WebElement yourname()
{
        return driver.findElement(yourna);	
}


public WebElement mobilenumber()
{
       return driver.findElement(mobilenumber);	
}


public WebElement email()
{
	return driver.findElement(email);
}


public WebElement password()
{
     return driver.findElement(password);	
}


public WebElement butncontinue()
{
    return driver.findElement(btncontinue);	
}
}