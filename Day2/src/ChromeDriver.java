
import java.awt.SystemTray;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public abstract class ChromeDriver {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/supershuttle/Downloads/chromedriver");
		
		WebDriver cDriver = new org.openqa.selenium.chrome.ChromeDriver();
		cDriver.get("http://www.google.com");
		System.out.println(cDriver.getCurrentUrl());
		
		
//		System.setProperty("webdriver.ie.driver", "value");
//		
//		WebDriver iEDriver = new InternetExplorerDriver();
//		iEDriver.get("http://www.google.com");
		
	}

}
