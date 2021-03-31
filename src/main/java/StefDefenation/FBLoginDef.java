package StefDefenation;

import CommonFunctions.TestBase;
import PageFactory.FBLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBLoginDef extends TestBase {
	//FBLoginPage loginpage;
	

	@Given("^Humnan launch browser and get \"([^\"]*)\"$")
	public void humnan_launch_browser_and_get(String arg1) throws Throwable {

		TestBase.intialization();
		
	}

	@When("^Human enters username \"([^\"]*)\"$")
	public void human_enters_username(String username) throws Throwable {

		loginpage = new FBLoginPage();
		loginpage.enterUserName(username);
		
	}

	@When("^Human enters password \"([^\"]*)\"$")
	public void human_enters_password(String password) throws Throwable {

		loginpage.enterPassword(password);
	}

	@When("^Human clicks on login button$")
	public void human_clicks_on_login_button() throws Throwable {

		loginpage.clickLogin();
	}

	@Then("^Human is getting logout from the page$")
	public void human_is_getting_logout_from_the_page() throws Throwable {

		driver.navigate().refresh();
		driver.quit();
	}
}
