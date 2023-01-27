package naveenAutomationAssignment.Tests;

import org.openqa.selenium.By;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import naveenAutomationAssignment.Base.TestBase;
import naveenAutomationAssignment.pages.AccountLoginPage;
import naveenAutomationAssignment.pages.AddressBookPage;
import naveenAutomationAssignment.pages.HomePage;
import naveenAutomationAssignment.pages.MyAccountPage;

public class AddressBookTest extends TestBase {

	@BeforeMethod
	public void setUp() {
		launchBrowser();

	}

	@Test
	public void deleteAddressFirstFromAddressBookTable() {
		HomePage myAccClikOnHomPage = new HomePage();
		AccountLoginPage accountLogin = myAccClikOnHomPage.clickMyAccountDropDown();
		MyAccountPage myAccount = accountLogin.login("rkkaler@gmail.com", "Password6");
		AddressBookPage addressBook = myAccount.clickAddressBookLink();
		// WebElement element= addressBook.getElementFromTheTable("V3V1A2");
//	System.out.println(element.getText());
		
		addressBook.editAddress("V3V1A2", 1,By.cssSelector("a:first-of-type"));
		
	}
	public void deleteAddressSecondFromAddressBookTable() {
		HomePage myAccClikOnHomPage = new HomePage();
		AccountLoginPage accountLogin = myAccClikOnHomPage.clickMyAccountDropDown();
		MyAccountPage myAccount = accountLogin.login("rkkaler@gmail.com", "Password6");
		AddressBookPage addressBook = myAccount.clickAddressBookLink();
		// WebElement element= addressBook.getElementFromTheTable("V3V1A2");
//	System.out.println(element.getText());
		
		addressBook.editAddress("V3V1Z6",1, By.cssSelector("a:first-of-type"));
		
	}

	@AfterMethod
	public void tearDown() {
		// quitBrowser();

	}
}