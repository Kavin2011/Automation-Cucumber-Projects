package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {
	
	public WebDriver driver; //null

	@FindBy(xpath="//a[@title='Women']")
	
	private WebElement women;
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[1]")
	
	private WebElement eveningdress;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	
	private WebElement dresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")
	
	private WebElement casual;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	
	private WebElement movetshirt;

	public Select_Page(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);	
}
	
	
	public WebElement getWomen() {
		return women;
	}
	
	public WebElement getEveDress() {
		return eveningdress;
	}
	
	public WebElement getMoveDresses() {
		return dresses;
	}
	
	public WebElement getCasual() {
		return casual;
	}
	
	public WebElement getMovetshirts() {
		return movetshirt;
	}
	
}