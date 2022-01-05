package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Page1 {
	
	public WebDriver driver; //null

	@FindBy(xpath="//*[@title='Proceed to checkout']")
	
	private WebElement proceed;
	
	@FindBy(xpath="//*[@id=\\\"layer_cart\\\"]/div[1]/div[2]/div[4]/a/span")
	
	private WebElement btn;													// for tshirts page
	
	public Proceed_Page1(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	

}

	public WebElement getProceed() {
		return proceed;
	}
	
	public WebElement getProceedbtn() {										// for tshirts page
		return btn;
	}
}