import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.os.WindowsUtils;

public class ProcessTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/supershuttle/Downloads/wires");
		
		FirefoxProfile fFProf = new FirefoxProfile();
		fFProf.setAcceptUntrustedCertificates(false);
		
		
		WebDriver driver = new MarionetteDriver();
		
		//WindowsUtils.tryToKillByName("gedit");
		driver.get("https://www.google.com/?gws_rd=ssl");
		Set<Cookie> abc= driver.manage().getCookies();
		System.out.println(abc.size());
		driver.manage().deleteAllCookies();
		Set<Cookie> abcd= driver.manage().getCookies();
		System.out.println(abcd.size());
	}

}
