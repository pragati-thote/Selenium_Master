package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_Demo {
	WebDriver driver;
	String exp,act;
	
	
  @BeforeMethod
  public void beforeMethod() {
	  driver.findElement(By.id("txtCustomerID")).clear();
	  driver.findElement(By.id("txtPassword")).clear();
  }

  @AfterMethod
  public void afterMethod() {
	  exp="Invalid Username/Password";  
	  act=driver.findElement(By.id("lblMsg")).getText();
	  if(act.equals(exp))
	  {
		  System.out.println("Same Message as : "+act);
	  }
	  else
	  {
		  System.out.println("Different message \n expected is :"+exp+"actual is"+act);
	  }
	  
  }
  
  
  
@Test(dataProvider = "getData")
public void Echo_Login(String UNM, String PSW) {
	  driver.findElement(By.id("txtCustomerID")).sendKeys(UNM);
	  driver.findElement(By.id("txtPassword")).sendKeys(PSW);
	  driver.findElement(By.id("Butsub")).click();	  
	  Assert.assertEquals(act, exp);
}

@DataProvider
public Object[][] getData() {
  String[][] data=new String[3][2];
  data[0][0]="SEED";
  data[0][1]="seed";
  
  data[1][0]="INFO";
  data[1][1]="info";
  
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
	  driver.close();
}

  
  
  
  
 

  
  
  
}