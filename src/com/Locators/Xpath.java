package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
	public static void main(String[] args) {

		WebDriver Dr=new FirefoxDriver();
		Dr.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//Absulute Xpath
	    System.out.println(Dr.findElement(By.xpath("html/body/div[1]/div/div[2]/div/form/div[1]/div/h1")).getText());
		
		/*//Relative 1 way
	    System.out.println(Dr.findElement(By.xpath("//h1[@id='headingText']")).getText());
		 */
	    
	   /*//Relative 2nd way
	    System.out.println(Dr.findElement(By.xpath(".//*[@id='headingText']")).getText());
	    */	
	    
	
	   //Absulute for "with your Google Account"
	    System.out.println(Dr.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/form/div[1]/div/p")).getText());
	//	or
	    
	    //Relative for "with your Google Account"
	    System.out.println(Dr.findElement(By.xpath("//p[@id='headingSubtext']")).getText());
	
	}

}
