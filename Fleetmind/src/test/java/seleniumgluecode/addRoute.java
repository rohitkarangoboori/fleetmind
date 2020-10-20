package seleniumgluecode;

import org.openqa.selenium.WebDriver;

import PageObjectRepository.AddRoute;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class addRoute {
	
	WebDriver driver;
    AddRoute route;
	
	@Given("^User clicks on Routes$")
	public void user_clicks_on_Routes() throws Throwable {
		Thread.sleep(1000);
		 route= new AddRoute(driver);
		 route.clickRouteTab(); 

	}
	@Then("^User clicks on Add Route$")
	public void user_clicks_on_Add_Route() throws Throwable {
		route = new AddRoute(driver);
		route.clickaddRoutemenu();

	}

	@Then("^User Enter the \"([^\"]*)\"$")
	public void user_Enter_the(String strRouteName) throws Throwable {
		route = new AddRoute(driver);
		route.strRouteName(strRouteName);

	}

	@Then("^User Select the \"([^\"]*)\"$")
	public void user_Select_the(String strStartDate) throws Throwable {
		route = new AddRoute(driver);
		route.strStartDate(strStartDate);
	}

	@Then("^User Select the Frequency$")
	public void user_Select_the_Weekly_Frequency() throws Throwable {
		route = new AddRoute(driver);
		route.clickfrequency();
	}

	@Then("^User Select Material$")
	public void user_Select_Material() throws Throwable {
		route = new AddRoute(driver);
		route.clickMaterial();

	}

	@Then("^User Select Business$")
	public void user_Select_Business() throws Throwable {
		route = new AddRoute(driver);
		route.clicklineOfBussiness();
	}

	@Then("^User Enter \"([^\"]*)\"$")
	public void user_Enter(String strRouteMessage) throws Throwable {
		route = new AddRoute(driver);
		route.StrRouteMessage(strRouteMessage);
	}

	@Then("^Click on the Save Button$")
	public void click_on_the_Save_Button() throws Throwable {
		route = new AddRoute(driver);
		route.clickSaveButton();
	}
	}
