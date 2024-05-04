package abbytest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class StandAloneTest {
	
	public static void main (String args[]) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/chromedriver"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".classlocator")));
		
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Testers"); 
		
		WebElement button = driver.findElement(By.id("button"));
		button.click();
		
		driver.quit(); 
		
		/***
		 * The best locators
		 * unique
		 * descriptive
		 * 
		 * avoid using
		 * link
		 * tag
		 * xpath
		 * 
		 * prefer
		 * css selectors
		 * - the most powerful
		 * id
		 * css name
		 * 
		 */
		
		/**
		 * Advance css selectors
		 * 
		 * driver.findElement(By.cssSelector("input[class='q']");
		 * driver.findElement(by.cssSelector("#q");
		 * driver.findElement(By.cssSelector(input[type='radio']);
		 * 
		 * 
		 * 
		 */
		
		//By Prefix
		// <div id="textField_randomId">
		driver.findElement(By.cssSelector("div[id^='textField']"));
		
		//By Suffix
		//<div id="randomId_textField">
		driver.findElement(By.cssSelector("div[id$='textField']"));
		
		//by substring
		// <div id="123_textField_randomId">
		driver.findElement(By.cssSelector("div[id*='textField']"));
		
		
		//Find child
		
		/**
		 * <div
		 */
		
		//cssSelector("ul#id li:nth-child(2)")
	}

}
