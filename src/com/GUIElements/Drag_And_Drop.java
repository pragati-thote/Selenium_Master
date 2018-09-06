package com.GUIElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("http://jqueryui.com/droppable");
		Dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Dr.switchTo().frame(0);
		
		WebElement src=Dr.findElement(By.id("draggable"));
		WebElement trg=Dr.findElement(By.id("droppable"));
		
		Actions act=new Actions(Dr);
		act.dragAndDrop(src, trg).perform();
		
	}
	
}
