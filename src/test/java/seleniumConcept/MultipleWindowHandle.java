package seleniumConcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {
	
	
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		WebElement Btn1= driver.findElement(By.cssSelector("button#newTabsBtn"));
		Btn1.click();
		
			
		Set<String>allWindow = driver.getWindowHandles();   /// all window open parentId+childId
		
		//For each loop
		
		    for(String s:allWindow) {
				
			if(!parentId.equals(s)) {
					
	        driver.switchTo().window(s);
	        
	        String title= driver.getTitle();
	        
	        if(title.equals("AlertsDemo - H Y R Tutorials")) {
	        	
	        	WebElement clickMeBtn= driver.findElement(By.cssSelector("button#alertBox"));
	        	clickMeBtn.click();
	        	break;
	        	
	        	
	        	
	        
				
				
				
			}
			
			
			
		}


	}

}

}
