package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class generateContainers {

	WebDriver driver;

	public generateContainers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "menu_inventoryMngId")
	WebElement generateContainerInventoryTab;
	@FindBy(id = "menuItem_GenerateCartsContainers")
	WebElement generateContainerTab;
	@FindBy(xpath = "//input[@ng-model='ContainerModel.serialNumber']")
	WebElement generateContainerSerialNumberPrefix;
	@FindBy(xpath = "//input[@ng-model='startNumber']")
	WebElement generateContainerStartNumber;
	@FindBy(xpath = "//input[@ng-model='endNumber']")
	WebElement genarateContainerEndNumber;
	@FindBy(xpath = "//input[@ng-model='ContainerModel.rfid']")
	WebElement generateContainerRFIDPreFix;
	@FindBy(xpath = "//input[@ng-model='ContainerModel.description']")
	WebElement generateContainerDescription;
	@FindBy(xpath = "//select[@ng-model='selectedMaker']")
	WebElement generateContainerManufacturer;
	@FindBy(xpath = "//select[@ng-model='selectedType']")
	WebElement generateContainerType;
	@FindBy(xpath = "//select[@ng-model='selectColor']")
	WebElement generateContainerColour;
	@FindBy(xpath = "//select[@ng-model='ContainerModel.capacity']")
	WebElement generateContainerVolume;
	@FindBy(xpath = "//select[@ng-model='activeYard']")
	WebElement generateContainerYard;
	@FindBy(xpath = "//input[@ng-model='ContainerModel.active']")
	WebElement generateContainerActive;
	@FindBy(xpath = "//input[@ng-model='selectedIcon']")
	WebElement generateContainerIcon;
	@FindBy(id = "generateBtn")
	WebElement generateContainerButton;

	public void clickInventoryTab() {
		generateContainerInventoryTab.click();
	}

	public void clickGenerateContainerTab() {
		generateContainerTab.click();

	}

	public void strSerialNumber(String strSerialNumber) {
		generateContainerSerialNumberPrefix.sendKeys(strSerialNumber);
	}

	public void strStartNumber(String strStartNumber) {
		generateContainerStartNumber.sendKeys(strStartNumber);
	}

	public void strEndNumber(String strEndNumber) {
		genarateContainerEndNumber.sendKeys(strEndNumber);
	}

	public void strRFID(String strRFID) {
		generateContainerRFIDPreFix.sendKeys(strRFID);
	}

	public void clickManufacturer() {
		generateContainerManufacturer.click();
	}

	public void clickType() {
		generateContainerType.click();
	}

	public void colorType() {
		generateContainerColour.click();
	}

	public void strVolume(String strVolume) {
		generateContainerVolume.sendKeys(strVolume);
	}

	public void Yard() {
		generateContainerYard.click();
	}

	public void ActiveStatus() {
		generateContainerActive.click();
	}

	public void containericon() {
		generateContainerIcon.click();
	}

	public void generateButton() {
		generateContainerButton.click();
	}

	public void GenerateContainer(String strSerialNumber, String strStartNumber, String strEndNumber, String strRFID,
			String strVolume) {
		this.clickInventoryTab();
		this.clickGenerateContainerTab();
		this.strStartNumber(strStartNumber);
		this.strEndNumber(strEndNumber);
		this.strSerialNumber(strSerialNumber);
		this.strRFID(strRFID);
		this.strVolume(strVolume);
		this.clickManufacturer();
		this.clickType();
		this.Yard();
		this.ActiveStatus();
		this.containericon();
		this.generateButton();
		this.colorType();

	}
}
