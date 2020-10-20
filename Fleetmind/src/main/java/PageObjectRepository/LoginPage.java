package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@id='appLinks']/li[3]/a/span")
	WebElement LoginPageLogin;
	@FindBy(id ="Email")
	WebElement LoginPageEmail;
	@FindBy(xpath="//input[@id='Password']")
	WebElement LoginPagePassword;
	@FindBy(xpath = "//button[@name='button']")
	WebElement LoginPageSignButton;
    
	// Click On Route Management System
	public void clickLogin() {
		LoginPageLogin.click();
	}

	// Set user name in textbox
	public void setEmail(String strEmail) {
		LoginPageEmail.sendKeys(strEmail);
	}

	// Set password in password textbox
	public void setPassword(String strPassword) {
		LoginPagePassword.sendKeys(strPassword);

	}

	// Click on login button
	public void clickLoginButton() {
		LoginPageSignButton.click();
	}

	public void LoginToApplication(String strEmail, String strPasword) {
		// Click RMS
		this.clickLogin();
		// Fill user name
		this.setEmail(strEmail);
		// Fill password
		this.setPassword(strPasword);
		// Click Login button
		this.clickLoginButton();
	}

}