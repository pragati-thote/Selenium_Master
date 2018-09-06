package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataProvider_Demo {
	
	WebDriver driver;
	String exp="Invalid Username/Password", act;
	
  @Test(dataProvider = "getData")
  public void Echo_Login(String UNM, String PSW) {
	  driver.findElement(By.id("txtCustomerID")).sendKeys(UNM);
	  driver.findElement(By.id("txtPassword")).sendKeys(PSW);
	  driver.findElement(By.id("Butsub")).click();
	  act=driver.findElement(By.id("lblMsg")).getText();
	  	  
	  Assert.assertEquals(act, exp);
  }

  @DataProvider
  public Object[][] getData() {
    String[][] data=new String[3][2];
    data[0][0]="Bynry";
    data[0][1]="bbbbb";
    
    data[1][0]="Technology";
    data[1][1]="tttttttt";
    
    data[2][0]="TECH";
    data[2][1]="tech";
    
    return data;
    
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