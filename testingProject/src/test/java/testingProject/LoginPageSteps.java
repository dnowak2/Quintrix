package testingProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

@RunWith(Cucumber.class)
public class LoginPageSteps 
{
    @Given("^the user inputs valid (.+) and (.+)$")
    public void the_user_inputs_valid_and(String username, String password){
    }

    @When("^user clicks submit button$")
    public void user_clicks_submit_button(){
    }

    @Then("^the user is redirected to homepage$")
    public void the_user_is_redirected_to_homepage(){
    }
	
}
