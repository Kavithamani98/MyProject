package Cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Pages {
  
	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User enter the valid credentials$")
	public void user_enter_the_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^user must in home page and display success message$")
	public void user_must_in_home_page_and_display_success_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}


}
