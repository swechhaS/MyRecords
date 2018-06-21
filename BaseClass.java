package com.main.Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public void base()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.flipkart.com");
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	

}
