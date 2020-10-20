package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchContainers {
		WebDriver driver;
		public SearchContainers(WebDriver driver) {
			
	this.driver = driver;
			PageFactory.initElements(driver,this);
		}
@FindBy(id="menu_inventoryMngId")
WebElement SearchContainerInventoryMenu;
@FindBy(id="menuItem_searchContainers")
WebElement SearchContainerMenu;
@FindBy(xpath="//input[@ng-model='SearchViewModel.SerialNumber']")
WebElement SearchContainerSerialNumber;
@FindBy(xpath="//input[@ng-model='SearchViewModel.RFID']")
WebElement SearchContainerRFID;
@FindBy(xpath="//select[@ng-model='SearchViewModel.SelectedYard']")
WebElement SearchContainerYard;
@FindBy(xpath="//select[@ng-model='SearchViewModel.IsAssociated']")
WebElement SearchContainerAssociated;
@FindBy(xpath="//select[@ng-model='SearchViewModel.Active']")
WebElement SearchContainerActive;
@FindBy(xpath="//select[@ng-model='SearchViewModel.Status']")
WebElement SearchContainerStatus;
@FindBy(xpath="//select[@ng-model='SearchViewModel.SelectedVolume']")
WebElement SearchContainerVolume;
@FindBy(xpath="//select[@ng-model='SearchViewModel.SelectedVolumeUnits']")
WebElement SearchContainerVolumeUnits;
@FindBy(xpath="//select[@ng-model='SearchViewModel.SelectedType']")
WebElement SearchContainerType;
@FindBy(xpath="//select[@ng-model='SearchViewModel.SelectedManufacturer']")
WebElement SearchConatinerManufacturer;
@FindBy(xpath="SearchViewModel.SelectedColor")
WebElement SearchConatinerColor;
@FindBy(id="searchBtn1")
WebElement SearchContainerSearch;

public void clickContainerMenu() {
	SearchContainerInventoryMenu.click();
}
public void clickContainerTab() {
	SearchContainerMenu.click();
}
}