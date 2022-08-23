package Frameworkpomng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Testannotation.Generic_screenshot;

public class yahoobaseclass {
	
	WebDriver  driver;
	@BeforeMethod
   public void  openapp() {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		            driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.mail.yahoo.com/");
	}
	
	
	@AfterMethod
	public void closeapp(ITestResult res) throws IOException
	{
		if (ITestResult.FAILURE==res.getStatus()) 
		{
			Generic_screenshot.getphoto(driver);
		}
		
			driver.quit();
	}	

	
}
	
	
	
	
	
	
	


