package in.amazon.pagefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.amazon.util.CommonTestBase;

public class SigninPage extends CommonTestBase{
	// Page Factory
		@FindBy(xpath = "//a")
		WebElement Links;
		@FindBy(id = "nav-link-accountList")
		WebElement account;
		@FindBy(id = "continue")
		WebElement cont;
		@FindBy(id = "signInSubmit")
		WebElement submit;

		// Initialization
		public SigninPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// Actions
		public void clickAccount() {
			account.click();
		}


		public void clickContinue() {
			cont.click();
		}

		public void clickSubmit() {
			submit.click();
		}

}
