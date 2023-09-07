package stepDefination;

import io.cucumber.java.en.Then;
import pageObjects.RemovePage;

public class RemovePageSteps {
	
	RemovePage Remove = new RemovePage();
	
	
	
	@Then("user click on remove button")
	public void user_click_on_remove_button() {
		Remove.userclickonremovebutton();
		
		
	    
	}

}
