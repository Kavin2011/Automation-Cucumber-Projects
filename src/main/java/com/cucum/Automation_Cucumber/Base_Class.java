package com.cucum.Automation_Cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static String value;
	
	public static WebDriver getBrowser(String type) {
		
		if (type.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

			driver=new ChromeDriver();			
		}
		
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");

			driver=new ChromeDriver();
			
			}
		driver.manage().window().maximize();
		
		return driver;
				
	}
	
	public static void clickOnElement(WebElement element) {
		
		element.click();
	}
	
	public static String particulardata (String path,int row,int column) throws Throwable {
		
		File f = new File(path);
		
		FileInputStream  fis= new FileInputStream(f);
		
	    Workbook wb= new XSSFWorkbook(fis);	//up casting
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row1 = sheetAt.getRow(row);
		
		Cell cell = row1.getCell(column);
		
		CellType celltype= cell.getCellType();
		
		if (celltype.equals(CellType.STRING)) {
			
			value= cell.getStringCellValue();
		}
		
		else if (celltype.equals(CellType.NUMERIC)) {
			
			double cellvalue =cell.getNumericCellValue();
			
			long val=(long) cellvalue;

			value = String.valueOf(val);
			
			wb.close();
		}
		
		return value;
		
	}
	
	
	public static void inputValueElement(WebElement element,String value) {
		
		element.sendKeys(value);
		
	}
	
	public static void urlbase(String url) {
		
		driver.get(url);
		
	}
	
	public static void sleep(long mills) throws InterruptedException {
		
		Thread.sleep(mills);
	}
	
	public static void clear(WebElement element) {
		
		element.clear();
	}
	
	public static void close() {
		
		driver.close();
	}
	
	public static void quit() {
		
		driver.quit();
	}
	
	
	public static void Wait1() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public static void selectValue(String type, WebElement element, String value)
	{
		
		Select s=new Select(element);
		
		if (type.equalsIgnoreCase("index")) {
			
		int index = Integer.parseInt(value);
			
			s.selectByIndex(index);
			
		}
		
		else if (type.equalsIgnoreCase("value")) {
			
			s.selectByValue(value);
			
		}
		
		else if (type.equalsIgnoreCase("text")) {
			
			s.selectByVisibleText(value);
		}
			
		}
	
	public static void actionsClass(String actionType,WebElement element) 
	{
		Actions mouse = new Actions(driver);
		
		if (actionType.equalsIgnoreCase("moveTo")) 
		{
		 mouse.moveToElement(element).build().perform(); 
		 }
		
		else if (actionType.equalsIgnoreCase("clickon")) 
		{
		mouse.click(element).build().perform(); 
		}
		
		else if (actionType.equalsIgnoreCase("doubleclick")) 
		{
		mouse.doubleClick(element).build().perform();
		}
		
		else if (actionType.equalsIgnoreCase("contextclick"))
		{
		mouse.contextClick(element).build().perform();
		}
		
		}
		public static void scrollUp_Down(WebElement element) {
			
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",element);

		}
	public static void TakeScreenshot() throws IOException {
		
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File c = t.getScreenshotAs(OutputType.FILE);
			
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\My_Projects_Dec\\Screenshot\\automation_project.png");
			
		FileUtils.copyFile(c, d);
	}
	
	
}
