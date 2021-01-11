package org.suite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ASuite {

	public static WebDriver d;
	
	@BeforeClass
	private void launch() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "A:\\eclipse saved files\\SuiteTest\\driver\\chromedriver.exe");
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		 d=new ChromeDriver(c);
		
	}
	
	
@Test(dataProvider ="first")
private void tc1(String user,String pass) throws InterruptedException {
	// TODO Auto-generated method stub

	
	
	d.get("https://www.facebook.com/");
	String t1 = d.getTitle();
	System.out.println(t1);
	WebElement f = d.findElement(By.id("email"));
	f.sendKeys(user);
	WebElement f1 = d.findElement(By.id("pass"));
	f1.sendKeys(pass);
	d.findElement(By.id("u_0_b")).click();
	Thread.sleep(4000);
	
	String t = d.getTitle();
	System.out.println(t);
	
	
	WebElement f5 = d.findElement(By.xpath("(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ojkyduve'])[2]"));
	String text = f5.getText();
	
	
	
	
	if (text.contains("Contacts")) {
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 d.findElement(By.xpath("//div[@aria-label='Account']")).click();
		
		d.findElement(By.xpath("//i[@class='hu5pjgll lzf7d6o1 sp_jHXvoJjI_al_1_5x sx_fb759f']")).click();
		
		
		Thread.sleep(3000);
		WebElement f4 = d.findElement(By.xpath("(//a[@role='button'])[1]"));
		f4.click();
	}
	
	

	
}
	
	@DataProvider(name="first")
	public Object[][] fb() {
		return new Object[][]
				{
			
			{"living","god"},
			{"harrie95@gmail.com","kenleechann"},
			{"java","pogo"},
			{"amul","aavin"},
			{"harrie95@gmail.com","kenleechann"},
			{"jesus","jesus"},
				};
		

		
		
	}
	
	
	
	
}
