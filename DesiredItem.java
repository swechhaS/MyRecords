package com.main.Flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesiredItem {
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement add;
	
	public void add() {
		add.click();
		
	}

}
