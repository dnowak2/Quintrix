package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions 
{
	@Given("^the user inputs valid \"([^.+]*)\" and \"([^.+]*)\"$")
	public void the_user_inputs_valid_username_and_password(String user, String password) {
		System.out.println(user + " " + password);
	}
	@When("^user clicks Submit button$")
	public void user_clicks_submit_button() {
	}
	@Then("^the user is redirected to the flight page$")
	public void the_user_is_redirected_to_the_flight_page() {
	}

	@Given("^the user inputs departure date \\\"<\\d{2}-\\d{2}-\\d{4}>\\\" and \\\"<\\d{2}-\\d{2}-\\d{4}>\\\"$")
	public void the_user_inputs_valid_date(String day, String month, String year)
	{
		System.out.println(String.format("%s/%s/%s", day,month,year));
	}
	@When("^user clicks Submit button$")
	public void user_clicks_submit()
	{
	}
	@Then("^the user is redirected to the flight page$")
	public void the_user_is_redirected_to_the_flight_page2() {
	}
	
    @Given("^the user inputs valid url \"([^\"]*)\"$")
    public void the_user_inputs_valid_url_something(String google, String strArg1) throws Throwable {
    }

    @When("^user clicks Go button$")
    public void user_clicks_go_button() throws Throwable {
    }

    @Then("^the user is redirected to Google's website$")
    public void the_user_is_redirected_to_googles_website() throws Throwable {
    }
}
