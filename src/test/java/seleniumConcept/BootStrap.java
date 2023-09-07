package seleniumConcept;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver Driver = new ChromeDriver();

		Driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		
		Driver.manage().window().maximize();
		
		WebElement dropDownBtn= Driver.findElement(By.cssSelector("button#menu1"));
		
		dropDownBtn.click();
		
		List<WebElement>dropDownElement= Driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		 int sizeOfList= dropDownElement.size();
		 System.out.println(sizeOfList);

		
		for(WebElement e:dropDownElement) {
			
			 String value= e.getText();
			 System.out.println(value);
			 
			 if(value.equals("JavaScript")) {
				 e.click();
				 break;
				 
				 
		}
			 
			 
			 
			 
			
		}
		
		
		

	}
}