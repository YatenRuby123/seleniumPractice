import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		//Count of links in the Entire Web Page
		System.out.println("Links in entire page");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Count of links in the footer section of the page
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println("Links in footer page");
		System.out.println(footer.findElements(By.tagName("a")).size());
		//Count of links in Second column of footer
		WebElement colSecond = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Links in 2nd column of Footer");
		System.out.println(colSecond.findElements(By.tagName("a")).size());
		String beforeClicking = null;
		String afterClicking;
		
		for(int i=0; i<colSecond.findElements(By.tagName("a")).size(); i++){
			System.out.println(colSecond.findElements(By.tagName("a")).get(i).getText());
			if(colSecond.findElements(By.tagName("a")).get(i).getText().contains("Site map")){
				beforeClicking =	driver.getTitle();
				colSecond.findElements(By.tagName("a")).get(i).click();
				break;
			}
			
		}	
		afterClicking = driver.getTitle();
		
		if(beforeClicking != afterClicking){
			if(driver.getPageSource().contains("All Categories")){
			System.out.println("Pass");
			}else{		
			System.out.println("Fails");
		}
	}
	}
}

