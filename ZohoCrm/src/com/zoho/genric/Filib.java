package com.zoho.genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filib {

	public String getProperty(String key) throws IOException {
		
		FileInputStream fis =new FileInputStream("./data/commondata.property"); 
		Properties p= new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;		
	}
	
	public String getExcelData(String Sheet,int Row,int Cell,String path) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis =new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheet).getRow(Row).getCell(Cell).getStringCellValue();
		return data;
		
	}
	
}
