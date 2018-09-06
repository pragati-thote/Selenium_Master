package com.Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		Dr.findElement(By.id("identifierId")).sendKeys("pallavi");
		Dr.findElement(By.id("identifierNext")).click();
		Thread.sleep(4000);
		Dr.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("1234567");
		
		
	}

}
