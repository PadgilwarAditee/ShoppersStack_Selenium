package com.shoppersstack_testScript;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.shopperStack.generalUtility.BaseTest;
import com.shopperStack.generalUtility.ListnersUtility;
import com.shopperStack.pom.AddressFormPage;
import com.shopperStack.pom.AddressesPage;
import com.shopperStack.pom.MyProfilePage;

@Listeners(ListnersUtility.class)
public class Verify_User_Is_Able_To_Add_Address_Test extends BaseTest{
	
	@Test
	public void addAddress() throws IOException {
		
		
		test.log(Status.INFO, "Verify User Is Able Navigate To HomePage");
		hPage.getAcSettings().click();
		hPage.getMyProfile().click();
		
		test.log(Status.INFO, "Verify User Is Able Navigate To MyProfile Page");
		MyProfilePage mProfilePage= new MyProfilePage(driver);
		mProfilePage.getMyAdd().click();
		
		test.log(Status.INFO, "Verify User Is Able Navigate To MyAddresses Page");
		AddressesPage addPage= new AddressesPage(driver);
		addPage.getAddAddress().click();
		
		test.log(Status.INFO, "Verify User Is Able Navigate To AddressForm Page");
		AddressFormPage addForm= new AddressFormPage(driver);
		addForm.getNameText().sendKeys(file.excelFile("Sheet1", 1, 0));
		addForm.getHouseText().sendKeys(file.excelFile("Sheet1", 1, 1));
		addForm.getStreetNo().sendKeys(file.excelFile("Sheet1", 1, 2));
		addForm.getLandmarkText().sendKeys(file.excelFile("Sheet1", 1, 3));
		
		wbDriverUtil.selectByValue(addForm.getCountryDD(), file.readPropertyFile("country"));
		wbDriverUtil.selectByValue(addForm.getStateDD(), file.readPropertyFile("state"));
		wbDriverUtil.selectByValue(addForm.getCityDD(), file.readPropertyFile("city"));
		
		addForm.getPincodeText().sendKeys(file.excelFile("Sheet1", 1, 4));
		addForm.getPhoneNo().sendKeys(file.excelFile("Sheet1", 1, 5));
		addForm.getAddAddressButton().click();
		
		
		
	}

}
