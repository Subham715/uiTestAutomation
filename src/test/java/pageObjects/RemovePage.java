package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class RemovePage extends Base  {
	
	public void userclickonremovebutton() {
		
  WebElement	removebutton =	driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
  
  try {
		removebutton.click();
	} catch (Exception e) {

	}

  
		
		
		
		
		
   
	

	
	
}
}