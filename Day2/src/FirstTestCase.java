import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webDriver Code
		
		System.setProperty("webdriver.gecko.driver", "/home/supershuttle/Downloads/wires");
		WebDriver fFDriver = new MarionetteDriver();   //Runtime polymorphism
		fFDriver.get("http://google.com");
		System.out.println(fFDriver.getCurrentUrl());
		//System.out.println(fFDriver.getPageSource());
		System.out.println(fFDriver.getTitle());
	}

}
