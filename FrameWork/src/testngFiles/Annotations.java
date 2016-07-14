package testngFiles;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void userIdGeneration(){
		System.out.println("User ID Generation");
	}
	
	@AfterMethod
	public void confirmUserId(){
		System.out.println("User ID Confirmed");
	}
	
	@BeforeTest
	public void cookies(){
		System.out.println("Delete the cookies");
	}
	
	@AfterTest
	public void cookiesClose(){
		System.out.println("Deleting cookies after completing all the tests");
	}
	
	@Test
	public void aOpenBrowser(){
	System.out.println("test");
	}
	
	@Test
	@Parameters({"adminUserId"})
	
	//(groups = {"Priority1"})
	public void flightBooking(String userId){
		System.out.println(userId);
		System.out.println("Flight Booked");
	}
	
	@Test(groups = {"Priority2"})
	public void flightCancelling(){
		System.out.println("Flight Cancelled");
	}

}
