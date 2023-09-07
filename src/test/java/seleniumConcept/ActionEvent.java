package seleniumConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEvent {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement productMenu = driver.findElement(By.xpath("//button[@aria-label='Products']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(productMenu).build().perform();
		
		WebElement liveMenu = driver.findElement(By.xpath("//a[@aria-label='Live']"));
		liveMenu.click();
		
		WebElement searchIcon = driver.findElement(By.xpath("//button[@class='doc-search-menu dropdown-toggle doc-search-cta doc-search-menu-icon doc-menu-toggle']"));
		searchIcon.click();
		
		WebElement searchField = driver.findElement(By.xpath("//input[@type='search']"));
		searchField.sendKeys("Test");
		a.sendKeys(Keys.ENTER).build().perform();
		
		//double click
		//context click-right click
		//click-
		
		}

}
