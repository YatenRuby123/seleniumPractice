package packTwo;

import java.io.IOException;

import org.testng.annotations.Test;

public class DependecyAnnot extends testBase{


	@Test
	public void OpenBrowser() throws IOException
	{
		Login();
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
