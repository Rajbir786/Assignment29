package naveenAutomationAssignment.Tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import naveenAutomationAssignment.Base.TestBase;
import naveenAutomationAssignment.pages.AccountCreatedPage;
import naveenAutomationAssignment.pages.HomePage;
import naveenAutomationAssignment.pages.LaptopsNotebooksPage;
import naveenAutomationAssignment.pages.UserRegistrationPage;



	public class AccountCreatedTest extends TestBase{
		HomePage myAccClikOnHomPage=new HomePage();
		@BeforeMethod
		public void setUp() {
			launchBrowser();

            myAccClikOnHomPage=new HomePage();
			
		}
		
	
		@Test
		public void verifyUserAbleToRegister() {
			
         
            UserRegistrationPage	registerAccountPage=	myAccClikOnHomPage.clickMyAccountDropDown1();
		     AccountCreatedPage accountCreated= registerAccountPage.signUp("Ra", "kaer", "rajkll@gmail.com",
					"6234557774", "Password7", "Password7");
	
			Assert.assertEquals(accountCreated.getSuccessAccountCreatedTxt(), "Your Account Has Been Created!",
					"Account not created");
			
		
		
		}
	
		@AfterMethod
		public void tearDown() {
			quitBrowser();
			
		}

	}

