package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Textarea_Page {
	
	public WebDriver driver; //null

	@FindBy(xpath="//textarea[@class='form-control']")
	
	private WebElement move5;
	
	@FindBy(name="processAddress")
	
	private WebElement move6;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	
	private WebElement move11;								// For dresses and tshirts
	
	public Textarea_Page(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	

}

	public WebElement getTextarea() {
		return move5;
	}
	
	public WebElement getProceedpage() {
		return move6;
	}
	
	public WebElement getProceed2page() {					// For dresses and tshirts
		return move11;
	}
	
}

