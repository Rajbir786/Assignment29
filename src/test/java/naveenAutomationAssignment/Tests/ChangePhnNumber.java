

 package naveenAutomationAssignment.Tests;





import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import naveenAutomationAssignment.Base.TestBase;
import naveenAutomationAssignment.pages.AccountLoginPage;
import naveenAutomationAssignment.pages.HomePage;
import naveenAutomationAssignment.pages.EditAccountInformationPage;
import naveenAutomationAssignment.pages.HomePage;
import naveenAutomationAssignment.pages.MyAccountPage;




 public class ChangePhnNumber extends TestBase{
		HomePage myAccClikOnHomPage2=new HomePage();
		@BeforeMethod
		public void setUp() {
			launchBrowser();

		}
		
	
		@Test
		public void  VerifyUserAbleToChangePhnNumber() {
			 myAccClikOnHomPage2=new HomePage();
	AccountLoginPage accountLogin	=myAccClikOnHomPage2.clickMyAccountDropDown();
	MyAccountPage myAccount=accountLogin.login("rkkaler@gmail.com","Password6");
	EditAccountInformationPage editInformation=myAccount.clickEditInformation();
	editInformation.changePhnNumber("2365569901");
	Assert.assertEquals( myAccount.getPhnNumberChangeSuccessMessage(), "Success: Your account has been successfully updated.");
         
         
  
		}
		
		@AfterMethod
		public void tearDown() {
			//quitBrowser();
			
		}

	}






