
package naveenAutomationAssignment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import naveenAutomationAssignment.Base.TestBase;

public class EditAccountInformationPage extends TestBase {
	public EditAccountInformationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[type='tel']")
	WebElement telephoneChangeInputField;

	@FindBy(css = "input[type='submit']")
	WebElement continueBtnForPhnNumChange;

	private void telephoneChangeInputField(String telephoneNumb) {
		telephoneChangeInputField.clear();
		telephoneChangeInputField.sendKeys(telephoneNumb);
	}

	public MyAccountPage changePhnNumber(String telephoneNumb) {
		telephoneChangeInputField(telephoneNumb);
		continueBtnForPhnNumChange.submit();
		return new MyAccountPage();

	}

}