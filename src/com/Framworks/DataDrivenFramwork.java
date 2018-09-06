package com.Framworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataDrivenFramwork {
	
	File f;
	FileInputStream fin;
	FileOutputStream fout;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	WebDriver driver;
	
	String exp="invalid Username/Password", act, shNm;
	int rCount, cCount, row, col, r=1, c=2;
	HSSFFont ifPass, ifFail;
	HSSFCellStyle style;
		
  @Test(dataProvider = "dp")
  public void Login(String unm, String psw) throws IOException {
	  driver.findElement(By.id("txtCustomerID")).sendKeys(unm);
	  driver.findElement(By.id("txtPassword")).sendKeys(psw);
	  driver.findElement(By.id("Butsub")).click();
	  
	  act=driver.findElement(By.id("lblMsg")).getText(); 
	  fout=new FileOutputStream(f);
	  rw=sh.getRow(r);
	  cl=rw.createCell(c);
	  
	  style=wb.createCellStyle();
	  ifPass=wb.createFont();
	  ifPass.setBold(true);
	  ifPass.setColor(HSSFColor.GREEN.index);
	  
	  ifFail=wb.createFont();
	  ifFail.setBold(true);
	  ifFail.setItalic(true);
	  ifFail.setColor(HSSFColor.RED.index);	
	  
	  
	  if(act.equals(exp))
	  {
		 cl.setCellValue("Pass");
		 style.setFont(ifPass);
		 cl.setCellStyle(style);	 
	  }
	  else
	  {
		  cl.setCellValue("Fail"); 
		  style.setFont(ifFail);
		  cl.setCellStyle(style);		 
	  }
	  r++;
	  wb.write(fout); 
	  fout.close();
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  driver.findElement(By.id("txtCustomerID")).clear();
	  driver.findElement(By.id("txtPassword")).clear();	 
  }
  

  @DataProvider
  
  public Object[][] dp() {
   
	  rCount=sh.getPhysicalNumberOfRows();
	  cCount=sh.getRow(0).getPhysicalNumberOfCells();
	  
	  Object[][] data=new Object[rCount-1][cCount-1];
	  
	  for(row=0; row<rCount-1; row++)
	  {
		  rw=sh.getRow(row+1);
	
		  for(col=0; col<cCount-1; col++)
		  {
			  cl=rw.getCell(col);
			  data[row][col]=cl.getStringCellValue();
		  }
	  }  
	  return data;
  }
  
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  f=new File("/home/bynry-17/Documents/Selenium/ExcelDemo/Login_Details.xls");
	  fin=new FileInputStream(f);
	  
	  wb=new HSSFWorkbook(fin); 
	  
	  shNm=wb.getSheetName(0);
	  
	  System.out.println("Sheet Name "+ shNm);
	  
	  sh=wb.getSheet(shNm);
	  
	  System.setProperty("webdriver.chrome.driver","/home/bynry-17/Documents/Selenium/Selenium_JAR/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");  
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  fin.close();
	  wb.close();
	  driver.close();
	  
	  System.out.println("Done..!!");
  }

}