package naveenAutomationAssignment.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import naveenAutomationAssignment.Base.TestBase;



public class AccountCreatedPage extends TestBase {

	public AccountCreatedPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css ="#content h1")
	WebElement accountCreationSuccessTxt;

	public String getSuccessAccountCreatedTxt() {
		return accountCreationSuccessTxt.getText();
	}


}

