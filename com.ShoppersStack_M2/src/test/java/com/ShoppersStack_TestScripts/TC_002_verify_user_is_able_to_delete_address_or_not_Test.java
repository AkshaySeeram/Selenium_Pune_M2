package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_test;
import com.ShoppersStack_POM.MyAddresses_Page;
import com.ShoppersStack_POM.MyProfile_Page;

public class TC_002_verify_user_is_able_to_delete_address_or_not_Test extends Base_test{

	@Test
	public void deleteAddress() throws InterruptedException, IOException {
		
		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myProfilePage=new MyProfile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();
		
		Thread.sleep(2000);
		MyAddresses_Page myAddressesPage=new MyAddresses_Page(driver);
		myAddressesPage.getDeleteBtn().click();
		Thread.sleep(2000);
		myAddressesPage.getYesBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		webDriverUtility.getWebPageScreenShot(driver);
		
	}
	
}
