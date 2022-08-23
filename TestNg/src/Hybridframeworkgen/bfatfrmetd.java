package Hybridframeworkgen;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.IResultListener;

public class bfatfrmetd implements framewkcnst{
	public static WebDriver  driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(geckokey, geckovalue);
		             driver= new FirefoxDriver();
		            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/"); 
	  
	         
	}
	
	@AfterMethod
	public void closeapp(ITestResult res)
	{
		
		if (ITestResult.FAILURE== res.getStatus())
			
		{
			Takescreen.shot(driver);
		}
		
		
		
		
	driver.quit();	
		
		
	}
	
	
	
} 
	
	

