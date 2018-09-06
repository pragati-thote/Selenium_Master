package com.GUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement dd=Dr.findElement((By.id("country")));
		Select Country=new Select(dd);
		System.out.println("First Selected Option: "+Country.getFirstSelectedOption().getText());
		
		System.out.println("*******************");
		
		List<WebElement> all_opt=Country.getOptions();
		int i=1;
		for(WebElement oo: all_opt)
		{
			System.out.println(i+"."+oo.getText());
			i++;
		}
		System.out.println("*******************");
		
	//	Country.selectByIndex(44);
	//	Country.selectByValue("43");
		Country.selectByVisibleText("China");
		
		System.out.println("First Selected Option: "+Country.getFirstSelectedOption().getText());

		
		
	}

	
	
}
