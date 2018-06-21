package com.main.Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.common.Flipkart.commonClasss;

//import com.flipkart.customerLogin.commonClasss;

//import 

@Test
public class FlipKart 
{

	public void loginTest() throws Throwable 
	{
try{
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.flipkart.com");
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		//LoginPage lp = new LoginPage();
		commonClasss cc = new commonClasss(dr);
		cc.login();

		Thread.sleep(2000);
		//HomePage hp = new HomePage(dr);
		//cc.search(null);

		//ItemPage ip = new ItemPage();
		cc.ClickOnItem();
		Thread.sleep(2000);

		//DesiredItem d = new DesiredItem();
		
		//Thread.sleep(2000);
		//WebDriverWait wait=new WebDriverWait(dr, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")));
		cc.add();
		Thread.sleep(2000);
		//AddToCart a = new AddToCart();
		cc.order();
		Thread.sleep(2000);

		//OrderSummary odp = new OrderSummary();
		cc.place();
		Thread.sleep(2000);
		
		cc.captcha();
		Thread.sleep(4000);
		
		
		//cc.captchaFill();
		//Thread.sleep(4000);
		

		
		
/*		//login page
		LoginPage lp=PageFactory.initElements(dr, LoginPage.class);
		lp.login("8337979642", "choclate123");
		
		//home page
		HomePage hp=PageFactory.initElements(dr, HomePage.class);
		hp.search("nokia 6");
		
		//list of products
		ItemPage ip=PageFactory.initElements(dr, ItemPage.class);
		ip.ClickOnItem();
		
		//select desired item
		DesiredItem dp= PageFactory.initElements(dr, DesiredItem.class);
		dp.add();
		
		//add to cart
		AddToCart ap=PageFactory.initElements(dr, AddToCart.class);
		ap.order();
		
		//order summary page
		OrderSummary op=PageFactory.initElements(dr, OrderSummary.class);
		op.place();
		*/
		
	}
catch (Exception e) {
    e.printStackTrace();
    throw(e);
}


	}

}
