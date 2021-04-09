package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import testcase.Baseclass;

public class Xutils extends Baseclass
{
	
	 @DataProvider(name="data")
   public static String[][] excel() throws IOException
  {
	 String value1 [][];
	 File src=new File(excel);
	 FileInputStream fis=new FileInputStream(src);
	 XSSFWorkbook workbook=new XSSFWorkbook(fis);
	 XSSFSheet sheet=workbook.getSheet("Shibam1");
	 int rows=sheet.getLastRowNum();
	 int columns=sheet.getRow(0).getLastCellNum();
	 value1=new String[rows][columns];
	 for(int i=1;i<=rows;i++)
	 {
		 XSSFRow row=sheet.getRow(i);
		 for(int j=0;j<columns;j++)
		 {
			 XSSFCell columns1=row.getCell(j);
			 value1[i-1][j]=columns1.toString();
		 }
	 }
	 return value1;
	
	 
  }
}
