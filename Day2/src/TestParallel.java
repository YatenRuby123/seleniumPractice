import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestParallel {
	
	
	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String nodeUrl;
		String baseUrl;
		//nodeUrl = "http://192.168.75.1:5555/wd/hub";
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(FirefoxDriver.BINARY, new File("C:\\Program Files(x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		capabilities.setJavascriptEnabled(true);
		
		driver = new RemoteWebDriver(new URL("http://192.168.2.7:5555/wd/hub"), capabilities);
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
