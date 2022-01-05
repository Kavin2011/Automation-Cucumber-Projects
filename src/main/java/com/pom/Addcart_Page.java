package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcart_Page {
	public WebDriver driver; //null

	@FindBy(xpath="//i[@class='icon-plus']")
	
	private WebElement plus;
	
	@FindBy(id="group_1")
	
	private WebElement size;

	@FindBy(id="color_24")
	
	private WebElement colour;
	
	@FindBy(id="add_to_cart")
	
	private WebElement cart;
	
	public Addcart_Page(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	
}
	public WebElement getLoop() {
		return plus;
	}
	
	public WebElement getSize() {
		return size;
	}
	
	public WebElement getColour() {
		return colour;
	}
	
	public WebElement getCart() {
		return cart;
	}
	
}