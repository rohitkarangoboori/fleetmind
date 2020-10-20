package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnscheduledStops {
	
	WebDriver driver;

	public UnscheduledStops(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	//@FindBy(id="menu_routeMngId")
	//WebElement unsheduledStopsRouteMenu;
	@FindBy(id="menuItem_UnscheduledStops")
	WebElement unsheduledStopsMenu;
	@FindBy(id="cboWorkFlowGroup")
	WebElement unsheduledStopsOperatingDepartment;
	@FindBy(id="tabResidential")
	WebElement unscheduledStopsResidentailType;
	@FindBy(id="tabFrontLoad")
	WebElement unscheduledStopsFrontLoad;
	@FindBy(id="tabRollOff")
	WebElement unscheduledStopTabRoll;
	@FindBy(id="tabWorkzone")
	WebElement unsheduledStopsWorkZone;
	@FindBy(xpath="//input[@class='ui-grid-filter-input ui-grid-filter-input-0 ng-touched']")
	WebElement unscheduledStopStartDate;
	@FindBy(xpath="//button[@class='btnHeaderFilter']")
	WebElement unscheduledStopsWorkFlow;
	@FindBy(xpath="//input[@class='ng-pristine ng-valid ng-not-empty ng-touched']")
	WebElement unscheduledStopsonDemand;
	@FindBy(xpath="//input[@class='ui-grid-filter-input ui-grid-filter-input-0 ng-pristine ng-valid ng-empty ng-touched']")
	WebElement unscheduledStopsPlanned;
	@FindBy(xpath="//button[@class='btnHeaderFilter']")
	WebElement unscheduledStopsOnDemandWorkFlow;
	@FindBy(xpath="//input[@class='ui-grid-filter-input ui-grid-filter-input-0 ng-touched']")
	WebElement unscheduledStopsWorkOrderId;
	
	
	
}
