package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.google.com");
		
		
		Driver.findElement(By.cssSelector("input [id='lst-ib'][name='q'][class='gsfi lst-d-f']")).sendKeys("Selenium1");
		
		
		//Driver.findElement(By.cssSelector("input.gsfi")).sendKeys("Selenium1");
		
		//Driver.findElement(By.cssSelector(".gsfi")).sendKeys("Selenium2");
		
		//Driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium3");
		
		//Driver.findElement(By.cssSelector("input[id^='lst'")).sendKeys("Selenium4");
		
		//Driver.findElement(By.cssSelector("input[id$='-ib'")).sendKeys("Selenium4");

		//Driver.findElement(By.cssSelector("input[id*='l-i'")).sendKeys("Selenium5");

		
		
	}

}
