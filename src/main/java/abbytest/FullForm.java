package abbytest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
 

public class FullForm {
	
	public static void main (String args[]) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/chromedriver"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		
		WebElement alertButton = driver.findElement(By.id("alert-button"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();

	}

}
