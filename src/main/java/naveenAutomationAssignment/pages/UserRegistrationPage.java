package naveenAutomationAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import naveenAutomationAssignment.Base.TestBase;

public class UserRegistrationPage extends TestBase {
	public UserRegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-firstname")
	WebElement fName;

	@FindBy(id = "input-lastname")
	WebElement lName;

	@FindBy(id = "input-email")
	WebElement email;

	@FindBy(id = "input-telephone")
	WebElement telephone;

	@FindBy(id = "input-password")
	WebElement password;

	@FindBy(id = "input-confirm")
	WebElement confirmPassword;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement privacyPolicyCheckBox;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement continueBtn;

	private void enterFirstName(String fname) {
		fName.sendKeys(fname);
	}

	private void enterLastName(String lname) {
		lName.sendKeys(lname);
	}

	private void enterEmail(String emailInput) {
		email.sendKeys(emailInput);
	}

	private void enterPhoneNumber(String phone) {
		telephone.sendKeys(phone);
	}

	private void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	private void enterConfirmPwd(String cPwd) {
		confirmPassword.sendKeys(cPwd);
	}

	private void clickPrivacyPolicy() {
		privacyPolicyCheckBox.click();
	}

	public AccountCreatedPage signUp(String fname, String lname, String emailInput, String phone, String pwd,
			String cPwd) {
		enterFirstName(fname);
		enterLastName(lname);
		enterEmail(emailInput);
		enterPhoneNumber(phone);
		enterPassword(pwd);
		enterConfirmPwd(cPwd);
		clickPrivacyPolicy();
		continueBtn.click();
		return new AccountCreatedPage();
	}

}
