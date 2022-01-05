package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Terms_Page {
	
	public WebDriver driver; //null

	@FindBy(id="cgv")
	
	private WebElement box;
	
	@FindBy(xpath="//*[@id='form']/p/button/span")
	
	private WebElement button;
	
	public Terms_Page(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	

}

	public WebElement getBox() {
		return box;
	}
	
	public WebElement getButton() {
		return button;
	}
	
}
