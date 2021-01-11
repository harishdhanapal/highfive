package org.suite;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ESuite extends DSuite {

	JavascriptExecutor js=(JavascriptExecutor)d;
	public PojoBusIn2 e;
	public pojo5 r;
	
	@BeforeClass
	private void tc1() {
		// TODO Auto-generated method stub

		launch();
		
		
	}
	
    @Test
    private void tc2() throws InterruptedException {
		// TODO Auto-generated method stub
    	r=new pojo5();
    	
url();
d.findElement(By.xpath("//input[@type='submit']")).click();

WebElement f = d.findElement(By.xpath("//table[@class='table']"));



for (int i = 0; i <r.getFd().size(); i++) {
	WebElement ff = r.getFd().get(i);

	List<WebElement> rr = ff.findElements(By.tagName("td"));
	for (int j = 5; j <rr.size(); j++) {
		
	
	WebElement w = rr.get(j);
	String text = w.getText();
	
	String r = text.replace("$","");
	String t = r.replace(".","");
	
	int b=Integer.valueOf(t);
	
	System.out.println(b);
	
	
	if (b<21000) {
		List<WebElement> f1 = d.findElements(By.xpath("//input[@type='submit']"));
		
		WebElement w1 = f1.get(i);
		
		System.out.println("click this flight:"+b);
		
		Thread.sleep(5000);
		
		w1.click();
		
		
		System.out.println(i);
	}
	}
	
}


	}
    @Test
    private void tc3() throws IOException {
		// TODO Auto-generated method stub
e=new PojoBusIn2();

sendKeys(e.getName1(),inputValue(6, 0));
    	
sendKeys(r.getAddress(),"bingo boy address" );
    	
sendKeys(r.getCity(), "salem");
sendKeys(r.getState(),"broWn");

sendKeys(r.getZipcode(), "636 009");

Select s=new Select(r.getCardType());
s.selectByIndex(1);
sendKeys(r.getCreditC(), "656574747474747883938");
sendKeys(r.getYear(), "2020");

sendKeys(r.getName(), "william broWn");

r.getRemember().click();
r.getPurchase().click();



	}
	
	
}
