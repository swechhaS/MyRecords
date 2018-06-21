package com.main.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement userEdt;

	@FindBy(xpath = "//input[@type='password']")
	WebElement userPwd;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement submitBtn;

	WebDriver driver;

	/*public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/
	
	

	public void login(String uName, String uPwd) {
		userEdt.sendKeys("8337979642");
		userPwd.sendKeys("choclate123");
		submitBtn.click();
	}

}
