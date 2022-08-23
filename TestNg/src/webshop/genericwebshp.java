package webshop;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class genericwebshp extends framecnst {
	
	WebDriver  driver;
	@BeforeMethod
   public void  openapp() {
		System.setProperty(geckokey,geckovalue);
		            driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
	}
	
	
	@AfterMethod
	public void closeapp() throws IOException
	{
//		if (ITestResult.FAILURE==res.getStatus()) 
//		{
//			Generic_screenshot.getphoto(driver);
//		}
		
			driver.quit();
	}	

	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


