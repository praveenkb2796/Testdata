package webshop;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;

public class webshoptstscpt extends genericwebshp
{
	@Test
	public void script()
	{
		    pomweb pmc = new pomweb(driver);
		    pmc.getbookpage();
		   
		 pmc.addtcrtbk1() ;
		 pmc.addtcrtbk2();
		 pmc.gotocart();
		   double b1 = pmc.book1price();
		   double b2 = pmc.book2price();
		 
		if( b1>b2)
		{
			
			pmc.removebook2() ;
			pmc.updatecart() ;
			
		}
		else
		{
			pmc.removebook1()  ;
			pmc.updatecart() ;
		}
		
		}
	

}
