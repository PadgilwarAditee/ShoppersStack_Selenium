package com.shopperStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "loginBtn")
	private WebElement loginButton;
	
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
