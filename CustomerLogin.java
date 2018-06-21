package com.common.Flipkart;



import org.junit.Test;

public class CustomerLogin extends ExcelLibrary {
	ExcelLibrary elib=new ExcelLibrary();
	@Test
	public void customerloginTest()
	{
		ExcelLibrary.getExcelData("Sheet1", 2, 1);
		
	}
	

}
