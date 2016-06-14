import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/supershuttle/Downloads/wires");
		WebDriver driver = new MarionetteDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
//		driver.findElement(By.tagName("a")).click();
		Actions abc = new Actions(driver);
		WebElement signIn = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		Thread.sleep(10000L);
		abc.moveToElement(signIn).build().perform();
		WebElement xyz = driver.findElement(By.xpath(".//input[@class='nav-input']"));
		abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("nvidia sheild").build().perform();
		abc.contextClick(xyz).build().perform();
	}

}
