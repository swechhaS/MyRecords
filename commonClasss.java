package com.common.Flipkart ;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class commonClasss {

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement userEdt;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement userPwd;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submitBtn;

	@FindBy(name="q")
	private WebElement searchEdt;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchBtn;

	@FindBy(xpath = "//div[.='Nokia 6 (Matte Black, 64 GB)']")
	private WebElement itemToSaveInCart;

	@FindBy(xpath = "(//div[@class='_1vC4OE _2rQ-NK'])[1]")
	private WebElement itemPrice;
	
	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement add;

	
	@FindBy(xpath = "//span[.='Place Order']")
	private WebElement placeOrder;

	@FindBy(xpath="//img[@class='AVMILy']")
	private WebElement captcha;
	
	@FindBy(xpath="//input[@name='captcha']")
	WebElement entercaptcha;
	
	@FindBy(xpath="//span[.='Confirm Order']")
	private WebElement confirm;
	
	private WebDriver driver;

	public commonClasss(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	public void search(String item) throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\cordis\\workspace\\selenium\\data\\Data.xls");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row r4 =sh.getRow(4);
		
		String item1=r4.getCell(1).getStringCellValue();
		
		d.get(url);
		
		
		searchEdt.sendKeys(item1);
		searchBtn.click();
	}*/

	public void login() throws Throwable {
		userEdt.sendKeys("8337979642");
		userPwd.sendKeys("choclate123");
		submitBtn.click();
		
//ExcelLibrary ll = new ExcelLibrary();		

//System.out.println(ll.getExcelData("Sheet1", 2, 1));

	/*FileInputStream fis=new FileInputStream("C:\\Users\\cordis\\workspace\\selenium\\data\\Data.xls");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	Row r2=sh.getRow(2);		
	Row r3=sh.getRow(3);
		*/
		/*String filename;
		int rowcount = ExcelLibrary.getRowCount("Sheet1"); 
		
		int j=rowcount;
		String uvalue="";
		String upwd="";
		
		System.out.println("row count=" +j);*/
		
	/*try
			{
			 uvalue = ExcelLibrary.getExcelData("Sheet1",2,1);
			 uvalue = ExcelLibrary.getExcelData("Sheet1",3,1);
				
			 //To print the Url which is running
			  System.out.println(uvalue);
			  System.out.println(upwd);
			 
			 //URL is taken from excel file
			 //driver.get(value);
		
			  userEdt.sendKeys(uvalue);
			  userPwd.sendKeys(upwd);
			  submitBtn.click();
			  }*/
		/*catch(Exception e)
		{
			System.out.println("Exception occured"); 
			
		}
*/
	
	}
	

	/*public void add() {
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String pid=it.next();
	String cid=it.next();
			add.click();
		driver.close();
		driver.switchTo().window(pid);

	}
	*/
	
	
	
	
	
	
public void add() {
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		add.click();

	}
	
	public void order() {
		placeOrder.click();

	}

	public void ClickOnItem() {
		itemToSaveInCart.click();

	}

	@FindBy(xpath="//button[.='CONTINUE']")
	private WebElement continueBtn;
	
	public void place() {
		continueBtn.click();
	}
	
	public String captcha(){
		captcha.getText();
		System.out.println(captcha.getText());
		return captcha.getText();
	}
	
	public void captchaFill() {
		entercaptcha.sendKeys(captcha());
	}
	
	public void confirm() {
		confirm.click();
	}
	
	
}

