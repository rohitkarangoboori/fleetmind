package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintRoutes {
	WebDriver driver;

	public PrintRoutes(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menuItem_PrintRoutes")
	WebElement PrintRoutesMenu;
	@FindBy(xpath = "//input[@ng-model='startDate']")
	WebElement PrintRouteDatePicker;
	@FindBy(xpath = "//div[@ng-model='grid.selection.selectAll']")
	WebElement PrintRouteSelectAll;
	@FindBy(xpath = "//button[@ng-click='printRoutes()']")
	WebElement PrintRoutesDownload;

	public void clickMenu() {
		PrintRoutesMenu.click();
	}

	public void strDatePicker(String strDatePicker) {
		PrintRouteDatePicker.sendKeys(strDatePicker);
	}

	public void clickSelectAll() {
		PrintRouteSelectAll.click();
	}

	public void clickDownload() {
		PrintRoutesDownload.click();
	}

	public void PrintRoutesPage(String strDatePicker) {
		this.clickMenu();
		this.strDatePicker(strDatePicker);
		this.clickSelectAll();
		this.clickDownload();
	}
}