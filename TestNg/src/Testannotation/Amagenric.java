package Testannotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Amagenric {
               WebDriver driver;
	@BeforeMethod
	public void open()
	{
	   System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	           driver=new FirefoxDriver();
	     driver.get("https://www.amazon.in/ ");
	    
	}
	
	@AfterMethod
	private void close() {
		driver.quit();

	}
	
	
	
	
}