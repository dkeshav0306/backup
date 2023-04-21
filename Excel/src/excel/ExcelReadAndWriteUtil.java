package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadAndWriteUtil {
	public void excelweite(int sheetno, int rowvalue, int cellvalue, String data) throws IOException {
		
		//load excel file
		FileInputStream load = new FileInputStream("E:\\testing\\keshavendra.xlsx");
		
		// access the workbook
		XSSFWorkbook workbook = new XSSFWorkbook (load);
		// get sheet from workbook
		XSSFSheet sheet1 = workbook.getSheetAt(sheetno);
		// perform output action on output stream
		FileOutputStream writeOuput = new FileOutputStream("E:\\\\testing\\\\keshavendra.xlsx");
		sheet1.createRow(rowvalue).createCell(cellvalue).setCellValue(data);
		workbook.write(writeOuput);
		
	
	}	

	public void excelRead(int sheetNo, int rowVal, int cellVal) throws IOException {
		//load excel file
		FileInputStream load = new FileInputStream(
		"E:\\\\\\\\testing\\\\\\\\keshavendra.xlsx");
		// workbook of excel
		XSSFWorkbook workbook = new XSSFWorkbook (load);
		// get sheet from workbook
		XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);
		// read cell
		String data = sheet1.getRow(rowVal).getCell(cellVal).getStringCellValue();
		System.out.println(data);
	}
}
