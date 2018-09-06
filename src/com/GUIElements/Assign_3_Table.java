package com.GUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_3_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		//Table Headings
		List<WebElement> heading=Dr.findElements(By.xpath(".//*[@class='dataTable']/thead/tr/th"));
		for(WebElement h:heading)
		{
			System.out.println("Headings \n"+h.getText());
		}

	//	List<WebElement> company_nm=Dr.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]/a"));
		
		/*for(WebElement c:company_nm)
		{
			System.out.println(i+"-"+c.getText());
			i++;
		}*/
		
		List<WebElement> rows = Dr.findElements(By.tagName("tr"));
		int i=1;
		String C_name="Inox Wind Ltd.";
		for(i=1; i<=rows.size(); i++)
		{
			String a="";
			a=Dr.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[1]/a")).getText();
		
		if(a.equalsIgnoreCase(C_name))
		{
			System.out.println("Position :"+i);
			System.out.println("All Information of required Element : "+Dr.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]")).getText());
		
		}
		else
		{
			System.out.println("Company Not Found");
		}
		
		}
		Dr.close();
	}
	
}
