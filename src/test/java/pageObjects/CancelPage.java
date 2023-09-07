package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class CancelPage extends Base {

	public void clickOnCancelbutton() {

		WebElement Cancelbutton = driver
				.findElement(By.xpath("//button[@class='btn btn_secondary back btn_medium cart_cancel_link']"));

		try {
			Cancelbutton.click();
		} catch (Exception e) {

		}

	}

	public boolean UserValidateCartpage() {

		return driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();

	}

}
