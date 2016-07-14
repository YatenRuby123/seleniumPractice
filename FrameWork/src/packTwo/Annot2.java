package packTwo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {
	
	@BeforeSuite
	public void installSoftware(){
		System.out.println("I am the first to be executed");
	}
	
	@Test
	public void software(){
		System.out.println("I am the test");
	}
	
	@AfterSuite
	public void deinstallSoftware()
	{
		System.out.println("I am the Last");
	}

}
