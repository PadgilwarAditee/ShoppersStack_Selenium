package com.shopperStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'MuiAvatar')]")
	private WebElement acSettings;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfile;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logOut;

	public WebElement getAcSettings() {
		return acSettings;
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	}
