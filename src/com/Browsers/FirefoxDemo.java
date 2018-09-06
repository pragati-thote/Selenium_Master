package com.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/home/bynry-17/Documents/Selenium/CESC_Automation/geckodriver");
		WebDriver Driver=new FirefoxDriver();
		Driver.get("http://www.google.com");
	
}
}