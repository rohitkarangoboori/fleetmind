package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchstops {
	WebDriver driver;
	public Searchstops(WebDriver driver){
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	//	@FindBy(id="menu_routeMngId")
      // SearchstopsRouteTab;
		@FindBy(id="menuItem_SearchStops")
		WebElement SearchstopsTab;
		@FindBy(xpath="//input[@ng-model='SearchObj.CustomerId']")
		WebElement SearchstopsCustomerId;
		@FindBy(xpath="//select[@ng-model='SearchObj.Service']")
		WebElement SearchstopsService;
		@FindBy(xpath="//select[@ng-model='SearchObj.currentStatus']")
		WebElement SearchstopsCurrentStatus;
		@FindBy(xpath="//select[@ng-model='SearchObj.route']")
		WebElement SearchstopsRoute;
		@FindBy(xpath="//select[@ng-model='SearchObj.Volume']")
		WebElement SearchstopsVolume;
		@FindBy(xpath="//select[@ng-model='SearchObj.lob']")
		WebElement SearchstopsLineofBusiness;
		@FindBy(xpath="/input[@ng-model='SearchObj.street']")
		WebElement SearchstopsStreet;
		@FindBy(xpath="//input[@ng-model='SearchObj.post']")
		WebElement SearchStopsPostalcode;
		@FindBy(xpath="//select[@ng-model='SearchObj.state']")
		WebElement SearchStopsProvince;
		@FindBy(xpath="//select[@ng-model='SearchObj.city']")
		WebElement SearchStopsCity;
		@FindBy(xpath="//select[@ng-model='SearchObj.district']")
		WebElement SearchStopsDistrict;
		@FindBy(xpath="//select[@ng-model='SearchObj.color']")
		WebElement SearchStopsColour;
		
	}

