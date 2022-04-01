package JavaProgrames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readExcelSheet() throws IOException
	{
		String filePath = "D:\\selenium\\gitIntegration\\src\\main\\resources\\personDetails.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int cols  = sheet.getRow(0).getLastCellNum();
		System.out.println("rows are "+rows +" and columns are "+cols);
		
		for ( int i=0 ; i<rows ; i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			
			for ( int j=0; j<cols;j++)
			{
				 XSSFCell cell = row.getCell(j);
				 
				 switch(cell.getCellType())
				 {
				 case STRING  :System.out.print(cell.getStringCellValue());break;
				 case NUMERIC  :System.out.print(cell.getNumericCellValue());break;
				 case BOOLEAN  :System.out.print(cell.getBooleanCellValue());break;
				
			
				 }
				 System.out.println("|");
				 
			}
						 
			
			
			
			
		}
		
		
		

		
		
		
		
	}
	
	
	
	
}
