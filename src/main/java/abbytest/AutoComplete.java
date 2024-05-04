package abbytest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class AutoComplete {
	
	public static void main (String args[]) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/chromedriver"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement address = driver.findElement(By.id("autocomplete"));
		address.sendKeys("Caniogan");
		
		Thread.sleep(2000);
		driver.quit(); 
		
		
		
	}

}
