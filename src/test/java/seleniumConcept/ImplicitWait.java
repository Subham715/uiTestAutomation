package seleniumConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	
	
	public static void main(String[] args) {

		BrowserLaunch b = new BrowserLaunch();
		b.intializtion();

	}

	public void intializtion() {

		WebDriverManager.chromedriver().setup();

		WebDriver Driver = new ChromeDriver();

		Driver.get("https://www.newlook.com/uk/login");

		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); /// wait for synchronisation implicitly wait one time define wait
		

		WebElement account = Driver.findElement(By.xpath("//span[@data-ng-show='!isLoggedIn']"));
	
		account.click();
		
		//////WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(15));   apply for condition
	////	wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	////      LoginButton.click;
		
		
		
		
		
		WebElement creatanacount1 = Driver.findElement(By.xpath("//button[@data-ng-click='registerTabs = true']"));
		creatanacount1.click();
		


}
}
