package abbytest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class KeyPressAndClick {
	
	public static void main (String args[]) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/chromedriver"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Testers"); 
		
		WebElement button = driver.findElement(By.id("button"));
		button.click();
		Thread.sleep(2000);
		driver.quit(); 
		
		
		
	}

}
