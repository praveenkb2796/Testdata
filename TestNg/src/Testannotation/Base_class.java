package Testannotation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class {
	
	   WebDriver  driver;
	@BeforeMethod
   public void  openapp() {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		            driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/login.do");
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
