package seleniumgluecode;

import org.openqa.selenium.WebDriver;

import BaseClass.Browser;
import PageObjectRepository.AddRoute;
import PageObjectRepository.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login {

WebDriver driver; 
LoginPage login;
AddRoute route;


@Given("^user is on homepage$")
public void user_is_on_homepage() throws Throwable {
    driver =Browser.StartBrowser("Chrome","https://test1-flm.safefleetcloud.com/FleetmindHome/");
    driver.manage().window().maximize();
    Thread.sleep(10000);
}
@Then("^Navigate to RMS$")
public void navigate_to_RMS() throws Throwable {
	   login = new LoginPage(driver);
	   login.clickLogin();
	   Thread.sleep(3000);
}
@Then("^Switch to new Tab$")
public void switch_to_new_Tab() throws Throwable {
	for (String Safe_Fleet_ID : driver.getWindowHandles()) {
		 driver.switchTo().window(Safe_Fleet_ID);
	}
}
@Then("^user enter username \"([^\"]*)\" and User enter password \"([^\"]*)\"$")
public void user_enter_username_and_User_enter_password(String email, String password) throws Throwable {

	login =new LoginPage(driver);
   login.setEmail(email);
   login.setPassword(password);
}

@And("^Click on sign in button$")
public void click_on_sign_in_button() throws Throwable {
    login =new LoginPage(driver);
    login.clickLoginButton();
}
}



