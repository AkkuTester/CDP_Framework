package demo_Testings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderDemo {
	// first to read the data from any excel, we need 4 things
	// file (workbook)
	// sheet(worksheet)
	//row number
	// column number
	// row number + column number = cell number
	
	//we take help of encapsulation here
	private static XSSFWorkbook excelWbook;
	private static XSSFSheet excelWsheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	
	public static void setExcel(String fileLocation, String sheetName) throws Exception {
		
	// 1st step is to read the file, with the help of fileInputstream Class
		FileInputStream excelfile = new FileInputStream(fileLocation);
		
	//now as we have read the file, we need to store that file in excelWbook 
		excelWbook = new XSSFWorkbook(excelfile);
		excelWsheet = excelWbook.getSheet(sheetName);
	}

	public static void main(String[] args) throws Exception {
		setExcel("C:\\Users\\HP\\eclipse-workspace\\Complex_Design_Pattern_Framework\\TestData\\knowledgeware/excelData.xlsx",
				"Sheet1");
	}
}
