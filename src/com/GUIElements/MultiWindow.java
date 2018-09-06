package com.GUIElements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://www.jobserve.com/in/en/Job-Search/");
		
		String id_MW=Dr.getWindowHandle();
		System.out.println("ID- Main Window :"+id_MW);
		Dr.findElement(By.id("SPBApplyBtn")).click();
		
		Set<String> win_id=Dr.getWindowHandles();
		Iterator<String> itr=win_id.iterator();
		
		System.out.println("Id of main window : "+itr.next());
		System.out.println("Id of new window : "+itr.next());
		
		itr=win_id.iterator();
		String mWin=itr.next();
		String nWin=itr.next();
		
		Dr.switchTo().window(nWin);
		System.out.println("Title of new Window : "+Dr.getTitle());
		
		Dr.switchTo().window(mWin);
		System.out.println("Title of Main Window : "+Dr.getTitle());
		
		Dr.quit();
	}

}
