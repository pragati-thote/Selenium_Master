package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.beust.jcommander.Parameter;

public class ParameterPassingByXml {
	WebDriver driver;
	String exp="Invalid Username/Password", act;
	
	@Parameters({"UserName","Password"})
	
  @Test
  public void Login(String UNM, String PSW) {
	  driver.findElement(By.id("txtCustomerID")).sendKeys(UNM);
	  driver.findElement(By.id("txtPassword")).sendKeys(PSW);
	  driver.findElement(By.id("Butsub")).click();
	  act=driver.findElement(By.id("lblMsg")).getText();
	  	  
	  Assert.assertEquals(act, exp);
  }
 

  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
  }

  @AfterTest
  public void afterTest() {
	// driver.close();
  }

}