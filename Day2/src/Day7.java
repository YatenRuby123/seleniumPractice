import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		
		Actions abc = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		abc.moveToElement(element).build().perform();
		WebElement xyzElement = driver.findElement(By.cssSelector("div[class='nav-fill']"));
		abc.keyDown(Keys.SHIFT).moveToElement(xyzElement).sendKeys("nvidia").build().perform();
		Thread.sleep(5000L);
		abc.contextClick(xyzElement).build().perform();
		
	}

}
