package abbytest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class Dropdown {
	
	public static void main (String args[]) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/chromedriver"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		
		WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
		dropdown.click();
		WebElement dropdownShow = driver.findElement(By.cssSelector(".dropdown-menu.show a"));
		

		Select select = new Select(dropdownShow);
		select.selectByVisibleText("Buttons");
		
		
		
		//alert.dismiss();

	}

}
