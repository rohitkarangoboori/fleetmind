package PageObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRoute {
	WebDriver driver;

	public AddRoute(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText="Routes")
	WebElement RouteTab;
	@FindBy(id = "menuItem_AddRoute")
	WebElement AddRouteMenu;
	@FindBy(id = "routeType")
	WebElement AddRouteType;
	@FindBy(xpath = "//input[@ng-model='vm.RouteModel.name']")
	WebElement AddRouteName;
	@FindBy(xpath = "//input[@ng-model='vm.RouteModel.serviceDate']")
	WebElement AddRouteStartDate;
	@FindBy(id = "btnFrequencyDropDown")
	WebElement AddRouteRouteFrequency;
	@FindBy(id = "chkSatelliteView")
	WebElement AddRouteSatelliteView;
	@FindBy(id = "btnTruckDropDown")
	WebElement AddRouteTruck;
	@FindBy(xpath = "//select[@ng-model='vm.RouteModel.workGroupAutoId']")
	WebElement AddRouteWorkGroup;
	@FindBy(xpath = "//input[@ng-model='vm.RouteModel.linked']")
	WebElement AddRouteGeozone;
	@FindBy(xpath = "//select[@ng-model='vm.RouteModel.materialAutoId1']")
	WebElement AddRouteMaterial;
	@FindBy(xpath = "//select[@ng-model='vm.RouteModel.workFlowGroupAutoId']")
	WebElement AddRouteOperatingDepartment;
	@FindBy(xpath = "//input[@ng-model='vm.RouteModel.routePathlinked']")
	WebElement AddRoutePath;
	@FindBy(xpath = "//select[@ng-model='vm.RouteModel.customerTypeId']")
	WebElement AddRouteLineOfBussiness;
	@FindBy(xpath = "//select[@ng-model='vm.RouteModel.containerTypeId1']")
	WebElement AddRouteContainerType;
	@FindBy(xpath = "//div[@ng-model='vm.RouteModel.isTemporary']")
	WebElement AddRouteTemporary;
	@FindBy(xpath = "//div[@ng-model='vm.RouteModel.isWorkZone']")
	WebElement AddRouteWorkZone;
	@FindBy(xpath = "//div[@ng-model='vm.RouteModel.updateGeoLocation']")
	WebElement AddRouteUpdateGeoLocation;
	@FindBy(xpath = "//div[@ng-model='vm.RouteModel.updateRfid']")
	WebElement AddRouteUpdateRFID;
	@FindBy(xpath = "//div[@ng-model='vm.RouteModel.updateSerNbr']")
	WebElement AddRouteSerial;
	@FindBy(xpath = "//span[@ng-model='vm.RouteModel.nextScheduledDispatch']")
	WebElement AddRouteNextScheduledDispatch;
	@FindBy(xpath = "//input[@ng-model='vm.RouteModel.totalRouteDistance']")
	WebElement AddRouteExpectedRouteDistance;
	@FindBy(xpath = "//input[@value='Mi']")
	WebElement AddRouteMiles;
	@FindBy(xpath = "//Input[@value='Km']")
	WebElement AddRouteKiloMeters;
	@FindBy(xpath = "//input[@ng-model='vm.RouteModel.expirationDays']")
	WebElement AddRouteExpirationDays;
	@FindBy(xpath = "//textarea[@ng-model='vm.RouteModel.message']")
	WebElement AddRouteMessage;
	@FindBy(xpath = "//button[@ng-click='vm.showEditSequence()']")
	WebElement AddRouteEditSequence;
	@FindBy(id = "showHideStops")
	WebElement AddRouteShoworHideStops;
	@FindBy(id = "saveBtn")
	WebElement AddRouteSaveButton;


	public void clickRouteTab() {

		RouteTab.click();
	}

	public void clickaddRoutemenu() {
		AddRouteMenu.click();
	}

	public void clickaddRoutetype() {
		AddRouteType.click();
	}

	public void strRouteName(String strRouteName) {
		AddRouteName.sendKeys(strRouteName);
	}

	public void strStartDate(String strStartDate) {
		AddRouteStartDate.sendKeys(strStartDate);
	}

	public void strRouteFrequency(String strRouteFrequency) {
		AddRouteRouteFrequency.sendKeys(strRouteFrequency);
	}

	public void clickTruck() {
		AddRouteTruck.click();
	}

	public void clickWorkGroup() {
		AddRouteWorkGroup.click();
	}

	public void clickSatelliteVeiw() {
		AddRouteSatelliteView.click();
	}

	public void clickUpdateGeoZone() {
		AddRouteGeozone.click();
	}

	public void clickMaterial() {
		AddRouteMaterial.click();
	}

	public void clickUpdateRFID() {
		AddRouteUpdateRFID.click();
	}

	public void clickSerial() {
		AddRouteSerial.click();
	}

	public void clickOperatingDepartment() {
		AddRouteOperatingDepartment.click();
	}

	public void clickPath() {
		AddRoutePath.click();
	}

	public void clicklineOfBussiness() {
		AddRouteLineOfBussiness.click();
	}

	public void clickContainerType() {
		AddRouteContainerType.click();
	}

	public void clickTemporary() {
		AddRouteTemporary.click();
	}

	public void clickWorkZone() {
		AddRouteWorkZone.click();
	}

	public void clickUpdateGeoLocation() {
		AddRouteUpdateGeoLocation.click();
	}

	public void strNextScheduled(String strNextScheduled) {
		AddRouteNextScheduledDispatch.sendKeys(strNextScheduled);
	}

	public void strExpectedRoute(String strExpectedRouteDistance) {
		AddRouteExpectedRouteDistance.sendKeys(strExpectedRouteDistance);
	}

	public void clickMiles() {
		AddRouteMiles.click();
	}

	public void clickKiloMeters() {
		AddRouteKiloMeters.click();
	}

	public void strExperationDays(String strExpirationDays) {
		AddRouteExpirationDays.sendKeys(strExpirationDays);
	}

	public void StrRouteMessage(String strRouteMessage) {
		AddRouteMessage.sendKeys(strRouteMessage);
	}

	public void clickEditSequence() {
		AddRouteEditSequence.click();
	}

	public void clickShoworHideStops() {
		AddRouteShoworHideStops.click();
	}

	public void clickSaveButton() {
		AddRouteSaveButton.click();
	}
	public void clickfrequency() {
		AddRouteRouteFrequency.click();
	}
	public void addRoutepage(String strRouteName,String strStartDate,String strRouteFrequency,String strNextScheduled,String strExpectedRouteDistance,String strRouteMessage,String strExpirationDays) {
		this.clickRouteTab();
		this.clickaddRoutemenu();
		this.clickaddRoutetype();
		this.strStartDate(strStartDate);
		this.strRouteName(strRouteName);
		this.clickTruck();
		this.clickWorkGroup();
		this.clickSatelliteVeiw();
		this.clickUpdateGeoZone();
		this.clickMaterial();
		this.clickUpdateRFID();
		this.clickSerial();
		this.clickOperatingDepartment();
		this.clickPath();
		this.clicklineOfBussiness();
		this.clickfrequency();
		this.StrRouteMessage(strRouteMessage);
		this.clickContainerType();
		this.clickKiloMeters();
		this.clickEditSequence();
		this.clickShoworHideStops();
		this.clickSaveButton();
		this.strExperationDays(strExpirationDays);
	}
}
