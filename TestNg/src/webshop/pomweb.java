package webshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomweb extends genericwebshp {

	@FindBy(xpath ="//a[.='Books']")
	private WebElement  books;

	@FindBy(xpath ="(//input [@class='button-2 product-box-add-to-cart-button'])[1]")
	private WebElement  cpbk;

	@FindBy(xpath ="(//input [@class='button-2 product-box-add-to-cart-button'])[2]")
	private WebElement  fibk;

	@FindBy(xpath ="//input[@class='button-1 cart-button']")
	private WebElement  gtc;

	@FindBy(xpath ="//span [.='10.00' and @class='product-subtotal']")
	private WebElement  cpbkp;

	@FindBy(xpath ="//span [.='24.00' and @class='product-unit-price']")
	private WebElement  fibkp;

	@FindBy(xpath ="(//input [@name='removefromcart']) [2]")
	private WebElement  ckbx2;

	@FindBy(xpath ="(//input [@name='removefromcart']) [1]")
	private WebElement  ckbx1;

	@FindBy(xpath ="//input [@name='updatecart']")
	private WebElement  upd;

	public pomweb( WebDriver driver)
	{
		PageFactory.initElements(driver, this); 

	}

	public void getbookpage()
	{
		books.click();
	}

	public void addtcrtbk1() 
	{
		
		
		cpbk.click();
	}

	public void addtcrtbk2() 
	{
		fibk.click();
	}

	public void gotocart() 
	{
		
		Actions shct = new Actions(driver);
		 shct.moveToElement(gtc);
		gtc.click();	
	}

	public double book1price() 
	{
		String s1 = cpbkp.getText();
		double A = Double.parseDouble(s1);
		  return A;
		
	}

	public double book2price()              
	{
		String s2 = fibkp.getText();
		double B = Double.parseDouble(s2); 
		return B;
	}
	
	public void removebook2() 
	{
		ckbx2.click();
		
	}

	public void removebook1() 
	{
		ckbx1.click();
		
	}
	
	public void updatecart() 
	{
		upd.click();
		
	}

}
