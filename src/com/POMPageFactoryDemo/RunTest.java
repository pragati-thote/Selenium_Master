package com.POMPageFactoryDemo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class RunTest {
private WebDriver driver;

  
  @BeforeClass
  public void beforeClass() {
	  
/* System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
 driver=new ChromeDriver();*/
 
 System.setProperty("webdriver.gecko.driver","/home/bynry-17/Documents/Selenium/Worksplaces/geckodriver");
 driver=new FirefoxDriver();
 driver.get("http://192.168.1.12:8000");
 
 
 
 //driver.navigate().to("192.168.1.12:8000");
 driver.manage().window().maximize();
 }

  @Test
  public void LoginTest() throws InterruptedException {
	  //Initialize Login Page
  Login loginPage=PageFactory.initElements(driver, Login.class);
  //Enter user name
  loginPage.EnterUserName("shubham@bynry.com");
  //Enter Password
  loginPage.EnterPassword("bynry@utility$");
  //Click Login Button
  loginPage.ClickLoginButton();
 Thread.sleep(2000);
  }
  
 /* @Test
  public void DashboardTest() throws InterruptedException
  {
Thread.sleep(5000);
//Initialize Dashboard Page
Dashboard dashboardPage=PageFactory.initElements(driver, Dashboard.class);
//Wait for settings link
dashboardPage.WaitForSettingLinkToDisplay(driver);
//Click on Settings
dashboardPage.ClickSettings();
  }
  */
 
  @AfterClass
  public void afterClass() {
//Close the browser
driver.close();
//driver.quit();
  }

}

