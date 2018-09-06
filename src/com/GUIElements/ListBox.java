package com.GUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("file:///D:/AdvancedSeleniumSoftwares/MultiSelect.html");

		WebElement lb=Dr.findElement(By.name("cars"));
		Select car=new Select(lb);
		if(car.isMultiple()==true)
		{
			car.selectByIndex(3);
			car.selectByValue("volvo");
			car.selectByVisibleText("Saab");
		}
		
		List<WebElement> sel_car=car.getAllSelectedOptions();
		System.out.println("Selected Cars---");
		
		for(WebElement e: sel_car)
		{
			System.out.println(e.getText());
		}	
		
	}
}
