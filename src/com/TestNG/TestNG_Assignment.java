package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Assignment {
	
	WebDriver driver;
	
	 @Test(groups="Top") //(priority=1)
	  public void Gmail() throws InterruptedException {
		 driver.findElement(By.linkText("Gmail")).click();
		 System.out.println("Title is: "+driver.getTitle());
		 Thread.sleep(1000);
	  }
	 
	  @Test (groups="Top") //(priority=1)
	  public void Images() throws InterruptedException {
		  driver.findElement(By.linkText("Images")).click();
			 System.out.println("Title is: "+driver.getTitle());
			 Thread.sleep(1000);
	  }
	  
	  @Test (groups="Bottom") //(priority=3)
	  public void Advertising() throws InterruptedException {
		  driver.findElement(By.linkText("Advertising")).click();
			 System.out.println("Title is: "+driver.getTitle());
			 Thread.sleep(1000);
	  }
	  
	  @Test (groups="Bottom") //(priority=4)
	  public void Business() throws InterruptedException {
		  driver.findElement(By.linkText("Business")).click();
			 System.out.println("Title is: "+driver.getTitle());
			 Thread.sleep(1000);
	  }
	  
	  @Test (groups="Bottom") //(priority=5)
	  public void About() throws InterruptedException {
		  driver.findElement(By.linkText("About")).click();
			 System.out.println("Title is: "+driver.getTitle());
			 Thread.sleep(1000);
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  driver.navigate().back();
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com");
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}