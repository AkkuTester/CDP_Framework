package data_Source;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	/*
	 * following method will show how to read the data from the excel sheets
	 * first step - is that we need apache poi library to read the data from the excel file
	 */

	private static XSSFWorkbook excelWBook;
	private static XSSFSheet excelWSheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	
	// this is setter method 
	// in this method we are storing the data into the file
	public static void setExcelFile(String filePath, String sheetName) throws Exception {
		
			// we need to load the file first
			// so we will take help of FileInputStream class
			
			//following step will open the excel file(excel because we have give the path of excel file)
			FileInputStream excelFile = new FileInputStream(filePath);
			
			//accessing the work book
			excelWBook = new XSSFWorkbook(excelFile);
			
			//now accessing the work sheet
			excelWSheet = excelWBook.getSheet(sheetName);
			
	}
	/*
	 * following method is a getter method
	 * And it is use to read the data from the Excel file
	 * we are passing 4 parameters here
	 * 1st - filePath = from which file we wanted to read the data
	 * 2nd - sheetName = from which sheet we wanted to read the data
	 * 3rd - rowNum = from which row number we wanted to read the data
	 * 4th - colNum = and finally from which column we wanted to read the data
	 */
	public static String getCellData(String filePath, String sheetName, int rowNum, int colNum) throws Exception {
		setExcelFile(filePath, sheetName); // setted the excel file at run time
 
		row = excelWSheet.getRow(rowNum); // we drew the specific row data
		
		cell = row.getCell(colNum);// we drew the specific cell data
	String cellValue = cell.getStringCellValue(); // drawing cell values
	//double cellValue = cell.getNumericCellValue();
	return cellValue;		
	}
	/*
	 * in the above method we have read the data from the cell, 
	 * now suppose we wanted to write some data at runtime in the cell
	 */
	public static void setCellData(int rowNum, int colNum, String result, String filePath) throws Exception {
		
		row = excelWSheet.getRow(rowNum);
		cell=row.getCell(colNum, row.RETURN_BLANK_AS_NULL);// checking if the cell is 
															//created or not
		
		if(cell==null) { // if not created, means null
			cell = row.createCell(colNum); // then we are creating one cell, at the desired
											// column number
			cell.setCellValue(result); // after cell creation, we are storing required
										//value in it
		}
		else { // if cell is already created, directly store the value in it
			cell.setCellValue(result); // storing the required value in it
		}
		// now we have write down the required result/data at the required cell,
		// now we need to save the file with the help of java program
		// so we will take help of FileOutputStream class from java
		
		FileOutputStream filesave = new FileOutputStream(filePath);
		excelWBook.write(filesave);
		filesave.flush();
		filesave.close();
	}
	/*
	 * following method will read the complete excel sheet
	 */
	
	public static Sheet getCompleteExcelSheet(String filePath, String fileName, String sheetName) throws Exception {
		
	// in the very first step we will create one new file with the help of File class from java
		File excelFile = new File(filePath + "/"+fileName); // created new file
		
		// now we need to read the file, so again we will use inputStream class
		FileInputStream readExcel = new FileInputStream(excelFile);
		//as apache poi will read .xlsx and .xsl files both, so we need to know the extension of
		// the file, 
		// So we will fetch out the extension of the file now
		String extension = fileName.substring(fileName.indexOf(".")); // stored the extension of file
		
		//if the extension is .xlsx then we need to assign XSSF extension to our workbook,
		// to assign an extension to workbook, we first need to have a workbook
		//creating a workbook
		Workbook workbook = null;
		
		// now checking if the extension is .xlsx
		if(extension.equals(".xlsx")) {
			workbook = new XSSFWorkbook(readExcel); // assigned the excel file to workbook
		} else if(extension.equals(".xls")){
			workbook = new HSSFWorkbook(readExcel);
		}
			
		Sheet excelSheet = workbook.getSheet(sheetName);
		return excelSheet;
	}
	
	
	public static void main(String[] args) throws Exception {
	/*String cellValue =	getCellData("C:\\Users\\HP\\eclipse-workspace\\Complex_Design_Pattern_Framework\\TestData\\knowledgeware/excelData.xlsx", 
				"Sheet1", 2, 0);
	System.out.println(cellValue);
	
	setCellData(1, 5, "SBIN", 
			"C:\\Users\\HP\\eclipse-workspace\\Complex_Design_Pattern_Framework\\TestData\\knowledgeware/excelData.xlsx");
	*/
	Sheet sheet = getCompleteExcelSheet("C:\\Users\\HP\\eclipse-workspace\\Complex_Design_Pattern_Framework\\TestData\\knowledgeware", "excelData.xlsx","Sheet1");
	int rowNum = sheet.getLastRowNum();
	
	for(int i=1; i<=rowNum; i++) {
		
		Row row = sheet.getRow(i);
		
		if(row.getCell(3).toString().equals("yes")) {
			System.out.println("yes");
		}else
			System.out.println("no");
	}
	}
}
