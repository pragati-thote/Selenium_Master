package com.GUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> heading=Dr.findElements(By.xpath(".//*[@class='dataTable']/thead/tr/th"));
		for(WebElement h:heading)
		{
			System.out.println("Headings \n"+h.getText());
		}

		
		List<WebElement> company_nm=Dr.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]/a"));
		int i=1;
		for(WebElement c:company_nm)
		{
			System.out.println(i+"-"+c.getText());
			i++;
		}

		
		Dr.close();
		
	}
	
	
}
