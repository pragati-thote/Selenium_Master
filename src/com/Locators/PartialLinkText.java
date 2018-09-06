package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.google.com");
		
		//Partial LinkText
		Driver.findElement(By.partialLinkText("mag")).click();
		
		System.out.println("Page Title: "+Driver.getTitle());
	}

}
