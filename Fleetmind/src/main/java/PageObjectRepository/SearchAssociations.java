package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAssociations {

	WebDriver driver;

	public SearchAssociations(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menuItem_searchAssociations")
	WebElement SearchAssociationsMenu;
	@FindBy(xpath = "//input[@ng-model='searchParams.CustomerId']")
	WebElement SearchAssociationCustomerId;
	@FindBy(xpath = "//input[@ng-model='searchParams.CustomerBillingId']")
	WebElement SearchAssociationCustomerCode;
	@FindBy(xpath = "//input[@ng-model='searchParams.BillingLocationId']")
	WebElement SearchAssociationLocation;
	@FindBy(xpath = "//select[@ng-model='searchParams.serviceTypeId']")
	WebElement SearchAssociationService;
	@FindBy(xpath = "//select[@ng-model='searchParams.currentStatus']")
	WebElement SearchAssociationCurrentStatus;
	@FindBy(xpath = "//input[@ng-model='searchParams.CivicFrom']")
	WebElement SearchAssociationFromStreet;
	@FindBy(xpath = "//input[@ng-model='searchParams.CivicTo']")
	WebElement SearchAssociationToStreet;
	@FindBy(xpath = "//input[@ng-model='searchParams.Street']")
	WebElement SearchAssociationStreet;
	@FindBy(xpath = "//input[@ng-model='searchParams.PostalCode']")
	WebElement SearchAssociationPostalCode;
	@FindBy(xpath = "//select[@ng-model='searchParams.StateName']")
	WebElement SearchAssociationProvince;
	@FindBy(xpath = "//input[@ng-model='searchParams.City']")
	WebElement SearchAssociationDistrict;
	@FindBy(id = "searchBtn")
	WebElement SearchAssociationSearch;

	public void clickAssociationMenu() {
		SearchAssociationsMenu.click();
	}

	public void strCustomerId(String strCustomerId) {
		SearchAssociationCustomerId.sendKeys(strCustomerId);
	}

	public void strCustomerCode(String strCustomerCode) {
		SearchAssociationCustomerCode.sendKeys(strCustomerCode);
	}

	public void strLocationcode(String strLocationCode) {
		SearchAssociationLocation.sendKeys(strLocationCode);
	}

	public void clickService() {
		SearchAssociationService.click();
	}

	public void clickCurrentStatus() {
		SearchAssociationCurrentStatus.click();
	}

	public void strFromStreet(String strFromStreet) {
		SearchAssociationFromStreet.sendKeys(strFromStreet);
	}

	public void strToStreet(String strToStreet) {
		SearchAssociationToStreet.sendKeys(strToStreet);
	}

	public void strStreet(String strStreet) {
		SearchAssociationStreet.sendKeys(strStreet);
	}

	public void strPostalcode(String strPostalcode) {
		SearchAssociationPostalCode.sendKeys(strPostalcode);
	}

	public void clickProvince() {
		SearchAssociationProvince.click();
	}

	public void strCity(String strCity) {
		SearchAssociationPostalCode.sendKeys(strCity);
	}

	public void clickDistrict() {
		SearchAssociationDistrict.click();
	}

public void clickSearch() {
	SearchAssociationSearch.click();
}
public void searchAssociationspage(String strCustomerId, String strCustomerCode, String strLocationCode, String strPostalcode, String strFromStreet,String strToStreet,String strStreet,String strCity) {
	this.clickAssociationMenu();
	this.strCustomerId(strCustomerId);
	this.strCustomerCode(strCustomerCode);
	this.strLocationcode(strLocationCode);
	this.clickService();
	this.clickCurrentStatus();
	this.strFromStreet(strFromStreet);
	this.strToStreet(strToStreet);
	this.strStreet(strStreet);
	this.strPostalcode(strPostalcode);
	this.clickProvince();
	this.strCity(strCity);
	this.clickDistrict();
	this.clickProvince();
	this.clickSearch();
}
}
