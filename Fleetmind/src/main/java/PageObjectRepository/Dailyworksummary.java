package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dailyworksummary {
	WebDriver driver;
	
	public Dailyworksummary(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
			
	}
	@FindBy(xpath="//span[.='Daily Work Summary]")
WebElement DailyworksummaryworksummaryTab;
	@FindBy(xpath="//div[@title='Activity Reports']")
	WebElement DailyworksummaryActivityreport;
	


}
