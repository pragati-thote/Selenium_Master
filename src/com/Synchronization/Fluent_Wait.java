package com.Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fluent_Wait {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		Dr.findElement(By.id("identifierId")).sendKeys("pallavi");
		Dr.findElement(By.id("identifierNext")).click();
		
		/*
		FluentWait<WebDriver> fw= new FluentWait<WebDriver>(Dr);
		fw.withTimeout(10, TimeUnit.MILLISECONDS)
		.ignoring(NoSuchElementException.class)
		.pollingEvery(1,TimeUnit.SECONDS)
		.until(ExpectedConditions
		.visibilityOfAllElementsLocatedBy(By.name("password"))).sendkeys
		
		*/
		Dr.findElement(By.id("passwordNext")).click();
	}

}
