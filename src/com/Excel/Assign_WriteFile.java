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

	public class Assign_WriteFile {

		File f;
		FileOutputStream fout;
		String fpath="D:\\Pragati";
		String fname="DynamicData.xls";
		HSSFWorkbook wb;
		HSSFSheet sh;
		HSSFRow rw;
		HSSFCell cl;
		String shNm, data;
		int rCount=3, cCount=3;
		int row,col;
		
	  @Test
	  public void Write() throws FileNotFoundException {
		   
		  for(row=0; row<rCount; row++)
		  {
			  rw=sh.createRow(row);
			 
			  
			  for(col=0; col<cCount; col++)
			  { 
				  cl=rw.createCell(col);  
				  cl.setCellValue("Row"+row+"Col"+col);	  	  
			  }
			  System.out.println("-----------------------");
		  }
		  
	  }
	  
	  
	  @BeforeTest
	  public void beforeTest() throws FileNotFoundException {
		  f=new File(fpath+"\\"+fname);
		  fout=new FileOutputStream(f);
		  wb=new HSSFWorkbook(); //Create blank workbook
		  sh=wb.createSheet("ROW"); // Create new sheet
	  }

	  @AfterTest
	  public void afterTest() throws IOException {
		  
		  wb.write(fout);
		  wb.close(); //close workbook
		  fout.close();
			
		  System.out.println("Write Operation Done...");
	  }

	}
