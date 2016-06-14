import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/supershuttle/Downloads/wires");
		WebDriver driver = new MarionetteDriver();
		driver.get("http://www.etihad.com/en-us/");
		//driver.findElement(By.xpath(".//*[@id='frm_oneWayFlight']")).click();
		List<WebElement> abc = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(abc.size());
		System.out.println(abc.get(1).isSelected());
		abc.get(1).click();
		System.out.println(abc.get(1).isSelected());
		driver.findElement(By.xpath(".//input[@data-datevalue='06/06/2016']")).clear();
		driver.findElement(By.xpath(".//input[@data-datevalue='06/06/2016']")).sendKeys("07/07/2016");;
		if(driver.findElement(By.xpath(".//*[@id='frm_2012158061206151239']")).isDisplayed()){
			System.out.println("Return is displayed");
			System.out.println(driver.findElement(By.xpath(".//*[@id='frm_2012158061206151239']")).isEnabled());
		}else{
			System.out.println("Only Outbound is Displayed");
			abc.get(0).click();
			System.out.println(driver.findElement(By.xpath(".//*[@id='frm_2012158061206151239']")).isDisplayed());
			System.out.println(driver.findElement(By.xpath(".//*[@id='t1-p1']/fieldset/div[4]/div[2]/label")).getText());
		}
		
		
		WebElement address = driver.findElement(By.xpath(".//*[@id='passengers-adults']"));
		Select abcd = new Select(address);
		abcd.selectByVisibleText("4");
		
		
		/*
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath(".//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[2]/a")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='globalModal']/div/div/div[2]")).getText());
		Thread.sleep(5000L);
		driver.findElement(By.xpath(".//*[@id='globalModal']/div/div/div[3]/button")).click();*/
		
		
		/*Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();		
		al.dismiss();*/
	}

}
