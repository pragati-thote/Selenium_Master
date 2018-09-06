package com.Framworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class KeywordDriven {
	File f;
	FileInputStream fin;
	Properties p;
	WebDriver driver;
	
	String exp="Invalid Username/Password", act;
	
	
  @Test
  public void Login() {
	  driver.findElement(By.id(p.getProperty("username_id"))).sendKeys("Rani");
	  driver.findElement(By.id(p.getProperty("password_id"))).sendKeys("123456");
	  driver.findElement(By.id(p.getProperty("login_btn_id"))).click();
	  act=driver.findElement(By.id(p.getProperty("ree_msg_id"))).getText();
	  
	  Assert.assertEquals(act, exp);
  }
  
  
  @BeforeTest
  public void beforeTest() throws IOException {

	  f= new File("/home/bynry-17/Documents/Selenium/Worksplaces/MasterWorkspace/MasterProject/Echo_Login_prop.properties"); //path of properties file
	  fin=new FileInputStream(f);
	  p=new Properties();
	  p.load(fin);
	  
	  System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
	  driver=new ChromeDriver();
	  driver.get(p.getProperty("url"));
  }

  
  @AfterTest
  public void afterTest() throws IOException {
	  
	  fin.close();
	  driver.close();
  }

}