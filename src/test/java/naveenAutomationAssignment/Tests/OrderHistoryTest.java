package naveenAutomationAssignment.Tests;

	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import naveenAutomationAssignment.Base.TestBase;
import naveenAutomationAssignment.pages.AccountLoginPage;
import naveenAutomationAssignment.pages.MyAccountPage;
import naveenAutomationAssignment.pages.OrderHistoryPage;
import naveenAutomationAssignment.pages.OrderHistoryPage.OrderHistory;


	public class OrderHistoryTest extends TestBase {

		@BeforeMethod
		public void setUp() {
			launchBrowser();
		}

		@Test
		public void verifyPriceForOrder() {
			AccountLoginPage accountLoginPage = new AccountLoginPage();
			MyAccountPage myAccountPage=accountLoginPage.login("iron.man@gmail.com", "Password2");
			OrderHistoryPage orderHistoryPage=myAccountPage.clickOrderHistoryLink();
			WebElement priceElement=orderHistoryPage.getElementFromTheTable("#2539", OrderHistory.CUSTOMER);
		
			Assert.assertEquals(priceElement.getText(), "priceElement.getText()");
		}

		@AfterMethod
		public void teardown() {
			quitBrowser();
		}

	}


