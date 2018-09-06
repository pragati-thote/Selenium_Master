package com.GUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		List<WebElement> all_rb=Dr.findElements(By.xpath(".//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input"));
		
		for(WebElement r:all_rb)
		{
			System.out.println(r.getAttribute("value"));
			System.out.println("Displayed: "+ r.isDisplayed());
			System.out.println("Displayed: "+ r.isEnabled());
			System.out.println("Displayed: "+ r.isSelected());	
		}
		
		for(WebElement r:all_rb)
		{
			if(r.isSelected()==false)
			{
				r.click();
			}

		}
		
		for(WebElement r:all_rb)
		{
			System.out.println(r.getAttribute("value"));
			System.out.println("Displayed: "+ r.isDisplayed());
			System.out.println("Displayed: "+ r.isEnabled());
			System.out.println("Displayed: "+ r.isSelected());	
		}
		
		
		
		
	}
}
