package Testannotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {
	//declaration
	@FindBy(xpath ="//input@[id='username ']")
		private WebElement un;
		@FindBy(xpath ="//input@[name='pwd']")
		private WebElement pd;
		@FindBy(xpath ="//div@[.='Login ']")
		private WebElement lgn;
	
	public Pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public  void username( String uname)
	{
		 un.sendKeys(uname);
	}
	public void pass(String pwd) 
	{
		 pd.sendKeys(pwd);
	}
	public void login() 
	{
	     lgn.click();	
	}
	

}
