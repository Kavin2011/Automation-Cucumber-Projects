package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmorder_Page {
public WebDriver driver; //null
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	
	private WebElement move8;
	
	public Confirmorder_Page(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	

}


	public WebElement getConfirm() {
		return move8;
	}
	
}
