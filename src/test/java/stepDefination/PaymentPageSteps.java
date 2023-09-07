package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pageObjects.PaymentPage;

public class PaymentPageSteps {
	
	
	PaymentPage Payment = new PaymentPage() ;

	@Then("click on cart button")
	public void click_on_cart_button() {
		Payment.clickoncartbutton();

	}

	@Then("user click on Checkout button")
	public void user_click_on_checkout_button() {
		Payment.clickonckeckoutbutton();

	}

	@Then("user enter {string} {string} {string}")
	public void user_enter(String firstname, String lastname, String zipcode) {
		Payment.checkoutyourinfomation(firstname, lastname, zipcode);

	}

	@Then("user click on Continue button")
	public void user_click_on_continue_button() {
		Payment.clickonContinue();

	}

	@Then("user click on Finish button")
	public void user_click_on_finish_button() {
		Payment.clickonFinishbutton();

	}

	@Then("validate order success message")
	public void validate_order_success_message() {
		Assert.assertTrue(Payment.validateordersucessmessage());
	}
	

}
