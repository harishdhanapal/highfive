package org.suite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoBusIn2 extends DSuite {

	public PojoBusIn2() {
	
		PageFactory.initElements(d,this);
		
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath="//button[@class='btn btn-success']")
	private WebElement placeOrder;
	
	@FindBy(id="name")
	private WebElement  name;
	
	@FindBy(id="country")
	private WebElement country;
	
	@FindBy (id="city")
	private WebElement city;
	
	@FindBy (id="card")
	private WebElement card;
	
	@FindBy (id="month")
    private WebElement month;
	
	@FindBy (id="year")
	private WebElement year;
	
	@FindBy (xpath="(//button[@class='btn btn-primary'])[3]")
	private WebElement purchase;
	
	@FindBy (id="inputName")
	private WebElement name1;

	public WebElement getName1() {
		return name1;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getPurchase() {
		return purchase;
	}
	
}
