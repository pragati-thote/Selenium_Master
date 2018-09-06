package com.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriver_Demo {
	
	
	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver= new HtmlUnitDriver();
		driver.get("http://www.google.com");
		System.out.println("Title:"+driver.getTitle());
		driver.close();
		
	}
}
