package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver; //null

	@FindBy(xpath="//input[@id='email']")
	
	private WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	
	private WebElement password;
	
	@FindBy(xpath="//*[@class='icon-lock left']")
	
	private WebElement signin;
	
	public Home_Page(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	

}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}
	

}
