package Cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class Login{
	@When("^login using user(\\d+) and pass(\\d+)$")
	public void login_using_user_and_pass(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


  }
