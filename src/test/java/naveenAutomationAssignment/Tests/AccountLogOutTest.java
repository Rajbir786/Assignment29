package naveenAutomationAssignment.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import naveenAutomationAssignment.Base.TestBase;
import naveenAutomationAssignment.pages.AccountLogOutPage;
import naveenAutomationAssignment.pages.AccountLoginPage;
import naveenAutomationAssignment.pages.HomePage;
import naveenAutomationAssignment.pages.MyAccountPage;

public class AccountLogOutTest extends TestBase {

	SoftAssert sf = new SoftAssert();

	@BeforeMethod
	public void setUp() {
		launchBrowser();

	}

	@Test
	public void VerifyUserAbleToLogin() {
		HomePage myAccClikOnHomPage = new HomePage();
		AccountLoginPage accountLogin = myAccClikOnHomPage.clickMyAccountDropDown();
        MyAccountPage myAccount = accountLogin.login("rkkaler@gmail.com", "Password6");
        AccountLogOutPage logOut = myAccount.LogOut();
		sf.assertEquals(logOut.AccountLogOutText(), "Account Logout");
		sf.assertEquals(logOut.TitleOfAccountLogOut(), "Account Logout");
		logOut.AccountLogOutDetails();

	}

	@AfterMethod
	public void tearDown() {
		quitBrowser();

	}

}
