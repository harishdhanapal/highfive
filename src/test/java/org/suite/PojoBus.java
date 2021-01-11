package org.suite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoBus extends DSuite {

	public PojoBus() {
	
		PageFactory.initElements(d, this);
		
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="signin2")
	private WebElement signin;
	
	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignup() {
		return signup;
	}

	@FindBy(id="sign-username")
	private WebElement username;
	
	@FindBy(id="sign-password")
	private WebElement pass;
	
	@FindBy(xpath="(//button[@type='button'])[6]")
	private WebElement signup;
	
	@FindBy (id="login2")
	private WebElement login;
	
	@FindBy (id="loginusername")
	private WebElement loginUser;
	
	@FindBy (id="loginpassword")
	private WebElement  loginPass;
	
	@FindBy(xpath="(//button[@type='button'])[9]")
	private WebElement loginbtn;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLoginUser() {
		return loginUser;
	}

	public WebElement getLoginPass() {
		return loginPass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
}
