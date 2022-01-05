Feature: Purchase In Automation Application

Background:Signin

Given user Launch The Application

When user Enter The Email In Email Address Field

And user Enter The Password In Password Field

Then user Click On The Sign_In Button And It Navigates To The My Account Page


@Women
Scenario: Women Purchase

When user Move To The Women Category

And user Click On The Evening Dresses

And user Move To The Quick View

And user Click On The More Option

And user Select The Quantity Of Dress

And user Select The Size Of The Dress

And user Select Color Of The Dress

And user Click On The Add To Cart Button

And user Click On The Proceed To Checkout

And user Verify The Details Click On The Proceed To Checkout Again

And user Enter The Comments In Text Area

And user Click On The Proceed To Checkout For Submit

And user Click On The Terms Box

And user Click On The Proceed To Checkout For Payment

And user Select The Pay By Bank Wire 

And user Click On Confirm My Order Button

Then user Click On The Sign_Out Button And It Navigates To The My Sign_In Page

@Dresses
Scenario: Dresses Purchase

When user Move To The Dresses Category

And user Now Move To The Quick View

And user Now Click On The More Option

And user Now Select The Quantity Of Dress

And user Now Click On The Add To Cart Button

And user Now Click On The Proceed To Checkout

And user Now Verify The Details Click On The Proceed To Checkout Again

And user Now Enter The Comments In Text Area

And user Now Click On The Proceed To Checkout For Submit

And user Now Click On The Terms Box

And user Now Click On The Proceed To Checkout For Payment

And user Now Select The Pay By Bank Wire 

And user Now Click On Confirm My Order Button

Then user Now Click On The Sign_Out Button And It Navigates To The My Sign_In Page

@TShirts
Scenario: TShirts Purchase

When user Move To The TShirts Category

And user Move To The Quick View

And user To Click On The More Option

And user To Select The Quantity Of Dress

And user To Click On The Add To Cart Button

And user To Click On The Proceed To Checkout

And user To Verify The Details Click On The Proceed To Checkout Again

And user To Enter The Comments In Text Area

And user To Click On The Proceed To Checkout For Submit

And user To Click On The Terms Box

And user To Click On The Proceed To Checkout For Payment

And user To Select The Pay By Bank Wire 

And user To Click On Confirm My Order Button

Then user To Click On The Sign_Out Button And It Navigates To The My Sign_In Page



