package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout_Page {
	
public WebDriver driver; //null
	
	@FindBy(xpath="//a[@class='logout']")
	
	private WebElement signout;
	
	public Signout_Page(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	

}


	public WebElement getSignout() {
		return signout;
		
	}
	

}
