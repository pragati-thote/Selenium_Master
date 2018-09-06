package com.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowserDemo {
public static void main(String[] args) {
		WebDriver driver;
		//Launch Chrome Browser
		System.setProperty("webdriver.gecko.driver","/home/bynry-17/Documents/Selenium/Worksplaces/geckodriver");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("http://www.google.com");
		
		/*//Launch FireFOx Browser
		 driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		*/
		
		//Launch IE Browser
		/*System.setProperty("webdriver.ie.driver","D:\\AdvancedSeleniumSoftwares\\IEDriverServer.exe");
	 driver=new InternetExplorerDriver();
		Driver.get("http://www.google.com");*/
		
		//Launch HtmlUnitDriver
		/*driver= new HtmlUnitDriver();
		driver.get("http://www.google.com");
		System.out.println("Title:"+driver.getTitle());
	     driver.close();*/
		
	}
}
