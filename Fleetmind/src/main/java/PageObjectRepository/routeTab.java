package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class routeTab {
	WebDriver driver;

	public routeTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//li[@id='menu_routeMngId']")
	WebElement routeTab;
	
	public void clickrouteTab() {
	routeTab.click();
	}
	public void Tab() {
		this.clickrouteTab();
	}
}
