package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Page2 {

	public WebDriver driver; //null

	@FindBy(xpath="//span[text()='Proceed to checkout']")
	
	private WebElement move4;
	
	public Proceed_Page2(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	

}

	public WebElement getProceedmove() {
		return move4;
	}
	
}

