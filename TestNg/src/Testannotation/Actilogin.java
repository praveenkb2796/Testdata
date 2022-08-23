package Testannotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actilogin {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	                WebDriver driver = new FirefoxDriver();
	                driver.get("http://localhost:8080/login.do");
	                Pom_class pmc = new Pom_class(driver);
	                pmc.username("admin");
	                pmc.pass("manger");
	                pmc.login();
	                Thread.sleep(3000);
	                driver.navigate().refresh();
	                Thread.sleep(3000);
	                pmc.login();
	     	}

}
