package naveenAutomationAssignment.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import naveenAutomationAssignment.Base.TestBase;
import naveenAutomationAssignment.pages.AccountLoginPage;
import naveenAutomationAssignment.pages.HomePage;
import naveenAutomationAssignment.pages.LaptopsNotebooksPage;
import naveenAutomationAssignment.pages.MyAccountPage;

public class LaptopsNotebooksTest extends TestBase {

	@BeforeMethod
	public void setUp() {
		launchBrowser();

	}

	@Test
	public void verifyClickSortAndSelectOption() {
		HomePage myAccClikOnHomPage = new HomePage();
		AccountLoginPage accountLogin = myAccClikOnHomPage.clickMyAccountDropDown();
		MyAccountPage myAccount = accountLogin.login("rkkaler@gmail.com", "Password6");
		LaptopsNotebooksPage laptopBookPage = myAccount.clickOnAllLaptopsAndNotebook();

	}

	@AfterMethod
	public void tearDown() {
		// quitBrowser();

	}

}
