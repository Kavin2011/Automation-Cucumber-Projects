package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class More_Page {
	
	public WebDriver driver; //null

	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li")
	
	private WebElement move;
	
	@FindBy(xpath="//span[text()='More']")
	
	private WebElement more;


	public More_Page(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	
}
	public WebElement getMove() {
		return move;
	}
	
	public WebElement getMore() {
		return more;
	}
	
}

