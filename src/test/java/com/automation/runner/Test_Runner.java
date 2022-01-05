package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucum.Automation_Cucumber.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\automation\\feature\\Automation.feature",

	glue="com\\automation\\stepdefinition",
	
	monochrome = true, dryRun=false, strict=true,
	
//	tags=("@FN02,@FN03"),
	
	plugin= {"html:Report\\Html_report",
			"pretty",
			"com.cucumber.listener.ExtentCucumberFormatter:Folder/Reports.html"
			} 

		)

public class Test_Runner {
	
	public static WebDriver driver; //null
	
	@BeforeClass
	public static void set_Up() {
		
		driver=Base_Class.getBrowser("Chrome");
		
	}
	
	@AfterClass
	public static void tear_Down() {

		driver.close();
	}

}

