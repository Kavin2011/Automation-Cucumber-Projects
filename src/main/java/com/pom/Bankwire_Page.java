package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bankwire_Page {
	
	public WebDriver driver; //null
	
	@FindBy(xpath="//a[@class='bankwire']")
	
	private WebElement move7;
	
	public Bankwire_Page(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	

}


	public WebElement getBankwire() {
		return move7;
	}
	
}
