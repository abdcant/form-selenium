package abbytest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class SwitchWindow {
	
	public static void main (String args[]) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/chromedriver"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
		newTabButton.click();
		
		String originalHandle = driver.getWindowHandle();
		
		for(String handle1: driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		driver.switchTo().window(originalHandle);
		//driver.quit(); 
		
		
		
	}

}
