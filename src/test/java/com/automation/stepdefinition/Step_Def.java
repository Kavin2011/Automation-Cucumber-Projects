package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.automation.runner.Test_Runner;
import com.cucum.Automation_Cucumber.Base_Class;
import com.helper_reader.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends Base_Class{

	
	public static WebDriver driver= Test_Runner.driver;
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
		
		String name = s.getName();
		
		System.out.println("Scenario Name: "+name);
		
		System.out.println("Scenario Started");	
	}
	
	@After
	public void afterHooks(Scenario s) throws Throwable {
	
		if (s.isFailed()) {
			
			TakeScreenshot();
		}

		String status = s.getStatus();
		
		System.out.println("Status: "+status);
	}

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String url=File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		
		urlbase(url);
}
	@When("^user Enter The Email In Email Address Field$")
	public void user_Enter_The_Email_In_Email_Address_Field() throws Throwable {

		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getEmail();
		
		inputValueElement(pom.getInstanceHp().getEmail(), email);
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {

		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		
		inputValueElement(pom.getInstanceHp().getPassword(), password);
	}

	@Then("^user Click On The Sign_In Button And It Navigates To The My Account Page$")
	public void user_Click_On_The_Sign_In_Button_And_It_Navigates_To_The_My_Account_Page() throws Throwable {
		
		clickOnElement(pom.getInstanceHp().getSignin());

		Wait1();

	}

	@When("^user Move To The Women Category$")
	public void user_Move_To_The_Women_Category() throws Throwable {

		actionsClass("moveTo", pom.getInstancesel().getWomen());
	}

	@When("^user Click On The Evening Dresses$")
	public void user_Click_On_The_Evening_Dresses() throws Throwable {

		clickOnElement(pom.getInstancesel().getEveDress());

		Wait1();
	}

	@When("^user Move To The Quick View$")
	public void user_Move_To_The_Quick_View() throws Throwable {

		actionsClass("moveTo", pom.getInstancemp().getMove());
	}

	@When("^user Click On The More Option$")
	public void user_Click_On_The_More_Option() throws Throwable {

		clickOnElement(pom.getInstancemp().getMore());

		Wait1();
	}

	@When("^user Select The Quantity Of Dress$")
	public void user_Select_The_Quantity_Of_Dress() throws Throwable {
		
		for (int i = 0; i < 4; i++) {

			clickOnElement(pom.getInstanceap().getLoop());
		}

		Wait1();

	}

	@When("^user Select The Size Of The Dress$")
	public void user_Select_The_Size_Of_The_Dress() throws Throwable {

		String size = File_Reader_Manager.getInstanceFRM().getInstanceCR().getSize();

		selectValue("value", pom.getInstanceap().getSize(), size);
	}

	@When("^user Select Color Of The Dress$")
	public void user_Select_Color_Of_The_Dress() throws Throwable {

		clickOnElement(pom.getInstanceap().getColour());	
	}

	@When("^user Click On The Add To Cart Button$")
	public void user_Click_On_The_Add_To_Cart_Button() throws Throwable {

		clickOnElement(pom.getInstanceap().getCart());

		Wait1();
	}

	@When("^user Click On The Proceed To Checkout$")
	public void user_Click_On_The_Proceed_To_Checkout() throws Throwable {

		clickOnElement(pom.getInstancepp1().getProceed());

		sleep(3000);
	}

	@When("^user Verify The Details Click On The Proceed To Checkout Again$")
	public void user_Verify_The_Details_Click_On_The_Proceed_To_Checkout_Again() throws Throwable {

		actionsClass("moveTo", pom.getInstancepp2().getProceedmove());
		
		clickOnElement(pom.getInstancepp2().getProceedmove());

		Wait1();
	}

	@When("^user Enter The Comments In Text Area$")
	public void user_Enter_The_Comments_In_Text_Area() throws Throwable {

		actionsClass("moveTo", pom.getInstancetxp().getTextarea());
		
		String landmark = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLandmark();

		inputValueElement(pom.getInstancetxp().getTextarea(),landmark);

		Wait1();
	}
	
	@When("^user Click On The Proceed To Checkout For Submit$")
	public void user_Click_On_The_Proceed_To_Checkout_For_Submit() throws Throwable {

		actionsClass("moveTo", pom.getInstancetxp().getProceedpage());

		clickOnElement(pom.getInstancetxp().getProceedpage());

		Wait1();
	}

	@When("^user Click On The Terms Box$")
	public void user_Click_On_The_Terms_Box() throws Throwable {

		clickOnElement(pom.getInstancetp().getBox());
	}

	@When("^user Click On The Proceed To Checkout For Payment$")
	public void user_Click_On_The_Proceed_To_Checkout_For_Payment() throws Throwable {

		clickOnElement(pom.getInstancetp().getButton());

		Wait1();
	}
	
	@When("^user Select The Pay By Bank Wire$")
	public void user_Select_The_Pay_By_Bank_Wire() throws Throwable {

		actionsClass("moveTo", pom.getInstancebp().getBankwire());
		clickOnElement(pom.getInstancebp().getBankwire());

		Wait1();
	}

	@When("^user Click On Confirm My Order Button$")
	public void user_Click_On_Confirm_My_Order_Button() throws Throwable {
		
		actionsClass("moveTo", pom.getInstancecp().getConfirm());

		clickOnElement(pom.getInstancecp().getConfirm());

		Wait1();

	}

	@Then("^user Click On The Sign_Out Button And It Navigates To The My Sign_In Page$")
	public void user_Click_On_The_Sign_Out_Button_And_It_Navigates_To_The_My_Sign_In_Page() throws Throwable {
		
		clickOnElement(pom.getInstancesp().getSignout());

		Wait1();

	}
	@When("^user Move To The Dresses Category$")
	public void user_Move_To_The_Dresses_Category() throws Throwable {

		actionsClass("moveTo", pom.getInstancesel().getMoveDresses());
		
		clickOnElement(pom.getInstancesel().getMoveDresses());
		
		Wait1();
	}

	@When("^user Now Move To The Quick View$")
	public void user_Now_Move_To_The_Quick_View() throws Throwable {
		
		actionsClass("moveTo", pom.getInstancemp().getMove());
		
		sleep(3000);
	}

	@When("^user Now Click On The More Option$")
	public void user_Now_Click_On_The_More_Option() throws Throwable {
		
		clickOnElement(pom.getInstancemp().getMore());
		
		Wait1();

	}

	@When("^user Now Select The Quantity Of Dress$")
	public void user_Now_Select_The_Quantity_Of_Dress() throws Throwable {

		for (int i = 0; i < 2; i++) {
			
			clickOnElement(pom.getInstanceap().getLoop());		
		}
	}

	@When("^user Now Click On The Add To Cart Button$")
	public void user_Now_Click_On_The_Add_To_Cart_Button() throws Throwable {

		clickOnElement(pom.getInstanceap().getCart());
		
		Wait1();
	}

	@When("^user Now Click On The Proceed To Checkout$")
	public void user_Now_Click_On_The_Proceed_To_Checkout() throws Throwable {

		clickOnElement(pom.getInstancepp1().getProceed());
		
		Wait1();
	}

	@When("^user Now Verify The Details Click On The Proceed To Checkout Again$")
	public void user_Now_Verify_The_Details_Click_On_The_Proceed_To_Checkout_Again() throws Throwable {

		actionsClass("moveTo", pom.getInstancepp2().getProceedmove());
		
		clickOnElement(pom.getInstancepp2().getProceedmove());
		
		Wait1();
	}

	@When("^user Now Enter The Comments In Text Area$")
	public void user_Now_Enter_The_Comments_In_Text_Area() throws Throwable {

		actionsClass("moveTo", pom.getInstancetxp().getTextarea());
		
		String landmark = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLandmark();
		
		inputValueElement( pom.getInstancetxp().getTextarea(),landmark);
		
		Wait1();
	}

	@When("^user Now Click On The Proceed To Checkout For Submit$")
	public void user_Now_Click_On_The_Proceed_To_Checkout_For_Submit() throws Throwable {

		actionsClass("moveTo", pom.getInstancetxp().getProceed2page());
		
		clickOnElement(pom.getInstancetxp().getProceed2page());
	}

	@When("^user Now Click On The Terms Box$")
	public void user_Now_Click_On_The_Terms_Box() throws Throwable {

		clickOnElement(pom.getInstancetp().getBox());
	}

	@When("^user Now Click On The Proceed To Checkout For Payment$")
	public void user_Now_Click_On_The_Proceed_To_Checkout_For_Payment() throws Throwable {

		clickOnElement(pom.getInstancetp().getButton());
		
		Wait1();
	}

	@When("^user Now Select The Pay By Bank Wire$")
	public void user_Now_Select_The_Pay_By_Bank_Wire() throws Throwable {

		actionsClass("moveTo", pom.getInstancebp().getBankwire());
		
		clickOnElement( pom.getInstancebp().getBankwire());
		
		Wait1();
	}

	@When("^user Now Click On Confirm My Order Button$")
	public void user_Now_Click_On_Confirm_My_Order_Button() throws Throwable {

		actionsClass("moveTo", pom.getInstancecp().getConfirm());
		
		clickOnElement(pom.getInstancecp().getConfirm());
		
		Wait1();
	}

	@Then("^user Now Click On The Sign_Out Button And It Navigates To The My Sign_In Page$")
	public void user_Now_Click_On_The_Sign_Out_Button_And_It_Navigates_To_The_My_Sign_In_Page() throws Throwable {

		clickOnElement(pom.getInstancesp().getSignout());

		Wait1();
	}

	@When("^user Move To The TShirts Category$")
	public void user_Move_To_The_TShirts_Category() throws Throwable {

		actionsClass("moveTo", pom.getInstancesel().getMovetshirts());
		
		clickOnElement(pom.getInstancesel().getMovetshirts());
		
		Wait1();
	}

	@When("^user To Click On The More Option$")
	public void user_To_Click_On_The_More_Option() throws Throwable {

		actionsClass("moveTo", pom.getInstancemp().getMove());
		
		clickOnElement(pom.getInstancemp().getMore());
		
		Wait1();
	}

	@When("^user To Select The Quantity Of Dress$")
	public void user_To_Select_The_Quantity_Of_Dress() throws Throwable {

		for (int i = 0; i < 3; i++) {
			
			clickOnElement(pom.getInstanceap().getLoop());
		}
	}

	@When("^user To Click On The Add To Cart Button$")
	public void user_To_Click_On_The_Add_To_Cart_Button() throws Throwable {

		clickOnElement(pom.getInstanceap().getCart());
		
		Wait1();
	}

	@When("^user To Click On The Proceed To Checkout$")
	public void user_To_Click_On_The_Proceed_To_Checkout() throws Throwable {

		clickOnElement(pom.getInstancepp1().getProceed());
		
		Wait1();
	}

	@When("^user To Verify The Details Click On The Proceed To Checkout Again$")
	public void user_To_Verify_The_Details_Click_On_The_Proceed_To_Checkout_Again() throws Throwable {

		actionsClass("moveTo", pom.getInstancepp2().getProceedmove());
		
		clickOnElement(pom.getInstancepp2().getProceedmove());
	}

	@When("^user To Enter The Comments In Text Area$")
	public void user_To_Enter_The_Comments_In_Text_Area() throws Throwable {

		actionsClass("moveTo", pom.getInstancetxp().getTextarea());
		
		String landmark = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLandmark();
		
		inputValueElement(pom.getInstancetxp().getTextarea(),landmark);
		
		Wait1();
	}

	@When("^user To Click On The Proceed To Checkout For Submit$")
	public void user_To_Click_On_The_Proceed_To_Checkout_For_Submit() throws Throwable {

		actionsClass("moveTo", pom.getInstancetxp().getProceed2page());
		
		clickOnElement(pom.getInstancetxp().getProceed2page());
	}

	@When("^user To Click On The Terms Box$")
	public void user_To_Click_On_The_Terms_Box() throws Throwable {

		clickOnElement(pom.getInstancetp().getBox());
	}

	@When("^user To Click On The Proceed To Checkout For Payment$")
	public void user_To_Click_On_The_Proceed_To_Checkout_For_Payment() throws Throwable {

		clickOnElement(pom.getInstancetp().getButton());
		
		Wait1();
	}

	@When("^user To Select The Pay By Bank Wire$")
	public void user_To_Select_The_Pay_By_Bank_Wire() throws Throwable {

		actionsClass("moveTo", pom.getInstancebp().getBankwire());
		
		clickOnElement(pom.getInstancebp().getBankwire());
		
		Wait1();
	}

	@When("^user To Click On Confirm My Order Button$")
	public void user_To_Click_On_Confirm_My_Order_Button() throws Throwable {

		actionsClass("moveTo", pom.getInstancecp().getConfirm());
		
		clickOnElement(pom.getInstancecp().getConfirm());
		
		Wait1();
	}

	@Then("^user To Click On The Sign_Out Button And It Navigates To The My Sign_In Page$")
	public void user_To_Click_On_The_Sign_Out_Button_And_It_Navigates_To_The_My_Sign_In_Page() throws Throwable {

		clickOnElement(pom.getInstancesp().getSignout());

		Wait1();
	}

}