package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportRoutesandStops {

	WebDriver driver;

	public ImportRoutesandStops(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "menuItem_ImportRouteStops")
	WebElement ImportRoutesandStopsMenu;
	@FindBy(xpath = "//div[@ng-model='vm.customerIdUnique']")
	WebElement ImportRoutesandStopCustomerId;
	@FindBy(xpath = "//div[@ng-model='vm.clearRoutes']")
	WebElement ImportRoutesandStopsClearRoutes;
	@FindBy(xpath = "//div[@ng-click='changeTable()']")
	WebElement ImportRoutesandStopsContainers;
	@FindBy(id = "exportSampleBtn")
	WebElement ImportRoutesandStopsDownloadSample;
	@FindBy(xpath = "//span[@class='btn btn-default btn-file span100 ng-binding']")
	WebElement ImportRoutesandStopsBrowse;

	public void clickMenu() {
		ImportRoutesandStopsMenu.click();
	}

	public void clickCustomerId() {
		ImportRoutesandStopCustomerId.click();
	}

	public void clickClearRoutes() {
		ImportRoutesandStopsClearRoutes.click();
	}

	public void clickContainers() {
		ImportRoutesandStopsContainers.click();
	}

	public void clickDownloadSample() {
		ImportRoutesandStopsDownloadSample.click();
	}

	public void clickBrowse() {
		ImportRoutesandStopsBrowse.click();
	}

	public void ImportRoutesandStopsPage() {
		this.clickMenu();
		this.clickCustomerId();
		this.clickContainers();
		this.clickClearRoutes();
		this.clickDownloadSample();
		this.clickBrowse();
	}
}
