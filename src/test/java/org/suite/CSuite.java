package org.suite;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CSuite extends DSuite{
public PojoBus k;
	public PojoBusIn l;
	public PojoBusIn2 e;
	@BeforeClass
	private void tc1() {
	launch();
	}
	
	@Test
	private void tc2() throws InterruptedException, IOException {
		k=new PojoBus();
url();
timeDelay();
k.getLogin().click();
sendKeys(k.getLoginUser(), inputValue(16, 0));

sendKeys(k.getLoginPass(), inputValue(16, 1));

k.getLoginbtn().click();
 Thread.sleep(3000);

	}
	
	@Test
	private void tc3() throws InterruptedException {
		// TODO Auto-generated method stub
l=new PojoBusIn();
timeDelay();
l.getSelectProduct().click();
String t = l.getProductName().getText();
		System.out.println(t);
		
		String t1 = l.getProductPrice().getText();
		System.out.println(t1);
		
		l.getAddToCart().click();
		Thread.sleep(3000);
		Alert a = d.switchTo().alert();
		a.accept();
		l.getCart().click();
		Thread.sleep(3000);
	}
	
	@Test
	private void tc4() throws IOException {
		// TODO Auto-generated method stub
e=new PojoBusIn2();
		
e.getPlaceOrder().click();
sendKeys(e.getName(), inputValue(9, 0));

sendKeys(e.getCountry(), inputValue(17, 0));
sendKeys(e.getCity(), inputValue(15, 0));		
		sendKeys(e.getCard(), inputValue(17, 1));
		
		
		sendKeys(e.getMonth(), inputValue(18, 0));
		sendKeys(e.getYear(), inputValue(18, 1));
		
		e.getPurchase().click();
	}
	
	
}


	

	
	
	

