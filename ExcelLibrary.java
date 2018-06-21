package com.main.Flipkart;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary 
{
	public String getExcelData(String sheetName, int rowNum,int cellNum)
	{
		String retval=null;
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\cordis\\workspace\\flipkartFrameWork\\flipkart\\TestData\\Data.xls");
			Workbook wb=WorkbookFactory.create(fis);
		
			
			Sheet s=wb.getSheet(sheetName);
			Row r=s.getRow(rowNum);
			Cell c=r.getCell(cellNum);
			retval=c.getStringCellValue();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retval;
		
	}
	public int getRowCount(String sheetName)
	{
		int rowCount=0;
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\cordis\\workspace\\flipkartFrameWork\\flipkart\\TestData\\Data.xls");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			rowCount = s.getLastRowNum();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return rowCount;	
	}
	
	public void setExcelData(String sheetName, int rowNum, int cellNum, String data)
	{
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\cordis\\workspace\\flipkartFrameWork\\flipkart\\TestData\\Data.xls");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			Row r=s.createRow(rowNum);
			Cell c=r.createCell(cellNum);
			c.setCellValue(data);
			FileOutputStream fos=new FileOutputStream("C:\\Users\\cordis\\workspace\\flipkartFrameWork\\flipkart\\TestData\\Data.xls");
			wb.write(fos);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (InvalidFormatException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
}
