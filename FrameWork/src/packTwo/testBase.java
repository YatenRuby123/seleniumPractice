package packTwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testBase {
	
	public WebDriver driver = null;
	
	@Test
	public void Login() throws IOException{
		
		
		Properties prop = new Properties();
		FileInputStream fIS = new FileInputStream("/home/supershuttle/workspaceSelenium/FrameWork/src/packTwo/datadriven.properties");
		prop.load(fIS);
		
		//System.out.println(prop.getProperty("username"));
		
		System.setProperty("webdriver.gecko.driver", "/home/supershuttle/Downloads/wires");
		if(prop.getProperty("browser").equals("firefox")){
		 driver = new MarionetteDriver();
		}
		else if(prop.getProperty("browser").equals("chrome")){
			 driver = new org.openqa.selenium.chrome.ChromeDriver();
		}else{
			driver = new org.openqa.selenium.chrome.ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		//driver.findElement(ByXPath.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		driver.findElement(ByXPath.xpath(".//*[@id='gmail-sign-in']")).click();
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
