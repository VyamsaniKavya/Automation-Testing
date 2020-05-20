package in.amazon.step;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import in.amazon.pagefactor.SearchedProductPage;
import in.amazon.util.CommonTestBase;

public class BuyingSearchedProductStepDef extends CommonTestBase {
	SearchedProductPage sp = new SearchedProductPage(driver);

	@Then("^user enters phonenumber$")
	public void user_enters_phonenumber(DataTable arg1) throws Throwable {

		for (Map<String, String> data : arg1.asMaps(String.class, String.class)) {
			driver.findElement(By.id("ap_email")).sendKeys(data.get("phonenumber"));
		}
		Thread.sleep(1000);
	}

	@Then("^user enters passwords$")
	public void user_enters_password(DataTable arg2) throws Throwable {
		for (Map<String, String> data : arg2.asMaps(String.class, String.class)) {
			driver.findElement(By.id("ap_password")).sendKeys(data.get("passwords"));
		}
		Thread.sleep(2000);
	}

	@Then("^user search for the Product$")
	public void user_search_for_the_Product() throws Throwable {
		sp.clickSearch(prop.getProperty("searchProduct"));
		Thread.sleep(2000);
	}

	@Then("^user clicks on Search Button$")
	public void user_clicks_on_Search_Button() throws Throwable {
		SearchedProductPage sp = new SearchedProductPage(driver);
		sp.clickSearchButton();
		Thread.sleep(2000);
	}

	@Then("^user selects one brand$")
	public void user_selects_one_brand() throws Throwable {
		SearchedProductPage sp = new SearchedProductPage(driver);
		sp.clickOnCheckBox();
	}

	@Then("^user clicks on perticular product$")
	public void user_clicks_on_perticular_product() throws Throwable {
		SearchedProductPage sp = new SearchedProductPage(driver);
		sp.clickOnProduct();
		// Store all currently open tabs in tabs
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		// Switch newly open Tab
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
	}

	
}
