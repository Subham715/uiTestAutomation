package seleniumConcept;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		driver.manage().window().maximize();
		
		WebElement dropdown= driver.findElement(By.cssSelector("select#course"));
		
		Select s=new Select(dropdown);   /// predefined
		
		s.selectByVisibleText("Javascript");  // method by text
		
		s.selectByIndex(3);   /// by index integer form
		
		s.selectByValue("js"); /// select by value
		
		
		
		
		
		
		
		
	}
}
