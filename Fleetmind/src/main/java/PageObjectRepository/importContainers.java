package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class importContainers {

WebDriver driver;
public importContainers(WebDriver driver){
	this.driver =driver;
	PageFactory.initElements(driver,this);
}
	@FindBy(id = "menu_inventoryMngId")
	WebElement importContianersInventoryTab;
	@FindBy(id="menuItem_ImportCartsContainers")
	WebElement importContianerTab;
	@FindBy(xpath="//div[@ng-model='vm.rfidKey']")
	WebElement importContainerUniqueIdentifier;
	@FindBy(xpath="//span[@class='btn btn-default btn-file ng-binding']")
	WebElement importContainerBrowse;
	@FindBy(xpath="//button[@ng-click='vm.exportData()']")
	WebElement importContainerExport;
	@FindBy(id ="exportSampleBtn")
	WebElement importContainerSample;
	@FindBy(xpath="//button[@ng-click='vm.doValidation()']")
	WebElement importContainerValidateandImport;
	
	public void clickInventoryTab() {
		importContianersInventoryTab.click();
	}
	public void clickImportContainerTab() {
		importContianersInventoryTab.click();
	}
	public void clickUniqueIdentifier() {
		importContainerUniqueIdentifier.click();
	}
	public void clickBrowse() {
		importContainerBrowse.click();
	}
	public void clickExport() {
		importContainerExport.click();
	}
	public void clickcsvsample() {
		importContainerSample.click();
	}
	public void clickValidate() {
		importContainerValidateandImport.click();
	}
	public void importContaintersPage() {
		this.clickInventoryTab();
		this.clickImportContainerTab();
		this.clickUniqueIdentifier();
		this.clickBrowse();
		this.clickcsvsample();
		this.clickValidate();
	}
	
}

