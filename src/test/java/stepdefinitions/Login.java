package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	@Given("^User navigates to the login page$")
	public void User_navigates_to_the_login_page() {

		System.out.println(">> User got navigated to the login page");
	}

	@When("^User enters valid email address (.+)$")
	public void User_enters_valid_email_address(String email) {
		System.out.println(">> User has entered emial address :"+email);

	}

	@And("^User enters valid password (.+)$")
	public void User_enters_valid_password(String password) {
		System.out.println(">> User has entered valid passoword :" + password);
	}

	@And("^Clicks on login button$")
	public void Clicks_on_login_button() {
		System.out.println(">> User clicks on login button");
	}

	@Then("^User should login successfully$")
	public void User_should_login_successfully() {
		System.out.println(">> User got loggedin successfully");
	}

	@When("^User enters invalid email address (.+)$")
	public void User_enters_invalid_email_address(String invlidEmail) {
		System.out.println(">> User enters invalid email address :" + invlidEmail);

	}

	@And("^User enters invalid password (.+)$")
	public void User_enters_invalid_password(String invalPassword) {
		System.out.println("User enters invalid password :" + invalPassword);
	}

	@Then("^User should get a proper warning message$")
	public void User_should_get_a_proper_warning_message() {
		System.out.println("Proper warning message got displayed to the user");
	}

}
