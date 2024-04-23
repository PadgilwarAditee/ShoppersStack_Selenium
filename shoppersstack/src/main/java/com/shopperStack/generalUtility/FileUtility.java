 package com.shopperStack.generalUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class FileUtility implements FrameWorksConstants{
	public FileInputStream fis;
	
	public String readPropertyFile(String key) throws IOException {
		fis= new FileInputStream(propertyPath);
		Properties prop= new Properties();
		prop.load(fis);
		
		String value= prop.getProperty(key);
		return value;
	}
	
	public String excelFile(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		
		String value= wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
}
