
package naveenAutomationAssignment.Tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import naveenAutomationAssignment.Base.TestBase;
import naveenAutomationAssignment.pages.AccountLoginPage;
import naveenAutomationAssignment.pages.EditAccountInformationPage;
import naveenAutomationAssignment.pages.HomePage;
import naveenAutomationAssignment.pages.MyAccountPage;
import naveenAutomationAssignment.pages.NewsLetterSubscriptionPage;



public class UserAbleToSubscribeOrUnsubscribe  extends TestBase{

	
		HomePage myAccClikOnHomPage2=new HomePage();
		@BeforeMethod
		public void setUp() {
			launchBrowser();

		}
		
	
		@Test
		public void  VerifyUserAbleToLogin() {
			 myAccClikOnHomPage2=new HomePage();
	AccountLoginPage accountLogin	=myAccClikOnHomPage2.clickMyAccountDropDown();
	MyAccountPage myAccount=accountLogin.login("rkkaler@gmail.com","Password6");
	NewsLetterSubscriptionPage newsSubsPage=myAccount.subscribeOrNonSubscribeNewsLetter();
	 myAccount=newsSubsPage.selectSubscriptionOfNewsLetter();
	Assert.assertEquals(myAccount.subscribeorUnsubscribeSuccessMessage(),"Success: Your newsletter subscription has been successfully updated!");
		
         
          
		
		}
		
		@AfterMethod
		public void tearDown() {
			//quitBrowser();
			
		}

}




