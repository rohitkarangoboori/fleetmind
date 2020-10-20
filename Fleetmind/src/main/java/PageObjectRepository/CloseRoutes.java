package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloseRoutes {

	WebDriver driver;

	public CloseRoutes(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menuItem_CloseRoutes")
	WebElement CloseRouteMenu;
	@FindBy(id = "routeDate")
	WebElement CloseRouteDatePicker;
	@FindBy(id = "btnCopyRouteDropDown")
	WebElement CloseRouteRoute;
	@FindBy(id = "closeBtn")
	WebElement CloseRouteCloseButton;
	@FindBy(xpath = "//button[@ng-click='editRecords(rowEntity)']")
	WebElement CloseRouteEditRecord;
	@FindBy(xpath = ("//button[@ng-click='addOnDemand(rowEntity)']"))
	WebElement CloseRouteAddonDemand;
	@FindBy(xpath = "//button[@ng-click='addExtra(rowEntity)']")
	WebElement CloseRouteAddExtra;
	@FindBy(xpath = "//button[@ng-click='addDisposal(rowEntity)']")
	WebElement CloseRouteAddDisposal;
	@FindBy(xpath = "//button[@ng-click='openCase(rowEntity)']")
	WebElement CloseRouteAddCustomerCase;

	public void clickRouteMenu() {
		CloseRouteMenu.click();
	}

	public void strDatePicker(String strDatePicker) {
		CloseRouteDatePicker.sendKeys(strDatePicker);
	}

	public void clickRoute() {
		CloseRouteRoute.click();
	}

	public void clickcloseButton() {
		CloseRouteCloseButton.click();
	}

	public void clickEditRecord() {
		CloseRouteEditRecord.click();
	}

	public void clickAddonDemand() {
		CloseRouteAddonDemand.click();
	}

	public void clickAddExtra() {
		CloseRouteAddExtra.click();
	}

	public void clickAddDisposal() {
		CloseRouteAddDisposal.click();
	}

	public void clickAddCustomerCase() {
		CloseRouteAddCustomerCase.click();
	}

	public void CloseRoutesMenu(String strDatePicker) {
		this.clickRouteMenu();
		this.clickRoute();
		this.strDatePicker(strDatePicker);
		this.clickcloseButton();
		this.clickAddonDemand();
		this.clickEditRecord();
		this.clickAddDisposal();
		this.clickAddExtra();
		this.clickAddCustomerCase();

	}
}
