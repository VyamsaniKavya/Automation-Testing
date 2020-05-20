package in.amazon.step;

import java.util.List;
import org.openqa.selenium.By;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import in.amazon.pagefactor.SelectedProductPage;
import in.amazon.util.CommonTestBase;

public class BuyingSelectedProductStepDef extends CommonTestBase {

	@Then("^user enters email$")
	public void user_enters_email(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		driver.findElement(By.id("ap_email")).sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
	}

	@Then("^user enters password$")
	public void user_enters_password(DataTable arg2) throws Throwable {
		List<List<String>> data = arg2.raw();
		driver.findElement(By.id("ap_password")).sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
	}

	@Then("^user clicks on menu$")
	public void user_clicks_on_menu() {
		SelectedProductPage spp = new SelectedProductPage(driver);
		spp.clickOnMenu();
	}

	@Then("^user selects any one option from CATEGORY$")
	public void user_selects_any_one_option_from_CATEGORY() {
		SelectedProductPage spp = new SelectedProductPage(driver);
		spp.clickOnPets();
	}

	@Then("^user selects any one option$")
	public void user_selects_any_one_option() {
		SelectedProductPage spp = new SelectedProductPage(driver);
		spp.clickOnKitchen();
	}

	@Then("^user clicks on Jars and containers$")
	public void user_clicks_on_Jars_and_containers() {
		SelectedProductPage spp = new SelectedProductPage(driver);
		spp.clickOnJars();
	}

	@Then("^user clicks on product$")
	public void user_clicks_on_product() throws Throwable {
		SelectedProductPage spp = new SelectedProductPage(driver);
		spp.clickOnProduct();
		Thread.sleep(2000);
	}

	@Then("^user clicks on buynow$")
	public void user_clicks_on_buynow() throws Throwable {
		SelectedProductPage spp = new SelectedProductPage(driver);
		spp.clickOnBuynow();
		Thread.sleep(2000);
		driver.quit();
	}

}
