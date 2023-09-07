package stepDefination;

import io.cucumber.java.en.Then;
import pageObjects.CancelPage;

public class CancelPageSteps {
	
	
	CancelPage Cancel = new CancelPage();
	
	
	@Then("user click on Cancel button")
	public void user_click_on_cancel_button() {
		Cancel.clickOnCancelbutton();
		
		
	    
	}
	@Then("user validate cart page")
	public void validate_cart_page() {
		Cancel.UserValidateCartpage();
		
	    
	}


}
