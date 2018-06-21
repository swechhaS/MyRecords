package com.main.Flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage {
@FindBy(xpath="//div[.='Nokia 6 (Matte Black, 64 GB)']")
WebElement itemToSaveInCart;

@FindBy(xpath="(//div[@class='_1vC4OE _2rQ-NK'])[1]")
WebElement itemPrice;

public void ClickOnItem() {
	itemToSaveInCart.click();
	
}
	
}
