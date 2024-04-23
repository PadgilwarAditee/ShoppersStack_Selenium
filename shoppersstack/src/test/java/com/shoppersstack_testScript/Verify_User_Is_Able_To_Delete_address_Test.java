package com.shoppersstack_testScript;

import org.testng.annotations.Test;

import com.shopperStack.generalUtility.BaseTest;
import com.shopperStack.pom.AddressesPage;
import com.shopperStack.pom.MyProfilePage;

public class Verify_User_Is_Able_To_Delete_address_Test extends BaseTest {

	@Test
	public void deleteAddress() throws InterruptedException
	{

		hPage.getAcSettings().click();
		hPage.getMyProfile().click();
		
		MyProfilePage profilePage=new MyProfilePage(driver);
		profilePage.getMyAdd().click();
		
		AddressesPage addressPage=new AddressesPage(driver);
		addressPage.getDeleteAddBtn().click();
		Thread.sleep(2000);
		addressPage.getYesBtn();
	
		Thread.sleep(2000);
		driver.switchTo().alert().accept();	
		Thread.sleep(2000);
	}
}
