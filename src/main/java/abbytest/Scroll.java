package abbytest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class Scroll {
	
	public static void main (String args[]) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/chromedriver"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		Actions action = new Actions(driver);
		
		WebElement name = driver.findElement(By.id("name"));
		WebElement date = driver.findElement(By.id("date"));
		action.moveToElement(name);
		name.click();
		name.sendKeys("Testers"); 
		date.sendKeys("01/01/2020");
		
		Thread.sleep(2000);
		driver.quit(); 
		
		
		
	}

}
