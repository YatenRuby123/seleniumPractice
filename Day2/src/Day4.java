import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;


public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/supershuttle/Downloads/wires");
		WebDriver driver = new MarionetteDriver();
		driver.get("https://www.facebook.com/");
/*		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("test@testing.com");
//		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("abcdefgh");
//		//driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();
//		driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/a")).click();
//		driver.findElement(By.id("email")).sendKeys("test@testing.com");
//		driver.findElement(By.id("pass")).sendKeys("abcdef");
//		driver.findElement(By.linkText("Forgot account?")).click();
		
		driver.findElement(By.className("inputtext")).sendKeys("test@testing.com");
		driver.findElement(By.id("pass")).sendKeys("abcdef");
		driver.findElement(By.linkText("Forgot account?")).click();
		*/
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}
}