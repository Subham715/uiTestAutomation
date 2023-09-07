package seleniumConcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		

		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		WebElement Btn1= driver.findElement(By.cssSelector("button#newWindowBtn"));
		Btn1.click();
		
		
		
		Set<String>allWindow = driver.getWindowHandles();
		
		for(String s:allWindow) {
			
			
			if(!parentId.equals(s)) {
				
				
				driver.switchTo().window(s);
				
				WebElement firstName= driver.findElement(By.cssSelector("input#firstName"));
				firstName.sendKeys("Test");
				
			}
			
			
			
		}


	}

}