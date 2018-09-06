/**
 * 
 */
package com.POM_Without_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author bynry-17
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='password']");
	By login_button=By.xpath("//*[@class='btn green pull-right']");
	
	//Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void typeUsername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(login_button).click();
	}
}
