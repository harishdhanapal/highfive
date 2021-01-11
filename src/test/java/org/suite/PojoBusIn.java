package org.suite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoBusIn extends DSuite  {

	public PojoBusIn() {
	
		
		PageFactory.initElements(d, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath="//a[contains(text(),'Nokia lumia 1520')]")
	private WebElement selectProduct;
	
	@FindBy (xpath="//h2[@class='name']")
	private WebElement productName;
	
	@FindBy (xpath="//h3[text()='$820']")
	private WebElement productPrice;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-lg']")
	private WebElement addToCart;
	
	@FindBy(xpath="(//a[@class='nav-link'])[4]")
	private WebElement cart;
	

	public WebElement getCart() {
		return cart;
	}

	public WebElement getSelectProduct() {
		return selectProduct;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProductPrice() {
		return productPrice;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	
}
