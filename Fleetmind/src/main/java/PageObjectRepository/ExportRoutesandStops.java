package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportRoutesandStops {
	WebDriver driver;

	public ExportRoutesandStops(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "menuItem_ExportRoutesAndStops")
	WebElement ExportRoutesandStopsMenu;
	@FindBy(id = "district")
	WebElement ExportRoutesandStopsDristrict;
	@FindBy(id = "street")
	WebElement ExportRoutesandStopsStreet;
	@FindBy(id = "assignementStatusCode")
	WebElement ExportRoutesandStopsAssignementStatus;
	@FindBy(id = "activeAssignement")
	WebElement ExportRoutesandStopsActiveStatus;
	@FindBy(id = "startDate")
	WebElement ExportRoutesandStopsStartDate;
	@FindBy(id = "endDate")
	WebElement ExportRoutesandStopsEndDate;
	@FindBy(id = "containerCapacity")
	WebElement ExportRoutesandStopsConatiner;
	@FindBy(xpath = "//span[@class='multiSelect inlineBlock']")
	WebElement ExportRoutesandStopsRoutes;
	@FindBy(id = "damagedContainer")
	WebElement ExportRoutesandStopsDamagedContainer;
	@FindBy(id = "activeContainer")
	WebElement ExportRoutesandStopsActiveContainer;
	@FindBy(xpath = "//div[@ng-model='vm.containers_vs_sections']")
	WebElement ExportRoutesandStopsContainers;
	@FindBy(id = "searchBtn")
	WebElement ExportRoutesandStopsExport;

	public void clickMenu() {
		ExportRoutesandStopsMenu.click();
	}

	public void clickDristrict() {
		ExportRoutesandStopsDristrict.click();
	}

	public void clickStreet() {
		ExportRoutesandStopsStreet.click();
	}

	public void clickAssignement() {
		ExportRoutesandStopsAssignementStatus.click();
	}

	public void strStartDate(String strStartDate) {
		ExportRoutesandStopsStartDate.sendKeys(strStartDate);
	}

	public void strEndDate(String strEndDate) {
		ExportRoutesandStopsEndDate.sendKeys(strEndDate);
	}

	public void clickContainer() {
		ExportRoutesandStopsConatiner.click();
	}

	public void clickDamgedContainer() {
		ExportRoutesandStopsDamagedContainer.click();
	}

	public void clickActiveContainer() {
	ExportRoutesandStopsActiveContainer.click();
}
	public void clickStopContainer() {
		ExportRoutesandStopsConatiner.click();
	}
	public void clickExport(){
      ExportRoutesandStopsExport.click();
	}
	public void ExportRoutesandStopsPage(String strStartDate, String strEndDate) {
		this.clickMenu();
		this.clickDristrict();
		this.clickStreet();
		this.clickAssignement();
		this.strStartDate(strStartDate);
		this.strEndDate(strEndDate);
		this.clickContainer();
		this.clickDamgedContainer();
		this.clickActiveContainer();
		this.clickStopContainer();
		this.clickExport();
	}
}