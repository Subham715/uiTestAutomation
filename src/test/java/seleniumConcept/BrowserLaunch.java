package seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {

		BrowserLaunch b = new BrowserLaunch();
		b.intializtion();

	}

	public void intializtion() {

		WebDriverManager.chromedriver().setup();

		WebDriver Driver = new ChromeDriver();

		Driver.get("https://www.newlook.com/uk/login");

		Driver.manage().window().maximize();

		WebElement account = Driver.findElement(By.xpath("//span[@data-ng-show='!isLoggedIn']"));
		account.click();

		WebElement creatanacount = Driver.findElement(By.xpath("//button[@data-ng-click='registerTabs = true']"));
		creatanacount.click();

		WebElement email = Driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("ersubham715@gmail.com");

		WebElement password = Driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("kumar718");

		WebElement Title= Driver.findElement(By.xpath("//select[@class='select select--sm ng-empty ng-invalid ng-invalid-required ng-dirty ng-valid-parse ng-touched']"));
		Select s=new Select(Title);
		s.selectByVisibleText("Mr.");
		
		
		WebElement firstname = Driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("subham");

		WebElement lastname = Driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("kumar");

		WebElement checkbox = Driver.findElement(By.xpath("//label[@class='label checkbox__label']"));
		checkbox.click();

		WebElement creatmyaccount = Driver.findElement(By.xpath("//button[@data-ng-click='onSubmit($event)']"));
		creatmyaccount.click();
		

	}

}
