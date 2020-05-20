package in.amazon.pagefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.amazon.util.CommonTestBase;

public class DeliveryAddressPage extends CommonTestBase{
	@FindBy(xpath = "//*[@id=\"address-book-entry-0\"]/div[2]/span/a")
	WebElement Delivery;
	@FindBy(xpath = "//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]/span/input")
	WebElement cont;
	@FindBy(xpath = "//*[@id=\"nav-item-signout\"]/span")
	WebElement signout;
//Initialization
	public DeliveryAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Actions
	public void clickDeliveryAddress() {
		Delivery.click();
	}

	public void clickContinue() {
		cont.click();
	}
	public void clickSignout() {
		signout.click();
	}
}
