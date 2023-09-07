Feature: Remove Functinality

@Reg3
Scenario: Add  product remove from cart

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And user click on remove button
Then user validate cart empty