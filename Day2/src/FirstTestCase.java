import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webDriver Code
		
		WebDriver fFDriver = new FirefoxDriver();   //Runtime polymorphism
		fFDriver.get("http://google.com");
		System.out.println(fFDriver.getCurrentUrl());
		//System.out.println(fFDriver.getPageSource());
		System.out.println(fFDriver.getTitle());
	}

}
