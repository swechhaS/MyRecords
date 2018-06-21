package com.main.Flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummary {
	@FindBy(xpath="//button[.='CONTINUE']")
	WebElement continueBtn;
	
	public void place() {
		continueBtn.click();
	}
	

}
