package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	static WebDriver driver;

	public static WebDriver StartBrowser(String browsername, String url) throws InterruptedException {
		// If the browser is Firefox
		if (browsername.equalsIgnoreCase("Firefox")) {
			// Set the path for geckodriver.exe
			String path = System.getProperty("user.dir");
			System.out.println(path); 
			System.setProperty("webdriver.firefox.marionette",path+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		// If the browser is Chrome
		else if (browsername.equalsIgnoreCase("Chrome")) {
			// Set the path for chromedriver.exe
			String path = System.getProperty("user.dir");
			System.out.println(path); 
			System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		// If the browser is IE
		else if (browsername.equalsIgnoreCase("IE")) {
			// Set the path for IEdriver.exe
			String path = System.getProperty("user.dir");
			System.out.println(path); 
			System.setProperty("webdriver.ie.driver",path+"\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.get(url);
		return driver;
	}
}