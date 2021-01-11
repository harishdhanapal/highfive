package org.suite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DSuite {
public static WebDriver d;

	public static void launch() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","A:\\eclipse saved files\\SuiteTest\\driver\\chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		
		o.addArguments("--disable-notifications");
		
		d=new ChromeDriver(o);
	
		}
	
	public static void launchEdge() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","A:\\eclipse saved files\\SuiteTest\\driver\\msedgedriver.exe");
		d=new EdgeDriver();	
		
	}
	
	public static void url() {
		// TODO Auto-generated method stub

		d.get("https://blazedemo.com/");
		
		
	}
	
	public static void sendKeys(WebElement e,String s) {
		// TODO Auto-generated method stub

		e.sendKeys(s);
	}
	public static void timeDelay() {
		// TODO Auto-generated method stub
d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	
	public String inputValue(int a,int b) throws IOException {
		
		File f=new File("A:\\eclipse saved files\\SuiteTest\\excell\\create 1.xlsx");
		
		FileInputStream o=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(o);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(a);
Cell c = r.getCell(b);
String value;
int cellType = c.getCellType();
if (cellType==1) {
	
	
	

value= c.getStringCellValue();
		
}else {
	double d=c.getNumericCellValue();
	long l=(long)d;
	
	value=String.valueOf(l);
	
}
return value;
	
	
	}
	
	
	}
	

