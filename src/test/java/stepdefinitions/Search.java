package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	// this step will be executed first for each and every step def and all the
	// feature files

	@Before(value = "@search")
	public void setup() {
		System.out.println("--- Browser got opened");
	}

	@Before(value = "@search")
	public void setuptwo() {
		System.out.println("--- Browser got opened second time");
	}

	// this step will be executed last for each and every step def and all the
	// feature files

	@After("@search")
	public void teardown() {
		System.out.println("--- Browser got closed");
	}

	// this step will be executed first for each and every step def and all the
	// feature files
	// will applicable only for the register feature
	@BeforeStep("@search")
	public void BeforeeveryStep() {
		System.out.println("+++ Before every step hook");
	}
	// this step will be executed last for each and every step def and all the
	// feature files

	@AfterStep("@search")
	public void AftereveryStep() {
		System.out.println("+++ After every step hook");
	}
	@Given("User navigates to the listing page")
	public void user_navigates_to_the_listing_page() {
		System.out.println(" >> Application got opened");
	}

	@When("User enters valid prouduct into the search box")
	public void user_enters_valid_prouduct_into_the_search_box() {
		System.out.println(">> Valid product got entered into the search box");

	}

	@When("User clicks on the search button")
	public void user_clicks_on_the_search_button() {
		System.out.println(" >>Search button clicked");

	}

	@Then("Valid products should be displayed in the search results")
	public void valid_products_should_be_displayed_in_the_search_results() {
		System.out.println(">> Valid product details displayed in the search results");
	}

	@When("User enters non-existing prouduct into the search box")
	public void user_enters_non_existing_prouduct_into_the_search_box() {
		System.out.println(">> Invalid product got entered in the searchbox");
	}
	@Then("Proper text informing the user about no product matching should be displayed")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {
		System.out.println(">> No product matching text is displayed");
	}

	@When("User enters invalid prouduct into the search box")
	public void user_enters_invalid_prouduct_into_the_search_box() {
		System.out.println(">> No product matching text is displayed");
	}

}
