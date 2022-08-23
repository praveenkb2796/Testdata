package Testannotation;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class2 {
	
	@FindBy(id="username")
	private  WebElement uname;
	
	@FindBy(name="pwd")
	private   WebElement pass;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgn;
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tsk; 
	 
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement rep; 
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement user;
	
	@FindBy(xpath = "//div[.='Notifications']")
	private WebElement notify ;
	
	
	@FindBy(xpath = "//div[.='Logout']")
	private WebElement lgt_btn ;
	         
	public Pom_class2(WebDriver driver )
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void username(String name)
	{
		uname.sendKeys(name);  	
	}
	
	public void password(String word)
	{
		pass.sendKeys(word);  	
	}
	public void login()
	{
		lgn.click();  	
	}
	public void tasks()
	{
		tsk.click(); 	
	}
	public void reports()
	{
		rep.click(); 	
	}
	public void users()
	{
		user.click(); 	
	}
	public void notifications()
	{
		notify.click(); 	
	}
	public void logout()
	{
		lgt_btn.click(); 	
	}
	
	
}
