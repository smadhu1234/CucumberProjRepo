package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	@Given("User navigates to the registration page")
	public void User_navigates_to_the_registration_page() {
		System.out.println(">> User navigates to the registration page");
	}


	@When("User enters firstname {string} into the firstname field")
	public void User_enters_firstname_into_the_firstname_field(String fname) {
		System.out.println(">> User enters the first name :" + fname);
	}

	@And("User enters lastname {string} into the lastname field")
	public void User_enters_lastname_into_the_lastname_field(String lname) {
		System.out.println(">> User enters lastname :" + lname);
	}

	@And("User enters Email Address {string} into the EMail field")
	public void User_enters_Email_Address_into_the_EMail_field(String email) {
		System.out.println(">> User enters email address :" + email);
	}

	@And("User enters telephone number {int} into the telephone field")
	public void User_enters_telephone_number_into_the_telephone_field(int number) {
		System.out.println(">> User enters telephone number:" + number);
	}

	@And("User enters password {string} into the password field")
	public void User_enters_password_into_the_password_field(String password) {
		System.out.println("User enters password: " + password);
	}

	@And("User reenters password {string} into the password confirmed field")
	public void User_reenters_password_into_the_password_confirmed_field(String password) {
		System.out.println(">> User reenters password :" + password);
	}
	@And("User selects privacy policy field")
	public void User_selects_privacy_policy_field() {
		System.out.println(">> User selects privacy policy field");
		
	}

	@And("User clicks on Continue button")
	public void User_clicks_on_Continue_button() {
		System.out.println(">> User clicks on continue button");
	}

	@Then("Account should get successfully created")
	public void Account_should_get_successfully_created() {
		System.out.println(">> Account should get successfully created");
	}

	@And("User selects Yes radio button for Newsletter")
	public void User_selects_Yes_radio_button_for_Newsletter() {
		System.out.println(">> User selects Yes radio button for Newsletter");

	}

	@When("User didnt enter any details into the fields")
	public void User_didnt_enter_any_details_into_the_fields() {
		System.out.println(">> User didnt enter any details into the fields");
	}

	@Then("Warning message should be displayed for the mandatory fields")
	public void Warning_message_should_be_displayed_for_the_mandatory_fields() {
		System.out.println(">> Warning message should be displayed for the mandatory fields");
	}

	@Then("Warning message informing the user about the duplicate email address")
	public void Warning_message_informing_the_user_about_the_duplicate_email_address() {
		System.out.println(">> Warning message informing the user about the duplicate email address");
	}

	// Using DataTable for passing large data
	@When("User uses below data")
	public void User_uses_below_data(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		System.out.println("User has entered first name :" + map.get("firstname"));
		System.out.println("User has entered last name :" + map.get("lastname"));
		System.out.println("User has entered Email address :" + map.get("email"));
		System.out.println("User has entered phone number :" + map.get("phonenumber"));
		System.out.println("User has entered password :" + map.get("password"));

	}

}



