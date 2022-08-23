package Testannotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class tstann2 {
	

 	@Test(invocationCount=3)
 	public void test1()
 	{
 		Reporter.log("Hello", true);
		}
 	@Test
 	public void test2()
 	{
 		Reporter.log("Bye", true);
		}
	@Test(invocationCount=0)
 	public void test3()
 	{
 		Reporter.log("Praveenkb", true);
		}
	@Test(invocationCount=-5)
 	public void test4()
 	{
 		Reporter.log("Praveen", true);
		}
	@Test
 	public void test5()
 	{
 		Reporter.log("Kumar", true);
		}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	

