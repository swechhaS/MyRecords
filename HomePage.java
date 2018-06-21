package com.main.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
@FindBy(name="q")
WebElement searchEdt;

@FindBy(xpath="//button[@type='submit']")
WebElement searchBtn;

public HomePage(WebDriver dr) {
	//String item = "";
	// TODO Auto-generated constructor stub
	searchEdt.sendKeys("nokia 6");
	searchBtn.click();
	
}

public void search(String item) {
	searchEdt.sendKeys(item);
	searchBtn.click();
}
}
