package org.suite;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo5 extends DSuite{

	public pojo5() {
	
		
		PageFactory.initElements(d,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (tagName="tr")
	private List<WebElement> fd;
	
	@FindBy (id="address")
	private WebElement address;
	
	@FindBy (id="city")
	private WebElement city;
	
	@FindBy (id="state")
	private WebElement state;
	
	@FindBy (id="zipCode")
	private WebElement zipcode;
	
	@FindBy (id="cardType")
	private WebElement cardType;
	
	@FindBy (id="creditCardNumber")
	private WebElement creditC;
	
	@FindBy (id="creditCardYear")
	private WebElement year;
	
	@FindBy (id="nameOnCard")
	private WebElement name;
	
@FindBy(id="rememberMe")
private WebElement remember;

@FindBy (xpath="//input[@type=\"submit\"]")
private WebElement purchase;

	public WebElement getAddress() {
	return address;
}

public WebElement getCity() {
	return city;
}

public WebElement getState() {
	return state;
}

public WebElement getZipcode() {
	return zipcode;
}

public WebElement getCardType() {
	return cardType;
}

public WebElement getCreditC() {
	return creditC;
}

public WebElement getYear() {
	return year;
}

public WebElement getName() {
	return name;
}

public WebElement getRemember() {
	return remember;
}

public WebElement getPurchase() {
	return purchase;
}

	public List<WebElement> getFd() {
		return fd;
	}
	
	
}
