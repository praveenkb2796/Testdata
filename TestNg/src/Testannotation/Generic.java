package Testannotation;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	WebDriver  driver;
	@BeforeMethod
	public  void openapp()
 {
   System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		
	}
	
	@AfterMethod
 public void closeapp() throws InterruptedException	
 {
		Thread.sleep(3000);
		driver.quit();
	
	
	
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	


