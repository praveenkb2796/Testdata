package Testannotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class tstann3 {

	@Test(enabled=false)
 	public void test1()
 	{
 		Reporter.log("Hello", true);
		}
 	@Test
 	public void test2()
 	{
 		Reporter.log("Bye", true);
		}
	@Test(enabled=false)
 	public void test3()
 	{
 		Reporter.log("Praveenkb", true);
		}
	@Test
 	public void test4()
 	{
 		Reporter.log("Praveen", true);
		}
	@Test(enabled=false)
 	public void test5()
 	{
 		Reporter.log("Kumar", true);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
