package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class commoncodes {

	static WebDriver driver;
	WebDriverWait wait;
	public void  pageScrollup() {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoVeiw(true)");
		
	}
	public void clickWebElement(WebElement webElement) throws InterruptedException
	{
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(8, TimeUnit.SECONDS);

			Webdriverwait(5).until(ExpectedConditions.elementToBeClickable(webElement));
			((JavascriptExecutor)driver).executeScript("arguments[0],scrollIntoVeiw(true);",webElement);
			webElement.click();
		
	
		}
	private FluentWait<WebDriver> Webdriverwait(int i) {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

