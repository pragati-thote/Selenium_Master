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
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

	public class Write_Multi_Cell {

		File f;
		FileOutputStream fout;
		String fpath="D:\\Pragati";
		String fname="Employee_Details.xls";
		HSSFWorkbook wb;
		HSSFSheet sh;
		HSSFRow rw;
		HSSFCell cl;
		int row=0, col;
		
		
		@Test(dataProvider="dp")
		public void MultiCellWrite(String nm, String comp, String loc) {
			col=0;
			rw=sh.createRow(row); //create row at 0th index
			cl=rw.createCell(col);//create cell at 0th index
			cl.setCellValue(nm);  //Name
			
			cl=rw.createCell(col+1);//create cell at 0th index
			cl.setCellValue(comp);  //Company
			
			cl=rw.createCell(col+2);//create cell at 0th index
			cl.setCellValue(loc);  //Location
			
			row++;
			
		}
		
		@BeforeTest
		public void beforeTest() throws FileNotFoundException {
			
			f=new File(fpath+"\\"+fname);
			fout=new FileOutputStream(f);
			wb=new HSSFWorkbook(); //Create blank workbook
			sh=wb.createSheet("Emp"); // Create new sheet
		
		 }
		
	  
		@DataProvider
		  public Object[][] dp() {
		    String[][] detail=new String[3][3];
		    
		    detail[0][0]="NAME";
		    detail[0][1]="COMPANY";
		    detail[0][2]="LOCATION";
		    
		    detail[1][0]="Rani";
		    detail[1][1]="seed";
		    detail[1][2]="Pune";
		    
		    detail[2][0]="Sonal";
		    detail[2][1]="TATA";
		    detail[2][2]="Mumbai";
		    
		    return detail;
		    
		  }

		@AfterTest
		public void afterTest() throws IOException {
			wb.write(fout);
			wb.close(); //close workbook
			fout.close();
			
			System.out.println("Write Operation Done...");
		}
		

	}
	
	
	

