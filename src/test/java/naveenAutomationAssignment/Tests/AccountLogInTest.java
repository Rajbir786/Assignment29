package naveenAutomationAssignment.Tests;

import naveenAutomationAssignment.Base.TestBase;


	import java.io.IOException;

	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import naveenAutomationAssignment.pages.AccountLoginPage;
import naveenAutomationAssignment.pages.EditAccountInformationPage;
import naveenAutomationAssignment.pages.HomePage;
import naveenAutomationAssignment.pages.MyAccountPage;
import naveenAutomationAssignment.Utils.ExcelUtils;

	public class AccountLogInTest extends TestBase{

		@BeforeMethod
		public void setUp() {
			launchBrowser();
		}
		@Test(dataProvider = "AccountInfoDataProvider")
		public void verifyAccountInfoOfUsers(String username, String password,String firstname,String lastname,String email,String telephone) 
		
		{
			HomePage myAccClikOnHomPage = new HomePage();
			 myAccClikOnHomPage.clickMyAccountDropDown();
			AccountLoginPage accountLoginPage = new AccountLoginPage();
			MyAccountPage myAccount=accountLoginPage.login(username, password);
			Assert.assertEquals(myAccount.titleOfPage(),"My Account","You are not successfuly login");
			EditAccountInformationPage editAccInfo=myAccount.clickEditInformation();
			Assert.assertEquals(editAccInfo.firstNameFieldFilledAlready(),firstname,"Wrong firstname");
			Assert.assertEquals(editAccInfo.lastNameFieldFilledAlready(),lastname,"Wrong firstname");
			Assert.assertEquals(editAccInfo.emailFieldFilledAlredy(),email,"Wrong firstname");
			Assert.assertEquals(editAccInfo.telephoneFieldFilledAlready(),telephone,"Wrong firstname");
			
		}
		@DataProvider(name = "AccountInfoDataProvider")
		///any method provide data use dataprovider=name to which  method
		public String[][] provideAccountInfo() throws IOException {
			String filePath = "C:\\Users\\Rajbir\\eclipse-workspace\\naveenAutomationAssignment\\Test Data\\LoginDetails.xlsx";
			int rowCount = ExcelUtils.getRowCount(filePath,"Sheet5");
			int colCount = ExcelUtils.getColumnCount(filePath,"Sheet5",rowCount);
		     String[][] loginData = new String[rowCount][colCount];
			for (int i = 1; i <= rowCount; i++) {
				for (int j = 0; j < colCount; j++) {
					loginData[i - 1][j] = ExcelUtils.getCellValue(filePath,"Sheet5", i, j);
				}
			}
			return loginData;

		}



		

		@AfterMethod
		public void teardown() {
			quitBrowser();
		}

	
		}



