package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Multiple_Test_Demo {
	
	WebDriver driver;
  @Test(priority=3)
  public void Rediffmail() {
	  driver.get("http://rediff.com/");
	  System.out.println("Title is : "+driver.getTitle());
  }
  
  @Test(priority=2)
  public void Yahoo() {
	  driver.get("http://yahoo.com/");
	  System.out.println("Title is : "+driver.getTitle());
  }
  @Test(priority=1)
  public void Google() {
	  driver.get("http://google.com/");
	  System.out.println("Title is : "+driver.getTitle());
  }
  
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}