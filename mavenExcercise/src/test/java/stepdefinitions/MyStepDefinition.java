package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinition {

    @Given("^the user inputs valid url \"([^\"]*)\"$")
    public void the_user_inputs_valid_url_something(String google, String strArg1) throws Throwable {
        throw new PendingException();
    }

    @When("^user clicks Go button$")
    public void user_clicks_go_button() throws Throwable {
        throw new PendingException();
    }

    @Then("^the user is redirected to Google's website$")
    public void the_user_is_redirected_to_googles_website() throws Throwable {
        throw new PendingException();
    }

}
