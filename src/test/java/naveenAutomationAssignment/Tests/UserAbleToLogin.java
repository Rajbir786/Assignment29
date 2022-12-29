package naveenAutomationAssignment.Tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import naveenAutomationAssignment.Base.TestBase;
import naveenAutomationAssignment.pages.AccountLoginPage;
import naveenAutomationAssignment.pages.HomePage;





	public class UserAbleToLogin extends TestBase{
		HomePage myAccClikOnHomPage=new HomePage();
		@BeforeMethod
		public void setUp() {
			launchBrowser();

		}
		
	
		@Test
		public void  VerifyUserAbleToLogin() {
			myAccClikOnHomPage=new HomePage();
	AccountLoginPage accountLogin	=myAccClikOnHomPage.clickMyAccountDropDown();
			
accountLogin.login("rkkaler@gmail.com","Password6");
	
         
          
		
		}
		
		@AfterMethod
		public void tearDown() {
			//quitBrowser();
			
		}

	}



