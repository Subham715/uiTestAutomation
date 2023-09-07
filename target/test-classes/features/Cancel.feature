Feature: Cancel Functinality

@Reg2
Scenario: Click on Cancel button

When user enter "standard_user" and "secret_sauce"
And click on Login Button
And user add a product in cart
Then validate cart count is "1"
And click on cart button
And user click on Checkout button
And user click on Cancel button
Then user validate cart page