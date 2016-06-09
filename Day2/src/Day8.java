import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		Actions abc = new Actions(driver);
		//driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='hometab1']/div[1]/div[2]/ul/li[1]/a")).click();
		
		Thread.sleep(5000L);
		abc.moveToElement(driver.findElement(By.cssSelector("a[href*='goldloan']"))).build().perform();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("a[href*='goldloan']")).sendKeys(Keys.ENTER);
		
		
	}

}
