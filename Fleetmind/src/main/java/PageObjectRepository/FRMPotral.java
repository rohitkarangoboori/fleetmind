package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FRMPotral {
WebDriver driver;
	
public FRMPotral(WebDriver driver)
{
	this.driver = driver;
	// This initElements method will create all WebElements
	PageFactory.initElements(driver, this);
		
}
@FindBy(xpath="//*[@id='appLinks']/li[2]/a")
WebElement FRMPortalfrmtab;
@FindBy(xpath="//*[@id=\"ctl00_formContent_ASPxSiteMapControl1_C0\"]/table/tbody/tr/td/div/div[6]/div[2]/div/a")
WebElement FRMPortal1monthsummarycall;
@FindBy(xpath="/html/body/app-root/div/app-month-summary/div/form/kendo-textbox-container[1]/kendo-multiselect/div")
WebElement FRMPortalDivisions;
@FindBy(xpath="/html/body/app-root/div/app-month-summary/div/form/kendo-textbox-container[2]/kendo-multiselect/div")
WebElement FRMPortalLineofBusiness;
@FindBy(id="k-6617c932-ae35-465f-82a6-04e6bccb76c9")
WebElement FRMPortalMonth;
@FindBy(id="9108766a-a083-47c3-bfbc-1baf18f72e90")
WebElement FRMPortalYear;
@FindBy(xpath="/html/body/app-root/div/app-month-summary/div/form/button")
WebElement FRMPortalSearch;
@FindBy(xpath="k-c736b8a1-90bc-4c25-9ca0-ffcd3923866d")
WebElement FRMPortalZoom;
}
