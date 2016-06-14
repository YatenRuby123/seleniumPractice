import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/supershuttle/Downloads/wires");
		WebDriver driver = new MarionetteDriver();
	
		driver.get("http://www.espncricinfo.com/ci/engine/match/913609.html");
		WebElement batTable = driver.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div/table[1]"));
		//Find Rows in table
		List<WebElement> numOfRows = batTable.findElements(By.tagName("tr"));
		System.out.println("Number of Rows in Table 1 is: " + numOfRows.size());
		int i = 0;
		for(WebElement eachRow : numOfRows){
			
			List<WebElement> numOfCol = eachRow.findElements(By.tagName("td"));
			i++;
		System.out.println("Number of Colums in " + i + " are " + numOfCol.size());
		
		for(WebElement eachRowText: numOfCol){
			System.out.println(eachRowText.getText());
		}
	
		}
	}

}
