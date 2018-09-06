package com.GUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2_RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("http://echoecho.com/htmlforms10.htm");
		
		List<WebElement> all_rb=Dr.findElements(By.xpath(".//td[@class='table5']/input"));
		
		
		for(WebElement r:all_rb)
		{
			
			System.out.println(r.getAttribute("value"));
			System.out.println("Displayed : "+ r.isDisplayed());
			System.out.println("Enabled : "+ r.isEnabled());
			System.out.println("Selected : "+ r.isSelected());	
		}
		
		for(WebElement r:all_rb)
		{
			if(r.getAttribute("value").equalsIgnoreCase("Milk")||r.getAttribute("value").equalsIgnoreCase("Water"))
			{
				r.click();
				System.out.println("New Status of:"+r.getAttribute("value"));
				System.out.println("New Status of:"+r.getAttribute("value"));
				System.out.println("Displayrd :"+r.isDisplayed());
				System.out.println("Displayrd :"+r.isEnabled());
				System.out.println("Displayrd :"+r.isSelected());
				
			}
		}
		
	}

}
