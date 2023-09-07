package seleniumConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); 

		WebDriver Driver = new ChromeDriver();

		Driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		Driver.manage().window().maximize();
		
		 WebElement ClickMeBtn= Driver.findElement(By.cssSelector("button#promptBox"));
		 
		 ClickMeBtn.click();
		 
		Alert a= Driver.switchTo().alert();
		
	    a.sendKeys("Test Automation");
	    a.accept();
		
		
		

		 
		 
		
	}
}
