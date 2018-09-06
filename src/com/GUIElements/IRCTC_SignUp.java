package com.GUIElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC_SignUp {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\AdvancedSeleniumSoftwares\\chromedriver.exe");
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//Username
		Dr.findElement(By.id("userRegistrationForm:userName")).sendKeys("Rani");
		
		//Password
		Dr.findElement(By.id("userRegistrationForm:password")).sendKeys("Rani");

		//Sec Que
		WebElement dd=Dr.findElement((By.id("userRegistrationForm:securityQ")));
		Select Sec_Que=new Select(dd);
		Sec_Que.selectByValue("1");
		
		//Answer(Sec Que)
		Dr.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys("aaaa");
		
		WebElement dd1=Dr.findElement((By.id("userRegistrationForm:prelan")));
		Select lang=new Select(dd1);
		lang.selectByValue("en");
		
		//first-name
		Dr.findElement(By.id("userRegistrationForm:firstName")).sendKeys("Rani");
		
		//Gender-female
		Dr.findElement(By.id("userRegistrationForm:gender:1")).click();
		
		//marital Status
		Dr.findElement(By.id("userRegistrationForm:maritalStatus:1")).click();
		
		//Day
		WebElement date=Dr.findElement((By.id("userRegistrationForm:dobDay")));
		Select dt=new Select(date);
		dt.selectByValue("19");
		
		//Month
		WebElement Month=Dr.findElement((By.id("userRegistrationForm:dobMonth")));
		Select mn=new Select(Month);
		mn.selectByValue("09");
		
		//Month
		WebElement Year=Dr.findElement((By.id("userRegistrationForm:dateOfBirth")));
		Select yr=new Select(Year);
		yr.selectByValue("1993");
		
		//occupation
		WebElement ocu=Dr.findElement((By.id("userRegistrationForm:occupation")));
		Select o=new Select(ocu);
		o.selectByValue("2");
		
		//County
		WebElement cnty=Dr.findElement((By.id("userRegistrationForm:countries")));
		Select c=new Select(cnty);
		c.selectByValue("94");
		
		Dr.findElement(By.id("userRegistrationForm:email")).sendKeys("aa@gmail.com");
		Dr.findElement(By.id("userRegistrationForm:mobile")).sendKeys("9988556622");
		
		//Nationality
		WebElement nat=Dr.findElement((By.id("userRegistrationForm:nationalityId")));
		Select n=new Select(nat);
		n.selectByValue("94");
		
		//Address
		Dr.findElement(By.id("userRegistrationForm:address")).sendKeys("Pune-01");
		
		//Pincode
		Dr.findElement(By.id("userRegistrationForm:pincode")).sendKeys("411014");
		
		//State
		Dr.findElement(By.id("userRegistrationForm:statesName")).click();
			
		Thread.sleep(2000);
		
		//City
		WebElement city=Dr.findElement((By.id("userRegistrationForm:cityName")));
		Select cc=new Select(city);
		cc.selectByVisibleText("Pune");
		Thread.sleep(2000);
		
		//Post Office
		WebElement post=Dr.findElement((By.id("userRegistrationForm:postofficeName")));
		Select po=new Select(post);
		po.selectByValue("Viman nagar S.O");
		
		//Phone
		Dr.findElement(By.id("userRegistrationForm:landline")).sendKeys("098745511");
		
		//Submit
		Dr.findElement(By.linkText("Submit Registration Form>>>")).click();
			
		//Alert
		String exp="Password must contain at least one number (0-9)", act;
		Alert alt=Dr.switchTo().alert();
		
		Thread.sleep(2000);
		act=alt.getText();
		
		if(act.equals(exp))
		{
			System.out.println("Pass..");
			alt.accept();
		}
		
		else
		{
			System.out.println("Fail...");
			alt.dismiss();
		}
			
	}
}
