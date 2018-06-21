package com.main.Flipkart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class RunClass extends BaseClass 
{
	@Test
	public void loginTest() throws InterruptedException 
	{
		try{
			WebDriver driver = null;
			
			
			//BaseClass cc = new BaseClass();
			//login page
			LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
			lp.login("8337979642", "choclate123");
		
			//home page
			HomePage hp=PageFactory.initElements(driver, HomePage.class);
			hp.search("nokia 6");
		
			//list of products
			ItemPage ip=PageFactory.initElements(driver, ItemPage.class);
			ip.ClickOnItem();
		
			//select desired item
			DesiredItem dp= PageFactory.initElements(driver, DesiredItem.class);
			dp.add();
		
			//add to cart
			AddToCart ap=PageFactory.initElements(driver, AddToCart.class);
			ap.order();
		
			//order summary page
			OrderSummary op=PageFactory.initElements(driver, OrderSummary.class);
			op.place();
		}
		
catch (Exception e) 
		{
    	e.printStackTrace();
    	throw(e);
		}
	
	}
}