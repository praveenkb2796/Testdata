package Testannotation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_screenshot {
	
	public static void getphoto(WebDriver driver) throws IOException
	{
	      TakesScreenshot tss = (TakesScreenshot) driver;
	      File src = tss.getScreenshotAs(OutputType.FILE);
	                   File dst = new File("./Screenshot/firstdefect.jpg");
	                 FileHandler.copy(src, dst) ; 
	
		
	}
	
	}
