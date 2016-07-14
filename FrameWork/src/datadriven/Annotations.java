package datadriven;

import java.io.IOException;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import packTwo.testBase;

public class Annotations extends testBase {
	
	@BeforeMethod
	public void userIdGeneration() throws IOException{
		Login();
		System.out.println("User ID Generation");
	}
	
	@Test(dataProvider="getData")
	public void userId(String userName, String password, String unique){
		System.out.println("User ID Generation");
		System.out.println(userName);
		System.out.println(password);
		System.out.println(unique);
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
	
	//@Test
	public void aOpenBrowser(){
	System.out.println("test");
	}
	
	//@Test(groups = {"Priority1"})
	public void flightBooking(){
		System.out.println("Flight Booked");
	}
	
	//@Test(groups = {"Priority2"})
	public void flightCancelling(){
		System.out.println("Flight Cancelled");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//i stands for number of times testcase should run
		//j stands for number of parameter it should send for one go.
		Object[][] data = new Object[3][3];
		
		data[0][0] = "abcd1";
		data[0][1] = "xyz1";
		data[0][2] = "dsfg1";
		
		data[1][0] = "abcd2";
		data[1][1] = "xyz2";
		data[1][2] = "dsfg2";
		
		data[2][0] = "abcd3";
		data[2][1] = "xyz3";
		data[2][2] = "dsfg3";
		
		return data;
	}

}
