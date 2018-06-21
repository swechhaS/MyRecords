package com.main.Flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart {
@FindBy(xpath="//span[.='Place Order']")
WebElement placeOrder;

public void order() {
	placeOrder.click();
}
	
}
