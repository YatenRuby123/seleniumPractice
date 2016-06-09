import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class ChromiumDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/supershuttle/Downloads/chromedriver");
		
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://www.google.com");

		//If FireFox is not invoked properly
		/* FirefoxBinary ffbinary = new FirefoxBinary(ffpath);
		 * FirefoxProfile ffprofile = new FirefoxProfile();
		 * driver = new FirefoxDriver(ffbinary, ffprofile);
		 */

	}

}
