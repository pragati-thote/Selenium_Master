package com.GUIElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
		
		String exp="Please enter your password", act;
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Dr.findElement(By.id("login1")).sendKeys("Rani");
		Dr.findElement(By.name("proceed")).click();

		Alert alt=Dr.switchTo().alert();
		
		Thread.sleep(2000);
		act=alt.getText();
		
		if(act.equals(exp))
		{
			System.out.println("Pass..");
			alt.accept();
		}
		
		else
		{
			System.out.println("Fail...");
			alt.dismiss();
		}
		
	}
}
