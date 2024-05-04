package abbytest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
 

public class RadioButtons {
	
	public static void main (String args[]) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/chromedriver"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		
		WebElement radio1 = driver.findElement(By.id("radio-button-1"));
		radio1.click();

		WebElement radio2 = driver.findElement(By.cssSelector("input[value='option2']"));
		radio2.click();
		radio2.sendKeys(Keys.RETURN);
		
		//alert.dismiss();

	}

}
