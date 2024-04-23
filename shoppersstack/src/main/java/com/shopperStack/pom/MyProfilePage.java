package com.shopperStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	
	public MyProfilePage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myAdds;

	public WebElement getMyAdd() {
		return myAdds;
	}
}
