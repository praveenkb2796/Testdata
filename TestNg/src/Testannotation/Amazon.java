package Testannotation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon extends Amagenric {
	
	@Test
	private void Action() {
		WebElement ele = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
				          Actions a = new Actions(driver);
		       a.moveToElement(ele).perform();
		 WebElement ele1 = driver.findElement(By.xpath("//span[.='Sign in']"));
		 a.moveToElement(ele1).perform();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'])")).sendKeys("Laptops");
		driver.findElement(By.xpath("//input[@type='submit']" )).click();
		
		

	}
	
	
	
	
	
	
	
	

}
