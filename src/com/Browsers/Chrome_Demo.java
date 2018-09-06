package com.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Demo {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
			WebDriver Driver=new ChromeDriver();
			Driver.get("http://www.google.com");
		}

	}
	
