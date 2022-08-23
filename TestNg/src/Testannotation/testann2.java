package Testannotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testann2 {

	
	 	@Test(priority=-15)
	 	public void test1()
	 	{
	 		Reporter.log("Hello", true);
			}
	 	@Test(priority=2)
	 	public void test2()
	 	{
	 		Reporter.log("Bye", true);
			}
		@Test(priority=1)
	 	public void test3()
	 	{
	 		Reporter.log("Praveenkb", true);
			}
		@Test
	 	public void test4()
	 	{
	 		Reporter.log("Praveen", true);
			}
		@Test(priority=0)
	 	public void test5()
	 	{
	 		Reporter.log("Kumar", true);
			}

		

	}


