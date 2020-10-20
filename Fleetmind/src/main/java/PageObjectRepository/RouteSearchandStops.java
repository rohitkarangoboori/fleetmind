package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RouteSearchandStops {
	WebDriver driver;

	public RouteSearchandStops(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menu_routeMngId")
	WebElement routeSearchandStopRoute;
	@FindBy(id = "menuItem_RoutesAndStops")
	WebElement routeSearchandStopsTab;
	@FindBy(css = "select.form-control")
	WebElement routeSearchandStopOperatingDepartment;
	@FindBy(xpath = "//input[@Name='routeName']")
	WebElement routeSearchandStopRouteName;
	@FindBy(xpath = "//input[@Name='truck']")
	WebElement routeSearchandStopTruck;
	@FindBy(xpath = "//input[@Name='workGroup']")
	WebElement routeSearchandStopWorkGroup;
	@FindBy(id = "searchBtn")
	WebElement routeSearchandStopSearchButton;
	@FindBy(id = "saveButton")
	WebElement routeSearchandStopSaveButton;

	public void clickMenu() {
		routeSearchandStopRoute.click();
	}

	public void clickRoutesandStopsTab() {
		routeSearchandStopsTab.click();

	}

	public void clickOperatingDepartment() {
		routeSearchandStopOperatingDepartment.click();
	}

	public void strRouteName(String strRouteName) {
		routeSearchandStopRouteName.sendKeys(strRouteName);
	}

	public void strTruck(String strTruck) {
		routeSearchandStopTruck.sendKeys(strTruck);

	}

	public void strWorkGroup(String strWorkGroup) {
		routeSearchandStopWorkGroup.sendKeys(strWorkGroup);
	}

	public void clickSearch() {
		routeSearchandStopSearchButton.click();
	}

	public void clickSave() {
		routeSearchandStopSaveButton.click();
	}

	public void SearchRoutesandStopsPage(String strRouteName,String strTruck,String strWorkGroup) {
		this.clickMenu();
		this.clickRoutesandStopsTab();
		this.clickOperatingDepartment();
		this.strRouteName(strRouteName);
		this.strTruck(strTruck);
		this.strWorkGroup(strWorkGroup);
		this.clickSearch();
		this.clickSave();
	}
}