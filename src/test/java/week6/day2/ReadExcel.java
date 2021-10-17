package week6.day2;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public String[][] readExcel(String fileName) throws IOException {
		
		// for WorkBook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		// enter into the sheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		
		// get count of rows
		int rowCount = sh.getLastRowNum();
		System.out.println(rowCount);
		
		// get count of column
		int colCount = sh.getRow(0).getLastCellNum();
		System.out.println(colCount);
		
		String[][] data = new String[rowCount][colCount];
		
		// for Rows
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sh.getRow(i); 					// enter into the row
			
			// for Columns
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j); 			// enter into the column
				String val = cell.getStringCellValue(); 	// Read the data
				System.out.println(val);
				
				data[i-1][j] = val;
			}
		}
		
		return data;
	}

}
