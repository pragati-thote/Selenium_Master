package com.Excel;
	import java.io.File;
	import java.io.FileInputStream;
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

	public class Read_1_Cell {
		File f;
		FileInputStream fin;
		String fpath="D:\\Pragati";
		String fname="MyExcel.xls";
		HSSFWorkbook wb;
		HSSFSheet sh;
		HSSFRow rw;
		HSSFCell cl;
		
		String data,shNm;
		
		
	  @Test
	  public void ReadExcel() {
		shNm=wb.getSheetName(0);
		System.out.println("Sheet Name : "+shNm);
		sh=wb.getSheet(shNm);
		rw=sh.getRow(0);
		cl=rw.getCell(0);
		data=cl.getStringCellValue();
		System.out.println("Read data : "+data);
	  }
	  
	  @BeforeTest
	  public void beforeTest() throws IOException {
		  f=new File(fpath+"\\"+fname);
		  fin=new FileInputStream(f);
		  wb=new HSSFWorkbook(fin); 
	  }

	  @AfterTest
	  public void afterTest() throws IOException {
		  fin.close();
		  wb.close(); //close workbook
		 
	  }

	}
	
	
	
	

