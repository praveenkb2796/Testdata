package Frameworkpomng;

import org.testng.Assert;
import org.testng.annotations.Test;

import Testannotation.Pom_class2;

public class yahoscript  extends yahoobaseclass
{
	  @Test
	  public void script() throws InterruptedException
	  {
		    Pom_class3 pmc=new Pom_class3(driver);
		     pmc.username("admin");
		               //  WebDriverWait wait = new WebDriverWait(driver, 20);
		              //   wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@name='pwd']")));
		         Thread.sleep(3000);         
		     pmc.password("manager");
		     Thread.sleep(2000); 
		     pmc.login();
		     Thread.sleep(2000); 
		     pmc.tasks();
		     Thread.sleep(2000); 
		     pmc.reports();
		     Thread.sleep(2000); 
		     pmc.users();
		     Thread.sleep(2000); 
                  String title = driver.getTitle();	
                  System.out.println(title);
           Assert.assertEquals(title,"actitime user");
           Thread.sleep(2000); 
		                 pmc.notifications();
		                 Thread.sleep(2000); 
		     pmc.logout();
	  }
}


