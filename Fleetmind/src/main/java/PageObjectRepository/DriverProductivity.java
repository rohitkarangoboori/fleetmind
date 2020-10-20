package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriverProductivity {
	
	WebDriver driver;
	
	public DriverProductivity(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
			
	}
	@FindBy(xpath="//div[@title='Activity Reports']")
	WebElement DriverProductivityActivityReport;
	@FindBy(xpath="//div[@title='Driver Productivity']")
	WebElement DriverProductivitydriverProdctivityportal;
	@FindBy(id="cboDiv")
    WebElement DriverProductivityDivision;
	@FindBy(id="startDate")
	WebElement DriverProductivityStartDate;
    @FindBy(id="endDate")
    WebElement DriverProductivityEndDate;
    @FindBy(xpath="/html/body/div[1]/div[2]/button")
    WebElement DriverProductivictyGenerate;
}
