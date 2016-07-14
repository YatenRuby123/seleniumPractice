package testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTitle {
	
		
		@Test
		public void title(){
			
			System.setProperty("webdriver.gecko.driver", "/home/supershuttle/Downloads/wires");
			WebDriver driver = new MarionetteDriver();
			driver.get("http://man-bok.com/");
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals("Manbok StyleMain Page - Manbok Style", actualTitle);
			//String expectedTitle = 
			
		}
	}


