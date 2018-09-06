package com.GUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("http://echoecho.com/htmlforms09.htm");
		
		List<WebElement> all_cb=Dr.findElements(By.xpath("//td[@class='table5']/input"));
		for(WebElement c:all_cb)
		{
			System.out.println(c.getAttribute("value"));
			System.out.println("Displayed: "+ c.isDisplayed());
			System.out.println("Displayed: "+ c.isEnabled());
			System.out.println("Displayed: "+ c.isSelected());	
		}
		
	System.out.println("********************************");	
		
		for(WebElement c:all_cb)
		{
			c.click();

		}
		
		
		for(WebElement c:all_cb)
		{
			System.out.println(c.getAttribute("value"));
			System.out.println("Displayed: "+ c.isDisplayed());
			System.out.println("Displayed: "+ c.isEnabled());
			System.out.println("Displayed: "+ c.isSelected());	
		}
	
	
	}
}
