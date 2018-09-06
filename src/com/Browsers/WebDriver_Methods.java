package com.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Methods {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","/home/bynry-17/Documents/Selenium/Worksplaces/geckodriver");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		System.out.println("Page Title: "+driver.getTitle());
		System.out.println("Current Page URL:"+driver.getCurrentUrl());
	//	System.out.println("Page Source:"+Dr.getPageSource());
		driver.close();
	//	Dr.quit();
		
	}
}
