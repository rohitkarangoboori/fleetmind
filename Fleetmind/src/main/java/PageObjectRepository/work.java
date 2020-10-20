package PageObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class work {
WebDriver driver;
	public work (WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="menu_routeMngId")
	WebElement workRoute;
	@FindBy(id="menuItem_WorkzoneList")
	WebElement workZone;
	
	public void
}
