package abbytest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class DragAndDrop {
	
	public static void main (String args[]) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/chromedriver"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement image = driver.findElement(By.id("image"));
		WebElement box = driver.findElement(By.id("box"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(image, box);
		action.build().perform();
		Thread.sleep(1000);
		
		driver.quit(); 
		
		
		
	}

}
