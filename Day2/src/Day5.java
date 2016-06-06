import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.goindigo.in/");
		WebElement address = driver.findElement(By.xpath("html/body/div[2]/div[3]/div[3]/div[2]/div/div[1]/div[2]/div[1]/span/span/select"));
		Select abc = new Select(address);
		abc.selectByVisibleText("Goa");
		abc.selectByIndex(3);
		abc.selectByValue("Mumbai");
		
		
	}

}
