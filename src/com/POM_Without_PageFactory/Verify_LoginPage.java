/**
 * 
 */
package com.POM_Without_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author bynry-17
 *
 */
public class Verify_LoginPage {

	@Test
	public void verifyLoginpage()
	{
		System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.12:8000");
		
		LoginPage log=new LoginPage(driver);
		log.typeUsername("shubham@bynry.com");
		log.typePassword("bynry@utility$");
		log.clickOnLoginButton();
		
		driver.quit();
	}
	
	


}
