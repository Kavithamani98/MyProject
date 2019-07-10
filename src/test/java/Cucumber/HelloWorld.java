package Cucumber;
																																																																																																																																																																																																																																																			
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HelloWorld {
	String str;
	@Given("^when the user prints Hello world$")
	public void when_the_user_prints_Hello_world() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		str =  "Accenture";
	    
	}

	@Then("^Hello world displays in console$")
	public void hello_world_displays_in_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(str);

}}
