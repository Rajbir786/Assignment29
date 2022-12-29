package naveenAutomationAssignment.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import naveenAutomationAssignment.Base.TestBase;

;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement myAccountText;
	@FindBy(css ="#content.col-sm-9 ul.list-unstyled:first-of-type li:first-of-type a")
	WebElement editYourInformationLink;
	
	@FindBy(css = "div.alert-success")
	WebElement phnNumberChangesSuccessBanner;
	@FindBy(css ="div.alert.alert-success.alert-dismissible")
	WebElement subscribeOrUnSubscribeSuccessBanner;
	@FindBy(css ="#content.col-sm-9 ul.list-unstyled:nth-of-type(4) a")
	WebElement subscribeOrnonSubscribeLink;
	@FindBy(css ="div.list-group a:last-of-type")
	WebElement logOutLink;

	public String getMyAccountText() {
		return myAccountText.getText();
	}
	
	public EditAccountInformationPage clickEditInformation() {
		editYourInformationLink.click();
		return new EditAccountInformationPage();
		
	}
	public String getPhnNumberChangeSuccessMessage() {
		return  phnNumberChangesSuccessBanner.getText();
	}
	public String subscribeorUnsubscribeSuccessMessage() {
		return subscribeOrUnSubscribeSuccessBanner.getText();
		
	}
public NewsLetterSubscriptionPage subscribeOrNonSubscribeNewsLetter() {
	subscribeOrnonSubscribeLink.click();
	return new NewsLetterSubscriptionPage();
	
}
public  AccountLogOut LogOut() {
	
	logOutLink.click();
	return new AccountLogOut();
	
}
	
}