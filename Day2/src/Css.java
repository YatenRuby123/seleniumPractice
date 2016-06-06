import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com/");
		driver.findElement(By.cssSelector("a[id='button-login']")).click();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("HelloWorld");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("hello");
		driver.findElement(By.cssSelector("a[id='forgot_password_link']")).click();
		
		//xpath= //tagname[@attribute=value]
		
		/*1.Verify in firebug before you run the script
		2.CSS customized xpath
		3. #idname,  .classname
		4. find the unique attribut
		
		*/
	}

}