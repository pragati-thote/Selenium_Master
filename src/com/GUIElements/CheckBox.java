package com.GUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		/*Dr.findElement(By.id("remember")).isDisplayed();
		or*/
		
		WebElement a= Dr.findElement(By.id("remember"));
		if(a.isDisplayed())
		{
			System.out.println("Element is Displayed..");
			if(a.isEnabled())
			{
				System.out.println("Element is Enabled...");
				if(a.isSelected())
				{
					System.out.println("Element is Checked...");
					a.click();
					System.out.println("Now Element is Un-Checked...");
				}
			}
		}

	}

}
