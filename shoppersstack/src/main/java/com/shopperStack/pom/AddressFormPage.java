package com.shopperStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {
	
	public AddressFormPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Office")
	private WebElement officElement;
	
	public WebElement getOfficElement() {
		return officElement;
	}

	@FindBy(id="Name")
	private WebElement nameText;
	
	@FindBy(id="House/Office Info")
	private WebElement houseText;
	
	@FindBy(id="Street Info")
	private WebElement streetNo;
	
	@FindBy(id="Landmark")
	private WebElement landmarkText;
	
	@FindBy(id="Country")
	private WebElement countryDD;
	

	@FindBy(id="State")
	private WebElement stateDD;
	
	@FindBy(id="City")
	private WebElement cityDD;
	
	@FindBy(id="Pincode")
	private WebElement pincodeText;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNo;
	
	@FindBy(id="addAddress")
	private WebElement addAddressButton;

	public WebElement getNameText() {
		return nameText;
	}

	public WebElement getHouseText() {
		return houseText;
	}

	public WebElement getStreetNo() {
		return streetNo;
	}

	public WebElement getLandmarkText() {
		return landmarkText;
	}
	
	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getStateDD() {
		return stateDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public WebElement getPincodeText() {
		return pincodeText;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getAddAddressButton() {
		return addAddressButton;
	}
	
	
}
