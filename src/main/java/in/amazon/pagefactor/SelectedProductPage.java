package in.amazon.pagefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedProductPage {
	//Page Factor
	@FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]/i")
	WebElement menubar;
	@FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[12]/a/div")
	WebElement pets;
	@FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[11]/li[3]/a")
	WebElement kitchen;
	@FindBy(xpath = "//*[@id=\"gwd-browseMultiCategoryCard-merchandised-search-5\"]/div/div[1]/a/img")
	WebElement jars;
	@FindBy(xpath = "//*[@id=\"result_0\"]/div/div[2]/div/div/a/img")
	WebElement product;
	@FindBy(name = "submit.buy-now")
	WebElement buynow;

	// Initialization
	public SelectedProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void clickOnMenu() {
		menubar.click();
	}

	public void clickOnPets() {
		pets.click();
	}

	public void clickOnKitchen() {
		kitchen.click();
	}

	public void clickOnJars() {
		jars.click();
	}

	public void clickOnProduct() {
		product.click();
	}

	public void clickOnBuynow() {
		buynow.click();
	}
}
