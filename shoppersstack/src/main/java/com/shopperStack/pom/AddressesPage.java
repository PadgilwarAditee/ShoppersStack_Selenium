package com.shopperStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage {
	
	public AddressesPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddress;
	
	@FindBy(xpath="//button[contains(@type,'button')][2]")
	private WebElement deleteAddress;

	public WebElement getAddAddress() {
		return addAddress;
	}
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton')])[2]")
	private WebElement deleteAddBtn;
	
	@FindBy(xpath = "(//button[text()='Yes'])[1]")
	private WebElement yesBtn;

	public WebElement getDeleteAddress() {
		return deleteAddress;
	}

	public WebElement getDeleteAddBtn() {
		return deleteAddBtn;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}
	
	
}
