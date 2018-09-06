package com.Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		Dr.findElement(By.id("identifierId")).sendKeys("pallavi");
		Dr.findElement(By.id("identifierNext")).click();
		
		//Dr.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("1234567");
		
		WebDriverWait wait=new WebDriverWait(Dr, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("123456789");
		Dr.findElement(By.id("passwordNext")).click();
	}

}
