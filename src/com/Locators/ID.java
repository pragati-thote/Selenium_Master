package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ID {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver=new FirefoxDriver();
		Driver.get("http://www.google.com");
		
		Driver.findElement(By.id("lst-ib")).sendKeys("Gmail Login");
	}
}
