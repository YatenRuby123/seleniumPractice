package testngFiles;

import org.testng.annotations.Test;

public class DependecyAnnot {


	@Test
	public void OpenBrowser()
	{
	System.out.println("Executing Opening Browser");
	}
	
	@Test (dependsOnMethods = {"OpenBrowser"}, alwaysRun=true)
	public void flightBooking()
	{
		System.out.println("Executing Flight Booking");
	}
	
 
	@Test(timeOut = 6000)
	public void timeRelated()
	{
		System.out.println("New TimeOut");
	}
	

	/*@Test(enabled = false)
	public void dataProvider()
	{
		System.out.println("New Test Case");
	}*/
	
	
	@Test(enabled = false)
	public void Payment()
	{
		System.out.println("New Test Case");
	}
	

}
