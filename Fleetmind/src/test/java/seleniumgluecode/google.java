package seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class google {
	
	WebDriver driver;

@Given("^oPEN gOOGLE$")
public void open_gOOGLE() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  driver.get("https://www.google.com/");
  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Hi");

}
}