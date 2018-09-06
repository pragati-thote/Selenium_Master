package com.Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Load {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("http://www.google.com");
		Dr.findElement(By.linkText("Gmail")).click();
		
		Dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		System.out.println("Title: "+Dr.getTitle());
		Dr.close();
		
		
		
	}
}
