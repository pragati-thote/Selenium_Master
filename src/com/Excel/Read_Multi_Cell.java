	package com.Excel;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.hssf.usermodel.HSSFCell;
	import org.apache.poi.hssf.usermodel.HSSFRow;
	import org.apache.poi.hssf.usermodel.HSSFSheet;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

	public class Read_Multi_Cell {
		File f;
		FileInputStream fin;
		String fpath="D:\\Pragati";
		String fname="Employee_Details.xls";
		HSSFWorkbook wb;
		HSSFSheet sh;
		HSSFRow rw;
		HSSFCell cl;
		String shNm, data;
		int rCount, cCount, row, cell;
		
	  @Test
	  public void ReadExcel() {
		  
		  rCount=sh.getPhysicalNumberOfRows(); // No. of rows
		  cCount=sh.getRow(0).getPhysicalNumberOfCells(); //
		  
		  System.out.println("Toatal no. of Rows : "+rCount);
		  System.out.println("Toatal col in 0th row : "+ cCount);
		  
		  for(row=0; row<rCount; row++)
		  {
			  rw=sh.getRow(row);
			  for(cell=0; cell<cCount; cell++)
			  {
				  	cl=rw.getCell(cell);
					data=cl.getStringCellValue();
					System.out.println("Read data : "+data);  		  
			  }
			  System.out.println("-----------------------");
		  }
		   
	  }
	  @BeforeTest
	  public void beforeTest() throws IOException {
		  f=new File(fpath+"\\"+fname);
		  fin=new FileInputStream(f);
		  wb=new HSSFWorkbook(fin); 
		  shNm=wb.getSheetName(0);
		  System.out.println("Sheet Name "+ shNm);
		  sh=wb.getSheet(shNm);
	  }

	  @AfterTest
	  public void afterTest() throws IOException {
		  fin.close();
		  wb.close(); //close workbook
	  }

	
}
