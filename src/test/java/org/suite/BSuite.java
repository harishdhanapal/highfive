package org.suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BSuite {

	public WebDriver d;
	
@Parameters("browser")	
@BeforeMethod
private void tc1(String launch) {
	// TODO Auto-generated method stub
if (launch.equals("chrome")) {
	
	System.setProperty("webdriver.chrome.driver", "A:\\eclipse saved files\\SuiteTest\\driver\\chromedriver.exe");
	d=new ChromeDriver();
	
	
}else if (launch.equals("edge")) {
	
	System.setProperty("webdriver.edge.driver", "A:\\eclipse saved files\\SuiteTest\\driver\\msedgedriver.exe");
	d=new EdgeDriver();
	
	
}else {
	
	System.setProperty("webdriver.gecko.driver","A:\\eclipse saved files\\SuiteTest\\driver\\geckodriver.exe");
	d=new FirefoxDriver();
	
}
	




}
	
@Test(dataProvider="first1")
private void tc2(String s,String h) {
	// TODO Auto-generated method stub
	d.get("https://www.facebook.com/");
	WebElement f = d.findElement(By.id("email"));
	f.sendKeys(s);
	WebElement f1 = d.findElement(By.id("pass"));
	f1.sendKeys(h);
	WebElement f2 = d.findElement(By.id("u_0_b"));
	f2.click();	

}

@DataProvider(name="first1")
private Object[][] pro() {
	return new Object[][]
	// TODO Auto-generated method stub
	{
		{"java","selenium"},
		{"kite","top"},
		
	};
	
	
}





}
