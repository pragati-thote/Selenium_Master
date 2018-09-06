package com.Excel;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.hssf.usermodel.HSSFCell;
	import org.apache.poi.hssf.usermodel.HSSFRow;
	import org.apache.poi.hssf.usermodel.HSSFSheet;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

	public class Write_1_Cell {

		File f;
		FileOutputStream fos;
		String fpath="D:\\Pragati";
		String fname="MyExcel.xls";
		HSSFWorkbook wb;
		HSSFSheet sh;
		HSSFRow rw;
		HSSFCell cl;
		
	  @BeforeTest
		  public void beforeTest() throws FileNotFoundException {
			  
			  f=new File(fpath+"\\"+fname);
			  fos=new FileOutputStream(f);
			  wb=new HSSFWorkbook(); //Create blank workbook
		  }
		
	  @Test
	  public void WriteIntoExcel() { 
		  sh=wb.createSheet("Webdriver");  //Create sheet
		  rw=sh.createRow(0); //create row
		  cl=rw.createCell(0);  //create cell
		  cl.setCellValue("Selenium");  //write into the cell	  
		  
	  }
	 

	  @AfterTest
	  public void afterTest() throws IOException {
		  
		  wb.write(fos);
		  wb.close(); //close workbook
		  fos.close();
	System.out.println("Write Operation is Done...");
	  }

	}
	
	
	

