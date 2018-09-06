package com.GUIElements;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("http://istqb.in");
		Dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement foundation=Dr.findElement(By.xpath(".//*[@id='menu640']"));
		
		Actions act=new Actions(Dr);
		act.moveToElement(foundation).perform();
		Thread.sleep(3000);
		
		List<WebElement>all_opt=Dr.findElements(By.xpath(".//*[@id='ja-megamenu']/ul/li[3]/div/div/div/div/ul/li/a"));
		for(WebElement a: all_opt)
		{
			System.out.println(a.getAttribute("title"));
		}
	
		Random r=new Random();
		int i=r.nextInt(all_opt.size());
		all_opt.get(i).click();
		
		System.out.println("Title of new page : "+Dr.getTitle());
		Dr.close();
		
	}

}
