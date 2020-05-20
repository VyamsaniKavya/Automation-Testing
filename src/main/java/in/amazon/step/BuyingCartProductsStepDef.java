package in.amazon.step;

import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.amazon.pagefactor.CartPage;
import in.amazon.pagefactor.DeliveryAddressPage;
import in.amazon.pagefactor.SigninPage;
import in.amazon.util.CommonTestBase;

public class BuyingCartProductsStepDef extends CommonTestBase {
	SigninPage sp = new SigninPage(driver);

	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
		CommonTestBase.initialization();
		Thread.sleep(2000);
	}

	@When("^user clicks on Accounts & Lists$")
	public void user_clicks_on_Accounts_Lists() throws Throwable {
		SigninPage sp = new SigninPage(driver);
		sp.clickAccount();
		Thread.sleep(1000);
	}

	@Then("^user enters \"(.*)\"$")
	public void user_enters_username(String email) throws Throwable {
		driver.findElement(By.id("ap_email")).sendKeys(email);
		Thread.sleep(1000);
	}

	@Then("^clicks on continue Button$")
	public void clicks_on_continue_Button() throws Throwable {
		SigninPage sp = new SigninPage(driver);
		sp.clickContinue();
		Thread.sleep(1000);
	}

	@Then("^user enters  \"(.*)\"$")
	public void user_enters_password(String password) throws Throwable {
		driver.findElement(By.id("ap_password")).sendKeys(password);
		Thread.sleep(1000);
	}

	@Then("^clicks on Login Button$")
	public void clicks_on_Login_Button() throws Throwable {
		SigninPage sp = new SigninPage(driver);
		sp.clickSubmit();
		Thread.sleep(2000);
	}

	@Then("^clicks on cart Page$")
	public void clicks_on_cart_Page() throws Throwable {
		CartPage cp = new CartPage(driver);
		cp.clickCart();
		Thread.sleep(2000);
	}

	@Then("^clicks on proceed to Buy$")
	public void clicks_on_proceed_to_Buy() throws Throwable {
		CartPage cp = new CartPage(driver);
		cp.clickProceedToBuy();
		Thread.sleep(2000);
	}

	@Then("^clicks on Delivery to this Address$")
	public void clicks_on_Delivery_to_this_Address() throws Throwable {
		DeliveryAddressPage dap = new DeliveryAddressPage(driver);
		dap.clickDeliveryAddress();
		Thread.sleep(2000);
	}

	@Then("^clicks on continue$")
	public void clicks_on_continue() throws Throwable {
		DeliveryAddressPage dap = new DeliveryAddressPage(driver);
		dap.clickContinue();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	@Then("^clicks on Signout link$")
	public void clicks_on_Signout_link() throws Throwable {
		DeliveryAddressPage dap = new DeliveryAddressPage(driver);
		dap.clickSignout();
		Thread.sleep(1000);
		driver.close();
	}

}
