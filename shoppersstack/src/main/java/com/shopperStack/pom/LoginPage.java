package com.shopperStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="Email")
	private WebElement emailId;
	
	@FindBy (id="Password")
	private WebElement pwd;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
}	
