package Frameworkpomng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_class3 {

	@FindBy(xpath ="//a[.='Sign in']")
	      private WebElement  sgn;
	
	@FindBy(id="login-username")
    private WebElement  un;
	
	@FindBy(id="login-signin")
    private WebElement  nxt1;

	@FindBy(name="password")
    private WebElement  pwd;
	
	@FindBy(name="verifyPassword")
    private WebElement  nxt2;
	
    @FindBy(xpath = "//button[@title='Close']")
    private WebElement  cls;
	  
	
    @FindBy(xpath ="//a[.='Compose']")
    private WebElement  cmp;
    
    @FindBy(id="message-to-field")
    private WebElement  to;
    
    
     @FindBy(xpath = "//input[@data-test-id='compose-subject']")
    private WebElement  sub;
	
	
	
	 
	
	
	
	
	

}
