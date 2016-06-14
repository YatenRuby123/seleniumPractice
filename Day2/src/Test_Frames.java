import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

public class Test_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/supershuttle/Downloads/wires");
		WebDriver driver = new MarionetteDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("HelloWorld");
		
		

	}

}
