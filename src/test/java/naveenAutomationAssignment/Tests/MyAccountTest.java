package naveenAutomationAssignment.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import naveenAutomationAssignment.Base.TestBase;
import naveenAutomationAssignment.pages.AccountLoginPage;
import naveenAutomationAssignment.pages.EditAccountInformationPage;
import naveenAutomationAssignment.pages.HomePage;
import naveenAutomationAssignment.pages.LaptopsNotebooksPage;
import naveenAutomationAssignment.pages.MyAccountPage;
import naveenAutomationAssignment.pages.NewsLetterSubscriptionPage;

public class MyAccountTest extends TestBase {
	
	HomePage myAccClikOnHomPage = new HomePage();

	
	
	SoftAssert sf = new SoftAssert();
	@BeforeMethod
	public void setUp() {
		launchBrowser();

	}

	@Test
	public void verifyUserAbleToLogin() {
		myAccClikOnHomPage = new HomePage();
		AccountLoginPage accountLogin = myAccClikOnHomPage.clickMyAccountDropDown();
		accountLogin.login("rkkaler@gmail.com", "Password6");

	}
	@Test
	public void clickOnAllLaptopsAndNotebook() {
		myAccClikOnHomPage = new HomePage();
		AccountLoginPage accountLogin = myAccClikOnHomPage.clickMyAccountDropDown();
		MyAccountPage myAccount=accountLogin.login("rkkaler@gmail.com", "Password6");
		LaptopsNotebooksPage laptopBookPage= myAccount.clickOnAllLaptopsAndNotebook();
		Assert.assertEquals(laptopBookPage.verifyTitleOfPage(), "Laptops & Notebooks",
				"Wrong Page Navigation");
		
		
	}
	
	@Test
	public void verifyUserAbleToSubscribe () {
		myAccClikOnHomPage = new HomePage();
	    AccountLoginPage accountLogin = myAccClikOnHomPage.clickMyAccountDropDown();
		MyAccountPage myAccount = accountLogin.login("rkkaler@gmail.com", "Password6");
		NewsLetterSubscriptionPage newsSubsPage = myAccount.subscribeOrNonSubscribeNewsLetter();
		myAccount = newsSubsPage.selectSubscriptionOfNewsLetter();
		sf.assertEquals(myAccount.subscribeorUnsubscribeSuccessMessage(),
				"Success: Your newsletter subscription has been successfully updated!",
				"Subscribe/Unsubscribe not successfuly done");
	

	}


	@Test
	public void verifyUserAbleToChangePhnNumber() {
		myAccClikOnHomPage = new HomePage();
		AccountLoginPage accountLogin = myAccClikOnHomPage.clickMyAccountDropDown();
		MyAccountPage myAccount = accountLogin.login("rkkaler@gmail.com", "Password6");
		EditAccountInformationPage editInformation = myAccount.clickEditInformation();
		editInformation.changePhnNumber("2365569901");
		sf.assertEquals(myAccount.getPhnNumberChangeSuccessMessage(),
				"Success: Your account has been successfully updated.", "Phn number does not change");

	}

	

	@AfterMethod
	public void tearDown() {
		//quitBrowser();

	}

}
