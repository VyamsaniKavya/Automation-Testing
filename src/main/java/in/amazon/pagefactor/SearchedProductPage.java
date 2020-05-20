package in.amazon.pagefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchedProductPage {
	// Page Factory
	@FindBy(id = "twotabsearchtextbox")
	WebElement search;
	@FindBy(className = "nav-input")
	WebElement clickonsearch;
	@FindBy(xpath = "//*[@id=\"p_89/Savlon\"]/span/a/div/label/i")
	WebElement Checkbox;
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[2]/div[2]/div/span/div/div/span/a/div/img")
	WebElement product;

	// Initialization
	public SearchedProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void clickSearch(String product) {
		search.sendKeys(product);
	}

	public void clickSearchButton() {
		clickonsearch.click();
	}

	public void clickOnCheckBox() {
		Checkbox.click();
	}

	public void clickOnProduct() {
		product.click();
	}

}