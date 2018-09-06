package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver=new FirefoxDriver();
		Driver.get("http://www.google.com");
		List<WebElement>all_links = Driver.findElements(By.tagName("a"));

	for(WebElement a:all_links)
	{
		System.out.println(a.getText());
	}
	
	/*int i;
	for(i=0;i<all_links.size();i++)
	{
		System.out.println(all_links.get(i).getText());
	}
	
	Driver.close();*/
	}
	
}
